package j$.util.stream;
/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0349p extends AbstractC0337m2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f10116b;

    /* renamed from: c  reason: collision with root package name */
    Object f10117c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0349p(r rVar, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        if (obj == null) {
            if (this.f10116b) {
                return;
            }
            this.f10116b = true;
            InterfaceC0356q2 interfaceC0356q2 = this.f10096a;
            this.f10117c = null;
            interfaceC0356q2.accept(null);
            return;
        }
        Object obj2 = this.f10117c;
        if (obj2 == null || !obj.equals(obj2)) {
            InterfaceC0356q2 interfaceC0356q22 = this.f10096a;
            this.f10117c = obj;
            interfaceC0356q22.accept(obj);
        }
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public void h() {
        this.f10116b = false;
        this.f10117c = null;
        this.f10096a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f10116b = false;
        this.f10117c = null;
        this.f10096a.j(-1L);
    }
}
