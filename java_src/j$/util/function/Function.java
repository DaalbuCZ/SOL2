package j$.util.function;
/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.Function f9724a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f9724a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return new VivifiedWrapper(function);
        }

        @Override // j$.util.function.Function
        public /* synthetic */ Object a(Object obj) {
            return this.f9724a.apply(obj);
        }
    }

    Object a(Object obj);
}
