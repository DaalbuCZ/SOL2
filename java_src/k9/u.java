package k9;

import j9.v;
import j9.w;
/* loaded from: classes.dex */
public class u {
    public static Object a(Object obj, int i10) {
        if (obj != null && !c(obj, i10)) {
            f(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).f();
        }
        if (obj instanceof j9.a) {
            return 0;
        }
        if (obj instanceof j9.l) {
            return 1;
        }
        if (obj instanceof j9.p) {
            return 2;
        }
        if (obj instanceof j9.q) {
            return 3;
        }
        if (obj instanceof j9.r) {
            return 4;
        }
        if (obj instanceof j9.s) {
            return 5;
        }
        if (obj instanceof j9.t) {
            return 6;
        }
        if (obj instanceof j9.u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof j9.b) {
            return 10;
        }
        if (obj instanceof j9.c) {
            return 11;
        }
        if (obj instanceof j9.d) {
            return 12;
        }
        if (obj instanceof j9.e) {
            return 13;
        }
        if (obj instanceof j9.f) {
            return 14;
        }
        if (obj instanceof j9.g) {
            return 15;
        }
        if (obj instanceof j9.h) {
            return 16;
        }
        if (obj instanceof j9.i) {
            return 17;
        }
        if (obj instanceof j9.j) {
            return 18;
        }
        if (obj instanceof j9.k) {
            return 19;
        }
        if (obj instanceof j9.m) {
            return 20;
        }
        if (obj instanceof j9.n) {
            return 21;
        }
        return obj instanceof j9.o ? 22 : -1;
    }

    public static boolean c(Object obj, int i10) {
        return (obj instanceof y8.c) && b(obj) == i10;
    }

    private static <T extends Throwable> T d(T t10) {
        return (T) k.i(t10, u.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
