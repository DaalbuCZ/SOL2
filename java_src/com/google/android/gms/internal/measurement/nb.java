package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class nb extends AbstractMap {

    /* renamed from: n  reason: collision with root package name */
    private final int f4029n;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4032q;

    /* renamed from: r  reason: collision with root package name */
    private volatile lb f4033r;

    /* renamed from: o  reason: collision with root package name */
    private List f4030o = Collections.emptyList();

    /* renamed from: p  reason: collision with root package name */
    private Map f4031p = Collections.emptyMap();

    /* renamed from: s  reason: collision with root package name */
    private Map f4034s = Collections.emptyMap();

    private final int k(Comparable comparable) {
        int size = this.f4030o.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((hb) this.f4030o.get(size)).e());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((hb) this.f4030o.get(i11)).e());
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
    public final Object l(int i10) {
        n();
        Object value = ((hb) this.f4030o.remove(i10)).getValue();
        if (!this.f4031p.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f4030o;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new hb(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f4031p.isEmpty() && !(this.f4031p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4031p = treeMap;
            this.f4034s = treeMap.descendingMap();
        }
        return (SortedMap) this.f4031p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f4032q) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f4032q) {
            return;
        }
        this.f4031p = this.f4031p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4031p);
        this.f4034s = this.f4034s.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4034s);
        this.f4032q = true;
    }

    public final int b() {
        return this.f4030o.size();
    }

    public final Iterable c() {
        return this.f4031p.isEmpty() ? gb.a() : this.f4031p.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f4030o.isEmpty()) {
            this.f4030o.clear();
        }
        if (this.f4031p.isEmpty()) {
            return;
        }
        this.f4031p.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f4031p.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int k10 = k(comparable);
        if (k10 >= 0) {
            return ((hb) this.f4030o.get(k10)).setValue(obj);
        }
        n();
        if (this.f4030o.isEmpty() && !(this.f4030o instanceof ArrayList)) {
            this.f4030o = new ArrayList(this.f4029n);
        }
        int i10 = -(k10 + 1);
        if (i10 >= this.f4029n) {
            return m().put(comparable, obj);
        }
        int size = this.f4030o.size();
        int i11 = this.f4029n;
        if (size == i11) {
            hb hbVar = (hb) this.f4030o.remove(i11 - 1);
            m().put(hbVar.e(), hbVar.getValue());
        }
        this.f4030o.add(i10, new hb(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4033r == null) {
            this.f4033r = new lb(this, null);
        }
        return this.f4033r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nb) {
            nb nbVar = (nb) obj;
            int size = size();
            if (size != nbVar.size()) {
                return false;
            }
            int b10 = b();
            if (b10 == nbVar.b()) {
                for (int i10 = 0; i10 < b10; i10++) {
                    if (!g(i10).equals(nbVar.g(i10))) {
                        return false;
                    }
                }
                if (b10 == size) {
                    return true;
                }
                entrySet = this.f4031p;
                entrySet2 = nbVar.f4031p;
            } else {
                entrySet = entrySet();
                entrySet2 = nbVar.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f4030o.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        return k10 >= 0 ? ((hb) this.f4030o.get(k10)).getValue() : this.f4031p.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((hb) this.f4030o.get(i11)).hashCode();
        }
        return this.f4031p.size() > 0 ? i10 + this.f4031p.hashCode() : i10;
    }

    public final boolean j() {
        return this.f4032q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        if (k10 >= 0) {
            return l(k10);
        }
        if (this.f4031p.isEmpty()) {
            return null;
        }
        return this.f4031p.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4030o.size() + this.f4031p.size();
    }
}
