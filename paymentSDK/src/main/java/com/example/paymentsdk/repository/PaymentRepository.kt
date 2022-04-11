package com.example.paymentsdk.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.paymentsdk.network.ApiService
import com.example.paymentsdk.network.PaymentCallback
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PaymentRepository(private val apiService: ApiService) {

    fun getPaymentApiKey(jsonObject: JsonObject,  paymentCallback: PaymentCallback) {
        apiService.getApiKey(jsonObject).enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
                if (response.isSuccessful && response.code() == 200) {
                    paymentCallback.onSuccess(response.body())
                } else {
                    paymentCallback.onError(null)
                }
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                paymentCallback.onError(null)
            }
        })
    }

    fun getPaymentToken(
        jsonObject: JsonObject,
        paymentCallback: PaymentCallback
    ) {
        apiService.getToken(jsonObject).enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
                if (response.isSuccessful && response.code() == 200) {
                    paymentCallback.onSuccess(response.body())
                } else {
                    paymentCallback.onError(null)
                }
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                paymentCallback.onError(null)
            }
        })
    }
//        apiService.getToken(apikey, jsonObject)

    fun getPaymentForward(token: String, jsonObject: JsonObject) =
        apiService.getForward(token, jsonObject)
}