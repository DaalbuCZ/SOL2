package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l9 implements p4.t {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.l1 f4749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4750b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l1 l1Var) {
        this.f4750b = appMeasurementDynamiteService;
        this.f4749a = l1Var;
    }

    @Override // p4.t
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f4749a.n(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            j4 j4Var = this.f4750b.f4356a;
            if (j4Var != null) {
                j4Var.d().w().b("Event interceptor threw exception", e10);
            }
        }
    }
}
