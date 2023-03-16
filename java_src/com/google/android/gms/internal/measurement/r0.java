package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class r0 extends o0 implements t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final Bundle X(Bundle bundle) {
        Parcel a10 = a();
        q0.e(a10, bundle);
        Parcel e10 = e(1, a10);
        Bundle bundle2 = (Bundle) q0.a(e10, Bundle.CREATOR);
        e10.recycle();
        return bundle2;
    }
}
