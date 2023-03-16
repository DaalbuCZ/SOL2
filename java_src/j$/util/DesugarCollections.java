package j$.util;

import j$.util.function.Predicate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9591a;

    /* renamed from: b  reason: collision with root package name */
    static final Class f9592b;

    /* renamed from: c  reason: collision with root package name */
    private static final Field f9593c;

    /* renamed from: d  reason: collision with root package name */
    private static final Field f9594d;

    /* renamed from: e  reason: collision with root package name */
    private static final Constructor f9595e;

    /* renamed from: f  reason: collision with root package name */
    private static final Constructor f9596f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f9591a = cls;
        f9592b = Collections.synchronizedList(new LinkedList()).getClass();
        Constructor constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f9593c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = f9591a.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f9594d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f9596f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = f9591a.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f9595e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Collection collection, Predicate predicate) {
        boolean b10;
        Field field = f9593c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f9594d.get(collection);
                return collection2 instanceof InterfaceC0252b ? ((InterfaceC0252b) collection2).b(predicate) : AbstractC0251a.o(collection2, predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                Collection collection3 = (Collection) f9594d.get(collection);
                b10 = collection3 instanceof InterfaceC0252b ? ((InterfaceC0252b) collection3).b(predicate) : AbstractC0251a.o(collection3, predicate);
            }
            return b10;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(List list, Comparator comparator) {
        Field field = f9593c;
        if (field == null) {
            try {
                AbstractC0251a.z((List) f9594d.get(list), comparator);
                return;
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(list)) {
                AbstractC0251a.z((List) f9594d.get(list), comparator);
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized list sort.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0262g(map);
    }
}
