package s1;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import b5.q;
import s1.h;
import s1.u1;
import v2.c;
/* loaded from: classes.dex */
public abstract class l3 implements h {

    /* renamed from: n  reason: collision with root package name */
    public static final l3 f13539n = new a();

    /* renamed from: o  reason: collision with root package name */
    public static final h.a<l3> f13540o = k3.f13527a;

    /* loaded from: classes.dex */
    class a extends l3 {
        a() {
        }

        @Override // s1.l3
        public int f(Object obj) {
            return -1;
        }

        @Override // s1.l3
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.l3
        public int m() {
            return 0;
        }

        @Override // s1.l3
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.l3
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.l3
        public int t() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: u  reason: collision with root package name */
        public static final h.a<b> f13541u = m3.f13634a;

        /* renamed from: n  reason: collision with root package name */
        public Object f13542n;

        /* renamed from: o  reason: collision with root package name */
        public Object f13543o;

        /* renamed from: p  reason: collision with root package name */
        public int f13544p;

        /* renamed from: q  reason: collision with root package name */
        public long f13545q;

        /* renamed from: r  reason: collision with root package name */
        public long f13546r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f13547s;

        /* renamed from: t  reason: collision with root package name */
        private v2.c f13548t = v2.c.f15567t;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            int i10 = bundle.getInt(u(0), 0);
            long j10 = bundle.getLong(u(1), -9223372036854775807L);
            long j11 = bundle.getLong(u(2), 0L);
            boolean z10 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            v2.c a10 = bundle2 != null ? v2.c.f15569v.a(bundle2) : v2.c.f15567t;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, a10, z10);
            return bVar;
        }

        private static String u(int i10) {
            return Integer.toString(i10, 36);
        }

        public int d(int i10) {
            return this.f13548t.c(i10).f15578o;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.f13548t.c(i10);
            if (c10.f15578o != -1) {
                return c10.f15581r[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return p3.m0.c(this.f13542n, bVar.f13542n) && p3.m0.c(this.f13543o, bVar.f13543o) && this.f13544p == bVar.f13544p && this.f13545q == bVar.f13545q && this.f13546r == bVar.f13546r && this.f13547s == bVar.f13547s && p3.m0.c(this.f13548t, bVar.f13548t);
        }

        public int f() {
            return this.f13548t.f15571o;
        }

        public int g(long j10) {
            return this.f13548t.d(j10, this.f13545q);
        }

        public int h(long j10) {
            return this.f13548t.e(j10, this.f13545q);
        }

        public int hashCode() {
            Object obj = this.f13542n;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f13543o;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j10 = this.f13545q;
            long j11 = this.f13546r;
            return ((((((((((hashCode + hashCode2) * 31) + this.f13544p) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f13547s ? 1 : 0)) * 31) + this.f13548t.hashCode();
        }

        public long i(int i10) {
            return this.f13548t.c(i10).f15577n;
        }

        public long j() {
            return this.f13548t.f15572p;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.f13548t.c(i10);
            if (c10.f15578o != -1) {
                return c10.f15580q[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f13548t.c(i10).f15582s;
        }

        public long m() {
            return this.f13545q;
        }

        public int n(int i10) {
            return this.f13548t.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f13548t.c(i10).f(i11);
        }

        public long p() {
            return p3.m0.X0(this.f13546r);
        }

        public long q() {
            return this.f13546r;
        }

        public int r() {
            return this.f13548t.f15574r;
        }

        public boolean s(int i10) {
            return !this.f13548t.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f13548t.c(i10).f15583t;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, v2.c.f15567t, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, v2.c cVar, boolean z10) {
            this.f13542n = obj;
            this.f13543o = obj2;
            this.f13544p = i10;
            this.f13545q = j10;
            this.f13546r = j11;
            this.f13548t = cVar;
            this.f13547s = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l3 {

        /* renamed from: p  reason: collision with root package name */
        private final b5.q<d> f13549p;

        /* renamed from: q  reason: collision with root package name */
        private final b5.q<b> f13550q;

        /* renamed from: r  reason: collision with root package name */
        private final int[] f13551r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f13552s;

        public c(b5.q<d> qVar, b5.q<b> qVar2, int[] iArr) {
            p3.a.a(qVar.size() == iArr.length);
            this.f13549p = qVar;
            this.f13550q = qVar2;
            this.f13551r = iArr;
            this.f13552s = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f13552s[iArr[i10]] = i10;
            }
        }

        @Override // s1.l3
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f13551r[0];
            }
            return 0;
        }

        @Override // s1.l3
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // s1.l3
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            return z10 ? this.f13551r[t() - 1] : t() - 1;
        }

        @Override // s1.l3
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f13551r[this.f13552s[i10] + 1] : i10 + 1;
            } else if (i11 == 2) {
                return e(z10);
            } else {
                return -1;
            }
        }

        @Override // s1.l3
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f13550q.get(i10);
            bVar.w(bVar2.f13542n, bVar2.f13543o, bVar2.f13544p, bVar2.f13545q, bVar2.f13546r, bVar2.f13548t, bVar2.f13547s);
            return bVar;
        }

        @Override // s1.l3
        public int m() {
            return this.f13550q.size();
        }

        @Override // s1.l3
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f13551r[this.f13552s[i10] - 1] : i10 - 1;
            } else if (i11 == 2) {
                return g(z10);
            } else {
                return -1;
            }
        }

        @Override // s1.l3
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // s1.l3
        public d s(int i10, d dVar, long j10) {
            d dVar2 = this.f13549p.get(i10);
            dVar.i(dVar2.f13553n, dVar2.f13555p, dVar2.f13556q, dVar2.f13557r, dVar2.f13558s, dVar2.f13559t, dVar2.f13560u, dVar2.f13561v, dVar2.f13563x, dVar2.f13565z, dVar2.A, dVar2.B, dVar2.C, dVar2.D);
            dVar.f13564y = dVar2.f13564y;
            return dVar;
        }

        @Override // s1.l3
        public int t() {
            return this.f13549p.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h {
        public static final Object E = new Object();
        private static final Object F = new Object();
        private static final u1 G = new u1.c().c("com.google.android.exoplayer2.Timeline").e(Uri.EMPTY).a();
        public static final h.a<d> H = n3.f13640a;
        public long A;
        public int B;
        public int C;
        public long D;
        @Deprecated

        /* renamed from: o  reason: collision with root package name */
        public Object f13554o;

        /* renamed from: q  reason: collision with root package name */
        public Object f13556q;

        /* renamed from: r  reason: collision with root package name */
        public long f13557r;

        /* renamed from: s  reason: collision with root package name */
        public long f13558s;

        /* renamed from: t  reason: collision with root package name */
        public long f13559t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f13560u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f13561v;
        @Deprecated

        /* renamed from: w  reason: collision with root package name */
        public boolean f13562w;

        /* renamed from: x  reason: collision with root package name */
        public u1.g f13563x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f13564y;

        /* renamed from: z  reason: collision with root package name */
        public long f13565z;

        /* renamed from: n  reason: collision with root package name */
        public Object f13553n = E;

        /* renamed from: p  reason: collision with root package name */
        public u1 f13555p = G;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(h(1));
            u1 a10 = bundle2 != null ? u1.f13761w.a(bundle2) : null;
            long j10 = bundle.getLong(h(2), -9223372036854775807L);
            long j11 = bundle.getLong(h(3), -9223372036854775807L);
            long j12 = bundle.getLong(h(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(h(5), false);
            boolean z11 = bundle.getBoolean(h(6), false);
            Bundle bundle3 = bundle.getBundle(h(7));
            u1.g a11 = bundle3 != null ? u1.g.f13816t.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(h(8), false);
            long j13 = bundle.getLong(h(9), 0L);
            long j14 = bundle.getLong(h(10), -9223372036854775807L);
            int i10 = bundle.getInt(h(11), 0);
            int i11 = bundle.getInt(h(12), 0);
            long j15 = bundle.getLong(h(13), 0L);
            d dVar = new d();
            dVar.i(F, a10, null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            dVar.f13564y = z12;
            return dVar;
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return p3.m0.a0(this.f13559t);
        }

        public long d() {
            return p3.m0.X0(this.f13565z);
        }

        public long e() {
            return this.f13565z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return p3.m0.c(this.f13553n, dVar.f13553n) && p3.m0.c(this.f13555p, dVar.f13555p) && p3.m0.c(this.f13556q, dVar.f13556q) && p3.m0.c(this.f13563x, dVar.f13563x) && this.f13557r == dVar.f13557r && this.f13558s == dVar.f13558s && this.f13559t == dVar.f13559t && this.f13560u == dVar.f13560u && this.f13561v == dVar.f13561v && this.f13564y == dVar.f13564y && this.f13565z == dVar.f13565z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C && this.D == dVar.D;
        }

        public long f() {
            return p3.m0.X0(this.A);
        }

        public boolean g() {
            p3.a.f(this.f13562w == (this.f13563x != null));
            return this.f13563x != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f13553n.hashCode()) * 31) + this.f13555p.hashCode()) * 31;
            Object obj = this.f13556q;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            u1.g gVar = this.f13563x;
            int hashCode3 = gVar != null ? gVar.hashCode() : 0;
            long j10 = this.f13557r;
            long j11 = this.f13558s;
            long j12 = this.f13559t;
            long j13 = this.f13565z;
            long j14 = this.A;
            long j15 = this.D;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f13560u ? 1 : 0)) * 31) + (this.f13561v ? 1 : 0)) * 31) + (this.f13564y ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.B) * 31) + this.C) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public d i(Object obj, u1 u1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, u1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            u1.h hVar;
            this.f13553n = obj;
            this.f13555p = u1Var != null ? u1Var : G;
            this.f13554o = (u1Var == null || (hVar = u1Var.f13763o) == null) ? null : hVar.f13835i;
            this.f13556q = obj2;
            this.f13557r = j10;
            this.f13558s = j11;
            this.f13559t = j12;
            this.f13560u = z10;
            this.f13561v = z11;
            this.f13562w = gVar != null;
            this.f13563x = gVar;
            this.f13565z = j13;
            this.A = j14;
            this.B = i10;
            this.C = i11;
            this.D = j15;
            this.f13564y = false;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l3 b(Bundle bundle) {
        b5.q c10 = c(d.H, p3.b.a(bundle, w(0)));
        b5.q c11 = c(b.f13541u, p3.b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    private static <T extends h> b5.q<T> c(h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return b5.q.J();
        }
        q.a aVar2 = new q.a();
        b5.q<Bundle> a10 = g.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.h();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    private static String w(int i10) {
        return Integer.toString(i10, 36);
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3) {
            l3 l3Var = (l3) obj;
            if (l3Var.t() == t() && l3Var.m() == m()) {
                d dVar = new d();
                b bVar = new b();
                d dVar2 = new d();
                b bVar2 = new b();
                for (int i10 = 0; i10 < t(); i10++) {
                    if (!r(i10, dVar).equals(l3Var.r(i10, dVar2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < m(); i11++) {
                    if (!k(i11, bVar, true).equals(l3Var.k(i11, bVar2, true))) {
                        return false;
                    }
                }
                int e10 = e(true);
                if (e10 == l3Var.e(true) && (g10 = g(true)) == l3Var.g(true)) {
                    while (e10 != g10) {
                        int i12 = i(e10, 0, true);
                        if (i12 != l3Var.i(e10, 0, true)) {
                            return false;
                        }
                        e10 = i12;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f13544p;
        if (r(i12, dVar).C == i10) {
            int i13 = i(i12, i11, z10);
            if (i13 == -1) {
                return -1;
            }
            return r(i13, dVar).B;
        }
        return i10 + 1;
    }

    public int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        int i11 = 0;
        while (true) {
            i10 = t10 * 31;
            if (i11 >= t()) {
                break;
            }
            t10 = i10 + r(i11, dVar).hashCode();
            i11++;
        }
        int m10 = i10 + m();
        for (int i12 = 0; i12 < m(); i12++) {
            m10 = (m10 * 31) + k(i12, bVar, true).hashCode();
        }
        int e10 = e(true);
        while (e10 != -1) {
            m10 = (m10 * 31) + e10;
            e10 = i(e10, 0, true);
        }
        return m10;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == g(z10) ? e(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) p3.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        p3.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.B;
        j(i11, bVar);
        while (i11 < dVar.C && bVar.f13546r != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f13546r > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.f13546r;
        long j13 = bVar.f13545q;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(p3.a.e(bVar.f13543o), Long.valueOf(Math.max(0L, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == e(z10) ? g(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}
