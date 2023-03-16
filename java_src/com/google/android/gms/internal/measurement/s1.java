package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f4142r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4143s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ b1 f4144t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ d3 f4145u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(d3 d3Var, String str, String str2, b1 b1Var) {
        super(d3Var, true);
        this.f4145u = d3Var;
        this.f4142r = str;
        this.f4143s = str2;
        this.f4144t = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4145u.f3792i;
        ((f1) z3.o.i(f1Var)).getConditionalUserProperties(this.f4142r, this.f4143s, this.f4144t);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f4144t.T(null);
    }
}
