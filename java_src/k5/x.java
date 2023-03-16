package k5;
/* loaded from: classes.dex */
public class x<T> implements i6.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f10683c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f10684a = f10683c;

    /* renamed from: b  reason: collision with root package name */
    private volatile i6.b<T> f10685b;

    public x(i6.b<T> bVar) {
        this.f10685b = bVar;
    }

    @Override // i6.b
    public T get() {
        T t10 = (T) this.f10684a;
        Object obj = f10683c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f10684a;
                if (t10 == obj) {
                    t10 = this.f10685b.get();
                    this.f10684a = t10;
                    this.f10685b = null;
                }
            }
        }
        return t10;
    }
}
