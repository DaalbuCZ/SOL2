package b5;

import b5.o;
import com.google.j2objc.annotations.RetainedWith;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class r<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: q  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f2869q = new Map.Entry[0];
    @RetainedWith
    @CheckForNull

    /* renamed from: n  reason: collision with root package name */
    private transient s<Map.Entry<K, V>> f2870n;
    @RetainedWith
    @CheckForNull

    /* renamed from: o  reason: collision with root package name */
    private transient s<K> f2871o;
    @RetainedWith
    @CheckForNull

    /* renamed from: p  reason: collision with root package name */
    private transient o<V> f2872p;

    /* loaded from: classes.dex */
    public static class a<K, V> {
        @CheckForNull

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f2873a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f2874b;

        /* renamed from: c  reason: collision with root package name */
        int f2875c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2876d;

        public a() {
            this(4);
        }

        a(int i10) {
            this.f2874b = new Object[i10 * 2];
            this.f2875c = 0;
            this.f2876d = false;
        }

        private void c(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f2874b;
            if (i11 > objArr.length) {
                this.f2874b = Arrays.copyOf(objArr, o.b.c(objArr.length, i11));
                this.f2876d = false;
            }
        }

        public r<K, V> a() {
            return b();
        }

        public r<K, V> b() {
            g();
            this.f2876d = true;
            return k0.l(this.f2875c, this.f2874b);
        }

        public a<K, V> d(K k10, V v10) {
            c(this.f2875c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f2874b;
            int i10 = this.f2875c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f2875c = i10 + 1;
            return this;
        }

        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f2875c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                e(entry);
            }
            return this;
        }

        void g() {
            int i10;
            if (this.f2873a != null) {
                if (this.f2876d) {
                    this.f2874b = Arrays.copyOf(this.f2874b, this.f2875c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f2875c];
                int i11 = 0;
                while (true) {
                    i10 = this.f2875c;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = i11 * 2;
                    Object obj = this.f2874b[i12];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f2874b[i12 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, h0.a(this.f2873a).c(y.j()));
                for (int i13 = 0; i13 < this.f2875c; i13++) {
                    int i14 = i13 * 2;
                    this.f2874b[i14] = entryArr[i13].getKey();
                    this.f2874b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> r<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.f(iterable);
        return aVar.a();
    }

    public static <K, V> r<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof r) && !(map instanceof SortedMap)) {
            r<K, V> rVar = (r) map;
            if (!rVar.h()) {
                return rVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> r<K, V> j() {
        return (r<K, V>) k0.f2830u;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    abstract s<Map.Entry<K, V>> d();

    abstract s<K> e();

    @Override // java.util.Map, j$.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return y.c(this, obj);
    }

    abstract o<V> f();

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: g */
    public s<Map.Entry<K, V>> entrySet() {
        s<Map.Entry<K, V>> sVar = this.f2870n;
        if (sVar == null) {
            s<Map.Entry<K, V>> d10 = d();
            this.f2870n = d10;
            return d10;
        }
        return sVar;
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract boolean h();

    @Override // java.util.Map, j$.util.Map
    public int hashCode() {
        return p0.d(entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: i */
    public s<K> keySet() {
        s<K> sVar = this.f2871o;
        if (sVar == null) {
            s<K> e10 = e();
            this.f2871o = e10;
            return e10;
        }
        return sVar;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: k */
    public o<V> values() {
        o<V> oVar = this.f2872p;
        if (oVar == null) {
            o<V> f10 = f();
            this.f2872p = f10;
            return f10;
        }
        return oVar;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public String toString() {
        return y.i(this);
    }
}
