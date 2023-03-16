package e2;

import e2.g;
import java.io.EOFException;
import k2.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p2.h;
import p3.a0;
import p3.m0;
import s1.m1;
import u1.e0;
import x1.k;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
import x1.x;
import x1.y;
/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: u  reason: collision with root package name */
    public static final r f6649u = e.f6648b;

    /* renamed from: v  reason: collision with root package name */
    private static final h.a f6650v = d.f6647a;

    /* renamed from: a  reason: collision with root package name */
    private final int f6651a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6652b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f6653c;

    /* renamed from: d  reason: collision with root package name */
    private final e0.a f6654d;

    /* renamed from: e  reason: collision with root package name */
    private final x f6655e;

    /* renamed from: f  reason: collision with root package name */
    private final y f6656f;

    /* renamed from: g  reason: collision with root package name */
    private final x1.e0 f6657g;

    /* renamed from: h  reason: collision with root package name */
    private n f6658h;

    /* renamed from: i  reason: collision with root package name */
    private x1.e0 f6659i;

    /* renamed from: j  reason: collision with root package name */
    private x1.e0 f6660j;

    /* renamed from: k  reason: collision with root package name */
    private int f6661k;

    /* renamed from: l  reason: collision with root package name */
    private k2.a f6662l;

    /* renamed from: m  reason: collision with root package name */
    private long f6663m;

    /* renamed from: n  reason: collision with root package name */
    private long f6664n;

    /* renamed from: o  reason: collision with root package name */
    private long f6665o;

    /* renamed from: p  reason: collision with root package name */
    private int f6666p;

    /* renamed from: q  reason: collision with root package name */
    private g f6667q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6668r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6669s;

    /* renamed from: t  reason: collision with root package name */
    private long f6670t;

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f6651a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f6652b = j10;
        this.f6653c = new a0(10);
        this.f6654d = new e0.a();
        this.f6655e = new x();
        this.f6663m = -9223372036854775807L;
        this.f6656f = new y();
        k kVar = new k();
        this.f6657g = kVar;
        this.f6660j = kVar;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void f() {
        p3.a.h(this.f6659i);
        m0.j(this.f6658h);
    }

    private g g(m mVar) {
        long m10;
        long j10;
        long h10;
        long e10;
        g s10 = s(mVar);
        c r10 = r(this.f6662l, mVar.q());
        if (this.f6668r) {
            return new g.a();
        }
        if ((this.f6651a & 4) != 0) {
            if (r10 != null) {
                h10 = r10.h();
                e10 = r10.e();
            } else if (s10 != null) {
                h10 = s10.h();
                e10 = s10.e();
            } else {
                m10 = m(this.f6662l);
                j10 = -1;
                s10 = new b(m10, mVar.q(), j10);
            }
            j10 = e10;
            m10 = h10;
            s10 = new b(m10, mVar.q(), j10);
        } else if (r10 != null) {
            s10 = r10;
        } else if (s10 == null) {
            s10 = null;
        }
        if (s10 == null || !(s10.f() || (this.f6651a & 1) == 0)) {
            return l(mVar, (this.f6651a & 2) != 0);
        }
        return s10;
    }

    private long h(long j10) {
        return this.f6663m + ((j10 * 1000000) / this.f6654d.f14931d);
    }

    private g l(m mVar, boolean z10) {
        mVar.o(this.f6653c.d(), 0, 4);
        this.f6653c.O(0);
        this.f6654d.a(this.f6653c.m());
        return new a(mVar.a(), mVar.q(), this.f6654d, z10);
    }

    private static long m(k2.a aVar) {
        if (aVar != null) {
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                a.b c10 = aVar.c(i10);
                if (c10 instanceof p2.m) {
                    p2.m mVar = (p2.m) c10;
                    if (mVar.f12227n.equals("TLEN")) {
                        return m0.A0(Long.parseLong(mVar.f12239p));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static int n(a0 a0Var, int i10) {
        if (a0Var.f() >= i10 + 4) {
            a0Var.O(i10);
            int m10 = a0Var.m();
            if (m10 == 1483304551 || m10 == 1231971951) {
                return m10;
            }
        }
        if (a0Var.f() >= 40) {
            a0Var.O(36);
            return a0Var.m() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean o(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] p() {
        return new l[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c r(k2.a aVar, long j10) {
        if (aVar != null) {
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                a.b c10 = aVar.c(i10);
                if (c10 instanceof p2.k) {
                    return c.a(j10, (p2.k) c10, m(aVar));
                }
            }
            return null;
        }
        return null;
    }

    private g s(m mVar) {
        a0 a0Var = new a0(this.f6654d.f14930c);
        mVar.o(a0Var.d(), 0, this.f6654d.f14930c);
        e0.a aVar = this.f6654d;
        int i10 = aVar.f14928a & 1;
        int i11 = 21;
        int i12 = aVar.f14932e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int n10 = n(a0Var, i13);
        if (n10 != 1483304551 && n10 != 1231971951) {
            if (n10 != 1447187017) {
                mVar.g();
                return null;
            }
            h a10 = h.a(mVar.a(), mVar.q(), this.f6654d, a0Var);
            mVar.h(this.f6654d.f14930c);
            return a10;
        }
        i a11 = i.a(mVar.a(), mVar.q(), this.f6654d, a0Var);
        if (a11 != null && !this.f6655e.a()) {
            mVar.g();
            mVar.p(i13 + 141);
            mVar.o(this.f6653c.d(), 0, 3);
            this.f6653c.O(0);
            this.f6655e.d(this.f6653c.F());
        }
        mVar.h(this.f6654d.f14930c);
        return (a11 == null || a11.f() || n10 != 1231971951) ? a11 : l(mVar, false);
    }

    private boolean t(m mVar) {
        g gVar = this.f6667q;
        if (gVar != null) {
            long e10 = gVar.e();
            if (e10 != -1 && mVar.m() > e10 - 4) {
                return true;
            }
        }
        try {
            return !mVar.l(this.f6653c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int u(m mVar) {
        if (this.f6661k == 0) {
            try {
                w(mVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f6667q == null) {
            g g10 = g(mVar);
            this.f6667q = g10;
            this.f6658h.t(g10);
            this.f6660j.e(new m1.b().e0(this.f6654d.f14929b).W(4096).H(this.f6654d.f14932e).f0(this.f6654d.f14931d).N(this.f6655e.f16297a).O(this.f6655e.f16298b).X((this.f6651a & 8) != 0 ? null : this.f6662l).E());
            this.f6665o = mVar.q();
        } else if (this.f6665o != 0) {
            long q10 = mVar.q();
            long j10 = this.f6665o;
            if (q10 < j10) {
                mVar.h((int) (j10 - q10));
            }
        }
        return v(mVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int v(m mVar) {
        e0.a aVar;
        if (this.f6666p == 0) {
            mVar.g();
            if (t(mVar)) {
                return -1;
            }
            this.f6653c.O(0);
            int m10 = this.f6653c.m();
            if (!o(m10, this.f6661k) || e0.j(m10) == -1) {
                mVar.h(1);
                this.f6661k = 0;
                return 0;
            }
            this.f6654d.a(m10);
            if (this.f6663m == -9223372036854775807L) {
                this.f6663m = this.f6667q.d(mVar.q());
                if (this.f6652b != -9223372036854775807L) {
                    this.f6663m += this.f6652b - this.f6667q.d(0L);
                }
            }
            this.f6666p = this.f6654d.f14930c;
            g gVar = this.f6667q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(h(this.f6664n + aVar.f14934g), mVar.q() + this.f6654d.f14930c);
                if (this.f6669s && bVar.a(this.f6670t)) {
                    this.f6669s = false;
                    this.f6660j = this.f6659i;
                }
            }
        }
        int f10 = this.f6660j.f(mVar, this.f6666p, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f6666p - f10;
        this.f6666p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f6660j.c(h(this.f6664n), 1, this.f6654d.f14930c, 0, null);
        this.f6664n += this.f6654d.f14934g;
        this.f6666p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r13 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r12.h(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        r12.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r11.f6661k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean w(x1.m r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.g()
            long r1 = r12.q()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f6651a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            p2.h$a r1 = e2.f.f6650v
        L27:
            x1.y r5 = r11.f6656f
            k2.a r1 = r5.a(r12, r1)
            r11.f6662l = r1
            if (r1 == 0) goto L36
            x1.x r5 = r11.f6655e
            r5.c(r1)
        L36:
            long r5 = r12.m()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.h(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.t(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            p3.a0 r8 = r11.f6653c
            r8.O(r4)
            p3.a0 r8 = r11.f6653c
            int r8 = r8.m()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = o(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = u1.e0.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            s1.h2 r12 = s1.h2.a(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.g()
            int r6 = r1 + r5
            r12.p(r6)
            goto L8c
        L89:
            r12.h(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            u1.e0$a r5 = r11.f6654d
            r5.a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.h(r1)
            goto La8
        La5:
            r12.g()
        La8:
            r11.f6661k = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.p(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f.w(x1.m, boolean):boolean");
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f6661k = 0;
        this.f6663m = -9223372036854775807L;
        this.f6664n = 0L;
        this.f6666p = 0;
        this.f6670t = j11;
        g gVar = this.f6667q;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f6669s = true;
        this.f6660j = this.f6657g;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f6658h = nVar;
        x1.e0 e10 = nVar.e(0, 1);
        this.f6659i = e10;
        this.f6660j = e10;
        this.f6658h.i();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        f();
        int u10 = u(mVar);
        if (u10 == -1 && (this.f6667q instanceof b)) {
            long h10 = h(this.f6664n);
            if (this.f6667q.h() != h10) {
                ((b) this.f6667q).c(h10);
                this.f6658h.t(this.f6667q);
            }
        }
        return u10;
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return w(mVar, true);
    }

    public void k() {
        this.f6668r = true;
    }
}
