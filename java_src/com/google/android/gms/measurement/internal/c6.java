package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Boolean f4439n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4440o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c6(i6 i6Var, Boolean bool) {
        this.f4440o = i6Var;
        this.f4439n = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4440o.O(this.f4439n, true);
    }
}
