package z3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator<k0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k0 createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        IBinder iBinder = null;
        w3.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 == 2) {
                iBinder = a4.b.o(parcel, n10);
            } else if (i11 == 3) {
                bVar = (w3.b) a4.b.c(parcel, n10, w3.b.CREATOR);
            } else if (i11 == 4) {
                z10 = a4.b.j(parcel, n10);
            } else if (i11 != 5) {
                a4.b.t(parcel, n10);
            } else {
                z11 = a4.b.j(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new k0(i10, iBinder, bVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i10) {
        return new k0[i10];
    }
}
