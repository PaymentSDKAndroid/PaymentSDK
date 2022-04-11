package com.example.paymentsdk.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/paymentsdk/network/CardCallback;", "", "onError", "", "throwable", "", "onSuccess", "userModel", "Lcom/example/paymentsdk/model/UserModel;", "paymentSDK_debug"})
public abstract interface CardCallback {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.model.UserModel userModel);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable);
}