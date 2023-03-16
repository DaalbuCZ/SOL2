package j$.util.stream;

import j$.util.C0269n;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class X1 implements Y1, InterfaceC0352p2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9931a;

    /* renamed from: b  reason: collision with root package name */
    private long f9932b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f9933c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X1(j$.util.function.p pVar) {
        this.f9933c = pVar;
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
        if (this.f9931a) {
            this.f9931a = false;
        } else {
            j10 = this.f9933c.k(this.f9932b, j10);
        }
        this.f9932b = j10;
    }

    @Override // j$.util.function.A
    public Object get() {
        return this.f9931a ? C0269n.a() : C0269n.d(this.f9932b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9931a = true;
        this.f9932b = 0L;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        X1 x12 = (X1) y12;
        if (x12.f9931a) {
            return;
        }
        e(x12.f9932b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
