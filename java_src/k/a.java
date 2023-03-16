package k;

import java.util.HashMap;
import java.util.Map;
import k.b;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: r  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f10452r = new HashMap<>();

    public boolean contains(K k10) {
        return this.f10452r.containsKey(k10);
    }

    @Override // k.b
    protected b.c<K, V> g(K k10) {
        return this.f10452r.get(k10);
    }

    @Override // k.b
    public V s(K k10, V v10) {
        b.c<K, V> g10 = g(k10);
        if (g10 != null) {
            return g10.f10458o;
        }
        this.f10452r.put(k10, l(k10, v10));
        return null;
    }

    @Override // k.b
    public V v(K k10) {
        V v10 = (V) super.v(k10);
        this.f10452r.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> x(K k10) {
        if (contains(k10)) {
            return this.f10452r.get(k10).f10460q;
        }
        return null;
    }
}
