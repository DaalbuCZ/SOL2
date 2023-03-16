package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class t4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f5017n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b5 f5018o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4(b5 b5Var, n9 n9Var) {
        this.f5018o = b5Var;
        this.f5017n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f5018o.f4418a;
        a9Var.a();
        a9Var2 = this.f5018o.f4418a;
        n9 n9Var = this.f5017n;
        a9Var2.b().h();
        a9Var2.g();
        z3.o.e(n9Var.f4817n);
        p4.b b10 = p4.b.b(n9Var.I);
        p4.b V = a9Var2.V(n9Var.f4817n);
        a9Var2.d().v().c("Setting consent, package, consent", n9Var.f4817n, b10);
        a9Var2.A(n9Var.f4817n, b10);
        if (b10.k(V)) {
            a9Var2.v(n9Var);
        }
    }
}
