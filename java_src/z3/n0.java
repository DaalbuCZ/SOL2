package z3;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class n0 extends l4.b implements k {
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // l4.b
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.c.b(parcel);
            j0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) l4.c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            l4.c.b(parcel);
            S(parcel.readInt(), (Bundle) l4.c.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            l4.c.b(parcel);
            Q(parcel.readInt(), parcel.readStrongBinder(), (b1) l4.c.a(parcel, b1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
