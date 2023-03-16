package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i10 = a4.b.i(n10);
            if (i10 == 1) {
                arrayList = a4.b.e(parcel, n10);
            } else if (i10 != 2) {
                a4.b.t(parcel, n10);
            } else {
                str = a4.b.d(parcel, n10);
            }
        }
        a4.b.h(parcel, u10);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
