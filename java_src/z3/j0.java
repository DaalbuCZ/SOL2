package z3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i0 createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            int i12 = a4.b.i(n10);
            if (i12 == 1) {
                i10 = a4.b.p(parcel, n10);
            } else if (i12 == 2) {
                account = (Account) a4.b.c(parcel, n10, Account.CREATOR);
            } else if (i12 == 3) {
                i11 = a4.b.p(parcel, n10);
            } else if (i12 != 4) {
                a4.b.t(parcel, n10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) a4.b.c(parcel, n10, GoogleSignInAccount.CREATOR);
            }
        }
        a4.b.h(parcel, u10);
        return new i0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i0[] newArray(int i10) {
        return new i0[i10];
    }
}
