package z8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public class r extends q {
    public static final <T, A extends Appendable> A k(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, j9.l<? super T, ? extends CharSequence> lVar) {
        k9.k.e(iterable, "<this>");
        k9.k.e(a10, "buffer");
        k9.k.e(charSequence, "separator");
        k9.k.e(charSequence2, "prefix");
        k9.k.e(charSequence3, "postfix");
        k9.k.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            q9.e.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String m(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, j9.l<? super T, ? extends CharSequence> lVar) {
        k9.k.e(iterable, "<this>");
        k9.k.e(charSequence, "separator");
        k9.k.e(charSequence2, "prefix");
        k9.k.e(charSequence3, "postfix");
        k9.k.e(charSequence4, "truncated");
        String sb = ((StringBuilder) k(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        k9.k.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String n(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, j9.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return m(iterable, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static <T extends Comparable<? super T>> T o(Iterable<? extends T> iterable) {
        k9.k.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static <T> T p(Iterable<? extends T> iterable) {
        k9.k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) q((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T q(List<? extends T> list) {
        k9.k.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T, C extends Collection<? super T>> C r(Iterable<? extends T> iterable, C c10) {
        k9.k.e(iterable, "<this>");
        k9.k.e(c10, "destination");
        for (T t10 : iterable) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> s(Iterable<? extends T> iterable) {
        List<T> g10;
        List<T> d10;
        List<T> b10;
        k9.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            g10 = j.g(t(iterable));
            return g10;
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            d10 = j.d();
            return d10;
        } else if (size != 1) {
            return u(collection);
        } else {
            b10 = i.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            return b10;
        }
    }

    public static final <T> List<T> t(Iterable<? extends T> iterable) {
        k9.k.e(iterable, "<this>");
        return iterable instanceof Collection ? u((Collection) iterable) : (List) r(iterable, new ArrayList());
    }

    public static final <T> List<T> u(Collection<? extends T> collection) {
        k9.k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> v(Iterable<? extends T> iterable) {
        int a10;
        k9.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return d0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                a10 = z.a(collection.size());
                return (Set) r(iterable, new LinkedHashSet(a10));
            }
            return e0.b();
        }
        return e0.c((Set) r(iterable, new LinkedHashSet()));
    }
}
