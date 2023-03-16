package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0261d;
import java.util.List;
import java.util.Objects;
/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0279b implements j$.util.function.A, j$.util.function.s, Consumer, InterfaceC0261d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9980b;

    public /* synthetic */ C0279b(Object obj, int i10) {
        this.f9979a = i10;
        this.f9980b = obj;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f9979a) {
            case 3:
                ((InterfaceC0356q2) this.f9980b).accept(obj);
                return;
            default:
                ((List) this.f9980b).add(obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f9979a) {
            case 3:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.function.A
    public Object get() {
        switch (this.f9979a) {
            case 0:
                return (j$.util.H) this.f9980b;
            default:
                return ((AbstractC0284c) this.f9980b).R0();
        }
    }

    @Override // j$.util.function.s
    public Object v(long j10) {
        int i10 = U0.f9914k;
        return D0.X(j10, (j$.util.function.n) this.f9980b);
    }
}
