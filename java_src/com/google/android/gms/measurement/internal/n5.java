package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class n5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f4809n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4810o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n5(i6 i6Var, long j10) {
        this.f4810o = i6Var;
        this.f4809n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4810o.f4438a.F().f4978k.b(this.f4809n);
        this.f4810o.f4438a.d().q().b("Session timeout duration set", Long.valueOf(this.f4809n));
    }
}
