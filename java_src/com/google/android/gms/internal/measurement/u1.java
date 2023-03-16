package com.google.android.gms.internal.measurement;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Activity f4226r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4227s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ String f4228t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ d3 f4229u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(d3 d3Var, Activity activity, String str, String str2) {
        super(d3Var, true);
        this.f4229u = d3Var;
        this.f4226r = activity;
        this.f4227s = str;
        this.f4228t = str2;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4229u.f3792i;
        ((f1) z3.o.i(f1Var)).setCurrentScreen(g4.b.m0(this.f4226r), this.f4227s, this.f4228t, this.f4146n);
    }
}
