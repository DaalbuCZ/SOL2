package j$.util.function;
/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$negate(Predicate predicate) {
            return new C0258a(predicate, 2);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t10);
}
