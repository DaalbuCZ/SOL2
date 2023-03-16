package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.n3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0343n3 implements InterfaceC0342n2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10107b;

    public /* synthetic */ C0343n3(Object obj, int i10) {
        this.f10106a = i10;
        this.f10107b = obj;
    }

    public /* synthetic */ void a(Double d10) {
        switch (this.f10106a) {
            case 0:
                D0.B(this, d10);
                return;
            default:
                D0.B(this, d10);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f10106a) {
            case 0:
                a((Double) obj);
                return;
            default:
                a((Double) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f10106a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0342n2, j$.util.stream.InterfaceC0356q2
    public final void c(double d10) {
        switch (this.f10106a) {
            case 0:
                ((T2) this.f10107b).c(d10);
                return;
            default:
                ((j$.util.function.h) this.f10107b).c(d10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        switch (this.f10106a) {
            case 0:
                D0.E();
                throw null;
            default:
                D0.E();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        switch (this.f10106a) {
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
