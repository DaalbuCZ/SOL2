package u2;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.g0;
import o3.h0;
import o3.p;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s1.d3;
import s1.h2;
import s1.m1;
import s1.n1;
import u2.b0;
import u2.m;
import u2.m0;
import u2.r;
import w1.w;
import x1.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 implements r, x1.n, h0.b<a>, h0.f, m0.d {
    private static final Map<String, String> Z = L();

    /* renamed from: a0  reason: collision with root package name */
    private static final m1 f15197a0 = new m1.b().S("icy").e0("application/x-icy").E();
    private r.a D;
    private o2.b E;
    private boolean H;
    private boolean I;
    private boolean J;
    private e K;
    private x1.b0 L;
    private boolean N;
    private boolean P;
    private boolean Q;
    private int R;
    private boolean S;
    private long T;
    private boolean V;
    private int W;
    private boolean X;
    private boolean Y;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f15198n;

    /* renamed from: o  reason: collision with root package name */
    private final o3.l f15199o;

    /* renamed from: p  reason: collision with root package name */
    private final w1.y f15200p;

    /* renamed from: q  reason: collision with root package name */
    private final o3.g0 f15201q;

    /* renamed from: r  reason: collision with root package name */
    private final b0.a f15202r;

    /* renamed from: s  reason: collision with root package name */
    private final w.a f15203s;

    /* renamed from: t  reason: collision with root package name */
    private final b f15204t;

    /* renamed from: u  reason: collision with root package name */
    private final o3.b f15205u;

    /* renamed from: v  reason: collision with root package name */
    private final String f15206v;

    /* renamed from: w  reason: collision with root package name */
    private final long f15207w;

    /* renamed from: y  reason: collision with root package name */
    private final c0 f15209y;

    /* renamed from: x  reason: collision with root package name */
    private final o3.h0 f15208x = new o3.h0("ProgressiveMediaPeriod");

    /* renamed from: z  reason: collision with root package name */
    private final p3.g f15210z = new p3.g();
    private final Runnable A = new Runnable() { // from class: u2.d0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.U();
        }
    };
    private final Runnable B = new Runnable() { // from class: u2.f0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.R();
        }
    };
    private final Handler C = p3.m0.w();
    private d[] G = new d[0];
    private m0[] F = new m0[0];
    private long U = -9223372036854775807L;
    private long M = -9223372036854775807L;
    private int O = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements h0.e, m.a {

        /* renamed from: b  reason: collision with root package name */
        private final Uri f15212b;

        /* renamed from: c  reason: collision with root package name */
        private final o3.o0 f15213c;

        /* renamed from: d  reason: collision with root package name */
        private final c0 f15214d;

        /* renamed from: e  reason: collision with root package name */
        private final x1.n f15215e;

        /* renamed from: f  reason: collision with root package name */
        private final p3.g f15216f;

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f15218h;

        /* renamed from: j  reason: collision with root package name */
        private long f15220j;

        /* renamed from: l  reason: collision with root package name */
        private x1.e0 f15222l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f15223m;

        /* renamed from: g  reason: collision with root package name */
        private final x1.a0 f15217g = new x1.a0();

        /* renamed from: i  reason: collision with root package name */
        private boolean f15219i = true;

        /* renamed from: a  reason: collision with root package name */
        private final long f15211a = n.a();

        /* renamed from: k  reason: collision with root package name */
        private o3.p f15221k = i(0);

        public a(Uri uri, o3.l lVar, c0 c0Var, x1.n nVar, p3.g gVar) {
            this.f15212b = uri;
            this.f15213c = new o3.o0(lVar);
            this.f15214d = c0Var;
            this.f15215e = nVar;
            this.f15216f = gVar;
        }

        private o3.p i(long j10) {
            return new p.b().i(this.f15212b).h(j10).f(h0.this.f15206v).b(6).e(h0.Z).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f15217g.f16188a = j10;
            this.f15220j = j11;
            this.f15219i = true;
            this.f15223m = false;
        }

        @Override // u2.m.a
        public void a(p3.a0 a0Var) {
            long max = !this.f15223m ? this.f15220j : Math.max(h0.this.N(true), this.f15220j);
            int a10 = a0Var.a();
            x1.e0 e0Var = (x1.e0) p3.a.e(this.f15222l);
            e0Var.d(a0Var, a10);
            e0Var.c(max, 1, a10, 0, null);
            this.f15223m = true;
        }

        @Override // o3.h0.e
        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f15218h) {
                try {
                    long j10 = this.f15217g.f16188a;
                    o3.p i11 = i(j10);
                    this.f15221k = i11;
                    long n10 = this.f15213c.n(i11);
                    if (n10 != -1) {
                        n10 += j10;
                        h0.this.Z();
                    }
                    long j11 = n10;
                    h0.this.E = o2.b.a(this.f15213c.f());
                    o3.i iVar = this.f15213c;
                    if (h0.this.E != null && h0.this.E.f11922s != -1) {
                        iVar = new m(this.f15213c, h0.this.E.f11922s, this);
                        x1.e0 O = h0.this.O();
                        this.f15222l = O;
                        O.e(h0.f15197a0);
                    }
                    long j12 = j10;
                    this.f15214d.d(iVar, this.f15212b, this.f15213c.f(), j10, j11, this.f15215e);
                    if (h0.this.E != null) {
                        this.f15214d.f();
                    }
                    if (this.f15219i) {
                        this.f15214d.b(j12, this.f15220j);
                        this.f15219i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f15218h) {
                            try {
                                this.f15216f.a();
                                i10 = this.f15214d.c(this.f15217g);
                                j12 = this.f15214d.e();
                                if (j12 > h0.this.f15207w + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f15216f.c();
                        h0.this.C.post(h0.this.B);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f15214d.e() != -1) {
                        this.f15217g.f16188a = this.f15214d.e();
                    }
                    o3.o.a(this.f15213c);
                } catch (Throwable th) {
                    if (i10 != 1 && this.f15214d.e() != -1) {
                        this.f15217g.f16188a = this.f15214d.e();
                    }
                    o3.o.a(this.f15213c);
                    throw th;
                }
            }
        }

        @Override // o3.h0.e
        public void c() {
            this.f15218h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void r(long j10, boolean z10, boolean z11);
    }

    /* loaded from: classes.dex */
    private final class c implements n0 {

        /* renamed from: n  reason: collision with root package name */
        private final int f15225n;

        public c(int i10) {
            this.f15225n = i10;
        }

        @Override // u2.n0
        public void b() {
            h0.this.Y(this.f15225n);
        }

        @Override // u2.n0
        public int e(n1 n1Var, v1.g gVar, int i10) {
            return h0.this.e0(this.f15225n, n1Var, gVar, i10);
        }

        @Override // u2.n0
        public boolean i() {
            return h0.this.Q(this.f15225n);
        }

        @Override // u2.n0
        public int t(long j10) {
            return h0.this.i0(this.f15225n, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f15227a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15228b;

        public d(int i10, boolean z10) {
            this.f15227a = i10;
            this.f15228b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15227a == dVar.f15227a && this.f15228b == dVar.f15228b;
        }

        public int hashCode() {
            return (this.f15227a * 31) + (this.f15228b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final v0 f15229a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f15230b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f15231c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f15232d;

        public e(v0 v0Var, boolean[] zArr) {
            this.f15229a = v0Var;
            this.f15230b = zArr;
            int i10 = v0Var.f15375n;
            this.f15231c = new boolean[i10];
            this.f15232d = new boolean[i10];
        }
    }

    public h0(Uri uri, o3.l lVar, c0 c0Var, w1.y yVar, w.a aVar, o3.g0 g0Var, b0.a aVar2, b bVar, o3.b bVar2, String str, int i10) {
        this.f15198n = uri;
        this.f15199o = lVar;
        this.f15200p = yVar;
        this.f15203s = aVar;
        this.f15201q = g0Var;
        this.f15202r = aVar2;
        this.f15204t = bVar;
        this.f15205u = bVar2;
        this.f15206v = str;
        this.f15207w = i10;
        this.f15209y = c0Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void J() {
        p3.a.f(this.I);
        p3.a.e(this.K);
        p3.a.e(this.L);
    }

    private boolean K(a aVar, int i10) {
        x1.b0 b0Var;
        if (this.S || !((b0Var = this.L) == null || b0Var.h() == -9223372036854775807L)) {
            this.W = i10;
            return true;
        }
        if (this.I && !k0()) {
            this.V = true;
            return false;
        }
        this.Q = this.I;
        this.T = 0L;
        this.W = 0;
        for (m0 m0Var : this.F) {
            m0Var.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int M() {
        int i10 = 0;
        for (m0 m0Var : this.F) {
            i10 += m0Var.G();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.F.length; i10++) {
            if (z10 || ((e) p3.a.e(this.K)).f15231c[i10]) {
                j10 = Math.max(j10, this.F[i10].z());
            }
        }
        return j10;
    }

    private boolean P() {
        return this.U != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (this.Y) {
            return;
        }
        ((r.a) p3.a.e(this.D)).o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.S = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.Y || this.I || !this.H || this.L == null) {
            return;
        }
        for (m0 m0Var : this.F) {
            if (m0Var.F() == null) {
                return;
            }
        }
        this.f15210z.c();
        int length = this.F.length;
        t0[] t0VarArr = new t0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            m1 m1Var = (m1) p3.a.e(this.F[i10].F());
            String str = m1Var.f13587y;
            boolean o10 = p3.v.o(str);
            boolean z10 = o10 || p3.v.s(str);
            zArr[i10] = z10;
            this.J = z10 | this.J;
            o2.b bVar = this.E;
            if (bVar != null) {
                if (o10 || this.G[i10].f15228b) {
                    k2.a aVar = m1Var.f13585w;
                    m1Var = m1Var.b().X(aVar == null ? new k2.a(bVar) : aVar.a(bVar)).E();
                }
                if (o10 && m1Var.f13581s == -1 && m1Var.f13582t == -1 && bVar.f11917n != -1) {
                    m1Var = m1Var.b().G(bVar.f11917n).E();
                }
            }
            t0VarArr[i10] = new t0(Integer.toString(i10), m1Var.c(this.f15200p.f(m1Var)));
        }
        this.K = new e(new v0(t0VarArr), zArr);
        this.I = true;
        ((r.a) p3.a.e(this.D)).j(this);
    }

    private void V(int i10) {
        J();
        e eVar = this.K;
        boolean[] zArr = eVar.f15232d;
        if (zArr[i10]) {
            return;
        }
        m1 b10 = eVar.f15229a.b(i10).b(0);
        this.f15202r.i(p3.v.k(b10.f13587y), b10, 0, null, this.T);
        zArr[i10] = true;
    }

    private void W(int i10) {
        J();
        boolean[] zArr = this.K.f15230b;
        if (this.V && zArr[i10]) {
            if (this.F[i10].K(false)) {
                return;
            }
            this.U = 0L;
            this.V = false;
            this.Q = true;
            this.T = 0L;
            this.W = 0;
            for (m0 m0Var : this.F) {
                m0Var.V();
            }
            ((r.a) p3.a.e(this.D)).o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.C.post(new Runnable() { // from class: u2.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.S();
            }
        });
    }

    private x1.e0 d0(d dVar) {
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.G[i10])) {
                return this.F[i10];
            }
        }
        m0 k10 = m0.k(this.f15205u, this.f15200p, this.f15203s);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.G, i11);
        dVarArr[length] = dVar;
        this.G = (d[]) p3.m0.k(dVarArr);
        m0[] m0VarArr = (m0[]) Arrays.copyOf(this.F, i11);
        m0VarArr[length] = k10;
        this.F = (m0[]) p3.m0.k(m0VarArr);
        return k10;
    }

    private boolean g0(boolean[] zArr, long j10) {
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.F[i10].Z(j10, false) && (zArr[i10] || !this.J)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void T(x1.b0 b0Var) {
        this.L = this.E == null ? b0Var : new b0.b(-9223372036854775807L);
        this.M = b0Var.h();
        boolean z10 = !this.S && b0Var.h() == -9223372036854775807L;
        this.N = z10;
        this.O = z10 ? 7 : 1;
        this.f15204t.r(this.M, b0Var.f(), this.N);
        if (this.I) {
            return;
        }
        U();
    }

    private void j0() {
        a aVar = new a(this.f15198n, this.f15199o, this.f15209y, this, this.f15210z);
        if (this.I) {
            p3.a.f(P());
            long j10 = this.M;
            if (j10 != -9223372036854775807L && this.U > j10) {
                this.X = true;
                this.U = -9223372036854775807L;
                return;
            }
            aVar.j(((x1.b0) p3.a.e(this.L)).g(this.U).f16189a.f16195b, this.U);
            for (m0 m0Var : this.F) {
                m0Var.b0(this.U);
            }
            this.U = -9223372036854775807L;
        }
        this.W = M();
        this.f15202r.A(new n(aVar.f15211a, aVar.f15221k, this.f15208x.n(aVar, this, this.f15201q.d(this.O))), 1, -1, null, 0, null, aVar.f15220j, this.M);
    }

    private boolean k0() {
        return this.Q || P();
    }

    x1.e0 O() {
        return d0(new d(0, true));
    }

    boolean Q(int i10) {
        return !k0() && this.F[i10].K(this.X);
    }

    void X() {
        this.f15208x.k(this.f15201q.d(this.O));
    }

    void Y(int i10) {
        this.F[i10].N();
        X();
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.f15208x.j() && this.f15210z.d();
    }

    @Override // o3.h0.b
    /* renamed from: a0 */
    public void j(a aVar, long j10, long j11, boolean z10) {
        o3.o0 o0Var = aVar.f15213c;
        n nVar = new n(aVar.f15211a, aVar.f15221k, o0Var.s(), o0Var.t(), j10, j11, o0Var.r());
        this.f15201q.a(aVar.f15211a);
        this.f15202r.r(nVar, 1, -1, null, 0, null, aVar.f15220j, this.M);
        if (z10) {
            return;
        }
        for (m0 m0Var : this.F) {
            m0Var.V();
        }
        if (this.R > 0) {
            ((r.a) p3.a.e(this.D)).o(this);
        }
    }

    @Override // u2.m0.d
    public void b(m1 m1Var) {
        this.C.post(this.A);
    }

    @Override // o3.h0.b
    /* renamed from: b0 */
    public void o(a aVar, long j10, long j11) {
        x1.b0 b0Var;
        if (this.M == -9223372036854775807L && (b0Var = this.L) != null) {
            boolean f10 = b0Var.f();
            long N = N(true);
            long j12 = N == Long.MIN_VALUE ? 0L : N + 10000;
            this.M = j12;
            this.f15204t.r(j12, f10, this.N);
        }
        o3.o0 o0Var = aVar.f15213c;
        n nVar = new n(aVar.f15211a, aVar.f15221k, o0Var.s(), o0Var.t(), j10, j11, o0Var.r());
        this.f15201q.a(aVar.f15211a);
        this.f15202r.u(nVar, 1, -1, null, 0, null, aVar.f15220j, this.M);
        this.X = true;
        ((r.a) p3.a.e(this.D)).o(this);
    }

    @Override // u2.r, u2.o0
    public long c() {
        return f();
    }

    @Override // o3.h0.b
    /* renamed from: c0 */
    public h0.c u(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        h0.c h10;
        o3.o0 o0Var = aVar.f15213c;
        n nVar = new n(aVar.f15211a, aVar.f15221k, o0Var.s(), o0Var.t(), j10, j11, o0Var.r());
        long b10 = this.f15201q.b(new g0.c(nVar, new q(1, -1, null, 0, null, p3.m0.X0(aVar.f15220j), p3.m0.X0(this.M)), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = o3.h0.f11975g;
        } else {
            int M = M();
            if (M > this.W) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            h10 = K(aVar2, M) ? o3.h0.h(z10, b10) : o3.h0.f11974f;
        }
        boolean z11 = !h10.c();
        this.f15202r.w(nVar, 1, -1, null, 0, null, aVar.f15220j, this.M, iOException, z11);
        if (z11) {
            this.f15201q.a(aVar.f15211a);
        }
        return h10;
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        J();
        if (this.L.f()) {
            b0.a g10 = this.L.g(j10);
            return d3Var.a(j10, g10.f16189a.f16194a, g10.f16190b.f16194a);
        }
        return 0L;
    }

    @Override // x1.n
    public x1.e0 e(int i10, int i11) {
        return d0(new d(i10, false));
    }

    int e0(int i10, n1 n1Var, v1.g gVar, int i11) {
        if (k0()) {
            return -3;
        }
        V(i10);
        int S = this.F[i10].S(n1Var, gVar, i11, this.X);
        if (S == -3) {
            W(i10);
        }
        return S;
    }

    @Override // u2.r, u2.o0
    public long f() {
        long j10;
        J();
        if (this.X || this.R == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.U;
        }
        if (this.J) {
            int length = this.F.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.K;
                if (eVar.f15230b[i10] && eVar.f15231c[i10] && !this.F[i10].J()) {
                    j10 = Math.min(j10, this.F[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = N(false);
        }
        return j10 == Long.MIN_VALUE ? this.T : j10;
    }

    public void f0() {
        if (this.I) {
            for (m0 m0Var : this.F) {
                m0Var.R();
            }
        }
        this.f15208x.m(this);
        this.C.removeCallbacksAndMessages(null);
        this.D = null;
        this.Y = true;
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        if (this.X || this.f15208x.i() || this.V) {
            return false;
        }
        if (this.I && this.R == 0) {
            return false;
        }
        boolean e10 = this.f15210z.e();
        if (this.f15208x.j()) {
            return e10;
        }
        j0();
        return true;
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
    }

    @Override // x1.n
    public void i() {
        this.H = true;
        this.C.post(this.A);
    }

    int i0(int i10, long j10) {
        if (k0()) {
            return 0;
        }
        V(i10);
        m0 m0Var = this.F[i10];
        int E = m0Var.E(j10, this.X);
        m0Var.e0(E);
        if (E == 0) {
            W(i10);
        }
        return E;
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.D = aVar;
        this.f15210z.e();
        j0();
    }

    @Override // o3.h0.f
    public void l() {
        for (m0 m0Var : this.F) {
            m0Var.T();
        }
        this.f15209y.a();
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        J();
        e eVar = this.K;
        v0 v0Var = eVar.f15229a;
        boolean[] zArr3 = eVar.f15231c;
        int i10 = this.R;
        int i11 = 0;
        for (int i12 = 0; i12 < tVarArr.length; i12++) {
            if (n0VarArr[i12] != null && (tVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) n0VarArr[i12]).f15225n;
                p3.a.f(zArr3[i13]);
                this.R--;
                zArr3[i13] = false;
                n0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.P ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < tVarArr.length; i14++) {
            if (n0VarArr[i14] == null && tVarArr[i14] != null) {
                n3.t tVar = tVarArr[i14];
                p3.a.f(tVar.length() == 1);
                p3.a.f(tVar.b(0) == 0);
                int c10 = v0Var.c(tVar.c());
                p3.a.f(!zArr3[c10]);
                this.R++;
                zArr3[c10] = true;
                n0VarArr[i14] = new c(c10);
                zArr2[i14] = true;
                if (!z10) {
                    m0 m0Var = this.F[c10];
                    z10 = (m0Var.Z(j10, true) || m0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.R == 0) {
            this.V = false;
            this.Q = false;
            if (this.f15208x.j()) {
                m0[] m0VarArr = this.F;
                int length = m0VarArr.length;
                while (i11 < length) {
                    m0VarArr[i11].r();
                    i11++;
                }
                this.f15208x.f();
            } else {
                m0[] m0VarArr2 = this.F;
                int length2 = m0VarArr2.length;
                while (i11 < length2) {
                    m0VarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = s(j10);
            while (i11 < n0VarArr.length) {
                if (n0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.P = true;
        return j10;
    }

    @Override // u2.r
    public long n() {
        if (this.Q) {
            if (this.X || M() > this.W) {
                this.Q = false;
                return this.T;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        J();
        return this.K.f15229a;
    }

    @Override // u2.r
    public void q() {
        X();
        if (this.X && !this.I) {
            throw h2.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.K.f15231c;
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.F[i10].q(j10, z10, zArr[i10]);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        J();
        boolean[] zArr = this.K.f15230b;
        if (!this.L.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.Q = false;
        this.T = j10;
        if (P()) {
            this.U = j10;
            return j10;
        } else if (this.O == 7 || !g0(zArr, j10)) {
            this.V = false;
            this.U = j10;
            this.X = false;
            if (this.f15208x.j()) {
                m0[] m0VarArr = this.F;
                int length = m0VarArr.length;
                while (i10 < length) {
                    m0VarArr[i10].r();
                    i10++;
                }
                this.f15208x.f();
            } else {
                this.f15208x.g();
                m0[] m0VarArr2 = this.F;
                int length2 = m0VarArr2.length;
                while (i10 < length2) {
                    m0VarArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        } else {
            return j10;
        }
    }

    @Override // x1.n
    public void t(final x1.b0 b0Var) {
        this.C.post(new Runnable() { // from class: u2.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.T(b0Var);
            }
        });
    }
}
