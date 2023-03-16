package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f4918n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4919o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(i6 i6Var, long j10) {
        this.f4919o = i6Var;
        this.f4918n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4919o.z(this.f4918n, true);
        this.f4919o.f4438a.L().S(new AtomicReference());
    }
}
