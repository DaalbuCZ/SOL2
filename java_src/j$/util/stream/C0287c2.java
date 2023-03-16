package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
/* renamed from: j$.util.stream.c2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0287c2 extends AbstractC0337m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10001b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f10002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0287c2(AbstractC0284c abstractC0284c, InterfaceC0356q2 interfaceC0356q2, int i10) {
        super(interfaceC0356q2);
        this.f10001b = i10;
        this.f10002c = abstractC0284c;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f10001b) {
            case 0:
                ((Consumer) ((C0384y) this.f10002c).f10180v).accept(obj);
                this.f10096a.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C0384y) this.f10002c).f10180v).test(obj)) {
                    this.f10096a.accept(obj);
                    return;
                }
                return;
            case 2:
                this.f10096a.accept(((C0297e2) this.f10002c).f10015v.a(obj));
                return;
            case 3:
                this.f10096a.d(((j$.util.function.C) ((C0388z) this.f10002c).f10188v).f(obj));
                return;
            case 4:
                this.f10096a.e(((j$.util.function.D) ((A) this.f10002c).f9760v).g(obj));
                return;
            case 5:
                this.f10096a.c(((j$.util.function.B) ((C0380x) this.f10002c).f10171v).t(obj));
                return;
            default:
                Stream stream = (Stream) ((C0297e2) this.f10002c).f10015v.a(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).a(this.f10096a);
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        switch (this.f10001b) {
            case 1:
                this.f10096a.j(-1L);
                return;
            case 6:
                this.f10096a.j(-1L);
                return;
            default:
                this.f10096a.j(j10);
                return;
        }
    }
}
