package p9;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j9.l;
import java.util.Iterator;
import k9.k;
/* loaded from: classes.dex */
public final class i<T, R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f12508a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, R> f12509b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        private final Iterator<T> f12510n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ i<T, R> f12511o;

        a(i<T, R> iVar) {
            this.f12511o = iVar;
            this.f12510n = ((i) iVar).f12508a.iterator();
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
            return this.f12510n.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public R next() {
            return (R) ((i) this.f12511o).f12509b.c(this.f12510n.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        k.e(bVar, "sequence");
        k.e(lVar, "transformer");
        this.f12508a = bVar;
        this.f12509b = lVar;
    }

    @Override // p9.b
    public java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
