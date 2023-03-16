package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class v4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ v f5107n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f5108o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ b5 f5109p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v4(b5 b5Var, v vVar, String str) {
        this.f5109p = b5Var;
        this.f5107n = vVar;
        this.f5108o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f5109p.f4418a;
        a9Var.a();
        a9Var2 = this.f5109p.f4418a;
        a9Var2.k(this.f5107n, this.f5108o);
    }
}
