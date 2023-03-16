package y8;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class m<T> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final a f17093n = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: n  reason: collision with root package name */
        public final Throwable f17094n;

        public b(Throwable th) {
            k9.k.e(th, "exception");
            this.f17094n = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && k9.k.a(this.f17094n, ((b) obj).f17094n);
        }

        public int hashCode() {
            return this.f17094n.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f17094n + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f17094n;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
