package com.example.paymentsdk.network

import com.google.gson.JsonObject

interface PaymentCallback {

    // Callback on a successful call API
    fun onSuccess(jsonObject: JsonObject? = null)

    // Callback on a error call API
    fun onError(throwable: Throwable?)
}