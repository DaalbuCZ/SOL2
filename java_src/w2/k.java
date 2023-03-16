package w2;

import o3.o0;
import s1.m1;
import w2.g;
/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f16032o;

    /* renamed from: p  reason: collision with root package name */
    private final long f16033p;

    /* renamed from: q  reason: collision with root package name */
    private final g f16034q;

    /* renamed from: r  reason: collision with root package name */
    private long f16035r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f16036s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f16037t;

    public k(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f16032o = i11;
        this.f16033p = j15;
        this.f16034q = gVar;
    }

    @Override // o3.h0.e
    public final void b() {
        if (this.f16035r == 0) {
            c j10 = j();
            j10.b(this.f16033p);
            g gVar = this.f16034q;
            g.b l10 = l(j10);
            long j11 = this.f15975k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f16033p;
            long j13 = this.f15976l;
            gVar.c(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f16033p);
        }
        try {
            o3.p e10 = this.f16004b.e(this.f16035r);
            o0 o0Var = this.f16011i;
            x1.f fVar = new x1.f(o0Var, e10.f12040g, o0Var.n(e10));
            while (!this.f16036s && this.f16034q.b(fVar)) {
            }
            this.f16035r = fVar.q() - this.f16004b.f12040g;
            o3.o.a(this.f16011i);
            this.f16037t = !this.f16036s;
        } catch (Throwable th) {
            o3.o.a(this.f16011i);
            throw th;
        }
    }

    @Override // o3.h0.e
    public final void c() {
        this.f16036s = true;
    }

    @Override // w2.n
    public long g() {
        return this.f16044j + this.f16032o;
    }

    @Override // w2.n
    public boolean h() {
        return this.f16037t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
