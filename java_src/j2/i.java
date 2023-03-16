package j2;

import java.nio.ByteBuffer;
import s1.m1;
import u1.e0;
/* loaded from: classes.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f10300a;

    /* renamed from: b  reason: collision with root package name */
    private long f10301b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10302c;

    private long a(long j10) {
        return this.f10300a + Math.max(0L, ((this.f10301b - 529) * 1000000) / j10);
    }

    public long b(m1 m1Var) {
        return a(m1Var.M);
    }

    public void c() {
        this.f10300a = 0L;
        this.f10301b = 0L;
        this.f10302c = false;
    }

    public long d(m1 m1Var, v1.g gVar) {
        if (this.f10301b == 0) {
            this.f10300a = gVar.f15538r;
        }
        if (this.f10302c) {
            return gVar.f15538r;
        }
        ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(gVar.f15536p);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m10 = e0.m(i10);
        if (m10 != -1) {
            long a10 = a(m1Var.M);
            this.f10301b += m10;
            return a10;
        }
        this.f10302c = true;
        this.f10301b = 0L;
        this.f10300a = gVar.f15538r;
        p3.r.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f15538r;
    }
}
