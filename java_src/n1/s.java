package n1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import h1.g;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p1.b;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11533a;

    /* renamed from: b  reason: collision with root package name */
    private final h1.e f11534b;

    /* renamed from: c  reason: collision with root package name */
    private final o1.d f11535c;

    /* renamed from: d  reason: collision with root package name */
    private final y f11536d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11537e;

    /* renamed from: f  reason: collision with root package name */
    private final p1.b f11538f;

    /* renamed from: g  reason: collision with root package name */
    private final q1.a f11539g;

    /* renamed from: h  reason: collision with root package name */
    private final q1.a f11540h;

    /* renamed from: i  reason: collision with root package name */
    private final o1.c f11541i;

    public s(Context context, h1.e eVar, o1.d dVar, y yVar, Executor executor, p1.b bVar, q1.a aVar, q1.a aVar2, o1.c cVar) {
        this.f11533a = context;
        this.f11534b = eVar;
        this.f11535c = dVar;
        this.f11536d = yVar;
        this.f11537e = executor;
        this.f11538f = bVar;
        this.f11539g = aVar;
        this.f11540h = aVar2;
        this.f11541i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(g1.p pVar) {
        return Boolean.valueOf(this.f11535c.I(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(g1.p pVar) {
        return this.f11535c.F(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, g1.p pVar, long j10) {
        this.f11535c.Q(iterable);
        this.f11535c.K(pVar, this.f11539g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f11535c.h(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f11541i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f11541i.f(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(g1.p pVar, long j10) {
        this.f11535c.K(pVar, this.f11539g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(g1.p pVar, int i10) {
        this.f11536d.b(pVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final g1.p pVar, final int i10, Runnable runnable) {
        try {
            try {
                p1.b bVar = this.f11538f;
                final o1.d dVar = this.f11535c;
                Objects.requireNonNull(dVar);
                bVar.c(new b.a() { // from class: n1.i
                    @Override // p1.b.a
                    public final Object b() {
                        return Integer.valueOf(o1.d.this.g());
                    }
                });
                if (k()) {
                    u(pVar, i10);
                } else {
                    this.f11538f.c(new b.a() { // from class: n1.m
                        @Override // p1.b.a
                        public final Object b() {
                            Object s10;
                            s10 = s.this.s(pVar, i10);
                            return s10;
                        }
                    });
                }
            } catch (p1.a unused) {
                this.f11536d.b(pVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public g1.i j(h1.m mVar) {
        p1.b bVar = this.f11538f;
        final o1.c cVar = this.f11541i;
        Objects.requireNonNull(cVar);
        return mVar.a(g1.i.a().i(this.f11539g.a()).k(this.f11540h.a()).j("GDT_CLIENT_METRICS").h(new g1.h(e1.b.b("proto"), ((j1.a) bVar.c(new b.a() { // from class: n1.r
            @Override // p1.b.a
            public final Object b() {
                return o1.c.this.a();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11533a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public h1.g u(final g1.p pVar, int i10) {
        h1.g b10;
        h1.m a10 = this.f11534b.a(pVar.b());
        long j10 = 0;
        h1.g e10 = h1.g.e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f11538f.c(new b.a() { // from class: n1.k
                @Override // p1.b.a
                public final Object b() {
                    Boolean l10;
                    l10 = s.this.l(pVar);
                    return l10;
                }
            })).booleanValue()) {
                final Iterable<o1.k> iterable = (Iterable) this.f11538f.c(new b.a() { // from class: n1.l
                    @Override // p1.b.a
                    public final Object b() {
                        Iterable m10;
                        m10 = s.this.m(pVar);
                        return m10;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (a10 == null) {
                    k1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b10 = h1.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (o1.k kVar : iterable) {
                        arrayList.add(kVar.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(a10));
                    }
                    b10 = a10.b(h1.f.a().b(arrayList).c(pVar.c()).a());
                }
                e10 = b10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f11538f.c(new b.a() { // from class: n1.p
                        @Override // p1.b.a
                        public final Object b() {
                            Object n10;
                            n10 = s.this.n(iterable, pVar, j11);
                            return n10;
                        }
                    });
                    this.f11536d.a(pVar, i10 + 1, true);
                    return e10;
                }
                this.f11538f.c(new b.a() { // from class: n1.o
                    @Override // p1.b.a
                    public final Object b() {
                        Object o10;
                        o10 = s.this.o(iterable);
                        return o10;
                    }
                });
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (pVar.e()) {
                        this.f11538f.c(new b.a() { // from class: n1.j
                            @Override // p1.b.a
                            public final Object b() {
                                Object p10;
                                p10 = s.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (o1.k kVar2 : iterable) {
                        String j12 = kVar2.b().j();
                        hashMap.put(j12, !hashMap.containsKey(j12) ? 1 : Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                    }
                    this.f11538f.c(new b.a() { // from class: n1.q
                        @Override // p1.b.a
                        public final Object b() {
                            Object q10;
                            q10 = s.this.q(hashMap);
                            return q10;
                        }
                    });
                }
            }
            this.f11538f.c(new b.a() { // from class: n1.n
                @Override // p1.b.a
                public final Object b() {
                    Object r10;
                    r10 = s.this.r(pVar, j11);
                    return r10;
                }
            });
            return e10;
        }
    }

    public void v(final g1.p pVar, final int i10, final Runnable runnable) {
        this.f11537e.execute(new Runnable() { // from class: n1.h
            @Override // java.lang.Runnable
            public final void run() {
                s.this.t(pVar, i10, runnable);
            }
        });
    }
}
