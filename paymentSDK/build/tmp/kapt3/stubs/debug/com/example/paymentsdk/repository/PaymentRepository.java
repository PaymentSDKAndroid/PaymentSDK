package com.example.paymentsdk.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/paymentsdk/repository/PaymentRepository;", "", "apiService", "Lcom/example/paymentsdk/network/ApiService;", "(Lcom/example/paymentsdk/network/ApiService;)V", "getPaymentApiKey", "", "jsonObject", "Lcom/google/gson/JsonObject;", "paymentCallback", "Lcom/example/paymentsdk/network/PaymentCallback;", "getPaymentForward", "Lretrofit2/Call;", "token", "", "getPaymentToken", "paymentSDK_debug"})
public final class PaymentRepository {
    private final com.example.paymentsdk.network.ApiService apiService = null;
    
    public PaymentRepository(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.network.ApiService apiService) {
        super();
    }
    
    public final void getPaymentApiKey(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.network.PaymentCallback paymentCallback) {
    }
    
    public final void getPaymentToken(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.network.PaymentCallback paymentCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.google.gson.JsonObject> getPaymentForward(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
}