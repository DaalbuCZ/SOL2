package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U extends Y implements InterfaceC0342n2 {

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.h f9913b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(j$.util.function.h hVar, boolean z10) {
        super(z10);
        this.f9913b = hVar;
    }

    @Override // j$.util.stream.Y, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        this.f9913b.c(d10);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: i */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }
}
