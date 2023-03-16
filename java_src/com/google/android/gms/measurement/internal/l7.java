package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4740n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ boolean f4741o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ d f4742p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ d f4743q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v7 f4744r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(v7 v7Var, boolean z10, n9 n9Var, boolean z11, d dVar, d dVar2) {
        this.f4744r = v7Var;
        this.f4740n = n9Var;
        this.f4741o = z11;
        this.f4742p = dVar;
        this.f4743q = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4744r;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        z3.o.i(this.f4740n);
        this.f4744r.r(fVar, this.f4741o ? null : this.f4742p, this.f4740n);
        this.f4744r.E();
    }
}
