package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4800a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4801b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4802c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4803d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s3 f4804e;

    public n3(s3 s3Var, String str, boolean z10) {
        this.f4804e = s3Var;
        z3.o.e(str);
        this.f4800a = str;
        this.f4801b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f4804e.o().edit();
        edit.putBoolean(this.f4800a, z10);
        edit.apply();
        this.f4803d = z10;
    }

    public final boolean b() {
        if (!this.f4802c) {
            this.f4802c = true;
            this.f4803d = this.f4804e.o().getBoolean(this.f4800a, this.f4801b);
        }
        return this.f4803d;
    }
}
