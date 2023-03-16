package m;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V>, j$.util.Map {

    /* renamed from: u  reason: collision with root package name */
    f<K, V> f11233u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0162a extends f<K, V> {
        C0162a() {
        }

        @Override // m.f
        protected void a() {
            a.this.clear();
        }

        @Override // m.f
        protected Object b(int i10, int i11) {
            return a.this.f11282o[(i10 << 1) + i11];
        }

        @Override // m.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // m.f
        protected int d() {
            return a.this.f11283p;
        }

        @Override // m.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // m.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // m.f
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // m.f
        protected void h(int i10) {
            a.this.j(i10);
        }

        @Override // m.f
        protected V i(int i10, V v10) {
            return a.this.k(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    private f<K, V> m() {
        if (this.f11233u == null) {
            this.f11233u = new C0162a();
        }
        return this.f11233u;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map, j$.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        c(this.f11283p + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
