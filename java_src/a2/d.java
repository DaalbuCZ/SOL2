package a2;

import p3.a0;
import p3.m0;
import x1.b0;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: o  reason: collision with root package name */
    public static final r f43o = c.f42b;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f44a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f45b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f47d;

    /* renamed from: e  reason: collision with root package name */
    private n f48e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f49f;

    /* renamed from: g  reason: collision with root package name */
    private int f50g;

    /* renamed from: h  reason: collision with root package name */
    private k2.a f51h;

    /* renamed from: i  reason: collision with root package name */
    private v f52i;

    /* renamed from: j  reason: collision with root package name */
    private int f53j;

    /* renamed from: k  reason: collision with root package name */
    private int f54k;

    /* renamed from: l  reason: collision with root package name */
    private b f55l;

    /* renamed from: m  reason: collision with root package name */
    private int f56m;

    /* renamed from: n  reason: collision with root package name */
    private long f57n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f44a = new byte[42];
        this.f45b = new a0(new byte[32768], 0);
        this.f46c = (i10 & 1) != 0;
        this.f47d = new s.a();
        this.f50g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.O(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.f47d.f16277a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long e(p3.a0 r5, boolean r6) {
        /*
            r4 = this;
            x1.v r0 = r4.f52i
            p3.a.e(r0)
            int r0 = r5.e()
        L9:
            int r1 = r5.f()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.O(r0)
            x1.v r1 = r4.f52i
            int r2 = r4.f54k
            x1.s$a r3 = r4.f47d
            boolean r1 = x1.s.d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.O(r0)
            x1.s$a r5 = r4.f47d
            long r5 = r5.f16277a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.f()
            int r1 = r4.f53j
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.O(r0)
            r6 = 0
            x1.v r1 = r4.f52i     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.f54k     // Catch: java.lang.IndexOutOfBoundsException -> L45
            x1.s$a r3 = r4.f47d     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = x1.s.d(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = r6
        L46:
            int r2 = r5.e()
            int r3 = r5.f()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.f()
            r5.O(r6)
            goto L63
        L60:
            r5.O(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.e(p3.a0, boolean):long");
    }

    private void f(m mVar) {
        this.f54k = t.b(mVar);
        ((n) m0.j(this.f48e)).t(g(mVar.q(), mVar.a()));
        this.f50g = 5;
    }

    private b0 g(long j10, long j11) {
        p3.a.e(this.f52i);
        v vVar = this.f52i;
        if (vVar.f16291k != null) {
            return new u(vVar, j10);
        }
        if (j11 == -1 || vVar.f16290j <= 0) {
            return new b0.b(vVar.f());
        }
        b bVar = new b(vVar, this.f54k, j10, j11);
        this.f55l = bVar;
        return bVar.b();
    }

    private void h(m mVar) {
        byte[] bArr = this.f44a;
        mVar.o(bArr, 0, bArr.length);
        mVar.g();
        this.f50g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] k() {
        return new l[]{new d()};
    }

    private void l() {
        ((e0) m0.j(this.f49f)).c((this.f57n * 1000000) / ((v) m0.j(this.f52i)).f16285e, 1, this.f56m, 0, null);
    }

    private int m(m mVar, x1.a0 a0Var) {
        boolean z10;
        p3.a.e(this.f49f);
        p3.a.e(this.f52i);
        b bVar = this.f55l;
        if (bVar == null || !bVar.d()) {
            if (this.f57n == -1) {
                this.f57n = s.i(mVar, this.f52i);
                return 0;
            }
            int f10 = this.f45b.f();
            if (f10 < 32768) {
                int b10 = mVar.b(this.f45b.d(), f10, 32768 - f10);
                z10 = b10 == -1;
                if (!z10) {
                    this.f45b.N(f10 + b10);
                } else if (this.f45b.a() == 0) {
                    l();
                    return -1;
                }
            } else {
                z10 = false;
            }
            int e10 = this.f45b.e();
            int i10 = this.f56m;
            int i11 = this.f53j;
            if (i10 < i11) {
                a0 a0Var2 = this.f45b;
                a0Var2.P(Math.min(i11 - i10, a0Var2.a()));
            }
            long e11 = e(this.f45b, z10);
            int e12 = this.f45b.e() - e10;
            this.f45b.O(e10);
            this.f49f.d(this.f45b, e12);
            this.f56m += e12;
            if (e11 != -1) {
                l();
                this.f56m = 0;
                this.f57n = e11;
            }
            if (this.f45b.a() < 16) {
                int a10 = this.f45b.a();
                System.arraycopy(this.f45b.d(), this.f45b.e(), this.f45b.d(), 0, a10);
                this.f45b.O(0);
                this.f45b.N(a10);
            }
            return 0;
        }
        return this.f55l.c(mVar, a0Var);
    }

    private void n(m mVar) {
        this.f51h = t.d(mVar, !this.f46c);
        this.f50g = 1;
    }

    private void o(m mVar) {
        t.a aVar = new t.a(this.f52i);
        boolean z10 = false;
        while (!z10) {
            z10 = t.e(mVar, aVar);
            this.f52i = (v) m0.j(aVar.f16278a);
        }
        p3.a.e(this.f52i);
        this.f53j = Math.max(this.f52i.f16283c, 6);
        ((e0) m0.j(this.f49f)).e(this.f52i.g(this.f44a, this.f51h));
        this.f50g = 4;
    }

    private void p(m mVar) {
        t.i(mVar);
        this.f50g = 3;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f50g = 0;
        } else {
            b bVar = this.f55l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f57n = j11 != 0 ? -1L : 0L;
        this.f56m = 0;
        this.f45b.K(0);
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f48e = nVar;
        this.f49f = nVar.e(0, 1);
        nVar.i();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        int i10 = this.f50g;
        if (i10 == 0) {
            n(mVar);
            return 0;
        } else if (i10 == 1) {
            h(mVar);
            return 0;
        } else if (i10 == 2) {
            p(mVar);
            return 0;
        } else if (i10 == 3) {
            o(mVar);
            return 0;
        } else if (i10 == 4) {
            f(mVar);
            return 0;
        } else if (i10 == 5) {
            return m(mVar, a0Var);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        t.c(mVar, false);
        return t.a(mVar);
    }
}
