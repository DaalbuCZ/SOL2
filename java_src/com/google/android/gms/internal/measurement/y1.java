package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ long f4300r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4301s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d3 d3Var, long j10) {
        super(d3Var, true);
        this.f4301s = d3Var;
        this.f4300r = j10;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4301s.f3792i;
        ((f1) z3.o.i(f1Var)).setSessionTimeoutDuration(this.f4300r);
    }
}
