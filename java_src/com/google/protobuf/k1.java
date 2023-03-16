package com.google.protobuf;

import com.google.protobuf.u;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    private final int f6018n;

    /* renamed from: o  reason: collision with root package name */
    private List<k1<K, V>.e> f6019o;

    /* renamed from: p  reason: collision with root package name */
    private Map<K, V> f6020p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6021q;

    /* renamed from: r  reason: collision with root package name */
    private volatile k1<K, V>.g f6022r;

    /* renamed from: s  reason: collision with root package name */
    private Map<K, V> f6023s;

    /* renamed from: t  reason: collision with root package name */
    private volatile k1<K, V>.c f6024t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends k1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.k1
        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> j10 = j(i10);
                    if (((u.b) j10.getKey()).f()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                Iterator it = m().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((u.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // com.google.protobuf.k1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((u.b) obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        private int f6025n;

        /* renamed from: o  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f6026o;

        private b() {
            this.f6025n = k1.this.f6019o.size();
        }

        /* synthetic */ b(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f6026o == null) {
                this.f6026o = k1.this.f6023s.entrySet().iterator();
            }
            return this.f6026o;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (b().hasNext()) {
                entry = b().next();
            } else {
                List list = k1.this.f6019o;
                int i10 = this.f6025n - 1;
                this.f6025n = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
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
            int i10 = this.f6025n;
            return (i10 > 0 && i10 <= k1.this.f6019o.size()) || b().hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends k1<K, V>.g {
        private c() {
            super(k1.this, null);
        }

        /* synthetic */ c(k1 k1Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.k1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new b(k1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final java.util.Iterator<Object> f6029a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f6030b = new b();

        /* loaded from: classes.dex */
        static class a implements java.util.Iterator<Object>, j$.util.Iterator {
            a() {
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<Object> iterator() {
                return d.f6029a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f6030b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<k1<K, V>.e> {

        /* renamed from: n  reason: collision with root package name */
        private final K f6031n;

        /* renamed from: o  reason: collision with root package name */
        private V f6032o;

        e(K k10, V v10) {
            this.f6031n = k10;
            this.f6032o = v10;
        }

        e(k1 k1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return g(this.f6031n, entry.getKey()) && g(this.f6032o, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6032o;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h */
        public K getKey() {
            return this.f6031n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f6031n;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f6032o;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            k1.this.g();
            V v11 = this.f6032o;
            this.f6032o = v10;
            return v11;
        }

        public String toString() {
            return this.f6031n + "=" + this.f6032o;
        }
    }

    /* loaded from: classes.dex */
    private class f implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        private int f6034n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f6035o;

        /* renamed from: p  reason: collision with root package name */
        private java.util.Iterator<Map.Entry<K, V>> f6036p;

        private f() {
            this.f6034n = -1;
        }

        /* synthetic */ f(k1 k1Var, a aVar) {
            this();
        }

        private java.util.Iterator<Map.Entry<K, V>> b() {
            if (this.f6036p == null) {
                this.f6036p = k1.this.f6020p.entrySet().iterator();
            }
            return this.f6036p;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f6035o = true;
            int i10 = this.f6034n + 1;
            this.f6034n = i10;
            return i10 < k1.this.f6019o.size() ? (Map.Entry<K, V>) k1.this.f6019o.get(this.f6034n) : b().next();
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
            if (this.f6034n + 1 >= k1.this.f6019o.size()) {
                return !k1.this.f6020p.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (!this.f6035o) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f6035o = false;
            k1.this.g();
            if (this.f6034n >= k1.this.f6019o.size()) {
                b().remove();
                return;
            }
            k1 k1Var = k1.this;
            int i10 = this.f6034n;
            this.f6034n = i10 - 1;
            k1Var.s(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(k1 k1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new f(k1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                k1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k1.this.size();
        }
    }

    private k1(int i10) {
        this.f6018n = i10;
        this.f6019o = Collections.emptyList();
        this.f6020p = Collections.emptyMap();
        this.f6023s = Collections.emptyMap();
    }

    /* synthetic */ k1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f6019o.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f6019o.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f6019o.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6021q) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f6019o.isEmpty() || (this.f6019o instanceof ArrayList)) {
            return;
        }
        this.f6019o = new ArrayList(this.f6018n);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f6020p.isEmpty() && !(this.f6020p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6020p = treeMap;
            this.f6023s = treeMap.descendingMap();
        }
        return (SortedMap) this.f6020p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> k1<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f6019o.remove(i10).getValue();
        if (!this.f6020p.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f6019o.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f6019o.isEmpty()) {
            this.f6019o.clear();
        }
        if (this.f6020p.isEmpty()) {
            return;
        }
        this.f6020p.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f6020p.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f6022r == null) {
            this.f6022r = new g(this, null);
        }
        return this.f6022r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            int size = size();
            if (size != k1Var.size()) {
                return false;
            }
            int k10 = k();
            if (k10 != k1Var.k()) {
                return entrySet().equals(k1Var.entrySet());
            }
            for (int i10 = 0; i10 < k10; i10++) {
                if (!j(i10).equals(k1Var.j(i10))) {
                    return false;
                }
            }
            if (k10 != size) {
                return this.f6020p.equals(k1Var.f6020p);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f6019o.get(f10).getValue() : this.f6020p.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f6024t == null) {
            this.f6024t = new c(this, null);
        }
        return this.f6024t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f6019o.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f6020p.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f6019o.get(i10);
    }

    public int k() {
        return this.f6019o.size();
    }

    public int l() {
        return this.f6020p.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f6020p.isEmpty() ? d.b() : this.f6020p.entrySet();
    }

    public boolean o() {
        return this.f6021q;
    }

    public void p() {
        if (this.f6021q) {
            return;
        }
        this.f6020p = this.f6020p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6020p);
        this.f6023s = this.f6023s.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6023s);
        this.f6021q = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f6019o.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f6018n) {
            return n().put(k10, v10);
        }
        int size = this.f6019o.size();
        int i11 = this.f6018n;
        if (size == i11) {
            k1<K, V>.e remove = this.f6019o.remove(i11 - 1);
            n().put((K) remove.getKey(), remove.getValue());
        }
        this.f6019o.add(i10, new e(k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) s(f10);
        }
        if (this.f6020p.isEmpty()) {
            return null;
        }
        return this.f6020p.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6019o.size() + this.f6020p.size();
    }
}
