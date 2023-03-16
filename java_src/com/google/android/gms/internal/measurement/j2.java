package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f3919r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ Object f3920s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ d3 f3921t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(d3 d3Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(d3Var, false);
        this.f3921t = d3Var;
        this.f3919r = str;
        this.f3920s = obj;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var;
        f1Var = this.f3921t.f3792i;
        ((f1) z3.o.i(f1Var)).logHealthData(5, this.f3919r, g4.b.m0(this.f3920s), g4.b.m0(null), g4.b.m0(null));
    }
}
