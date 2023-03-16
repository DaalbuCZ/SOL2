package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0388z extends AbstractC0315i0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f10187u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ Object f10188v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0388z(AbstractC0284c abstractC0284c, AbstractC0284c abstractC0284c2, int i10, int i11, Object obj, int i12) {
        super(abstractC0284c2, i10, i11);
        this.f10187u = i12;
        this.f10188v = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f10187u) {
            case 0:
                return new C0376w(this, interfaceC0356q2, 2);
            case 1:
                return new C0290d0(this, interfaceC0356q2, 1);
            case 2:
                return new C0290d0(this, interfaceC0356q2, 3);
            case 3:
                return new C0290d0(this, interfaceC0356q2, 7);
            case 4:
                return new C0290d0(this, interfaceC0356q2, 8);
            case 5:
                return new C0345o0(this, interfaceC0356q2, 3);
            case 6:
                return new C0287c2(this, interfaceC0356q2, 3);
            default:
                return new C0353q(this, interfaceC0356q2);
        }
    }
}
