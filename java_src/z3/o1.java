package z3;

import android.os.IBinder;
import android.os.Parcel;
import g4.a;
/* loaded from: classes.dex */
public final class o1 extends l4.a implements q1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // z3.q1
    public final int c() {
        Parcel a10 = a(2, e());
        int readInt = a10.readInt();
        a10.recycle();
        return readInt;
    }

    @Override // z3.q1
    public final g4.a d() {
        Parcel a10 = a(1, e());
        g4.a e10 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e10;
    }
}
