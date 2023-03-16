package b5;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c<K, V> extends d<K, V> implements v<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // b5.f, b5.z
    public Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override // b5.f
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // b5.d, b5.z
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // b5.d
    <E> Collection<E> u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // b5.d
    Collection<V> v(K k10, Collection<V> collection) {
        return w(k10, (List) collection, null);
    }
}
