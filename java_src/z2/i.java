package z2;

import a3.g;
import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k2.a;
import o3.p;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.i0;
import p3.k0;
import s1.m1;
import t1.t1;
import z2.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends w2.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final t1 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private b5.q<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k  reason: collision with root package name */
    public final int f17222k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17223l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f17224m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f17225n;

    /* renamed from: o  reason: collision with root package name */
    public final int f17226o;

    /* renamed from: p  reason: collision with root package name */
    private final o3.l f17227p;

    /* renamed from: q  reason: collision with root package name */
    private final o3.p f17228q;

    /* renamed from: r  reason: collision with root package name */
    private final j f17229r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f17230s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f17231t;

    /* renamed from: u  reason: collision with root package name */
    private final i0 f17232u;

    /* renamed from: v  reason: collision with root package name */
    private final h f17233v;

    /* renamed from: w  reason: collision with root package name */
    private final List<m1> f17234w;

    /* renamed from: x  reason: collision with root package name */
    private final w1.m f17235x;

    /* renamed from: y  reason: collision with root package name */
    private final p2.h f17236y;

    /* renamed from: z  reason: collision with root package name */
    private final a0 f17237z;

    private i(h hVar, o3.l lVar, o3.p pVar, m1 m1Var, boolean z10, o3.l lVar2, o3.p pVar2, boolean z11, Uri uri, List<m1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, i0 i0Var, w1.m mVar, j jVar, p2.h hVar2, a0 a0Var, boolean z15, t1 t1Var) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f17226o = i11;
        this.L = z12;
        this.f17223l = i12;
        this.f17228q = pVar2;
        this.f17227p = lVar2;
        this.G = pVar2 != null;
        this.B = z11;
        this.f17224m = uri;
        this.f17230s = z14;
        this.f17232u = i0Var;
        this.f17231t = z13;
        this.f17233v = hVar;
        this.f17234w = list;
        this.f17235x = mVar;
        this.f17229r = jVar;
        this.f17236y = hVar2;
        this.f17237z = a0Var;
        this.f17225n = z15;
        this.C = t1Var;
        this.J = b5.q.J();
        this.f17222k = M.getAndIncrement();
    }

    private static o3.l i(o3.l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            p3.a.e(bArr2);
            return new a(lVar, bArr, bArr2);
        }
        return lVar;
    }

    public static i j(h hVar, o3.l lVar, m1 m1Var, long j10, a3.g gVar, f.e eVar, Uri uri, List<m1> list, int i10, Object obj, boolean z10, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, t1 t1Var) {
        boolean z12;
        o3.l lVar2;
        o3.p pVar;
        boolean z13;
        p2.h hVar2;
        a0 a0Var;
        j jVar;
        g.e eVar2 = eVar.f17217a;
        o3.p a10 = new p.b().i(k0.e(gVar.f151a, eVar2.f114n)).h(eVar2.f122v).g(eVar2.f123w).b(eVar.f17220d ? 8 : 0).a();
        boolean z14 = bArr != null;
        o3.l i11 = i(lVar, bArr, z14 ? l((String) p3.a.e(eVar2.f121u)) : null);
        g.d dVar = eVar2.f115o;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] l10 = z15 ? l((String) p3.a.e(dVar.f121u)) : null;
            z12 = z14;
            pVar = new o3.p(k0.e(gVar.f151a, dVar.f114n), dVar.f122v, dVar.f123w);
            lVar2 = i(lVar, bArr2, l10);
            z13 = z15;
        } else {
            z12 = z14;
            lVar2 = null;
            pVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f118r;
        long j12 = j11 + eVar2.f116p;
        int i12 = gVar.f94j + eVar2.f117q;
        if (iVar != null) {
            o3.p pVar2 = iVar.f17228q;
            boolean z16 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f12034a.equals(pVar2.f12034a) && pVar.f12040g == iVar.f17228q.f12040g);
            boolean z17 = uri.equals(iVar.f17224m) && iVar.I;
            p2.h hVar3 = iVar.f17236y;
            hVar2 = hVar3;
            a0Var = iVar.f17237z;
            jVar = (z16 && z17 && !iVar.K && iVar.f17223l == i12) ? iVar.D : null;
        } else {
            hVar2 = new p2.h();
            a0Var = new a0(10);
            jVar = null;
        }
        return new i(hVar, i11, a10, m1Var, z12, lVar2, pVar, z13, uri, list, i10, obj, j11, j12, eVar.f17218b, eVar.f17219c, !eVar.f17220d, i12, eVar2.f124x, z10, sVar.a(i12), eVar2.f119s, jVar, hVar2, a0Var, z11, t1Var);
    }

    @RequiresNonNull({"output"})
    private void k(o3.l lVar, o3.p pVar, boolean z10, boolean z11) {
        o3.p e10;
        long q10;
        long j10;
        if (z10) {
            r0 = this.F != 0;
            e10 = pVar;
        } else {
            e10 = pVar.e(this.F);
        }
        try {
            x1.f u10 = u(lVar, e10, z11);
            if (r0) {
                u10.h(this.F);
            }
            do {
                try {
                    if (this.H) {
                        break;
                    }
                } catch (EOFException e11) {
                    if ((this.f16006d.f13580r & 16384) == 0) {
                        throw e11;
                    }
                    this.D.d();
                    q10 = u10.q();
                    j10 = pVar.f12040g;
                }
            } while (this.D.b(u10));
            q10 = u10.q();
            j10 = pVar.f12040g;
            this.F = (int) (q10 - j10);
        } finally {
            o3.o.a(lVar);
        }
    }

    private static byte[] l(String str) {
        if (a5.b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, a3.g gVar) {
        g.e eVar2 = eVar.f17217a;
        return eVar2 instanceof g.b ? ((g.b) eVar2).f107y || (eVar.f17219c == 0 && gVar.f153c) : gVar.f153c;
    }

    @RequiresNonNull({"output"})
    private void r() {
        k(this.f16011i, this.f16004b, this.A, true);
    }

    @RequiresNonNull({"output"})
    private void s() {
        if (this.G) {
            p3.a.e(this.f17227p);
            p3.a.e(this.f17228q);
            k(this.f17227p, this.f17228q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(x1.m mVar) {
        mVar.g();
        try {
            this.f17237z.K(10);
            mVar.o(this.f17237z.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f17237z.F() != 4801587) {
            return -9223372036854775807L;
        }
        this.f17237z.P(3);
        int B = this.f17237z.B();
        int i10 = B + 10;
        if (i10 > this.f17237z.b()) {
            byte[] d10 = this.f17237z.d();
            this.f17237z.K(i10);
            System.arraycopy(d10, 0, this.f17237z.d(), 0, 10);
        }
        mVar.o(this.f17237z.d(), 10, B);
        k2.a e10 = this.f17236y.e(this.f17237z.d(), B);
        if (e10 == null) {
            return -9223372036854775807L;
        }
        int d11 = e10.d();
        for (int i11 = 0; i11 < d11; i11++) {
            a.b c10 = e10.c(i11);
            if (c10 instanceof p2.l) {
                p2.l lVar = (p2.l) c10;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f12236o)) {
                    System.arraycopy(lVar.f12237p, 0, this.f17237z.d(), 0, 8);
                    this.f17237z.O(0);
                    this.f17237z.N(8);
                    return this.f17237z.v() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private x1.f u(o3.l lVar, o3.p pVar, boolean z10) {
        p pVar2;
        long j10;
        long n10 = lVar.n(pVar);
        if (z10) {
            try {
                this.f17232u.h(this.f17230s, this.f16009g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        x1.f fVar = new x1.f(lVar, pVar.f12040g, n10);
        if (this.D == null) {
            long t10 = t(fVar);
            fVar.g();
            j jVar = this.f17229r;
            j f10 = jVar != null ? jVar.f() : this.f17233v.a(pVar.f12034a, this.f16006d, this.f17234w, this.f17232u, lVar.f(), fVar, this.C);
            this.D = f10;
            if (f10.a()) {
                pVar2 = this.E;
                j10 = t10 != -9223372036854775807L ? this.f17232u.b(t10) : this.f16009g;
            } else {
                pVar2 = this.E;
                j10 = 0;
            }
            pVar2.n0(j10);
            this.E.Z();
            this.D.c(this.E);
        }
        this.E.k0(this.f17235x);
        return fVar;
    }

    public static boolean w(i iVar, Uri uri, a3.g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f17224m) && iVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j10 + eVar.f17217a.f118r < iVar.f16010h;
    }

    @Override // o3.h0.e
    public void b() {
        j jVar;
        p3.a.e(this.E);
        if (this.D == null && (jVar = this.f17229r) != null && jVar.e()) {
            this.D = this.f17229r;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.f17231t) {
            r();
        }
        this.I = !this.H;
    }

    @Override // o3.h0.e
    public void c() {
        this.H = true;
    }

    @Override // w2.n
    public boolean h() {
        return this.I;
    }

    public int m(int i10) {
        p3.a.f(!this.f17225n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    public void n(p pVar, b5.q<Integer> qVar) {
        this.E = pVar;
        this.J = qVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
