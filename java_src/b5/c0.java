package b5;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class c0 {

    /* loaded from: classes.dex */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: s  reason: collision with root package name */
        transient a5.o<? extends List<V>> f2780s;

        a(Map<K, Collection<V>> map, a5.o<? extends List<V>> oVar) {
            super(map);
            this.f2780s = (a5.o) a5.j.i(oVar);
        }

        @Override // b5.f
        Map<K, Collection<V>> c() {
            return q();
        }

        @Override // b5.f
        Set<K> d() {
            return r();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b5.d
        /* renamed from: x */
        public List<V> o() {
            return this.f2780s.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(z<?, ?> zVar, @CheckForNull Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }

    public static <K, V> v<K, V> b(Map<K, Collection<V>> map, a5.o<? extends List<V>> oVar) {
        return new a(map, oVar);
    }
}
