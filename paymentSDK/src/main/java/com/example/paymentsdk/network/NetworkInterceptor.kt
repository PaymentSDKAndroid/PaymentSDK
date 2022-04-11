package com.example.paymentsdk.network

import android.content.Context
import android.util.Log
import com.example.paymentsdk.model.UserModel
import com.example.paymentsdk.view.PaymentCard
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class NetworkInterceptor(var paymentCard: PaymentCard) : Interceptor {
    private val strToken: String = ""
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain) : Response {
        val builder= chain.request().newBuilder()
        builder.header("Content-Type", "application/json")
        if(paymentCard.userModel.strApiKey != null) {
            Log.d("TAG", "key: ${paymentCard.userModel.strApiKey!!}")
            builder.header("Authorization", paymentCard.userModel.strApiKey!!)
        }
//        builder.header("Authorization",)
//        builder.header("Authorization", strToken)
        return chain.proceed(builder.build())
    }
}