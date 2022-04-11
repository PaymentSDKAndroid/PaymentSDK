package com.example.paymentsdk.util

enum class CardType(val minLength: Int, val maxLength: Int, val cvcLength: Int, pattern: String? = null) {

    // set card brand and validation
    VISA(13, 19, 3, "^4\\d*"),
    MASTERCARD(16, 16, 3, "^(?:5[1-5]|67)\\d*"),
    AMERICAN_EXPRESS(15, 15, 4, "^3[47]\\d*"),
    DISCOVER(16, 16, 3, "^6(?:011|4[4-9]|5)\\d*"),
    DINERS(14, 16, 3, "^3(?:0(?:[0-5]|9)|[689])\\d*"),
    JCB(16, 16, 3, "^35(?:2[89]|[3-8])\\d*"),
    UNKNOWN(13, 19, 3);

    private val patternRegex: Regex? = pattern?.toRegex()

    //check card brand and it value
    fun prefixMatches(number: String): Boolean {
        return patternRegex?.matches(number) ?: true
    }
}