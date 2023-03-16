package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class x4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ d9 f5176n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ n9 f5177o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ b5 f5178p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(b5 b5Var, d9 d9Var, n9 n9Var) {
        this.f5178p = b5Var;
        this.f5176n = d9Var;
        this.f5177o = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9 a9Var3;
        a9Var = this.f5178p.f4418a;
        a9Var.a();
        if (this.f5176n.k() == null) {
            a9Var3 = this.f5178p.f4418a;
            a9Var3.u(this.f5176n, this.f5177o);
            return;
        }
        a9Var2 = this.f5178p.f4418a;
        a9Var2.B(this.f5176n, this.f5177o);
    }
}
