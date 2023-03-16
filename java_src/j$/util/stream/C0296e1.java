package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0296e1 extends AbstractC0316i1 implements J0 {
    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.K(this, consumer);
    }

    @Override // j$.util.stream.P0
    /* renamed from: b */
    public /* synthetic */ void m(Double[] dArr, int i10) {
        D0.H(this, dArr, i10);
    }

    @Override // j$.util.stream.AbstractC0316i1, j$.util.stream.P0
    /* renamed from: c */
    public /* synthetic */ J0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.N(this, j10, j11);
    }

    @Override // j$.util.stream.AbstractC0316i1, j$.util.stream.P0
    public O0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.O0
    public Object k() {
        double[] dArr;
        dArr = D0.f9796g;
        return dArr;
    }

    @Override // j$.util.stream.P0
    public j$.util.F spliterator() {
        return j$.util.W.b();
    }

    @Override // j$.util.stream.AbstractC0316i1, j$.util.stream.P0
    public /* bridge */ /* synthetic */ P0 f(int i10) {
        f(i10);
        throw null;
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return j$.util.W.b();
    }
}
