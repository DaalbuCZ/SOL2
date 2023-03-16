package j$.util.stream;
/* renamed from: j$.util.stream.x2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0383x2 extends AbstractC0322j2 {

    /* renamed from: b  reason: collision with root package name */
    long f10175b;

    /* renamed from: c  reason: collision with root package name */
    long f10176c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0387y2 f10177d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383x2(C0387y2 c0387y2, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10177d = c0387y2;
        this.f10175b = c0387y2.f10185u;
        long j10 = c0387y2.f10186v;
        this.f10176c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0342n2, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        long j10 = this.f10175b;
        if (j10 != 0) {
            this.f10175b = j10 - 1;
            return;
        }
        long j11 = this.f10176c;
        if (j11 > 0) {
            this.f10176c = j11 - 1;
            this.f10062a.c(d10);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f10062a.j(D0.T(j10, this.f10177d.f10185u, this.f10176c));
    }

    @Override // j$.util.stream.AbstractC0322j2, j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10176c == 0 || this.f10062a.r();
    }
}
