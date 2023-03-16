package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0394v implements PrimitiveIterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC0395w f10194a;

    private /* synthetic */ C0394v(InterfaceC0395w interfaceC0395w) {
        this.f10194a = interfaceC0395w;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(InterfaceC0395w interfaceC0395w) {
        return new C0394v(interfaceC0395w);
    }

    @Override // java.util.PrimitiveIterator
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        K k10 = (K) this.f10194a;
        Objects.requireNonNull(k10);
        k10.a((j$.util.function.r) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((K) this.f10194a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        ((K) this.f10194a).a(j$.util.function.q.a(longConsumer));
    }

    @Override // java.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return ((K) this.f10194a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public /* synthetic */ Long next() {
        return ((K) this.f10194a).next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public /* synthetic */ Object next() {
        return ((K) this.f10194a).next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public /* synthetic */ long nextLong() {
        return ((K) this.f10194a).nextLong();
    }

    @Override // java.util.Iterator
    public /* synthetic */ void remove() {
        ((K) this.f10194a).remove();
    }
}
