package z3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 1:
                    i10 = a4.b.p(parcel, n10);
                    break;
                case 2:
                    i11 = a4.b.p(parcel, n10);
                    break;
                case 3:
                    i12 = a4.b.p(parcel, n10);
                    break;
                case 4:
                    j10 = a4.b.q(parcel, n10);
                    break;
                case 5:
                    j11 = a4.b.q(parcel, n10);
                    break;
                case 6:
                    str = a4.b.d(parcel, n10);
                    break;
                case 7:
                    str2 = a4.b.d(parcel, n10);
                    break;
                case 8:
                    i13 = a4.b.p(parcel, n10);
                    break;
                case 9:
                    i14 = a4.b.p(parcel, n10);
                    break;
                default:
                    a4.b.t(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new m(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
