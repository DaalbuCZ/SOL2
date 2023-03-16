package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class G1 extends Z1 implements Y1, InterfaceC0352p2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.A f9813b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.w f9814c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9815d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(j$.util.function.A a10, j$.util.function.w wVar, InterfaceC0260c interfaceC0260c) {
        this.f9813b = a10;
        this.f9814c = wVar;
        this.f9815d = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: a */
    public /* synthetic */ void accept(Long l10) {
        D0.D(this, l10);
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
    public void e(long j10) {
        this.f9814c.o(this.f9949a, j10);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9949a = this.f9813b.get();
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        this.f9949a = this.f9815d.s(this.f9949a, ((G1) y12).f9949a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
