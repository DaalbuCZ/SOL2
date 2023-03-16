package h2;

import p3.m0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    private boolean f8069c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8070d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8071e;

    /* renamed from: a  reason: collision with root package name */
    private final p3.i0 f8067a = new p3.i0(0);

    /* renamed from: f  reason: collision with root package name */
    private long f8072f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f8073g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f8074h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f8068b = new p3.a0();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(x1.m mVar) {
        this.f8068b.L(m0.f12311f);
        this.f8069c = true;
        mVar.g();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(x1.m mVar, x1.a0 a0Var) {
        int min = (int) Math.min(20000L, mVar.a());
        long j10 = 0;
        if (mVar.q() != j10) {
            a0Var.f16188a = j10;
            return 1;
        }
        this.f8068b.K(min);
        mVar.g();
        mVar.o(this.f8068b.d(), 0, min);
        this.f8072f = i(this.f8068b);
        this.f8070d = true;
        return 0;
    }

    private long i(p3.a0 a0Var) {
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10 - 3; e10++) {
            if (f(a0Var.d(), e10) == 442) {
                a0Var.O(e10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(x1.m mVar, x1.a0 a0Var) {
        long a10 = mVar.a();
        int min = (int) Math.min(20000L, a10);
        long j10 = a10 - min;
        if (mVar.q() != j10) {
            a0Var.f16188a = j10;
            return 1;
        }
        this.f8068b.K(min);
        mVar.g();
        mVar.o(this.f8068b.d(), 0, min);
        this.f8073g = k(this.f8068b);
        this.f8071e = true;
        return 0;
    }

    private long k(p3.a0 a0Var) {
        int e10 = a0Var.e();
        for (int f10 = a0Var.f() - 4; f10 >= e10; f10--) {
            if (f(a0Var.d(), f10) == 442) {
                a0Var.O(f10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(p3.a0 a0Var) {
        int e10 = a0Var.e();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.j(bArr, 0, 9);
        a0Var.O(e10);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f8074h;
    }

    public p3.i0 d() {
        return this.f8067a;
    }

    public boolean e() {
        return this.f8069c;
    }

    public int g(x1.m mVar, x1.a0 a0Var) {
        if (this.f8071e) {
            if (this.f8073g == -9223372036854775807L) {
                return b(mVar);
            }
            if (this.f8070d) {
                long j10 = this.f8072f;
                if (j10 == -9223372036854775807L) {
                    return b(mVar);
                }
                long b10 = this.f8067a.b(this.f8073g) - this.f8067a.b(j10);
                this.f8074h = b10;
                if (b10 < 0) {
                    p3.r.i("PsDurationReader", "Invalid duration: " + this.f8074h + ". Using TIME_UNSET instead.");
                    this.f8074h = -9223372036854775807L;
                }
                return b(mVar);
            }
            return h(mVar, a0Var);
        }
        return j(mVar, a0Var);
    }
}
