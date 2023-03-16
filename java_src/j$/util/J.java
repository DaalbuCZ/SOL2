package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
class J implements InterfaceC0392t, j$.util.function.m, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f9602a = false;

    /* renamed from: b  reason: collision with root package name */
    int f9603b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ B f9604c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(B b10) {
        this.f9604c = b10;
    }

    public void a(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        while (hasNext()) {
            mVar.d(nextInt());
        }
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        this.f9602a = true;
        this.f9603b = i10;
    }

    @Override // j$.util.Iterator
    public void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            a((j$.util.function.m) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f9637a) {
            while (hasNext()) {
                consumer.accept(Integer.valueOf(nextInt()));
            }
            return;
        }
        Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        if (!this.f9602a) {
            this.f9604c.i(this);
        }
        return this.f9602a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public Integer next() {
        if (Y.f9637a) {
            Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    public int nextInt() {
        if (this.f9602a || hasNext()) {
            this.f9602a = false;
            return this.f9603b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
