package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ o6 f4920n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ o6 f4921o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ long f4922p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ boolean f4923q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v6 f4924r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(v6 v6Var, o6 o6Var, o6 o6Var2, long j10, boolean z10) {
        this.f4924r = v6Var;
        this.f4920n = o6Var;
        this.f4921o = o6Var2;
        this.f4922p = j10;
        this.f4923q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4924r.o(this.f4920n, this.f4921o, this.f4922p, this.f4923q, null);
    }
}
