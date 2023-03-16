package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ o6 f5023n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ long f5024o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v6 f5025p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6(v6 v6Var, o6 o6Var, long j10) {
        this.f5025p = v6Var;
        this.f5023n = o6Var;
        this.f5024o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5025p.p(this.f5023n, false, this.f5024o);
        v6 v6Var = this.f5025p;
        v6Var.f5117e = null;
        v6Var.f4438a.L().u(null);
    }
}
