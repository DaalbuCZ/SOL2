package x1;

import p3.m0;
import x1.b0;
/* loaded from: classes.dex */
public final class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f16300a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f16301b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16302c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16303d;

    public z(long[] jArr, long[] jArr2, long j10) {
        p3.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f16303d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f16300a = jArr;
            this.f16301b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f16300a = jArr3;
            long[] jArr4 = new long[i10];
            this.f16301b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f16302c = j10;
    }

    @Override // x1.b0
    public boolean f() {
        return this.f16303d;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        if (this.f16303d) {
            int i10 = m0.i(this.f16301b, j10, true, true);
            c0 c0Var = new c0(this.f16301b[i10], this.f16300a[i10]);
            if (c0Var.f16194a == j10 || i10 == this.f16301b.length - 1) {
                return new b0.a(c0Var);
            }
            int i11 = i10 + 1;
            return new b0.a(c0Var, new c0(this.f16301b[i11], this.f16300a[i11]));
        }
        return new b0.a(c0.f16193c);
    }

    @Override // x1.b0
    public long h() {
        return this.f16302c;
    }
}
