package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.D0;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0251a {
    public static Comparator A(Comparator comparator, Comparator comparator2) {
        return comparator instanceof InterfaceC0256e ? ((EnumC0257f) ((InterfaceC0256e) comparator)).thenComparing(comparator2) : new C0253c(comparator, comparator2, 0);
    }

    public static void b(InterfaceC0272q interfaceC0272q, Consumer consumer) {
        if (consumer instanceof j$.util.function.h) {
            ((L) interfaceC0272q).a((j$.util.function.h) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f9637a) {
            L l10 = (L) interfaceC0272q;
            while (l10.hasNext()) {
                consumer.accept(Double.valueOf(l10.nextDouble()));
            }
            return;
        }
        Y.a(interfaceC0272q.getClass(), "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    public static void c(z zVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.h) {
            zVar.l((j$.util.function.h) consumer);
        } else if (Y.f9637a) {
            Y.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            zVar.l(new C0270o(consumer));
        }
    }

    public static void d(B b10, Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            b10.m((j$.util.function.m) consumer);
        } else if (Y.f9637a) {
            Y.a(b10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            b10.m(new r(consumer));
        }
    }

    public static void e(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.r) {
            d10.f((j$.util.function.r) consumer);
        } else if (Y.f9637a) {
            Y.a(d10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            d10.f(new C0393u(consumer));
        }
    }

    public static long h(H h10) {
        if ((h10.characteristics() & 64) == 0) {
            return -1L;
        }
        return h10.estimateSize();
    }

    public static boolean j(H h10, int i10) {
        return (h10.characteristics() & i10) == i10;
    }

    public static Stream n(Collection collection) {
        return D0.H0(Collection$EL.b(collection), true);
    }

    public static boolean o(Collection collection, Predicate predicate) {
        if (DesugarCollections.f9591a.isInstance(collection)) {
            return DesugarCollections.c(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        boolean z10 = false;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Stream p(Collection collection) {
        return D0.H0(Collection$EL.b(collection), false);
    }

    public static boolean q(z zVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.h) {
            return zVar.k((j$.util.function.h) consumer);
        }
        if (Y.f9637a) {
            Y.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return zVar.k(new C0270o(consumer));
    }

    public static boolean r(B b10, Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            return b10.i((j$.util.function.m) consumer);
        }
        if (Y.f9637a) {
            Y.a(b10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return b10.i(new r(consumer));
    }

    public static boolean s(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.r) {
            return d10.g((j$.util.function.r) consumer);
        }
        if (Y.f9637a) {
            Y.a(d10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return d10.g(new C0393u(consumer));
    }

    public static Optional t(C0266k c0266k) {
        if (c0266k == null) {
            return null;
        }
        return c0266k.c() ? Optional.of(c0266k.b()) : Optional.empty();
    }

    public static OptionalDouble u(C0267l c0267l) {
        if (c0267l == null) {
            return null;
        }
        return c0267l.c() ? OptionalDouble.of(c0267l.b()) : OptionalDouble.empty();
    }

    public static OptionalInt v(C0268m c0268m) {
        if (c0268m == null) {
            return null;
        }
        return c0268m.c() ? OptionalInt.of(c0268m.b()) : OptionalInt.empty();
    }

    public static OptionalLong w(C0269n c0269n) {
        if (c0269n == null) {
            return null;
        }
        return c0269n.c() ? OptionalLong.of(c0269n.b()) : OptionalLong.empty();
    }

    public static boolean x(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Comparator y() {
        return EnumC0257f.INSTANCE;
    }

    public static void z(List list, Comparator comparator) {
        if (DesugarCollections.f9592b.isInstance(list)) {
            DesugarCollections.d(list, comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public H trySplit() {
        return null;
    }
}
