package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s1.h;
/* loaded from: classes.dex */
public final class m1 implements h {
    private static final m1 T = new b().E();
    public static final h.a<m1> U = l1.f13535a;
    public final List<byte[]> A;
    public final w1.m B;
    public final long C;
    public final int D;
    public final int E;
    public final float F;
    public final int G;
    public final float H;
    public final byte[] I;
    public final int J;
    public final q3.c K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    private int S;

    /* renamed from: n  reason: collision with root package name */
    public final String f13576n;

    /* renamed from: o  reason: collision with root package name */
    public final String f13577o;

    /* renamed from: p  reason: collision with root package name */
    public final String f13578p;

    /* renamed from: q  reason: collision with root package name */
    public final int f13579q;

    /* renamed from: r  reason: collision with root package name */
    public final int f13580r;

    /* renamed from: s  reason: collision with root package name */
    public final int f13581s;

    /* renamed from: t  reason: collision with root package name */
    public final int f13582t;

    /* renamed from: u  reason: collision with root package name */
    public final int f13583u;

    /* renamed from: v  reason: collision with root package name */
    public final String f13584v;

    /* renamed from: w  reason: collision with root package name */
    public final k2.a f13585w;

    /* renamed from: x  reason: collision with root package name */
    public final String f13586x;

    /* renamed from: y  reason: collision with root package name */
    public final String f13587y;

    /* renamed from: z  reason: collision with root package name */
    public final int f13588z;

    /* loaded from: classes.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* renamed from: a  reason: collision with root package name */
        private String f13589a;

        /* renamed from: b  reason: collision with root package name */
        private String f13590b;

        /* renamed from: c  reason: collision with root package name */
        private String f13591c;

        /* renamed from: d  reason: collision with root package name */
        private int f13592d;

        /* renamed from: e  reason: collision with root package name */
        private int f13593e;

        /* renamed from: f  reason: collision with root package name */
        private int f13594f;

        /* renamed from: g  reason: collision with root package name */
        private int f13595g;

        /* renamed from: h  reason: collision with root package name */
        private String f13596h;

        /* renamed from: i  reason: collision with root package name */
        private k2.a f13597i;

        /* renamed from: j  reason: collision with root package name */
        private String f13598j;

        /* renamed from: k  reason: collision with root package name */
        private String f13599k;

        /* renamed from: l  reason: collision with root package name */
        private int f13600l;

        /* renamed from: m  reason: collision with root package name */
        private List<byte[]> f13601m;

        /* renamed from: n  reason: collision with root package name */
        private w1.m f13602n;

        /* renamed from: o  reason: collision with root package name */
        private long f13603o;

        /* renamed from: p  reason: collision with root package name */
        private int f13604p;

        /* renamed from: q  reason: collision with root package name */
        private int f13605q;

        /* renamed from: r  reason: collision with root package name */
        private float f13606r;

        /* renamed from: s  reason: collision with root package name */
        private int f13607s;

        /* renamed from: t  reason: collision with root package name */
        private float f13608t;

        /* renamed from: u  reason: collision with root package name */
        private byte[] f13609u;

        /* renamed from: v  reason: collision with root package name */
        private int f13610v;

        /* renamed from: w  reason: collision with root package name */
        private q3.c f13611w;

        /* renamed from: x  reason: collision with root package name */
        private int f13612x;

        /* renamed from: y  reason: collision with root package name */
        private int f13613y;

        /* renamed from: z  reason: collision with root package name */
        private int f13614z;

        public b() {
            this.f13594f = -1;
            this.f13595g = -1;
            this.f13600l = -1;
            this.f13603o = Long.MAX_VALUE;
            this.f13604p = -1;
            this.f13605q = -1;
            this.f13606r = -1.0f;
            this.f13608t = 1.0f;
            this.f13610v = -1;
            this.f13612x = -1;
            this.f13613y = -1;
            this.f13614z = -1;
            this.C = -1;
            this.D = 0;
        }

        private b(m1 m1Var) {
            this.f13589a = m1Var.f13576n;
            this.f13590b = m1Var.f13577o;
            this.f13591c = m1Var.f13578p;
            this.f13592d = m1Var.f13579q;
            this.f13593e = m1Var.f13580r;
            this.f13594f = m1Var.f13581s;
            this.f13595g = m1Var.f13582t;
            this.f13596h = m1Var.f13584v;
            this.f13597i = m1Var.f13585w;
            this.f13598j = m1Var.f13586x;
            this.f13599k = m1Var.f13587y;
            this.f13600l = m1Var.f13588z;
            this.f13601m = m1Var.A;
            this.f13602n = m1Var.B;
            this.f13603o = m1Var.C;
            this.f13604p = m1Var.D;
            this.f13605q = m1Var.E;
            this.f13606r = m1Var.F;
            this.f13607s = m1Var.G;
            this.f13608t = m1Var.H;
            this.f13609u = m1Var.I;
            this.f13610v = m1Var.J;
            this.f13611w = m1Var.K;
            this.f13612x = m1Var.L;
            this.f13613y = m1Var.M;
            this.f13614z = m1Var.N;
            this.A = m1Var.O;
            this.B = m1Var.P;
            this.C = m1Var.Q;
            this.D = m1Var.R;
        }

        public m1 E() {
            return new m1(this);
        }

        public b F(int i10) {
            this.C = i10;
            return this;
        }

        public b G(int i10) {
            this.f13594f = i10;
            return this;
        }

        public b H(int i10) {
            this.f13612x = i10;
            return this;
        }

        public b I(String str) {
            this.f13596h = str;
            return this;
        }

        public b J(q3.c cVar) {
            this.f13611w = cVar;
            return this;
        }

        public b K(String str) {
            this.f13598j = str;
            return this;
        }

        public b L(int i10) {
            this.D = i10;
            return this;
        }

        public b M(w1.m mVar) {
            this.f13602n = mVar;
            return this;
        }

        public b N(int i10) {
            this.A = i10;
            return this;
        }

        public b O(int i10) {
            this.B = i10;
            return this;
        }

        public b P(float f10) {
            this.f13606r = f10;
            return this;
        }

        public b Q(int i10) {
            this.f13605q = i10;
            return this;
        }

        public b R(int i10) {
            this.f13589a = Integer.toString(i10);
            return this;
        }

        public b S(String str) {
            this.f13589a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f13601m = list;
            return this;
        }

        public b U(String str) {
            this.f13590b = str;
            return this;
        }

        public b V(String str) {
            this.f13591c = str;
            return this;
        }

        public b W(int i10) {
            this.f13600l = i10;
            return this;
        }

        public b X(k2.a aVar) {
            this.f13597i = aVar;
            return this;
        }

        public b Y(int i10) {
            this.f13614z = i10;
            return this;
        }

        public b Z(int i10) {
            this.f13595g = i10;
            return this;
        }

        public b a0(float f10) {
            this.f13608t = f10;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f13609u = bArr;
            return this;
        }

        public b c0(int i10) {
            this.f13593e = i10;
            return this;
        }

        public b d0(int i10) {
            this.f13607s = i10;
            return this;
        }

        public b e0(String str) {
            this.f13599k = str;
            return this;
        }

        public b f0(int i10) {
            this.f13613y = i10;
            return this;
        }

        public b g0(int i10) {
            this.f13592d = i10;
            return this;
        }

        public b h0(int i10) {
            this.f13610v = i10;
            return this;
        }

        public b i0(long j10) {
            this.f13603o = j10;
            return this;
        }

        public b j0(int i10) {
            this.f13604p = i10;
            return this;
        }
    }

    private m1(b bVar) {
        this.f13576n = bVar.f13589a;
        this.f13577o = bVar.f13590b;
        this.f13578p = p3.m0.C0(bVar.f13591c);
        this.f13579q = bVar.f13592d;
        this.f13580r = bVar.f13593e;
        int i10 = bVar.f13594f;
        this.f13581s = i10;
        int i11 = bVar.f13595g;
        this.f13582t = i11;
        this.f13583u = i11 != -1 ? i11 : i10;
        this.f13584v = bVar.f13596h;
        this.f13585w = bVar.f13597i;
        this.f13586x = bVar.f13598j;
        this.f13587y = bVar.f13599k;
        this.f13588z = bVar.f13600l;
        this.A = bVar.f13601m == null ? Collections.emptyList() : bVar.f13601m;
        w1.m mVar = bVar.f13602n;
        this.B = mVar;
        this.C = bVar.f13603o;
        this.D = bVar.f13604p;
        this.E = bVar.f13605q;
        this.F = bVar.f13606r;
        this.G = bVar.f13607s == -1 ? 0 : bVar.f13607s;
        this.H = bVar.f13608t == -1.0f ? 1.0f : bVar.f13608t;
        this.I = bVar.f13609u;
        this.J = bVar.f13610v;
        this.K = bVar.f13611w;
        this.L = bVar.f13612x;
        this.M = bVar.f13613y;
        this.N = bVar.f13614z;
        this.O = bVar.A == -1 ? 0 : bVar.A;
        this.P = bVar.B != -1 ? bVar.B : 0;
        this.Q = bVar.C;
        this.R = (bVar.D != 0 || mVar == null) ? bVar.D : 1;
    }

    private static <T> T d(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m1 e(Bundle bundle) {
        b bVar = new b();
        p3.c.a(bundle);
        int i10 = 0;
        String string = bundle.getString(h(0));
        m1 m1Var = T;
        bVar.S((String) d(string, m1Var.f13576n)).U((String) d(bundle.getString(h(1)), m1Var.f13577o)).V((String) d(bundle.getString(h(2)), m1Var.f13578p)).g0(bundle.getInt(h(3), m1Var.f13579q)).c0(bundle.getInt(h(4), m1Var.f13580r)).G(bundle.getInt(h(5), m1Var.f13581s)).Z(bundle.getInt(h(6), m1Var.f13582t)).I((String) d(bundle.getString(h(7)), m1Var.f13584v)).X((k2.a) d((k2.a) bundle.getParcelable(h(8)), m1Var.f13585w)).K((String) d(bundle.getString(h(9)), m1Var.f13586x)).e0((String) d(bundle.getString(h(10)), m1Var.f13587y)).W(bundle.getInt(h(11), m1Var.f13588z));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b M = bVar.T(arrayList).M((w1.m) bundle.getParcelable(h(13)));
        String h10 = h(14);
        m1 m1Var2 = T;
        M.i0(bundle.getLong(h10, m1Var2.C)).j0(bundle.getInt(h(15), m1Var2.D)).Q(bundle.getInt(h(16), m1Var2.E)).P(bundle.getFloat(h(17), m1Var2.F)).d0(bundle.getInt(h(18), m1Var2.G)).a0(bundle.getFloat(h(19), m1Var2.H)).b0(bundle.getByteArray(h(20))).h0(bundle.getInt(h(21), m1Var2.J));
        Bundle bundle2 = bundle.getBundle(h(22));
        if (bundle2 != null) {
            bVar.J(q3.c.f12564s.a(bundle2));
        }
        bVar.H(bundle.getInt(h(23), m1Var2.L)).f0(bundle.getInt(h(24), m1Var2.M)).Y(bundle.getInt(h(25), m1Var2.N)).N(bundle.getInt(h(26), m1Var2.O)).O(bundle.getInt(h(27), m1Var2.P)).F(bundle.getInt(h(28), m1Var2.Q)).L(bundle.getInt(h(29), m1Var2.R));
        return bVar.E();
    }

    private static String h(int i10) {
        return Integer.toString(i10, 36);
    }

    private static String i(int i10) {
        return h(12) + "_" + Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public m1 c(int i10) {
        return b().L(i10).E();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        int i11 = this.S;
        if (i11 == 0 || (i10 = m1Var.S) == 0 || i11 == i10) {
            return this.f13579q == m1Var.f13579q && this.f13580r == m1Var.f13580r && this.f13581s == m1Var.f13581s && this.f13582t == m1Var.f13582t && this.f13588z == m1Var.f13588z && this.C == m1Var.C && this.D == m1Var.D && this.E == m1Var.E && this.G == m1Var.G && this.J == m1Var.J && this.L == m1Var.L && this.M == m1Var.M && this.N == m1Var.N && this.O == m1Var.O && this.P == m1Var.P && this.Q == m1Var.Q && this.R == m1Var.R && Float.compare(this.F, m1Var.F) == 0 && Float.compare(this.H, m1Var.H) == 0 && p3.m0.c(this.f13576n, m1Var.f13576n) && p3.m0.c(this.f13577o, m1Var.f13577o) && p3.m0.c(this.f13584v, m1Var.f13584v) && p3.m0.c(this.f13586x, m1Var.f13586x) && p3.m0.c(this.f13587y, m1Var.f13587y) && p3.m0.c(this.f13578p, m1Var.f13578p) && Arrays.equals(this.I, m1Var.I) && p3.m0.c(this.f13585w, m1Var.f13585w) && p3.m0.c(this.K, m1Var.K) && p3.m0.c(this.B, m1Var.B) && g(m1Var);
        }
        return false;
    }

    public int f() {
        int i10;
        int i11 = this.D;
        if (i11 == -1 || (i10 = this.E) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean g(m1 m1Var) {
        if (this.A.size() != m1Var.A.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            if (!Arrays.equals(this.A.get(i10), m1Var.A.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.S == 0) {
            String str = this.f13576n;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13577o;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13578p;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13579q) * 31) + this.f13580r) * 31) + this.f13581s) * 31) + this.f13582t) * 31;
            String str4 = this.f13584v;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            k2.a aVar = this.f13585w;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f13586x;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f13587y;
            this.S = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f13588z) * 31) + ((int) this.C)) * 31) + this.D) * 31) + this.E) * 31) + Float.floatToIntBits(this.F)) * 31) + this.G) * 31) + Float.floatToIntBits(this.H)) * 31) + this.J) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R;
        }
        return this.S;
    }

    public m1 j(m1 m1Var) {
        String str;
        if (this == m1Var) {
            return this;
        }
        int k10 = p3.v.k(this.f13587y);
        String str2 = m1Var.f13576n;
        String str3 = m1Var.f13577o;
        if (str3 == null) {
            str3 = this.f13577o;
        }
        String str4 = this.f13578p;
        if ((k10 == 3 || k10 == 1) && (str = m1Var.f13578p) != null) {
            str4 = str;
        }
        int i10 = this.f13581s;
        if (i10 == -1) {
            i10 = m1Var.f13581s;
        }
        int i11 = this.f13582t;
        if (i11 == -1) {
            i11 = m1Var.f13582t;
        }
        String str5 = this.f13584v;
        if (str5 == null) {
            String L = p3.m0.L(m1Var.f13584v, k10);
            if (p3.m0.R0(L).length == 1) {
                str5 = L;
            }
        }
        k2.a aVar = this.f13585w;
        k2.a b10 = aVar == null ? m1Var.f13585w : aVar.b(m1Var.f13585w);
        float f10 = this.F;
        if (f10 == -1.0f && k10 == 2) {
            f10 = m1Var.F;
        }
        return b().S(str2).U(str3).V(str4).g0(this.f13579q | m1Var.f13579q).c0(this.f13580r | m1Var.f13580r).G(i10).Z(i11).I(str5).X(b10).M(w1.m.d(m1Var.B, this.B)).P(f10).E();
    }

    public String toString() {
        return "Format(" + this.f13576n + ", " + this.f13577o + ", " + this.f13586x + ", " + this.f13587y + ", " + this.f13584v + ", " + this.f13583u + ", " + this.f13578p + ", [" + this.D + ", " + this.E + ", " + this.F + "], [" + this.L + ", " + this.M + "])";
    }
}
