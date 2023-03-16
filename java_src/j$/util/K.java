package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
class K implements InterfaceC0395w, j$.util.function.r, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f9605a = false;

    /* renamed from: b  reason: collision with root package name */
    long f9606b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ D f9607c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(D d10) {
        this.f9607c = d10;
    }

    public void a(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        while (hasNext()) {
            rVar.e(nextLong());
        }
    }

    @Override // j$.util.function.r
    public void e(long j10) {
        this.f9605a = true;
        this.f9606b = j10;
    }

    @Override // j$.util.Iterator
    public void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.r) {
            a((j$.util.function.r) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f9637a) {
            while (hasNext()) {
                consumer.accept(Long.valueOf(nextLong()));
            }
            return;
        }
        Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        if (!this.f9605a) {
            this.f9607c.g(this);
        }
        return this.f9605a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public Long next() {
        if (Y.f9637a) {
            Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    public long nextLong() {
        if (this.f9605a || hasNext()) {
            this.f9605a = false;
            return this.f9606b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
