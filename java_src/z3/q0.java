package z3;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class q0 extends l4.b implements r0 {
    public static r0 e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(iBinder);
    }
}
