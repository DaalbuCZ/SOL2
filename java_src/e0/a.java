package e0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f6628a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f6629b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f6630c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f6631d;

    @SuppressLint({"NewApi"})
    public static void a(String str, int i10) {
        try {
            if (f6630c == null) {
                c.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f6630c == null) {
                    f6630c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                f6630c.invoke(null, Long.valueOf(f6628a), str, Integer.valueOf(i10));
            } catch (Exception e10) {
                g("asyncTraceBegin", e10);
            }
        }
    }

    public static void c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(String str, int i10) {
        try {
            if (f6631d == null) {
                c.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f6631d == null) {
                    f6631d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                f6631d.invoke(null, Long.valueOf(f6628a), str, Integer.valueOf(i10));
            } catch (Exception e10) {
                g("asyncTraceEnd", e10);
            }
        }
    }

    public static void f() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.b();
        }
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f6629b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f6629b == null) {
                    f6628a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f6629b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f6629b.invoke(null, Long.valueOf(f6628a))).booleanValue();
            } catch (Exception e10) {
                g("isTagEnabled", e10);
            }
        }
        return false;
    }
}
