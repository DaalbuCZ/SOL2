package s3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import i4.e;
import i4.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import w3.g;
import w3.i;
import z3.o;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class a {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    w3.a f13976a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    f f13977b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    boolean f13978c;

    /* renamed from: d  reason: collision with root package name */
    final Object f13979d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e  reason: collision with root package name */
    c f13980e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private final Context f13981f;

    /* renamed from: g  reason: collision with root package name */
    final long f13982g;

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0194a {

        /* renamed from: a  reason: collision with root package name */
        private final String f13983a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13984b;

        @Deprecated
        public C0194a(String str, boolean z10) {
            this.f13983a = str;
            this.f13984b = z10;
        }

        public String a() {
            return this.f13983a;
        }

        public boolean b() {
            return this.f13984b;
        }

        public String toString() {
            String str = this.f13983a;
            boolean z10 = this.f13984b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z10);
            return sb.toString();
        }
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        o.i(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f13981f = context;
        this.f13978c = false;
        this.f13982g = j10;
    }

    public static C0194a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0194a f10 = aVar.f(-1);
            aVar.e(f10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f10;
        } finally {
        }
    }

    public static void b(boolean z10) {
    }

    private final C0194a f(int i10) {
        C0194a c0194a;
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f13978c) {
                synchronized (this.f13979d) {
                    c cVar = this.f13980e;
                    if (cVar == null || !cVar.f13989q) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.f13978c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            o.i(this.f13976a);
            o.i(this.f13977b);
            try {
                c0194a = new C0194a(this.f13977b.c(), this.f13977b.F(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        g();
        return c0194a;
    }

    private final void g() {
        synchronized (this.f13979d) {
            c cVar = this.f13980e;
            if (cVar != null) {
                cVar.f13988p.countDown();
                try {
                    this.f13980e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f13982g;
            if (j10 > 0) {
                this.f13980e = new c(this, j10);
            }
        }
    }

    public final void c() {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13981f == null || this.f13976a == null) {
                return;
            }
            if (this.f13978c) {
                c4.a.b().c(this.f13981f, this.f13976a);
            }
            this.f13978c = false;
            this.f13977b = null;
            this.f13976a = null;
        }
    }

    protected final void d(boolean z10) {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13978c) {
                c();
            }
            Context context = this.f13981f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = w3.f.f().h(context, i.f16085a);
                if (h10 != 0 && h10 != 2) {
                    throw new IOException("Google Play services not available");
                }
                w3.a aVar = new w3.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!c4.a.b().a(context, intent, aVar, 1)) {
                    throw new IOException("Connection failure");
                }
                this.f13976a = aVar;
                try {
                    this.f13977b = e.a(aVar.a(10000L, TimeUnit.MILLISECONDS));
                    this.f13978c = true;
                    if (z10) {
                        g();
                    }
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted exception");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new g(9);
            }
        }
    }

    final boolean e(C0194a c0194a, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c0194a != null) {
                hashMap.put("limit_ad_tracking", true != c0194a.b() ? "0" : "1");
                String a10 = c0194a.a();
                if (a10 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a10.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() {
        c();
        super.finalize();
    }
}
