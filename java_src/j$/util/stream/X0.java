package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X0 extends Z0 implements L0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public X0(L0 l02, L0 l03) {
        super(l02, l03);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ void a(Consumer consumer) {
        D0.L(this, consumer);
    }

    @Override // j$.util.stream.P0
    /* renamed from: b */
    public /* synthetic */ void m(Integer[] numArr, int i10) {
        D0.I(this, numArr, i10);
    }

    @Override // j$.util.stream.O0
    /* renamed from: c */
    public int[] g(int i10) {
        return new int[i10];
    }

    @Override // j$.util.stream.P0
    /* renamed from: d */
    public /* synthetic */ L0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.O(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    public j$.util.F spliterator() {
        return new C0346o1(this);
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return new C0346o1(this);
    }
}
