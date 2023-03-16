package z8;

import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends i {
    public static final <T> Collection<T> c(T[] tArr) {
        k9.k.e(tArr, "<this>");
        return new a(tArr, false);
    }

    public static <T> List<T> d() {
        return t.f17513n;
    }

    public static <T> int e(List<? extends T> list) {
        k9.k.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> f(T... tArr) {
        List<T> d10;
        List<T> a10;
        k9.k.e(tArr, "elements");
        if (tArr.length > 0) {
            a10 = e.a(tArr);
            return a10;
        }
        d10 = d();
        return d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> g(List<? extends T> list) {
        List<T> d10;
        List<T> b10;
        k9.k.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            d10 = d();
            return d10;
        } else if (size != 1) {
            return list;
        } else {
            b10 = i.b(list.get(0));
            return b10;
        }
    }

    public static void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
