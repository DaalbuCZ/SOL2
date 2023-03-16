package z3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class p1 extends l4.b implements q1 {
    public p1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static q1 e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new o1(iBinder);
    }

    @Override // l4.b
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            g4.a d10 = d();
            parcel2.writeNoException();
            l4.c.e(parcel2, d10);
        } else if (i10 != 2) {
            return false;
        } else {
            int c10 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c10);
        }
        return true;
    }
}
