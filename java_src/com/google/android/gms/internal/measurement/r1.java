package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f4106r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4107s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Bundle f4108t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ d3 f4109u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(d3 d3Var, String str, String str2, Bundle bundle) {
        super(d3Var, true);
        this.f4109u = d3Var;
        this.f4106r = str;
        this.f4107s = str2;
        this.f4108t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4109u.f3792i;
        ((f1) z3.o.i(f1Var)).clearConditionalUserProperty(this.f4106r, this.f4107s, this.f4108t);
    }
}
