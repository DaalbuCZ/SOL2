package m7;

import h7.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final Class<? super T> f11441a;

    /* renamed from: b  reason: collision with root package name */
    final Type f11442b;

    /* renamed from: c  reason: collision with root package name */
    final int f11443c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        Type d10 = d(getClass());
        this.f11442b = d10;
        this.f11441a = (Class<? super T>) b.k(d10);
        this.f11443c = d10.hashCode();
    }

    a(Type type) {
        Type b10 = b.b((Type) h7.a.b(type));
        this.f11442b = b10;
        this.f11441a = (Class<? super T>) b.k(b10);
        this.f11443c = b10.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> c() {
        return this.f11441a;
    }

    public final Type e() {
        return this.f11442b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f11442b, ((a) obj).f11442b);
    }

    public final int hashCode() {
        return this.f11443c;
    }

    public final String toString() {
        return b.u(this.f11442b);
    }
}
