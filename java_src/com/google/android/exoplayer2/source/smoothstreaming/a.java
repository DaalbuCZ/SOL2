package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import f2.o;
import f2.p;
import java.io.IOException;
import java.util.List;
import n3.b0;
import n3.t;
import o3.g0;
import o3.i0;
import o3.l;
import o3.p0;
import s1.d3;
import s1.m1;
import w2.e;
import w2.f;
import w2.g;
import w2.h;
import w2.k;
import w2.n;
/* loaded from: classes.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f3490a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3491b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f3492c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3493d;

    /* renamed from: e  reason: collision with root package name */
    private t f3494e;

    /* renamed from: f  reason: collision with root package name */
    private c3.a f3495f;

    /* renamed from: g  reason: collision with root package name */
    private int f3496g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f3497h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0076a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f3498a;

        public C0076a(l.a aVar) {
            this.f3498a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(i0 i0Var, c3.a aVar, int i10, t tVar, p0 p0Var) {
            l a10 = this.f3498a.a();
            if (p0Var != null) {
                a10.i(p0Var);
            }
            return new a(i0Var, aVar, i10, tVar, a10);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f3499e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3500f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f3171k - 1);
            this.f3499e = bVar;
            this.f3500f = i10;
        }

        @Override // w2.o
        public long a() {
            return b() + this.f3499e.c((int) d());
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f3499e.e((int) d());
        }
    }

    public a(i0 i0Var, c3.a aVar, int i10, t tVar, l lVar) {
        this.f3490a = i0Var;
        this.f3495f = aVar;
        this.f3491b = i10;
        this.f3494e = tVar;
        this.f3493d = lVar;
        a.b bVar = aVar.f3155f[i10];
        this.f3492c = new g[tVar.length()];
        int i11 = 0;
        while (i11 < this.f3492c.length) {
            int b10 = tVar.b(i11);
            m1 m1Var = bVar.f3170j[b10];
            p[] pVarArr = m1Var.B != null ? ((a.C0071a) p3.a.e(aVar.f3154e)).f3160c : null;
            int i12 = bVar.f3161a;
            int i13 = i11;
            this.f3492c[i13] = new e(new f2.g(3, null, new o(b10, i12, bVar.f3163c, -9223372036854775807L, aVar.f3156g, m1Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f3161a, m1Var);
            i11 = i13 + 1;
        }
    }

    private static n l(m1 m1Var, l lVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        return new k(lVar, new o3.p(uri), m1Var, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, gVar);
    }

    private long m(long j10) {
        c3.a aVar = this.f3495f;
        if (aVar.f3153d) {
            a.b bVar = aVar.f3155f[this.f3491b];
            int i10 = bVar.f3171k - 1;
            return (bVar.e(i10) + bVar.c(i10)) - j10;
        }
        return -9223372036854775807L;
    }

    @Override // w2.j
    public void a() {
        for (g gVar : this.f3492c) {
            gVar.a();
        }
    }

    @Override // w2.j
    public void b() {
        IOException iOException = this.f3497h;
        if (iOException != null) {
            throw iOException;
        }
        this.f3490a.b();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(t tVar) {
        this.f3494e = tVar;
    }

    @Override // w2.j
    public long d(long j10, d3 d3Var) {
        a.b bVar = this.f3495f.f3155f[this.f3491b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return d3Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f3171k + (-1)) ? e10 : bVar.e(d10 + 1));
    }

    @Override // w2.j
    public boolean e(long j10, f fVar, List<? extends n> list) {
        if (this.f3497h != null) {
            return false;
        }
        return this.f3494e.n(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void f(c3.a aVar) {
        a.b[] bVarArr = this.f3495f.f3155f;
        int i10 = this.f3491b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f3171k;
        a.b bVar2 = aVar.f3155f[i10];
        if (i11 != 0 && bVar2.f3171k != 0) {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 > e11) {
                this.f3496g += bVar.d(e11);
                this.f3495f = aVar;
            }
        }
        this.f3496g += i11;
        this.f3495f = aVar;
    }

    @Override // w2.j
    public int g(long j10, List<? extends n> list) {
        return (this.f3497h != null || this.f3494e.length() < 2) ? list.size() : this.f3494e.l(j10, list);
    }

    @Override // w2.j
    public final void i(long j10, long j11, List<? extends n> list, h hVar) {
        int g10;
        long j12 = j11;
        if (this.f3497h != null) {
            return;
        }
        c3.a aVar = this.f3495f;
        a.b bVar = aVar.f3155f[this.f3491b];
        if (bVar.f3171k == 0) {
            hVar.f16013b = !aVar.f3153d;
            return;
        }
        if (list.isEmpty()) {
            g10 = bVar.d(j12);
        } else {
            g10 = (int) (list.get(list.size() - 1).g() - this.f3496g);
            if (g10 < 0) {
                this.f3497h = new u2.b();
                return;
            }
        }
        if (g10 >= bVar.f3171k) {
            hVar.f16013b = !this.f3495f.f3153d;
            return;
        }
        long j13 = j12 - j10;
        long m10 = m(j10);
        int length = this.f3494e.length();
        w2.o[] oVarArr = new w2.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new b(bVar, this.f3494e.b(i10), g10);
        }
        this.f3494e.r(j10, j13, m10, list, oVarArr);
        long e10 = bVar.e(g10);
        long c10 = e10 + bVar.c(g10);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = g10 + this.f3496g;
        int q10 = this.f3494e.q();
        g gVar = this.f3492c[q10];
        hVar.f16012a = l(this.f3494e.o(), this.f3493d, bVar.a(this.f3494e.b(q10), g10), i11, e10, c10, j14, this.f3494e.p(), this.f3494e.t(), gVar);
    }

    @Override // w2.j
    public boolean j(f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b c10 = g0Var.c(b0.c(this.f3494e), cVar);
        if (z10 && c10 != null && c10.f11960a == 2) {
            t tVar = this.f3494e;
            if (tVar.h(tVar.d(fVar.f16006d), c10.f11961b)) {
                return true;
            }
        }
        return false;
    }

    @Override // w2.j
    public void k(f fVar) {
    }
}
