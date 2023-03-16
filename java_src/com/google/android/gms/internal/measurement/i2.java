package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f3895r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f3896s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ boolean f3897t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ b1 f3898u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ d3 f3899v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(d3 d3Var, String str, String str2, boolean z10, b1 b1Var) {
        super(d3Var, true);
        this.f3899v = d3Var;
        this.f3895r = str;
        this.f3896s = str2;
        this.f3897t = z10;
        this.f3898u = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3899v.f3792i;
        ((f1) z3.o.i(f1Var)).getUserProperties(this.f3895r, this.f3896s, this.f3897t, this.f3898u);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f3898u.T(null);
    }
}
