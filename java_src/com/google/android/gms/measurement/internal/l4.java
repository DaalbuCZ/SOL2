package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class l4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ d f4732n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ n9 f4733o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ b5 f4734p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l4(b5 b5Var, d dVar, n9 n9Var) {
        this.f4734p = b5Var;
        this.f4732n = dVar;
        this.f4733o = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9 a9Var3;
        a9Var = this.f4734p.f4418a;
        a9Var.a();
        if (this.f4732n.f4447p.k() == null) {
            a9Var3 = this.f4734p.f4418a;
            a9Var3.t(this.f4732n, this.f4733o);
            return;
        }
        a9Var2 = this.f4734p.f4418a;
        a9Var2.z(this.f4732n, this.f4733o);
    }
}
