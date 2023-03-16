package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4877a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4878b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4879c;

    /* renamed from: d  reason: collision with root package name */
    private long f4880d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s3 f4881e;

    public p3(s3 s3Var, String str, long j10) {
        this.f4881e = s3Var;
        z3.o.e(str);
        this.f4877a = str;
        this.f4878b = j10;
    }

    public final long a() {
        if (!this.f4879c) {
            this.f4879c = true;
            this.f4880d = this.f4881e.o().getLong(this.f4877a, this.f4878b);
        }
        return this.f4880d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f4881e.o().edit();
        edit.putLong(this.f4877a, j10);
        edit.apply();
        this.f4880d = j10;
    }
}
