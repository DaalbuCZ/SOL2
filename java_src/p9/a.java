package p9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import k9.k;
/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<b<T>> f12505a;

    public a(b<? extends T> bVar) {
        k.e(bVar, "sequence");
        this.f12505a = new AtomicReference<>(bVar);
    }

    @Override // p9.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f12505a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
