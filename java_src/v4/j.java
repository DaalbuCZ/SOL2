package v4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class j extends a implements l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // v4.l
    public final void R(String str, Bundle bundle, n nVar) {
        Parcel a10 = a();
        a10.writeString(str);
        i.c(a10, bundle);
        i.d(a10, nVar);
        e(2, a10);
    }

    @Override // v4.l
    public final void Y(String str, Bundle bundle, n nVar) {
        Parcel a10 = a();
        a10.writeString(str);
        i.c(a10, bundle);
        i.d(a10, nVar);
        e(3, a10);
    }
}
