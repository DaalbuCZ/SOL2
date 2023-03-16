package z3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class y0 implements ServiceConnection {

    /* renamed from: n  reason: collision with root package name */
    private final int f17453n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ c f17454o;

    public y0(c cVar, int i10) {
        this.f17454o = cVar;
        this.f17453n = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f17454o;
        if (iBinder == null) {
            c.d0(cVar, 16);
            return;
        }
        obj = cVar.A;
        synchronized (obj) {
            c cVar2 = this.f17454o;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.B = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new o0(iBinder) : (l) queryLocalInterface;
        }
        this.f17454o.e0(0, null, this.f17453n);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f17454o.A;
        synchronized (obj) {
            this.f17454o.B = null;
        }
        Handler handler = this.f17454o.f17329y;
        handler.sendMessage(handler.obtainMessage(6, this.f17453n, 1));
    }
}
