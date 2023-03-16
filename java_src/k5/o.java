package k5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k5.o;
/* loaded from: classes.dex */
public class o implements e, a6.a {

    /* renamed from: h  reason: collision with root package name */
    private static final i6.b<Set<Object>> f10656h = l.f10651a;

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, i6.b<?>> f10657a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<f0<?>, i6.b<?>> f10658b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<f0<?>, y<?>> f10659c;

    /* renamed from: d  reason: collision with root package name */
    private final List<i6.b<ComponentRegistrar>> f10660d;

    /* renamed from: e  reason: collision with root package name */
    private final v f10661e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f10662f;

    /* renamed from: g  reason: collision with root package name */
    private final j f10663g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f10664a;

        /* renamed from: b  reason: collision with root package name */
        private final List<i6.b<ComponentRegistrar>> f10665b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f10666c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f10667d = j.f10648a;

        b(Executor executor) {
            this.f10664a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f10666c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f10665b.add(new i6.b() { // from class: k5.p
                @Override // i6.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = o.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<i6.b<ComponentRegistrar>> collection) {
            this.f10665b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f10664a, this.f10665b, this.f10666c, this.f10667d);
        }

        public b g(j jVar) {
            this.f10667d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable<i6.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f10657a = new HashMap();
        this.f10658b = new HashMap();
        this.f10659c = new HashMap();
        this.f10662f = new AtomicReference<>();
        v vVar = new v(executor);
        this.f10661e = vVar;
        this.f10663g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, f6.d.class, f6.c.class));
        arrayList.add(c.s(this, a6.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f10660d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<i6.b<ComponentRegistrar>> it = this.f10660d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f10663g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f10657a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f10657a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f10657a.put(cVar, new x(new i6.b() { // from class: k5.k
                    @Override // i6.b
                    public final Object get() {
                        Object r10;
                        r10 = o.this.r(cVar);
                        return r10;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        u();
    }

    private void o(Map<c<?>, i6.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, i6.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            i6.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f10661e.f();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new g0(cVar, this));
    }

    private void u() {
        Boolean bool = this.f10662f.get();
        if (bool != null) {
            o(this.f10657a, bool.booleanValue());
        }
    }

    private void v() {
        Map map;
        f0<?> c10;
        i6.b e10;
        for (c<?> cVar : this.f10657a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.g() && !this.f10659c.containsKey(rVar.c())) {
                    map = this.f10659c;
                    c10 = rVar.c();
                    e10 = y.b(Collections.emptySet());
                } else if (this.f10658b.containsKey(rVar.c())) {
                    continue;
                } else if (rVar.f()) {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.c()));
                } else {
                    if (!rVar.g()) {
                        map = this.f10658b;
                        c10 = rVar.c();
                        e10 = d0.e();
                    }
                }
                map.put(c10, e10);
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final i6.b<?> bVar = this.f10657a.get(cVar);
                for (f0<? super Object> f0Var : cVar.j()) {
                    if (this.f10658b.containsKey(f0Var)) {
                        final d0 d0Var = (d0) this.f10658b.get(f0Var);
                        arrayList.add(new Runnable() { // from class: k5.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                d0.this.j(bVar);
                            }
                        });
                    } else {
                        this.f10658b.put(f0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, i6.b<?>> entry : this.f10657a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                i6.b<?> value = entry.getValue();
                for (f0<? super Object> f0Var : key.j()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f10659c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.f10659c.get(entry2.getKey());
                for (final i6.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: k5.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f10659c.put((f0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // k5.e
    public /* synthetic */ Object a(Class cls) {
        return d.a(this, cls);
    }

    @Override // k5.e
    public <T> i6.a<T> b(f0<T> f0Var) {
        i6.b<T> d10 = d(f0Var);
        return d10 == null ? d0.e() : d10 instanceof d0 ? (d0) d10 : d0.i(d10);
    }

    @Override // k5.e
    public /* synthetic */ Set c(Class cls) {
        return d.e(this, cls);
    }

    @Override // k5.e
    public synchronized <T> i6.b<T> d(f0<T> f0Var) {
        e0.c(f0Var, "Null interface requested.");
        return (i6.b<T>) this.f10658b.get(f0Var);
    }

    @Override // k5.e
    public synchronized <T> i6.b<Set<T>> e(f0<T> f0Var) {
        y<?> yVar = this.f10659c.get(f0Var);
        if (yVar != null) {
            return yVar;
        }
        return (i6.b<Set<T>>) f10656h;
    }

    @Override // k5.e
    public /* synthetic */ i6.b f(Class cls) {
        return d.d(this, cls);
    }

    @Override // k5.e
    public /* synthetic */ Set g(f0 f0Var) {
        return d.f(this, f0Var);
    }

    @Override // k5.e
    public /* synthetic */ Object h(f0 f0Var) {
        return d.b(this, f0Var);
    }

    @Override // k5.e
    public /* synthetic */ i6.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z10) {
        HashMap hashMap;
        if (this.f10662f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f10657a);
            }
            o(hashMap, z10);
        }
    }
}
