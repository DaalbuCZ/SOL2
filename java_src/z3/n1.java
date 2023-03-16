package z3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class n1 extends l4.a implements i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // z3.i
    public final Account b() {
        Parcel a10 = a(2, e());
        Account account = (Account) l4.c.a(a10, Account.CREATOR);
        a10.recycle();
        return account;
    }
}
