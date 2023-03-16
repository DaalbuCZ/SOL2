package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0384y extends AbstractC0312h2 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f10179u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ Object f10180v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384y(AbstractC0284c abstractC0284c, AbstractC0284c abstractC0284c2, int i10, int i11, Object obj, int i12) {
        super(abstractC0284c2, i10, i11);
        this.f10179u = i12;
        this.f10180v = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        switch (this.f10179u) {
            case 0:
                return new C0376w(this, interfaceC0356q2, 1);
            case 1:
                return new C0290d0(this, interfaceC0356q2, 4);
            case 2:
                return new C0345o0(this, interfaceC0356q2, 2);
            case 3:
                return new C0287c2(this, interfaceC0356q2, 0);
            default:
                return new C0287c2(this, interfaceC0356q2, 1);
        }
    }
}
