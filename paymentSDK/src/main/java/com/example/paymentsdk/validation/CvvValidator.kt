package com.example.paymentsdk.validation

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import com.example.paymentsdk.R
import com.example.paymentsdk.util.CardType
import com.example.paymentsdk.view.PaymentCard

class CvvValidator(
    private val editTextCvv: EditText,
    private val textViewCvv: TextView,
    private val paymentCard: PaymentCard,
    private val context: Context,
    var cardType: CardType,
) {
    var blValidCardCVV = false

    fun validateCardCvc(cvc: String, type: CardType): Boolean {
        return cvc.trim().length == type.cvcLength
    }

    inner class CardCvcTextWatcher : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(editable: Editable) {
            // clean the number
            var strValue = editable.toString()

            // prevent too many digits
            if (strValue.length > cardType.cvcLength) {
                strValue = strValue.substring(0, cardType.cvcLength)
            }

            var cvv = ""
            for (i in strValue){
                cvv += "*"
            }

            if (editable.isEmpty()) {
                textViewCvv.text = context.getString(R.string.default_cardCvv)
            } else {
                textViewCvv.text = cvv
            }

            // replace text with formatted
            editTextCvv.removeTextChangedListener(this)
            editTextCvv.setText(strValue)
            editTextCvv.setSelection(strValue.length)
            editTextCvv.addTextChangedListener(this)

            // set the view state (changes background color)
            blValidCardCVV = validateCardCvc(strValue, cardType)
            paymentCard.notifyStateChanged()
        }
    }
}