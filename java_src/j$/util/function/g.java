package j$.util.function;

import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleConsumer f9729a;

    private /* synthetic */ g(DoubleConsumer doubleConsumer) {
        this.f9729a = doubleConsumer;
    }

    public static /* synthetic */ h a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new g(doubleConsumer);
    }

    @Override // j$.util.function.h
    public /* synthetic */ void c(double d10) {
        this.f9729a.accept(d10);
    }
}
