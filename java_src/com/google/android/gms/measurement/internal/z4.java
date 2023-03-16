package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class z4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f5219n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b5 f5220o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(b5 b5Var, n9 n9Var) {
        this.f5220o = b5Var;
        this.f5219n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f5220o.f4418a;
        a9Var.a();
        a9Var2 = this.f5220o.f4418a;
        a9Var2.q(this.f5219n);
    }
}
