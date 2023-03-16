package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class E3 extends F3 implements j$.util.D, j$.util.function.r {

    /* renamed from: e  reason: collision with root package name */
    long f9805e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(j$.util.D d10, long j10, long j11) {
        super(d10, j10, j11);
    }

    E3(j$.util.D d10, E3 e32) {
        super(d10, e32);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.s(this, consumer);
    }

    @Override // j$.util.function.r
    public void e(long j10) {
        this.f9805e = j10;
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.e(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected j$.util.H o(j$.util.H h10) {
        return new E3((j$.util.D) h10, this);
    }

    @Override // j$.util.stream.F3
    protected void s(Object obj) {
        ((j$.util.function.r) obj).e(this.f9805e);
    }

    @Override // j$.util.stream.F3
    protected AbstractC0323j3 t(int i10) {
        return new C0318i3(i10);
    }
}
