package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: n  reason: collision with root package name */
    private final int f3527n;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f3527n = i10;
    }
}
