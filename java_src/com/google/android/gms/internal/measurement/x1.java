package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ d3 f4283r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(d3 d3Var) {
        super(d3Var, true);
        this.f4283r = d3Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4283r.f3792i;
        ((f1) z3.o.i(f1Var)).resetAnalyticsData(this.f4146n);
    }
}
