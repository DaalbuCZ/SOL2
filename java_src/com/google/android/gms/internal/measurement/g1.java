package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class g1 extends o0 implements i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void T(Bundle bundle) {
        Parcel a10 = a();
        q0.e(a10, bundle);
        f(1, a10);
    }
}
