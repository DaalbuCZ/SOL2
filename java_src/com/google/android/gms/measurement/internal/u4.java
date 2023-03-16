package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class u4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ v f5088n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ n9 f5089o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ b5 f5090p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(b5 b5Var, v vVar, n9 n9Var) {
        this.f5090p = b5Var;
        this.f5088n = vVar;
        this.f5089o = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5090p.n0(this.f5090p.f(this.f5088n, this.f5089o), this.f5089o);
    }
}
