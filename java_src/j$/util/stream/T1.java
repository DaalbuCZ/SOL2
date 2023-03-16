package j$.util.stream;

import j$.util.C0268m;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
class T1 implements Y1, InterfaceC0347o2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9910a;

    /* renamed from: b  reason: collision with root package name */
    private int f9911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.k f9912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T1(j$.util.function.k kVar) {
        this.f9912c = kVar;
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
        if (this.f9910a) {
            this.f9910a = false;
        } else {
            i10 = this.f9912c.i(this.f9911b, i10);
        }
        this.f9911b = i10;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.function.A
    public Object get() {
        return this.f9910a ? C0268m.a() : C0268m.d(this.f9911b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        this.f9910a = true;
        this.f9911b = 0;
    }

    @Override // j$.util.stream.Y1
    public void q(Y1 y12) {
        T1 t12 = (T1) y12;
        if (t12.f9910a) {
            return;
        }
        d(t12.f9911b);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
