package u2;

import java.io.IOException;
import s1.d3;
import u2.r;
import u2.u;
/* loaded from: classes.dex */
public final class o implements r, r.a {

    /* renamed from: n  reason: collision with root package name */
    public final u.b f15316n;

    /* renamed from: o  reason: collision with root package name */
    private final long f15317o;

    /* renamed from: p  reason: collision with root package name */
    private final o3.b f15318p;

    /* renamed from: q  reason: collision with root package name */
    private u f15319q;

    /* renamed from: r  reason: collision with root package name */
    private r f15320r;

    /* renamed from: s  reason: collision with root package name */
    private r.a f15321s;

    /* renamed from: t  reason: collision with root package name */
    private a f15322t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f15323u;

    /* renamed from: v  reason: collision with root package name */
    private long f15324v = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a {
        void a(u.b bVar);

        void b(u.b bVar, IOException iOException);
    }

    public o(u.b bVar, o3.b bVar2, long j10) {
        this.f15316n = bVar;
        this.f15318p = bVar2;
        this.f15317o = j10;
    }

    private long u(long j10) {
        long j11 = this.f15324v;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        r rVar = this.f15320r;
        return rVar != null && rVar.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return ((r) p3.m0.j(this.f15320r)).c();
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        return ((r) p3.m0.j(this.f15320r)).d(j10, d3Var);
    }

    public void e(u.b bVar) {
        long u10 = u(this.f15317o);
        r n10 = ((u) p3.a.e(this.f15319q)).n(bVar, this.f15318p, u10);
        this.f15320r = n10;
        if (this.f15321s != null) {
            n10.k(this, u10);
        }
    }

    @Override // u2.r, u2.o0
    public long f() {
        return ((r) p3.m0.j(this.f15320r)).f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        r rVar = this.f15320r;
        return rVar != null && rVar.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        ((r) p3.m0.j(this.f15320r)).h(j10);
    }

    public long i() {
        return this.f15324v;
    }

    @Override // u2.r.a
    public void j(r rVar) {
        ((r.a) p3.m0.j(this.f15321s)).j(this);
        a aVar = this.f15322t;
        if (aVar != null) {
            aVar.a(this.f15316n);
        }
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.f15321s = aVar;
        r rVar = this.f15320r;
        if (rVar != null) {
            rVar.k(this, u(this.f15317o));
        }
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f15324v;
        if (j12 == -9223372036854775807L || j10 != this.f15317o) {
            j11 = j10;
        } else {
            this.f15324v = -9223372036854775807L;
            j11 = j12;
        }
        return ((r) p3.m0.j(this.f15320r)).m(tVarArr, zArr, n0VarArr, zArr2, j11);
    }

    @Override // u2.r
    public long n() {
        return ((r) p3.m0.j(this.f15320r)).n();
    }

    @Override // u2.r
    public v0 p() {
        return ((r) p3.m0.j(this.f15320r)).p();
    }

    @Override // u2.r
    public void q() {
        try {
            r rVar = this.f15320r;
            if (rVar != null) {
                rVar.q();
            } else {
                u uVar = this.f15319q;
                if (uVar != null) {
                    uVar.f();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f15322t;
            if (aVar == null) {
                throw e10;
            }
            if (this.f15323u) {
                return;
            }
            this.f15323u = true;
            aVar.b(this.f15316n, e10);
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        ((r) p3.m0.j(this.f15320r)).r(j10, z10);
    }

    @Override // u2.r
    public long s(long j10) {
        return ((r) p3.m0.j(this.f15320r)).s(j10);
    }

    public long t() {
        return this.f15317o;
    }

    @Override // u2.o0.a
    /* renamed from: v */
    public void o(r rVar) {
        ((r.a) p3.m0.j(this.f15321s)).o(this);
    }

    public void w(long j10) {
        this.f15324v = j10;
    }

    public void x() {
        if (this.f15320r != null) {
            ((u) p3.a.e(this.f15319q)).b(this.f15320r);
        }
    }

    public void y(u uVar) {
        p3.a.f(this.f15319q == null);
        this.f15319q = uVar;
    }
}
