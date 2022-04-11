package com.example.paymentsdk.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/example/paymentsdk/util/CardType;", "", "minLength", "", "maxLength", "cvcLength", "pattern", "", "(Ljava/lang/String;IIIILjava/lang/String;)V", "getCvcLength", "()I", "getMaxLength", "getMinLength", "patternRegex", "Lkotlin/text/Regex;", "prefixMatches", "", "number", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "DINERS", "JCB", "UNKNOWN", "paymentSDK_debug"})
public enum CardType {
    /*public static final*/ VISA /* = new VISA(0, 0, 0, null) */,
    /*public static final*/ MASTERCARD /* = new MASTERCARD(0, 0, 0, null) */,
    /*public static final*/ AMERICAN_EXPRESS /* = new AMERICAN_EXPRESS(0, 0, 0, null) */,
    /*public static final*/ DISCOVER /* = new DISCOVER(0, 0, 0, null) */,
    /*public static final*/ DINERS /* = new DINERS(0, 0, 0, null) */,
    /*public static final*/ JCB /* = new JCB(0, 0, 0, null) */,
    /*public static final*/ UNKNOWN /* = new UNKNOWN(0, 0, 0, null) */;
    private final int minLength = 0;
    private final int maxLength = 0;
    private final int cvcLength = 0;
    private final kotlin.text.Regex patternRegex = null;
    
    CardType(int minLength, int maxLength, int cvcLength, java.lang.String pattern) {
    }
    
    public final int getMinLength() {
        return 0;
    }
    
    public final int getMaxLength() {
        return 0;
    }
    
    public final int getCvcLength() {
        return 0;
    }
    
    public final boolean prefixMatches(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return false;
    }
}