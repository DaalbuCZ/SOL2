package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class s4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4992n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b5 f4993o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4(b5 b5Var, n9 n9Var) {
        this.f4993o = b5Var;
        this.f4992n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4993o.f4418a;
        a9Var.a();
        a9Var2 = this.f4993o.f4418a;
        n9 n9Var = this.f4992n;
        a9Var2.b().h();
        a9Var2.g();
        z3.o.e(n9Var.f4817n);
        a9Var2.S(n9Var);
    }
}
