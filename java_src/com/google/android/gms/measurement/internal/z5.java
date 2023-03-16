package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5221n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f5222o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z5(i6 i6Var, AtomicReference atomicReference) {
        this.f5222o = i6Var;
        this.f5221n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5221n) {
            this.f5221n.set(Long.valueOf(this.f5222o.f4438a.z().r(this.f5222o.f4438a.B().s(), u2.N)));
            this.f5221n.notify();
        }
    }
}
