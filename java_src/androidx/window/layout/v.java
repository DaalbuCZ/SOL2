package androidx.window.layout;

import java.util.List;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f2507a;

    /* JADX WARN: Multi-variable type inference failed */
    public v(List<? extends e> list) {
        k9.k.e(list, "displayFeatures");
        this.f2507a = list;
    }

    public final List<e> a() {
        return this.f2507a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k9.k.a(v.class, obj.getClass())) {
            return false;
        }
        return k9.k.a(this.f2507a, ((v) obj).f2507a);
    }

    public int hashCode() {
        return this.f2507a.hashCode();
    }

    public String toString() {
        String n10;
        n10 = z8.r.n(this.f2507a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return n10;
    }
}
