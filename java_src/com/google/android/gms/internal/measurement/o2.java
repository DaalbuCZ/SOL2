package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Bundle f4048r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4049s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(d3 d3Var, Bundle bundle) {
        super(d3Var, true);
        this.f4049s = d3Var;
        this.f4048r = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4049s.f3792i;
        ((f1) z3.o.i(f1Var)).setDefaultEventParameters(this.f4048r);
    }
}
