package n3;

import b5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.t;
import p3.m0;
import s1.l3;
import s1.m1;
import u2.t0;
import u2.u;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final o3.f f11571h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11572i;

    /* renamed from: j  reason: collision with root package name */
    private final long f11573j;

    /* renamed from: k  reason: collision with root package name */
    private final long f11574k;

    /* renamed from: l  reason: collision with root package name */
    private final int f11575l;

    /* renamed from: m  reason: collision with root package name */
    private final int f11576m;

    /* renamed from: n  reason: collision with root package name */
    private final float f11577n;

    /* renamed from: o  reason: collision with root package name */
    private final float f11578o;

    /* renamed from: p  reason: collision with root package name */
    private final b5.q<C0170a> f11579p;

    /* renamed from: q  reason: collision with root package name */
    private final p3.d f11580q;

    /* renamed from: r  reason: collision with root package name */
    private float f11581r;

    /* renamed from: s  reason: collision with root package name */
    private int f11582s;

    /* renamed from: t  reason: collision with root package name */
    private int f11583t;

    /* renamed from: u  reason: collision with root package name */
    private long f11584u;

    /* renamed from: v  reason: collision with root package name */
    private w2.n f11585v;

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0170a {

        /* renamed from: a  reason: collision with root package name */
        public final long f11586a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11587b;

        public C0170a(long j10, long j11) {
            this.f11586a = j10;
            this.f11587b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0170a) {
                C0170a c0170a = (C0170a) obj;
                return this.f11586a == c0170a.f11586a && this.f11587b == c0170a.f11587b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f11586a) * 31) + ((int) this.f11587b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements t.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f11588a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11589b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11590c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11591d;

        /* renamed from: e  reason: collision with root package name */
        private final int f11592e;

        /* renamed from: f  reason: collision with root package name */
        private final float f11593f;

        /* renamed from: g  reason: collision with root package name */
        private final float f11594g;

        /* renamed from: h  reason: collision with root package name */
        private final p3.d f11595h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, p3.d.f12253a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, p3.d dVar) {
            this.f11588a = i10;
            this.f11589b = i11;
            this.f11590c = i12;
            this.f11591d = i13;
            this.f11592e = i14;
            this.f11593f = f10;
            this.f11594g = f11;
            this.f11595h = dVar;
        }

        @Override // n3.t.b
        public final t[] a(t.a[] aVarArr, o3.f fVar, u.b bVar, l3 l3Var) {
            b5.q B = a.B(aVarArr);
            t[] tVarArr = new t[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                t.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f11729b;
                    if (iArr.length != 0) {
                        tVarArr[i10] = iArr.length == 1 ? new u(aVar.f11728a, iArr[0], aVar.f11730c) : b(aVar.f11728a, iArr, aVar.f11730c, fVar, (b5.q) B.get(i10));
                    }
                }
            }
            return tVarArr;
        }

        protected a b(t0 t0Var, int[] iArr, int i10, o3.f fVar, b5.q<C0170a> qVar) {
            return new a(t0Var, iArr, i10, fVar, this.f11588a, this.f11589b, this.f11590c, this.f11591d, this.f11592e, this.f11593f, this.f11594g, qVar, this.f11595h);
        }
    }

    protected a(t0 t0Var, int[] iArr, int i10, o3.f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0170a> list, p3.d dVar) {
        super(t0Var, iArr, i10);
        o3.f fVar2;
        long j13;
        if (j12 < j10) {
            p3.r.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j13 = j10;
        } else {
            fVar2 = fVar;
            j13 = j12;
        }
        this.f11571h = fVar2;
        this.f11572i = j10 * 1000;
        this.f11573j = j11 * 1000;
        this.f11574k = j13 * 1000;
        this.f11575l = i11;
        this.f11576m = i12;
        this.f11577n = f10;
        this.f11578o = f11;
        this.f11579p = b5.q.F(list);
        this.f11580q = dVar;
        this.f11581r = 1.0f;
        this.f11583t = 0;
        this.f11584u = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f11637b; i11++) {
            if (j10 == Long.MIN_VALUE || !i(i11, j10)) {
                m1 a10 = a(i11);
                if (z(a10, a10.f13583u, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b5.q<b5.q<C0170a>> B(t.a[] aVarArr) {
        q.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f11729b.length <= 1) {
                aVar = null;
            } else {
                aVar = b5.q.D();
                aVar.a(new C0170a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i11 = 0; i11 < G.length; i11++) {
            jArr[i11] = G[i11].length == 0 ? 0L : G[i11][0];
        }
        y(arrayList, jArr);
        b5.q<Integer> H = H(G);
        for (int i12 = 0; i12 < H.size(); i12++) {
            int intValue = H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = G[intValue][i13];
            y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        y(arrayList, jArr);
        q.a D = b5.q.D();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            q.a aVar2 = (q.a) arrayList.get(i15);
            D.a(aVar2 == null ? b5.q.J() : aVar2.h());
        }
        return D.h();
    }

    private long C(long j10) {
        long j11;
        long I = I(j10);
        if (this.f11579p.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f11579p.size() - 1 && this.f11579p.get(i10).f11586a < I) {
            i10++;
        }
        C0170a c0170a = this.f11579p.get(i10 - 1);
        C0170a c0170a2 = this.f11579p.get(i10);
        long j12 = c0170a.f11586a;
        return c0170a.f11587b + ((((float) (I - j12)) / ((float) (c0170a2.f11586a - j12))) * ((float) (c0170a2.f11587b - j11)));
    }

    private long D(List<? extends w2.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        w2.n nVar = (w2.n) b5.t.c(list);
        long j10 = nVar.f16009g;
        if (j10 != -9223372036854775807L) {
            long j11 = nVar.f16010h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private long F(w2.o[] oVarArr, List<? extends w2.n> list) {
        int i10 = this.f11582s;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            w2.o oVar = oVarArr[this.f11582s];
            return oVar.a() - oVar.b();
        }
        for (w2.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.a() - oVar2.b();
            }
        }
        return D(list);
    }

    private static long[][] G(t.a[] aVarArr) {
        int[] iArr;
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            t.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f11729b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= aVar.f11729b.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f11728a.b(iArr[i11]).f13583u;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static b5.q<Integer> H(long[][] jArr) {
        b5.z c10 = b5.b0.a().a().c();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    c10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return b5.q.F(c10.values());
    }

    private long I(long j10) {
        long f10;
        long g10 = ((float) this.f11571h.g()) * this.f11577n;
        if (this.f11571h.f() == -9223372036854775807L || j10 == -9223372036854775807L) {
            return ((float) g10) / this.f11581r;
        }
        float f11 = (float) j10;
        return (((float) g10) * Math.max((f11 / this.f11581r) - ((float) f10), 0.0f)) / f11;
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f11572i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f11578o, this.f11572i);
    }

    private static void y(List<q.a<C0170a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            q.a<C0170a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0170a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f11574k;
    }

    protected boolean K(long j10, List<? extends w2.n> list) {
        long j11 = this.f11584u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((w2.n) b5.t.c(list)).equals(this.f11585v));
    }

    @Override // n3.c, n3.t
    public void g() {
        this.f11585v = null;
    }

    @Override // n3.c, n3.t
    public void k() {
        this.f11584u = -9223372036854775807L;
        this.f11585v = null;
    }

    @Override // n3.c, n3.t
    public int l(long j10, List<? extends w2.n> list) {
        int i10;
        int i11;
        long b10 = this.f11580q.b();
        if (K(b10, list)) {
            this.f11584u = b10;
            this.f11585v = list.isEmpty() ? null : (w2.n) b5.t.c(list);
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            long e02 = m0.e0(list.get(size - 1).f16009g - j10, this.f11581r);
            long E = E();
            if (e02 < E) {
                return size;
            }
            m1 a10 = a(A(b10, D(list)));
            for (int i12 = 0; i12 < size; i12++) {
                w2.n nVar = list.get(i12);
                m1 m1Var = nVar.f16006d;
                if (m0.e0(nVar.f16009g - j10, this.f11581r) >= E && m1Var.f13583u < a10.f13583u && (i10 = m1Var.E) != -1 && i10 <= this.f11576m && (i11 = m1Var.D) != -1 && i11 <= this.f11575l && i10 < a10.E) {
                    return i12;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // n3.t
    public int p() {
        return this.f11583t;
    }

    @Override // n3.t
    public int q() {
        return this.f11582s;
    }

    @Override // n3.t
    public void r(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr) {
        long b10 = this.f11580q.b();
        long F = F(oVarArr, list);
        int i10 = this.f11583t;
        if (i10 == 0) {
            this.f11583t = 1;
            this.f11582s = A(b10, F);
            return;
        }
        int i11 = this.f11582s;
        int d10 = list.isEmpty() ? -1 : d(((w2.n) b5.t.c(list)).f16006d);
        if (d10 != -1) {
            i10 = ((w2.n) b5.t.c(list)).f16007e;
            i11 = d10;
        }
        int A = A(b10, F);
        if (!i(i11, b10)) {
            m1 a10 = a(i11);
            m1 a11 = a(A);
            long J = J(j12, F);
            int i12 = a11.f13583u;
            int i13 = a10.f13583u;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f11573j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f11583t = i10;
        this.f11582s = A;
    }

    @Override // n3.c, n3.t
    public void s(float f10) {
        this.f11581r = f10;
    }

    @Override // n3.t
    public Object t() {
        return null;
    }

    protected boolean z(m1 m1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
