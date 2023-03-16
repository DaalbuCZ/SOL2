package j$.util.stream;

import j$.util.function.C0259b;
/* renamed from: j$.util.stream.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0290d0 extends AbstractC0327k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f10007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0290d0(AbstractC0284c abstractC0284c, InterfaceC0356q2 interfaceC0356q2, int i10) {
        super(interfaceC0356q2);
        this.f10006b = i10;
        this.f10007c = abstractC0284c;
    }

    @Override // j$.util.stream.InterfaceC0347o2, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        switch (this.f10006b) {
            case 0:
                this.f10081a.e(i10);
                return;
            case 1:
                ((j$.util.function.m) ((C0388z) this.f10007c).f10188v).d(i10);
                this.f10081a.d(i10);
                return;
            case 2:
                this.f10081a.c(i10);
                return;
            case 3:
                this.f10081a.d(((C0259b) ((C0388z) this.f10007c).f10188v).h(i10));
                return;
            case 4:
                this.f10081a.accept(((j$.util.function.n) ((C0384y) this.f10007c).f10180v).u(i10));
                return;
            case 5:
                this.f10081a.e(((j$.util.function.o) ((A) this.f10007c).f9760v).y(i10));
                return;
            case 6:
                this.f10081a.c(((C0259b) ((C0380x) this.f10007c).f10171v).c(i10));
                return;
            case 7:
                InterfaceC0330l0 interfaceC0330l0 = (InterfaceC0330l0) ((j$.util.function.n) ((C0388z) this.f10007c).f10188v).u(i10);
                if (interfaceC0330l0 != null) {
                    try {
                        interfaceC0330l0.sequential().i(new C0285c0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0284c) interfaceC0330l0).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC0330l0 != null) {
                    ((AbstractC0284c) interfaceC0330l0).close();
                    return;
                }
                return;
            default:
                if (((C0259b) ((C0388z) this.f10007c).f10188v).E(i10)) {
                    this.f10081a.d(i10);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        switch (this.f10006b) {
            case 7:
                this.f10081a.j(-1L);
                return;
            case 8:
                this.f10081a.j(-1L);
                return;
            default:
                this.f10081a.j(j10);
                return;
        }
    }
}
