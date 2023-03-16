package h7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    private static final Comparator<Comparable> f8132u = new a();

    /* renamed from: n  reason: collision with root package name */
    Comparator<? super K> f8133n;

    /* renamed from: o  reason: collision with root package name */
    e<K, V> f8134o;

    /* renamed from: p  reason: collision with root package name */
    int f8135p;

    /* renamed from: q  reason: collision with root package name */
    int f8136q;

    /* renamed from: r  reason: collision with root package name */
    final e<K, V> f8137r;

    /* renamed from: s  reason: collision with root package name */
    private h<K, V>.b f8138s;

    /* renamed from: t  reason: collision with root package name */
    private h<K, V>.c f8139t;

    /* loaded from: classes.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c10;
            if ((obj instanceof Map.Entry) && (c10 = h.this.c((Map.Entry) obj)) != null) {
                h.this.f(c10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f8135p;
        }
    }

    /* loaded from: classes.dex */
    final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public K next() {
                return b().f8153s;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f8135p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        e<K, V> f8144n;

        /* renamed from: o  reason: collision with root package name */
        e<K, V> f8145o = null;

        /* renamed from: p  reason: collision with root package name */
        int f8146p;

        d() {
            this.f8144n = h.this.f8137r.f8151q;
            this.f8146p = h.this.f8136q;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.f8144n;
            h hVar = h.this;
            if (eVar != hVar.f8137r) {
                if (hVar.f8136q == this.f8146p) {
                    this.f8144n = eVar.f8151q;
                    this.f8145o = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
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
        public final boolean hasNext() {
            return this.f8144n != h.this.f8137r;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f8145o;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.f(eVar, true);
            this.f8145o = null;
            this.f8146p = h.this.f8136q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: n  reason: collision with root package name */
        e<K, V> f8148n;

        /* renamed from: o  reason: collision with root package name */
        e<K, V> f8149o;

        /* renamed from: p  reason: collision with root package name */
        e<K, V> f8150p;

        /* renamed from: q  reason: collision with root package name */
        e<K, V> f8151q;

        /* renamed from: r  reason: collision with root package name */
        e<K, V> f8152r;

        /* renamed from: s  reason: collision with root package name */
        final K f8153s;

        /* renamed from: t  reason: collision with root package name */
        V f8154t;

        /* renamed from: u  reason: collision with root package name */
        int f8155u;

        e() {
            this.f8153s = null;
            this.f8152r = this;
            this.f8151q = this;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f8148n = eVar;
            this.f8153s = k10;
            this.f8155u = 1;
            this.f8151q = eVar2;
            this.f8152r = eVar3;
            eVar3.f8151q = this;
            eVar2.f8152r = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f8149o; eVar2 != null; eVar2 = eVar2.f8149o) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f8150p; eVar2 != null; eVar2 = eVar2.f8150p) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f8153s;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.f8154t;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v10.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f8153s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8154t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f8153s;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f8154t;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f8154t;
            this.f8154t = v10;
            return v11;
        }

        public String toString() {
            return this.f8153s + "=" + this.f8154t;
        }
    }

    public h() {
        this(f8132u);
    }

    public h(Comparator<? super K> comparator) {
        this.f8135p = 0;
        this.f8136q = 0;
        this.f8137r = new e<>();
        this.f8133n = comparator == null ? f8132u : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f8149o;
            e<K, V> eVar3 = eVar.f8150p;
            int i10 = eVar2 != null ? eVar2.f8155u : 0;
            int i11 = eVar3 != null ? eVar3.f8155u : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f8149o;
                e<K, V> eVar5 = eVar3.f8150p;
                int i13 = (eVar4 != null ? eVar4.f8155u : 0) - (eVar5 != null ? eVar5.f8155u : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    j(eVar3);
                }
                i(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f8149o;
                e<K, V> eVar7 = eVar2.f8150p;
                int i14 = (eVar6 != null ? eVar6.f8155u : 0) - (eVar7 != null ? eVar7.f8155u : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    i(eVar2);
                }
                j(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f8155u = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f8155u = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f8148n;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f8148n;
        eVar.f8148n = null;
        if (eVar2 != null) {
            eVar2.f8148n = eVar3;
        }
        if (eVar3 == null) {
            this.f8134o = eVar2;
        } else if (eVar3.f8149o == eVar) {
            eVar3.f8149o = eVar2;
        } else {
            eVar3.f8150p = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f8149o;
        e<K, V> eVar3 = eVar.f8150p;
        e<K, V> eVar4 = eVar3.f8149o;
        e<K, V> eVar5 = eVar3.f8150p;
        eVar.f8150p = eVar4;
        if (eVar4 != null) {
            eVar4.f8148n = eVar;
        }
        h(eVar, eVar3);
        eVar3.f8149o = eVar;
        eVar.f8148n = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f8155u : 0, eVar4 != null ? eVar4.f8155u : 0) + 1;
        eVar.f8155u = max;
        eVar3.f8155u = Math.max(max, eVar5 != null ? eVar5.f8155u : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f8149o;
        e<K, V> eVar3 = eVar.f8150p;
        e<K, V> eVar4 = eVar2.f8149o;
        e<K, V> eVar5 = eVar2.f8150p;
        eVar.f8149o = eVar5;
        if (eVar5 != null) {
            eVar5.f8148n = eVar;
        }
        h(eVar, eVar2);
        eVar2.f8150p = eVar;
        eVar.f8148n = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f8155u : 0, eVar5 != null ? eVar5.f8155u : 0) + 1;
        eVar.f8155u = max;
        eVar2.f8155u = Math.max(max, eVar4 != null ? eVar4.f8155u : 0) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f8133n;
        e<K, V> eVar2 = this.f8134o;
        if (eVar2 != null) {
            Comparable comparable = comparator == f8132u ? (Comparable) k10 : null;
            while (true) {
                Object obj = (K) eVar2.f8153s;
                i10 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k10, obj);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f8149o : eVar2.f8150p;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            e<K, V> eVar4 = this.f8137r;
            if (eVar2 != null) {
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f8152r);
                if (i10 < 0) {
                    eVar2.f8149o = eVar;
                } else {
                    eVar2.f8150p = eVar;
                }
                e(eVar2, true);
            } else if (comparator == f8132u && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            } else {
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f8152r);
                this.f8134o = eVar;
            }
            this.f8135p++;
            this.f8136q++;
            return eVar;
        }
        return null;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f8154t, entry.getValue())) {
            return d10;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f8134o = null;
        this.f8135p = 0;
        this.f8136q++;
        e<K, V> eVar = this.f8137r;
        eVar.f8152r = eVar;
        eVar.f8151q = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f8138s;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f8138s = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f8152r;
            eVar2.f8151q = eVar.f8151q;
            eVar.f8151q.f8152r = eVar2;
        }
        e<K, V> eVar3 = eVar.f8149o;
        e<K, V> eVar4 = eVar.f8150p;
        e<K, V> eVar5 = eVar.f8148n;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f8149o = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f8150p = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f8135p--;
            this.f8136q++;
            return;
        }
        e<K, V> b10 = eVar3.f8155u > eVar4.f8155u ? eVar3.b() : eVar4.a();
        f(b10, false);
        e<K, V> eVar6 = eVar.f8149o;
        if (eVar6 != null) {
            i10 = eVar6.f8155u;
            b10.f8149o = eVar6;
            eVar6.f8148n = b10;
            eVar.f8149o = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f8150p;
        if (eVar7 != null) {
            i11 = eVar7.f8155u;
            b10.f8150p = eVar7;
            eVar7.f8148n = b10;
            eVar.f8150p = null;
        }
        b10.f8155u = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    e<K, V> g(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            return d10.f8154t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.f8139t;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f8139t = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> b10 = b(k10, true);
        V v11 = b10.f8154t;
        b10.f8154t = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g10 = g(obj);
        if (g10 != null) {
            return g10.f8154t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8135p;
    }
}
