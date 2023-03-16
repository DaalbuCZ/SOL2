package w3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i12 = a4.b.i(n10);
            if (i12 == 1) {
                z10 = a4.b.j(parcel, n10);
            } else if (i12 == 2) {
                str = a4.b.d(parcel, n10);
            } else if (i12 == 3) {
                i11 = a4.b.p(parcel, n10);
            } else if (i12 != 4) {
                a4.b.t(parcel, n10);
            } else {
                i10 = a4.b.p(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new c0(z10, str, i11, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
