package com.example.paymentsdk.validation

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.paymentsdk.util.CardType
import com.example.paymentsdk.view.PaymentCard
import com.example.paymentsdk.R

class CardNumberValidator(
    private val editTextCardNumber: EditText,
    private val textViewCardNumber: TextView,
    private val imageViewCardType: ImageView,
    private val context: Context,
    private val paymentCard: PaymentCard,
    private var cardType: CardType,
) {
    var blValidCardNumber = false
    private lateinit var strNum: String
    private lateinit var strValue: String


    fun validateCardNumber(strNumber: String, type: CardType): Boolean {
        cardType = type
        // numbers only, please
        val strClean = paymentCard.cleanCardNumber(strNumber)

        // match against type prefix
        if (!type.prefixMatches(strClean)) {
            return false
        }

        // ensure minimum length is satisfied
        val intLength = strClean.length
        if (intLength == 0 || intLength < type.minLength) {
            return false
        }

        var intSum = 0
        run {
            var i = intLength - 2
            while (i >= 0) {
                val c = strClean[i]
                if (c < '0' || c > '9') return false

                // Multiply digit by 2.
                val v = c - '0' shl 1

                // Add each digit independently.
                intSum += if (v > 9) 1 + v - 10 else v
                i -= 2
            }
        }

        // Add the rest of the non-doubled digits
        run {
            var i = intLength - 1
            while (i >= 0) {
                intSum += strClean[i] - '0'
                i -= 2
            }
        }

        // Double check that the Luhn check-digit at the end brings us to a neat multiple of 10
        return intSum % 10 == 0
    }

    private fun formatCardNumber(strNumber: String, type: CardType): String {
        var clean = paymentCard.cleanCardNumber(strNumber)
        val strBuilder = StringBuilder()

        // prevent too many digits
        if (clean.length > type.maxLength) {
            clean = clean.substring(0, type.maxLength)
        }

        for (i in clean.indices) {
            when (type) {
                CardType.AMERICAN_EXPRESS -> if (i == 4 || i == 10) strBuilder.append(" ")
                else -> if (i > 0 && i % 4 == 0) strBuilder.append(" ")
            }
            strBuilder.append(clean[i])
        }
        return strBuilder.toString()
    }

    inner class CardNumberTextWatcher : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

        override fun afterTextChanged(editable: Editable) {
            // clean the number
            strNum = editable.toString().replace("[^\\d]+".toRegex(), "")

            // detect the card type
            cardType = paymentCard.detectCardType(strNum)

            // format the number
            strValue = formatCardNumber(strNum, cardType)

            // replace text with formatted
            editTextCardNumber.removeTextChangedListener(this)
            if (editable.isEmpty()) {
                textViewCardNumber.text = context.getString(R.string.default_cardNumber)
            } else {
                textViewCardNumber.text = strValue
            }
            editTextCardNumber.setText(strValue)
            editTextCardNumber.setSelection(strValue.length)
            editTextCardNumber.addTextChangedListener(this)

//            numberIcon = ContextCompat.getDrawable(context, R.drawable.simplify_number)
            // fetch the card brand drawable
            val brandDrawable: Drawable? =
                if (strValue.isEmpty()) paymentCard.numberIcon else ContextCompat.getDrawable(
                    context,
                    when (cardType) {
                        CardType.MASTERCARD -> R.drawable.ic_mastercard_dark
                        CardType.VISA -> R.drawable.ic_visa
                        CardType.AMERICAN_EXPRESS -> R.drawable.ic_amex
                        CardType.DISCOVER -> R.drawable.ic_discover
                        CardType.DINERS -> R.drawable.ic_diners
                        CardType.JCB -> R.drawable.ic_jcb
                        CardType.UNKNOWN -> R.drawable.ic_deafult_card
                    })

            // change the drawable to match type
            imageViewCardType.colorFilter = null

            if (strValue.isEmpty()) {
                val clone: Drawable = paymentCard.numberIcon.constantState!!.newDrawable()
                imageViewCardType.setImageDrawable(clone)
                imageViewCardType.setColorFilter(ContextCompat.getColor(context, R.color.color_white))

                val drawableClone: Drawable = brandDrawable!!.constantState!!.newDrawable()

                editTextCardNumber.setCompoundDrawablesWithIntrinsicBounds(drawableClone,
                    null,
                    null,
                    null)
                paymentCard.setIconViewColor()
            } else {
                imageViewCardType.colorFilter = null
                val clone: Drawable = brandDrawable!!.constantState!!.newDrawable()
                imageViewCardType.setImageDrawable(clone)
                when (cardType) {
                    CardType.UNKNOWN -> {
                        imageViewCardType.setColorFilter(ContextCompat.getColor(context,
                            R.color.color_white))
                        val drawableClone: Drawable = brandDrawable.constantState!!.newDrawable()
                        editTextCardNumber.setCompoundDrawablesWithIntrinsicBounds(drawableClone,
                            null,
                            null,
                            null)
                        paymentCard.setIconViewColor()
                    }
                    else -> {
                        editTextCardNumber.setCompoundDrawablesWithIntrinsicBounds(brandDrawable,
                            null,
                            null,
                            null)
                    }
                }
            }
            blValidCardNumber = validateCardNumber(strNum, cardType)
            paymentCard.notifyStateChanged()
        }
    }
}