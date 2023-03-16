package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class Q1 extends Z1 implements Y1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9884b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f9885c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f9886d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q1(j$.util.function.A a10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f9884b = a10;
        this.f9885c = biConsumer;
        this.f9886d = biConsumer2;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9885c.n(this.f9949a, obj);
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
        this.f9949a = this.f9884b.get();
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9886d.n(this.f9949a, ((Q1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
