package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5110n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f5111o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f5112p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ boolean f5113q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ i6 f5114r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v5(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f5114r = i6Var;
        this.f5110n = atomicReference;
        this.f5111o = str2;
        this.f5112p = str3;
        this.f5113q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5114r.f4438a.L().W(this.f5110n, null, this.f5111o, this.f5112p, this.f5113q);
    }
}
