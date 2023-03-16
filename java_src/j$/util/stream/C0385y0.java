package j$.util.stream;

import j$.util.function.C0259b;
/* renamed from: j$.util.stream.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0385y0 extends AbstractC0389z0 implements InterfaceC0342n2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ A0 f10181c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0259b f10182d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385y0(A0 a02, C0259b c0259b) {
        super(a02);
        this.f10181c = a02;
        this.f10182d = c0259b;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: a */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }

    @Override // j$.util.stream.AbstractC0389z0, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        boolean z10;
        boolean z11;
        if (this.f10189a) {
            return;
        }
        boolean D = this.f10182d.D(d10);
        z10 = this.f10181c.f9762a;
        if (D == z10) {
            this.f10189a = true;
            z11 = this.f10181c.f9763b;
            this.f10190b = z11;
        }
    }
}
