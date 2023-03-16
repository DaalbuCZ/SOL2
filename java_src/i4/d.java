package i4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class d extends a implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // i4.f
    public final boolean F(boolean z10) {
        Parcel a10 = a();
        c.a(a10, true);
        Parcel e10 = e(2, a10);
        boolean b10 = c.b(e10);
        e10.recycle();
        return b10;
    }

    @Override // i4.f
    public final String c() {
        Parcel e10 = e(1, a());
        String readString = e10.readString();
        e10.recycle();
        return readString;
    }
}
