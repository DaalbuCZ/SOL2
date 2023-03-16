package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ b1 f3781r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f3782s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(d3 d3Var, b1 b1Var) {
        super(d3Var, true);
        this.f3782s = d3Var;
        this.f3781r = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3782s.f3792i;
        ((f1) z3.o.i(f1Var)).getGmpAppId(this.f3781r);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f3781r.T(null);
    }
}
