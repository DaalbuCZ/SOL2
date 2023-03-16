package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9708b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f9707a = obj;
        this.f9708b = obj2;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f9707a).accept(obj);
        ((Consumer) this.f9708b).accept(obj);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f9707a;
        BiFunction biFunction = (BiFunction) this.f9708b;
        while (!concurrentMap.replace(obj, obj2, biFunction.s(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
        }
    }
}
