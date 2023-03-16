package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 != 2) {
                a4.b.t(parcel, n10);
            } else {
                str = a4.b.d(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new Scope(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
