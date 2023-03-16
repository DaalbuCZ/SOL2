package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f4421n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4422o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(i6 i6Var, AtomicReference atomicReference) {
        this.f4422o = i6Var;
        this.f4421n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4421n) {
            this.f4421n.set(Double.valueOf(this.f4422o.f4438a.z().k(this.f4422o.f4438a.B().s(), u2.P)));
            this.f4421n.notify();
        }
    }
}
