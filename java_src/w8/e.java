package w8;

import c.j;
/* loaded from: classes.dex */
public final class e {
    public static void a(String str) {
        e0.a.c(c(str));
    }

    public static void b(String str, int i10) {
        e0.a.a(c(str), i10);
    }

    private static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, j.N0) + "...";
    }

    public static void d() {
        e0.a.f();
    }

    public static void e(String str, int i10) {
        e0.a.d(c(str), i10);
    }
}
