package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a  reason: collision with root package name */
    final Context f4554a;

    /* renamed from: b  reason: collision with root package name */
    String f4555b;

    /* renamed from: c  reason: collision with root package name */
    String f4556c;

    /* renamed from: d  reason: collision with root package name */
    String f4557d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f4558e;

    /* renamed from: f  reason: collision with root package name */
    long f4559f;

    /* renamed from: g  reason: collision with root package name */
    com.google.android.gms.internal.measurement.o1 f4560g;

    /* renamed from: h  reason: collision with root package name */
    boolean f4561h;

    /* renamed from: i  reason: collision with root package name */
    final Long f4562i;

    /* renamed from: j  reason: collision with root package name */
    String f4563j;

    public g5(Context context, com.google.android.gms.internal.measurement.o1 o1Var, Long l10) {
        this.f4561h = true;
        z3.o.i(context);
        Context applicationContext = context.getApplicationContext();
        z3.o.i(applicationContext);
        this.f4554a = applicationContext;
        this.f4562i = l10;
        if (o1Var != null) {
            this.f4560g = o1Var;
            this.f4555b = o1Var.f4045s;
            this.f4556c = o1Var.f4044r;
            this.f4557d = o1Var.f4043q;
            this.f4561h = o1Var.f4042p;
            this.f4559f = o1Var.f4041o;
            this.f4563j = o1Var.f4047u;
            Bundle bundle = o1Var.f4046t;
            if (bundle != null) {
                this.f4558e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
