package f6;

import k5.e0;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f7273a;

    /* renamed from: b  reason: collision with root package name */
    private final T f7274b;

    public a(Class<T> cls, T t10) {
        this.f7273a = (Class) e0.b(cls);
        this.f7274b = (T) e0.b(t10);
    }

    public T a() {
        return this.f7274b;
    }

    public Class<T> b() {
        return this.f7273a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f7273a, this.f7274b);
    }
}
