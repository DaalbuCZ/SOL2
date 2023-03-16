package w3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i10 = a4.b.i(n10);
            if (i10 == 1) {
                str = a4.b.d(parcel, n10);
            } else if (i10 == 2) {
                z10 = a4.b.j(parcel, n10);
            } else if (i10 == 3) {
                z11 = a4.b.j(parcel, n10);
            } else if (i10 == 4) {
                iBinder = a4.b.o(parcel, n10);
            } else if (i10 != 5) {
                a4.b.t(parcel, n10);
            } else {
                z12 = a4.b.j(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new a0(str, z10, z11, iBinder, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
