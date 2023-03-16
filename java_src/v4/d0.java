package v4;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: o */
    private static final Map f15648o = new HashMap();

    /* renamed from: a */
    private final Context f15649a;

    /* renamed from: b */
    private final s f15650b;

    /* renamed from: g */
    private boolean f15655g;

    /* renamed from: h */
    private final Intent f15656h;

    /* renamed from: l */
    private ServiceConnection f15660l;

    /* renamed from: m */
    private IInterface f15661m;

    /* renamed from: n */
    private final u4.q f15662n;

    /* renamed from: d */
    private final List f15652d = new ArrayList();

    /* renamed from: e */
    private final Set f15653e = new HashSet();

    /* renamed from: f */
    private final Object f15654f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f15658j = new IBinder.DeathRecipient() { // from class: v4.v
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d0.h(d0.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f15659k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f15651c = "AppUpdateService";

    /* renamed from: i */
    private final WeakReference f15657i = new WeakReference(null);

    public d0(Context context, s sVar, String str, Intent intent, u4.q qVar, y yVar, byte[] bArr) {
        this.f15649a = context;
        this.f15650b = sVar;
        this.f15656h = intent;
        this.f15662n = qVar;
    }

    public static /* synthetic */ void h(d0 d0Var) {
        d0Var.f15650b.d("reportBinderDeath", new Object[0]);
        y yVar = (y) d0Var.f15657i.get();
        if (yVar != null) {
            d0Var.f15650b.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            d0Var.f15650b.d("%s : Binder has died.", d0Var.f15651c);
            for (t tVar : d0Var.f15652d) {
                tVar.c(d0Var.s());
            }
            d0Var.f15652d.clear();
        }
        d0Var.t();
    }

    public static /* bridge */ /* synthetic */ void m(d0 d0Var, t tVar) {
        if (d0Var.f15661m != null || d0Var.f15655g) {
            if (!d0Var.f15655g) {
                tVar.run();
                return;
            }
            d0Var.f15650b.d("Waiting to bind to the service.", new Object[0]);
            d0Var.f15652d.add(tVar);
            return;
        }
        d0Var.f15650b.d("Initiate binding to the service.", new Object[0]);
        d0Var.f15652d.add(tVar);
        c0 c0Var = new c0(d0Var, null);
        d0Var.f15660l = c0Var;
        d0Var.f15655g = true;
        if (d0Var.f15649a.bindService(d0Var.f15656h, c0Var, 1)) {
            return;
        }
        d0Var.f15650b.d("Failed to bind to the service.", new Object[0]);
        d0Var.f15655g = false;
        for (t tVar2 : d0Var.f15652d) {
            tVar2.c(new e0());
        }
        d0Var.f15652d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(d0 d0Var) {
        d0Var.f15650b.d("linkToDeath", new Object[0]);
        try {
            d0Var.f15661m.asBinder().linkToDeath(d0Var.f15658j, 0);
        } catch (RemoteException e10) {
            d0Var.f15650b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(d0 d0Var) {
        d0Var.f15650b.d("unlinkToDeath", new Object[0]);
        d0Var.f15661m.asBinder().unlinkToDeath(d0Var.f15658j, 0);
    }

    private final RemoteException s() {
        return Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f15651c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f15654f) {
            for (t4.j jVar : this.f15653e) {
                jVar.d(s());
            }
            this.f15653e.clear();
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f15648o;
        synchronized (map) {
            if (!map.containsKey(this.f15651c)) {
                HandlerThread handlerThread = new HandlerThread(this.f15651c, 10);
                handlerThread.start();
                map.put(this.f15651c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f15651c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f15661m;
    }

    public final void p(t tVar, final t4.j jVar) {
        synchronized (this.f15654f) {
            this.f15653e.add(jVar);
            jVar.a().c(new t4.d() { // from class: v4.u
                @Override // t4.d
                public final void a(t4.i iVar) {
                    d0.this.q(jVar, iVar);
                }
            });
        }
        synchronized (this.f15654f) {
            if (this.f15659k.getAndIncrement() > 0) {
                this.f15650b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new w(this, tVar.b(), tVar));
    }

    public final /* synthetic */ void q(t4.j jVar, t4.i iVar) {
        synchronized (this.f15654f) {
            this.f15653e.remove(jVar);
        }
    }

    public final void r(t4.j jVar) {
        synchronized (this.f15654f) {
            this.f15653e.remove(jVar);
        }
        synchronized (this.f15654f) {
            if (this.f15659k.get() > 0 && this.f15659k.decrementAndGet() > 0) {
                this.f15650b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new x(this));
        }
    }
}
