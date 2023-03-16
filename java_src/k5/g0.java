package k5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
final class g0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f0<?>> f10638a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<?>> f10639b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f0<?>> f10640c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<f0<?>> f10641d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f0<?>> f10642e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f10643f;

    /* renamed from: g  reason: collision with root package name */
    private final e f10644g;

    /* loaded from: classes.dex */
    private static class a implements f6.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f10645a;

        /* renamed from: b  reason: collision with root package name */
        private final f6.c f10646b;

        public a(Set<Class<?>> set, f6.c cVar) {
            this.f10645a = set;
            this.f10646b = cVar;
        }

        @Override // f6.c
        public void a(f6.a<?> aVar) {
            if (!this.f10645a.contains(aVar.b())) {
                throw new t(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f10646b.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.e()) {
                boolean g10 = rVar.g();
                f0<?> c10 = rVar.c();
                if (g10) {
                    hashSet4.add(c10);
                } else {
                    hashSet.add(c10);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean g11 = rVar.g();
                f0<?> c11 = rVar.c();
                if (g11) {
                    hashSet5.add(c11);
                } else {
                    hashSet2.add(c11);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(f0.b(f6.c.class));
        }
        this.f10638a = Collections.unmodifiableSet(hashSet);
        this.f10639b = Collections.unmodifiableSet(hashSet2);
        this.f10640c = Collections.unmodifiableSet(hashSet3);
        this.f10641d = Collections.unmodifiableSet(hashSet4);
        this.f10642e = Collections.unmodifiableSet(hashSet5);
        this.f10643f = cVar.k();
        this.f10644g = eVar;
    }

    @Override // k5.e
    public <T> T a(Class<T> cls) {
        if (this.f10638a.contains(f0.b(cls))) {
            T t10 = (T) this.f10644g.a(cls);
            return !cls.equals(f6.c.class) ? t10 : (T) new a(this.f10643f, (f6.c) t10);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // k5.e
    public <T> i6.a<T> b(f0<T> f0Var) {
        if (this.f10640c.contains(f0Var)) {
            return this.f10644g.b(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f0Var));
    }

    @Override // k5.e
    public /* synthetic */ Set c(Class cls) {
        return d.e(this, cls);
    }

    @Override // k5.e
    public <T> i6.b<T> d(f0<T> f0Var) {
        if (this.f10639b.contains(f0Var)) {
            return this.f10644g.d(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f0Var));
    }

    @Override // k5.e
    public <T> i6.b<Set<T>> e(f0<T> f0Var) {
        if (this.f10642e.contains(f0Var)) {
            return this.f10644g.e(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f0Var));
    }

    @Override // k5.e
    public <T> i6.b<T> f(Class<T> cls) {
        return d(f0.b(cls));
    }

    @Override // k5.e
    public <T> Set<T> g(f0<T> f0Var) {
        if (this.f10641d.contains(f0Var)) {
            return this.f10644g.g(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f0Var));
    }

    @Override // k5.e
    public <T> T h(f0<T> f0Var) {
        if (this.f10638a.contains(f0Var)) {
            return (T) this.f10644g.h(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f0Var));
    }

    @Override // k5.e
    public <T> i6.a<T> i(Class<T> cls) {
        return b(f0.b(cls));
    }
}
