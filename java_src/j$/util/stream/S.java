package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
abstract class S implements M3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f9900a;

    /* renamed from: b  reason: collision with root package name */
    Object f9901b;

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        if (this.f9900a) {
            return;
        }
        this.f9900a = true;
        this.f9901b = obj;
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
    public /* synthetic */ void j(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f9900a;
    }
}
