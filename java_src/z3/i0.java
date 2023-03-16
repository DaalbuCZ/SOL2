package z3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class i0 extends a4.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: n  reason: collision with root package name */
    final int f17390n;

    /* renamed from: o  reason: collision with root package name */
    private final Account f17391o;

    /* renamed from: p  reason: collision with root package name */
    private final int f17392p;

    /* renamed from: q  reason: collision with root package name */
    private final GoogleSignInAccount f17393q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f17390n = i10;
        this.f17391o = account;
        this.f17392p = i11;
        this.f17393q = googleSignInAccount;
    }

    public i0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f17390n);
        a4.c.m(parcel, 2, this.f17391o, i10, false);
        a4.c.i(parcel, 3, this.f17392p);
        a4.c.m(parcel, 4, this.f17393q, i10, false);
        a4.c.b(parcel, a10);
    }
}
