package j$.util.function;
/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.BiFunction f9722a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f9722a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public /* synthetic */ Object s(Object obj, Object obj2) {
            return this.f9722a.apply(obj, obj2);
        }
    }

    Object s(Object obj, Object obj2);
}
