package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0327k2 implements InterfaceC0347o2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0356q2 f10081a;

    public AbstractC0327k2(InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        this.f10081a = interfaceC0356q2;
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
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void h() {
        this.f10081a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10081a.r();
    }
}
