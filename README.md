# PaymentSDK
[![](https://jitpack.io/v/PaymentSDKAndroid/PaymentSdk.svg)](https://jitpack.io/#PaymentSDKAndroid/PaymentSdk)

The Android SDK by PaymentSDK allows you to create a apikey for payment and create a card token using apikey (one time use token representing card details) in your Android app to send to a server to enable it to make a payment. By creating a card token, PaymentSDK allows you to avoid sending card details to your server. The SDK can help with formatting and validating card information before the information is tokenized.

## Requirements
- Lollipop or higher

## Import the dependency
To import the Android SDK, include it as a dependency in your build.gradle file.

    implementation 'com.github.PaymentSDKAndroid:PaymentSDK:1.0.0'
    
in your settings.gradle file.

    maven { url "https://jitpack.io" }

## Initialize SDK

    <com.example.paymentsdk.view.PaymentCard
        android:id="@+id/payment_card"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

## Customization

There is Two ways for customized your view

(1) In your XML file
   
    <com.example.paymentsdk.view.PaymentCard
        android:id="@+id/payment_card"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:setHeader="@string/pay"
        app:themeColor="@color/color_card"
        app:textColor="@color/black"
        app:hintColor="@color/text_hint_color"
        app:enabled="true"/>
        
 (2) In your code file
  
    var paymentCard = PaymentCard(this)
        paymentCard.isEnabled = true
        paymentCard.setIconColor(R.color.teal_200)
        paymentCard.setHintColor(R.color.purple_200)
        paymentCard.setTextColor(R.color.black)
        paymentCard.setHeader(getString(R.string.app_name))
        paymentCard.setThemeColor(R.color.teal_700)
 
        
        
        
        

