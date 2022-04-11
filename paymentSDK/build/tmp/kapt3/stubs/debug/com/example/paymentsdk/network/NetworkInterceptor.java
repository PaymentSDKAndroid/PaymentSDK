package com.example.paymentsdk.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/paymentsdk/network/NetworkInterceptor;", "Lokhttp3/Interceptor;", "paymentCard", "Lcom/example/paymentsdk/view/PaymentCard;", "(Lcom/example/paymentsdk/view/PaymentCard;)V", "getPaymentCard", "()Lcom/example/paymentsdk/view/PaymentCard;", "setPaymentCard", "strToken", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "paymentSDK_debug"})
public final class NetworkInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private com.example.paymentsdk.view.PaymentCard paymentCard;
    private final java.lang.String strToken = "";
    
    public NetworkInterceptor(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.view.PaymentCard paymentCard) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.view.PaymentCard getPaymentCard() {
        return null;
    }
    
    public final void setPaymentCard(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.view.PaymentCard p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
}