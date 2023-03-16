package f7;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: a  reason: collision with root package name */
    private final h7.h<String, k> f7332a = new h7.h<>();

    public void C(String str, k kVar) {
        h7.h<String, k> hVar = this.f7332a;
        if (kVar == null) {
            kVar = m.f7331a;
        }
        hVar.put(str, kVar);
    }

    public Set<Map.Entry<String, k>> D() {
        return this.f7332a.entrySet();
    }

    public boolean E(String str) {
        return this.f7332a.containsKey(str);
    }

    public k F(String str) {
        return this.f7332a.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f7332a.equals(this.f7332a));
    }

    public int hashCode() {
        return this.f7332a.hashCode();
    }
}
