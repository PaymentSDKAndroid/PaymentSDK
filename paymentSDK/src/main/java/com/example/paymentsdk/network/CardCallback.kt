package com.example.paymentsdk.network

import com.example.paymentsdk.model.UserModel
import com.google.gson.JsonObject

interface CardCallback {

    // Callback on a successful call API
    fun onSuccess(userModel: UserModel)

    // Callback on a error call API
    fun onError(throwable: Throwable?)
}