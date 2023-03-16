package k9;

import j9.v;
import j9.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z8.a0;
import z8.z;
/* loaded from: classes.dex */
public final class e implements o9.b<Object>, d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f10886b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends y8.c<?>>, Integer> f10887c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f10888d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f10889e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f10890f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f10891g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f10892a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            Method enclosingMethod;
            String R;
            String S;
            String S2;
            k.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        k.d(simpleName, "name");
                        S2 = q9.n.S(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (S2 != null) {
                            return S2;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    k.d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        R = q9.n.R(simpleName, '$', null, 2, null);
                        return R;
                    }
                    S = q9.n.S(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    return S;
                } else if (!cls.isArray()) {
                    String str3 = (String) e.f10891g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                } else {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f10891g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List f10;
        int i10;
        Map<Class<? extends y8.c<?>>, Integer> i11;
        int a10;
        String U;
        String U2;
        int i12 = 0;
        f10 = z8.j.f(j9.a.class, j9.l.class, j9.p.class, j9.q.class, j9.r.class, j9.s.class, j9.t.class, j9.u.class, v.class, w.class, j9.b.class, j9.c.class, j9.d.class, j9.e.class, j9.f.class, j9.g.class, j9.h.class, j9.i.class, j9.j.class, j9.k.class, j9.m.class, j9.n.class, j9.o.class);
        i10 = z8.k.i(f10, 10);
        ArrayList arrayList = new ArrayList(i10);
        for (Object obj : f10) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                z8.j.h();
            }
            arrayList.add(y8.p.a((Class) obj, Integer.valueOf(i12)));
            i12 = i13;
        }
        i11 = a0.i(arrayList);
        f10887c = i11;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f10888d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f10889e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.d(str, "kotlinName");
            U2 = q9.n.U(str, '.', null, 2, null);
            sb.append(U2);
            sb.append("CompanionObject");
            y8.l a11 = y8.p.a(sb.toString(), str + ".Companion");
            hashMap3.put(a11.c(), a11.d());
        }
        for (Map.Entry<Class<? extends y8.c<?>>, Integer> entry : f10887c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f10890f = hashMap3;
        a10 = z.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            U = q9.n.U((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, U);
        }
        f10891g = linkedHashMap;
    }

    public e(Class<?> cls) {
        k.e(cls, "jClass");
        this.f10892a = cls;
    }

    @Override // o9.b
    public String a() {
        return f10886b.a(b());
    }

    @Override // k9.d
    public Class<?> b() {
        return this.f10892a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.a(i9.a.b(this), i9.a.b((o9.b) obj));
    }

    public int hashCode() {
        return i9.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
