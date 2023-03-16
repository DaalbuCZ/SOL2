package r4;

import android.os.Parcel;
import android.os.Parcelable;
import z3.k0;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        w3.b bVar = null;
        int i10 = 0;
        k0 k0Var = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 == 2) {
                bVar = (w3.b) a4.b.c(parcel, n10, w3.b.CREATOR);
            } else if (i11 != 3) {
                a4.b.t(parcel, n10);
            } else {
                k0Var = (k0) a4.b.c(parcel, n10, k0.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new l(i10, bVar, k0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
