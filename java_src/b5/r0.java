package b5;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* loaded from: classes.dex */
abstract class r0<F, T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    final Iterator<? extends F> f2877n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Iterator<? extends F> it) {
        this.f2877n = (Iterator) a5.j.i(it);
    }

    abstract T b(F f10);

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f2877n.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        return b(this.f2877n.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.f2877n.remove();
    }
}
