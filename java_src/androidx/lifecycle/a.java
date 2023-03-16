package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class a {

    /* renamed from: c  reason: collision with root package name */
    static a f2086c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C0039a> f2087a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2088b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039a {

        /* renamed from: a  reason: collision with root package name */
        final Map<e.b, List<b>> f2089a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, e.b> f2090b;

        C0039a(Map<b, e.b> map) {
            this.f2090b = map;
            for (Map.Entry<b, e.b> entry : map.entrySet()) {
                e.b value = entry.getValue();
                List<b> list = this.f2089a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f2089a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, i iVar, e.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(i iVar, e.b bVar, Object obj) {
            b(this.f2089a.get(bVar), iVar, bVar, obj);
            b(this.f2089a.get(e.b.ON_ANY), iVar, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f2091a;

        /* renamed from: b  reason: collision with root package name */
        final Method f2092b;

        b(int i10, Method method) {
            this.f2091a = i10;
            this.f2092b = method;
            method.setAccessible(true);
        }

        void a(i iVar, e.b bVar, Object obj) {
            try {
                int i10 = this.f2091a;
                if (i10 == 0) {
                    this.f2092b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f2092b.invoke(obj, iVar);
                } else if (i10 != 2) {
                } else {
                    this.f2092b.invoke(obj, iVar, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f2091a == bVar.f2091a && this.f2092b.getName().equals(bVar.f2092b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f2091a * 31) + this.f2092b.getName().hashCode();
        }
    }

    a() {
    }

    private C0039a a(Class<?> cls, Method[] methodArr) {
        int i10;
        C0039a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f2090b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.b> entry : c(cls2).f2090b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(i.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                e.b value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != e.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        C0039a c0039a = new C0039a(hashMap);
        this.f2087a.put(cls, c0039a);
        this.f2088b.put(cls, Boolean.valueOf(z10));
        return c0039a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, e.b> map, b bVar, e.b bVar2, Class<?> cls) {
        e.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        Method method = bVar.f2092b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0039a c(Class<?> cls) {
        C0039a c0039a = this.f2087a.get(cls);
        return c0039a != null ? c0039a : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f2088b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f2088b.put(cls, Boolean.FALSE);
        return false;
    }
}
