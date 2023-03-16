package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class i8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4631n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4632o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4633p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ boolean f4634q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4635r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z10) {
        this.f4635r = appMeasurementDynamiteService;
        this.f4631n = i1Var;
        this.f4632o = str;
        this.f4633p = str2;
        this.f4634q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4635r.f4356a.L().V(this.f4631n, this.f4632o, this.f4633p, this.f4634q);
    }
}
