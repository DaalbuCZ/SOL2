package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.m2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0337m2 implements InterfaceC0356q2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0356q2 f10096a;

    public AbstractC0337m2(InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        this.f10096a = interfaceC0356q2;
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
    public void h() {
        this.f10096a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public boolean r() {
        return this.f10096a.r();
    }
}
