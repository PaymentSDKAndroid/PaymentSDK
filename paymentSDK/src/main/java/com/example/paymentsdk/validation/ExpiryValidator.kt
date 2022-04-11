package com.example.paymentsdk.validation


import java.util.*


class ExpiryValidator {

    //Check to card expiry is valid
    fun validateCardExpiration(month: String, year: String): Boolean {
        if (month.trim().isEmpty() || year.trim().isEmpty()) {
            return false
        }

        val intMonth = Integer.parseInt(month)
        var intYear = Integer.parseInt(year)

        if (intYear < 100) {
            intYear += 2000
        }

        if (intMonth == 0) {
            return false
        }

        val now = Calendar.getInstance()

        val expire = Calendar.getInstance()
        expire.set(intYear, intMonth - 1, 1, 0, 0, 0)
        expire.add(Calendar.MONTH, 1)

        return now.before(expire)
    }
}