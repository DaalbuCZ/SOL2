package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class P1 extends Z1 implements Y1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9878b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f9879c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9880d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P1(j$.util.function.A a10, BiConsumer biConsumer, InterfaceC0260c interfaceC0260c) {
        this.f9878b = a10;
        this.f9879c = biConsumer;
        this.f9880d = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9879c.n(this.f9949a, obj);
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
        this.f9949a = this.f9878b.get();
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9949a = this.f9880d.s(this.f9949a, ((P1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
