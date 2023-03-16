package k9;
/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f10897a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10898b;

    public m(Class<?> cls, String str) {
        k.e(cls, "jClass");
        k.e(str, "moduleName");
        this.f10897a = cls;
        this.f10898b = str;
    }

    @Override // k9.d
    public Class<?> b() {
        return this.f10897a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(b(), ((m) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
