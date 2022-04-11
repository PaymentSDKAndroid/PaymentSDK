package com.example.paymentsdk.network

import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @Headers("Content-Type: application/json")
    @POST("user/register")
    fun getApiKey(@Body jsonObject: JsonObject): Call<JsonObject>

    @POST("token/create")
    fun getToken(@Body jsonObject: JsonObject): Call<JsonObject>
//    fun getToken(@Header("Authorization") apikey: String, @Body jsonObject: JsonObject): Call<JsonObject>

    @POST("tk/forward")
    fun getForward(@Header("Authorization") token: String,@Body jsonObject: JsonObject): Call<JsonObject>
}