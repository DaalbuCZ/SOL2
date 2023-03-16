package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f3955r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ b1 f3956s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ d3 f3957t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(d3 d3Var, String str, b1 b1Var) {
        super(d3Var, true);
        this.f3957t = d3Var;
        this.f3955r = str;
        this.f3956s = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3957t.f3792i;
        ((f1) z3.o.i(f1Var)).getMaxUserProperties(this.f3955r, this.f3956s);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f3956s.T(null);
    }
}
