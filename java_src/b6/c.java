package b6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f2892a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f2893b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f2894a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f2895b = null;

        b(String str) {
            this.f2894a = str;
        }

        public c a() {
            return new c(this.f2894a, this.f2895b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f2895b)));
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f2895b == null) {
                this.f2895b = new HashMap();
            }
            this.f2895b.put(t10.annotationType(), t10);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f2892a = str;
        this.f2893b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f2892a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f2893b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f2892a.equals(cVar.f2892a) && this.f2893b.equals(cVar.f2893b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f2892a.hashCode() * 31) + this.f2893b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f2892a + ", properties=" + this.f2893b.values() + "}";
    }
}
