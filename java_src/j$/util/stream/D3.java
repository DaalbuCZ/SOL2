package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class D3 extends F3 implements j$.util.B, j$.util.function.m {

    /* renamed from: e  reason: collision with root package name */
    int f9800e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(j$.util.B b10, long j10, long j11) {
        super(b10, j10, j11);
    }

    D3(j$.util.B b10, D3 d32) {
        super(b10, d32);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.r(this, consumer);
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        this.f9800e = i10;
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.d(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected j$.util.H o(j$.util.H h10) {
        return new D3((j$.util.B) h10, this);
    }

    @Override // j$.util.stream.F3
    protected void s(Object obj) {
        ((j$.util.function.m) obj).d(this.f9800e);
    }

    @Override // j$.util.stream.F3
    protected AbstractC0323j3 t(int i10) {
        return new C0313h3(i10);
    }
}
