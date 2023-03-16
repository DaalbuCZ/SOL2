package r4;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class e extends j4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // j4.b
    protected final boolean m0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                w3.b bVar = (w3.b) j4.c.a(parcel, w3.b.CREATOR);
                b bVar2 = (b) j4.c.a(parcel, b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) j4.c.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) j4.c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) j4.c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                w((l) j4.c.a(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) j4.c.a(parcel, h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
