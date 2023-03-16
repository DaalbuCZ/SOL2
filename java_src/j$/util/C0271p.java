package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0271p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0272q f9756a;

    private /* synthetic */ C0271p(InterfaceC0272q interfaceC0272q) {
        this.f9756a = interfaceC0272q;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(InterfaceC0272q interfaceC0272q) {
        return new C0271p(interfaceC0272q);
    }

    @Override // java.util.PrimitiveIterator
    public /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        L l10 = (L) this.f9756a;
        Objects.requireNonNull(l10);
        l10.a((j$.util.function.h) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        ((L) this.f9756a).a(j$.util.function.g.a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return ((L) this.f9756a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ Double next() {
        return ((L) this.f9756a).next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ Object next() {
        return ((L) this.f9756a).next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public /* synthetic */ double nextDouble() {
        return ((L) this.f9756a).nextDouble();
    }

    @Override // java.util.Iterator
    public /* synthetic */ void remove() {
        ((L) this.f9756a).remove();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        InterfaceC0272q interfaceC0272q = this.f9756a;
        j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        L l10 = (L) interfaceC0272q;
        Objects.requireNonNull(l10);
        AbstractC0251a.b(l10, convert);
    }
}
