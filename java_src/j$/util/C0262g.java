package j$.util;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0262g implements java.util.Map, Serializable, Map {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f9737a;

    /* renamed from: b  reason: collision with root package name */
    final Object f9738b;

    /* renamed from: c  reason: collision with root package name */
    private transient Set f9739c;

    /* renamed from: d  reason: collision with root package name */
    private transient Set f9740d;

    /* renamed from: e  reason: collision with root package name */
    private transient Collection f9741e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0262g(java.util.Map map) {
        Objects.requireNonNull(map);
        this.f9737a = map;
        this.f9738b = this;
    }

    private Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f9596f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f9596f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public void clear() {
        synchronized (this.f9738b) {
            this.f9737a.clear();
        }
    }

    @Override // j$.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        Object $default$compute;
        Object s10;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            if (map instanceof Map) {
                $default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                loop0: while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    while (true) {
                        s10 = biFunction.s(obj, obj2);
                        if (s10 != null) {
                            if (obj2 == null) {
                                obj2 = concurrentMap.putIfAbsent(obj, s10);
                                if (obj2 == null) {
                                    break loop0;
                                }
                            } else if (concurrentMap.replace(obj, obj2, s10)) {
                                break;
                            }
                        } else {
                            s10 = null;
                            if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                                break;
                            }
                        }
                    }
                }
                $default$compute = s10;
            } else {
                $default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return $default$compute;
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        Object $default$computeIfAbsent;
        Object a10;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (a10 = function.a(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, a10)) == null) ? a10 : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object $default$computeIfPresent;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        $default$computeIfPresent = obj2;
                        break;
                    }
                    Object s10 = biFunction.s(obj, obj2);
                    if (s10 != null) {
                        if (concurrentMap.replace(obj, obj2, s10)) {
                            $default$computeIfPresent = s10;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj2)) {
                        $default$computeIfPresent = null;
                        break;
                    }
                }
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f9738b) {
            containsKey = this.f9737a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f9738b) {
            containsValue = this.f9737a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public Set entrySet() {
        Set set;
        synchronized (this.f9738b) {
            if (this.f9740d == null) {
                this.f9740d = a(this.f9737a.entrySet(), this.f9738b);
            }
            set = this.f9740d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f9738b) {
            equals = this.f9737a.equals(obj);
        }
        return equals;
    }

    @Override // j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.time.temporal.n.a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public Object get(Object obj) {
        Object obj2;
        synchronized (this.f9738b) {
            obj2 = this.f9737a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f9738b) {
            orDefault = Map.EL.getOrDefault(this.f9737a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public int hashCode() {
        int hashCode;
        synchronized (this.f9738b) {
            hashCode = this.f9737a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f9738b) {
            isEmpty = this.f9737a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public Set keySet() {
        Set set;
        synchronized (this.f9738b) {
            if (this.f9739c == null) {
                this.f9739c = a(this.f9737a.keySet(), this.f9738b);
            }
            set = this.f9739c;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.s(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9738b
            monitor-enter(r0)
            java.util.Map r1 = r4.f9737a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.s(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C0262g.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f9738b) {
            put = this.f9737a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, j$.util.Map
    public void putAll(java.util.Map map) {
        synchronized (this.f9738b) {
            this.f9737a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        Object a10;
        synchronized (this.f9738b) {
            a10 = Map.EL.a(this.f9737a, obj, obj2);
        }
        return a10;
    }

    @Override // java.util.Map, j$.util.Map
    public Object remove(Object obj) {
        Object remove;
        synchronized (this.f9738b) {
            remove = this.f9737a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
        }
        return replace;
    }

    @Override // j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.u) {
                    ((j$.util.concurrent.u) concurrentMap).forEach(tVar);
                } else {
                    j$.time.temporal.n.a(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public int size() {
        int size;
        synchronized (this.f9738b) {
            size = this.f9737a.size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f9738b) {
            obj = this.f9737a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f9738b) {
            if (this.f9741e == null) {
                Collection values = this.f9737a.values();
                Object obj = this.f9738b;
                constructor = DesugarCollections.f9595e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f9595e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f9741e = collection2;
            }
            collection = this.f9741e;
        }
        return collection;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f9738b) {
            java.util.Map map = this.f9737a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }
}
