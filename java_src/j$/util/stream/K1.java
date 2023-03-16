package j$.util.stream;

import j$.util.C0267l;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class K1 implements Y1, InterfaceC0342n2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9843a;

    /* renamed from: b  reason: collision with root package name */
    private double f9844b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.f f9845c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(j$.util.function.f fVar) {
        this.f9845c = fVar;
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
        if (this.f9843a) {
            this.f9843a = false;
        } else {
            d10 = this.f9845c.l(this.f9844b, d10);
        }
        this.f9844b = d10;
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
        return this.f9843a ? C0267l.a() : C0267l.d(this.f9844b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9843a = true;
        this.f9844b = 0.0d;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        K1 k12 = (K1) y12;
        if (k12.f9843a) {
            return;
        }
        c(k12.f9844b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
