package i2;

import p3.m0;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f8279a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8280b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8281c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8282d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8283e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f8279a = cVar;
        this.f8280b = i10;
        this.f8281c = j10;
        long j12 = (j11 - j10) / cVar.f8274e;
        this.f8282d = j12;
        this.f8283e = a(j12);
    }

    private long a(long j10) {
        return m0.M0(j10 * this.f8280b, 1000000L, this.f8279a.f8272c);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        long r10 = m0.r((this.f8279a.f8272c * j10) / (this.f8280b * 1000000), 0L, this.f8282d - 1);
        long j11 = this.f8281c + (this.f8279a.f8274e * r10);
        long a10 = a(r10);
        c0 c0Var = new c0(a10, j11);
        if (a10 >= j10 || r10 == this.f8282d - 1) {
            return new b0.a(c0Var);
        }
        long j12 = r10 + 1;
        return new b0.a(c0Var, new c0(a(j12), this.f8281c + (this.f8279a.f8274e * j12)));
    }

    @Override // x1.b0
    public long h() {
        return this.f8283e;
    }
}
