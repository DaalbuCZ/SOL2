package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f3722r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ d3 f3723s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d3 d3Var, String str) {
        super(d3Var, true);
        this.f3723s = d3Var;
        this.f3722r = str;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3723s.f3792i;
        ((f1) z3.o.i(f1Var)).endAdUnitExposure(this.f3722r, this.f4147o);
    }
}
