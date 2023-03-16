package u2;

import s1.m1;
import s1.n1;
import w1.o;
import w1.w;
import w1.y;
import x1.e0;
/* loaded from: classes.dex */
public class m0 implements x1.e0 {
    private m1 A;
    private m1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private final k0 f15277a;

    /* renamed from: d  reason: collision with root package name */
    private final w1.y f15280d;

    /* renamed from: e  reason: collision with root package name */
    private final w.a f15281e;

    /* renamed from: f  reason: collision with root package name */
    private d f15282f;

    /* renamed from: g  reason: collision with root package name */
    private m1 f15283g;

    /* renamed from: h  reason: collision with root package name */
    private w1.o f15284h;

    /* renamed from: p  reason: collision with root package name */
    private int f15292p;

    /* renamed from: q  reason: collision with root package name */
    private int f15293q;

    /* renamed from: r  reason: collision with root package name */
    private int f15294r;

    /* renamed from: s  reason: collision with root package name */
    private int f15295s;

    /* renamed from: w  reason: collision with root package name */
    private boolean f15299w;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15302z;

    /* renamed from: b  reason: collision with root package name */
    private final b f15278b = new b();

    /* renamed from: i  reason: collision with root package name */
    private int f15285i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f15286j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f15287k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f15290n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f15289m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f15288l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private e0.a[] f15291o = new e0.a[1000];

    /* renamed from: c  reason: collision with root package name */
    private final r0<c> f15279c = new r0<>(l0.f15271a);

    /* renamed from: t  reason: collision with root package name */
    private long f15296t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f15297u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f15298v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    private boolean f15301y = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f15300x = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15303a;

        /* renamed from: b  reason: collision with root package name */
        public long f15304b;

        /* renamed from: c  reason: collision with root package name */
        public e0.a f15305c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f15306a;

        /* renamed from: b  reason: collision with root package name */
        public final y.b f15307b;

        private c(m1 m1Var, y.b bVar) {
            this.f15306a = m1Var;
            this.f15307b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void b(m1 m1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m0(o3.b bVar, w1.y yVar, w.a aVar) {
        this.f15280d = yVar;
        this.f15281e = aVar;
        this.f15277a = new k0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f15290n[D]);
            if ((this.f15289m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f15285i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f15294r + i10;
        int i12 = this.f15285i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f15295s != this.f15292p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(c cVar) {
        cVar.f15307b.a();
    }

    private boolean M(int i10) {
        w1.o oVar = this.f15284h;
        return oVar == null || oVar.f() == 4 || ((this.f15289m[i10] & 1073741824) == 0 && this.f15284h.a());
    }

    private void O(m1 m1Var, n1 n1Var) {
        m1 m1Var2 = this.f15283g;
        boolean z10 = m1Var2 == null;
        w1.m mVar = z10 ? null : m1Var2.B;
        this.f15283g = m1Var;
        w1.m mVar2 = m1Var.B;
        w1.y yVar = this.f15280d;
        n1Var.f13638b = yVar != null ? m1Var.c(yVar.f(m1Var)) : m1Var;
        n1Var.f13637a = this.f15284h;
        if (this.f15280d == null) {
            return;
        }
        if (z10 || !p3.m0.c(mVar, mVar2)) {
            w1.o oVar = this.f15284h;
            w1.o c10 = this.f15280d.c(this.f15281e, m1Var);
            this.f15284h = c10;
            n1Var.f13637a = c10;
            if (oVar != null) {
                oVar.c(this.f15281e);
            }
        }
    }

    private synchronized int P(n1 n1Var, v1.g gVar, boolean z10, boolean z11, b bVar) {
        gVar.f15537q = false;
        if (!H()) {
            if (!z11 && !this.f15299w) {
                m1 m1Var = this.B;
                if (m1Var == null || (!z10 && m1Var == this.f15283g)) {
                    return -3;
                }
                O((m1) p3.a.e(m1Var), n1Var);
                return -5;
            }
            gVar.w(4);
            return -4;
        }
        m1 m1Var2 = this.f15279c.e(C()).f15306a;
        if (!z10 && m1Var2 == this.f15283g) {
            int D = D(this.f15295s);
            if (!M(D)) {
                gVar.f15537q = true;
                return -3;
            }
            gVar.w(this.f15289m[D]);
            long j10 = this.f15290n[D];
            gVar.f15538r = j10;
            if (j10 < this.f15296t) {
                gVar.l(Integer.MIN_VALUE);
            }
            bVar.f15303a = this.f15288l[D];
            bVar.f15304b = this.f15287k[D];
            bVar.f15305c = this.f15291o[D];
            return -4;
        }
        O(m1Var2, n1Var);
        return -5;
    }

    private void U() {
        w1.o oVar = this.f15284h;
        if (oVar != null) {
            oVar.c(this.f15281e);
            this.f15284h = null;
            this.f15283g = null;
        }
    }

    private synchronized void X() {
        this.f15295s = 0;
        this.f15277a.o();
    }

    private synchronized boolean c0(m1 m1Var) {
        this.f15301y = false;
        if (p3.m0.c(m1Var, this.B)) {
            return false;
        }
        if (!this.f15279c.g() && this.f15279c.f().f15306a.equals(m1Var)) {
            m1Var = this.f15279c.f().f15306a;
        }
        this.B = m1Var;
        m1 m1Var2 = this.B;
        this.D = p3.v.a(m1Var2.f13587y, m1Var2.f13584v);
        this.E = false;
        return true;
    }

    private synchronized boolean h(long j10) {
        if (this.f15292p == 0) {
            return j10 > this.f15297u;
        } else if (A() >= j10) {
            return false;
        } else {
            t(this.f15293q + j(j10));
            return true;
        }
    }

    private synchronized void i(long j10, int i10, long j11, int i11, e0.a aVar) {
        int i12 = this.f15292p;
        if (i12 > 0) {
            int D = D(i12 - 1);
            p3.a.a(this.f15287k[D] + ((long) this.f15288l[D]) <= j11);
        }
        this.f15299w = (536870912 & i10) != 0;
        this.f15298v = Math.max(this.f15298v, j10);
        int D2 = D(this.f15292p);
        this.f15290n[D2] = j10;
        this.f15287k[D2] = j11;
        this.f15288l[D2] = i11;
        this.f15289m[D2] = i10;
        this.f15291o[D2] = aVar;
        this.f15286j[D2] = this.C;
        if (this.f15279c.g() || !this.f15279c.f().f15306a.equals(this.B)) {
            w1.y yVar = this.f15280d;
            this.f15279c.a(G(), new c((m1) p3.a.e(this.B), yVar != null ? yVar.d(this.f15281e, this.B) : y.b.f15973a));
        }
        int i13 = this.f15292p + 1;
        this.f15292p = i13;
        int i14 = this.f15285i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            e0.a[] aVarArr = new e0.a[i15];
            int i16 = this.f15294r;
            int i17 = i14 - i16;
            System.arraycopy(this.f15287k, i16, jArr, 0, i17);
            System.arraycopy(this.f15290n, this.f15294r, jArr2, 0, i17);
            System.arraycopy(this.f15289m, this.f15294r, iArr2, 0, i17);
            System.arraycopy(this.f15288l, this.f15294r, iArr3, 0, i17);
            System.arraycopy(this.f15291o, this.f15294r, aVarArr, 0, i17);
            System.arraycopy(this.f15286j, this.f15294r, iArr, 0, i17);
            int i18 = this.f15294r;
            System.arraycopy(this.f15287k, 0, jArr, i17, i18);
            System.arraycopy(this.f15290n, 0, jArr2, i17, i18);
            System.arraycopy(this.f15289m, 0, iArr2, i17, i18);
            System.arraycopy(this.f15288l, 0, iArr3, i17, i18);
            System.arraycopy(this.f15291o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f15286j, 0, iArr, i17, i18);
            this.f15287k = jArr;
            this.f15290n = jArr2;
            this.f15289m = iArr2;
            this.f15288l = iArr3;
            this.f15291o = aVarArr;
            this.f15286j = iArr;
            this.f15294r = 0;
            this.f15285i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f15292p;
        int D = D(i10 - 1);
        while (i10 > this.f15295s && this.f15290n[D] >= j10) {
            i10--;
            D--;
            if (D == -1) {
                D = this.f15285i - 1;
            }
        }
        return i10;
    }

    public static m0 k(o3.b bVar, w1.y yVar, w.a aVar) {
        return new m0(bVar, (w1.y) p3.a.e(yVar), (w.a) p3.a.e(aVar));
    }

    public static m0 l(o3.b bVar) {
        return new m0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f15292p;
        if (i11 != 0) {
            long[] jArr = this.f15290n;
            int i12 = this.f15294r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f15295s) != i11) {
                    i11 = i10 + 1;
                }
                int v10 = v(i12, i11, j10, z10);
                if (v10 == -1) {
                    return -1L;
                }
                return p(v10);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f15292p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        int i11;
        this.f15297u = Math.max(this.f15297u, B(i10));
        this.f15292p -= i10;
        int i12 = this.f15293q + i10;
        this.f15293q = i12;
        int i13 = this.f15294r + i10;
        this.f15294r = i13;
        int i14 = this.f15285i;
        if (i13 >= i14) {
            this.f15294r = i13 - i14;
        }
        int i15 = this.f15295s - i10;
        this.f15295s = i15;
        if (i15 < 0) {
            this.f15295s = 0;
        }
        this.f15279c.d(i12);
        if (this.f15292p == 0) {
            int i16 = this.f15294r;
            if (i16 == 0) {
                i16 = this.f15285i;
            }
            return this.f15287k[i16 - 1] + this.f15288l[i11];
        }
        return this.f15287k[this.f15294r];
    }

    private long t(int i10) {
        int D;
        int G = G() - i10;
        boolean z10 = false;
        p3.a.a(G >= 0 && G <= this.f15292p - this.f15295s);
        int i11 = this.f15292p - G;
        this.f15292p = i11;
        this.f15298v = Math.max(this.f15297u, B(i11));
        if (G == 0 && this.f15299w) {
            z10 = true;
        }
        this.f15299w = z10;
        this.f15279c.c(i10);
        int i12 = this.f15292p;
        if (i12 != 0) {
            return this.f15287k[D(i12 - 1)] + this.f15288l[D];
        }
        return 0L;
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f15290n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f15289m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f15285i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f15297u, B(this.f15295s));
    }

    public final int C() {
        return this.f15293q + this.f15295s;
    }

    public final synchronized int E(long j10, boolean z10) {
        int D = D(this.f15295s);
        if (H() && j10 >= this.f15290n[D]) {
            if (j10 > this.f15298v && z10) {
                return this.f15292p - this.f15295s;
            }
            int v10 = v(D, this.f15292p - this.f15295s, j10, true);
            if (v10 == -1) {
                return 0;
            }
            return v10;
        }
        return 0;
    }

    public final synchronized m1 F() {
        return this.f15301y ? null : this.B;
    }

    public final int G() {
        return this.f15293q + this.f15292p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I() {
        this.f15302z = true;
    }

    public final synchronized boolean J() {
        return this.f15299w;
    }

    public synchronized boolean K(boolean z10) {
        m1 m1Var;
        boolean z11 = true;
        if (H()) {
            if (this.f15279c.e(C()).f15306a != this.f15283g) {
                return true;
            }
            return M(D(this.f15295s));
        }
        if (!z10 && !this.f15299w && ((m1Var = this.B) == null || m1Var == this.f15283g)) {
            z11 = false;
        }
        return z11;
    }

    public void N() {
        w1.o oVar = this.f15284h;
        if (oVar != null && oVar.f() == 1) {
            throw ((o.a) p3.a.e(this.f15284h.h()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f15286j[D(this.f15295s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(n1 n1Var, v1.g gVar, int i10, boolean z10) {
        int P = P(n1Var, gVar, (i10 & 2) != 0, z10, this.f15278b);
        if (P == -4 && !gVar.t()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                k0 k0Var = this.f15277a;
                b bVar = this.f15278b;
                if (z11) {
                    k0Var.f(gVar, bVar);
                } else {
                    k0Var.m(gVar, bVar);
                }
            }
            if (!z11) {
                this.f15295s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f15277a.n();
        this.f15292p = 0;
        this.f15293q = 0;
        this.f15294r = 0;
        this.f15295s = 0;
        this.f15300x = true;
        this.f15296t = Long.MIN_VALUE;
        this.f15297u = Long.MIN_VALUE;
        this.f15298v = Long.MIN_VALUE;
        this.f15299w = false;
        this.f15279c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f15301y = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        boolean z10;
        X();
        int i11 = this.f15293q;
        if (i10 >= i11 && i10 <= this.f15292p + i11) {
            this.f15296t = Long.MIN_VALUE;
            this.f15295s = i10 - i11;
            z10 = true;
        }
        z10 = false;
        return z10;
    }

    public final synchronized boolean Z(long j10, boolean z10) {
        X();
        int D = D(this.f15295s);
        if (H() && j10 >= this.f15290n[D] && (j10 <= this.f15298v || z10)) {
            int v10 = v(D, this.f15292p - this.f15295s, j10, true);
            if (v10 == -1) {
                return false;
            }
            this.f15296t = j10;
            this.f15295s += v10;
            return true;
        }
        return false;
    }

    @Override // x1.e0
    public final int a(o3.i iVar, int i10, boolean z10, int i11) {
        return this.f15277a.p(iVar, i10, z10);
    }

    public final void a0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    @Override // x1.e0
    public final void b(p3.a0 a0Var, int i10, int i11) {
        this.f15277a.q(a0Var, i10);
    }

    public final void b0(long j10) {
        this.f15296t = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // x1.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r12, int r14, int r15, int r16, x1.e0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f15302z
            if (r0 == 0) goto L10
            s1.m1 r0 = r8.A
            java.lang.Object r0 = p3.a.h(r0)
            s1.m1 r0 = (s1.m1) r0
            r11.e(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f15300x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f15300x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L54
            long r6 = r8.f15296t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            s1.m1 r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p3.r.i(r6, r0)
            r8.E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.G = r1
            goto L66
        L65:
            return
        L66:
            u2.k0 r0 = r8.f15277a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.m0.c(long, int, int, int, x1.e0$a):void");
    }

    @Override // x1.e0
    public /* synthetic */ void d(p3.a0 a0Var, int i10) {
        x1.d0.b(this, a0Var, i10);
    }

    public final void d0(d dVar) {
        this.f15282f = dVar;
    }

    @Override // x1.e0
    public final void e(m1 m1Var) {
        m1 w10 = w(m1Var);
        this.f15302z = false;
        this.A = m1Var;
        boolean c02 = c0(w10);
        d dVar = this.f15282f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.b(w10);
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f15295s + i10 <= this.f15292p) {
                    z10 = true;
                    p3.a.a(z10);
                    this.f15295s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        p3.a.a(z10);
        this.f15295s += i10;
    }

    @Override // x1.e0
    public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
        return x1.d0.a(this, iVar, i10, z10);
    }

    public final void f0(int i10) {
        this.C = i10;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f15295s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f15277a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f15277a.b(n());
    }

    public final void s() {
        this.f15277a.b(o());
    }

    public final void u(int i10) {
        this.f15277a.c(t(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m1 w(m1 m1Var) {
        return (this.F == 0 || m1Var.C == Long.MAX_VALUE) ? m1Var : m1Var.b().i0(m1Var.C + this.F).E();
    }

    public final int x() {
        return this.f15293q;
    }

    public final synchronized long y() {
        return this.f15292p == 0 ? Long.MIN_VALUE : this.f15290n[this.f15294r];
    }

    public final synchronized long z() {
        return this.f15298v;
    }
}
