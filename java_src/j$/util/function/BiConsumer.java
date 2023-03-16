package j$.util.function;
/* loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.BiConsumer f9721a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f9721a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return new VivifiedWrapper(biConsumer);
        }

        @Override // j$.util.function.BiConsumer
        public /* synthetic */ void n(Object obj, Object obj2) {
            this.f9721a.accept(obj, obj2);
        }
    }

    void n(Object obj, Object obj2);
}
