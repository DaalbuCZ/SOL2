package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n3.t;
import o3.c0;
import o3.g0;
import o3.i0;
import o3.l;
import o3.p0;
import p3.m0;
import s1.d3;
import s1.m1;
import t1.t1;
import w2.g;
import w2.h;
import w2.k;
import w2.m;
import w2.n;
import w2.o;
import w2.p;
import x2.f;
import y2.i;
import y2.j;
/* loaded from: classes.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f3407a;

    /* renamed from: b  reason: collision with root package name */
    private final x2.b f3408b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f3409c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3410d;

    /* renamed from: e  reason: collision with root package name */
    private final l f3411e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3412f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3413g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f3414h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f3415i;

    /* renamed from: j  reason: collision with root package name */
    private t f3416j;

    /* renamed from: k  reason: collision with root package name */
    private y2.c f3417k;

    /* renamed from: l  reason: collision with root package name */
    private int f3418l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f3419m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3420n;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0074a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f3421a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3422b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f3423c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        public a(l.a aVar, int i10) {
            this(w2.e.f15985w, aVar, i10);
        }

        public a(g.a aVar, l.a aVar2, int i10) {
            this.f3423c = aVar;
            this.f3421a = aVar2;
            this.f3422b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0074a
        public com.google.android.exoplayer2.source.dash.a a(i0 i0Var, y2.c cVar, x2.b bVar, int i10, int[] iArr, t tVar, int i11, long j10, boolean z10, List<m1> list, e.c cVar2, p0 p0Var, t1 t1Var) {
            l a10 = this.f3421a.a();
            if (p0Var != null) {
                a10.i(p0Var);
            }
            return new c(this.f3423c, i0Var, cVar, bVar, i10, iArr, tVar, i11, a10, j10, this.f3422b, z10, list, cVar2, t1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f3424a;

        /* renamed from: b  reason: collision with root package name */
        public final j f3425b;

        /* renamed from: c  reason: collision with root package name */
        public final y2.b f3426c;

        /* renamed from: d  reason: collision with root package name */
        public final f f3427d;

        /* renamed from: e  reason: collision with root package name */
        private final long f3428e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3429f;

        b(long j10, j jVar, y2.b bVar, g gVar, long j11, f fVar) {
            this.f3428e = j10;
            this.f3425b = jVar;
            this.f3426c = bVar;
            this.f3429f = j11;
            this.f3424a = gVar;
            this.f3427d = fVar;
        }

        b b(long j10, j jVar) {
            long a10;
            long a11;
            f l10 = this.f3425b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f3426c, this.f3424a, this.f3429f, l10);
            }
            if (l10.g()) {
                long i10 = l10.i(j10);
                if (i10 == 0) {
                    return new b(j10, jVar, this.f3426c, this.f3424a, this.f3429f, l11);
                }
                long h10 = l10.h();
                long d10 = l10.d(h10);
                long j11 = (i10 + h10) - 1;
                long h11 = l11.h();
                long d11 = l11.d(h11);
                long j12 = this.f3429f;
                int i11 = ((l10.d(j11) + l10.b(j11, j10)) > d11 ? 1 : ((l10.d(j11) + l10.b(j11, j10)) == d11 ? 0 : -1));
                if (i11 == 0) {
                    a10 = j11 + 1;
                } else if (i11 < 0) {
                    throw new u2.b();
                } else {
                    if (d11 < d10) {
                        a11 = j12 - (l11.a(d10, j10) - h10);
                        return new b(j10, jVar, this.f3426c, this.f3424a, a11, l11);
                    }
                    a10 = l10.a(d11, j10);
                }
                a11 = j12 + (a10 - h11);
                return new b(j10, jVar, this.f3426c, this.f3424a, a11, l11);
            }
            return new b(j10, jVar, this.f3426c, this.f3424a, this.f3429f, l11);
        }

        b c(f fVar) {
            return new b(this.f3428e, this.f3425b, this.f3426c, this.f3424a, this.f3429f, fVar);
        }

        b d(y2.b bVar) {
            return new b(this.f3428e, this.f3425b, bVar, this.f3424a, this.f3429f, this.f3427d);
        }

        public long e(long j10) {
            return this.f3427d.c(this.f3428e, j10) + this.f3429f;
        }

        public long f() {
            return this.f3427d.h() + this.f3429f;
        }

        public long g(long j10) {
            return (e(j10) + this.f3427d.j(this.f3428e, j10)) - 1;
        }

        public long h() {
            return this.f3427d.i(this.f3428e);
        }

        public long i(long j10) {
            return k(j10) + this.f3427d.b(j10 - this.f3429f, this.f3428e);
        }

        public long j(long j10) {
            return this.f3427d.a(j10, this.f3428e) + this.f3429f;
        }

        public long k(long j10) {
            return this.f3427d.d(j10 - this.f3429f);
        }

        public i l(long j10) {
            return this.f3427d.f(j10 - this.f3429f);
        }

        public boolean m(long j10, long j11) {
            return this.f3427d.g() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected static final class C0075c extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f3430e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3431f;

        public C0075c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f3430e = bVar;
            this.f3431f = j12;
        }

        @Override // w2.o
        public long a() {
            c();
            return this.f3430e.i(d());
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f3430e.k(d());
        }
    }

    public c(g.a aVar, i0 i0Var, y2.c cVar, x2.b bVar, int i10, int[] iArr, t tVar, int i11, l lVar, long j10, int i12, boolean z10, List<m1> list, e.c cVar2, t1 t1Var) {
        this.f3407a = i0Var;
        this.f3417k = cVar;
        this.f3408b = bVar;
        this.f3409c = iArr;
        this.f3416j = tVar;
        this.f3410d = i11;
        this.f3411e = lVar;
        this.f3418l = i10;
        this.f3412f = j10;
        this.f3413g = i12;
        this.f3414h = cVar2;
        long g10 = cVar.g(i10);
        ArrayList<j> o10 = o();
        this.f3415i = new b[tVar.length()];
        int i13 = 0;
        while (i13 < this.f3415i.length) {
            j jVar = o10.get(tVar.b(i13));
            y2.b j11 = bVar.j(jVar.f16916c);
            b[] bVarArr = this.f3415i;
            if (j11 == null) {
                j11 = jVar.f16916c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(g10, jVar, j11, aVar.a(i11, jVar.f16915b, z10, list, cVar2, t1Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private g0.a l(t tVar, List<y2.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (tVar.i(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = x2.b.f(list);
        return new g0.a(f10, f10 - this.f3408b.g(list), length, i10);
    }

    private long m(long j10, long j11) {
        if (this.f3417k.f16868d) {
            return Math.max(0L, Math.min(n(j10), this.f3415i[0].i(this.f3415i[0].g(j10))) - j11);
        }
        return -9223372036854775807L;
    }

    private long n(long j10) {
        y2.c cVar = this.f3417k;
        long j11 = cVar.f16865a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - m0.A0(j11 + cVar.d(this.f3418l).f16901b);
    }

    private ArrayList<j> o() {
        List<y2.a> list = this.f3417k.d(this.f3418l).f16902c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f3409c) {
            arrayList.addAll(list.get(i10).f16857c);
        }
        return arrayList;
    }

    private long p(b bVar, n nVar, long j10, long j11, long j12) {
        return nVar != null ? nVar.g() : m0.r(bVar.j(j10), j11, j12);
    }

    private b s(int i10) {
        b bVar = this.f3415i[i10];
        y2.b j10 = this.f3408b.j(bVar.f3425b.f16916c);
        if (j10 == null || j10.equals(bVar.f3426c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f3415i[i10] = d10;
        return d10;
    }

    @Override // w2.j
    public void a() {
        for (b bVar : this.f3415i) {
            g gVar = bVar.f3424a;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // w2.j
    public void b() {
        IOException iOException = this.f3419m;
        if (iOException != null) {
            throw iOException;
        }
        this.f3407a.b();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void c(t tVar) {
        this.f3416j = tVar;
    }

    @Override // w2.j
    public long d(long j10, d3 d3Var) {
        b[] bVarArr;
        for (b bVar : this.f3415i) {
            if (bVar.f3427d != null) {
                long j11 = bVar.j(j10);
                long k10 = bVar.k(j11);
                long h10 = bVar.h();
                return d3Var.a(j10, k10, (k10 >= j10 || (h10 != -1 && j11 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // w2.j
    public boolean e(long j10, w2.f fVar, List<? extends n> list) {
        if (this.f3419m != null) {
            return false;
        }
        return this.f3416j.n(j10, fVar, list);
    }

    @Override // w2.j
    public int g(long j10, List<? extends n> list) {
        return (this.f3419m != null || this.f3416j.length() < 2) ? list.size() : this.f3416j.l(j10, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void h(y2.c cVar, int i10) {
        try {
            this.f3417k = cVar;
            this.f3418l = i10;
            long g10 = cVar.g(i10);
            ArrayList<j> o10 = o();
            for (int i11 = 0; i11 < this.f3415i.length; i11++) {
                b[] bVarArr = this.f3415i;
                bVarArr[i11] = bVarArr[i11].b(g10, o10.get(this.f3416j.b(i11)));
            }
        } catch (u2.b e10) {
            this.f3419m = e10;
        }
    }

    @Override // w2.j
    public void i(long j10, long j11, List<? extends n> list, h hVar) {
        int i10;
        int i11;
        o[] oVarArr;
        long j12;
        long j13;
        if (this.f3419m != null) {
            return;
        }
        long j14 = j11 - j10;
        long A0 = m0.A0(this.f3417k.f16865a) + m0.A0(this.f3417k.d(this.f3418l).f16901b) + j11;
        e.c cVar = this.f3414h;
        if (cVar == null || !cVar.h(A0)) {
            long A02 = m0.A0(m0.a0(this.f3412f));
            long n10 = n(A02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f3416j.length();
            o[] oVarArr2 = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f3415i[i12];
                if (bVar.f3427d == null) {
                    oVarArr2[i12] = o.f16045a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = A02;
                } else {
                    long e10 = bVar.e(A02);
                    long g10 = bVar.g(A02);
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = A02;
                    long p10 = p(bVar, nVar, j11, e10, g10);
                    if (p10 < e10) {
                        oVarArr[i10] = o.f16045a;
                    } else {
                        oVarArr[i10] = new C0075c(s(i10), p10, g10, n10);
                    }
                }
                i12 = i10 + 1;
                A02 = j13;
                oVarArr2 = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = A02;
            this.f3416j.r(j10, j15, m(j16, j10), list, oVarArr2);
            b s10 = s(this.f3416j.q());
            g gVar = s10.f3424a;
            if (gVar != null) {
                j jVar = s10.f3425b;
                i n11 = gVar.f() == null ? jVar.n() : null;
                i m10 = s10.f3427d == null ? jVar.m() : null;
                if (n11 != null || m10 != null) {
                    hVar.f16012a = q(s10, this.f3411e, this.f3416j.o(), this.f3416j.p(), this.f3416j.t(), n11, m10);
                    return;
                }
            }
            long j17 = s10.f3428e;
            int i13 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
            boolean z10 = i13 != 0;
            if (s10.h() == 0) {
                hVar.f16013b = z10;
                return;
            }
            long e11 = s10.e(j16);
            long g11 = s10.g(j16);
            long p11 = p(s10, nVar, j11, e11, g11);
            if (p11 < e11) {
                this.f3419m = new u2.b();
                return;
            }
            int i14 = (p11 > g11 ? 1 : (p11 == g11 ? 0 : -1));
            if (i14 > 0 || (this.f3420n && i14 >= 0)) {
                hVar.f16013b = z10;
            } else if (z10 && s10.k(p11) >= j17) {
                hVar.f16013b = true;
            } else {
                int min = (int) Math.min(this.f3413g, (g11 - p11) + 1);
                if (i13 != 0) {
                    while (min > 1 && s10.k((min + p11) - 1) >= j17) {
                        min--;
                    }
                }
                hVar.f16012a = r(s10, this.f3411e, this.f3410d, this.f3416j.o(), this.f3416j.p(), this.f3416j.t(), p11, min, list.isEmpty() ? j11 : -9223372036854775807L, n10);
            }
        }
    }

    @Override // w2.j
    public boolean j(w2.f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b c10;
        if (z10) {
            e.c cVar2 = this.f3414h;
            if (cVar2 == null || !cVar2.j(fVar)) {
                if (!this.f3417k.f16868d && (fVar instanceof n)) {
                    IOException iOException = cVar.f11964c;
                    if ((iOException instanceof c0) && ((c0) iOException).f11936q == 404) {
                        b bVar = this.f3415i[this.f3416j.d(fVar.f16006d)];
                        long h10 = bVar.h();
                        if (h10 != -1 && h10 != 0) {
                            if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                                this.f3420n = true;
                                return true;
                            }
                        }
                    }
                }
                b bVar2 = this.f3415i[this.f3416j.d(fVar.f16006d)];
                y2.b j10 = this.f3408b.j(bVar2.f3425b.f16916c);
                if (j10 == null || bVar2.f3426c.equals(j10)) {
                    g0.a l10 = l(this.f3416j, bVar2.f3425b.f16916c);
                    if ((l10.a(2) || l10.a(1)) && (c10 = g0Var.c(l10, cVar)) != null && l10.a(c10.f11960a)) {
                        int i10 = c10.f11960a;
                        if (i10 == 2) {
                            t tVar = this.f3416j;
                            return tVar.h(tVar.d(fVar.f16006d), c10.f11961b);
                        } else if (i10 == 1) {
                            this.f3408b.e(bVar2.f3426c, c10.f11961b);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // w2.j
    public void k(w2.f fVar) {
        x1.d d10;
        if (fVar instanceof m) {
            int d11 = this.f3416j.d(((m) fVar).f16006d);
            b bVar = this.f3415i[d11];
            if (bVar.f3427d == null && (d10 = bVar.f3424a.d()) != null) {
                this.f3415i[d11] = bVar.c(new x2.h(d10, bVar.f3425b.f16917d));
            }
        }
        e.c cVar = this.f3414h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    protected w2.f q(b bVar, l lVar, m1 m1Var, int i10, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f3425b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar.f3426c.f16861a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, x2.g.a(jVar, bVar.f3426c.f16861a, iVar3, 0), m1Var, i10, obj, bVar.f3424a);
    }

    protected w2.f r(b bVar, l lVar, int i10, m1 m1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        j jVar = bVar.f3425b;
        long k10 = bVar.k(j10);
        i l10 = bVar.l(j10);
        if (bVar.f3424a == null) {
            return new p(lVar, x2.g.a(jVar, bVar.f3426c.f16861a, l10, bVar.m(j10, j12) ? 0 : 8), m1Var, i11, obj, k10, bVar.i(j10), j10, i10, m1Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i a10 = l10.a(bVar.l(i13 + j10), bVar.f3426c.f16861a);
            if (a10 == null) {
                break;
            }
            i14++;
            i13++;
            l10 = a10;
        }
        long j13 = (i14 + j10) - 1;
        long i15 = bVar.i(j13);
        long j14 = bVar.f3428e;
        return new k(lVar, x2.g.a(jVar, bVar.f3426c.f16861a, l10, bVar.m(j13, j12) ? 0 : 8), m1Var, i11, obj, k10, i15, j11, (j14 == -9223372036854775807L || j14 > i15) ? -9223372036854775807L : j14, j10, i14, -jVar.f16917d, bVar.f3424a);
    }
}
