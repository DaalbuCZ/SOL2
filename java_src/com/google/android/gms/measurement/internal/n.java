package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ e5 f4795n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ o f4796o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, e5 e5Var) {
        this.f4796o = oVar;
        this.f4795n = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4795n.f();
        if (c.a()) {
            this.f4795n.b().z(this);
            return;
        }
        boolean e10 = this.f4796o.e();
        this.f4796o.f4833c = 0L;
        if (e10) {
            this.f4796o.c();
        }
    }
}
