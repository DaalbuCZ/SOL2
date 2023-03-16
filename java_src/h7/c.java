package h7;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, f7.g<?>> f8091a;

    /* renamed from: b  reason: collision with root package name */
    private final k7.b f8092b = k7.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h7.i<T> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, j$.util.concurrent.ConcurrentHashMap] */
        @Override // h7.i
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements h7.i<T> {
        b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // h7.i
        public T a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h7.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0121c implements h7.i<T> {
        C0121c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // h7.i
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements h7.i<T> {
        d() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, h7.h] */
        @Override // h7.i
        public T a() {
            return new h7.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements h7.i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h7.m f8097a = h7.m.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f8098b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f8099c;

        e(Class cls, Type type) {
            this.f8098b = cls;
            this.f8099c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // h7.i
        public T a() {
            try {
                return this.f8097a.c(this.f8098b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f8099c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements h7.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f7.g f8101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f8102b;

        f(f7.g gVar, Type type) {
            this.f8101a = gVar;
            this.f8102b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // h7.i
        public T a() {
            return this.f8101a.a(this.f8102b);
        }
    }

    /* loaded from: classes.dex */
    class g implements h7.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f7.g f8104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f8105b;

        g(f7.g gVar, Type type) {
            this.f8104a = gVar;
            this.f8105b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // h7.i
        public T a() {
            return this.f8104a.a(this.f8105b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements h7.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f8107a;

        h(Constructor constructor) {
            this.f8107a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // h7.i
        public T a() {
            try {
                return this.f8107a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f8107a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f8107a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements h7.i<T> {
        i() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // h7.i
        public T a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements h7.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f8110a;

        j(Type type) {
            this.f8110a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // h7.i
        public T a() {
            Type type = this.f8110a;
            if (!(type instanceof ParameterizedType)) {
                throw new f7.l("Invalid EnumSet type: " + this.f8110a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new f7.l("Invalid EnumSet type: " + this.f8110a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements h7.i<T> {
        k() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // h7.i
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements h7.i<T> {
        l() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // h7.i
        public T a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements h7.i<T> {
        m() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // h7.i
        public T a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements h7.i<T> {
        n() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // h7.i
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, f7.g<?>> map) {
        this.f8091a = map;
    }

    private <T> h7.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f8092b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> h7.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        } else if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(m7.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0121c();
        } else {
            return null;
        }
    }

    private <T> h7.i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> h7.i<T> a(m7.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        f7.g<?> gVar = this.f8091a.get(e10);
        if (gVar != null) {
            return new f(gVar, e10);
        }
        f7.g<?> gVar2 = this.f8091a.get(c10);
        if (gVar2 != null) {
            return new g(gVar2, e10);
        }
        h7.i<T> b10 = b(c10);
        if (b10 != null) {
            return b10;
        }
        h7.i<T> c11 = c(e10, c10);
        return c11 != null ? c11 : d(e10, c10);
    }

    public String toString() {
        return this.f8091a.toString();
    }
}
