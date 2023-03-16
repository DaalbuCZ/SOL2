package j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0266k {

    /* renamed from: b  reason: collision with root package name */
    private static final C0266k f9744b = new C0266k();

    /* renamed from: a  reason: collision with root package name */
    private final Object f9745a;

    private C0266k() {
        this.f9745a = null;
    }

    private C0266k(Object obj) {
        Objects.requireNonNull(obj);
        this.f9745a = obj;
    }

    public static C0266k a() {
        return f9744b;
    }

    public static C0266k d(Object obj) {
        return new C0266k(obj);
    }

    public Object b() {
        Object obj = this.f9745a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f9745a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0266k) {
            return AbstractC0251a.x(this.f9745a, ((C0266k) obj).f9745a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f9745a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f9745a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
