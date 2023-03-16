package b2;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import x1.b0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: q  reason: collision with root package name */
    public static final r f2733q = b.f2732b;

    /* renamed from: f  reason: collision with root package name */
    private n f2739f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2741h;

    /* renamed from: i  reason: collision with root package name */
    private long f2742i;

    /* renamed from: j  reason: collision with root package name */
    private int f2743j;

    /* renamed from: k  reason: collision with root package name */
    private int f2744k;

    /* renamed from: l  reason: collision with root package name */
    private int f2745l;

    /* renamed from: m  reason: collision with root package name */
    private long f2746m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2747n;

    /* renamed from: o  reason: collision with root package name */
    private a f2748o;

    /* renamed from: p  reason: collision with root package name */
    private f f2749p;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f2734a = new a0(4);

    /* renamed from: b  reason: collision with root package name */
    private final a0 f2735b = new a0(9);

    /* renamed from: c  reason: collision with root package name */
    private final a0 f2736c = new a0(11);

    /* renamed from: d  reason: collision with root package name */
    private final a0 f2737d = new a0();

    /* renamed from: e  reason: collision with root package name */
    private final d f2738e = new d();

    /* renamed from: g  reason: collision with root package name */
    private int f2740g = 1;

    @RequiresNonNull({"extractorOutput"})
    private void e() {
        if (this.f2747n) {
            return;
        }
        this.f2739f.t(new b0.b(-9223372036854775807L));
        this.f2747n = true;
    }

    private long f() {
        if (this.f2741h) {
            return this.f2742i + this.f2746m;
        }
        if (this.f2738e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f2746m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] g() {
        return new l[]{new c()};
    }

    private a0 h(m mVar) {
        if (this.f2745l > this.f2737d.b()) {
            a0 a0Var = this.f2737d;
            a0Var.M(new byte[Math.max(a0Var.b() * 2, this.f2745l)], 0);
        } else {
            this.f2737d.O(0);
        }
        this.f2737d.N(this.f2745l);
        mVar.readFully(this.f2737d.d(), 0, this.f2745l);
        return this.f2737d;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean k(m mVar) {
        if (mVar.d(this.f2735b.d(), 0, 9, true)) {
            this.f2735b.O(0);
            this.f2735b.P(4);
            int C = this.f2735b.C();
            boolean z10 = (C & 4) != 0;
            boolean z11 = (C & 1) != 0;
            if (z10 && this.f2748o == null) {
                this.f2748o = new a(this.f2739f.e(8, 1));
            }
            if (z11 && this.f2749p == null) {
                this.f2749p = new f(this.f2739f.e(9, 2));
            }
            this.f2739f.i();
            this.f2743j = (this.f2735b.m() - 9) + 4;
            this.f2740g = 2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l(x1.m r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f2744k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            b2.a r7 = r9.f2748o
            if (r7 == 0) goto L24
            r9.e()
            b2.a r2 = r9.f2748o
        L1a:
            p3.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = r6
            goto L6d
        L24:
            r7 = 9
            if (r2 != r7) goto L32
            b2.f r7 = r9.f2749p
            if (r7 == 0) goto L32
            r9.e()
            b2.f r2 = r9.f2749p
            goto L1a
        L32:
            r7 = 18
            if (r2 != r7) goto L67
            boolean r2 = r9.f2747n
            if (r2 != 0) goto L67
            b2.d r2 = r9.f2738e
            p3.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
            b2.d r10 = r9.f2738e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            x1.n r10 = r9.f2739f
            x1.z r2 = new x1.z
            b2.d r7 = r9.f2738e
            long[] r7 = r7.e()
            b2.d r8 = r9.f2738e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.t(r2)
            r9.f2747n = r6
            goto L22
        L67:
            int r0 = r9.f2745l
            r10.h(r0)
            r10 = r5
        L6d:
            boolean r0 = r9.f2741h
            if (r0 != 0) goto L87
            if (r5 == 0) goto L87
            r9.f2741h = r6
            b2.d r0 = r9.f2738e
            long r0 = r0.d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L83
            long r0 = r9.f2746m
            long r0 = -r0
            goto L85
        L83:
            r0 = 0
        L85:
            r9.f2742i = r0
        L87:
            r0 = 4
            r9.f2743j = r0
            r0 = 2
            r9.f2740g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c.l(x1.m):boolean");
    }

    private boolean m(m mVar) {
        if (mVar.d(this.f2736c.d(), 0, 11, true)) {
            this.f2736c.O(0);
            this.f2744k = this.f2736c.C();
            this.f2745l = this.f2736c.F();
            this.f2746m = this.f2736c.F();
            this.f2746m = ((this.f2736c.C() << 24) | this.f2746m) * 1000;
            this.f2736c.P(3);
            this.f2740g = 4;
            return true;
        }
        return false;
    }

    private void n(m mVar) {
        mVar.h(this.f2743j);
        this.f2743j = 0;
        this.f2740g = 3;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f2740g = 1;
            this.f2741h = false;
        } else {
            this.f2740g = 3;
        }
        this.f2743j = 0;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f2739f = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        p3.a.h(this.f2739f);
        while (true) {
            int i10 = this.f2740g;
            if (i10 != 1) {
                if (i10 == 2) {
                    n(mVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(mVar)) {
                        return 0;
                    }
                } else if (!m(mVar)) {
                    return -1;
                }
            } else if (!k(mVar)) {
                return -1;
            }
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        mVar.o(this.f2734a.d(), 0, 3);
        this.f2734a.O(0);
        if (this.f2734a.F() != 4607062) {
            return false;
        }
        mVar.o(this.f2734a.d(), 0, 2);
        this.f2734a.O(0);
        if ((this.f2734a.I() & 250) != 0) {
            return false;
        }
        mVar.o(this.f2734a.d(), 0, 4);
        this.f2734a.O(0);
        int m10 = this.f2734a.m();
        mVar.g();
        mVar.p(m10);
        mVar.o(this.f2734a.d(), 0, 4);
        this.f2734a.O(0);
        return this.f2734a.m() == 0;
    }
}
