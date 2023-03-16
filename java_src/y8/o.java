package y8;

import java.io.Serializable;
/* loaded from: classes.dex */
final class o<T> implements g<T>, Serializable {

    /* renamed from: n  reason: collision with root package name */
    private j9.a<? extends T> f17095n;

    /* renamed from: o  reason: collision with root package name */
    private volatile Object f17096o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f17097p;

    public o(j9.a<? extends T> aVar, Object obj) {
        k9.k.e(aVar, "initializer");
        this.f17095n = aVar;
        this.f17096o = q.f17098a;
        this.f17097p = obj == null ? this : obj;
    }

    public /* synthetic */ o(j9.a aVar, Object obj, int i10, k9.g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f17096o != q.f17098a;
    }

    @Override // y8.g
    public T getValue() {
        T t10;
        T t11 = (T) this.f17096o;
        q qVar = q.f17098a;
        if (t11 != qVar) {
            return t11;
        }
        synchronized (this.f17097p) {
            t10 = (T) this.f17096o;
            if (t10 == qVar) {
                j9.a<? extends T> aVar = this.f17095n;
                k9.k.b(aVar);
                t10 = aVar.d();
                this.f17096o = t10;
                this.f17095n = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
