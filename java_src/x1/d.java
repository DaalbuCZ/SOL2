package x1;

import java.util.Arrays;
import p3.m0;
import x1.b0;
/* loaded from: classes.dex */
public final class d implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f16196a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16197b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f16198c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f16199d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f16200e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16201f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f16197b = iArr;
        this.f16198c = jArr;
        this.f16199d = jArr2;
        this.f16200e = jArr3;
        int length = iArr.length;
        this.f16196a = length;
        if (length > 0) {
            this.f16201f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f16201f = 0L;
        }
    }

    public int a(long j10) {
        return m0.i(this.f16200e, j10, true, true);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int a10 = a(j10);
        c0 c0Var = new c0(this.f16200e[a10], this.f16198c[a10]);
        if (c0Var.f16194a >= j10 || a10 == this.f16196a - 1) {
            return new b0.a(c0Var);
        }
        int i10 = a10 + 1;
        return new b0.a(c0Var, new c0(this.f16200e[i10], this.f16198c[i10]));
    }

    @Override // x1.b0
    public long h() {
        return this.f16201f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f16196a + ", sizes=" + Arrays.toString(this.f16197b) + ", offsets=" + Arrays.toString(this.f16198c) + ", timeUs=" + Arrays.toString(this.f16200e) + ", durationsUs=" + Arrays.toString(this.f16199d) + ")";
    }
}
