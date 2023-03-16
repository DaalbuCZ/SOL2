package a3;

import a3.c;
import a3.g;
import a3.h;
import a3.j;
import a3.l;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b5.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.c0;
import o3.g0;
import o3.h0;
import o3.j0;
import p3.m0;
import s1.h2;
import u2.b0;
import u2.n;
import u2.q;
/* loaded from: classes.dex */
public final class c implements l, h0.b<j0<i>> {
    public static final l.a C = a3.b.f58a;
    private boolean A;
    private long B;

    /* renamed from: n  reason: collision with root package name */
    private final z2.g f59n;

    /* renamed from: o  reason: collision with root package name */
    private final k f60o;

    /* renamed from: p  reason: collision with root package name */
    private final g0 f61p;

    /* renamed from: q  reason: collision with root package name */
    private final HashMap<Uri, C0003c> f62q;

    /* renamed from: r  reason: collision with root package name */
    private final CopyOnWriteArrayList<l.b> f63r;

    /* renamed from: s  reason: collision with root package name */
    private final double f64s;

    /* renamed from: t  reason: collision with root package name */
    private b0.a f65t;

    /* renamed from: u  reason: collision with root package name */
    private h0 f66u;

    /* renamed from: v  reason: collision with root package name */
    private Handler f67v;

    /* renamed from: w  reason: collision with root package name */
    private l.e f68w;

    /* renamed from: x  reason: collision with root package name */
    private h f69x;

    /* renamed from: y  reason: collision with root package name */
    private Uri f70y;

    /* renamed from: z  reason: collision with root package name */
    private g f71z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements l.b {
        private b() {
        }

        @Override // a3.l.b
        public void e() {
            c.this.f63r.remove(this);
        }

        @Override // a3.l.b
        public boolean i(Uri uri, g0.c cVar, boolean z10) {
            C0003c c0003c;
            if (c.this.f71z == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) m0.j(c.this.f69x)).f132e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0003c c0003c2 = (C0003c) c.this.f62q.get(list.get(i11).f145a);
                    if (c0003c2 != null && elapsedRealtime < c0003c2.f80u) {
                        i10++;
                    }
                }
                g0.b c10 = c.this.f61p.c(new g0.a(1, 0, c.this.f69x.f132e.size(), i10), cVar);
                if (c10 != null && c10.f11960a == 2 && (c0003c = (C0003c) c.this.f62q.get(uri)) != null) {
                    c0003c.h(c10.f11961b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0003c implements h0.b<j0<i>> {

        /* renamed from: n  reason: collision with root package name */
        private final Uri f73n;

        /* renamed from: o  reason: collision with root package name */
        private final h0 f74o = new h0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: p  reason: collision with root package name */
        private final o3.l f75p;

        /* renamed from: q  reason: collision with root package name */
        private g f76q;

        /* renamed from: r  reason: collision with root package name */
        private long f77r;

        /* renamed from: s  reason: collision with root package name */
        private long f78s;

        /* renamed from: t  reason: collision with root package name */
        private long f79t;

        /* renamed from: u  reason: collision with root package name */
        private long f80u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f81v;

        /* renamed from: w  reason: collision with root package name */
        private IOException f82w;

        public C0003c(Uri uri) {
            this.f73n = uri;
            this.f75p = c.this.f59n.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f80u = SystemClock.elapsedRealtime() + j10;
            return this.f73n.equals(c.this.f70y) && !c.this.L();
        }

        private Uri i() {
            g gVar = this.f76q;
            if (gVar != null) {
                g.f fVar = gVar.f106v;
                if (fVar.f125a != -9223372036854775807L || fVar.f129e) {
                    Uri.Builder buildUpon = this.f73n.buildUpon();
                    g gVar2 = this.f76q;
                    if (gVar2.f106v.f129e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f95k + gVar2.f102r.size()));
                        g gVar3 = this.f76q;
                        if (gVar3.f98n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f103s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) t.c(list)).f108z) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f76q.f106v;
                    if (fVar2.f125a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f126b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f73n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(Uri uri) {
            this.f81v = false;
            p(uri);
        }

        private void p(Uri uri) {
            j0 j0Var = new j0(this.f75p, uri, 4, c.this.f60o.a(c.this.f69x, this.f76q));
            c.this.f65t.z(new n(j0Var.f11996a, j0Var.f11997b, this.f74o.n(j0Var, this, c.this.f61p.d(j0Var.f11998c))), j0Var.f11998c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(final Uri uri) {
            this.f80u = 0L;
            if (this.f81v || this.f74o.j() || this.f74o.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f79t) {
                p(uri);
                return;
            }
            this.f81v = true;
            c.this.f67v.postDelayed(new Runnable() { // from class: a3.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0003c.this.m(uri);
                }
            }, this.f79t - elapsedRealtime);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, n nVar) {
            IOException dVar;
            boolean z10;
            g gVar2 = this.f76q;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f77r = elapsedRealtime;
            g G = c.this.G(gVar2, gVar);
            this.f76q = G;
            boolean z11 = false;
            if (G != gVar2) {
                this.f82w = null;
                this.f78s = elapsedRealtime;
                c.this.R(this.f73n, G);
            } else if (!G.f99o) {
                g gVar3 = this.f76q;
                if (gVar.f95k + gVar.f102r.size() < gVar3.f95k) {
                    dVar = new l.c(this.f73n);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f78s)) > ((double) m0.X0(gVar3.f97m)) * c.this.f64s ? new l.d(this.f73n) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f82w = dVar;
                    c.this.N(this.f73n, new g0.c(nVar, new q(4), dVar, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f76q;
            if (!gVar4.f106v.f129e) {
                j10 = gVar4.f97m;
                if (gVar4 == gVar2) {
                    j10 /= 2;
                }
            }
            this.f79t = elapsedRealtime + m0.X0(j10);
            if (this.f76q.f98n != -9223372036854775807L || this.f73n.equals(c.this.f70y)) {
                z11 = true;
            }
            if (!z11 || this.f76q.f99o) {
                return;
            }
            q(i());
        }

        public g k() {
            return this.f76q;
        }

        public boolean l() {
            int i10;
            if (this.f76q == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, m0.X0(this.f76q.f105u));
            g gVar = this.f76q;
            return gVar.f99o || (i10 = gVar.f88d) == 2 || i10 == 1 || this.f77r + max > elapsedRealtime;
        }

        public void n() {
            q(this.f73n);
        }

        public void r() {
            this.f74o.b();
            IOException iOException = this.f82w;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // o3.h0.b
        /* renamed from: s */
        public void j(j0<i> j0Var, long j10, long j11, boolean z10) {
            n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            c.this.f61p.a(j0Var.f11996a);
            c.this.f65t.q(nVar, 4);
        }

        @Override // o3.h0.b
        /* renamed from: t */
        public void o(j0<i> j0Var, long j10, long j11) {
            i e10 = j0Var.e();
            n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            if (e10 instanceof g) {
                w((g) e10, nVar);
                c.this.f65t.t(nVar, 4);
            } else {
                this.f82w = h2.c("Loaded playlist has unexpected type.", null);
                c.this.f65t.x(nVar, 4, this.f82w, true);
            }
            c.this.f61p.a(j0Var.f11996a);
        }

        @Override // o3.h0.b
        /* renamed from: v */
        public h0.c u(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
            h0.c cVar;
            n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            boolean z10 = iOException instanceof j.a;
            if ((j0Var.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof c0 ? ((c0) iOException).f11936q : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f79t = SystemClock.elapsedRealtime();
                    n();
                    ((b0.a) m0.j(c.this.f65t)).x(nVar, j0Var.f11998c, iOException, true);
                    return h0.f11974f;
                }
            }
            g0.c cVar2 = new g0.c(nVar, new q(j0Var.f11998c), iOException, i10);
            if (c.this.N(this.f73n, cVar2, false)) {
                long b10 = c.this.f61p.b(cVar2);
                cVar = b10 != -9223372036854775807L ? h0.h(false, b10) : h0.f11975g;
            } else {
                cVar = h0.f11974f;
            }
            boolean c10 = true ^ cVar.c();
            c.this.f65t.x(nVar, j0Var.f11998c, iOException, c10);
            if (c10) {
                c.this.f61p.a(j0Var.f11996a);
            }
            return cVar;
        }

        public void x() {
            this.f74o.l();
        }
    }

    public c(z2.g gVar, g0 g0Var, k kVar) {
        this(gVar, g0Var, kVar, 3.5d);
    }

    public c(z2.g gVar, g0 g0Var, k kVar, double d10) {
        this.f59n = gVar;
        this.f60o = kVar;
        this.f61p = g0Var;
        this.f64s = d10;
        this.f63r = new CopyOnWriteArrayList<>();
        this.f62q = new HashMap<>();
        this.B = -9223372036854775807L;
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f62q.put(uri, new C0003c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f95k - gVar.f95k);
        List<g.d> list = gVar.f102r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        return !gVar2.f(gVar) ? gVar2.f99o ? gVar.d() : gVar : gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f93i) {
            return gVar2.f94j;
        }
        g gVar3 = this.f71z;
        int i10 = gVar3 != null ? gVar3.f94j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f94j + F.f117q) - gVar2.f102r.get(0).f117q;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f100p) {
            return gVar2.f92h;
        }
        g gVar3 = this.f71z;
        long j10 = gVar3 != null ? gVar3.f92h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f102r.size();
        g.d F = F(gVar, gVar2);
        return F != null ? gVar.f92h + F.f118r : ((long) size) == gVar2.f95k - gVar.f95k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f71z;
        if (gVar == null || !gVar.f106v.f129e || (cVar = gVar.f104t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f110b));
        int i10 = cVar.f111c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f69x.f132e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f145a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List<h.b> list = this.f69x.f132e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0003c c0003c = (C0003c) p3.a.e(this.f62q.get(list.get(i10).f145a));
            if (elapsedRealtime > c0003c.f80u) {
                Uri uri = c0003c.f73n;
                this.f70y = uri;
                c0003c.q(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f70y) || !K(uri)) {
            return;
        }
        g gVar = this.f71z;
        if (gVar == null || !gVar.f99o) {
            this.f70y = uri;
            C0003c c0003c = this.f62q.get(uri);
            g gVar2 = c0003c.f76q;
            if (gVar2 == null || !gVar2.f99o) {
                c0003c.q(J(uri));
                return;
            }
            this.f71z = gVar2;
            this.f68w.m(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, g0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f63r.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().i(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f70y)) {
            if (this.f71z == null) {
                this.A = !gVar.f99o;
                this.B = gVar.f92h;
            }
            this.f71z = gVar;
            this.f68w.m(gVar);
        }
        Iterator<l.b> it = this.f63r.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // o3.h0.b
    /* renamed from: O */
    public void j(j0<i> j0Var, long j10, long j11, boolean z10) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f61p.a(j0Var.f11996a);
        this.f65t.q(nVar, 4);
    }

    @Override // o3.h0.b
    /* renamed from: P */
    public void o(j0<i> j0Var, long j10, long j11) {
        i e10 = j0Var.e();
        boolean z10 = e10 instanceof g;
        h e11 = z10 ? h.e(e10.f151a) : (h) e10;
        this.f69x = e11;
        this.f70y = e11.f132e.get(0).f145a;
        this.f63r.add(new b());
        E(e11.f131d);
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        C0003c c0003c = this.f62q.get(this.f70y);
        if (z10) {
            c0003c.w((g) e10, nVar);
        } else {
            c0003c.n();
        }
        this.f61p.a(j0Var.f11996a);
        this.f65t.t(nVar, 4);
    }

    @Override // o3.h0.b
    /* renamed from: Q */
    public h0.c u(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.f61p.b(new g0.c(nVar, new q(j0Var.f11998c), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L;
        this.f65t.x(nVar, j0Var.f11998c, iOException, z10);
        if (z10) {
            this.f61p.a(j0Var.f11996a);
        }
        return z10 ? h0.f11975g : h0.h(false, b10);
    }

    @Override // a3.l
    public boolean a() {
        return this.A;
    }

    @Override // a3.l
    public h b() {
        return this.f69x;
    }

    @Override // a3.l
    public boolean c(Uri uri, long j10) {
        C0003c c0003c = this.f62q.get(uri);
        if (c0003c != null) {
            return !c0003c.h(j10);
        }
        return false;
    }

    @Override // a3.l
    public void d(l.b bVar) {
        this.f63r.remove(bVar);
    }

    @Override // a3.l
    public boolean e(Uri uri) {
        return this.f62q.get(uri).l();
    }

    @Override // a3.l
    public void f() {
        h0 h0Var = this.f66u;
        if (h0Var != null) {
            h0Var.b();
        }
        Uri uri = this.f70y;
        if (uri != null) {
            h(uri);
        }
    }

    @Override // a3.l
    public void g(Uri uri, b0.a aVar, l.e eVar) {
        this.f67v = m0.w();
        this.f65t = aVar;
        this.f68w = eVar;
        j0 j0Var = new j0(this.f59n.a(4), uri, 4, this.f60o.b());
        p3.a.f(this.f66u == null);
        h0 h0Var = new h0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f66u = h0Var;
        aVar.z(new n(j0Var.f11996a, j0Var.f11997b, h0Var.n(j0Var, this, this.f61p.d(j0Var.f11998c))), j0Var.f11998c);
    }

    @Override // a3.l
    public void h(Uri uri) {
        this.f62q.get(uri).r();
    }

    @Override // a3.l
    public void i(Uri uri) {
        this.f62q.get(uri).n();
    }

    @Override // a3.l
    public g k(Uri uri, boolean z10) {
        g k10 = this.f62q.get(uri).k();
        if (k10 != null && z10) {
            M(uri);
        }
        return k10;
    }

    @Override // a3.l
    public void l(l.b bVar) {
        p3.a.e(bVar);
        this.f63r.add(bVar);
    }

    @Override // a3.l
    public long m() {
        return this.B;
    }

    @Override // a3.l
    public void stop() {
        this.f70y = null;
        this.f71z = null;
        this.f69x = null;
        this.B = -9223372036854775807L;
        this.f66u.l();
        this.f66u = null;
        for (C0003c c0003c : this.f62q.values()) {
            c0003c.x();
        }
        this.f67v.removeCallbacksAndMessages(null);
        this.f67v = null;
        this.f62q.clear();
    }
}
