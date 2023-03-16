package a7;

import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f240a;

    private g() {
        this.f240a = null;
    }

    private g(T t10) {
        Objects.requireNonNull(t10, "value for optional is empty.");
        this.f240a = t10;
    }

    public static <T> g<T> a() {
        return new g<>();
    }

    public static <T> g<T> b(T t10) {
        return t10 == null ? a() : e(t10);
    }

    public static <T> g<T> e(T t10) {
        return new g<>(t10);
    }

    public T c() {
        T t10 = this.f240a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f240a != null;
    }
}
