package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0273s implements PrimitiveIterator.OfInt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC0392t f9758a;

    private /* synthetic */ C0273s(InterfaceC0392t interfaceC0392t) {
        this.f9758a = interfaceC0392t;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC0392t interfaceC0392t) {
        return new C0273s(interfaceC0392t);
    }

    @Override // java.util.PrimitiveIterator
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        J j10 = (J) this.f9758a;
        Objects.requireNonNull(j10);
        j10.a((j$.util.function.m) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((J) this.f9758a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        ((J) this.f9758a).a(j$.util.function.l.a(intConsumer));
    }

    @Override // java.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return ((J) this.f9758a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public /* synthetic */ Integer next() {
        return ((J) this.f9758a).next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public /* synthetic */ Object next() {
        return ((J) this.f9758a).next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public /* synthetic */ int nextInt() {
        return ((J) this.f9758a).nextInt();
    }

    @Override // java.util.Iterator
    public /* synthetic */ void remove() {
        ((J) this.f9758a).remove();
    }
}
