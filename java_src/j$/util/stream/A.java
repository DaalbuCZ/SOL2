package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class A extends AbstractC0357r0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9759u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ Object f9760v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC0284c abstractC0284c, AbstractC0284c abstractC0284c2, int i10, int i11, Object obj, int i12) {
        super(abstractC0284c2, i10, i11);
        this.f9759u = i12;
        this.f9760v = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f9759u) {
            case 0:
                return new C0376w(this, interfaceC0356q2, 3);
            case 1:
                return new C0290d0(this, interfaceC0356q2, 5);
            case 2:
                return new C0345o0(this, interfaceC0356q2, 1);
            case 3:
                return new C0345o0(this, interfaceC0356q2, 5);
            case 4:
                return new C0345o0(this, interfaceC0356q2, 6);
            case 5:
                return new C0345o0(this, interfaceC0356q2, 7);
            case 6:
                return new C0353q(this, interfaceC0356q2);
            default:
                return new C0287c2(this, interfaceC0356q2, 4);
        }
    }
}
