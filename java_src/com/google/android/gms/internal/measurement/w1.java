package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Bundle f4267r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4268s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(d3 d3Var, Bundle bundle) {
        super(d3Var, true);
        this.f4268s = d3Var;
        this.f4267r = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4268s.f3792i;
        ((f1) z3.o.i(f1Var)).setConsentThirdParty(this.f4267r, this.f4146n);
    }
}
