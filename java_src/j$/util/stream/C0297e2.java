package j$.util.stream;

import j$.util.function.Function;
/* renamed from: j$.util.stream.e2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0297e2 extends AbstractC0312h2 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f10014u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ Function f10015v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0297e2(AbstractC0317i2 abstractC0317i2, AbstractC0284c abstractC0284c, int i10, int i11, Function function, int i12) {
        super(abstractC0284c, i10, i11);
        this.f10014u = i12;
        this.f10015v = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f10014u) {
            case 0:
                return new C0287c2(this, interfaceC0356q2, 2);
            default:
                return new C0287c2(this, interfaceC0356q2, 6);
        }
    }
}
