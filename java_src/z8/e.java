package z8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class e extends d {
    public static <T> List<T> a(T[] tArr) {
        k9.k.e(tArr, "<this>");
        List<T> a10 = g.a(tArr);
        k9.k.d(a10, "asList(this)");
        return a10;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        k9.k.e(tArr, "<this>");
        k9.k.e(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return b(objArr, objArr2, i10, i11, i12);
    }

    public static <T> void d(T[] tArr, T t10, int i10, int i11) {
        k9.k.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void e(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        d(objArr, obj, i10, i11);
    }

    public static final <T> void f(T[] tArr, Comparator<? super T> comparator) {
        k9.k.e(tArr, "<this>");
        k9.k.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
