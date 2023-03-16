package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public enum jc {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h8.f3880o),
    ENUM(null),
    MESSAGE(null);
    

    /* renamed from: n  reason: collision with root package name */
    private final Object f3944n;

    jc(Object obj) {
        this.f3944n = obj;
    }
}
