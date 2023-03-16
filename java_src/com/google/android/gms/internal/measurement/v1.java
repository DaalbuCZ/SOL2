package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Boolean f4251r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4252s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(d3 d3Var, Boolean bool) {
        super(d3Var, true);
        this.f4252s = d3Var;
        this.f4251r = bool;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1 f1Var2;
        if (this.f4251r != null) {
            f1Var2 = this.f4252s.f3792i;
            ((f1) z3.o.i(f1Var2)).setMeasurementEnabled(this.f4251r.booleanValue(), this.f4146n);
            return;
        }
        f1Var = this.f4252s.f3792i;
        ((f1) z3.o.i(f1Var)).clearMeasurementEnabled(this.f4146n);
    }
}
