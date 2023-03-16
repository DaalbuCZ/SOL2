package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class I3 implements InterfaceC0356q2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9832a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9833b;

    public /* synthetic */ I3(Object obj, int i10) {
        this.f9832a = i10;
        this.f9833b = obj;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9832a) {
            case 0:
                ((Consumer) this.f9833b).accept(obj);
                return;
            default:
                ((C0278a3) this.f9833b).accept(obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f9832a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        switch (this.f9832a) {
            case 0:
                D0.A();
                throw null;
            default:
                D0.A();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        switch (this.f9832a) {
            case 0:
                D0.E();
                throw null;
            default:
                D0.E();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        switch (this.f9832a) {
            case 0:
                D0.F();
                throw null;
            default:
                D0.F();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void j(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
