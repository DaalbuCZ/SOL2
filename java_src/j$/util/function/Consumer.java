package j$.util.function;
/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.Consumer f9723a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f9723a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof e ? ((e) consumer).f9728a : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ void accept(Object obj) {
            this.f9723a.accept(obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.f9723a.andThen(e.a(consumer)));
        }
    }

    void accept(T t10);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
