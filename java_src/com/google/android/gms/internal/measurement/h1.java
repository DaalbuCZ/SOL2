package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class h1 extends p0 implements i1 {
    public h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            q0.c(parcel);
            T((Bundle) q0.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
