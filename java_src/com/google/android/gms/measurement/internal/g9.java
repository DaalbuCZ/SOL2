package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class g9 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ l9 f4572n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4573o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g9(AppMeasurementDynamiteService appMeasurementDynamiteService, l9 l9Var) {
        this.f4573o = appMeasurementDynamiteService;
        this.f4572n = l9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4573o.f4356a.I().H(this.f4572n);
    }
}
