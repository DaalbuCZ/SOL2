package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class G implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ H f9598a;

    private /* synthetic */ G(H h10) {
        this.f9598a = h10;
    }

    public static /* synthetic */ Spliterator a(H h10) {
        if (h10 == null) {
            return null;
        }
        return new G(h10);
    }

    @Override // java.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.f9598a.characteristics();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.f9598a.estimateSize();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f9598a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return this.f9598a.getComparator();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return this.f9598a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f9598a.hasCharacteristics(i10);
    }

    @Override // java.util.Spliterator
    public /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f9598a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public /* synthetic */ Spliterator trySplit() {
        return a(this.f9598a.trySplit());
    }
}
