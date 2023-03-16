package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import y8.m;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final int f10933a = f(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final g f10934b;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = a9.b.a(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.l {

        /* renamed from: o  reason: collision with root package name */
        public static final b f10935o = new b();

        b() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final Void c(Throwable th) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends k9.l implements j9.l<Throwable, Throwable> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Constructor f10936o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f10936o = constructor;
        }

        @Override // j9.l
        /* renamed from: a */
        public final Throwable c(Throwable th) {
            Object a10;
            Object newInstance;
            try {
                m.a aVar = y8.m.f17093n;
                newInstance = this.f10936o.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                m.a aVar2 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th2));
            }
            if (newInstance != null) {
                a10 = y8.m.a((Throwable) newInstance);
                if (y8.m.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends k9.l implements j9.l<Throwable, Throwable> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Constructor f10937o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f10937o = constructor;
        }

        @Override // j9.l
        /* renamed from: a */
        public final Throwable c(Throwable th) {
            Object a10;
            Object newInstance;
            try {
                m.a aVar = y8.m.f17093n;
                newInstance = this.f10937o.newInstance(th);
            } catch (Throwable th2) {
                m.a aVar2 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th2));
            }
            if (newInstance != null) {
                a10 = y8.m.a((Throwable) newInstance);
                if (y8.m.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends k9.l implements j9.l<Throwable, Throwable> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Constructor f10938o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f10938o = constructor;
        }

        @Override // j9.l
        /* renamed from: a */
        public final Throwable c(Throwable th) {
            Object a10;
            Object newInstance;
            try {
                m.a aVar = y8.m.f17093n;
                newInstance = this.f10938o.newInstance(th.getMessage());
            } catch (Throwable th2) {
                m.a aVar2 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a10 = y8.m.a(th3);
                if (y8.m.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends k9.l implements j9.l<Throwable, Throwable> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Constructor f10939o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f10939o = constructor;
        }

        @Override // j9.l
        /* renamed from: a */
        public final Throwable c(Throwable th) {
            Object a10;
            Object newInstance;
            try {
                m.a aVar = y8.m.f17093n;
                newInstance = this.f10939o.newInstance(new Object[0]);
            } catch (Throwable th2) {
                m.a aVar2 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a10 = y8.m.a(th3);
                if (y8.m.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    static {
        g gVar;
        try {
            gVar = l.a() ? n0.f10952a : kotlinx.coroutines.internal.d.f10911a;
        } catch (Throwable unused) {
            gVar = n0.f10952a;
        }
        f10934b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> j9.l<Throwable, Throwable> b(Class<E> cls) {
        List<Constructor> n10;
        b bVar = b.f10935o;
        if (f10933a != f(cls, 0)) {
            return bVar;
        }
        n10 = z8.f.n(cls.getConstructors(), new a());
        for (Constructor constructor : n10) {
            j9.l<Throwable, Throwable> c10 = c(constructor);
            if (c10 != null) {
                return c10;
            }
        }
        return bVar;
    }

    private static final j9.l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && k9.k.a(parameterTypes[0], String.class) && k9.k.a(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (k9.k.a(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (k9.k.a(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    private static final int d(Class<?> cls, int i10) {
        Field[] declaredFields;
        do {
            int length = cls.getDeclaredFields().length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(declaredFields[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int e(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return d(cls, i10);
    }

    private static final int f(Class<?> cls, int i10) {
        Integer a10;
        i9.a.c(cls);
        try {
            m.a aVar = y8.m.f17093n;
            a10 = y8.m.a(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            m.a aVar2 = y8.m.f17093n;
            a10 = y8.m.a(y8.n.a(th));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (y8.m.c(a10)) {
            a10 = valueOf;
        }
        return ((Number) a10).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E g(E e10) {
        Object a10;
        if (e10 instanceof r9.b0) {
            try {
                m.a aVar = y8.m.f17093n;
                a10 = y8.m.a(((r9.b0) e10).a());
            } catch (Throwable th) {
                m.a aVar2 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th));
            }
            if (y8.m.c(a10)) {
                a10 = null;
            }
            return (E) a10;
        }
        return (E) f10934b.a(e10.getClass()).c(e10);
    }
}
