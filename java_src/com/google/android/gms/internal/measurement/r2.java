package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f4110r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4111s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f4112t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ boolean f4113u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ d3 f4114v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(d3 d3Var, String str, String str2, Object obj, boolean z10) {
        super(d3Var, true);
        this.f4114v = d3Var;
        this.f4110r = str;
        this.f4111s = str2;
        this.f4112t = obj;
        this.f4113u = z10;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4114v.f3792i;
        ((f1) z3.o.i(f1Var)).setUserProperty(this.f4110r, this.f4111s, g4.b.m0(this.f4112t), this.f4113u, this.f4146n);
    }
}
