package w3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        PendingIntent pendingIntent = null;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i12 = a4.b.i(n10);
            if (i12 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i12 == 2) {
                i11 = a4.b.p(parcel, n10);
            } else if (i12 == 3) {
                pendingIntent = (PendingIntent) a4.b.c(parcel, n10, PendingIntent.CREATOR);
            } else if (i12 != 4) {
                a4.b.t(parcel, n10);
            } else {
                str = a4.b.d(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new b(i10, i11, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
