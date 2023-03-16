package e2;

import android.util.Pair;
import p2.k;
import p3.m0;
import x1.b0;
import x1.c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f6644a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f6645b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6646c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f6644a = jArr;
        this.f6645b = jArr2;
        this.f6646c = j10 == -9223372036854775807L ? m0.A0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, k kVar, long j11) {
        int length = kVar.f12234r.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += kVar.f12232p + kVar.f12234r[i12];
            j12 += kVar.f12233q + kVar.f12235s[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int i10 = m0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i11];
            long j14 = jArr2[i11];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // e2.g
    public long d(long j10) {
        return m0.A0(((Long) b(j10, this.f6644a, this.f6645b).second).longValue());
    }

    @Override // e2.g
    public long e() {
        return -1L;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        Pair<Long, Long> b10 = b(m0.X0(m0.r(j10, 0L, this.f6646c)), this.f6645b, this.f6644a);
        return new b0.a(new c0(m0.A0(((Long) b10.first).longValue()), ((Long) b10.second).longValue()));
    }

    @Override // x1.b0
    public long h() {
        return this.f6646c;
    }
}
