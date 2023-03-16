package z3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* loaded from: classes.dex */
public final class x0 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    private c f17451a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17452b;

    public x0(c cVar, int i10) {
        this.f17451a = cVar;
        this.f17452b = i10;
    }

    @Override // z3.k
    public final void Q(int i10, IBinder iBinder, b1 b1Var) {
        c cVar = this.f17451a;
        o.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.i(b1Var);
        c.c0(cVar, b1Var);
        j0(i10, iBinder, b1Var.f17314n);
    }

    @Override // z3.k
    public final void S(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // z3.k
    public final void j0(int i10, IBinder iBinder, Bundle bundle) {
        o.j(this.f17451a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f17451a.N(i10, iBinder, bundle, this.f17452b);
        this.f17451a = null;
    }
}
