package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5200n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f5201o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y5(i6 i6Var, AtomicReference atomicReference) {
        this.f5201o = i6Var;
        this.f5200n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5200n) {
            this.f5200n.set(this.f5201o.f4438a.z().x(this.f5201o.f4438a.B().s(), u2.M));
            this.f5200n.notify();
        }
    }
}
