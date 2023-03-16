package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
class S2 extends Y2 implements j$.util.z {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ T2 f9907g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i10, int i11, int i12, int i13) {
        super(t22, i10, i11, i12, i13);
        this.f9907g = t22;
    }

    @Override // j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.stream.Y2
    void b(Object obj, int i10, Object obj2) {
        ((j$.util.function.h) obj2).c(((double[]) obj)[i10]);
    }

    @Override // j$.util.stream.Y2
    j$.util.F c(Object obj, int i10, int i11) {
        return j$.util.W.j((double[]) obj, i10, i11 + i10, 1040);
    }

    @Override // j$.util.stream.Y2
    j$.util.F d(int i10, int i11, int i12, int i13) {
        return new S2(this.f9907g, i10, i11, i12, i13);
    }

    @Override // j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
    }
}
