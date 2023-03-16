package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 1:
                    j10 = a4.b.q(parcel, n10);
                    break;
                case 2:
                    j11 = a4.b.q(parcel, n10);
                    break;
                case 3:
                    z10 = a4.b.j(parcel, n10);
                    break;
                case 4:
                    str = a4.b.d(parcel, n10);
                    break;
                case 5:
                    str2 = a4.b.d(parcel, n10);
                    break;
                case 6:
                    str3 = a4.b.d(parcel, n10);
                    break;
                case 7:
                    bundle = a4.b.a(parcel, n10);
                    break;
                case 8:
                    str4 = a4.b.d(parcel, n10);
                    break;
                default:
                    a4.b.t(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new o1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o1[i10];
    }
}
