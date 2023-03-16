package i1;
/* loaded from: classes.dex */
public final class a<T> implements x8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8234c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile x8.a<T> f8235a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8236b = f8234c;

    private a(x8.a<T> aVar) {
        this.f8235a = aVar;
    }

    public static <P extends x8.a<T>, T> x8.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f8234c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // x8.a
    public T get() {
        T t10 = (T) this.f8236b;
        Object obj = f8234c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f8236b;
                if (t10 == obj) {
                    t10 = this.f8235a.get();
                    this.f8236b = b(this.f8236b, t10);
                    this.f8235a = null;
                }
            }
        }
        return t10;
    }
}
