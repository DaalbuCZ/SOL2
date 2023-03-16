package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        w3.b bVar = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i12 = a4.b.i(n10);
            if (i12 == 1) {
                i11 = a4.b.p(parcel, n10);
            } else if (i12 == 2) {
                str = a4.b.d(parcel, n10);
            } else if (i12 == 3) {
                pendingIntent = (PendingIntent) a4.b.c(parcel, n10, PendingIntent.CREATOR);
            } else if (i12 == 4) {
                bVar = (w3.b) a4.b.c(parcel, n10, w3.b.CREATOR);
            } else if (i12 != 1000) {
                a4.b.t(parcel, n10);
            } else {
                i10 = a4.b.p(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
