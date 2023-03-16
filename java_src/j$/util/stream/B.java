package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class B extends E {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9777u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(AbstractC0284c abstractC0284c, AbstractC0284c abstractC0284c2, int i10, int i11, int i12) {
        super(abstractC0284c2, i10, i11);
        this.f9777u = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f9777u) {
            case 0:
                return interfaceC0356q2;
            case 1:
                return new C0290d0(this, interfaceC0356q2, 2);
            default:
                return new C0345o0(this, interfaceC0356q2, 0);
        }
    }
}
