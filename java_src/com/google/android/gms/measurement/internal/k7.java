package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4709n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ boolean f4710o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v f4711p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ String f4712q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v7 f4713r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k7(v7 v7Var, boolean z10, n9 n9Var, boolean z11, v vVar, String str) {
        this.f4713r = v7Var;
        this.f4709n = n9Var;
        this.f4710o = z11;
        this.f4711p = vVar;
        this.f4712q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4713r;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Discarding data. Failed to send event to service");
            return;
        }
        z3.o.i(this.f4709n);
        this.f4713r.r(fVar, this.f4710o ? null : this.f4711p, this.f4709n);
        this.f4713r.E();
    }
}
