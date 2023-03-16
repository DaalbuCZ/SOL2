package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class c8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f4443n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ l8 f4444o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(l8 l8Var, long j10) {
        this.f4444o = l8Var;
        this.f4443n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8.r(this.f4444o, this.f4443n);
    }
}
