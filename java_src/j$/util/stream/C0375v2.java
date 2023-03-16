package j$.util.stream;
/* renamed from: j$.util.stream.v2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0375v2 extends AbstractC0332l2 {

    /* renamed from: b  reason: collision with root package name */
    long f10158b;

    /* renamed from: c  reason: collision with root package name */
    long f10159c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0379w2 f10160d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375v2(C0379w2 c0379w2, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10160d = c0379w2;
        this.f10158b = c0379w2.f10168u;
        long j10 = c0379w2.f10169v;
        this.f10159c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0352p2, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        long j11 = this.f10158b;
        if (j11 != 0) {
            this.f10158b = j11 - 1;
            return;
        }
        long j12 = this.f10159c;
        if (j12 > 0) {
            this.f10159c = j12 - 1;
            this.f10093a.e(j10);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f10093a.j(D0.T(j10, this.f10160d.f10168u, this.f10159c));
    }

    @Override // j$.util.stream.AbstractC0332l2, j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10159c == 0 || this.f10093a.r();
    }
}
