package b4;

import android.os.IBinder;
import android.os.Parcel;
import z3.s;
/* loaded from: classes.dex */
public final class a extends j4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void m0(s sVar) {
        Parcel a10 = a();
        j4.c.b(a10, sVar);
        f(1, a10);
    }
}
