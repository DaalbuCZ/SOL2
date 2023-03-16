package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: n  reason: collision with root package name */
    private final Object f12281n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private final Map<E, Integer> f12282o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private Set<E> f12283p = Collections.emptySet();

    /* renamed from: q  reason: collision with root package name */
    private List<E> f12284q = Collections.emptyList();

    public void d(E e10) {
        synchronized (this.f12281n) {
            ArrayList arrayList = new ArrayList(this.f12284q);
            arrayList.add(e10);
            this.f12284q = Collections.unmodifiableList(arrayList);
            Integer num = this.f12282o.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f12283p);
                hashSet.add(e10);
                this.f12283p = Collections.unmodifiableSet(hashSet);
            }
            this.f12282o.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int g(E e10) {
        int intValue;
        synchronized (this.f12281n) {
            intValue = this.f12282o.containsKey(e10) ? this.f12282o.get(e10).intValue() : 0;
        }
        return intValue;
    }

    public void h(E e10) {
        synchronized (this.f12281n) {
            Integer num = this.f12282o.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f12284q);
            arrayList.remove(e10);
            this.f12284q = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f12282o.remove(e10);
                HashSet hashSet = new HashSet(this.f12283p);
                hashSet.remove(e10);
                this.f12283p = Collections.unmodifiableSet(hashSet);
            } else {
                this.f12282o.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f12281n) {
            it = this.f12284q.iterator();
        }
        return it;
    }

    public Set<E> n() {
        Set<E> set;
        synchronized (this.f12281n) {
            set = this.f12283p;
        }
        return set;
    }
}
