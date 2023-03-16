package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
final class m9 implements p4.u {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.l1 f4793a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f4794b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l1 l1Var) {
        this.f4794b = appMeasurementDynamiteService;
        this.f4793a = l1Var;
    }

    @Override // p4.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f4793a.n(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            j4 j4Var = this.f4794b.f4356a;
            if (j4Var != null) {
                j4Var.d().w().b("Event listener threw exception", e10);
            }
        }
    }
}
