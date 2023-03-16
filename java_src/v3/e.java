package v3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            if (a4.b.i(n10) != 1) {
                a4.b.t(parcel, n10);
            } else {
                intent = (Intent) a4.b.c(parcel, n10, Intent.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
