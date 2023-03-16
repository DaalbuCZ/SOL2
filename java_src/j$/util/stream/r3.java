package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class r3 implements InterfaceC0352p2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10127b;

    public /* synthetic */ r3(Object obj, int i10) {
        this.f10126a = i10;
        this.f10127b = obj;
    }

    public /* synthetic */ void a(Long l10) {
        switch (this.f10126a) {
            case 0:
                D0.D(this, l10);
                return;
            default:
                D0.D(this, l10);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f10126a) {
            case 0:
                a((Long) obj);
                return;
            default:
                a((Long) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f10126a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        switch (this.f10126a) {
            case 0:
                D0.A();
                throw null;
            default:
                D0.A();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        switch (this.f10126a) {
            case 0:
                D0.E();
                throw null;
            default:
                D0.E();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0352p2, j$.util.stream.InterfaceC0356q2
    public final void e(long j10) {
        switch (this.f10126a) {
            case 0:
                ((X2) this.f10127b).e(j10);
                return;
            default:
                ((j$.util.function.r) this.f10127b).e(j10);
                return;
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
