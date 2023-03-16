package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class S1 implements Y1, InterfaceC0347o2 {

    /* renamed from: a  reason: collision with root package name */
    private int f9904a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f9905b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.k f9906c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S1(int i10, j$.util.function.k kVar) {
        this.f9905b = i10;
        this.f9906c = kVar;
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
        this.f9904a = this.f9906c.i(this.f9904a, i10);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.function.A
    public Object get() {
        return Integer.valueOf(this.f9904a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9904a = this.f9905b;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        d(((S1) y12).f9904a);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
