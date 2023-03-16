package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class k6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4707n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4708o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f4708o = appMeasurementDynamiteService;
        this.f4707n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4708o.f4356a.L().R(this.f4707n);
    }
}
