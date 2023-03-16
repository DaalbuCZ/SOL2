package j$.util.stream;

import j$.util.C0266k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import java.util.Objects;
/* loaded from: classes2.dex */
class N1 implements Y1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9865a;

    /* renamed from: b  reason: collision with root package name */
    private Object f9866b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InterfaceC0260c f9867c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(InterfaceC0260c interfaceC0260c) {
        this.f9867c = interfaceC0260c;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        if (this.f9865a) {
            this.f9865a = false;
        } else {
            obj = this.f9867c.s(this.f9866b, obj);
        }
        this.f9866b = obj;
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

    @Override // j$.util.function.A
    public Object get() {
        return this.f9865a ? C0266k.a() : C0266k.d(this.f9866b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9865a = true;
        this.f9866b = null;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        N1 n12 = (N1) y12;
        if (n12.f9865a) {
            return;
        }
        accept(n12.f9866b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
