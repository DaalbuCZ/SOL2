package j$.util.stream;

import j$.util.function.C0259b;
/* renamed from: j$.util.stream.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0345o0 extends AbstractC0332l2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10114b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f10115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0345o0(AbstractC0284c abstractC0284c, InterfaceC0356q2 interfaceC0356q2, int i10) {
        super(interfaceC0356q2);
        this.f10114b = i10;
        this.f10115c = abstractC0284c;
    }

    @Override // j$.util.stream.InterfaceC0352p2, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        switch (this.f10114b) {
            case 0:
                this.f10093a.c(j10);
                return;
            case 1:
                this.f10093a.e(((j$.util.function.t) ((A) this.f10115c).f9760v).w(j10));
                return;
            case 2:
                this.f10093a.accept(((j$.util.function.s) ((C0384y) this.f10115c).f10180v).v(j10));
                return;
            case 3:
                this.f10093a.d(((C0259b) ((C0388z) this.f10115c).f10188v).j(j10));
                return;
            case 4:
                this.f10093a.c(((C0259b) ((C0380x) this.f10115c).f10171v).d(j10));
                return;
            case 5:
                InterfaceC0369u0 interfaceC0369u0 = (InterfaceC0369u0) ((j$.util.function.s) ((A) this.f10115c).f9760v).v(j10);
                if (interfaceC0369u0 != null) {
                    try {
                        interfaceC0369u0.sequential().c(new C0340n0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0284c) interfaceC0369u0).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC0369u0 != null) {
                    ((AbstractC0284c) interfaceC0369u0).close();
                    return;
                }
                return;
            case 6:
                if (((C0259b) ((A) this.f10115c).f9760v).F(j10)) {
                    this.f10093a.e(j10);
                    return;
                }
                return;
            default:
                ((j$.util.function.r) ((A) this.f10115c).f9760v).e(j10);
                this.f10093a.e(j10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        switch (this.f10114b) {
            case 5:
                this.f10093a.j(-1L);
                return;
            case 6:
                this.f10093a.j(-1L);
                return;
            default:
                this.f10093a.j(j10);
                return;
        }
    }
}
