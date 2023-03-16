package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Long f4090r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4091s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ String f4092t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Bundle f4093u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ boolean f4094v;

    /* renamed from: w  reason: collision with root package name */
    final /* synthetic */ boolean f4095w;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ d3 f4096x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(d3 d3Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(d3Var, true);
        this.f4096x = d3Var;
        this.f4090r = l10;
        this.f4091s = str;
        this.f4092t = str2;
        this.f4093u = bundle;
        this.f4094v = z10;
        this.f4095w = z11;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        Long l10 = this.f4090r;
        long longValue = l10 == null ? this.f4146n : l10.longValue();
        f1Var = this.f4096x.f3792i;
        ((f1) z3.o.i(f1Var)).logEvent(this.f4091s, this.f4092t, this.f4093u, this.f4094v, this.f4095w, longValue);
    }
}
