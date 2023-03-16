package j$.util.concurrent;

import j$.util.AbstractC0251a;
import j$.util.G;
import j$.util.H;
import j$.util.InterfaceC0252b;
import j$.util.function.C0259b;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.C0283b3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.stream.Stream;
/* loaded from: classes2.dex */
final class e extends b implements Set, InterfaceC0252b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // j$.util.InterfaceC0252b
    public void a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        l[] lVarArr = this.f9671a.f9656a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l b10 = pVar.b();
            if (b10 == null) {
                return;
            }
            consumer.accept(new k(b10.f9682b, b10.f9683c, this.f9671a));
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // j$.util.InterfaceC0252b
    public /* synthetic */ boolean b(Predicate predicate) {
        return AbstractC0251a.o(this, predicate);
    }

    @Override // java.util.Collection, java.util.Set
    /* renamed from: c */
    public boolean add(Map.Entry entry) {
        return this.f9671a.h(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f9671a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArr = this.f9671a.f9656a;
        int i10 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b10 = pVar.b();
                if (b10 == null) {
                    break;
                }
                i10 += b10.hashCode();
            }
        }
        return i10;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f9671a;
        l[] lVarArr = concurrentHashMap.f9656a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new d(lVarArr, length, 0, length, concurrentHashMap);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C0283b3.A(AbstractC0251a.n(this));
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f9671a.remove(key, value);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return AbstractC0251a.o(this, j$.util.function.y.a(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0252b
    public H spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f9671a;
        long m10 = concurrentHashMap.m();
        l[] lVarArr = concurrentHashMap.f9656a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new f(lVarArr, length, 0, length, m10 >= 0 ? m10 : 0L, concurrentHashMap);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return G.a(spliterator());
    }

    @Override // java.util.Collection, j$.util.InterfaceC0252b
    public /* synthetic */ j$.util.stream.Stream stream() {
        return AbstractC0251a.p(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C0283b3.A(AbstractC0251a.p(this));
    }

    public Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) ((C0259b) C0259b.B(intFunction)).u(0));
    }
}
