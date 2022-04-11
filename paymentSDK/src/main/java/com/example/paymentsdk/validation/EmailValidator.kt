package com.example.paymentsdk.validation

import androidx.core.util.PatternsCompat

class EmailValidator {

    fun isEmailEmpty(email: String?): Boolean {
        return email.isNullOrEmpty()
    }

    fun isEmailValid(email: String): Boolean {
        return !PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
    }
}