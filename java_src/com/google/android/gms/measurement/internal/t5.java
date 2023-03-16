package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5019n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f5020o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f5021p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ i6 f5022q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t5(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f5022q = i6Var;
        this.f5019n = atomicReference;
        this.f5020o = str2;
        this.f5021p = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5022q.f4438a.L().U(this.f5019n, null, this.f5020o, this.f5021p);
    }
}
