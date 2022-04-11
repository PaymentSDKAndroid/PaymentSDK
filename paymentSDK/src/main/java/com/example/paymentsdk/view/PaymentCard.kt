package com.example.paymentsdk.view

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View.OnFocusChangeListener
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.example.paymentsdk.R
import com.example.paymentsdk.databinding.CardExpiryBinding
import com.example.paymentsdk.databinding.PaymentCardBinding
import com.example.paymentsdk.model.CardModel
import com.example.paymentsdk.model.UserModel
import com.example.paymentsdk.network.ApiService
import com.example.paymentsdk.network.CardCallback
import com.example.paymentsdk.network.PaymentCallback
import com.example.paymentsdk.network.RetrofitClient
import com.example.paymentsdk.repository.PaymentRepository
import com.example.paymentsdk.util.CardType
import com.example.paymentsdk.validation.CardNumberValidator
import com.example.paymentsdk.validation.CvvValidator
import com.example.paymentsdk.validation.EmailValidator
import com.example.paymentsdk.validation.ExpiryValidator
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class PaymentCard constructor(context: Context, attrs: AttributeSet?, defStyle: Int) :
    LinearLayout(context, attrs, defStyle) {

    class InvalidResponseException(message: String?) : Exception(message)

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    // This callback interface call when card information state change
    interface OnStateChangedListener {
        fun onStateChange(paymentCard: PaymentCard)
    }

    lateinit var cardCallback: CardCallback
    private var paymentCardBinding: PaymentCardBinding
    private var cardNumberValidator: CardNumberValidator
    private var expiryValidator: ExpiryValidator
    private var cardExpiryBinding: CardExpiryBinding
    private var cvvValidator: CvvValidator
    private var cardType = CardType.UNKNOWN
    private var blPrevValid = false
    private var strExpMonth: String? = null
    private var strExpYear: String? = null
    private lateinit var expiryDialog: Dialog
    lateinit var numberIcon: Drawable
    private var blValidCardExpiry = false
    private var onStateChangedListener = ArrayList<OnStateChangedListener>()
    private var textColor: Int = 0
    private var hintColor: Int = 0
    var defaultIconColor: Int = 0
    private var themeColor: Int = 0
    private var strHeader: String
    private var emailValidator: EmailValidator
    private var paymentRepository: PaymentRepository
    lateinit var userModel: UserModel
    lateinit var cardModel: CardModel

    val apiKeyObservable: MutableLiveData<JsonObject?> by lazy { MutableLiveData<JsonObject?>() }

    init {
        //inflate view
        val layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        paymentCardBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.payment_card, this, true)
        cardExpiryBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.card_expiry, this, false)

        //set card icon color
        paymentCardBinding.imageViewCardBrand.setColorFilter(
            ContextCompat.getColor(
                context,
                R.color.color_white
            )
        )

        //init card validator
        cardNumberValidator =
            CardNumberValidator(
                paymentCardBinding.editTextCardNumber,
                paymentCardBinding.textViewCardNumber,
                paymentCardBinding.imageViewCardBrand,
                context,
                this, cardType
            )
        expiryValidator = ExpiryValidator()
        cvvValidator = CvvValidator(
            paymentCardBinding.editTextCvv,
            paymentCardBinding.textViewCardCvv,
            this,
            context, cardType
        )

        //init card number field
        paymentCardBinding.editTextCardNumber.addTextChangedListener(cardNumberValidator.CardNumberTextWatcher())
        paymentCardBinding.editTextCardNumber.onFocusChangeListener =
            OnFocusChangeListener { _, isFocus -> onCardNumberFocusChange(isFocus) }

        //init card cvv field
        paymentCardBinding.editTextCvv.addTextChangedListener(cvvValidator.CardCvcTextWatcher())
        paymentCardBinding.editTextCvv.onFocusChangeListener =
            OnFocusChangeListener { _, isFocus -> onCardCvcFocusChange(isFocus) }

        //init card expiry field
        paymentCardBinding.editTextCardExpiry.onFocusChangeListener =
            OnFocusChangeListener { _, isFocus -> onCardExpiryFocusChange(isFocus) }

        //Set Customization
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.PaymentCard, 0, 0)
        defaultIconColor = typedArray.getColor(
            R.styleable.PaymentCard_iconColor,
            ContextCompat.getColor(context, R.color.default_icon_color)
        )
        setIconViewColor()
        isEnabled = typedArray.getBoolean(R.styleable.PaymentCard_enabled, true)
        textColor = typedArray.getColor(
            R.styleable.PaymentCard_textColor,
            ContextCompat.getColor(context, R.color.text_color)
        )
        setTextViewColors()
        hintColor = typedArray.getColor(
            R.styleable.PaymentCard_hintColor,
            ContextCompat.getColor(context, R.color.text_hint_color)
        )
        setHintViewColor()
        themeColor =
            typedArray.getColor(
                R.styleable.PaymentCard_themeColor, ContextCompat.getColor(
                    context,
                    R.color.color_card
                )
            )
        setViewBgColors()
        strHeader = context.getString(
            typedArray.getResourceId(
                R.styleable.PaymentCard_setHeader,
                R.string.payment
            )
        )
        setHeader(strHeader)

        //init expiry dialog
        if (!isInEditMode) {
            openExpiryDialog()
        }

        //Pay button click init
        onPayClick()

        emailValidator = EmailValidator()

        val apiService = RetrofitClient.getRetrofitInstance(this).create(ApiService::class.java)
        paymentRepository = PaymentRepository(apiService)
    }

    private fun getApiKey() {
        val jsonObject = JsonObject()
        jsonObject.addProperty("email", userModel.strEmail)
        paymentCardBinding.progressBarPayment.visibility = VISIBLE
        paymentRepository.getPaymentApiKey(jsonObject, object : PaymentCallback {
            override fun onSuccess(jsonObject: JsonObject?) {
                if (jsonObject != null && jsonObject.has("apikey")) {
                    val apiKey = jsonObject.get("apikey").asString
                    userModel.strApiKey = apiKey
                    getToken()
                    paymentCardBinding.progressBarPayment.visibility = GONE
                } else {
                    cardCallback.onError(InvalidResponseException("apikey is not valid"))
                }
            }

            override fun onError(throwable: Throwable?) {
                cardCallback.onError(throwable)
            }
        })
    }


    private fun getToken() {
        val plainTextJson = JsonObject()
        val jsonObject1 = JsonObject()
        jsonObject1.addProperty("creditCard", cardModel.intCardNumber)
        jsonObject1.addProperty("exp_month", cardModel.strMonth)
        jsonObject1.addProperty("exp_year", cardModel.strYear)
        plainTextJson.add("plaintext", jsonObject1)
        Log.d("DDD", plainTextJson.toString())
        paymentCardBinding.progressBarPayment.visibility = VISIBLE
        paymentRepository.getPaymentToken(plainTextJson, object : PaymentCallback {
            override fun onSuccess(jsonObject: JsonObject?) {
                if (jsonObject != null && jsonObject.has("token")) {
                    val token = jsonObject.get("token").asString
                    userModel.strToken = token
                    cardCallback.onSuccess(userModel = userModel)
                    Toast.makeText(context, "Token: $token", Toast.LENGTH_SHORT).show()
                    paymentCardBinding.progressBarPayment.visibility = GONE
                } else {
                    cardCallback.onError(InvalidResponseException("token is not valid"))
                }
            }

            override fun onError(throwable: Throwable?) {

            }

        })
    }

    private fun getForward(jsonObject: JsonObject) {
        paymentRepository.getPaymentForward("", jsonObject).enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
//                cardCallback.onSuccess()
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                cardCallback.onError(t)
            }
        })
    }

    fun setHeader(text: String?) {
        paymentCardBinding.textViewPaymentHeader.text = text
    }

    fun setThemeColor(color: Int) {
        themeColor = ContextCompat.getColor(this.context,color)
        setViewBgColors()
    }

    fun setViewBgColors(){
        paymentCardBinding.cardViewPaymentCard.setCardBackgroundColor(themeColor)
        paymentCardBinding.buttonPay.setBackgroundColor(themeColor)
        paymentCardBinding.constraintLayoutCardViews.setBackgroundColor(themeColor)
    }

    fun setTextColor(color: Int) {
        textColor = ContextCompat.getColor(this.context,color)
        setTextViewColors()
    }

    private fun setTextViewColors(){
        paymentCardBinding.editTextCardNumber.setTextColor(textColor)
        paymentCardBinding.editTextCardExpiry.setTextColor(textColor)
        paymentCardBinding.editTextCvv.setTextColor(textColor)
    }

    fun setHintColor(color: Int) {
        hintColor = ContextCompat.getColor(this.context, color)
        setHintViewColor()
    }

    private fun setHintViewColor(){
        paymentCardBinding.editTextCardNumber.setHintTextColor(hintColor)
        paymentCardBinding.editTextCardExpiry.setHintTextColor(hintColor)
        paymentCardBinding.editTextCvv.setHintTextColor(hintColor)
    }

    private val isValidInfo: Boolean
        get() = cardNumberValidator.blValidCardNumber && blValidCardExpiry && cvvValidator.blValidCardCVV && isValidEmail(userModel.strEmail)!!

    private fun getTintedDrawable(@DrawableRes drawableResId: Int, color: Int): Drawable {
        val drawable = ContextCompat.getDrawable(context, drawableResId)
        drawable!!.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN)
        return drawable
    }

    //set edittext field enable
    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        paymentCardBinding.editTextCardNumber.isEnabled = enabled
        paymentCardBinding.editTextCardExpiry.isEnabled = enabled
        paymentCardBinding.editTextCvv.isEnabled = enabled
    }

    //set card icon color
    fun setIconColor(color: Int) {
        defaultIconColor = ContextCompat.getColor(this.context, color)
        setIconViewColor()
    }

     fun setIconViewColor() {
        numberIcon = getTintedDrawable(R.drawable.ic_deafult_card, defaultIconColor)
        val expiryIcon = getTintedDrawable(R.drawable.ic_expiry_date, defaultIconColor)
        val cvvIcon = getTintedDrawable(R.drawable.ic_cvv, defaultIconColor)

//        if (paymentCardBinding.editTextCardNumber.text.toString().isEmpty()) {
        paymentCardBinding.editTextCardNumber.setCompoundDrawablesWithIntrinsicBounds(
            numberIcon,
            null,
            null,
            null
        )
//        }
        paymentCardBinding.editTextCardExpiry.setCompoundDrawablesWithIntrinsicBounds(
            expiryIcon,
            null,
            null,
            null
        )
        paymentCardBinding.editTextCvv.setCompoundDrawablesWithIntrinsicBounds(
            cvvIcon,
            null,
            null,
            null
        )
    }


    //when focus change card field background change
    private fun onCardNumberFocusChange(hasFocus: Boolean) {
        if (!hasFocus) {
            val text = paymentCardBinding.editTextCardNumber.text.toString()
                .replace("[^\\d]+".toRegex(), "")
            if (text.isEmpty()) {
                cardNumberValidator.blValidCardNumber = false
                paymentCardBinding.editTextCardNumber.setBackgroundResource(R.drawable.edittext_error_background)
            } else {
                cardType = detectCardType(text)
                cvvValidator.cardType = cardType
                cardNumberValidator.blValidCardNumber =
                    cardNumberValidator.validateCardNumber(text, cardType)
                if (cardNumberValidator.blValidCardNumber) {
                    paymentCardBinding.editTextCardNumber.setBackgroundResource(R.drawable.edittext_background)
                } else {
                    paymentCardBinding.editTextCardNumber.setBackgroundResource(R.drawable.edittext_error_background)
                }
            }
            notifyStateChanged()
        }
    }

    //clean card number
    fun cleanCardNumber(number: String): String {
        return number.replace("[^\\d]+".toRegex(), "")
    }

    private fun onCardCvcFocusChange(hasFocus: Boolean) {
        val text = paymentCardBinding.editTextCvv.text.toString()
        if (!hasFocus) {
            if (text.isEmpty()) {
                cvvValidator.blValidCardCVV = false
            } else {
                cvvValidator.blValidCardCVV = cvvValidator.validateCardCvc(text, cardType)
                if (cvvValidator.blValidCardCVV) {
                    paymentCardBinding.editTextCvv.setBackgroundResource(R.drawable.edittext_background)
                } else {
                    paymentCardBinding.editTextCvv.setBackgroundResource(R.drawable.edittext_error_background)
                }
//
            }
            notifyStateChanged()
        }
    }

    private fun openExpiryDialog() {
        val calender = Calendar.getInstance()

        // set NumberPicker to select month of year
        cardExpiryBinding.monthPicker.minValue = 1
        cardExpiryBinding.monthPicker.maxValue = 12
        cardExpiryBinding.monthPicker.value = calender.get(Calendar.MONTH) + 1
        cardExpiryBinding.monthPicker.displayedValues =
            arrayOf("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12")

        //set NumberPicker to set year
        val intYear = calender.get(Calendar.YEAR)
        cardExpiryBinding.yearPicker.minValue = intYear
        cardExpiryBinding.yearPicker.maxValue = intYear + 20

        expiryDialog = AlertDialog.Builder(context).setTitle(R.string.card_expiry)
            .setView(cardExpiryBinding.root)
            .setPositiveButton(R.string.ok) { dialog, _ -> expiryClick(dialog) }
            .setNegativeButton(R.string.cancel) { dialog, _ -> expiryClick(dialog) }
            .create()
    }

    private fun onCardExpiryFocusChange(hasFocus: Boolean) {
        if (hasFocus) {
            // hide keyboard
            paymentCardBinding.editTextCardExpiry.clearFocus()
            (context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
                windowToken,
                0
            )
            expiryDialog.show()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun expiryClick(dialog: DialogInterface) {
        strExpMonth =
            String.format(Locale.getDefault(), "%02d", cardExpiryBinding.monthPicker.value)
        strExpYear = (cardExpiryBinding.yearPicker.value % 100).toString()
        paymentCardBinding.editTextCardExpiry.setText("$strExpMonth/$strExpYear")
        paymentCardBinding.textViewCardExpiration.text = "$strExpMonth/$strExpYear"
        dialog.dismiss()

        blValidCardExpiry = expiryValidator.validateCardExpiration(strExpMonth!!, strExpYear!!)
//        paymentCardBinding.editTextCardExpiry.error = if (validCardExpiry) null else context.getString(R.string.invalid_card_expiry)
        if (blValidCardExpiry) {
            paymentCardBinding.editTextCardExpiry.setBackgroundResource(R.drawable.edittext_background)
        } else {
            paymentCardBinding.editTextCardExpiry.setBackgroundResource(R.drawable.edittext_error_background)
        }
        notifyStateChanged()
    }

    //change background if input empty or invalid
    private fun isValidCheck() {
        paymentCardBinding.editTextCardNumber.setBackgroundResource(if (cardNumberValidator.blValidCardNumber) R.drawable.edittext_background else R.drawable.edittext_error_background)
        paymentCardBinding.editTextCardExpiry.setBackgroundResource(if (blValidCardExpiry) R.drawable.edittext_background else R.drawable.edittext_error_background)
        paymentCardBinding.editTextCvv.setBackgroundResource(if (cvvValidator.blValidCardCVV) R.drawable.edittext_background else R.drawable.edittext_error_background)
        if (!cardNumberValidator.blValidCardNumber) {
            paymentCardBinding.editTextCardNumber.requestFocus()
        } else if (!blValidCardExpiry) {
            paymentCardBinding.editTextCardExpiry.requestFocus()
        } else if (!cvvValidator.blValidCardCVV) {
            paymentCardBinding.editTextCvv.requestFocus()
        } else if (!isValidEmail(userModel.strEmail)!!) {
            Toast.makeText(
                context,
                context.getString(R.string.enter_valid_email),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun isValidEmail(strEmail: String?): Boolean? {
        val emailValidator by lazy { EmailValidator() }
        return when {
            (emailValidator.isEmailEmpty(strEmail)) -> false
            (emailValidator.isEmailValid(strEmail!!)) -> false
            else -> true
        }
    }

    //check card info is valid or not
    private fun onPayClick() {
        paymentCardBinding.buttonPay.setOnClickListener {
            if (!isValidInfo) {
                isValidCheck()
            } else {
                val cardNumber = paymentCardBinding.editTextCardNumber.text.toString()
                cardModel = CardModel(cardNumber, strExpMonth.toString(), strExpYear.toString())
                getApiKey()
                (context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
                    windowToken,
                    0
                )
                paymentCardBinding.buttonPay.isEnabled = false
                isEnabled = false
//                Toast.makeText(context,
//                    context.getString(R.string.payment_successful),
//                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun notifyStateChanged() {
        // get current valid state
        val blCurrent =
            cardNumberValidator.blValidCardNumber && blValidCardExpiry && cvvValidator.blValidCardCVV

        // if different than previous, update and notify
        if (blCurrent xor blPrevValid) {
            for (listener in onStateChangedListener) {
                listener.onStateChange(this)
            }
            blPrevValid = blCurrent
        }
    }

    // detect card type and match
    fun detectCardType(number: String): CardType {
        val clean = cleanCardNumber(number)
        CardType.values().forEach {
            if (it.prefixMatches(clean)) return@detectCardType it
        }

        return CardType.UNKNOWN
    }
}