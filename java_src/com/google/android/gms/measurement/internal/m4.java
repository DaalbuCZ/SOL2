package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class m4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ d f4758n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b5 f4759o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4(b5 b5Var, d dVar) {
        this.f4759o = b5Var;
        this.f4758n = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9 a9Var3;
        a9Var = this.f4759o.f4418a;
        a9Var.a();
        if (this.f4758n.f4447p.k() == null) {
            a9Var3 = this.f4759o.f4418a;
            a9Var3.s(this.f4758n);
            return;
        }
        a9Var2 = this.f4759o.f4418a;
        a9Var2.y(this.f4758n);
    }
}
