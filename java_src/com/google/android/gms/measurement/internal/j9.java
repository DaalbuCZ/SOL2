package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class j9 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4695n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4696o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4697p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4698q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        this.f4698q = appMeasurementDynamiteService;
        this.f4695n = i1Var;
        this.f4696o = str;
        this.f4697p = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4698q.f4356a.L().T(this.f4695n, this.f4696o, this.f4697p);
    }
}
