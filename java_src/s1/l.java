package s1;
/* loaded from: classes.dex */
final class l implements p3.t {

    /* renamed from: n  reason: collision with root package name */
    private final p3.e0 f13528n;

    /* renamed from: o  reason: collision with root package name */
    private final a f13529o;

    /* renamed from: p  reason: collision with root package name */
    private y2 f13530p;

    /* renamed from: q  reason: collision with root package name */
    private p3.t f13531q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13532r = true;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13533s;

    /* loaded from: classes.dex */
    public interface a {
        void p(o2 o2Var);
    }

    public l(a aVar, p3.d dVar) {
        this.f13529o = aVar;
        this.f13528n = new p3.e0(dVar);
    }

    private boolean e(boolean z10) {
        y2 y2Var = this.f13530p;
        return y2Var == null || y2Var.b() || (!this.f13530p.i() && (z10 || this.f13530p.m()));
    }

    private void i(boolean z10) {
        if (e(z10)) {
            this.f13532r = true;
            if (this.f13533s) {
                this.f13528n.b();
                return;
            }
            return;
        }
        p3.t tVar = (p3.t) p3.a.e(this.f13531q);
        long z11 = tVar.z();
        if (this.f13532r) {
            if (z11 < this.f13528n.z()) {
                this.f13528n.c();
                return;
            }
            this.f13532r = false;
            if (this.f13533s) {
                this.f13528n.b();
            }
        }
        this.f13528n.a(z11);
        o2 j10 = tVar.j();
        if (j10.equals(this.f13528n.j())) {
            return;
        }
        this.f13528n.d(j10);
        this.f13529o.p(j10);
    }

    public void a(y2 y2Var) {
        if (y2Var == this.f13530p) {
            this.f13531q = null;
            this.f13530p = null;
            this.f13532r = true;
        }
    }

    public void b(y2 y2Var) {
        p3.t tVar;
        p3.t x10 = y2Var.x();
        if (x10 == null || x10 == (tVar = this.f13531q)) {
            return;
        }
        if (tVar != null) {
            throw q.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f13531q = x10;
        this.f13530p = y2Var;
        x10.d(this.f13528n.j());
    }

    public void c(long j10) {
        this.f13528n.a(j10);
    }

    @Override // p3.t
    public void d(o2 o2Var) {
        p3.t tVar = this.f13531q;
        if (tVar != null) {
            tVar.d(o2Var);
            o2Var = this.f13531q.j();
        }
        this.f13528n.d(o2Var);
    }

    public void f() {
        this.f13533s = true;
        this.f13528n.b();
    }

    public void g() {
        this.f13533s = false;
        this.f13528n.c();
    }

    public long h(boolean z10) {
        i(z10);
        return z();
    }

    @Override // p3.t
    public o2 j() {
        p3.t tVar = this.f13531q;
        return tVar != null ? tVar.j() : this.f13528n.j();
    }

    @Override // p3.t
    public long z() {
        return this.f13532r ? this.f13528n.z() : ((p3.t) p3.a.e(this.f13531q)).z();
    }
}
