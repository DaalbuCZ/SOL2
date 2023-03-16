package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W0 extends Z0 implements J0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(J0 j02, J0 j03) {
        super(j02, j03);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.K(this, consumer);
    }

    @Override // j$.util.stream.P0
    /* renamed from: b */
    public /* synthetic */ void m(Double[] dArr, int i10) {
        D0.H(this, dArr, i10);
    }

    @Override // j$.util.stream.O0
    /* renamed from: c */
    public double[] g(int i10) {
        return new double[i10];
    }

    @Override // j$.util.stream.P0
    /* renamed from: d */
    public /* synthetic */ J0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.N(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    public j$.util.F spliterator() {
        return new C0341n1(this);
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return new C0341n1(this);
    }
}
