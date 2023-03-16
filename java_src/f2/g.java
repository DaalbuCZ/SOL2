package f2;

import android.util.Pair;
import android.util.SparseArray;
import f2.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p3.a0;
import p3.i0;
import p3.m0;
import p3.w;
import s1.h2;
import s1.m1;
import w1.m;
import x1.b0;
import x1.e0;
import x1.x;
/* loaded from: classes.dex */
public class g implements x1.l {
    public static final x1.r I = f.f7041b;
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final m1 K = new m1.b().e0("application/x-emsg").E();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private x1.n E;
    private e0[] F;
    private e0[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f7042a;

    /* renamed from: b  reason: collision with root package name */
    private final o f7043b;

    /* renamed from: c  reason: collision with root package name */
    private final List<m1> f7044c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<b> f7045d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f7046e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f7047f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f7048g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f7049h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f7050i;

    /* renamed from: j  reason: collision with root package name */
    private final i0 f7051j;

    /* renamed from: k  reason: collision with root package name */
    private final m2.c f7052k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f7053l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<a.C0104a> f7054m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f7055n;

    /* renamed from: o  reason: collision with root package name */
    private final e0 f7056o;

    /* renamed from: p  reason: collision with root package name */
    private int f7057p;

    /* renamed from: q  reason: collision with root package name */
    private int f7058q;

    /* renamed from: r  reason: collision with root package name */
    private long f7059r;

    /* renamed from: s  reason: collision with root package name */
    private int f7060s;

    /* renamed from: t  reason: collision with root package name */
    private a0 f7061t;

    /* renamed from: u  reason: collision with root package name */
    private long f7062u;

    /* renamed from: v  reason: collision with root package name */
    private int f7063v;

    /* renamed from: w  reason: collision with root package name */
    private long f7064w;

    /* renamed from: x  reason: collision with root package name */
    private long f7065x;

    /* renamed from: y  reason: collision with root package name */
    private long f7066y;

    /* renamed from: z  reason: collision with root package name */
    private b f7067z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f7068a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7069b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7070c;

        public a(long j10, boolean z10, int i10) {
            this.f7068a = j10;
            this.f7069b = z10;
            this.f7070c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f7071a;

        /* renamed from: d  reason: collision with root package name */
        public r f7074d;

        /* renamed from: e  reason: collision with root package name */
        public c f7075e;

        /* renamed from: f  reason: collision with root package name */
        public int f7076f;

        /* renamed from: g  reason: collision with root package name */
        public int f7077g;

        /* renamed from: h  reason: collision with root package name */
        public int f7078h;

        /* renamed from: i  reason: collision with root package name */
        public int f7079i;

        /* renamed from: l  reason: collision with root package name */
        private boolean f7082l;

        /* renamed from: b  reason: collision with root package name */
        public final q f7072b = new q();

        /* renamed from: c  reason: collision with root package name */
        public final a0 f7073c = new a0();

        /* renamed from: j  reason: collision with root package name */
        private final a0 f7080j = new a0(1);

        /* renamed from: k  reason: collision with root package name */
        private final a0 f7081k = new a0();

        public b(e0 e0Var, r rVar, c cVar) {
            this.f7071a = e0Var;
            this.f7074d = rVar;
            this.f7075e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10 = !this.f7082l ? this.f7074d.f7168g[this.f7076f] : this.f7072b.f7154k[this.f7076f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f7082l ? this.f7074d.f7164c[this.f7076f] : this.f7072b.f7150g[this.f7078h];
        }

        public long e() {
            return !this.f7082l ? this.f7074d.f7167f[this.f7076f] : this.f7072b.c(this.f7076f);
        }

        public int f() {
            return !this.f7082l ? this.f7074d.f7165d[this.f7076f] : this.f7072b.f7152i[this.f7076f];
        }

        public p g() {
            if (this.f7082l) {
                int i10 = ((c) m0.j(this.f7072b.f7144a)).f7030a;
                p pVar = this.f7072b.f7157n;
                if (pVar == null) {
                    pVar = this.f7074d.f7162a.a(i10);
                }
                if (pVar == null || !pVar.f7139a) {
                    return null;
                }
                return pVar;
            }
            return null;
        }

        public boolean h() {
            this.f7076f++;
            if (this.f7082l) {
                int i10 = this.f7077g + 1;
                this.f7077g = i10;
                int[] iArr = this.f7072b.f7151h;
                int i11 = this.f7078h;
                if (i10 == iArr[i11]) {
                    this.f7078h = i11 + 1;
                    this.f7077g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int i(int i10, int i11) {
            a0 a0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f7142d;
            if (i12 != 0) {
                a0Var = this.f7072b.f7158o;
            } else {
                byte[] bArr = (byte[]) m0.j(g10.f7143e);
                this.f7081k.M(bArr, bArr.length);
                a0 a0Var2 = this.f7081k;
                i12 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g11 = this.f7072b.g(this.f7076f);
            boolean z10 = g11 || i11 != 0;
            this.f7080j.d()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f7080j.O(0);
            this.f7071a.b(this.f7080j, 1, 1);
            this.f7071a.b(a0Var, i12, 1);
            if (z10) {
                if (!g11) {
                    this.f7073c.K(8);
                    byte[] d10 = this.f7073c.d();
                    d10[0] = 0;
                    d10[1] = 1;
                    d10[2] = (byte) ((i11 >> 8) & 255);
                    d10[3] = (byte) (i11 & 255);
                    d10[4] = (byte) ((i10 >> 24) & 255);
                    d10[5] = (byte) ((i10 >> 16) & 255);
                    d10[6] = (byte) ((i10 >> 8) & 255);
                    d10[7] = (byte) (i10 & 255);
                    this.f7071a.b(this.f7073c, 8, 1);
                    return i12 + 1 + 8;
                }
                a0 a0Var3 = this.f7072b.f7158o;
                int I = a0Var3.I();
                a0Var3.P(-2);
                int i13 = (I * 6) + 2;
                if (i11 != 0) {
                    this.f7073c.K(i13);
                    byte[] d11 = this.f7073c.d();
                    a0Var3.j(d11, 0, i13);
                    int i14 = (((d11[2] & 255) << 8) | (d11[3] & 255)) + i11;
                    d11[2] = (byte) ((i14 >> 8) & 255);
                    d11[3] = (byte) (i14 & 255);
                    a0Var3 = this.f7073c;
                }
                this.f7071a.b(a0Var3, i13, 1);
                return i12 + 1 + i13;
            }
            return i12 + 1;
        }

        public void j(r rVar, c cVar) {
            this.f7074d = rVar;
            this.f7075e = cVar;
            this.f7071a.e(rVar.f7162a.f7133f);
            k();
        }

        public void k() {
            this.f7072b.f();
            this.f7076f = 0;
            this.f7078h = 0;
            this.f7077g = 0;
            this.f7079i = 0;
            this.f7082l = false;
        }

        public void l(long j10) {
            int i10 = this.f7076f;
            while (true) {
                q qVar = this.f7072b;
                if (i10 >= qVar.f7149f || qVar.c(i10) >= j10) {
                    return;
                }
                if (this.f7072b.f7154k[i10]) {
                    this.f7079i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p g10 = g();
            if (g10 == null) {
                return;
            }
            a0 a0Var = this.f7072b.f7158o;
            int i10 = g10.f7142d;
            if (i10 != 0) {
                a0Var.P(i10);
            }
            if (this.f7072b.g(this.f7076f)) {
                a0Var.P(a0Var.I() * 6);
            }
        }

        public void n(w1.m mVar) {
            p a10 = this.f7074d.f7162a.a(((c) m0.j(this.f7072b.f7144a)).f7030a);
            this.f7071a.e(this.f7074d.f7162a.f7133f.b().M(mVar.c(a10 != null ? a10.f7140b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, i0 i0Var) {
        this(i10, i0Var, null, Collections.emptyList());
    }

    public g(int i10, i0 i0Var, o oVar) {
        this(i10, i0Var, oVar, Collections.emptyList());
    }

    public g(int i10, i0 i0Var, o oVar, List<m1> list) {
        this(i10, i0Var, oVar, list, null);
    }

    public g(int i10, i0 i0Var, o oVar, List<m1> list, e0 e0Var) {
        this.f7042a = i10;
        this.f7051j = i0Var;
        this.f7043b = oVar;
        this.f7044c = Collections.unmodifiableList(list);
        this.f7056o = e0Var;
        this.f7052k = new m2.c();
        this.f7053l = new a0(16);
        this.f7046e = new a0(w.f12350a);
        this.f7047f = new a0(5);
        this.f7048g = new a0();
        byte[] bArr = new byte[16];
        this.f7049h = bArr;
        this.f7050i = new a0(bArr);
        this.f7054m = new ArrayDeque<>();
        this.f7055n = new ArrayDeque<>();
        this.f7045d = new SparseArray<>();
        this.f7065x = -9223372036854775807L;
        this.f7064w = -9223372036854775807L;
        this.f7066y = -9223372036854775807L;
        this.E = x1.n.f16274m;
        this.F = new e0[0];
        this.G = new e0[0];
    }

    private static void A(a0 a0Var, q qVar) {
        z(a0Var, 0, qVar);
    }

    private static Pair<Long, x1.d> B(a0 a0Var, long j10) {
        long H;
        long H2;
        int[] iArr;
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        a0Var.P(4);
        long E = a0Var.E();
        if (c10 == 0) {
            H = a0Var.E();
            H2 = a0Var.E();
        } else {
            H = a0Var.H();
            H2 = a0Var.H();
        }
        long j11 = H;
        long j12 = j10 + H2;
        long M0 = m0.M0(j11, 1000000L, E);
        a0Var.P(2);
        int I2 = a0Var.I();
        int[] iArr2 = new int[I2];
        long[] jArr = new long[I2];
        long[] jArr2 = new long[I2];
        long[] jArr3 = new long[I2];
        long j13 = M0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < I2) {
            int m10 = a0Var.m();
            if ((m10 & Integer.MIN_VALUE) != 0) {
                throw h2.a("Unhandled indirect reference", null);
            }
            long E2 = a0Var.E();
            iArr2[i10] = m10 & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + E2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = I2;
            long M02 = m0.M0(j15, 1000000L, E);
            jArr4[i10] = M02 - jArr5[i10];
            a0Var.P(4);
            j12 += iArr[i10];
            i10++;
            iArr2 = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            I2 = i11;
            j14 = j15;
            j13 = M02;
        }
        return Pair.create(Long.valueOf(M0), new x1.d(iArr2, jArr, jArr2, jArr3));
    }

    private static long C(a0 a0Var) {
        a0Var.O(8);
        return f2.a.c(a0Var.m()) == 1 ? a0Var.H() : a0Var.E();
    }

    private static b D(a0 a0Var, SparseArray<b> sparseArray, boolean z10) {
        a0Var.O(8);
        int b10 = f2.a.b(a0Var.m());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.m());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long H = a0Var.H();
            q qVar = valueAt.f7072b;
            qVar.f7146c = H;
            qVar.f7147d = H;
        }
        c cVar = valueAt.f7075e;
        valueAt.f7072b.f7144a = new c((b10 & 2) != 0 ? a0Var.m() - 1 : cVar.f7030a, (b10 & 8) != 0 ? a0Var.m() : cVar.f7031b, (b10 & 16) != 0 ? a0Var.m() : cVar.f7032c, (b10 & 32) != 0 ? a0Var.m() : cVar.f7033d);
        return valueAt;
    }

    private static void E(a.C0104a c0104a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b D = D(((a.b) p3.a.e(c0104a.g(1952868452))).f7000b, sparseArray, z10);
        if (D == null) {
            return;
        }
        q qVar = D.f7072b;
        long j10 = qVar.f7160q;
        boolean z11 = qVar.f7161r;
        D.k();
        D.f7082l = true;
        a.b g10 = c0104a.g(1952867444);
        if (g10 == null || (i10 & 2) != 0) {
            qVar.f7160q = j10;
            qVar.f7161r = z11;
        } else {
            qVar.f7160q = C(g10.f7000b);
            qVar.f7161r = true;
        }
        H(c0104a, D, i10);
        p a10 = D.f7074d.f7162a.a(((c) p3.a.e(qVar.f7144a)).f7030a);
        a.b g11 = c0104a.g(1935763834);
        if (g11 != null) {
            x((p) p3.a.e(a10), g11.f7000b, qVar);
        }
        a.b g12 = c0104a.g(1935763823);
        if (g12 != null) {
            w(g12.f7000b, qVar);
        }
        a.b g13 = c0104a.g(1936027235);
        if (g13 != null) {
            A(g13.f7000b, qVar);
        }
        y(c0104a, a10 != null ? a10.f7140b : null, qVar);
        int size = c0104a.f6998c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0104a.f6998c.get(i11);
            if (bVar.f6996a == 1970628964) {
                I(bVar.f7000b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> F(a0 a0Var) {
        a0Var.O(12);
        return Pair.create(Integer.valueOf(a0Var.m()), new c(a0Var.m() - 1, a0Var.m(), a0Var.m(), a0Var.m()));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int G(f2.g.b r34, int r35, int r36, p3.a0 r37, int r38) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.g.G(f2.g$b, int, int, p3.a0, int):int");
    }

    private static void H(a.C0104a c0104a, b bVar, int i10) {
        List<a.b> list = c0104a.f6998c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f6996a == 1953658222) {
                a0 a0Var = bVar2.f7000b;
                a0Var.O(12);
                int G = a0Var.G();
                if (G > 0) {
                    i12 += G;
                    i11++;
                }
            }
        }
        bVar.f7078h = 0;
        bVar.f7077g = 0;
        bVar.f7076f = 0;
        bVar.f7072b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f6996a == 1953658222) {
                i15 = G(bVar, i14, i10, bVar3.f7000b, i15);
                i14++;
            }
        }
    }

    private static void I(a0 a0Var, q qVar, byte[] bArr) {
        a0Var.O(8);
        a0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(a0Var, 16, qVar);
        }
    }

    private void J(long j10) {
        while (!this.f7054m.isEmpty() && this.f7054m.peek().f6997b == j10) {
            o(this.f7054m.pop());
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean K(x1.m r12) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.g.K(x1.m):boolean");
    }

    private void L(x1.m mVar) {
        int i10 = ((int) this.f7059r) - this.f7060s;
        a0 a0Var = this.f7061t;
        if (a0Var != null) {
            mVar.readFully(a0Var.d(), 8, i10);
            q(new a.b(this.f7058q, a0Var), mVar.q());
        } else {
            mVar.h(i10);
        }
        J(mVar.q());
    }

    private void M(x1.m mVar) {
        int size = this.f7045d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f7045d.valueAt(i10).f7072b;
            if (qVar.f7159p) {
                long j11 = qVar.f7147d;
                if (j11 < j10) {
                    bVar = this.f7045d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f7057p = 3;
            return;
        }
        int q10 = (int) (j10 - mVar.q());
        if (q10 < 0) {
            throw h2.a("Offset to encryption data was negative.", null);
        }
        mVar.h(q10);
        bVar.f7072b.b(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N(x1.m mVar) {
        int f10;
        int i10;
        b bVar = this.f7067z;
        Throwable th = null;
        if (bVar == null) {
            bVar = k(this.f7045d);
            if (bVar == null) {
                int q10 = (int) (this.f7062u - mVar.q());
                if (q10 >= 0) {
                    mVar.h(q10);
                    f();
                    return false;
                }
                throw h2.a("Offset to end of mdat was negative.", null);
            }
            int d10 = (int) (bVar.d() - mVar.q());
            if (d10 < 0) {
                p3.r.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            mVar.h(d10);
            this.f7067z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f7057p == 3) {
            int f11 = bVar.f();
            this.A = f11;
            if (bVar.f7076f < bVar.f7079i) {
                mVar.h(f11);
                bVar.m();
                if (!bVar.h()) {
                    this.f7067z = null;
                }
                this.f7057p = 3;
                return true;
            }
            if (bVar.f7074d.f7162a.f7134g == 1) {
                this.A = f11 - 8;
                mVar.h(8);
            }
            if ("audio/ac4".equals(bVar.f7074d.f7162a.f7133f.f13587y)) {
                this.B = bVar.i(this.A, 7);
                u1.c.a(this.A, this.f7050i);
                bVar.f7071a.d(this.f7050i, 7);
                i10 = this.B + 7;
            } else {
                i10 = bVar.i(this.A, 0);
            }
            this.B = i10;
            this.A += this.B;
            this.f7057p = 4;
            this.C = 0;
        }
        o oVar = bVar.f7074d.f7162a;
        e0 e0Var = bVar.f7071a;
        long e10 = bVar.e();
        i0 i0Var = this.f7051j;
        if (i0Var != null) {
            e10 = i0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f7137j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += e0Var.f(mVar, i14 - i13, false);
            }
        } else {
            byte[] d11 = this.f7047f.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i15 = oVar.f7137j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    mVar.readFully(d11, i17, i16);
                    this.f7047f.O(0);
                    int m10 = this.f7047f.m();
                    if (m10 < i12) {
                        throw h2.a("Invalid NAL length", th);
                    }
                    this.C = m10 - 1;
                    this.f7046e.O(0);
                    e0Var.d(this.f7046e, i11);
                    e0Var.d(this.f7047f, i12);
                    this.D = (this.G.length <= 0 || !w.g(oVar.f7133f.f13587y, d11[i11])) ? 0 : i12;
                    this.B += 5;
                    this.A += i17;
                } else {
                    if (this.D) {
                        this.f7048g.K(i18);
                        mVar.readFully(this.f7048g.d(), 0, this.C);
                        e0Var.d(this.f7048g, this.C);
                        f10 = this.C;
                        int q11 = w.q(this.f7048g.d(), this.f7048g.f());
                        this.f7048g.O("video/hevc".equals(oVar.f7133f.f13587y) ? 1 : 0);
                        this.f7048g.N(q11);
                        x1.c.a(j10, this.f7048g, this.G);
                    } else {
                        f10 = e0Var.f(mVar, i18, false);
                    }
                    this.B += f10;
                    this.C -= f10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c10 = bVar.c();
        p g10 = bVar.g();
        e0Var.c(j10, c10, this.A, 0, g10 != null ? g10.f7141c : null);
        t(j10);
        if (!bVar.h()) {
            this.f7067z = null;
        }
        this.f7057p = 3;
        return true;
    }

    private static boolean O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int e(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw h2.a("Unexpected negative value: " + i10, null);
    }

    private void f() {
        this.f7057p = 0;
        this.f7060s = 0;
    }

    private c g(SparseArray<c> sparseArray, int i10) {
        return (c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : p3.a.e(sparseArray.get(i10)));
    }

    private static w1.m h(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f6996a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f7000b.d();
                UUID f10 = l.f(d10);
                if (f10 == null) {
                    p3.r.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w1.m(arrayList);
    }

    private static b k(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f7082l || valueAt.f7076f != valueAt.f7074d.f7163b) && (!valueAt.f7082l || valueAt.f7078h != valueAt.f7072b.f7148e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void l() {
        int i10;
        e0[] e0VarArr = new e0[2];
        this.F = e0VarArr;
        e0 e0Var = this.f7056o;
        int i11 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f7042a & 4) != 0) {
            e0VarArr[i10] = this.E.e(100, 5);
            i10++;
            i12 = 101;
        }
        e0[] e0VarArr2 = (e0[]) m0.F0(this.F, i10);
        this.F = e0VarArr2;
        for (e0 e0Var2 : e0VarArr2) {
            e0Var2.e(K);
        }
        this.G = new e0[this.f7044c.size()];
        while (i11 < this.G.length) {
            e0 e10 = this.E.e(i12, 3);
            e10.e(this.f7044c.get(i11));
            this.G[i11] = e10;
            i11++;
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] m() {
        return new x1.l[]{new g()};
    }

    private void o(a.C0104a c0104a) {
        int i10 = c0104a.f6996a;
        if (i10 == 1836019574) {
            s(c0104a);
        } else if (i10 == 1836019558) {
            r(c0104a);
        } else if (this.f7054m.isEmpty()) {
        } else {
            this.f7054m.peek().d(c0104a);
        }
    }

    private void p(a0 a0Var) {
        long M0;
        String str;
        long M02;
        String str2;
        long E;
        long j10;
        e0[] e0VarArr;
        if (this.F.length == 0) {
            return;
        }
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        if (c10 == 0) {
            String str3 = (String) p3.a.e(a0Var.w());
            String str4 = (String) p3.a.e(a0Var.w());
            long E2 = a0Var.E();
            M0 = m0.M0(a0Var.E(), 1000000L, E2);
            long j11 = this.f7066y;
            long j12 = j11 != -9223372036854775807L ? j11 + M0 : -9223372036854775807L;
            str = str3;
            M02 = m0.M0(a0Var.E(), 1000L, E2);
            str2 = str4;
            E = a0Var.E();
            j10 = j12;
        } else if (c10 != 1) {
            p3.r.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c10);
            return;
        } else {
            long E3 = a0Var.E();
            j10 = m0.M0(a0Var.H(), 1000000L, E3);
            long M03 = m0.M0(a0Var.E(), 1000L, E3);
            long E4 = a0Var.E();
            str = (String) p3.a.e(a0Var.w());
            M02 = M03;
            E = E4;
            str2 = (String) p3.a.e(a0Var.w());
            M0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.j(bArr, 0, a0Var.a());
        a0 a0Var2 = new a0(this.f7052k.a(new m2.a(str, str2, M02, E, bArr)));
        int a10 = a0Var2.a();
        for (e0 e0Var : this.F) {
            a0Var2.O(0);
            e0Var.d(a0Var2, a10);
        }
        if (j10 == -9223372036854775807L) {
            this.f7055n.addLast(new a(M0, true, a10));
        } else if (this.f7055n.isEmpty()) {
            i0 i0Var = this.f7051j;
            if (i0Var != null) {
                j10 = i0Var.a(j10);
            }
            for (e0 e0Var2 : this.F) {
                e0Var2.c(j10, 1, a10, 0, null);
            }
            return;
        } else {
            this.f7055n.addLast(new a(j10, false, a10));
        }
        this.f7063v += a10;
    }

    private void q(a.b bVar, long j10) {
        if (!this.f7054m.isEmpty()) {
            this.f7054m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f6996a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                p(bVar.f7000b);
                return;
            }
            return;
        }
        Pair<Long, x1.d> B = B(bVar.f7000b, j10);
        this.f7066y = ((Long) B.first).longValue();
        this.E.t((b0) B.second);
        this.H = true;
    }

    private void r(a.C0104a c0104a) {
        v(c0104a, this.f7045d, this.f7043b != null, this.f7042a, this.f7049h);
        w1.m h10 = h(c0104a.f6998c);
        if (h10 != null) {
            int size = this.f7045d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f7045d.valueAt(i10).n(h10);
            }
        }
        if (this.f7064w != -9223372036854775807L) {
            int size2 = this.f7045d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f7045d.valueAt(i11).l(this.f7064w);
            }
            this.f7064w = -9223372036854775807L;
        }
    }

    private void s(a.C0104a c0104a) {
        int i10 = 0;
        p3.a.g(this.f7043b == null, "Unexpected moov box.");
        w1.m h10 = h(c0104a.f6998c);
        a.C0104a c0104a2 = (a.C0104a) p3.a.e(c0104a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0104a2.f6998c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0104a2.f6998c.get(i11);
            int i12 = bVar.f6996a;
            if (i12 == 1953654136) {
                Pair<Integer, c> F = F(bVar.f7000b);
                sparseArray.put(((Integer) F.first).intValue(), (c) F.second);
            } else if (i12 == 1835362404) {
                j10 = u(bVar.f7000b);
            }
        }
        List<r> A = f2.b.A(c0104a, new x(), j10, h10, (this.f7042a & 16) != 0, false, new a5.f() { // from class: f2.e
            @Override // a5.f
            public final Object apply(Object obj) {
                return g.this.n((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f7045d.size() != 0) {
            p3.a.f(this.f7045d.size() == size2);
            while (i10 < size2) {
                r rVar = A.get(i10);
                o oVar = rVar.f7162a;
                this.f7045d.get(oVar.f7128a).j(rVar, g(sparseArray, oVar.f7128a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = A.get(i10);
            o oVar2 = rVar2.f7162a;
            this.f7045d.put(oVar2.f7128a, new b(this.E.e(i10, oVar2.f7129b), rVar2, g(sparseArray, oVar2.f7128a)));
            this.f7065x = Math.max(this.f7065x, oVar2.f7132e);
            i10++;
        }
        this.E.i();
    }

    private void t(long j10) {
        while (!this.f7055n.isEmpty()) {
            a removeFirst = this.f7055n.removeFirst();
            this.f7063v -= removeFirst.f7070c;
            long j11 = removeFirst.f7068a;
            if (removeFirst.f7069b) {
                j11 += j10;
            }
            i0 i0Var = this.f7051j;
            if (i0Var != null) {
                j11 = i0Var.a(j11);
            }
            for (e0 e0Var : this.F) {
                e0Var.c(j11, 1, removeFirst.f7070c, this.f7063v, null);
            }
        }
    }

    private static long u(a0 a0Var) {
        a0Var.O(8);
        return f2.a.c(a0Var.m()) == 0 ? a0Var.E() : a0Var.H();
    }

    private static void v(a.C0104a c0104a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = c0104a.f6999d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0104a c0104a2 = c0104a.f6999d.get(i11);
            if (c0104a2.f6996a == 1953653094) {
                E(c0104a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void w(a0 a0Var, q qVar) {
        a0Var.O(8);
        int m10 = a0Var.m();
        if ((f2.a.b(m10) & 1) == 1) {
            a0Var.P(8);
        }
        int G = a0Var.G();
        if (G == 1) {
            qVar.f7147d += f2.a.c(m10) == 0 ? a0Var.E() : a0Var.H();
            return;
        }
        throw h2.a("Unexpected saio entry count: " + G, null);
    }

    private static void x(p pVar, a0 a0Var, q qVar) {
        int i10;
        int i11 = pVar.f7142d;
        a0Var.O(8);
        if ((f2.a.b(a0Var.m()) & 1) == 1) {
            a0Var.P(8);
        }
        int C = a0Var.C();
        int G = a0Var.G();
        if (G > qVar.f7149f) {
            throw h2.a("Saiz sample count " + G + " is greater than fragment sample count" + qVar.f7149f, null);
        }
        if (C == 0) {
            boolean[] zArr = qVar.f7156m;
            i10 = 0;
            for (int i12 = 0; i12 < G; i12++) {
                int C2 = a0Var.C();
                i10 += C2;
                zArr[i12] = C2 > i11;
            }
        } else {
            i10 = (C * G) + 0;
            Arrays.fill(qVar.f7156m, 0, G, C > i11);
        }
        Arrays.fill(qVar.f7156m, G, qVar.f7149f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    private static void y(a.C0104a c0104a, String str, q qVar) {
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i10 = 0; i10 < c0104a.f6998c.size(); i10++) {
            a.b bVar = c0104a.f6998c.get(i10);
            a0 a0Var3 = bVar.f7000b;
            int i11 = bVar.f6996a;
            if (i11 == 1935828848) {
                a0Var3.O(12);
                if (a0Var3.m() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.O(12);
                if (a0Var3.m() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.O(8);
        int c10 = f2.a.c(a0Var.m());
        a0Var.P(4);
        if (c10 == 1) {
            a0Var.P(4);
        }
        if (a0Var.m() != 1) {
            throw h2.d("Entry count in sbgp != 1 (unsupported).");
        }
        a0Var2.O(8);
        int c11 = f2.a.c(a0Var2.m());
        a0Var2.P(4);
        if (c11 == 1) {
            if (a0Var2.E() == 0) {
                throw h2.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (c11 >= 2) {
            a0Var2.P(4);
        }
        if (a0Var2.E() != 1) {
            throw h2.d("Entry count in sgpd != 1 (unsupported).");
        }
        a0Var2.P(1);
        int C = a0Var2.C();
        int i12 = (C & 240) >> 4;
        int i13 = C & 15;
        boolean z10 = a0Var2.C() == 1;
        if (z10) {
            int C2 = a0Var2.C();
            byte[] bArr2 = new byte[16];
            a0Var2.j(bArr2, 0, 16);
            if (C2 == 0) {
                int C3 = a0Var2.C();
                bArr = new byte[C3];
                a0Var2.j(bArr, 0, C3);
            }
            qVar.f7155l = true;
            qVar.f7157n = new p(z10, str, C2, bArr2, i12, i13, bArr);
        }
    }

    private static void z(a0 a0Var, int i10, q qVar) {
        a0Var.O(i10 + 8);
        int b10 = f2.a.b(a0Var.m());
        if ((b10 & 1) != 0) {
            throw h2.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (b10 & 2) != 0;
        int G = a0Var.G();
        if (G == 0) {
            Arrays.fill(qVar.f7156m, 0, qVar.f7149f, false);
        } else if (G == qVar.f7149f) {
            Arrays.fill(qVar.f7156m, 0, G, z10);
            qVar.d(a0Var.a());
            qVar.a(a0Var);
        } else {
            throw h2.a("Senc sample count " + G + " is different from fragment sample count" + qVar.f7149f, null);
        }
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        int size = this.f7045d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7045d.valueAt(i10).k();
        }
        this.f7055n.clear();
        this.f7063v = 0;
        this.f7064w = j11;
        this.f7054m.clear();
        f();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.E = nVar;
        f();
        l();
        o oVar = this.f7043b;
        if (oVar != null) {
            this.f7045d.put(0, new b(nVar.e(0, oVar.f7129b), new r(this.f7043b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.i();
        }
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        while (true) {
            int i10 = this.f7057p;
            if (i10 != 0) {
                if (i10 == 1) {
                    L(mVar);
                } else if (i10 == 2) {
                    M(mVar);
                } else if (N(mVar)) {
                    return 0;
                }
            } else if (!K(mVar)) {
                return -1;
            }
        }
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        return n.b(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o n(o oVar) {
        return oVar;
    }
}
