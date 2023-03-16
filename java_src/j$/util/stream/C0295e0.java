package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0295e0 extends AbstractC0357r0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f10013u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0295e0(AbstractC0284c abstractC0284c, AbstractC0284c abstractC0284c2, int i10, int i11, int i12) {
        super(abstractC0284c2, i10, i11);
        this.f10013u = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f10013u) {
            case 0:
                return new C0290d0(this, interfaceC0356q2, 0);
            default:
                return interfaceC0356q2;
        }
    }
}
