package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f4376n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4377o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6(i6 i6Var, AtomicReference atomicReference) {
        this.f4377o = i6Var;
        this.f4376n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4376n) {
            this.f4376n.set(Integer.valueOf(this.f4377o.f4438a.z().o(this.f4377o.f4438a.B().s(), u2.O)));
            this.f4376n.notify();
        }
    }
}
