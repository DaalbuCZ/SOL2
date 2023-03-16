package z8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {
    public static final <T> boolean g(T[] tArr, T t10) {
        k9.k.e(tArr, "<this>");
        return j(tArr, t10) >= 0;
    }

    public static <T> List<T> h(T[] tArr, int i10) {
        int a10;
        k9.k.e(tArr, "<this>");
        if (i10 >= 0) {
            a10 = n9.f.a(tArr.length - i10, 0);
            return o(tArr, a10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> T i(T[] tArr) {
        k9.k.e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> int j(T[] tArr, T t10) {
        k9.k.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (k9.k.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static char k(char[] cArr) {
        k9.k.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T l(T[] tArr) {
        k9.k.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] m(T[] tArr, Comparator<? super T> comparator) {
        k9.k.e(tArr, "<this>");
        k9.k.e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        k9.k.d(tArr2, "copyOf(this, size)");
        e.f(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> n(T[] tArr, Comparator<? super T> comparator) {
        List<T> a10;
        k9.k.e(tArr, "<this>");
        k9.k.e(comparator, "comparator");
        a10 = e.a(m(tArr, comparator));
        return a10;
    }

    public static final <T> List<T> o(T[] tArr, int i10) {
        List<T> b10;
        List<T> d10;
        k9.k.e(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            d10 = j.d();
            return d10;
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                return p(tArr);
            }
            if (i10 == 1) {
                b10 = i.b(tArr[length - 1]);
                return b10;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(tArr[i11]);
            }
            return arrayList;
        }
    }

    public static final <T> List<T> p(T[] tArr) {
        List<T> d10;
        List<T> b10;
        k9.k.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            d10 = j.d();
            return d10;
        } else if (length != 1) {
            return q(tArr);
        } else {
            b10 = i.b(tArr[0]);
            return b10;
        }
    }

    public static final <T> List<T> q(T[] tArr) {
        k9.k.e(tArr, "<this>");
        return new ArrayList(j.c(tArr));
    }
}
