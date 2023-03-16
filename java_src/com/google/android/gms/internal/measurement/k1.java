package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class k1 extends p0 implements l1 {
    public k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            long readLong = parcel.readLong();
            q0.c(parcel);
            n(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int d10 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d10);
        }
        return true;
    }
}
