package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class d extends AbstractC0254a implements Iterator, j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(l[] lVarArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, i11, i12, concurrentHashMap);
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public Object next() {
        l lVar = this.f9690b;
        if (lVar != null) {
            Object obj = lVar.f9682b;
            Object obj2 = lVar.f9683c;
            this.f9670j = lVar;
            b();
            return new k(obj, obj2, this.f9669i);
        }
        throw new NoSuchElementException();
    }
}
