package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f4886n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4887o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ Object f4888p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ long f4889q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ i6 f4890r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p5(i6 i6Var, String str, String str2, Object obj, long j10) {
        this.f4890r = i6Var;
        this.f4886n = str;
        this.f4887o = str2;
        this.f4888p = obj;
        this.f4889q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4890r.M(this.f4886n, this.f4887o, this.f4888p, this.f4889q);
    }
}
