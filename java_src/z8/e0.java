package z8;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e0 extends d0 {
    public static final <T> Set<T> b() {
        return v.f17515n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        k9.k.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : d0.a(set.iterator().next()) : b();
    }
}
