package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class o9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        boolean z10 = true;
        boolean z11 = true;
        String str = "";
        String str2 = str;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j15 = -2147483648L;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 2:
                    str3 = a4.b.d(parcel, n10);
                    break;
                case 3:
                    str4 = a4.b.d(parcel, n10);
                    break;
                case 4:
                    str5 = a4.b.d(parcel, n10);
                    break;
                case 5:
                    str6 = a4.b.d(parcel, n10);
                    break;
                case 6:
                    j10 = a4.b.q(parcel, n10);
                    break;
                case 7:
                    j11 = a4.b.q(parcel, n10);
                    break;
                case 8:
                    str7 = a4.b.d(parcel, n10);
                    break;
                case 9:
                    z10 = a4.b.j(parcel, n10);
                    break;
                case 10:
                    z12 = a4.b.j(parcel, n10);
                    break;
                case 11:
                    j15 = a4.b.q(parcel, n10);
                    break;
                case 12:
                    str8 = a4.b.d(parcel, n10);
                    break;
                case 13:
                    j12 = a4.b.q(parcel, n10);
                    break;
                case 14:
                    j13 = a4.b.q(parcel, n10);
                    break;
                case 15:
                    i10 = a4.b.p(parcel, n10);
                    break;
                case 16:
                    z11 = a4.b.j(parcel, n10);
                    break;
                case 17:
                case 20:
                default:
                    a4.b.t(parcel, n10);
                    break;
                case 18:
                    z13 = a4.b.j(parcel, n10);
                    break;
                case 19:
                    str9 = a4.b.d(parcel, n10);
                    break;
                case 21:
                    bool = a4.b.k(parcel, n10);
                    break;
                case 22:
                    j14 = a4.b.q(parcel, n10);
                    break;
                case c.j.f3071t3 /* 23 */:
                    arrayList = a4.b.e(parcel, n10);
                    break;
                case c.j.f3076u3 /* 24 */:
                    str10 = a4.b.d(parcel, n10);
                    break;
                case 25:
                    str = a4.b.d(parcel, n10);
                    break;
                case 26:
                    str2 = a4.b.d(parcel, n10);
                    break;
                case 27:
                    str11 = a4.b.d(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new n9(str3, str4, str5, str6, j10, j11, str7, z10, z12, j15, str8, j12, j13, i10, z11, z13, str9, bool, j14, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n9[i10];
    }
}
