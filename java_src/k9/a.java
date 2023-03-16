package k9;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class a<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    private final T[] f10876n;

    /* renamed from: o  reason: collision with root package name */
    private int f10877o;

    public a(T[] tArr) {
        k.e(tArr, "array");
        this.f10876n = tArr;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f10877o < this.f10876n.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f10876n;
            int i10 = this.f10877o;
            this.f10877o = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f10877o--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
