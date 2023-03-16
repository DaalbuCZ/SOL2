package d3;

import java.util.List;
/* loaded from: classes.dex */
public abstract class m extends v1.h implements h {

    /* renamed from: q  reason: collision with root package name */
    private h f6552q;

    /* renamed from: r  reason: collision with root package name */
    private long f6553r;

    @Override // d3.h
    public int e(long j10) {
        return ((h) p3.a.e(this.f6552q)).e(j10 - this.f6553r);
    }

    @Override // d3.h
    public long g(int i10) {
        return ((h) p3.a.e(this.f6552q)).g(i10) + this.f6553r;
    }

    @Override // d3.h
    public List<b> h(long j10) {
        return ((h) p3.a.e(this.f6552q)).h(j10 - this.f6553r);
    }

    @Override // d3.h
    public int j() {
        return ((h) p3.a.e(this.f6552q)).j();
    }

    @Override // v1.a
    public void m() {
        super.m();
        this.f6552q = null;
    }

    public void y(long j10, h hVar, long j11) {
        this.f15544o = j10;
        this.f6552q = hVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f6553r = j10;
    }
}
