package com.google.android.gms.internal.measurement;

import android.app.Activity;
/* loaded from: classes.dex */
final class a3 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Activity f3676r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ b1 f3677s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ c3 f3678t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(c3 c3Var, Activity activity, b1 b1Var) {
        super(c3Var.f3766n, true);
        this.f3678t = c3Var;
        this.f3676r = activity;
        this.f3677s = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3678t.f3766n.f3792i;
        ((f1) z3.o.i(f1Var)).onActivitySaveInstanceState(g4.b.m0(this.f3676r), this.f3677s, this.f4147o);
    }
}
