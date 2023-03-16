package e2;

import p3.a0;
import p3.m0;
import p3.r;
import u1.e0;
import x1.b0;
import x1.c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f6671a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f6672b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6673c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6674d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f6671a = jArr;
        this.f6672b = jArr2;
        this.f6673c = j10;
        this.f6674d = j11;
    }

    public static h a(long j10, long j11, e0.a aVar, a0 a0Var) {
        int C;
        a0Var.P(10);
        int m10 = a0Var.m();
        if (m10 <= 0) {
            return null;
        }
        int i10 = aVar.f14931d;
        long M0 = m0.M0(m10, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int I = a0Var.I();
        int I2 = a0Var.I();
        int I3 = a0Var.I();
        a0Var.P(2);
        long j12 = j11 + aVar.f14930c;
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        int i11 = 0;
        long j13 = j11;
        while (i11 < I) {
            int i12 = I2;
            long j14 = j12;
            jArr[i11] = (i11 * M0) / I;
            jArr2[i11] = Math.max(j13, j14);
            if (I3 == 1) {
                C = a0Var.C();
            } else if (I3 == 2) {
                C = a0Var.I();
            } else if (I3 == 3) {
                C = a0Var.F();
            } else if (I3 != 4) {
                return null;
            } else {
                C = a0Var.G();
            }
            j13 += C * i12;
            i11++;
            jArr = jArr;
            I2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            r.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr3, jArr2, M0, j13);
    }

    @Override // e2.g
    public long d(long j10) {
        return this.f6671a[m0.i(this.f6672b, j10, true, true)];
    }

    @Override // e2.g
    public long e() {
        return this.f6674d;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int i10 = m0.i(this.f6671a, j10, true, true);
        c0 c0Var = new c0(this.f6671a[i10], this.f6672b[i10]);
        if (c0Var.f16194a >= j10 || i10 == this.f6671a.length - 1) {
            return new b0.a(c0Var);
        }
        int i11 = i10 + 1;
        return new b0.a(c0Var, new c0(this.f6671a[i11], this.f6672b[i11]));
    }

    @Override // x1.b0
    public long h() {
        return this.f6673c;
    }
}
