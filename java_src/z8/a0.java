package z8;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 extends z {
    public static final <K, V> Map<K, V> d() {
        u uVar = u.f17514n;
        k9.k.c(uVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return uVar;
    }

    public static <K, V> Map<K, V> e(y8.l<? extends K, ? extends V>... lVarArr) {
        k9.k.e(lVarArr, "pairs");
        return lVarArr.length > 0 ? k(lVarArr, new LinkedHashMap(x.a(lVarArr.length))) : d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> f(Map<K, ? extends V> map) {
        k9.k.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z.c(map) : d();
    }

    public static final <K, V> void g(Map<? super K, ? super V> map, Iterable<? extends y8.l<? extends K, ? extends V>> iterable) {
        k9.k.e(map, "<this>");
        k9.k.e(iterable, "pairs");
        for (y8.l<? extends K, ? extends V> lVar : iterable) {
            map.put((K) lVar.a(), (V) lVar.b());
        }
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, y8.l<? extends K, ? extends V>[] lVarArr) {
        k9.k.e(map, "<this>");
        k9.k.e(lVarArr, "pairs");
        for (y8.l<? extends K, ? extends V> lVar : lVarArr) {
            map.put((K) lVar.a(), (V) lVar.b());
        }
    }

    public static <K, V> Map<K, V> i(Iterable<? extends y8.l<? extends K, ? extends V>> iterable) {
        k9.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return j(iterable, new LinkedHashMap(x.a(collection.size())));
                }
                return z.b(iterable instanceof List ? (y8.l<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return d();
        }
        return f(j(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M j(Iterable<? extends y8.l<? extends K, ? extends V>> iterable, M m10) {
        k9.k.e(iterable, "<this>");
        k9.k.e(m10, "destination");
        g(m10, iterable);
        return m10;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M k(y8.l<? extends K, ? extends V>[] lVarArr, M m10) {
        k9.k.e(lVarArr, "<this>");
        k9.k.e(m10, "destination");
        h(m10, lVarArr);
        return m10;
    }
}
