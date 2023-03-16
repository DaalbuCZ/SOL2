package j$.util.stream;

import j$.util.function.C0259b;
/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0376w extends AbstractC0322j2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10162b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f10163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0376w(AbstractC0284c abstractC0284c, InterfaceC0356q2 interfaceC0356q2, int i10) {
        super(interfaceC0356q2);
        this.f10162b = i10;
        this.f10163c = abstractC0284c;
    }

    @Override // j$.util.stream.InterfaceC0342n2, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        switch (this.f10162b) {
            case 0:
                this.f10062a.c(((C0259b) ((C0380x) this.f10163c).f10171v).b(d10));
                return;
            case 1:
                this.f10062a.accept(((j$.util.function.i) ((C0384y) this.f10163c).f10180v).x(d10));
                return;
            case 2:
                this.f10062a.d(((C0259b) ((C0388z) this.f10163c).f10188v).e(d10));
                return;
            case 3:
                this.f10062a.e(((j$.util.function.j) ((A) this.f10163c).f9760v).p(d10));
                return;
            case 4:
                H h10 = (H) ((j$.util.function.i) ((C0380x) this.f10163c).f10171v).x(d10);
                if (h10 != null) {
                    try {
                        h10.sequential().f(new C0372v(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0284c) h10).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (h10 != null) {
                    ((AbstractC0284c) h10).close();
                    return;
                }
                return;
            case 5:
                if (((C0259b) ((C0380x) this.f10163c).f10171v).D(d10)) {
                    this.f10062a.c(d10);
                    return;
                }
                return;
            default:
                ((j$.util.function.h) ((C0380x) this.f10163c).f10171v).c(d10);
                this.f10062a.c(d10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        switch (this.f10162b) {
            case 4:
                this.f10062a.j(-1L);
                return;
            case 5:
                this.f10062a.j(-1L);
                return;
            default:
                this.f10062a.j(j10);
                return;
        }
    }
}
