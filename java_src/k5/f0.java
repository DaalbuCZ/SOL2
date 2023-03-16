package k5;

import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f10633a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f10634b;

    /* loaded from: classes.dex */
    private @interface a {
    }

    public f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f10633a = cls;
        this.f10634b = cls2;
    }

    public static <T> f0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new f0<>(cls, cls2);
    }

    public static <T> f0<T> b(Class<T> cls) {
        return new f0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f10634b.equals(f0Var.f10634b)) {
            return this.f10633a.equals(f0Var.f10633a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f10634b.hashCode() * 31) + this.f10633a.hashCode();
    }

    public String toString() {
        if (this.f10633a == a.class) {
            return this.f10634b.getName();
        }
        return "@" + this.f10633a.getName() + " " + this.f10634b.getName();
    }
}
