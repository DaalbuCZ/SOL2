package v4;

import java.util.Objects;
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f15663c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile g f15664a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f15665b = f15663c;

    private e(g gVar) {
        this.f15664a = gVar;
    }

    public static g b(g gVar) {
        Objects.requireNonNull(gVar);
        return gVar instanceof e ? gVar : new e(gVar);
    }

    @Override // v4.g
    public final Object a() {
        Object obj = this.f15665b;
        Object obj2 = f15663c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f15665b;
                if (obj == obj2) {
                    obj = this.f15664a.a();
                    Object obj3 = this.f15665b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15665b = obj;
                    this.f15664a = null;
                }
            }
        }
        return obj;
    }
}
