package z3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 1:
                    qVar = (q) a4.b.c(parcel, n10, q.CREATOR);
                    break;
                case 2:
                    z10 = a4.b.j(parcel, n10);
                    break;
                case 3:
                    z11 = a4.b.j(parcel, n10);
                    break;
                case 4:
                    iArr = a4.b.b(parcel, n10);
                    break;
                case 5:
                    i10 = a4.b.p(parcel, n10);
                    break;
                case 6:
                    iArr2 = a4.b.b(parcel, n10);
                    break;
                default:
                    a4.b.t(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new e(qVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
