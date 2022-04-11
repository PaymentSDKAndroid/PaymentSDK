package com.example.paymentsdk.model

data class CardModel(var intCardNumber: String, var strMonth: String, var strYear: String, var intCardCvv: String? = null)