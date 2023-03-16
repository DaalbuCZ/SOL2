package com.google.android.gms.internal.measurement;

import android.app.Activity;
/* loaded from: classes.dex */
final class v2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Activity f4253r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ c3 f4254s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(c3 c3Var, Activity activity) {
        super(c3Var.f3766n, true);
        this.f4254s = c3Var;
        this.f4253r = activity;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4254s.f3766n.f3792i;
        ((f1) z3.o.i(f1Var)).onActivityStarted(g4.b.m0(this.f4253r), this.f4147o);
    }
}
