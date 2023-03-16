package e2;

import p3.a0;
import p3.m0;
import p3.r;
import u1.e0;
import x1.b0;
import x1.c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f6675a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6676b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6677c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6678d;

    /* renamed from: e  reason: collision with root package name */
    private final long f6679e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f6680f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f6675a = j10;
        this.f6676b = i10;
        this.f6677c = j11;
        this.f6680f = jArr;
        this.f6678d = j12;
        this.f6679e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static i a(long j10, long j11, e0.a aVar, a0 a0Var) {
        int G;
        int i10 = aVar.f14934g;
        int i11 = aVar.f14931d;
        int m10 = a0Var.m();
        if ((m10 & 1) != 1 || (G = a0Var.G()) == 0) {
            return null;
        }
        long M0 = m0.M0(G, i10 * 1000000, i11);
        if ((m10 & 6) != 6) {
            return new i(j11, aVar.f14930c, M0);
        }
        long E = a0Var.E();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = a0Var.C();
        }
        if (j10 != -1) {
            long j12 = j11 + E;
            if (j10 != j12) {
                r.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new i(j11, aVar.f14930c, M0, E, jArr);
    }

    private long b(int i10) {
        return (this.f6677c * i10) / 100;
    }

    @Override // e2.g
    public long d(long j10) {
        long j11 = j10 - this.f6675a;
        if (!f() || j11 <= this.f6676b) {
            return 0L;
        }
        long[] jArr = (long[]) p3.a.h(this.f6680f);
        double d10 = (j11 * 256.0d) / this.f6678d;
        int i10 = m0.i(jArr, (long) d10, true, true);
        long b10 = b(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long b11 = b(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return b10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (b11 - b10));
    }

    @Override // e2.g
    public long e() {
        return this.f6679e;
    }

    @Override // x1.b0
    public boolean f() {
        return this.f6680f != null;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        long[] jArr;
        if (f()) {
            long r10 = m0.r(j10, 0L, this.f6677c);
            double d10 = (r10 * 100.0d) / this.f6677c;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                if (d10 >= 100.0d) {
                    d11 = 256.0d;
                } else {
                    int i10 = (int) d10;
                    double d12 = ((long[]) p3.a.h(this.f6680f))[i10];
                    d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
                }
            }
            return new b0.a(new c0(r10, this.f6675a + m0.r(Math.round((d11 / 256.0d) * this.f6678d), this.f6676b, this.f6678d - 1)));
        }
        return new b0.a(new c0(0L, this.f6675a + this.f6676b));
    }

    @Override // x1.b0
    public long h() {
        return this.f6677c;
    }
}
