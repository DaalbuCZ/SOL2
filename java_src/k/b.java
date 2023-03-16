package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: n  reason: collision with root package name */
    c<K, V> f10453n;

    /* renamed from: o  reason: collision with root package name */
    private c<K, V> f10454o;

    /* renamed from: p  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f10455p = new WeakHashMap<>();

    /* renamed from: q  reason: collision with root package name */
    private int f10456q = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f10460q;
        }

        @Override // k.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f10459p;
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0147b<K, V> extends e<K, V> {
        C0147b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f10459p;
        }

        @Override // k.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f10460q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: n  reason: collision with root package name */
        final K f10457n;

        /* renamed from: o  reason: collision with root package name */
        final V f10458o;

        /* renamed from: p  reason: collision with root package name */
        c<K, V> f10459p;

        /* renamed from: q  reason: collision with root package name */
        c<K, V> f10460q;

        c(K k10, V v10) {
            this.f10457n = k10;
            this.f10458o = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f10457n.equals(cVar.f10457n) && this.f10458o.equals(cVar.f10458o);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10457n;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10458o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10457n.hashCode() ^ this.f10458o.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10457n + "=" + this.f10458o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: n  reason: collision with root package name */
        private c<K, V> f10461n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f10462o = true;

        d() {
        }

        @Override // k.b.f
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f10461n;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f10460q;
                this.f10461n = cVar3;
                this.f10462o = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f10462o) {
                this.f10462o = false;
                cVar = b.this.f10453n;
            } else {
                c<K, V> cVar2 = this.f10461n;
                cVar = cVar2 != null ? cVar2.f10459p : null;
            }
            this.f10461n = cVar;
            return this.f10461n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10462o) {
                return b.this.f10453n != null;
            }
            c<K, V> cVar = this.f10461n;
            return (cVar == null || cVar.f10459p == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: n  reason: collision with root package name */
        c<K, V> f10464n;

        /* renamed from: o  reason: collision with root package name */
        c<K, V> f10465o;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f10464n = cVar2;
            this.f10465o = cVar;
        }

        private c<K, V> g() {
            c<K, V> cVar = this.f10465o;
            c<K, V> cVar2 = this.f10464n;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // k.b.f
        public void b(c<K, V> cVar) {
            if (this.f10464n == cVar && cVar == this.f10465o) {
                this.f10465o = null;
                this.f10464n = null;
            }
            c<K, V> cVar2 = this.f10464n;
            if (cVar2 == cVar) {
                this.f10464n = c(cVar2);
            }
            if (this.f10465o == cVar) {
                this.f10465o = g();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f10465o;
            this.f10465o = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10465o != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.f10453n;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0147b c0147b = new C0147b(this.f10454o, this.f10453n);
        this.f10455p.put(c0147b, Boolean.FALSE);
        return c0147b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    protected c<K, V> g(K k10) {
        c<K, V> cVar = this.f10453n;
        while (cVar != null && !cVar.f10457n.equals(k10)) {
            cVar = cVar.f10459p;
        }
        return cVar;
    }

    public b<K, V>.d h() {
        b<K, V>.d dVar = new d();
        this.f10455p.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f10453n, this.f10454o);
        this.f10455p.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry<K, V> k() {
        return this.f10454o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> l(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f10456q++;
        c<K, V> cVar2 = this.f10454o;
        if (cVar2 == null) {
            this.f10453n = cVar;
        } else {
            cVar2.f10459p = cVar;
            cVar.f10460q = cVar2;
        }
        this.f10454o = cVar;
        return cVar;
    }

    public V s(K k10, V v10) {
        c<K, V> g10 = g(k10);
        if (g10 != null) {
            return g10.f10458o;
        }
        l(k10, v10);
        return null;
    }

    public int size() {
        return this.f10456q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public V v(K k10) {
        c<K, V> g10 = g(k10);
        if (g10 == null) {
            return null;
        }
        this.f10456q--;
        if (!this.f10455p.isEmpty()) {
            for (f<K, V> fVar : this.f10455p.keySet()) {
                fVar.b(g10);
            }
        }
        c<K, V> cVar = g10.f10460q;
        c<K, V> cVar2 = g10.f10459p;
        if (cVar != null) {
            cVar.f10459p = cVar2;
        } else {
            this.f10453n = cVar2;
        }
        c<K, V> cVar3 = g10.f10459p;
        if (cVar3 != null) {
            cVar3.f10460q = cVar;
        } else {
            this.f10454o = cVar;
        }
        g10.f10459p = null;
        g10.f10460q = null;
        return g10.f10458o;
    }
}
