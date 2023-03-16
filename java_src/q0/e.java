package q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import k0.j;
/* loaded from: classes.dex */
public class e extends d<o0.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f12526j = j.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f12527g;

    /* renamed from: h  reason: collision with root package name */
    private b f12528h;

    /* renamed from: i  reason: collision with root package name */
    private a f12529i;

    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(e.f12526j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(e.f12526j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(e.f12526j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, u0.a aVar) {
        super(context, aVar);
        this.f12527g = (ConnectivityManager) this.f12520b.getSystemService("connectivity");
        if (j()) {
            this.f12528h = new b();
        } else {
            this.f12529i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // q0.d
    public void e() {
        if (!j()) {
            j.c().a(f12526j, "Registering broadcast receiver", new Throwable[0]);
            this.f12520b.registerReceiver(this.f12529i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            j.c().a(f12526j, "Registering network callback", new Throwable[0]);
            this.f12527g.registerDefaultNetworkCallback(this.f12528h);
        } catch (IllegalArgumentException | SecurityException e10) {
            j.c().b(f12526j, "Received exception while registering network callback", e10);
        }
    }

    @Override // q0.d
    public void f() {
        if (!j()) {
            j.c().a(f12526j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f12520b.unregisterReceiver(this.f12529i);
            return;
        }
        try {
            j.c().a(f12526j, "Unregistering network callback", new Throwable[0]);
            this.f12527g.unregisterNetworkCallback(this.f12528h);
        } catch (IllegalArgumentException | SecurityException e10) {
            j.c().b(f12526j, "Received exception while unregistering network callback", e10);
        }
    }

    o0.b g() {
        NetworkInfo activeNetworkInfo = this.f12527g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f12527g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new o0.b(z11, i10, a10, z10);
    }

    @Override // q0.d
    /* renamed from: h */
    public o0.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f12527g.getNetworkCapabilities(this.f12527g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            j.c().b(f12526j, "Unable to validate active network", e10);
            return false;
        }
    }
}
