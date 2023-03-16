package j$.util.function;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements java.util.function.Consumer {

    /* renamed from: a */
    final /* synthetic */ Consumer f9728a;

    private /* synthetic */ e(Consumer consumer) {
        this.f9728a = consumer;
    }

    public static /* synthetic */ java.util.function.Consumer a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f9723a : new e(consumer);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ void accept(Object obj) {
        this.f9728a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return a(this.f9728a.andThen(Consumer.VivifiedWrapper.convert(consumer)));
    }
}
