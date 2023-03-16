package w2;

import s1.m1;
import x1.e0;
/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f16046o;

    /* renamed from: p  reason: collision with root package name */
    private final m1 f16047p;

    /* renamed from: q  reason: collision with root package name */
    private long f16048q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f16049r;

    public p(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, int i11, m1 m1Var2) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f16046o = i11;
        this.f16047p = m1Var2;
    }

    @Override // o3.h0.e
    public void b() {
        c j10 = j();
        j10.b(0L);
        e0 e10 = j10.e(0, this.f16046o);
        e10.e(this.f16047p);
        try {
            long n10 = this.f16011i.n(this.f16004b.e(this.f16048q));
            if (n10 != -1) {
                n10 += this.f16048q;
            }
            x1.f fVar = new x1.f(this.f16011i, this.f16048q, n10);
            for (int i10 = 0; i10 != -1; i10 = e10.f(fVar, Integer.MAX_VALUE, true)) {
                this.f16048q += i10;
            }
            e10.c(this.f16009g, 1, (int) this.f16048q, 0, null);
            o3.o.a(this.f16011i);
            this.f16049r = true;
        } catch (Throwable th) {
            o3.o.a(this.f16011i);
            throw th;
        }
    }

    @Override // o3.h0.e
    public void c() {
    }

    @Override // w2.n
    public boolean h() {
        return this.f16049r;
    }
}
