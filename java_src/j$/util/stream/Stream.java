package j$.util.stream;

import j$.util.C0266k;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.Comparator;
/* loaded from: classes2.dex */
public interface Stream<T> extends InterfaceC0309h {
    void a(Consumer consumer);

    boolean anyMatch(Predicate<? super T> predicate);

    InterfaceC0330l0 b(Function function);

    long count();

    void d(Consumer consumer);

    Stream distinct();

    Object e(j$.util.function.A a10, BiConsumer biConsumer, BiConsumer biConsumer2);

    C0266k findAny();

    C0266k findFirst();

    Object[] g(j$.util.function.n nVar);

    Stream h(Predicate predicate);

    InterfaceC0330l0 j(j$.util.function.C c10);

    Stream k(Function function);

    Object l(C0319j c0319j);

    Stream limit(long j10);

    Stream m(Function function);

    C0266k max(Comparator comparator);

    C0266k min(Comparator comparator);

    Stream n(Consumer consumer);

    boolean o(Predicate predicate);

    C0266k p(InterfaceC0260c interfaceC0260c);

    InterfaceC0369u0 q(Function function);

    boolean s(Predicate predicate);

    Stream skip(long j10);

    Stream sorted();

    Stream sorted(Comparator comparator);

    InterfaceC0369u0 t(j$.util.function.D d10);

    Object[] toArray();

    Object u(Object obj, BiFunction biFunction, InterfaceC0260c interfaceC0260c);

    H v(j$.util.function.B b10);

    H w(Function function);

    Object z(Object obj, InterfaceC0260c interfaceC0260c);
}
