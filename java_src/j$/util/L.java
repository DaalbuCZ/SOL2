package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class L implements InterfaceC0272q, j$.util.function.h, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f9608a = false;

    /* renamed from: b  reason: collision with root package name */
    double f9609b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z f9610c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(z zVar) {
        this.f9610c = zVar;
    }

    public void a(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        while (hasNext()) {
            hVar.c(nextDouble());
        }
    }

    @Override // j$.util.function.h
    public void c(double d10) {
        this.f9608a = true;
        this.f9609b = d10;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.b(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        if (!this.f9608a) {
            this.f9610c.k(this);
        }
        return this.f9608a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public Double next() {
        if (Y.f9637a) {
            Y.a(L.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    public double nextDouble() {
        if (this.f9608a || hasNext()) {
            this.f9608a = false;
            return this.f9609b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
