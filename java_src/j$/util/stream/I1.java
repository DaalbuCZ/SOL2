package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class I1 implements Y1, InterfaceC0342n2 {

    /* renamed from: a  reason: collision with root package name */
    private double f9829a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f9830b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.f f9831c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(double d10, j$.util.function.f fVar) {
        this.f9830b = d10;
        this.f9831c = fVar;
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
        this.f9829a = this.f9831c.l(this.f9829a, d10);
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

    @Override // j$.util.function.A
    public Object get() {
        return Double.valueOf(this.f9829a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9829a = this.f9830b;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        c(((I1) y12).f9829a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
