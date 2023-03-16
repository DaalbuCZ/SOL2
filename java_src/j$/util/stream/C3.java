package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class C3 extends F3 implements j$.util.z, j$.util.function.h {

    /* renamed from: e  reason: collision with root package name */
    double f9789e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(j$.util.z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    C3(j$.util.z zVar, C3 c32) {
        super(zVar, c32);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.function.h
    public void c(double d10) {
        this.f9789e = d10;
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected j$.util.H o(j$.util.H h10) {
        return new C3((j$.util.z) h10, this);
    }

    @Override // j$.util.stream.F3
    protected void s(Object obj) {
        ((j$.util.function.h) obj).c(this.f9789e);
    }

    @Override // j$.util.stream.F3
    protected AbstractC0323j3 t(int i10) {
        return new C0308g3(i10);
    }
}
