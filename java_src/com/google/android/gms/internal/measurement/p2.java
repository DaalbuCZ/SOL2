package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ t2 f4060r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4061s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(d3 d3Var, t2 t2Var) {
        super(d3Var, true);
        this.f4061s = d3Var;
        this.f4060r = t2Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4061s.f3792i;
        ((f1) z3.o.i(f1Var)).registerOnMeasurementEventListener(this.f4060r);
    }
}
