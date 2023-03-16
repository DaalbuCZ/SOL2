package j$.util.stream;
/* renamed from: j$.util.stream.t2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0367t2 extends AbstractC0327k2 {

    /* renamed from: b  reason: collision with root package name */
    long f10145b;

    /* renamed from: c  reason: collision with root package name */
    long f10146c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0371u2 f10147d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367t2(C0371u2 c0371u2, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10147d = c0371u2;
        this.f10145b = c0371u2.f10152u;
        long j10 = c0371u2.f10153v;
        this.f10146c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0347o2, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        long j10 = this.f10145b;
        if (j10 != 0) {
            this.f10145b = j10 - 1;
            return;
        }
        long j11 = this.f10146c;
        if (j11 > 0) {
            this.f10146c = j11 - 1;
            this.f10081a.d(i10);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f10081a.j(D0.T(j10, this.f10147d.f10152u, this.f10146c));
    }

    @Override // j$.util.stream.AbstractC0327k2, j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10146c == 0 || this.f10081a.r();
    }
}
