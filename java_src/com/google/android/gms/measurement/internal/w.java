package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(v vVar, Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 2, vVar.f5100n, false);
        a4.c.m(parcel, 3, vVar.f5101o, i10, false);
        a4.c.n(parcel, 4, vVar.f5102p, false);
        a4.c.k(parcel, 5, vVar.f5103q);
        a4.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        String str = null;
        t tVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i10 = a4.b.i(n10);
            if (i10 == 2) {
                str = a4.b.d(parcel, n10);
            } else if (i10 == 3) {
                tVar = (t) a4.b.c(parcel, n10, t.CREATOR);
            } else if (i10 == 4) {
                str2 = a4.b.d(parcel, n10);
            } else if (i10 != 5) {
                a4.b.t(parcel, n10);
            } else {
                j10 = a4.b.q(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new v(str, tVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
