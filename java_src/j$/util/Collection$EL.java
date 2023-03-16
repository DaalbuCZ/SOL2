package j$.util;

import j$.util.function.Consumer;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* renamed from: j$.util.Collection$-EL  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Collection$EL {
    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0252b) {
            ((InterfaceC0252b) collection).a(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static H b(Collection collection) {
        if (collection instanceof InterfaceC0252b) {
            return ((InterfaceC0252b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            Objects.requireNonNull(linkedHashSet);
            return new U(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C0396x(sortedSet, sortedSet, 21);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            Objects.requireNonNull(set);
            return new U(set, 1);
        } else if (collection instanceof List) {
            List list = (List) collection;
            Objects.requireNonNull(list);
            return new U(list, 16);
        } else {
            Objects.requireNonNull(collection);
            return new U(collection, 0);
        }
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof InterfaceC0252b ? ((InterfaceC0252b) collection).stream() : AbstractC0251a.p(collection);
    }
}
