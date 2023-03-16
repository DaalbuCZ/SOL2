package b5;

import b5.f;
import b5.y;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d<K, V> extends b5.f<K, V> implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    private transient Map<K, Collection<V>> f2781q;

    /* renamed from: r  reason: collision with root package name */
    private transient int f2782r;

    /* loaded from: classes.dex */
    class a extends d<K, V>.c<V> {
        a(d dVar) {
            super();
        }

        @Override // b5.d.c
        V b(K k10, V v10) {
            return v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends y.f<K, Collection<V>> {

        /* renamed from: p  reason: collision with root package name */
        final transient Map<K, Collection<V>> f2783p;

        /* loaded from: classes.dex */
        class a extends y.c<K, Collection<V>> {
            a() {
            }

            @Override // b5.y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return b5.i.c(b.this.f2783p.entrySet(), obj);
            }

            @Override // b5.y.c
            Map<K, Collection<V>> d() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0059b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    d.this.t(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: b5.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0059b implements Iterator<Map.Entry<K, Collection<V>>>, j$.util.Iterator {

            /* renamed from: n  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f2786n;
            @CheckForNull

            /* renamed from: o  reason: collision with root package name */
            Collection<V> f2787o;

            C0059b() {
                this.f2786n = b.this.f2783p.entrySet().iterator();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f2786n.next();
                this.f2787o = next.getValue();
                return b.this.e(next);
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                return this.f2786n.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                a5.j.o(this.f2787o != null, "no calls to next() since the last call to remove()");
                this.f2786n.remove();
                d.m(d.this, this.f2787o.size());
                this.f2787o.clear();
                this.f2787o = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f2783p = map;
        }

        @Override // b5.y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: c */
        public Collection<V> get(@CheckForNull Object obj) {
            Collection<V> collection = (Collection) y.g(this.f2783p, obj);
            if (collection == null) {
                return null;
            }
            return d.this.v(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f2783p == d.this.f2781q) {
                d.this.clear();
            } else {
                u.c(new C0059b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return y.f(this.f2783p, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: d */
        public Collection<V> remove(@CheckForNull Object obj) {
            Collection<V> remove = this.f2783p.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o10 = d.this.o();
            o10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return o10;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return y.d(key, d.this.v(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f2783p.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f2783p.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f2783p.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f2783p.toString();
        }
    }

    /* loaded from: classes.dex */
    private abstract class c<T> implements java.util.Iterator<T>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        final java.util.Iterator<Map.Entry<K, Collection<V>>> f2789n;
        @CheckForNull

        /* renamed from: o  reason: collision with root package name */
        K f2790o = null;
        @CheckForNull

        /* renamed from: p  reason: collision with root package name */
        Collection<V> f2791p = null;

        /* renamed from: q  reason: collision with root package name */
        java.util.Iterator<V> f2792q = u.f();

        c() {
            this.f2789n = (java.util.Iterator<Map.Entry<K, V>>) d.this.f2781q.entrySet().iterator();
        }

        abstract T b(K k10, V v10);

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f2789n.hasNext() || this.f2792q.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (!this.f2792q.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f2789n.next();
                this.f2790o = next.getKey();
                Collection<V> value = next.getValue();
                this.f2791p = value;
                this.f2792q = value.iterator();
            }
            return b(f0.a(this.f2790o), this.f2792q.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f2792q.remove();
            Collection<V> collection = this.f2791p;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f2789n.remove();
            }
            d.k(d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0060d extends y.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b5.d$d$a */
        /* loaded from: classes.dex */
        public class a implements java.util.Iterator<K>, j$.util.Iterator {
            @CheckForNull

            /* renamed from: n  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f2795n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ java.util.Iterator f2796o;

            a(java.util.Iterator it) {
                this.f2796o = it;
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                return this.f2796o.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f2796o.next();
                this.f2795n = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                a5.j.o(this.f2795n != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f2795n.getValue();
                this.f2796o.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f2795n = null;
            }
        }

        C0060d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return d().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || d().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return new a(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int i10;
            Collection<V> remove = d().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(K k10) {
            return h().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(K k10) {
            return h().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(h().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(K k10) {
            return h().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.d.h
        /* renamed from: i */
        public NavigableSet<K> f() {
            return new f(h());
        }

        @Override // b5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // b5.d.h, b5.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @CheckForNull
        Map.Entry<K, Collection<V>> l(java.util.Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> o10 = d.this.o();
                o10.addAll(next.getValue());
                it.remove();
                return y.d(next.getKey(), d.this.u(o10));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(K k10) {
            return h().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.d.h
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // b5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // b5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(h().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(h().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(K k10) {
            return g().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(g().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(K k10) {
            return g().floorKey(k10);
        }

        @Override // b5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(g().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(K k10) {
            return g().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.d.i
        /* renamed from: k */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        @Override // b5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(K k10) {
            return g().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) u.m(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) u.m(descendingIterator());
        }

        @Override // b5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: s */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(g().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(g().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k10, @CheckForNull List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {
        @CheckForNull

        /* renamed from: r  reason: collision with root package name */
        SortedSet<K> f2800r;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        SortedSet<K> f() {
            return new i(h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return h().firstKey();
        }

        @Override // b5.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f2800r;
            if (sortedSet == null) {
                SortedSet<K> f10 = f();
                this.f2800r = f10;
                return f10;
            }
            return sortedSet;
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f2783p;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(h().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(h().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i extends d<K, V>.C0060d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return g().firstKey();
        }

        SortedMap<K, Collection<V>> g() {
            return (SortedMap) super.d();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(g().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return g().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(g().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(g().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection<V> {

        /* renamed from: n  reason: collision with root package name */
        final K f2803n;

        /* renamed from: o  reason: collision with root package name */
        Collection<V> f2804o;
        @CheckForNull

        /* renamed from: p  reason: collision with root package name */
        final d<K, V>.j f2805p;
        @CheckForNull

        /* renamed from: q  reason: collision with root package name */
        final Collection<V> f2806q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements java.util.Iterator<V>, j$.util.Iterator {

            /* renamed from: n  reason: collision with root package name */
            final java.util.Iterator<V> f2808n;

            /* renamed from: o  reason: collision with root package name */
            final Collection<V> f2809o;

            a() {
                Collection<V> collection = j.this.f2804o;
                this.f2809o = collection;
                this.f2808n = d.s(collection);
            }

            a(java.util.Iterator<V> it) {
                this.f2809o = j.this.f2804o;
                this.f2808n = it;
            }

            java.util.Iterator<V> b() {
                c();
                return this.f2808n;
            }

            void c() {
                j.this.l();
                if (j.this.f2804o != this.f2809o) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                c();
                return this.f2808n.hasNext();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public V next() {
                c();
                return this.f2808n.next();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                this.f2808n.remove();
                d.k(d.this);
                j.this.s();
            }
        }

        j(K k10, Collection<V> collection, @CheckForNull d<K, V>.j jVar) {
            this.f2803n = k10;
            this.f2804o = collection;
            this.f2805p = jVar;
            this.f2806q = jVar == null ? null : jVar.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            l();
            boolean isEmpty = this.f2804o.isEmpty();
            boolean add = this.f2804o.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f2804o.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f2804o.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f2804o.clear();
            d.m(d.this, size);
            s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            l();
            return this.f2804o.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            l();
            return this.f2804o.containsAll(collection);
        }

        void d() {
            d<K, V>.j jVar = this.f2805p;
            if (jVar != null) {
                jVar.d();
            } else {
                d.this.f2781q.put(this.f2803n, this.f2804o);
            }
        }

        @Override // java.util.Collection
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            l();
            return this.f2804o.equals(obj);
        }

        @CheckForNull
        d<K, V>.j g() {
            return this.f2805p;
        }

        Collection<V> h() {
            return this.f2804o;
        }

        @Override // java.util.Collection
        public int hashCode() {
            l();
            return this.f2804o.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            l();
            return new a();
        }

        K k() {
            return this.f2803n;
        }

        void l() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f2805p;
            if (jVar != null) {
                jVar.l();
                if (this.f2805p.h() != this.f2806q) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f2804o.isEmpty() || (collection = (Collection) d.this.f2781q.get(this.f2803n)) == null) {
            } else {
                this.f2804o = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            l();
            boolean remove = this.f2804o.remove(obj);
            if (remove) {
                d.k(d.this);
                s();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f2804o.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f2804o.size() - size);
                s();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            a5.j.i(collection);
            int size = size();
            boolean retainAll = this.f2804o.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f2804o.size() - size);
                s();
            }
            return retainAll;
        }

        void s() {
            d<K, V>.j jVar = this.f2805p;
            if (jVar != null) {
                jVar.s();
            } else if (this.f2804o.isEmpty()) {
                d.this.f2781q.remove(this.f2803n);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            l();
            return this.f2804o.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            l();
            return this.f2804o.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends d<K, V>.j implements List<V> {

        /* loaded from: classes.dex */
        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(k.this.v().listIterator(i10));
            }

            private ListIterator<V> d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                d().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.d();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }
        }

        k(K k10, List<V> list, @CheckForNull d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            l();
            boolean isEmpty = h().isEmpty();
            v().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = v().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, h().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            l();
            return v().get(i10);
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object obj) {
            l();
            return v().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            l();
            return v().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            l();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            l();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            l();
            V remove = v().remove(i10);
            d.k(d.this);
            s();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            l();
            return v().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            l();
            return d.this.w(k(), v().subList(i10, i11), g() == null ? this : g());
        }

        List<V> v() {
            return (List) h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        a5.j.d(map.isEmpty());
        this.f2781q = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i10 = dVar.f2782r;
        dVar.f2782r = i10 + 1;
        return i10;
    }

    static /* synthetic */ int k(d dVar) {
        int i10 = dVar.f2782r;
        dVar.f2782r = i10 - 1;
        return i10;
    }

    static /* synthetic */ int l(d dVar, int i10) {
        int i11 = dVar.f2782r + i10;
        dVar.f2782r = i11;
        return i11;
    }

    static /* synthetic */ int m(d dVar, int i10) {
        int i11 = dVar.f2782r - i10;
        dVar.f2782r = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Iterator<E> s(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(@CheckForNull Object obj) {
        Collection collection = (Collection) y.h(this.f2781q, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f2782r -= size;
        }
    }

    @Override // b5.z
    public void clear() {
        for (Collection<V> collection : this.f2781q.values()) {
            collection.clear();
        }
        this.f2781q.clear();
        this.f2782r = 0;
    }

    @Override // b5.f
    Collection<V> e() {
        return new f.a();
    }

    @Override // b5.f
    java.util.Iterator<V> g() {
        return new a(this);
    }

    abstract Collection<V> o();

    Collection<V> p(K k10) {
        return o();
    }

    @Override // b5.z
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f2781q.get(k10);
        if (collection != null) {
            if (collection.add(v10)) {
                this.f2782r++;
                return true;
            }
            return false;
        }
        Collection<V> p10 = p(k10);
        if (p10.add(v10)) {
            this.f2782r++;
            this.f2781q.put(k10, p10);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.f2781q;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f2781q) : map instanceof SortedMap ? new h((SortedMap) this.f2781q) : new b(this.f2781q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> r() {
        Map<K, Collection<V>> map = this.f2781q;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f2781q) : map instanceof SortedMap ? new i((SortedMap) this.f2781q) : new C0060d(this.f2781q);
    }

    @Override // b5.z
    public int size() {
        return this.f2782r;
    }

    abstract <E> Collection<E> u(Collection<E> collection);

    abstract Collection<V> v(K k10, Collection<V> collection);

    @Override // b5.f, b5.z
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> w(K k10, List<V> list, @CheckForNull d<K, V>.j jVar) {
        return list instanceof RandomAccess ? new g(this, k10, list, jVar) : new k(k10, list, jVar);
    }
}
