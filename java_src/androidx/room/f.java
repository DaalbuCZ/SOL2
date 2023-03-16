package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    final Context f2215a;

    /* renamed from: b  reason: collision with root package name */
    final String f2216b;

    /* renamed from: c  reason: collision with root package name */
    int f2217c;

    /* renamed from: d  reason: collision with root package name */
    final androidx.room.e f2218d;

    /* renamed from: e  reason: collision with root package name */
    final e.c f2219e;

    /* renamed from: f  reason: collision with root package name */
    androidx.room.c f2220f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f2221g;

    /* renamed from: h  reason: collision with root package name */
    final androidx.room.b f2222h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f2223i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f2224j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f2225k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f2226l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f2227m;

    /* loaded from: classes.dex */
    class a extends b.a {

        /* renamed from: androidx.room.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0043a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String[] f2229n;

            RunnableC0043a(String[] strArr) {
                this.f2229n = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f2218d.e(this.f2229n);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void E(String[] strArr) {
            f.this.f2221g.execute(new RunnableC0043a(strArr));
        }
    }

    /* loaded from: classes.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f2220f = c.a.a(iBinder);
            f fVar = f.this;
            fVar.f2221g.execute(fVar.f2225k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f2221g.execute(fVar.f2226l);
            f.this.f2220f = null;
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2220f;
                if (cVar != null) {
                    fVar.f2217c = cVar.P(fVar.f2222h, fVar.f2216b);
                    f fVar2 = f.this;
                    fVar2.f2218d.a(fVar2.f2219e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2218d.g(fVar.f2219e);
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2218d.g(fVar.f2219e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f2220f;
                if (cVar != null) {
                    cVar.e0(fVar2.f2222h, fVar2.f2217c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            f fVar3 = f.this;
            fVar3.f2215a.unbindService(fVar3.f2224j);
        }
    }

    /* renamed from: androidx.room.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0044f extends e.c {
        C0044f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set<String> set) {
            if (f.this.f2223i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2220f;
                if (cVar != null) {
                    cVar.Z(fVar.f2217c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f2224j = bVar;
        this.f2225k = new c();
        this.f2226l = new d();
        this.f2227m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f2215a = applicationContext;
        this.f2216b = str;
        this.f2218d = eVar;
        this.f2221g = executor;
        this.f2219e = new C0044f((String[]) eVar.f2192a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
