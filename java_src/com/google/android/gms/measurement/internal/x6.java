package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f5180n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ boolean f5181o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ d9 f5182p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ v7 f5183q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x6(v7 v7Var, n9 n9Var, boolean z10, d9 d9Var) {
        this.f5183q = v7Var;
        this.f5180n = n9Var;
        this.f5181o = z10;
        this.f5182p = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f5183q;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Discarding data. Failed to set user property");
            return;
        }
        z3.o.i(this.f5180n);
        this.f5183q.r(fVar, this.f5181o ? null : this.f5182p, this.f5180n);
        this.f5183q.E();
    }
}
