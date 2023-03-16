package j$.util;

import j$.util.function.C0259b;
import j$.util.function.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0257f implements Comparator, InterfaceC0256e {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C0253c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        C0259b c0259b = toDoubleFunction == null ? null : new C0259b(toDoubleFunction);
        Objects.requireNonNull(c0259b);
        return AbstractC0251a.A(this, new C0255d(c0259b, 1));
    }

    @Override // java.util.Comparator
    public Comparator thenComparingInt(ToIntFunction toIntFunction) {
        C0259b c0259b = toIntFunction == null ? null : new C0259b(toIntFunction);
        Objects.requireNonNull(c0259b);
        return AbstractC0251a.A(this, new C0255d(c0259b, 2));
    }

    @Override // java.util.Comparator
    public Comparator thenComparingLong(ToLongFunction toLongFunction) {
        C0259b c0259b = toLongFunction == null ? null : new C0259b(toLongFunction);
        Objects.requireNonNull(c0259b);
        return AbstractC0251a.A(this, new C0255d(c0259b, 3));
    }

    @Override // java.util.Comparator
    public Comparator thenComparing(Function function) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        Objects.requireNonNull(convert);
        return AbstractC0251a.A(this, new C0255d(convert, 0));
    }

    @Override // java.util.Comparator
    public Comparator thenComparing(java.util.function.Function function, Comparator comparator) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        Objects.requireNonNull(convert);
        Objects.requireNonNull(comparator);
        return AbstractC0251a.A(this, new C0253c(comparator, convert, 1));
    }
}
