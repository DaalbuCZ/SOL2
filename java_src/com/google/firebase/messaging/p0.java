package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class p0 implements Parcelable.Creator<o0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(o0 o0Var, Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.e(parcel, 2, o0Var.f5577n, false);
        a4.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public o0 createFromParcel(Parcel parcel) {
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
        return new o0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public o0[] newArray(int i10) {
        return new o0[i10];
    }
}
