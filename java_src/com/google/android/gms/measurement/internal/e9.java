package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e9 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d9 d9Var, Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, d9Var.f4487n);
        a4.c.n(parcel, 2, d9Var.f4488o, false);
        a4.c.k(parcel, 3, d9Var.f4489p);
        a4.c.l(parcel, 4, d9Var.f4490q, false);
        a4.c.g(parcel, 5, null, false);
        a4.c.n(parcel, 6, d9Var.f4491r, false);
        a4.c.n(parcel, 7, d9Var.f4492s, false);
        a4.c.f(parcel, 8, d9Var.f4493t, false);
        a4.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 1:
                    i10 = a4.b.p(parcel, n10);
                    break;
                case 2:
                    str = a4.b.d(parcel, n10);
                    break;
                case 3:
                    j10 = a4.b.q(parcel, n10);
                    break;
                case 4:
                    l10 = a4.b.r(parcel, n10);
                    break;
                case 5:
                    f10 = a4.b.m(parcel, n10);
                    break;
                case 6:
                    str2 = a4.b.d(parcel, n10);
                    break;
                case 7:
                    str3 = a4.b.d(parcel, n10);
                    break;
                case 8:
                    d10 = a4.b.l(parcel, n10);
                    break;
                default:
                    a4.b.t(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new d9(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d9[i10];
    }
}
