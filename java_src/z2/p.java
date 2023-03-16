package z2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b5.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2.a;
import o3.c0;
import o3.g0;
import o3.h0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.v;
import s1.d3;
import s1.h2;
import s1.m1;
import s1.n1;
import u2.b0;
import u2.m0;
import u2.n0;
import u2.o0;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import x1.d0;
import x1.e0;
import z2.f;
import z2.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements h0.b<w2.f>, h0.f, o0, x1.n, m0.d {

    /* renamed from: l0  reason: collision with root package name */
    private static final Set<Integer> f17257l0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private final ArrayList<i> A;
    private final List<i> B;
    private final Runnable C;
    private final Runnable D;
    private final Handler E;
    private final ArrayList<l> F;
    private final Map<String, w1.m> G;
    private w2.f H;
    private d[] I;
    private Set<Integer> K;
    private SparseIntArray L;
    private e0 M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private m1 S;
    private m1 T;
    private boolean U;
    private v0 V;
    private Set<t0> W;
    private int[] X;
    private int Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean[] f17258a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean[] f17259b0;

    /* renamed from: c0  reason: collision with root package name */
    private long f17260c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f17261d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f17262e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f17263f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f17264g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f17265h0;

    /* renamed from: i0  reason: collision with root package name */
    private long f17266i0;

    /* renamed from: j0  reason: collision with root package name */
    private w1.m f17267j0;

    /* renamed from: k0  reason: collision with root package name */
    private i f17268k0;

    /* renamed from: n  reason: collision with root package name */
    private final String f17269n;

    /* renamed from: o  reason: collision with root package name */
    private final int f17270o;

    /* renamed from: p  reason: collision with root package name */
    private final b f17271p;

    /* renamed from: q  reason: collision with root package name */
    private final f f17272q;

    /* renamed from: r  reason: collision with root package name */
    private final o3.b f17273r;

    /* renamed from: s  reason: collision with root package name */
    private final m1 f17274s;

    /* renamed from: t  reason: collision with root package name */
    private final y f17275t;

    /* renamed from: u  reason: collision with root package name */
    private final w.a f17276u;

    /* renamed from: v  reason: collision with root package name */
    private final g0 f17277v;

    /* renamed from: x  reason: collision with root package name */
    private final b0.a f17279x;

    /* renamed from: y  reason: collision with root package name */
    private final int f17280y;

    /* renamed from: w  reason: collision with root package name */
    private final h0 f17278w = new h0("Loader:HlsSampleStreamWrapper");

    /* renamed from: z  reason: collision with root package name */
    private final f.b f17281z = new f.b();
    private int[] J = new int[0];

    /* loaded from: classes.dex */
    public interface b extends o0.a<p> {
        void b();

        void l(Uri uri);
    }

    /* loaded from: classes.dex */
    private static class c implements e0 {

        /* renamed from: g  reason: collision with root package name */
        private static final m1 f17282g = new m1.b().e0("application/id3").E();

        /* renamed from: h  reason: collision with root package name */
        private static final m1 f17283h = new m1.b().e0("application/x-emsg").E();

        /* renamed from: a  reason: collision with root package name */
        private final m2.b f17284a = new m2.b();

        /* renamed from: b  reason: collision with root package name */
        private final e0 f17285b;

        /* renamed from: c  reason: collision with root package name */
        private final m1 f17286c;

        /* renamed from: d  reason: collision with root package name */
        private m1 f17287d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f17288e;

        /* renamed from: f  reason: collision with root package name */
        private int f17289f;

        public c(e0 e0Var, int i10) {
            m1 m1Var;
            this.f17285b = e0Var;
            if (i10 == 1) {
                m1Var = f17282g;
            } else if (i10 != 3) {
                throw new IllegalArgumentException("Unknown metadataType: " + i10);
            } else {
                m1Var = f17283h;
            }
            this.f17286c = m1Var;
            this.f17288e = new byte[0];
            this.f17289f = 0;
        }

        private boolean g(m2.a aVar) {
            m1 g10 = aVar.g();
            return g10 != null && p3.m0.c(this.f17286c.f13587y, g10.f13587y);
        }

        private void h(int i10) {
            byte[] bArr = this.f17288e;
            if (bArr.length < i10) {
                this.f17288e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private a0 i(int i10, int i11) {
            int i12 = this.f17289f - i11;
            a0 a0Var = new a0(Arrays.copyOfRange(this.f17288e, i12 - i10, i12));
            byte[] bArr = this.f17288e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f17289f = i11;
            return a0Var;
        }

        @Override // x1.e0
        public int a(o3.i iVar, int i10, boolean z10, int i11) {
            h(this.f17289f + i10);
            int b10 = iVar.b(this.f17288e, this.f17289f, i10);
            if (b10 != -1) {
                this.f17289f += b10;
                return b10;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // x1.e0
        public void b(a0 a0Var, int i10, int i11) {
            h(this.f17289f + i10);
            a0Var.j(this.f17288e, this.f17289f, i10);
            this.f17289f += i10;
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            p3.a.e(this.f17287d);
            a0 i13 = i(i11, i12);
            if (!p3.m0.c(this.f17287d.f13587y, this.f17286c.f13587y)) {
                if (!"application/x-emsg".equals(this.f17287d.f13587y)) {
                    p3.r.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f17287d.f13587y);
                    return;
                }
                m2.a c10 = this.f17284a.c(i13);
                if (!g(c10)) {
                    p3.r.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f17286c.f13587y, c10.g()));
                    return;
                }
                i13 = new a0((byte[]) p3.a.e(c10.l()));
            }
            int a10 = i13.a();
            this.f17285b.d(i13, a10);
            this.f17285b.c(j10, i10, a10, i12, aVar);
        }

        @Override // x1.e0
        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(m1 m1Var) {
            this.f17287d = m1Var;
            this.f17285b.e(this.f17286c);
        }

        @Override // x1.e0
        public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends m0 {
        private final Map<String, w1.m> H;
        private w1.m I;

        private d(o3.b bVar, y yVar, w.a aVar, Map<String, w1.m> map) {
            super(bVar, yVar, aVar);
            this.H = map;
        }

        private k2.a h0(k2.a aVar) {
            if (aVar == null) {
                return null;
            }
            int d10 = aVar.d();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= d10) {
                    i11 = -1;
                    break;
                }
                a.b c10 = aVar.c(i11);
                if ((c10 instanceof p2.l) && "com.apple.streaming.transportStreamTimestamp".equals(((p2.l) c10).f12236o)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (d10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[d10 - 1];
            while (i10 < d10) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.c(i10);
                }
                i10++;
            }
            return new k2.a(bVarArr);
        }

        @Override // u2.m0, x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            super.c(j10, i10, i11, i12, aVar);
        }

        public void i0(w1.m mVar) {
            this.I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f17222k);
        }

        @Override // u2.m0
        public m1 w(m1 m1Var) {
            w1.m mVar;
            w1.m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = m1Var.B;
            }
            if (mVar2 != null && (mVar = this.H.get(mVar2.f15939p)) != null) {
                mVar2 = mVar;
            }
            k2.a h02 = h0(m1Var.f13585w);
            if (mVar2 != m1Var.B || h02 != m1Var.f13585w) {
                m1Var = m1Var.b().M(mVar2).X(h02).E();
            }
            return super.w(m1Var);
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map<String, w1.m> map, o3.b bVar2, long j10, m1 m1Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, int i11) {
        this.f17269n = str;
        this.f17270o = i10;
        this.f17271p = bVar;
        this.f17272q = fVar;
        this.G = map;
        this.f17273r = bVar2;
        this.f17274s = m1Var;
        this.f17275t = yVar;
        this.f17276u = aVar;
        this.f17277v = g0Var;
        this.f17279x = aVar2;
        this.f17280y = i11;
        Set<Integer> set = f17257l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new d[0];
        this.f17259b0 = new boolean[0];
        this.f17258a0 = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.A = arrayList;
        this.B = Collections.unmodifiableList(arrayList);
        this.F = new ArrayList<>();
        this.C = new Runnable() { // from class: z2.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.T();
            }
        };
        this.D = new Runnable() { // from class: z2.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.c0();
            }
        };
        this.E = p3.m0.w();
        this.f17260c0 = j10;
        this.f17261d0 = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.A.size(); i11++) {
            if (this.A.get(i11).f17225n) {
                return false;
            }
        }
        i iVar = this.A.get(i10);
        for (int i12 = 0; i12 < this.I.length; i12++) {
            if (this.I[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static x1.k C(int i10, int i11) {
        p3.r.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new x1.k();
    }

    private m0 D(int i10, int i11) {
        int length = this.I.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f17273r, this.f17275t, this.f17276u, this.G);
        dVar.b0(this.f17260c0);
        if (z10) {
            dVar.i0(this.f17267j0);
        }
        dVar.a0(this.f17266i0);
        i iVar = this.f17268k0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.J, i12);
        this.J = copyOf;
        copyOf[length] = i10;
        this.I = (d[]) p3.m0.D0(this.I, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f17259b0, i12);
        this.f17259b0 = copyOf2;
        copyOf2[length] = z10;
        this.Z = copyOf2[length] | this.Z;
        this.K.add(Integer.valueOf(i11));
        this.L.append(i11, length);
        if (M(i11) > M(this.N)) {
            this.O = length;
            this.N = i11;
        }
        this.f17258a0 = Arrays.copyOf(this.f17258a0, i12);
        return dVar;
    }

    private v0 E(t0[] t0VarArr) {
        for (int i10 = 0; i10 < t0VarArr.length; i10++) {
            t0 t0Var = t0VarArr[i10];
            m1[] m1VarArr = new m1[t0Var.f15363n];
            for (int i11 = 0; i11 < t0Var.f15363n; i11++) {
                m1 b10 = t0Var.b(i11);
                m1VarArr[i11] = b10.c(this.f17275t.f(b10));
            }
            t0VarArr[i10] = new t0(t0Var.f15364o, m1VarArr);
        }
        return new v0(t0VarArr);
    }

    private static m1 F(m1 m1Var, m1 m1Var2, boolean z10) {
        String d10;
        String str;
        if (m1Var == null) {
            return m1Var2;
        }
        int k10 = v.k(m1Var2.f13587y);
        if (p3.m0.K(m1Var.f13584v, k10) == 1) {
            d10 = p3.m0.L(m1Var.f13584v, k10);
            str = v.g(d10);
        } else {
            d10 = v.d(m1Var.f13584v, m1Var2.f13587y);
            str = m1Var2.f13587y;
        }
        m1.b I = m1Var2.b().S(m1Var.f13576n).U(m1Var.f13577o).V(m1Var.f13578p).g0(m1Var.f13579q).c0(m1Var.f13580r).G(z10 ? m1Var.f13581s : -1).Z(z10 ? m1Var.f13582t : -1).I(d10);
        if (k10 == 2) {
            I.j0(m1Var.D).Q(m1Var.E).P(m1Var.F);
        }
        if (str != null) {
            I.e0(str);
        }
        int i10 = m1Var.L;
        if (i10 != -1 && k10 == 1) {
            I.H(i10);
        }
        k2.a aVar = m1Var.f13585w;
        if (aVar != null) {
            k2.a aVar2 = m1Var2.f13585w;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            I.X(aVar);
        }
        return I.E();
    }

    private void G(int i10) {
        p3.a.f(!this.f17278w.j());
        while (true) {
            if (i10 >= this.A.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = K().f16010h;
        i H = H(i10);
        if (this.A.isEmpty()) {
            this.f17261d0 = this.f17260c0;
        } else {
            ((i) b5.t.c(this.A)).o();
        }
        this.f17264g0 = false;
        this.f17279x.D(this.N, H.f16009g, j10);
    }

    private i H(int i10) {
        i iVar = this.A.get(i10);
        ArrayList<i> arrayList = this.A;
        p3.m0.L0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.I.length; i11++) {
            this.I[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i10 = iVar.f17222k;
        int length = this.I.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f17258a0[i11] && this.I[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(m1 m1Var, m1 m1Var2) {
        String str = m1Var.f13587y;
        String str2 = m1Var2.f13587y;
        int k10 = v.k(str);
        if (k10 != 3) {
            return k10 == v.k(str2);
        } else if (p3.m0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || m1Var.Q == m1Var2.Q;
        } else {
            return false;
        }
    }

    private i K() {
        ArrayList<i> arrayList = this.A;
        return arrayList.get(arrayList.size() - 1);
    }

    private e0 L(int i10, int i11) {
        p3.a.a(f17257l0.contains(Integer.valueOf(i11)));
        int i12 = this.L.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.K.add(Integer.valueOf(i11))) {
            this.J[i12] = i10;
        }
        return this.J[i12] == i10 ? this.I[i12] : C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    private void N(i iVar) {
        d[] dVarArr;
        this.f17268k0 = iVar;
        this.S = iVar.f16006d;
        this.f17261d0 = -9223372036854775807L;
        this.A.add(iVar);
        q.a D = b5.q.D();
        for (d dVar : this.I) {
            D.a(Integer.valueOf(dVar.G()));
        }
        iVar.n(this, D.h());
        for (d dVar2 : this.I) {
            dVar2.j0(iVar);
            if (iVar.f17225n) {
                dVar2.g0();
            }
        }
    }

    private static boolean O(w2.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        return this.f17261d0 != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void S() {
        int i10 = this.V.f15375n;
        int[] iArr = new int[i10];
        this.X = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.I;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((m1) p3.a.h(dVarArr[i12].F()), this.V.b(i11).b(0))) {
                    this.X[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<l> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (!this.U && this.X == null && this.P) {
            for (d dVar : this.I) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.V != null) {
                S();
                return;
            }
            z();
            l0();
            this.f17271p.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.P = true;
        T();
    }

    private void g0() {
        for (d dVar : this.I) {
            dVar.W(this.f17262e0);
        }
        this.f17262e0 = false;
    }

    private boolean h0(long j10) {
        int length = this.I.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.I[i10].Z(j10, false) && (this.f17259b0[i10] || !this.Z)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void l0() {
        this.Q = true;
    }

    private void q0(n0[] n0VarArr) {
        this.F.clear();
        for (n0 n0Var : n0VarArr) {
            if (n0Var != null) {
                this.F.add((l) n0Var);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void x() {
        p3.a.f(this.Q);
        p3.a.e(this.V);
        p3.a.e(this.W);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void z() {
        m1 m1Var;
        int length = this.I.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((m1) p3.a.h(this.I[i12].F())).f13587y;
            int i13 = v.s(str) ? 2 : v.o(str) ? 1 : v.r(str) ? 3 : -2;
            if (M(i13) > M(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        t0 j10 = this.f17272q.j();
        int i14 = j10.f15363n;
        this.Y = -1;
        this.X = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.X[i15] = i15;
        }
        t0[] t0VarArr = new t0[length];
        int i16 = 0;
        while (i16 < length) {
            m1 m1Var2 = (m1) p3.a.h(this.I[i16].F());
            if (i16 == i11) {
                m1[] m1VarArr = new m1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    m1 b10 = j10.b(i17);
                    if (i10 == 1 && (m1Var = this.f17274s) != null) {
                        b10 = b10.j(m1Var);
                    }
                    m1VarArr[i17] = i14 == 1 ? m1Var2.j(b10) : F(b10, m1Var2, true);
                }
                t0VarArr[i16] = new t0(this.f17269n, m1VarArr);
                this.Y = i16;
            } else {
                m1 m1Var3 = (i10 == 2 && v.o(m1Var2.f13587y)) ? this.f17274s : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f17269n);
                sb.append(":muxed:");
                sb.append(i16 < i11 ? i16 : i16 - 1);
                t0VarArr[i16] = new t0(sb.toString(), F(m1Var3, m1Var2, false));
            }
            i16++;
        }
        this.V = E(t0VarArr);
        p3.a.f(this.W == null);
        this.W = Collections.emptySet();
    }

    public void B() {
        if (this.Q) {
            return;
        }
        g(this.f17260c0);
    }

    public boolean Q(int i10) {
        return !P() && this.I[i10].K(this.f17264g0);
    }

    public boolean R() {
        return this.N == 2;
    }

    public void U() {
        this.f17278w.b();
        this.f17272q.n();
    }

    public void V(int i10) {
        U();
        this.I[i10].N();
    }

    @Override // o3.h0.b
    /* renamed from: W */
    public void j(w2.f fVar, long j10, long j11, boolean z10) {
        this.H = null;
        u2.n nVar = new u2.n(fVar.f16003a, fVar.f16004b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f17277v.a(fVar.f16003a);
        this.f17279x.r(nVar, fVar.f16005c, this.f17270o, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
        if (z10) {
            return;
        }
        if (P() || this.R == 0) {
            g0();
        }
        if (this.R > 0) {
            this.f17271p.o(this);
        }
    }

    @Override // o3.h0.b
    /* renamed from: X */
    public void o(w2.f fVar, long j10, long j11) {
        this.H = null;
        this.f17272q.p(fVar);
        u2.n nVar = new u2.n(fVar.f16003a, fVar.f16004b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f17277v.a(fVar.f16003a);
        this.f17279x.u(nVar, fVar.f16005c, this.f17270o, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
        if (this.Q) {
            this.f17271p.o(this);
        } else {
            g(this.f17260c0);
        }
    }

    @Override // o3.h0.b
    /* renamed from: Y */
    public h0.c u(w2.f fVar, long j10, long j11, IOException iOException, int i10) {
        h0.c h10;
        int i11;
        boolean O = O(fVar);
        if (O && !((i) fVar).q() && (iOException instanceof c0) && ((i11 = ((c0) iOException).f11936q) == 410 || i11 == 404)) {
            return h0.f11972d;
        }
        long a10 = fVar.a();
        u2.n nVar = new u2.n(fVar.f16003a, fVar.f16004b, fVar.f(), fVar.e(), j10, j11, a10);
        g0.c cVar = new g0.c(nVar, new u2.q(fVar.f16005c, this.f17270o, fVar.f16006d, fVar.f16007e, fVar.f16008f, p3.m0.X0(fVar.f16009g), p3.m0.X0(fVar.f16010h)), iOException, i10);
        g0.b c10 = this.f17277v.c(n3.b0.c(this.f17272q.k()), cVar);
        boolean m10 = (c10 == null || c10.f11960a != 2) ? false : this.f17272q.m(fVar, c10.f11961b);
        if (m10) {
            if (O && a10 == 0) {
                ArrayList<i> arrayList = this.A;
                p3.a.f(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.A.isEmpty()) {
                    this.f17261d0 = this.f17260c0;
                } else {
                    ((i) b5.t.c(this.A)).o();
                }
            }
            h10 = h0.f11974f;
        } else {
            long b10 = this.f17277v.b(cVar);
            h10 = b10 != -9223372036854775807L ? h0.h(false, b10) : h0.f11975g;
        }
        h0.c cVar2 = h10;
        boolean z10 = !cVar2.c();
        this.f17279x.w(nVar, fVar.f16005c, this.f17270o, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h, iOException, z10);
        if (z10) {
            this.H = null;
            this.f17277v.a(fVar.f16003a);
        }
        if (m10) {
            if (this.Q) {
                this.f17271p.o(this);
            } else {
                g(this.f17260c0);
            }
        }
        return cVar2;
    }

    public void Z() {
        this.K.clear();
    }

    @Override // u2.o0
    public boolean a() {
        return this.f17278w.j();
    }

    public boolean a0(Uri uri, g0.c cVar, boolean z10) {
        g0.b c10;
        if (this.f17272q.o(uri)) {
            long j10 = (z10 || (c10 = this.f17277v.c(n3.b0.c(this.f17272q.k()), cVar)) == null || c10.f11960a != 2) ? -9223372036854775807L : c10.f11961b;
            return this.f17272q.q(uri, j10) && j10 != -9223372036854775807L;
        }
        return true;
    }

    @Override // u2.m0.d
    public void b(m1 m1Var) {
        this.E.post(this.C);
    }

    public void b0() {
        if (this.A.isEmpty()) {
            return;
        }
        i iVar = (i) b5.t.c(this.A);
        int c10 = this.f17272q.c(iVar);
        if (c10 == 1) {
            iVar.v();
        } else if (c10 == 2 && !this.f17264g0 && this.f17278w.j()) {
            this.f17278w.f();
        }
    }

    @Override // u2.o0
    public long c() {
        if (P()) {
            return this.f17261d0;
        }
        if (this.f17264g0) {
            return Long.MIN_VALUE;
        }
        return K().f16010h;
    }

    public long d(long j10, d3 d3Var) {
        return this.f17272q.b(j10, d3Var);
    }

    public void d0(t0[] t0VarArr, int i10, int... iArr) {
        this.V = E(t0VarArr);
        this.W = new HashSet();
        for (int i11 : iArr) {
            this.W.add(this.V.b(i11));
        }
        this.Y = i10;
        Handler handler = this.E;
        final b bVar = this.f17271p;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: z2.m
            @Override // java.lang.Runnable
            public final void run() {
                p.b.this.b();
            }
        });
        l0();
    }

    @Override // x1.n
    public e0 e(int i10, int i11) {
        e0 e0Var;
        if (!f17257l0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                e0[] e0VarArr = this.I;
                if (i12 >= e0VarArr.length) {
                    e0Var = null;
                    break;
                } else if (this.J[i12] == i10) {
                    e0Var = e0VarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            e0Var = L(i10, i11);
        }
        if (e0Var == null) {
            if (this.f17265h0) {
                return C(i10, i11);
            }
            e0Var = D(i10, i11);
        }
        if (i11 == 5) {
            if (this.M == null) {
                this.M = new c(e0Var, this.f17280y);
            }
            return this.M;
        }
        return e0Var;
    }

    public int e0(int i10, n1 n1Var, v1.g gVar, int i11) {
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.A.isEmpty()) {
            int i13 = 0;
            while (i13 < this.A.size() - 1 && I(this.A.get(i13))) {
                i13++;
            }
            p3.m0.L0(this.A, 0, i13);
            i iVar = this.A.get(0);
            m1 m1Var = iVar.f16006d;
            if (!m1Var.equals(this.T)) {
                this.f17279x.i(this.f17270o, m1Var, iVar.f16007e, iVar.f16008f, iVar.f16009g);
            }
            this.T = m1Var;
        }
        if (this.A.isEmpty() || this.A.get(0).q()) {
            int S = this.I[i10].S(n1Var, gVar, i11, this.f17264g0);
            if (S == -5) {
                m1 m1Var2 = (m1) p3.a.e(n1Var.f13638b);
                if (i10 == this.O) {
                    int Q = this.I[i10].Q();
                    while (i12 < this.A.size() && this.A.get(i12).f17222k != Q) {
                        i12++;
                    }
                    m1Var2 = m1Var2.j(i12 < this.A.size() ? this.A.get(i12).f16006d : (m1) p3.a.e(this.S));
                }
                n1Var.f13638b = m1Var2;
            }
            return S;
        }
        return -3;
    }

    @Override // u2.o0
    public long f() {
        ArrayList<i> arrayList;
        if (this.f17264g0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.f17261d0;
        }
        long j10 = this.f17260c0;
        i K = K();
        if (!K.h()) {
            K = this.A.size() > 1 ? this.A.get(arrayList.size() - 2) : null;
        }
        if (K != null) {
            j10 = Math.max(j10, K.f16010h);
        }
        if (this.P) {
            for (d dVar : this.I) {
                j10 = Math.max(j10, dVar.z());
            }
        }
        return j10;
    }

    public void f0() {
        if (this.Q) {
            for (d dVar : this.I) {
                dVar.R();
            }
        }
        this.f17278w.m(this);
        this.E.removeCallbacksAndMessages(null);
        this.U = true;
        this.F.clear();
    }

    @Override // u2.o0
    public boolean g(long j10) {
        List<i> list;
        long max;
        if (this.f17264g0 || this.f17278w.j() || this.f17278w.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.f17261d0;
            for (d dVar : this.I) {
                dVar.b0(this.f17261d0);
            }
        } else {
            list = this.B;
            i K = K();
            max = K.h() ? K.f16010h : Math.max(this.f17260c0, K.f16009g);
        }
        List<i> list2 = list;
        long j11 = max;
        this.f17281z.a();
        this.f17272q.e(j10, j11, list2, this.Q || !list2.isEmpty(), this.f17281z);
        f.b bVar = this.f17281z;
        boolean z10 = bVar.f17211b;
        w2.f fVar = bVar.f17210a;
        Uri uri = bVar.f17212c;
        if (z10) {
            this.f17261d0 = -9223372036854775807L;
            this.f17264g0 = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f17271p.l(uri);
            }
            return false;
        } else {
            if (O(fVar)) {
                N((i) fVar);
            }
            this.H = fVar;
            this.f17279x.A(new u2.n(fVar.f16003a, fVar.f16004b, this.f17278w.n(fVar, this, this.f17277v.d(fVar.f16005c))), fVar.f16005c, this.f17270o, fVar.f16006d, fVar.f16007e, fVar.f16008f, fVar.f16009g, fVar.f16010h);
            return true;
        }
    }

    @Override // u2.o0
    public void h(long j10) {
        if (this.f17278w.i() || P()) {
            return;
        }
        if (this.f17278w.j()) {
            p3.a.e(this.H);
            if (this.f17272q.v(j10, this.H, this.B)) {
                this.f17278w.f();
                return;
            }
            return;
        }
        int size = this.B.size();
        while (size > 0 && this.f17272q.c(this.B.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.B.size()) {
            G(size);
        }
        int h10 = this.f17272q.h(j10, this.B);
        if (h10 < this.A.size()) {
            G(h10);
        }
    }

    @Override // x1.n
    public void i() {
        this.f17265h0 = true;
        this.E.post(this.D);
    }

    public boolean i0(long j10, boolean z10) {
        this.f17260c0 = j10;
        if (P()) {
            this.f17261d0 = j10;
            return true;
        }
        if (this.P && !z10 && h0(j10)) {
            return false;
        }
        this.f17261d0 = j10;
        this.f17264g0 = false;
        this.A.clear();
        if (this.f17278w.j()) {
            if (this.P) {
                for (d dVar : this.I) {
                    dVar.r();
                }
            }
            this.f17278w.f();
        } else {
            this.f17278w.g();
            g0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(n3.t[] r20, boolean[] r21, u2.n0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.p.j0(n3.t[], boolean[], u2.n0[], boolean[], long, boolean):boolean");
    }

    public void k0(w1.m mVar) {
        if (p3.m0.c(this.f17267j0, mVar)) {
            return;
        }
        this.f17267j0 = mVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.I;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f17259b0[i10]) {
                dVarArr[i10].i0(mVar);
            }
            i10++;
        }
    }

    @Override // o3.h0.f
    public void l() {
        for (d dVar : this.I) {
            dVar.T();
        }
    }

    public void m0(boolean z10) {
        this.f17272q.t(z10);
    }

    public void n0(long j10) {
        if (this.f17266i0 != j10) {
            this.f17266i0 = j10;
            for (d dVar : this.I) {
                dVar.a0(j10);
            }
        }
    }

    public int o0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.I[i10];
        int E = dVar.E(j10, this.f17264g0);
        i iVar = (i) b5.t.d(this.A, null);
        if (iVar != null && !iVar.q()) {
            E = Math.min(E, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    public v0 p() {
        x();
        return this.V;
    }

    public void p0(int i10) {
        x();
        p3.a.e(this.X);
        int i11 = this.X[i10];
        p3.a.f(this.f17258a0[i11]);
        this.f17258a0[i11] = false;
    }

    public void q() {
        U();
        if (this.f17264g0 && !this.Q) {
            throw h2.a("Loading finished before preparation is complete.", null);
        }
    }

    public void r(long j10, boolean z10) {
        if (!this.P || P()) {
            return;
        }
        int length = this.I.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.I[i10].q(j10, z10, this.f17258a0[i10]);
        }
    }

    @Override // x1.n
    public void t(x1.b0 b0Var) {
    }

    public int y(int i10) {
        x();
        p3.a.e(this.X);
        int i11 = this.X[i10];
        if (i11 == -1) {
            return this.W.contains(this.V.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f17258a0;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
