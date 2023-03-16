package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class l3 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ boolean f4730n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ m3 f4731o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l3(m3 m3Var, boolean z10) {
        this.f4731o = m3Var;
        this.f4730n = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        a9Var = this.f4731o.f4755a;
        a9Var.o(this.f4730n);
    }
}
