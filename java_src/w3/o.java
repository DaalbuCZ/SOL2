package w3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                str = a4.b.d(parcel, n10);
            } else if (i11 == 2) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 != 3) {
                a4.b.t(parcel, n10);
            } else {
                j10 = a4.b.q(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new d(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
