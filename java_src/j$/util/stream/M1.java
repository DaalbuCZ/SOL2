package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class M1 extends Z1 implements Y1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f9861b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiFunction f9862c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9863d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M1(Object obj, BiFunction biFunction, InterfaceC0260c interfaceC0260c) {
        this.f9861b = obj;
        this.f9862c = biFunction;
        this.f9863d = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9949a = this.f9862c.s(this.f9949a, obj);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        D0.A();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9949a = this.f9861b;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9949a = this.f9863d.s(this.f9949a, ((M1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
