package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0260c;
/* loaded from: classes2.dex */
class O1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9871b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f9872c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9873d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ C0319j f9874e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(int i10, InterfaceC0260c interfaceC0260c, BiConsumer biConsumer, j$.util.function.A a10, C0319j c0319j) {
        super(i10);
        this.f9871b = interfaceC0260c;
        this.f9872c = biConsumer;
        this.f9873d = a10;
        this.f9874e = c0319j;
    }

    @Override // j$.util.stream.AbstractC0277a2, j$.util.stream.L3
    public int a() {
        if (this.f9874e.a().contains(EnumC0314i.UNORDERED)) {
            return EnumC0298e3.f10028r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        return new P1(this.f9873d, this.f9872c, this.f9871b);
    }
}
