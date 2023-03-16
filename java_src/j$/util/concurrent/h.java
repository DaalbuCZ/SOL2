package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends AbstractC0254a implements Iterator, Enumeration, j$.util.Iterator {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f9675k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap, int i13) {
        super(lVarArr, i10, i11, i12, concurrentHashMap);
        this.f9675k = i13;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f9675k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.f9675k) {
            case 0:
                l lVar = this.f9690b;
                if (lVar != null) {
                    Object obj = lVar.f9682b;
                    this.f9670j = lVar;
                    b();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                l lVar2 = this.f9690b;
                if (lVar2 != null) {
                    Object obj2 = lVar2.f9683c;
                    this.f9670j = lVar2;
                    b();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f9675k) {
            case 0:
                return next();
            default:
                return next();
        }
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f9675k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }
}
