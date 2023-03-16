package m0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k0.j;
import k0.s;
import l0.e;
import l0.i;
import o0.c;
import o0.d;
import s0.p;
import t0.f;
/* loaded from: classes.dex */
public class b implements e, c, l0.b {

    /* renamed from: v  reason: collision with root package name */
    private static final String f11295v = j.f("GreedyScheduler");

    /* renamed from: n  reason: collision with root package name */
    private final Context f11296n;

    /* renamed from: o  reason: collision with root package name */
    private final i f11297o;

    /* renamed from: p  reason: collision with root package name */
    private final d f11298p;

    /* renamed from: r  reason: collision with root package name */
    private a f11300r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11301s;

    /* renamed from: u  reason: collision with root package name */
    Boolean f11303u;

    /* renamed from: q  reason: collision with root package name */
    private final Set<p> f11299q = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    private final Object f11302t = new Object();

    public b(Context context, androidx.work.a aVar, u0.a aVar2, i iVar) {
        this.f11296n = context;
        this.f11297o = iVar;
        this.f11298p = new d(context, aVar2, this);
        this.f11300r = new a(this, aVar.k());
    }

    private void g() {
        this.f11303u = Boolean.valueOf(f.b(this.f11296n, this.f11297o.i()));
    }

    private void h() {
        if (this.f11301s) {
            return;
        }
        this.f11297o.m().d(this);
        this.f11301s = true;
    }

    private void i(String str) {
        synchronized (this.f11302t) {
            Iterator<p> it = this.f11299q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f13231a.equals(str)) {
                    j.c().a(f11295v, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f11299q.remove(next);
                    this.f11298p.d(this.f11299q);
                    break;
                }
            }
        }
    }

    @Override // l0.e
    public void a(String str) {
        if (this.f11303u == null) {
            g();
        }
        if (!this.f11303u.booleanValue()) {
            j.c().d(f11295v, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(f11295v, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f11300r;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f11297o.x(str);
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        i(str);
    }

    @Override // l0.e
    public void c(p... pVarArr) {
        if (this.f11303u == null) {
            g();
        }
        if (!this.f11303u.booleanValue()) {
            j.c().d(f11295v, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f13232b == s.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f11300r;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f13240j.h()) {
                        j.c().a(f11295v, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f13240j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f13231a);
                    } else {
                        j.c().a(f11295v, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(f11295v, String.format("Starting work for %s", pVar.f13231a), new Throwable[0]);
                    this.f11297o.u(pVar.f13231a);
                }
            }
        }
        synchronized (this.f11302t) {
            if (!hashSet.isEmpty()) {
                j.c().a(f11295v, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f11299q.addAll(hashSet);
                this.f11298p.d(this.f11299q);
            }
        }
    }

    @Override // o0.c
    public void d(List<String> list) {
        for (String str : list) {
            j.c().a(f11295v, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f11297o.x(str);
        }
    }

    @Override // o0.c
    public void e(List<String> list) {
        for (String str : list) {
            j.c().a(f11295v, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f11297o.u(str);
        }
    }

    @Override // l0.e
    public boolean f() {
        return false;
    }
}
