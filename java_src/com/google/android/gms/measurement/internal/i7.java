package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class i7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4627n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v f4628o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4629p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4630q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, v vVar, String str) {
        this.f4630q = appMeasurementDynamiteService;
        this.f4627n = i1Var;
        this.f4628o = vVar;
        this.f4629p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4630q.f4356a.L().p(this.f4627n, this.f4628o, this.f4629p);
    }
}
