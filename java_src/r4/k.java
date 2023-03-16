package r4;

import android.os.Parcel;
import android.os.Parcelable;
import z3.i0;
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        int i10 = 0;
        i0 i0Var = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 != 2) {
                a4.b.t(parcel, n10);
            } else {
                i0Var = (i0) a4.b.c(parcel, n10, i0.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new j(i10, i0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
