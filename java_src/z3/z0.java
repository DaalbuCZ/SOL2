package z3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import z3.c;
/* loaded from: classes.dex */
public final class z0 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f17456g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f17457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f17457h = cVar;
        this.f17456g = iBinder;
    }

    @Override // z3.m0
    protected final void f(w3.b bVar) {
        if (this.f17457h.I != null) {
            this.f17457h.I.e(bVar);
        }
        this.f17457h.L(bVar);
    }

    @Override // z3.m0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f17456g;
            o.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f17457h.E().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f17457h.E() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface s10 = this.f17457h.s(this.f17456g);
        if (s10 == null || !(c.g0(this.f17457h, 2, 4, s10) || c.g0(this.f17457h, 3, 4, s10))) {
            return false;
        }
        this.f17457h.M = null;
        Bundle x10 = this.f17457h.x();
        c cVar = this.f17457h;
        aVar = cVar.H;
        if (aVar != null) {
            aVar2 = cVar.H;
            aVar2.f(x10);
            return true;
        }
        return true;
    }
}
