package com.example.paymentsdk.validation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/paymentsdk/validation/CvvValidator;", "", "editTextCvv", "Landroid/widget/EditText;", "textViewCvv", "Landroid/widget/TextView;", "paymentCard", "Lcom/example/paymentsdk/view/PaymentCard;", "context", "Landroid/content/Context;", "cardType", "Lcom/example/paymentsdk/util/CardType;", "(Landroid/widget/EditText;Landroid/widget/TextView;Lcom/example/paymentsdk/view/PaymentCard;Landroid/content/Context;Lcom/example/paymentsdk/util/CardType;)V", "blValidCardCVV", "", "getBlValidCardCVV", "()Z", "setBlValidCardCVV", "(Z)V", "getCardType", "()Lcom/example/paymentsdk/util/CardType;", "setCardType", "(Lcom/example/paymentsdk/util/CardType;)V", "validateCardCvc", "cvc", "", "type", "CardCvcTextWatcher", "paymentSDK_debug"})
public final class CvvValidator {
    private final android.widget.EditText editTextCvv = null;
    private final android.widget.TextView textViewCvv = null;
    private final com.example.paymentsdk.view.PaymentCard paymentCard = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.paymentsdk.util.CardType cardType;
    private boolean blValidCardCVV = false;
    
    public CvvValidator(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editTextCvv, @org.jetbrains.annotations.NotNull()
    android.widget.TextView textViewCvv, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.view.PaymentCard paymentCard, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.util.CardType cardType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.util.CardType getCardType() {
        return null;
    }
    
    public final void setCardType(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.util.CardType p0) {
    }
    
    public final boolean getBlValidCardCVV() {
        return false;
    }
    
    public final void setBlValidCardCVV(boolean p0) {
    }
    
    public final boolean validateCardCvc(@org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.util.CardType type) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/paymentsdk/validation/CvvValidator$CardCvcTextWatcher;", "Landroid/text/TextWatcher;", "(Lcom/example/paymentsdk/validation/CvvValidator;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "", "count", "after", "onTextChanged", "before", "paymentSDK_debug"})
    public final class CardCvcTextWatcher implements android.text.TextWatcher {
        
        public CardCvcTextWatcher() {
            super();
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int start, int count, int after) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int start, int before, int count) {
        }
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.NotNull()
        android.text.Editable editable) {
        }
    }
}