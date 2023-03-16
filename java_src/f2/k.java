package f2;

import android.util.Pair;
import f2.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import p3.a0;
import p3.m0;
import p3.w;
import s1.h2;
import s1.m1;
import x1.b0;
import x1.e0;
import x1.f0;
import x1.x;
/* loaded from: classes.dex */
public final class k implements x1.l, b0 {

    /* renamed from: y  reason: collision with root package name */
    public static final x1.r f7086y = j.f7085b;

    /* renamed from: a  reason: collision with root package name */
    private final int f7087a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f7088b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f7089c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f7090d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f7091e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<a.C0104a> f7092f;

    /* renamed from: g  reason: collision with root package name */
    private final m f7093g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.b> f7094h;

    /* renamed from: i  reason: collision with root package name */
    private int f7095i;

    /* renamed from: j  reason: collision with root package name */
    private int f7096j;

    /* renamed from: k  reason: collision with root package name */
    private long f7097k;

    /* renamed from: l  reason: collision with root package name */
    private int f7098l;

    /* renamed from: m  reason: collision with root package name */
    private a0 f7099m;

    /* renamed from: n  reason: collision with root package name */
    private int f7100n;

    /* renamed from: o  reason: collision with root package name */
    private int f7101o;

    /* renamed from: p  reason: collision with root package name */
    private int f7102p;

    /* renamed from: q  reason: collision with root package name */
    private int f7103q;

    /* renamed from: r  reason: collision with root package name */
    private x1.n f7104r;

    /* renamed from: s  reason: collision with root package name */
    private a[] f7105s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f7106t;

    /* renamed from: u  reason: collision with root package name */
    private int f7107u;

    /* renamed from: v  reason: collision with root package name */
    private long f7108v;

    /* renamed from: w  reason: collision with root package name */
    private int f7109w;

    /* renamed from: x  reason: collision with root package name */
    private q2.b f7110x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f7111a;

        /* renamed from: b  reason: collision with root package name */
        public final r f7112b;

        /* renamed from: c  reason: collision with root package name */
        public final e0 f7113c;

        /* renamed from: d  reason: collision with root package name */
        public final f0 f7114d;

        /* renamed from: e  reason: collision with root package name */
        public int f7115e;

        public a(o oVar, r rVar, e0 e0Var) {
            this.f7111a = oVar;
            this.f7112b = rVar;
            this.f7113c = e0Var;
            this.f7114d = "audio/true-hd".equals(oVar.f7133f.f13587y) ? new f0() : null;
        }
    }

    public k() {
        this(0);
    }

    public k(int i10) {
        this.f7087a = i10;
        this.f7095i = (i10 & 4) != 0 ? 3 : 0;
        this.f7093g = new m();
        this.f7094h = new ArrayList();
        this.f7091e = new a0(16);
        this.f7092f = new ArrayDeque<>();
        this.f7088b = new a0(w.f12350a);
        this.f7089c = new a0(4);
        this.f7090d = new a0();
        this.f7100n = -1;
        this.f7104r = x1.n.f16274m;
        this.f7105s = new a[0];
    }

    private void A(long j10) {
        if (this.f7096j == 1836086884) {
            int i10 = this.f7098l;
            this.f7110x = new q2.b(0L, j10, -9223372036854775807L, j10 + i10, this.f7097k - i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean B(x1.m r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.k.B(x1.m):boolean");
    }

    private boolean C(x1.m mVar, x1.a0 a0Var) {
        boolean z10;
        long j10 = this.f7097k - this.f7098l;
        long q10 = mVar.q() + j10;
        a0 a0Var2 = this.f7099m;
        if (a0Var2 != null) {
            mVar.readFully(a0Var2.d(), this.f7098l, (int) j10);
            if (this.f7096j == 1718909296) {
                this.f7109w = y(a0Var2);
            } else if (!this.f7092f.isEmpty()) {
                this.f7092f.peek().e(new a.b(this.f7096j, a0Var2));
            }
        } else if (j10 >= 262144) {
            a0Var.f16188a = mVar.q() + j10;
            z10 = true;
            w(q10);
            return (z10 || this.f7095i == 2) ? false : true;
        } else {
            mVar.h((int) j10);
        }
        z10 = false;
        w(q10);
        if (z10) {
        }
    }

    private int D(x1.m mVar, x1.a0 a0Var) {
        int i10;
        x1.a0 a0Var2;
        long q10 = mVar.q();
        if (this.f7100n == -1) {
            int r10 = r(q10);
            this.f7100n = r10;
            if (r10 == -1) {
                return -1;
            }
        }
        a aVar = this.f7105s[this.f7100n];
        e0 e0Var = aVar.f7113c;
        int i11 = aVar.f7115e;
        r rVar = aVar.f7112b;
        long j10 = rVar.f7164c[i11];
        int i12 = rVar.f7165d[i11];
        f0 f0Var = aVar.f7114d;
        long j11 = (j10 - q10) + this.f7101o;
        if (j11 < 0) {
            i10 = 1;
            a0Var2 = a0Var;
        } else if (j11 < 262144) {
            if (aVar.f7111a.f7134g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            mVar.h((int) j11);
            o oVar = aVar.f7111a;
            if (oVar.f7137j == 0) {
                if ("audio/ac4".equals(oVar.f7133f.f13587y)) {
                    if (this.f7102p == 0) {
                        u1.c.a(i12, this.f7090d);
                        e0Var.d(this.f7090d, 7);
                        this.f7102p += 7;
                    }
                    i12 += 7;
                } else if (f0Var != null) {
                    f0Var.d(mVar);
                }
                while (true) {
                    int i13 = this.f7102p;
                    if (i13 >= i12) {
                        break;
                    }
                    int f10 = e0Var.f(mVar, i12 - i13, false);
                    this.f7101o += f10;
                    this.f7102p += f10;
                    this.f7103q -= f10;
                }
            } else {
                byte[] d10 = this.f7089c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i14 = aVar.f7111a.f7137j;
                int i15 = 4 - i14;
                while (this.f7102p < i12) {
                    int i16 = this.f7103q;
                    if (i16 == 0) {
                        mVar.readFully(d10, i15, i14);
                        this.f7101o += i14;
                        this.f7089c.O(0);
                        int m10 = this.f7089c.m();
                        if (m10 < 0) {
                            throw h2.a("Invalid NAL length", null);
                        }
                        this.f7103q = m10;
                        this.f7088b.O(0);
                        e0Var.d(this.f7088b, 4);
                        this.f7102p += 4;
                        i12 += i15;
                    } else {
                        int f11 = e0Var.f(mVar, i16, false);
                        this.f7101o += f11;
                        this.f7102p += f11;
                        this.f7103q -= f11;
                    }
                }
            }
            int i17 = i12;
            r rVar2 = aVar.f7112b;
            long j12 = rVar2.f7167f[i11];
            int i18 = rVar2.f7168g[i11];
            if (f0Var != null) {
                f0Var.c(e0Var, j12, i18, i17, 0, null);
                if (i11 + 1 == aVar.f7112b.f7163b) {
                    f0Var.a(e0Var, null);
                }
            } else {
                e0Var.c(j12, i18, i17, 0, null);
            }
            aVar.f7115e++;
            this.f7100n = -1;
            this.f7101o = 0;
            this.f7102p = 0;
            this.f7103q = 0;
            return 0;
        } else {
            a0Var2 = a0Var;
            i10 = 1;
        }
        a0Var2.f16188a = j10;
        return i10;
    }

    private int E(x1.m mVar, x1.a0 a0Var) {
        int c10 = this.f7093g.c(mVar, a0Var, this.f7094h);
        if (c10 == 1 && a0Var.f16188a == 0) {
            o();
        }
        return c10;
    }

    private static boolean F(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean G(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void H(a aVar, long j10) {
        r rVar = aVar.f7112b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f7115e = a10;
    }

    private static int m(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] n(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f7112b.f7163b];
            jArr2[i10] = aVarArr[i10].f7112b.f7167f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += aVarArr[i12].f7112b.f7165d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f7112b.f7167f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void o() {
        this.f7095i = 0;
        this.f7098l = 0;
    }

    private static int q(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    private int r(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f7105s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f7115e;
            r rVar = aVar.f7112b;
            if (i13 != rVar.f7163b) {
                long j14 = rVar.f7164c[i13];
                long j15 = ((long[][]) m0.j(this.f7106t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o s(o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] t() {
        return new x1.l[]{new k()};
    }

    private static long u(r rVar, long j10, long j11) {
        int q10 = q(rVar, j10);
        return q10 == -1 ? j11 : Math.min(rVar.f7164c[q10], j11);
    }

    private void v(x1.m mVar) {
        this.f7090d.K(8);
        mVar.o(this.f7090d.d(), 0, 8);
        b.e(this.f7090d);
        mVar.h(this.f7090d.e());
        mVar.g();
    }

    private void w(long j10) {
        while (!this.f7092f.isEmpty() && this.f7092f.peek().f6997b == j10) {
            a.C0104a pop = this.f7092f.pop();
            if (pop.f6996a == 1836019574) {
                z(pop);
                this.f7092f.clear();
                this.f7095i = 2;
            } else if (!this.f7092f.isEmpty()) {
                this.f7092f.peek().d(pop);
            }
        }
        if (this.f7095i != 2) {
            o();
        }
    }

    private void x() {
        if (this.f7109w != 2 || (this.f7087a & 2) == 0) {
            return;
        }
        this.f7104r.e(0, 4).e(new m1.b().X(this.f7110x == null ? null : new k2.a(this.f7110x)).E());
        this.f7104r.i();
        this.f7104r.t(new b0.b(-9223372036854775807L));
    }

    private static int y(a0 a0Var) {
        a0Var.O(8);
        int m10 = m(a0Var.m());
        if (m10 != 0) {
            return m10;
        }
        a0Var.P(4);
        while (a0Var.a() > 0) {
            int m11 = m(a0Var.m());
            if (m11 != 0) {
                return m11;
            }
        }
        return 0;
    }

    private void z(a.C0104a c0104a) {
        k2.a aVar;
        k2.a aVar2;
        List<r> list;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f7109w == 1;
        x xVar = new x();
        a.b g10 = c0104a.g(1969517665);
        if (g10 != null) {
            Pair<k2.a, k2.a> B = b.B(g10);
            k2.a aVar3 = (k2.a) B.first;
            k2.a aVar4 = (k2.a) B.second;
            if (aVar3 != null) {
                xVar.c(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0104a f10 = c0104a.f(1835365473);
        long j10 = -9223372036854775807L;
        k2.a n10 = f10 != null ? b.n(f10) : null;
        List<r> A = b.A(c0104a, xVar, -9223372036854775807L, null, (this.f7087a & 1) != 0, z10, i.f7084n);
        int size = A.size();
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size) {
            r rVar = A.get(i12);
            if (rVar.f7163b == 0) {
                list = A;
                i10 = size;
            } else {
                o oVar = rVar.f7162a;
                list = A;
                i10 = size;
                long j12 = oVar.f7132e;
                if (j12 == j10) {
                    j12 = rVar.f7169h;
                }
                long max = Math.max(j11, j12);
                a aVar5 = new a(oVar, rVar, this.f7104r.e(i12, oVar.f7129b));
                int i14 = "audio/true-hd".equals(oVar.f7133f.f13587y) ? rVar.f7166e * 16 : rVar.f7166e + 30;
                m1.b b10 = oVar.f7133f.b();
                b10.W(i14);
                if (oVar.f7129b == 2 && j12 > 0 && (i11 = rVar.f7163b) > 1) {
                    b10.P(i11 / (((float) j12) / 1000000.0f));
                }
                h.k(oVar.f7129b, xVar, b10);
                int i15 = oVar.f7129b;
                k2.a[] aVarArr = new k2.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f7094h.isEmpty() ? null : new k2.a(this.f7094h);
                h.l(i15, aVar2, n10, b10, aVarArr);
                aVar5.f7113c.e(b10.E());
                if (oVar.f7129b == 2 && i13 == -1) {
                    i13 = arrayList.size();
                }
                arrayList.add(aVar5);
                j11 = max;
            }
            i12++;
            A = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f7107u = i13;
        this.f7108v = j11;
        a[] aVarArr2 = (a[]) arrayList.toArray(new a[0]);
        this.f7105s = aVarArr2;
        this.f7106t = n(aVarArr2);
        this.f7104r.i();
        this.f7104r.t(this);
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        a[] aVarArr;
        this.f7092f.clear();
        this.f7098l = 0;
        this.f7100n = -1;
        this.f7101o = 0;
        this.f7102p = 0;
        this.f7103q = 0;
        if (j10 == 0) {
            if (this.f7095i != 3) {
                o();
                return;
            }
            this.f7093g.g();
            this.f7094h.clear();
            return;
        }
        for (a aVar : this.f7105s) {
            H(aVar, j11);
            f0 f0Var = aVar.f7114d;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f7104r = nVar;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        return p(j10, -1);
    }

    @Override // x1.b0
    public long h() {
        return this.f7108v;
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        while (true) {
            int i10 = this.f7095i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            return E(mVar, a0Var);
                        }
                        throw new IllegalStateException();
                    }
                    return D(mVar, a0Var);
                } else if (C(mVar, a0Var)) {
                    return 1;
                }
            } else if (!B(mVar)) {
                return -1;
            }
        }
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        return n.d(mVar, (this.f7087a & 2) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x1.b0.a p(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            f2.k$a[] r4 = r0.f7105s
            int r5 = r4.length
            if (r5 != 0) goto L13
            x1.b0$a r1 = new x1.b0$a
            x1.c0 r2 = x1.c0.f16193c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L1a
            r8 = r3
            goto L1c
        L1a:
            int r8 = r0.f7107u
        L1c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L58
            r4 = r4[r8]
            f2.r r4 = r4.f7112b
            int r8 = q(r4, r1)
            if (r8 != r7) goto L35
            x1.b0$a r1 = new x1.b0$a
            x1.c0 r2 = x1.c0.f16193c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f7167f
            r12 = r11[r8]
            long[] r11 = r4.f7164c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f7163b
            int r11 = r11 + (-1)
            if (r8 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r7) goto L5e
            if (r1 == r8) goto L5e
            long[] r2 = r4.f7167f
            r5 = r2[r1]
            long[] r2 = r4.f7164c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r5
            r5 = r9
        L60:
            if (r3 != r7) goto L7f
            r3 = 0
        L63:
            f2.k$a[] r4 = r0.f7105s
            int r7 = r4.length
            if (r3 >= r7) goto L7f
            int r7 = r0.f7107u
            if (r3 == r7) goto L7c
            r4 = r4[r3]
            f2.r r4 = r4.f7112b
            long r14 = u(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L7c
            long r1 = u(r4, r5, r1)
        L7c:
            int r3 = r3 + 1
            goto L63
        L7f:
            x1.c0 r3 = new x1.c0
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L8e
            x1.b0$a r1 = new x1.b0$a
            r1.<init>(r3)
            return r1
        L8e:
            x1.c0 r4 = new x1.c0
            r4.<init>(r5, r1)
            x1.b0$a r1 = new x1.b0$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.k.p(long, int):x1.b0$a");
    }
}
