package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f3674r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f3675s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(d3 d3Var, String str) {
        super(d3Var, true);
        this.f3675s = d3Var;
        this.f3674r = str;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3675s.f3792i;
        ((f1) z3.o.i(f1Var)).beginAdUnitExposure(this.f3674r, this.f4147o);
    }
}
