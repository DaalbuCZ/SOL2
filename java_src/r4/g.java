package r4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class g extends j4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void m0(j jVar, f fVar) {
        Parcel a10 = a();
        j4.c.b(a10, jVar);
        j4.c.c(a10, fVar);
        e(12, a10);
    }
}
