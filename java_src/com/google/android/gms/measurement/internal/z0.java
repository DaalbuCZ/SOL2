package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f5213n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ a2 f5214o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(a2 a2Var, long j10) {
        this.f5214o = a2Var;
        this.f5213n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5214o.q(this.f5213n);
    }
}
