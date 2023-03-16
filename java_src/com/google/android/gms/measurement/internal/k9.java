package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class k9 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4715n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4716o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f4716o = appMeasurementDynamiteService;
        this.f4715n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4716o.f4356a.N().D(this.f4715n, this.f4716o.f4356a.n());
    }
}
