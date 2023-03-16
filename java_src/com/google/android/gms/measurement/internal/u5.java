package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5091n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f5092o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u5(i6 i6Var, AtomicReference atomicReference) {
        this.f5092o = i6Var;
        this.f5091n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5091n) {
            this.f5091n.set(Boolean.valueOf(this.f5092o.f4438a.z().B(this.f5092o.f4438a.B().s(), u2.L)));
            this.f5091n.notify();
        }
    }
}
