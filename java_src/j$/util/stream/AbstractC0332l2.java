package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.l2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0332l2 implements InterfaceC0352p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0356q2 f10093a;

    public AbstractC0332l2(InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        this.f10093a = interfaceC0356q2;
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
    public void h() {
        this.f10093a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10093a.r();
    }
}
