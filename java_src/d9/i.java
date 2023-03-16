package d9;

import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f6616a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f6617b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f6618c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f6619a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f6620b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f6621c;

        public a(Method method, Method method2, Method method3) {
            this.f6619a = method;
            this.f6620b = method2;
            this.f6621c = method3;
        }
    }

    private i() {
    }

    private final a a(d9.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f6618c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f6617b;
            f6618c = aVar3;
            return aVar3;
        }
    }

    public final String b(d9.a aVar) {
        k9.k.e(aVar, "continuation");
        a aVar2 = f6618c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f6617b) {
            return null;
        }
        Method method = aVar2.f6619a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f6620b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f6621c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
