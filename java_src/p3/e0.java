package p3;

import s1.o2;
/* loaded from: classes.dex */
public final class e0 implements t {

    /* renamed from: n  reason: collision with root package name */
    private final d f12262n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12263o;

    /* renamed from: p  reason: collision with root package name */
    private long f12264p;

    /* renamed from: q  reason: collision with root package name */
    private long f12265q;

    /* renamed from: r  reason: collision with root package name */
    private o2 f12266r = o2.f13648q;

    public e0(d dVar) {
        this.f12262n = dVar;
    }

    public void a(long j10) {
        this.f12264p = j10;
        if (this.f12263o) {
            this.f12265q = this.f12262n.b();
        }
    }

    public void b() {
        if (this.f12263o) {
            return;
        }
        this.f12265q = this.f12262n.b();
        this.f12263o = true;
    }

    public void c() {
        if (this.f12263o) {
            a(z());
            this.f12263o = false;
        }
    }

    @Override // p3.t
    public void d(o2 o2Var) {
        if (this.f12263o) {
            a(z());
        }
        this.f12266r = o2Var;
    }

    @Override // p3.t
    public o2 j() {
        return this.f12266r;
    }

    @Override // p3.t
    public long z() {
        long j10 = this.f12264p;
        if (this.f12263o) {
            long b10 = this.f12262n.b() - this.f12265q;
            o2 o2Var = this.f12266r;
            return j10 + (o2Var.f13650n == 1.0f ? m0.A0(b10) : o2Var.b(b10));
        }
        return j10;
    }
}
