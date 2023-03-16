package t7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import l8.d;
/* loaded from: classes.dex */
public class d extends BroadcastReceiver implements d.InterfaceC0160d {

    /* renamed from: n  reason: collision with root package name */
    private final Context f14799n;

    /* renamed from: o  reason: collision with root package name */
    private final t7.a f14800o;

    /* renamed from: p  reason: collision with root package name */
    private d.b f14801p;

    /* renamed from: q  reason: collision with root package name */
    private final Handler f14802q = new Handler(Looper.getMainLooper());

    /* renamed from: r  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f14803r;

    /* loaded from: classes.dex */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            d.this.i();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            d.this.j("none");
        }
    }

    public d(Context context, t7.a aVar) {
        this.f14799n = context;
        this.f14800o = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f14801p.a(this.f14800o.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        this.f14801p.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f14802q.post(new Runnable() { // from class: t7.b
            @Override // java.lang.Runnable
            public final void run() {
                d.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final String str) {
        this.f14802q.post(new Runnable() { // from class: t7.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.h(str);
            }
        });
    }

    @Override // l8.d.InterfaceC0160d
    public void a(Object obj, d.b bVar) {
        this.f14801p = bVar;
        if (Build.VERSION.SDK_INT < 24) {
            this.f14799n.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        this.f14803r = new a();
        this.f14800o.a().registerDefaultNetworkCallback(this.f14803r);
    }

    @Override // l8.d.InterfaceC0160d
    public void b(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f14799n.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f14803r != null) {
            this.f14800o.a().unregisterNetworkCallback(this.f14803r);
            this.f14803r = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        d.b bVar = this.f14801p;
        if (bVar != null) {
            bVar.a(this.f14800o.b());
        }
    }
}
