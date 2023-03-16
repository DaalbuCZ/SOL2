package z3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class g1 implements ServiceConnection, k1 {

    /* renamed from: n  reason: collision with root package name */
    private final Map f17378n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private int f17379o = 2;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17380p;

    /* renamed from: q  reason: collision with root package name */
    private IBinder f17381q;

    /* renamed from: r  reason: collision with root package name */
    private final f1 f17382r;

    /* renamed from: s  reason: collision with root package name */
    private ComponentName f17383s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ j1 f17384t;

    public g1(j1 j1Var, f1 f1Var) {
        this.f17384t = j1Var;
        this.f17382r = f1Var;
    }

    public final int a() {
        return this.f17379o;
    }

    public final ComponentName b() {
        return this.f17383s;
    }

    public final IBinder c() {
        return this.f17381q;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f17378n.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        c4.a aVar;
        Context context;
        Context context2;
        c4.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f17379o = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (d4.l.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            j1 j1Var = this.f17384t;
            aVar = j1Var.f17399j;
            context = j1Var.f17396g;
            f1 f1Var = this.f17382r;
            context2 = j1Var.f17396g;
            boolean d10 = aVar.d(context, str, f1Var.c(context2), this, this.f17382r.a(), executor);
            this.f17380p = d10;
            if (d10) {
                handler = this.f17384t.f17397h;
                Message obtainMessage = handler.obtainMessage(1, this.f17382r);
                handler2 = this.f17384t.f17397h;
                j10 = this.f17384t.f17401l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f17379o = 2;
                try {
                    j1 j1Var2 = this.f17384t;
                    aVar2 = j1Var2.f17399j;
                    context3 = j1Var2.f17396g;
                    aVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f17378n.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        c4.a aVar;
        Context context;
        handler = this.f17384t.f17397h;
        handler.removeMessages(1, this.f17382r);
        j1 j1Var = this.f17384t;
        aVar = j1Var.f17399j;
        context = j1Var.f17396g;
        aVar.c(context, this);
        this.f17380p = false;
        this.f17379o = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f17378n.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f17378n.isEmpty();
    }

    public final boolean j() {
        return this.f17380p;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f17384t.f17395f;
        synchronized (hashMap) {
            handler = this.f17384t.f17397h;
            handler.removeMessages(1, this.f17382r);
            this.f17381q = iBinder;
            this.f17383s = componentName;
            for (ServiceConnection serviceConnection : this.f17378n.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f17379o = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f17384t.f17395f;
        synchronized (hashMap) {
            handler = this.f17384t.f17397h;
            handler.removeMessages(1, this.f17382r);
            this.f17381q = null;
            this.f17383s = componentName;
            for (ServiceConnection serviceConnection : this.f17378n.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f17379o = 2;
        }
    }
}
