package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class U1 extends Z1 implements Y1, InterfaceC0347o2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9915b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.v f9916c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9917d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U1(j$.util.function.A a10, j$.util.function.v vVar, InterfaceC0260c interfaceC0260c) {
        this.f9915b = a10;
        this.f9916c = vVar;
        this.f9917d = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: a */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
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
    public void d(int i10) {
        this.f9916c.m(this.f9949a, i10);
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
        this.f9949a = this.f9915b.get();
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9949a = this.f9917d.s(this.f9949a, ((U1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
