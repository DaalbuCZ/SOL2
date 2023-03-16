package k5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f10613a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<? super T>> f10614b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f10615c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10616d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10617e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f10618f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f10619g;

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f10620a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<f0<? super T>> f10621b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f10622c;

        /* renamed from: d  reason: collision with root package name */
        private int f10623d;

        /* renamed from: e  reason: collision with root package name */
        private int f10624e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f10625f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f10626g;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f10620a = null;
            HashSet hashSet = new HashSet();
            this.f10621b = hashSet;
            this.f10622c = new HashSet();
            this.f10623d = 0;
            this.f10624e = 0;
            this.f10626g = new HashSet();
            e0.c(cls, "Null interface");
            hashSet.add(f0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                e0.c(cls2, "Null interface");
                this.f10621b.add(f0.b(cls2));
            }
        }

        @SafeVarargs
        private b(f0<T> f0Var, f0<? super T>... f0VarArr) {
            this.f10620a = null;
            HashSet hashSet = new HashSet();
            this.f10621b = hashSet;
            this.f10622c = new HashSet();
            this.f10623d = 0;
            this.f10624e = 0;
            this.f10626g = new HashSet();
            e0.c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (f0<? super T> f0Var2 : f0VarArr) {
                e0.c(f0Var2, "Null interface");
            }
            Collections.addAll(this.f10621b, f0VarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f10624e = 1;
            return this;
        }

        private b<T> i(int i10) {
            e0.d(this.f10623d == 0, "Instantiation type has already been set.");
            this.f10623d = i10;
            return this;
        }

        private void j(f0<?> f0Var) {
            e0.a(!this.f10621b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            e0.c(rVar, "Null dependency");
            j(rVar.c());
            this.f10622c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            e0.d(this.f10625f != null, "Missing required property: factory.");
            return new c<>(this.f10620a, new HashSet(this.f10621b), new HashSet(this.f10622c), this.f10623d, this.f10624e, this.f10625f, this.f10626g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(h<T> hVar) {
            this.f10625f = (h) e0.c(hVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f10620a = str;
            return this;
        }
    }

    private c(String str, Set<f0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f10613a = str;
        this.f10614b = Collections.unmodifiableSet(set);
        this.f10615c = Collections.unmodifiableSet(set2);
        this.f10616d = i10;
        this.f10617e = i11;
        this.f10618f = hVar;
        this.f10619g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(f0<T> f0Var) {
        return new b<>(f0Var, new f0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(f0<T> f0Var, f0<? super T>... f0VarArr) {
        return new b<>(f0Var, f0VarArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new h() { // from class: k5.a
            @Override // k5.h
            public final Object a(e eVar) {
                Object q10;
                q10 = c.q(t10, eVar);
                return q10;
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: k5.b
            @Override // k5.h
            public final Object a(e eVar) {
                Object r10;
                r10 = c.r(t10, eVar);
                return r10;
            }
        }).d();
    }

    public Set<r> g() {
        return this.f10615c;
    }

    public h<T> h() {
        return this.f10618f;
    }

    public String i() {
        return this.f10613a;
    }

    public Set<f0<? super T>> j() {
        return this.f10614b;
    }

    public Set<Class<?>> k() {
        return this.f10619g;
    }

    public boolean n() {
        return this.f10616d == 1;
    }

    public boolean o() {
        return this.f10616d == 2;
    }

    public boolean p() {
        return this.f10617e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c<>(this.f10613a, this.f10614b, this.f10615c, this.f10616d, this.f10617e, hVar, this.f10619g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f10614b.toArray()) + ">{" + this.f10616d + ", type=" + this.f10617e + ", deps=" + Arrays.toString(this.f10615c.toArray()) + "}";
    }
}
