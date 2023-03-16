package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W extends Y implements InterfaceC0352p2 {

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.r f9925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(j$.util.function.r rVar, boolean z10) {
        super(z10);
        this.f9925b = rVar;
    }

    @Override // j$.util.stream.Y, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        this.f9925b.e(j10);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: i */
    public /* synthetic */ void accept(Long l10) {
        D0.D(this, l10);
    }
}
