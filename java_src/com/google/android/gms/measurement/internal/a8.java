package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class a8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ a9 f4381n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Runnable f4382o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(b8 b8Var, a9 a9Var, Runnable runnable) {
        this.f4381n = a9Var;
        this.f4382o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4381n.a();
        this.f4381n.l0(this.f4382o);
        this.f4381n.C();
    }
}
