package j$.util.stream;

import j$.util.function.C0259b;
/* renamed from: j$.util.stream.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0377w0 extends AbstractC0389z0 implements InterfaceC0347o2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ A0 f10164c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0259b f10165d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0377w0(A0 a02, C0259b c0259b) {
        super(a02);
        this.f10164c = a02;
        this.f10165d = c0259b;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: a */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
    }

    @Override // j$.util.stream.AbstractC0389z0, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        boolean z10;
        boolean z11;
        if (this.f10189a) {
            return;
        }
        boolean E = this.f10165d.E(i10);
        z10 = this.f10164c.f9762a;
        if (E == z10) {
            this.f10189a = true;
            z11 = this.f10164c.f9763b;
            this.f10190b = z11;
        }
    }
}
