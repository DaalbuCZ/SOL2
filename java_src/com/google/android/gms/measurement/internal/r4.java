package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class r4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4953n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b5 f4954o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r4(b5 b5Var, n9 n9Var) {
        this.f4954o = b5Var;
        this.f4953n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4954o.f4418a;
        a9Var.a();
        a9Var2 = this.f4954o.f4418a;
        a9Var2.v(this.f4953n);
    }
}
