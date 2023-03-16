package y8;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    private final A f17091n;

    /* renamed from: o  reason: collision with root package name */
    private final B f17092o;

    public l(A a10, B b10) {
        this.f17091n = a10;
        this.f17092o = b10;
    }

    public final A a() {
        return this.f17091n;
    }

    public final B b() {
        return this.f17092o;
    }

    public final A c() {
        return this.f17091n;
    }

    public final B d() {
        return this.f17092o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return k9.k.a(this.f17091n, lVar.f17091n) && k9.k.a(this.f17092o, lVar.f17092o);
        }
        return false;
    }

    public int hashCode() {
        A a10 = this.f17091n;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f17092o;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f17091n + ", " + this.f17092o + ')';
    }
}
