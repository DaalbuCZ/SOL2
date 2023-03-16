package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f4996n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v6 f4997o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6(v6 v6Var, long j10) {
        this.f4997o = v6Var;
        this.f4996n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4997o.f4438a.y().n(this.f4996n);
        this.f4997o.f5117e = null;
    }
}
