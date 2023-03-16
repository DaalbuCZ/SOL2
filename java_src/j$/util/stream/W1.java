package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class W1 implements Y1, InterfaceC0352p2 {

    /* renamed from: a  reason: collision with root package name */
    private long f9926a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f9927b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f9928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W1(long j10, j$.util.function.p pVar) {
        this.f9927b = j10;
        this.f9928c = pVar;
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
        this.f9926a = this.f9928c.k(this.f9926a, j10);
    }

    @Override // j$.util.function.A
    public Object get() {
        return Long.valueOf(this.f9926a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9926a = this.f9927b;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        e(((W1) y12).f9926a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
