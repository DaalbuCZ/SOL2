package k5;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class v implements f6.d, f6.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<f6.b<Object>, Executor>> f10680a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<f6.a<?>> f10681b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f10682c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f10682c = executor;
    }

    private synchronized Set<Map.Entry<f6.b<Object>, Executor>> g(f6.a<?> aVar) {
        ConcurrentHashMap<f6.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f10680a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, f6.a aVar) {
        ((f6.b) entry.getKey()).a(aVar);
    }

    @Override // f6.c
    public void a(final f6.a<?> aVar) {
        e0.b(aVar);
        synchronized (this) {
            Queue<f6.a<?>> queue = this.f10681b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<f6.b<Object>, Executor> entry : g(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: k5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.h(entry, aVar);
                    }
                });
            }
        }
    }

    @Override // f6.d
    public synchronized <T> void b(Class<T> cls, f6.b<? super T> bVar) {
        e0.b(cls);
        e0.b(bVar);
        if (this.f10680a.containsKey(cls)) {
            ConcurrentHashMap<f6.b<Object>, Executor> concurrentHashMap = this.f10680a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f10680a.remove(cls);
            }
        }
    }

    @Override // f6.d
    public synchronized <T> void c(Class<T> cls, Executor executor, f6.b<? super T> bVar) {
        e0.b(cls);
        e0.b(bVar);
        e0.b(executor);
        if (!this.f10680a.containsKey(cls)) {
            this.f10680a.put(cls, new ConcurrentHashMap<>());
        }
        this.f10680a.get(cls).put(bVar, executor);
    }

    @Override // f6.d
    public <T> void d(Class<T> cls, f6.b<? super T> bVar) {
        c(cls, this.f10682c, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Queue<f6.a<?>> queue;
        synchronized (this) {
            queue = this.f10681b;
            if (queue != null) {
                this.f10681b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (f6.a<?> aVar : queue) {
                a(aVar);
            }
        }
    }
}
