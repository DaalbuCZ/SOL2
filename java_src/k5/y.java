package k5;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y<T> implements i6.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f10687b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<i6.b<T>> f10686a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<i6.b<T>> collection) {
        this.f10686a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y<?> b(Collection<i6.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (i6.b<T> bVar : this.f10686a) {
            this.f10687b.add(bVar.get());
        }
        this.f10686a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(i6.b<T> bVar) {
        Set set;
        if (this.f10687b == null) {
            set = this.f10686a;
        } else {
            set = this.f10687b;
            bVar = (i6.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // i6.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f10687b == null) {
            synchronized (this) {
                if (this.f10687b == null) {
                    this.f10687b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f10687b);
    }
}
