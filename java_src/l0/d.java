package l0;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l0.j;
/* loaded from: classes.dex */
public class d implements b, r0.a {

    /* renamed from: y  reason: collision with root package name */
    private static final String f11037y = k0.j.f("Processor");

    /* renamed from: o  reason: collision with root package name */
    private Context f11039o;

    /* renamed from: p  reason: collision with root package name */
    private androidx.work.a f11040p;

    /* renamed from: q  reason: collision with root package name */
    private u0.a f11041q;

    /* renamed from: r  reason: collision with root package name */
    private WorkDatabase f11042r;

    /* renamed from: u  reason: collision with root package name */
    private List<e> f11045u;

    /* renamed from: t  reason: collision with root package name */
    private Map<String, j> f11044t = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, j> f11043s = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    private Set<String> f11046v = new HashSet();

    /* renamed from: w  reason: collision with root package name */
    private final List<b> f11047w = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private PowerManager.WakeLock f11038n = null;

    /* renamed from: x  reason: collision with root package name */
    private final Object f11048x = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private b f11049n;

        /* renamed from: o  reason: collision with root package name */
        private String f11050o;

        /* renamed from: p  reason: collision with root package name */
        private e5.a<Boolean> f11051p;

        a(b bVar, String str, e5.a<Boolean> aVar) {
            this.f11049n = bVar;
            this.f11050o = str;
            this.f11051p = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f11051p.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f11049n.b(this.f11050o, z10);
        }
    }

    public d(Context context, androidx.work.a aVar, u0.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f11039o = context;
        this.f11040p = aVar;
        this.f11041q = aVar2;
        this.f11042r = workDatabase;
        this.f11045u = list;
    }

    private static boolean e(String str, j jVar) {
        if (jVar == null) {
            k0.j.c().a(f11037y, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.d();
        k0.j.c().a(f11037y, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f11048x) {
            if (!(!this.f11043s.isEmpty())) {
                this.f11039o.startService(androidx.work.impl.foreground.a.f(this.f11039o));
                PowerManager.WakeLock wakeLock = this.f11038n;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f11038n = null;
                }
            }
        }
    }

    @Override // r0.a
    public void a(String str, k0.e eVar) {
        synchronized (this.f11048x) {
            k0.j.c().d(f11037y, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.f11044t.remove(str);
            if (remove != null) {
                if (this.f11038n == null) {
                    PowerManager.WakeLock b10 = t0.j.b(this.f11039o, "ProcessorForegroundLck");
                    this.f11038n = b10;
                    b10.acquire();
                }
                this.f11043s.put(str, remove);
                androidx.core.content.a.m(this.f11039o, androidx.work.impl.foreground.a.c(this.f11039o, str, eVar));
            }
        }
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        synchronized (this.f11048x) {
            this.f11044t.remove(str);
            k0.j.c().a(f11037y, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            for (b bVar : this.f11047w) {
                bVar.b(str, z10);
            }
        }
    }

    @Override // r0.a
    public void c(String str) {
        synchronized (this.f11048x) {
            this.f11043s.remove(str);
            m();
        }
    }

    public void d(b bVar) {
        synchronized (this.f11048x) {
            this.f11047w.add(bVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f11048x) {
            contains = this.f11046v.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f11048x) {
            z10 = this.f11044t.containsKey(str) || this.f11043s.containsKey(str);
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f11048x) {
            containsKey = this.f11043s.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f11048x) {
            this.f11047w.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f11048x) {
            if (g(str)) {
                k0.j.c().a(f11037y, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f11039o, this.f11040p, this.f11041q, this, this.f11042r, str).c(this.f11045u).b(aVar).a();
            e5.a<Boolean> b10 = a10.b();
            b10.e(new a(this, str, b10), this.f11041q.a());
            this.f11044t.put(str, a10);
            this.f11041q.c().execute(a10);
            k0.j.c().a(f11037y, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.f11048x) {
            boolean z10 = true;
            k0.j.c().a(f11037y, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f11046v.add(str);
            j remove = this.f11043s.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f11044t.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.f11048x) {
            k0.j.c().a(f11037y, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e10 = e(str, this.f11043s.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.f11048x) {
            k0.j.c().a(f11037y, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e10 = e(str, this.f11044t.remove(str));
        }
        return e10;
    }
}
