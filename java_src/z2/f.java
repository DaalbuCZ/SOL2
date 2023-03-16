package z2;

import a3.g;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o3.p;
import o3.p0;
import p3.k0;
import p3.m0;
import s1.d3;
import s1.m1;
import t1.t1;
import u2.t0;
/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f17190a;

    /* renamed from: b  reason: collision with root package name */
    private final o3.l f17191b;

    /* renamed from: c  reason: collision with root package name */
    private final o3.l f17192c;

    /* renamed from: d  reason: collision with root package name */
    private final s f17193d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f17194e;

    /* renamed from: f  reason: collision with root package name */
    private final m1[] f17195f;

    /* renamed from: g  reason: collision with root package name */
    private final a3.l f17196g;

    /* renamed from: h  reason: collision with root package name */
    private final t0 f17197h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m1> f17198i;

    /* renamed from: k  reason: collision with root package name */
    private final t1 f17200k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17201l;

    /* renamed from: n  reason: collision with root package name */
    private IOException f17203n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f17204o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17205p;

    /* renamed from: q  reason: collision with root package name */
    private n3.t f17206q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f17208s;

    /* renamed from: j  reason: collision with root package name */
    private final z2.e f17199j = new z2.e(4);

    /* renamed from: m  reason: collision with root package name */
    private byte[] f17202m = m0.f12311f;

    /* renamed from: r  reason: collision with root package name */
    private long f17207r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends w2.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f17209l;

        public a(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, m1Var, i10, obj, bArr);
        }

        @Override // w2.l
        protected void g(byte[] bArr, int i10) {
            this.f17209l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f17209l;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public w2.f f17210a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17211b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f17212c;

        public b() {
            a();
        }

        public void a() {
            this.f17210a = null;
            this.f17211b = false;
            this.f17212c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<g.e> f17213e;

        /* renamed from: f  reason: collision with root package name */
        private final long f17214f;

        /* renamed from: g  reason: collision with root package name */
        private final String f17215g;

        public c(String str, long j10, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f17215g = str;
            this.f17214f = j10;
            this.f17213e = list;
        }

        @Override // w2.o
        public long a() {
            c();
            g.e eVar = this.f17213e.get((int) d());
            return this.f17214f + eVar.f118r + eVar.f116p;
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f17214f + this.f17213e.get((int) d()).f118r;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends n3.c {

        /* renamed from: h  reason: collision with root package name */
        private int f17216h;

        public d(t0 t0Var, int[] iArr) {
            super(t0Var, iArr);
            this.f17216h = d(t0Var.b(iArr[0]));
        }

        @Override // n3.t
        public int p() {
            return 0;
        }

        @Override // n3.t
        public int q() {
            return this.f17216h;
        }

        @Override // n3.t
        public void r(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i(this.f17216h, elapsedRealtime)) {
                for (int i10 = this.f11637b - 1; i10 >= 0; i10--) {
                    if (!i(i10, elapsedRealtime)) {
                        this.f17216h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // n3.t
        public Object t() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f17217a;

        /* renamed from: b  reason: collision with root package name */
        public final long f17218b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17219c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17220d;

        public e(g.e eVar, long j10, int i10) {
            this.f17217a = eVar;
            this.f17218b = j10;
            this.f17219c = i10;
            this.f17220d = (eVar instanceof g.b) && ((g.b) eVar).f108z;
        }
    }

    public f(h hVar, a3.l lVar, Uri[] uriArr, m1[] m1VarArr, g gVar, p0 p0Var, s sVar, List<m1> list, t1 t1Var) {
        this.f17190a = hVar;
        this.f17196g = lVar;
        this.f17194e = uriArr;
        this.f17195f = m1VarArr;
        this.f17193d = sVar;
        this.f17198i = list;
        this.f17200k = t1Var;
        o3.l a10 = gVar.a(1);
        this.f17191b = a10;
        if (p0Var != null) {
            a10.i(p0Var);
        }
        this.f17192c = gVar.a(3);
        this.f17197h = new t0(m1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((m1VarArr[i10].f13580r & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f17206q = new d(this.f17197h, d5.d.k(arrayList));
    }

    private static Uri d(a3.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f120t) == null) {
            return null;
        }
        return k0.e(gVar.f151a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z10, a3.g gVar, long j10, long j11) {
        if (iVar != null && !z10) {
            if (iVar.h()) {
                Long valueOf = Long.valueOf(iVar.f17226o == -1 ? iVar.g() : iVar.f16044j);
                int i10 = iVar.f17226o;
                return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(iVar.f16044j), Integer.valueOf(iVar.f17226o));
        }
        long j12 = gVar.f105u + j10;
        if (iVar != null && !this.f17205p) {
            j11 = iVar.f16009g;
        }
        if (gVar.f99o || j11 < j12) {
            long j13 = j11 - j10;
            int i11 = 0;
            int f10 = m0.f(gVar.f102r, Long.valueOf(j13), true, !this.f17196g.a() || iVar == null);
            long j14 = f10 + gVar.f95k;
            if (f10 >= 0) {
                g.d dVar = gVar.f102r.get(f10);
                List<g.b> list = j13 < dVar.f118r + dVar.f116p ? dVar.f113z : gVar.f103s;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    g.b bVar = list.get(i11);
                    if (j13 >= bVar.f118r + bVar.f116p) {
                        i11++;
                    } else if (bVar.f107y) {
                        j14 += list == gVar.f103s ? 1L : 0L;
                        r1 = i11;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
        }
        return new Pair<>(Long.valueOf(gVar.f95k + gVar.f102r.size()), -1);
    }

    private static e g(a3.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f95k);
        if (i11 == gVar.f102r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f103s.size()) {
                return new e(gVar.f103s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f102r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f113z.size()) {
            return new e(dVar.f113z.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f102r.size()) {
            return new e(gVar.f102r.get(i12), j10 + 1, -1);
        }
        if (gVar.f103s.isEmpty()) {
            return null;
        }
        return new e(gVar.f103s.get(0), j10 + 1, 0);
    }

    static List<g.e> i(a3.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f95k);
        if (i11 < 0 || gVar.f102r.size() < i11) {
            return b5.q.J();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < gVar.f102r.size()) {
            if (i10 != -1) {
                g.d dVar = gVar.f102r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f113z.size()) {
                    List<g.b> list = dVar.f113z;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<g.d> list2 = gVar.f102r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f98n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < gVar.f103s.size()) {
                List<g.b> list3 = gVar.f103s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private w2.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f17199j.c(uri);
        if (c10 != null) {
            this.f17199j.b(uri, c10);
            return null;
        }
        return new a(this.f17192c, new p.b().i(uri).b(1).a(), this.f17195f[i10], this.f17206q.p(), this.f17206q.t(), this.f17202m);
    }

    private long s(long j10) {
        long j11 = this.f17207r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(a3.g gVar) {
        this.f17207r = gVar.f99o ? -9223372036854775807L : gVar.e() - this.f17196g.m();
    }

    public w2.o[] a(i iVar, long j10) {
        int i10;
        int c10 = iVar == null ? -1 : this.f17197h.c(iVar.f16006d);
        int length = this.f17206q.length();
        w2.o[] oVarArr = new w2.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int b10 = this.f17206q.b(i11);
            Uri uri = this.f17194e[b10];
            if (this.f17196g.e(uri)) {
                a3.g k10 = this.f17196g.k(uri, z10);
                p3.a.e(k10);
                long m10 = k10.f92h - this.f17196g.m();
                i10 = i11;
                Pair<Long, Integer> f10 = f(iVar, b10 != c10 ? true : z10, k10, m10, j10);
                oVarArr[i10] = new c(k10.f151a, m10, i(k10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            } else {
                oVarArr[i11] = w2.o.f16045a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, d3 d3Var) {
        int q10 = this.f17206q.q();
        Uri[] uriArr = this.f17194e;
        a3.g k10 = (q10 >= uriArr.length || q10 == -1) ? null : this.f17196g.k(uriArr[this.f17206q.m()], true);
        if (k10 == null || k10.f102r.isEmpty() || !k10.f153c) {
            return j10;
        }
        long m10 = k10.f92h - this.f17196g.m();
        long j11 = j10 - m10;
        int f10 = m0.f(k10.f102r, Long.valueOf(j11), true, true);
        long j12 = k10.f102r.get(f10).f118r;
        return d3Var.a(j11, j12, f10 != k10.f102r.size() - 1 ? k10.f102r.get(f10 + 1).f118r : j12) + m10;
    }

    public int c(i iVar) {
        if (iVar.f17226o == -1) {
            return 1;
        }
        a3.g gVar = (a3.g) p3.a.e(this.f17196g.k(this.f17194e[this.f17197h.c(iVar.f16006d)], false));
        int i10 = (int) (iVar.f16044j - gVar.f95k);
        if (i10 < 0) {
            return 1;
        }
        List<g.b> list = i10 < gVar.f102r.size() ? gVar.f102r.get(i10).f113z : gVar.f103s;
        if (iVar.f17226o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f17226o);
        if (bVar.f108z) {
            return 0;
        }
        return m0.c(Uri.parse(k0.d(gVar.f151a, bVar.f114n)), iVar.f16004b.f12034a) ? 1 : 2;
    }

    public void e(long j10, long j11, List<i> list, boolean z10, b bVar) {
        a3.g gVar;
        long j12;
        Uri uri;
        int i10;
        i iVar = list.isEmpty() ? null : (i) b5.t.c(list);
        int c10 = iVar == null ? -1 : this.f17197h.c(iVar.f16006d);
        long j13 = j11 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f17205p) {
            long d10 = iVar.d();
            j13 = Math.max(0L, j13 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0L, s10 - d10);
            }
        }
        this.f17206q.r(j10, j13, s10, list, a(iVar, j11));
        int m10 = this.f17206q.m();
        boolean z11 = c10 != m10;
        Uri uri2 = this.f17194e[m10];
        if (!this.f17196g.e(uri2)) {
            bVar.f17212c = uri2;
            this.f17208s &= uri2.equals(this.f17204o);
            this.f17204o = uri2;
            return;
        }
        a3.g k10 = this.f17196g.k(uri2, true);
        p3.a.e(k10);
        this.f17205p = k10.f153c;
        w(k10);
        long m11 = k10.f92h - this.f17196g.m();
        Pair<Long, Integer> f10 = f(iVar, z11, k10, m11, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= k10.f95k || iVar == null || !z11) {
            gVar = k10;
            j12 = m11;
            uri = uri2;
            i10 = m10;
        } else {
            Uri uri3 = this.f17194e[c10];
            a3.g k11 = this.f17196g.k(uri3, true);
            p3.a.e(k11);
            j12 = k11.f92h - this.f17196g.m();
            Pair<Long, Integer> f11 = f(iVar, false, k11, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i10 = c10;
            uri = uri3;
            gVar = k11;
        }
        if (longValue < gVar.f95k) {
            this.f17203n = new u2.b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f99o) {
                bVar.f17212c = uri;
                this.f17208s &= uri.equals(this.f17204o);
                this.f17204o = uri;
                return;
            } else if (z10 || gVar.f102r.isEmpty()) {
                bVar.f17211b = true;
                return;
            } else {
                g10 = new e((g.e) b5.t.c(gVar.f102r), (gVar.f95k + gVar.f102r.size()) - 1, -1);
            }
        }
        this.f17208s = false;
        this.f17204o = null;
        Uri d11 = d(gVar, g10.f17217a.f115o);
        w2.f l10 = l(d11, i10);
        bVar.f17210a = l10;
        if (l10 != null) {
            return;
        }
        Uri d12 = d(gVar, g10.f17217a);
        w2.f l11 = l(d12, i10);
        bVar.f17210a = l11;
        if (l11 != null) {
            return;
        }
        boolean w10 = i.w(iVar, uri, gVar, g10, j12);
        if (w10 && g10.f17220d) {
            return;
        }
        bVar.f17210a = i.j(this.f17190a, this.f17191b, this.f17195f[i10], j12, gVar, g10, uri, this.f17198i, this.f17206q.p(), this.f17206q.t(), this.f17201l, this.f17193d, iVar, this.f17199j.a(d12), this.f17199j.a(d11), w10, this.f17200k);
    }

    public int h(long j10, List<? extends w2.n> list) {
        return (this.f17203n != null || this.f17206q.length() < 2) ? list.size() : this.f17206q.l(j10, list);
    }

    public t0 j() {
        return this.f17197h;
    }

    public n3.t k() {
        return this.f17206q;
    }

    public boolean m(w2.f fVar, long j10) {
        n3.t tVar = this.f17206q;
        return tVar.h(tVar.e(this.f17197h.c(fVar.f16006d)), j10);
    }

    public void n() {
        IOException iOException = this.f17203n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f17204o;
        if (uri == null || !this.f17208s) {
            return;
        }
        this.f17196g.h(uri);
    }

    public boolean o(Uri uri) {
        return m0.s(this.f17194e, uri);
    }

    public void p(w2.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f17202m = aVar.h();
            this.f17199j.b(aVar.f16004b.f12034a, (byte[]) p3.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int e10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f17194e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (e10 = this.f17206q.e(i10)) == -1) {
            return true;
        }
        this.f17208s |= uri.equals(this.f17204o);
        return j10 == -9223372036854775807L || (this.f17206q.h(e10, j10) && this.f17196g.c(uri, j10));
    }

    public void r() {
        this.f17203n = null;
    }

    public void t(boolean z10) {
        this.f17201l = z10;
    }

    public void u(n3.t tVar) {
        this.f17206q = tVar;
    }

    public boolean v(long j10, w2.f fVar, List<? extends w2.n> list) {
        if (this.f17203n != null) {
            return false;
        }
        return this.f17206q.n(j10, fVar, list);
    }
}
