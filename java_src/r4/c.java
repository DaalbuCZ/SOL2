package r4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i12 = a4.b.i(n10);
            if (i12 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i12 == 2) {
                i11 = a4.b.p(parcel, n10);
            } else if (i12 != 3) {
                a4.b.t(parcel, n10);
            } else {
                intent = (Intent) a4.b.c(parcel, n10, Intent.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
