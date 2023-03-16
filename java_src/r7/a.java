package r7;
/* loaded from: classes.dex */
public final class a<T> implements x8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f13087c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile x8.a<T> f13088a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f13089b = f13087c;

    private a(x8.a<T> aVar) {
        this.f13088a = aVar;
    }

    public static <P extends x8.a<T>, T> x8.a<T> a(P p10) {
        b.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f13087c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // x8.a
    public T get() {
        T t10 = (T) this.f13089b;
        Object obj = f13087c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f13089b;
                if (t10 == obj) {
                    t10 = this.f13088a.get();
                    this.f13089b = b(this.f13089b, t10);
                    this.f13088a = null;
                }
            }
        }
        return t10;
    }
}
