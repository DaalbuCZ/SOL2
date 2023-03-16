package j$.util.function;

import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntConsumer f9730a;

    private /* synthetic */ l(IntConsumer intConsumer) {
        this.f9730a = intConsumer;
    }

    public static /* synthetic */ m a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return new l(intConsumer);
    }

    @Override // j$.util.function.m
    public /* synthetic */ void d(int i10) {
        this.f9730a.accept(i10);
    }
}
