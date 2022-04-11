package com.example.paymentsdk.validation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/paymentsdk/validation/CardNumberValidator;", "", "editTextCardNumber", "Landroid/widget/EditText;", "textViewCardNumber", "Landroid/widget/TextView;", "imageViewCardType", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "paymentCard", "Lcom/example/paymentsdk/view/PaymentCard;", "cardType", "Lcom/example/paymentsdk/util/CardType;", "(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/content/Context;Lcom/example/paymentsdk/view/PaymentCard;Lcom/example/paymentsdk/util/CardType;)V", "blValidCardNumber", "", "getBlValidCardNumber", "()Z", "setBlValidCardNumber", "(Z)V", "strNum", "", "strValue", "formatCardNumber", "strNumber", "type", "validateCardNumber", "CardNumberTextWatcher", "paymentSDK_debug"})
public final class CardNumberValidator {
    private final android.widget.EditText editTextCardNumber = null;
    private final android.widget.TextView textViewCardNumber = null;
    private final android.widget.ImageView imageViewCardType = null;
    private final android.content.Context context = null;
    private final com.example.paymentsdk.view.PaymentCard paymentCard = null;
    private com.example.paymentsdk.util.CardType cardType;
    private boolean blValidCardNumber = false;
    private java.lang.String strNum;
    private java.lang.String strValue;
    
    public CardNumberValidator(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editTextCardNumber, @org.jetbrains.annotations.NotNull()
    android.widget.TextView textViewCardNumber, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageViewCardType, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.view.PaymentCard paymentCard, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.util.CardType cardType) {
        super();
    }
    
    public final boolean getBlValidCardNumber() {
        return false;
    }
    
    public final void setBlValidCardNumber(boolean p0) {
    }
    
    public final boolean validateCardNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String strNumber, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.util.CardType type) {
        return false;
    }
    
    private final java.lang.String formatCardNumber(java.lang.String strNumber, com.example.paymentsdk.util.CardType type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/paymentsdk/validation/CardNumberValidator$CardNumberTextWatcher;", "Landroid/text/TextWatcher;", "(Lcom/example/paymentsdk/validation/CardNumberValidator;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "", "count", "after", "onTextChanged", "before", "paymentSDK_debug"})
    public final class CardNumberTextWatcher implements android.text.TextWatcher {
        
        public CardNumberTextWatcher() {
            super();
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int count, int after) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int before, int count) {
        }
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.NotNull()
        android.text.Editable editable) {
        }
    }
}