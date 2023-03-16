package b5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f<K, V> implements z<K, V> {
    @CheckForNull

    /* renamed from: n  reason: collision with root package name */
    private transient Set<K> f2814n;
    @CheckForNull

    /* renamed from: o  reason: collision with root package name */
    private transient Collection<V> f2815o;
    @CheckForNull

    /* renamed from: p  reason: collision with root package name */
    private transient Map<K, Collection<V>> f2816p;

    /* loaded from: classes.dex */
    class a extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return f.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // b5.z
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f2816p;
        if (map == null) {
            Map<K, Collection<V>> c10 = c();
            this.f2816p = c10;
            return c10;
        }
        return map;
    }

    public boolean b(@CheckForNull Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> c();

    abstract Set<K> d();

    abstract Collection<V> e();

    public boolean equals(@CheckForNull Object obj) {
        return c0.a(this, obj);
    }

    public Set<K> f() {
        Set<K> set = this.f2814n;
        if (set == null) {
            Set<K> d10 = d();
            this.f2814n = d10;
            return d10;
        }
        return set;
    }

    abstract Iterator<V> g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // b5.z
    public Collection<V> values() {
        Collection<V> collection = this.f2815o;
        if (collection == null) {
            Collection<V> e10 = e();
            this.f2815o = e10;
            return e10;
        }
        return collection;
    }
}
