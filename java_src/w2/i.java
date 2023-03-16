package w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o3.g0;
import o3.h0;
import s1.d3;
import s1.m1;
import s1.n1;
import u2.b0;
import u2.m0;
import u2.n0;
import u2.o0;
import w1.w;
import w1.y;
import w2.j;
/* loaded from: classes.dex */
public class i<T extends j> implements n0, o0, h0.b<f>, h0.f {
    private final m0[] A;
    private final c B;
    private f C;
    private m1 D;
    private b<T> E;
    private long F;
    private long G;
    private int H;
    private w2.a I;
    boolean J;

    /* renamed from: n  reason: collision with root package name */
    public final int f16014n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f16015o;

    /* renamed from: p  reason: collision with root package name */
    private final m1[] f16016p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean[] f16017q;

    /* renamed from: r  reason: collision with root package name */
    private final T f16018r;

    /* renamed from: s  reason: collision with root package name */
    private final o0.a<i<T>> f16019s;

    /* renamed from: t  reason: collision with root package name */
    private final b0.a f16020t;

    /* renamed from: u  reason: collision with root package name */
    private final g0 f16021u;

    /* renamed from: v  reason: collision with root package name */
    private final h0 f16022v;

    /* renamed from: w  reason: collision with root package name */
    private final h f16023w;

    /* renamed from: x  reason: collision with root package name */
    private final ArrayList<w2.a> f16024x;

    /* renamed from: y  reason: collision with root package name */
    private final List<w2.a> f16025y;

    /* renamed from: z  reason: collision with root package name */
    private final m0 f16026z;

    /* loaded from: classes.dex */
    public final class a implements n0 {

        /* renamed from: n  reason: collision with root package name */
        public final i<T> f16027n;

        /* renamed from: o  reason: collision with root package name */
        private final m0 f16028o;

        /* renamed from: p  reason: collision with root package name */
        private final int f16029p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f16030q;

        public a(i<T> iVar, m0 m0Var, int i10) {
            this.f16027n = iVar;
            this.f16028o = m0Var;
            this.f16029p = i10;
        }

        private void a() {
            if (this.f16030q) {
                return;
            }
            i.this.f16020t.i(i.this.f16015o[this.f16029p], i.this.f16016p[this.f16029p], 0, null, i.this.G);
            this.f16030q = true;
        }

        @Override // u2.n0
        public void b() {
        }

        public void c() {
            p3.a.f(i.this.f16017q[this.f16029p]);
            i.this.f16017q[this.f16029p] = false;
        }

        @Override // u2.n0
        public int e(n1 n1Var, v1.g gVar, int i10) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.I == null || i.this.I.i(this.f16029p + 1) > this.f16028o.C()) {
                a();
                return this.f16028o.S(n1Var, gVar, i10, i.this.J);
            }
            return -3;
        }

        @Override // u2.n0
        public boolean i() {
            return !i.this.I() && this.f16028o.K(i.this.J);
        }

        @Override // u2.n0
        public int t(long j10) {
            if (i.this.I()) {
                return 0;
            }
            int E = this.f16028o.E(j10, i.this.J);
            if (i.this.I != null) {
                E = Math.min(E, i.this.I.i(this.f16029p + 1) - this.f16028o.C());
            }
            this.f16028o.e0(E);
            if (E > 0) {
                a();
            }
            return E;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends j> {
        void e(i<T> iVar);
    }

    public i(int i10, int[] iArr, m1[] m1VarArr, T t10, o0.a<i<T>> aVar, o3.b bVar, long j10, y yVar, w.a aVar2, g0 g0Var, b0.a aVar3) {
        this.f16014n = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f16015o = iArr;
        this.f16016p = m1VarArr == null ? new m1[0] : m1VarArr;
        this.f16018r = t10;
        this.f16019s = aVar;
        this.f16020t = aVar3;
        this.f16021u = g0Var;
        this.f16022v = new h0("ChunkSampleStream");
        this.f16023w = new h();
        ArrayList<w2.a> arrayList = new ArrayList<>();
        this.f16024x = arrayList;
        this.f16025y = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.A = new m0[length];
        this.f16017q = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        m0[] m0VarArr = new m0[i12];
        m0 k10 = m0.k(bVar, yVar, aVar2);
        this.f16026z = k10;
        iArr2[0] = i10;
        m0VarArr[0] = k10;
        while (i11 < length) {
            m0 l10 = m0.l(bVar);
            this.A[i11] = l10;
            int i13 = i11 + 1;
            m0VarArr[i13] = l10;
            iArr2[i13] = this.f16015o[i11];
            i11 = i13;
        }
        this.B = new c(iArr2, m0VarArr);
        this.F = j10;
        this.G = j10;
    }

    private void B(int i10) {
        int min = Math.min(O(i10, 0), this.H);
        if (min > 0) {
            p3.m0.L0(this.f16024x, 0, min);
            this.H -= min;
        }
    }

    private void C(int i10) {
        p3.a.f(!this.f16022v.j());
        int size = this.f16024x.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!G(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = F().f16010h;
        w2.a D = D(i10);
        if (this.f16024x.isEmpty()) {
            this.F = this.G;
        }
        this.J = false;
        this.f16020t.D(this.f16014n, D.f16009g, j10);
    }

    private w2.a D(int i10) {
        w2.a aVar = this.f16024x.get(i10);
        ArrayList<w2.a> arrayList = this.f16024x;
        p3.m0.L0(arrayList, i10, arrayList.size());
        this.H = Math.max(this.H, this.f16024x.size());
        m0 m0Var = this.f16026z;
        int i11 = 0;
        while (true) {
            m0Var.u(aVar.i(i11));
            m0[] m0VarArr = this.A;
            if (i11 >= m0VarArr.length) {
                return aVar;
            }
            m0Var = m0VarArr[i11];
            i11++;
        }
    }

    private w2.a F() {
        ArrayList<w2.a> arrayList = this.f16024x;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean G(int i10) {
        int C;
        w2.a aVar = this.f16024x.get(i10);
        if (this.f16026z.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            m0[] m0VarArr = this.A;
            if (i11 >= m0VarArr.length) {
                return false;
            }
            C = m0VarArr[i11].C();
            i11++;
        } while (C <= aVar.i(i11));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof w2.a;
    }

    private void J() {
        int O = O(this.f16026z.C(), this.H - 1);
        while (true) {
            int i10 = this.H;
            if (i10 > O) {
                return;
            }
            this.H = i10 + 1;
            K(i10);
        }
    }

    private void K(int i10) {
        w2.a aVar = this.f16024x.get(i10);
        m1 m1Var = aVar.f16006d;
        if (!m1Var.equals(this.D)) {
            this.f16020t.i(this.f16014n, m1Var, aVar.f16007e, aVar.f16008f, aVar.f16009g);
        }
        this.D = m1Var;
    }

    private int O(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f16024x.size()) {
                return this.f16024x.size() - 1;
            }
        } while (this.f16024x.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void R() {
        this.f16026z.V();
        for (m0 m0Var : this.A) {
            m0Var.V();
        }
    }

    public T E() {
        return this.f16018r;
    }

    boolean I() {
        return this.F != -9223372036854775807L;
    }

    @Override // o3.h0.b
    /* renamed from: L */
    public void j(f fVar, long j10, long j11, boolean z10) {
        this.C = null;
        this.I = null;
        u2.n nVar = new u2.n(fVar.f16003a, fVar.f16004b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f16021u.a(fVar.f16003a);
        this.f16020t.r(nVar, fVar.f16005c, this.f16014n, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
        if (z10) {
            return;
        }
        if (I()) {
            R();
        } else if (H(fVar)) {
            D(this.f16024x.size() - 1);
            if (this.f16024x.isEmpty()) {
                this.F = this.G;
            }
        }
        this.f16019s.o(this);
    }

    @Override // o3.h0.b
    /* renamed from: M */
    public void o(f fVar, long j10, long j11) {
        this.C = null;
        this.f16018r.k(fVar);
        u2.n nVar = new u2.n(fVar.f16003a, fVar.f16004b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f16021u.a(fVar.f16003a);
        this.f16020t.u(nVar, fVar.f16005c, this.f16014n, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
        this.f16019s.o(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // o3.h0.b
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o3.h0.c u(w2.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.i.u(w2.f, long, long, java.io.IOException, int):o3.h0$c");
    }

    public void P() {
        Q(null);
    }

    public void Q(b<T> bVar) {
        this.E = bVar;
        this.f16026z.R();
        for (m0 m0Var : this.A) {
            m0Var.R();
        }
        this.f16022v.m(this);
    }

    public void S(long j10) {
        boolean Z;
        this.G = j10;
        if (I()) {
            this.F = j10;
            return;
        }
        w2.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f16024x.size()) {
                break;
            }
            w2.a aVar2 = this.f16024x.get(i11);
            int i12 = (aVar2.f16009g > j10 ? 1 : (aVar2.f16009g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f15975k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            Z = this.f16026z.Y(aVar.i(0));
        } else {
            Z = this.f16026z.Z(j10, j10 < c());
        }
        if (Z) {
            this.H = O(this.f16026z.C(), 0);
            m0[] m0VarArr = this.A;
            int length = m0VarArr.length;
            while (i10 < length) {
                m0VarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.F = j10;
        this.J = false;
        this.f16024x.clear();
        this.H = 0;
        if (!this.f16022v.j()) {
            this.f16022v.g();
            R();
            return;
        }
        this.f16026z.r();
        m0[] m0VarArr2 = this.A;
        int length2 = m0VarArr2.length;
        while (i10 < length2) {
            m0VarArr2[i10].r();
            i10++;
        }
        this.f16022v.f();
    }

    public i<T>.a T(long j10, int i10) {
        for (int i11 = 0; i11 < this.A.length; i11++) {
            if (this.f16015o[i11] == i10) {
                p3.a.f(!this.f16017q[i11]);
                this.f16017q[i11] = true;
                this.A[i11].Z(j10, true);
                return new a(this, this.A[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // u2.o0
    public boolean a() {
        return this.f16022v.j();
    }

    @Override // u2.n0
    public void b() {
        this.f16022v.b();
        this.f16026z.N();
        if (this.f16022v.j()) {
            return;
        }
        this.f16018r.b();
    }

    @Override // u2.o0
    public long c() {
        if (I()) {
            return this.F;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return F().f16010h;
    }

    public long d(long j10, d3 d3Var) {
        return this.f16018r.d(j10, d3Var);
    }

    @Override // u2.n0
    public int e(n1 n1Var, v1.g gVar, int i10) {
        if (I()) {
            return -3;
        }
        w2.a aVar = this.I;
        if (aVar == null || aVar.i(0) > this.f16026z.C()) {
            J();
            return this.f16026z.S(n1Var, gVar, i10, this.J);
        }
        return -3;
    }

    @Override // u2.o0
    public long f() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.F;
        }
        long j10 = this.G;
        w2.a F = F();
        if (!F.h()) {
            if (this.f16024x.size() > 1) {
                ArrayList<w2.a> arrayList = this.f16024x;
                F = arrayList.get(arrayList.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j10 = Math.max(j10, F.f16010h);
        }
        return Math.max(j10, this.f16026z.z());
    }

    @Override // u2.o0
    public boolean g(long j10) {
        List<w2.a> list;
        long j11;
        if (this.J || this.f16022v.j() || this.f16022v.i()) {
            return false;
        }
        boolean I = I();
        if (I) {
            list = Collections.emptyList();
            j11 = this.F;
        } else {
            list = this.f16025y;
            j11 = F().f16010h;
        }
        this.f16018r.i(j10, j11, list, this.f16023w);
        h hVar = this.f16023w;
        boolean z10 = hVar.f16013b;
        f fVar = hVar.f16012a;
        hVar.a();
        if (z10) {
            this.F = -9223372036854775807L;
            this.J = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.C = fVar;
            if (H(fVar)) {
                w2.a aVar = (w2.a) fVar;
                if (I) {
                    long j12 = aVar.f16009g;
                    long j13 = this.F;
                    if (j12 != j13) {
                        this.f16026z.b0(j13);
                        for (m0 m0Var : this.A) {
                            m0Var.b0(this.F);
                        }
                    }
                    this.F = -9223372036854775807L;
                }
                aVar.k(this.B);
                this.f16024x.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.B);
            }
            this.f16020t.A(new u2.n(fVar.f16003a, fVar.f16004b, this.f16022v.n(fVar, this, this.f16021u.d(fVar.f16005c))), fVar.f16005c, this.f16014n, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
            return true;
        }
    }

    @Override // u2.o0
    public void h(long j10) {
        if (this.f16022v.i() || I()) {
            return;
        }
        if (!this.f16022v.j()) {
            int g10 = this.f16018r.g(j10, this.f16025y);
            if (g10 < this.f16024x.size()) {
                C(g10);
                return;
            }
            return;
        }
        f fVar = (f) p3.a.e(this.C);
        if (!(H(fVar) && G(this.f16024x.size() - 1)) && this.f16018r.e(j10, fVar, this.f16025y)) {
            this.f16022v.f();
            if (H(fVar)) {
                this.I = (w2.a) fVar;
            }
        }
    }

    @Override // u2.n0
    public boolean i() {
        return !I() && this.f16026z.K(this.J);
    }

    @Override // o3.h0.f
    public void l() {
        this.f16026z.T();
        for (m0 m0Var : this.A) {
            m0Var.T();
        }
        this.f16018r.a();
        b<T> bVar = this.E;
        if (bVar != null) {
            bVar.e(this);
        }
    }

    public void r(long j10, boolean z10) {
        if (I()) {
            return;
        }
        int x10 = this.f16026z.x();
        this.f16026z.q(j10, z10, true);
        int x11 = this.f16026z.x();
        if (x11 > x10) {
            long y10 = this.f16026z.y();
            int i10 = 0;
            while (true) {
                m0[] m0VarArr = this.A;
                if (i10 >= m0VarArr.length) {
                    break;
                }
                m0VarArr[i10].q(y10, z10, this.f16017q[i10]);
                i10++;
            }
        }
        B(x11);
    }

    @Override // u2.n0
    public int t(long j10) {
        if (I()) {
            return 0;
        }
        int E = this.f16026z.E(j10, this.J);
        w2.a aVar = this.I;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f16026z.C());
        }
        this.f16026z.e0(E);
        J();
        return E;
    }
}
