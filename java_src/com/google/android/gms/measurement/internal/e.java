package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        d9 d9Var = null;
        String str3 = null;
        v vVar = null;
        v vVar2 = null;
        v vVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 2:
                    str = a4.b.d(parcel, n10);
                    break;
                case 3:
                    str2 = a4.b.d(parcel, n10);
                    break;
                case 4:
                    d9Var = (d9) a4.b.c(parcel, n10, d9.CREATOR);
                    break;
                case 5:
                    j10 = a4.b.q(parcel, n10);
                    break;
                case 6:
                    z10 = a4.b.j(parcel, n10);
                    break;
                case 7:
                    str3 = a4.b.d(parcel, n10);
                    break;
                case 8:
                    vVar = (v) a4.b.c(parcel, n10, v.CREATOR);
                    break;
                case 9:
                    j11 = a4.b.q(parcel, n10);
                    break;
                case 10:
                    vVar2 = (v) a4.b.c(parcel, n10, v.CREATOR);
                    break;
                case 11:
                    j12 = a4.b.q(parcel, n10);
                    break;
                case 12:
                    vVar3 = (v) a4.b.c(parcel, n10, v.CREATOR);
                    break;
                default:
                    a4.b.t(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new d(str, str2, d9Var, j10, z10, str3, vVar, j11, vVar2, j12, vVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
