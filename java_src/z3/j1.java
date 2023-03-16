package z3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 extends h {
    @GuardedBy("connectionStatus")

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f17395f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Context f17396g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Handler f17397h;

    /* renamed from: i  reason: collision with root package name */
    private final i1 f17398i;

    /* renamed from: j  reason: collision with root package name */
    private final c4.a f17399j;

    /* renamed from: k  reason: collision with root package name */
    private final long f17400k;

    /* renamed from: l  reason: collision with root package name */
    private final long f17401l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(Context context, Looper looper) {
        i1 i1Var = new i1(this, null);
        this.f17398i = i1Var;
        this.f17396g = context.getApplicationContext();
        this.f17397h = new l4.e(looper, i1Var);
        this.f17399j = c4.a.b();
        this.f17400k = 5000L;
        this.f17401l = 300000L;
    }

    @Override // z3.h
    protected final void d(f1 f1Var, ServiceConnection serviceConnection, String str) {
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17395f) {
            g1 g1Var = (g1) this.f17395f.get(f1Var);
            if (g1Var == null) {
                String obj = f1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (!g1Var.h(serviceConnection)) {
                String obj2 = f1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            } else {
                g1Var.f(serviceConnection, str);
                if (g1Var.i()) {
                    this.f17397h.sendMessageDelayed(this.f17397h.obtainMessage(0, f1Var), this.f17400k);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.h
    public final boolean f(f1 f1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17395f) {
            g1 g1Var = (g1) this.f17395f.get(f1Var);
            if (g1Var == null) {
                g1Var = new g1(this, f1Var);
                g1Var.d(serviceConnection, serviceConnection, str);
                g1Var.e(str, executor);
                this.f17395f.put(f1Var, g1Var);
            } else {
                this.f17397h.removeMessages(0, f1Var);
                if (g1Var.h(serviceConnection)) {
                    String obj = f1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                g1Var.d(serviceConnection, serviceConnection, str);
                int a10 = g1Var.a();
                if (a10 == 1) {
                    serviceConnection.onServiceConnected(g1Var.b(), g1Var.c());
                } else if (a10 == 2) {
                    g1Var.e(str, executor);
                }
            }
            j10 = g1Var.j();
        }
        return j10;
    }
}
