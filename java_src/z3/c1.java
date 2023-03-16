package z3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        Bundle bundle = null;
        e eVar = null;
        int i10 = 0;
        w3.d[] dVarArr = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                bundle = a4.b.a(parcel, n10);
            } else if (i11 == 2) {
                dVarArr = (w3.d[]) a4.b.f(parcel, n10, w3.d.CREATOR);
            } else if (i11 == 3) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 != 4) {
                a4.b.t(parcel, n10);
            } else {
                eVar = (e) a4.b.c(parcel, n10, e.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new b1(bundle, dVarArr, i10, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b1[i10];
    }
}
