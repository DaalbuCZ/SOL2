package p9;

import j9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k9.k;
import z8.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {

    /* loaded from: classes.dex */
    public static final class a implements Iterable<T> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b f12507n;

        public a(b bVar) {
            this.f12507n = bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f12507n.iterator();
        }
    }

    public static <T> Iterable<T> c(b<? extends T> bVar) {
        k.e(bVar, "<this>");
        return new a(bVar);
    }

    public static <T, R> b<R> d(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        k.e(bVar, "<this>");
        k.e(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C e(b<? extends T> bVar, C c10) {
        k.e(bVar, "<this>");
        k.e(c10, "destination");
        for (T t10 : bVar) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> f(b<? extends T> bVar) {
        List<T> g10;
        k.e(bVar, "<this>");
        g10 = j.g(g(bVar));
        return g10;
    }

    public static final <T> List<T> g(b<? extends T> bVar) {
        k.e(bVar, "<this>");
        return (List) e(bVar, new ArrayList());
    }
}
