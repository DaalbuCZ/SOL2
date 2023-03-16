package androidx.lifecycle;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final a f2137a;

    /* renamed from: b  reason: collision with root package name */
    private final w f2138b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends u> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends u> T b(String str, Class<T> cls);
    }

    public v(w wVar, a aVar) {
        this.f2137a = aVar;
        this.f2138b = wVar;
    }

    public <T extends u> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends u> T b(String str, Class<T> cls) {
        T t10 = (T) this.f2138b.b(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        a aVar = this.f2137a;
        T t11 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.f2138b.c(str, t11);
        return t11;
    }
}
