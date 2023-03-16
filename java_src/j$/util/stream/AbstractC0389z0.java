package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0389z0 implements InterfaceC0356q2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f10189a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10190b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0389z0(A0 a02) {
        boolean z10;
        z10 = a02.f9763b;
        this.f10190b = !z10;
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
        return this.f10189a;
    }
}
