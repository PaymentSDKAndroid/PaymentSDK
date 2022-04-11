package com.example.paymentsdk.network

import android.content.Context
import com.example.paymentsdk.view.PaymentCard
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private const val BASE_URL = "https://stage-api.stage-easymerchant.io/api/tokenizer/"
        fun getRetrofitInstance(paymentCard: PaymentCard) : Retrofit {
            val okkHttpclient = OkHttpClient.Builder()
                .addInterceptor(NetworkInterceptor(paymentCard)).build()

            return Retrofit.Builder()
                .client(okkHttpclient)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }
    }
}