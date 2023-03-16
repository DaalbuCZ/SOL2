package b5;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class a<E> extends t0<E> {

    /* renamed from: n  reason: collision with root package name */
    private final int f2766n;

    /* renamed from: o  reason: collision with root package name */
    private int f2767o;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        a5.j.k(i11, i10);
        this.f2766n = i10;
        this.f2767o = i11;
    }

    protected abstract E b(int i10);

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f2767o < this.f2766n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2767o > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f2767o;
            this.f2767o = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2767o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f2767o - 1;
            this.f2767o = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2767o - 1;
    }
}
