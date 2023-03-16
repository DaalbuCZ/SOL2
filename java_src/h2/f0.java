package h2;

import p3.m0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f7776a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7779d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7780e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7781f;

    /* renamed from: b  reason: collision with root package name */
    private final p3.i0 f7777b = new p3.i0(0);

    /* renamed from: g  reason: collision with root package name */
    private long f7782g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f7783h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f7784i = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f7778c = new p3.a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i10) {
        this.f7776a = i10;
    }

    private int a(x1.m mVar) {
        this.f7778c.L(m0.f12311f);
        this.f7779d = true;
        mVar.g();
        return 0;
    }

    private int f(x1.m mVar, x1.a0 a0Var, int i10) {
        int min = (int) Math.min(this.f7776a, mVar.a());
        long j10 = 0;
        if (mVar.q() != j10) {
            a0Var.f16188a = j10;
            return 1;
        }
        this.f7778c.K(min);
        mVar.g();
        mVar.o(this.f7778c.d(), 0, min);
        this.f7782g = g(this.f7778c, i10);
        this.f7780e = true;
        return 0;
    }

    private long g(p3.a0 a0Var, int i10) {
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10; e10++) {
            if (a0Var.d()[e10] == 71) {
                long c10 = j0.c(a0Var, e10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(x1.m mVar, x1.a0 a0Var, int i10) {
        long a10 = mVar.a();
        int min = (int) Math.min(this.f7776a, a10);
        long j10 = a10 - min;
        if (mVar.q() != j10) {
            a0Var.f16188a = j10;
            return 1;
        }
        this.f7778c.K(min);
        mVar.g();
        mVar.o(this.f7778c.d(), 0, min);
        this.f7783h = i(this.f7778c, i10);
        this.f7781f = true;
        return 0;
    }

    private long i(p3.a0 a0Var, int i10) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        for (int i11 = f10 - 188; i11 >= e10; i11--) {
            if (j0.b(a0Var.d(), e10, f10, i11)) {
                long c10 = j0.c(a0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f7784i;
    }

    public p3.i0 c() {
        return this.f7777b;
    }

    public boolean d() {
        return this.f7779d;
    }

    public int e(x1.m mVar, x1.a0 a0Var, int i10) {
        if (i10 <= 0) {
            return a(mVar);
        }
        if (this.f7781f) {
            if (this.f7783h == -9223372036854775807L) {
                return a(mVar);
            }
            if (this.f7780e) {
                long j10 = this.f7782g;
                if (j10 == -9223372036854775807L) {
                    return a(mVar);
                }
                long b10 = this.f7777b.b(this.f7783h) - this.f7777b.b(j10);
                this.f7784i = b10;
                if (b10 < 0) {
                    p3.r.i("TsDurationReader", "Invalid duration: " + this.f7784i + ". Using TIME_UNSET instead.");
                    this.f7784i = -9223372036854775807L;
                }
                return a(mVar);
            }
            return f(mVar, a0Var, i10);
        }
        return h(mVar, a0Var, i10);
    }
}
