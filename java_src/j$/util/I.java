package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
class I implements java.util.Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f9599a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f9600b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ H f9601c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(H h10) {
        this.f9601c = h10;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9599a = true;
        this.f9600b = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f9599a) {
            this.f9601c.a(this);
        }
        return this.f9599a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f9599a || hasNext()) {
            this.f9599a = false;
            return this.f9600b;
        }
        throw new NoSuchElementException();
    }
}
