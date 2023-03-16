package j$.util.stream;
/* renamed from: j$.util.stream.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0359r2 extends AbstractC0337m2 {

    /* renamed from: b  reason: collision with root package name */
    long f10123b;

    /* renamed from: c  reason: collision with root package name */
    long f10124c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0363s2 f10125d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0359r2(C0363s2 c0363s2, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10125d = c0363s2;
        this.f10123b = c0363s2.f10137u;
        long j10 = c0363s2.f10138v;
        this.f10124c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        long j10 = this.f10123b;
        if (j10 != 0) {
            this.f10123b = j10 - 1;
            return;
        }
        long j11 = this.f10124c;
        if (j11 > 0) {
            this.f10124c = j11 - 1;
            this.f10096a.accept(obj);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f10096a.j(D0.T(j10, this.f10125d.f10137u, this.f10124c));
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10124c == 0 || this.f10096a.r();
    }
}
