package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class d8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f4485n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ l8 f4486o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d8(l8 l8Var, long j10) {
        this.f4486o = l8Var;
        this.f4485n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8.q(this.f4486o, this.f4485n);
    }
}
