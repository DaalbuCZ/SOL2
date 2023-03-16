package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            if (a4.b.i(n10) != 2) {
                a4.b.t(parcel, n10);
            } else {
                bundle = a4.b.a(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new t(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
