package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import k0.j;
import l0.i;
import t0.g;
import t0.n;
/* loaded from: classes.dex */
public class e implements l0.b {

    /* renamed from: x  reason: collision with root package name */
    static final String f2613x = j.f("SystemAlarmDispatcher");

    /* renamed from: n  reason: collision with root package name */
    final Context f2614n;

    /* renamed from: o  reason: collision with root package name */
    private final u0.a f2615o;

    /* renamed from: p  reason: collision with root package name */
    private final n f2616p;

    /* renamed from: q  reason: collision with root package name */
    private final l0.d f2617q;

    /* renamed from: r  reason: collision with root package name */
    private final i f2618r;

    /* renamed from: s  reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f2619s;

    /* renamed from: t  reason: collision with root package name */
    private final Handler f2620t;

    /* renamed from: u  reason: collision with root package name */
    final List<Intent> f2621u;

    /* renamed from: v  reason: collision with root package name */
    Intent f2622v;

    /* renamed from: w  reason: collision with root package name */
    private c f2623w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f2621u) {
                e eVar2 = e.this;
                eVar2.f2622v = eVar2.f2621u.get(0);
            }
            Intent intent = e.this.f2622v;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f2622v.getIntExtra("KEY_START_ID", 0);
                j c10 = j.c();
                String str = e.f2613x;
                c10.a(str, String.format("Processing command %s, %s", e.this.f2622v, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b10 = t0.j.b(e.this.f2614n, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.f2619s.p(eVar3.f2622v, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        j c11 = j.c();
                        String str2 = e.f2613x;
                        c11.b(str2, "Unexpected error in onHandleIntent", th);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        j.c().a(e.f2613x, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final e f2625n;

        /* renamed from: o  reason: collision with root package name */
        private final Intent f2626o;

        /* renamed from: p  reason: collision with root package name */
        private final int f2627p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(e eVar, Intent intent, int i10) {
            this.f2625n = eVar;
            this.f2626o = intent;
            this.f2627p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2625n.a(this.f2626o, this.f2627p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final e f2628n;

        d(e eVar) {
            this.f2628n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2628n.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this(context, null, null);
    }

    e(Context context, l0.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2614n = applicationContext;
        this.f2619s = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f2616p = new n();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f2618r = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f2617q = dVar;
        this.f2615o = iVar.p();
        dVar.d(this);
        this.f2621u = new ArrayList();
        this.f2622v = null;
        this.f2620t = new Handler(Looper.getMainLooper());
    }

    private void c() {
        if (this.f2620t.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        c();
        synchronized (this.f2621u) {
            for (Intent intent : this.f2621u) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b10 = t0.j.b(this.f2614n, "ProcessCommand");
        try {
            b10.acquire();
            this.f2618r.p().b(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        j c10 = j.c();
        String str = f2613x;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f2621u) {
                boolean z10 = this.f2621u.isEmpty() ? false : true;
                this.f2621u.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f2614n, str, z10), 0));
    }

    void d() {
        j c10 = j.c();
        String str = f2613x;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        c();
        synchronized (this.f2621u) {
            if (this.f2622v != null) {
                j.c().a(str, String.format("Removing command %s", this.f2622v), new Throwable[0]);
                if (!this.f2621u.remove(0).equals(this.f2622v)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f2622v = null;
            }
            g c11 = this.f2615o.c();
            if (!this.f2619s.o() && this.f2621u.isEmpty() && !c11.a()) {
                j.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f2623w;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f2621u.isEmpty()) {
                l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0.d e() {
        return this.f2617q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0.a f() {
        return this.f2615o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i g() {
        return this.f2618r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n h() {
        return this.f2616p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        j.c().a(f2613x, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2617q.i(this);
        this.f2616p.a();
        this.f2623w = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f2620t.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f2623w != null) {
            j.c().b(f2613x, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f2623w = cVar;
        }
    }
}
