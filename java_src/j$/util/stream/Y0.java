package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y0 extends Z0 implements N0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(N0 n02, N0 n03) {
        super(n02, n03);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.M(this, consumer);
    }

    @Override // j$.util.stream.P0
    /* renamed from: b */
    public /* synthetic */ void m(Long[] lArr, int i10) {
        D0.J(this, lArr, i10);
    }

    @Override // j$.util.stream.O0
    /* renamed from: c */
    public long[] g(int i10) {
        return new long[i10];
    }

    @Override // j$.util.stream.P0
    /* renamed from: d */
    public /* synthetic */ N0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.P(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    public j$.util.F spliterator() {
        return new C0351p1(this);
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return new C0351p1(this);
    }
}
