package z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i11 = a4.b.i(n10);
            if (i11 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i11 != 2) {
                a4.b.t(parcel, n10);
            } else {
                arrayList = a4.b.g(parcel, n10, m.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new s(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i10) {
        return new s[i10];
    }
}
