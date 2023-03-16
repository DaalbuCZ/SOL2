package z3;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class p0 extends l4.a implements r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // z3.r0
    public final boolean V(w3.e0 e0Var, g4.a aVar) {
        Parcel e10 = e();
        l4.c.d(e10, e0Var);
        l4.c.e(e10, aVar);
        Parcel a10 = a(5, e10);
        boolean f10 = l4.c.f(a10);
        a10.recycle();
        return f10;
    }

    @Override // z3.r0
    public final w3.c0 W(w3.a0 a0Var) {
        Parcel e10 = e();
        l4.c.d(e10, a0Var);
        Parcel a10 = a(8, e10);
        w3.c0 c0Var = (w3.c0) l4.c.a(a10, w3.c0.CREATOR);
        a10.recycle();
        return c0Var;
    }

    @Override // z3.r0
    public final boolean g() {
        Parcel a10 = a(7, e());
        boolean f10 = l4.c.f(a10);
        a10.recycle();
        return f10;
    }

    @Override // z3.r0
    public final w3.c0 k0(w3.a0 a0Var) {
        Parcel e10 = e();
        l4.c.d(e10, a0Var);
        Parcel a10 = a(6, e10);
        w3.c0 c0Var = (w3.c0) l4.c.a(a10, w3.c0.CREATOR);
        a10.recycle();
        return c0Var;
    }
}
