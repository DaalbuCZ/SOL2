package z3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface i extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends l4.b implements i {
        public static i e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof i ? (i) queryLocalInterface : new n1(iBinder);
        }
    }

    Account b();
}
