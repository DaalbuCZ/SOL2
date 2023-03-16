package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ boolean f4025r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f4026s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(d3 d3Var, boolean z10) {
        super(d3Var, true);
        this.f4026s = d3Var;
        this.f4025r = z10;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f4026s.f3792i;
        ((f1) z3.o.i(f1Var)).setDataCollectionEnabled(this.f4025r);
    }
}
