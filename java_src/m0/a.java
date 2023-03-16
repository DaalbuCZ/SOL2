package m0;

import java.util.HashMap;
import java.util.Map;
import k0.j;
import k0.q;
import s0.p;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f11289d = j.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f11290a;

    /* renamed from: b  reason: collision with root package name */
    private final q f11291b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f11292c = new HashMap();

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0163a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p f11293n;

        RunnableC0163a(p pVar) {
            this.f11293n = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(a.f11289d, String.format("Scheduling work %s", this.f11293n.f13231a), new Throwable[0]);
            a.this.f11290a.c(this.f11293n);
        }
    }

    public a(b bVar, q qVar) {
        this.f11290a = bVar;
        this.f11291b = qVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f11292c.remove(pVar.f13231a);
        if (remove != null) {
            this.f11291b.b(remove);
        }
        RunnableC0163a runnableC0163a = new RunnableC0163a(pVar);
        this.f11292c.put(pVar.f13231a, runnableC0163a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f11291b.a(pVar.a() - currentTimeMillis, runnableC0163a);
    }

    public void b(String str) {
        Runnable remove = this.f11292c.remove(str);
        if (remove != null) {
            this.f11291b.b(remove);
        }
    }
}
