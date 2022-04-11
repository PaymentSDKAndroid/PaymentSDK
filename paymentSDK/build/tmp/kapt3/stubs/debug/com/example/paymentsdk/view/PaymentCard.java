package com.example.paymentsdk.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0002uvB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010P\u001a\u00020E2\u0006\u0010Q\u001a\u00020EJ\u000e\u0010R\u001a\u00020&2\u0006\u0010Q\u001a\u00020EJ\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0003J\b\u0010W\u001a\u00020TH\u0002J\u0010\u0010X\u001a\u00020T2\u0006\u0010Y\u001a\u00020\rH\u0002J\u001a\u0010Z\u001a\u0002082\b\b\u0001\u0010[\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\tH\u0002J\b\u0010]\u001a\u00020TH\u0002J\b\u0010^\u001a\u00020TH\u0002J\u0019\u0010_\u001a\u0004\u0018\u00010\u00132\b\u0010`\u001a\u0004\u0018\u00010EH\u0002\u00a2\u0006\u0002\u0010aJ\u0006\u0010b\u001a\u00020TJ\u0010\u0010c\u001a\u00020T2\u0006\u0010d\u001a\u00020\u0013H\u0002J\u0010\u0010e\u001a\u00020T2\u0006\u0010d\u001a\u00020\u0013H\u0002J\u0010\u0010f\u001a\u00020T2\u0006\u0010d\u001a\u00020\u0013H\u0002J\b\u0010g\u001a\u00020TH\u0002J\b\u0010h\u001a\u00020TH\u0002J\u0010\u0010i\u001a\u00020T2\u0006\u0010j\u001a\u00020\u0013H\u0016J\u0010\u0010k\u001a\u00020T2\b\u0010l\u001a\u0004\u0018\u00010EJ\u000e\u0010m\u001a\u00020T2\u0006\u0010\\\u001a\u00020\tJ\b\u0010n\u001a\u00020TH\u0002J\u000e\u0010o\u001a\u00020T2\u0006\u0010\\\u001a\u00020\tJ\u0006\u0010p\u001a\u00020TJ\u000e\u0010q\u001a\u00020T2\u0006\u0010\\\u001a\u00020\tJ\b\u0010r\u001a\u00020TH\u0002J\u000e\u0010s\u001a\u00020T2\u0006\u0010\\\u001a\u00020\tJ\u0006\u0010t\u001a\u00020TR#\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020KX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O\u00a8\u0006w"}, d2 = {"Lcom/example/paymentsdk/view/PaymentCard;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "apiKeyObservable", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/gson/JsonObject;", "getApiKeyObservable", "()Landroidx/lifecycle/MutableLiveData;", "apiKeyObservable$delegate", "Lkotlin/Lazy;", "blPrevValid", "", "blValidCardExpiry", "cardCallback", "Lcom/example/paymentsdk/network/CardCallback;", "getCardCallback", "()Lcom/example/paymentsdk/network/CardCallback;", "setCardCallback", "(Lcom/example/paymentsdk/network/CardCallback;)V", "cardExpiryBinding", "Lcom/example/paymentsdk/databinding/CardExpiryBinding;", "cardModel", "Lcom/example/paymentsdk/model/CardModel;", "getCardModel", "()Lcom/example/paymentsdk/model/CardModel;", "setCardModel", "(Lcom/example/paymentsdk/model/CardModel;)V", "cardNumberValidator", "Lcom/example/paymentsdk/validation/CardNumberValidator;", "cardType", "Lcom/example/paymentsdk/util/CardType;", "cvvValidator", "Lcom/example/paymentsdk/validation/CvvValidator;", "defaultIconColor", "getDefaultIconColor", "()I", "setDefaultIconColor", "(I)V", "emailValidator", "Lcom/example/paymentsdk/validation/EmailValidator;", "expiryDialog", "Landroid/app/Dialog;", "expiryValidator", "Lcom/example/paymentsdk/validation/ExpiryValidator;", "hintColor", "isValidInfo", "()Z", "numberIcon", "Landroid/graphics/drawable/Drawable;", "getNumberIcon", "()Landroid/graphics/drawable/Drawable;", "setNumberIcon", "(Landroid/graphics/drawable/Drawable;)V", "onStateChangedListener", "Ljava/util/ArrayList;", "Lcom/example/paymentsdk/view/PaymentCard$OnStateChangedListener;", "paymentCardBinding", "Lcom/example/paymentsdk/databinding/PaymentCardBinding;", "paymentRepository", "Lcom/example/paymentsdk/repository/PaymentRepository;", "strExpMonth", "", "strExpYear", "strHeader", "textColor", "themeColor", "userModel", "Lcom/example/paymentsdk/model/UserModel;", "getUserModel", "()Lcom/example/paymentsdk/model/UserModel;", "setUserModel", "(Lcom/example/paymentsdk/model/UserModel;)V", "cleanCardNumber", "number", "detectCardType", "expiryClick", "", "dialog", "Landroid/content/DialogInterface;", "getApiKey", "getForward", "jsonObject", "getTintedDrawable", "drawableResId", "color", "getToken", "isValidCheck", "isValidEmail", "strEmail", "(Ljava/lang/String;)Ljava/lang/Boolean;", "notifyStateChanged", "onCardCvcFocusChange", "hasFocus", "onCardExpiryFocusChange", "onCardNumberFocusChange", "onPayClick", "openExpiryDialog", "setEnabled", "enabled", "setHeader", "text", "setHintColor", "setHintViewColor", "setIconColor", "setIconViewColor", "setTextColor", "setTextViewColors", "setThemeColor", "setViewBgColors", "InvalidResponseException", "OnStateChangedListener", "paymentSDK_debug"})
public final class PaymentCard extends android.widget.LinearLayout {
    public com.example.paymentsdk.network.CardCallback cardCallback;
    private com.example.paymentsdk.databinding.PaymentCardBinding paymentCardBinding;
    private com.example.paymentsdk.validation.CardNumberValidator cardNumberValidator;
    private com.example.paymentsdk.validation.ExpiryValidator expiryValidator;
    private com.example.paymentsdk.databinding.CardExpiryBinding cardExpiryBinding;
    private com.example.paymentsdk.validation.CvvValidator cvvValidator;
    private com.example.paymentsdk.util.CardType cardType = com.example.paymentsdk.util.CardType.UNKNOWN;
    private boolean blPrevValid = false;
    private java.lang.String strExpMonth;
    private java.lang.String strExpYear;
    private android.app.Dialog expiryDialog;
    public android.graphics.drawable.Drawable numberIcon;
    private boolean blValidCardExpiry = false;
    private java.util.ArrayList<com.example.paymentsdk.view.PaymentCard.OnStateChangedListener> onStateChangedListener;
    private int textColor = 0;
    private int hintColor = 0;
    private int defaultIconColor = 0;
    private int themeColor = 0;
    private java.lang.String strHeader;
    private com.example.paymentsdk.validation.EmailValidator emailValidator;
    private com.example.paymentsdk.repository.PaymentRepository paymentRepository;
    public com.example.paymentsdk.model.UserModel userModel;
    public com.example.paymentsdk.model.CardModel cardModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy apiKeyObservable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public PaymentCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public PaymentCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PaymentCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.network.CardCallback getCardCallback() {
        return null;
    }
    
    public final void setCardCallback(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.network.CardCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getNumberIcon() {
        return null;
    }
    
    public final void setNumberIcon(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable p0) {
    }
    
    public final int getDefaultIconColor() {
        return 0;
    }
    
    public final void setDefaultIconColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.model.UserModel getUserModel() {
        return null;
    }
    
    public final void setUserModel(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.model.UserModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.model.CardModel getCardModel() {
        return null;
    }
    
    public final void setCardModel(@org.jetbrains.annotations.NotNull()
    com.example.paymentsdk.model.CardModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.gson.JsonObject> getApiKeyObservable() {
        return null;
    }
    
    private final void getApiKey() {
    }
    
    private final void getToken() {
    }
    
    private final void getForward(com.google.gson.JsonObject jsonObject) {
    }
    
    public final void setHeader(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setThemeColor(int color) {
    }
    
    public final void setViewBgColors() {
    }
    
    public final void setTextColor(int color) {
    }
    
    private final void setTextViewColors() {
    }
    
    public final void setHintColor(int color) {
    }
    
    private final void setHintViewColor() {
    }
    
    private final boolean isValidInfo() {
        return false;
    }
    
    private final android.graphics.drawable.Drawable getTintedDrawable(@androidx.annotation.DrawableRes()
    int drawableResId, int color) {
        return null;
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    public final void setIconColor(int color) {
    }
    
    public final void setIconViewColor() {
    }
    
    private final void onCardNumberFocusChange(boolean hasFocus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String cleanCardNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return null;
    }
    
    private final void onCardCvcFocusChange(boolean hasFocus) {
    }
    
    private final void openExpiryDialog() {
    }
    
    private final void onCardExpiryFocusChange(boolean hasFocus) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void expiryClick(android.content.DialogInterface dialog) {
    }
    
    private final void isValidCheck() {
    }
    
    private final java.lang.Boolean isValidEmail(java.lang.String strEmail) {
        return null;
    }
    
    private final void onPayClick() {
    }
    
    public final void notifyStateChanged() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.paymentsdk.util.CardType detectCardType(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/paymentsdk/view/PaymentCard$InvalidResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "paymentSDK_debug"})
    public static final class InvalidResponseException extends java.lang.Exception {
        
        public InvalidResponseException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/paymentsdk/view/PaymentCard$OnStateChangedListener;", "", "onStateChange", "", "paymentCard", "Lcom/example/paymentsdk/view/PaymentCard;", "paymentSDK_debug"})
    public static abstract interface OnStateChangedListener {
        
        public abstract void onStateChange(@org.jetbrains.annotations.NotNull()
        com.example.paymentsdk.view.PaymentCard paymentCard);
    }
}