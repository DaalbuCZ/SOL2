package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class p3 implements InterfaceC0347o2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10119b;

    public /* synthetic */ p3(Object obj, int i10) {
        this.f10118a = i10;
        this.f10119b = obj;
    }

    public /* synthetic */ void a(Integer num) {
        switch (this.f10118a) {
            case 0:
                D0.C(this, num);
                return;
            default:
                D0.C(this, num);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f10118a) {
            case 0:
                a((Integer) obj);
                return;
            default:
                a((Integer) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f10118a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        switch (this.f10118a) {
            case 0:
                D0.A();
                throw null;
            default:
                D0.A();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0347o2, j$.util.stream.InterfaceC0356q2
    public final void d(int i10) {
        switch (this.f10118a) {
            case 0:
                ((V2) this.f10119b).d(i10);
                return;
            default:
                ((j$.util.function.m) this.f10119b).d(i10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        switch (this.f10118a) {
            case 0:
                D0.F();
                throw null;
            default:
                D0.F();
                throw null;
        }
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
