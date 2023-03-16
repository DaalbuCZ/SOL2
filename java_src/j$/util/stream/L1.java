package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class L1 extends Z1 implements Y1, InterfaceC0342n2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9850b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.u f9851c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9852d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(j$.util.function.A a10, j$.util.function.u uVar, InterfaceC0260c interfaceC0260c) {
        this.f9850b = a10;
        this.f9851c = uVar;
        this.f9852d = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: a */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        this.f9851c.a(this.f9949a, d10);
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
        this.f9949a = this.f9850b.get();
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9949a = this.f9852d.s(this.f9949a, ((L1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
