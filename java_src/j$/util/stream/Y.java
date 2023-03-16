package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
abstract class Y implements L3, M3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9934a;

    /* JADX INFO: Access modifiers changed from: protected */
    public Y(boolean z10) {
        this.f9934a = z10;
    }

    @Override // j$.util.stream.L3
    public int a() {
        if (this.f9934a) {
            return 0;
        }
        return EnumC0298e3.f10028r;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    public /* synthetic */ void c(double d10) {
        D0.A();
        throw null;
    }

    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.L3
    public Object f(D0 d02, j$.util.H h10) {
        (this.f9934a ? new Z(d02, h10, this) : new C0275a0(d02, h10, d02.J0(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.L3
    public Object g(D0 d02, j$.util.H h10) {
        AbstractC0284c abstractC0284c = (AbstractC0284c) d02;
        abstractC0284c.e0(abstractC0284c.J0(this), h10);
        return null;
    }

    @Override // j$.util.function.A
    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void j(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
