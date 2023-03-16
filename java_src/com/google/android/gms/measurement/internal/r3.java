package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4949a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4950b;

    /* renamed from: c  reason: collision with root package name */
    private String f4951c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s3 f4952d;

    public r3(s3 s3Var, String str, String str2) {
        this.f4952d = s3Var;
        z3.o.e(str);
        this.f4949a = str;
    }

    public final String a() {
        if (!this.f4950b) {
            this.f4950b = true;
            this.f4951c = this.f4952d.o().getString(this.f4949a, null);
        }
        return this.f4951c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f4952d.o().edit();
        edit.putString(this.f4949a, str);
        edit.apply();
        this.f4951c = str;
    }
}
