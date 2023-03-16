package p3;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static int f12337b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12338c = true;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12336a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static a f12339d = a.f12340a;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12340a = new C0179a();

        /* renamed from: p3.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0179a implements a {
            C0179a() {
            }

            @Override // p3.r.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // p3.r.a
            public void b(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // p3.r.a
            public void c(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p3.r.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    @Pure
    private static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + '\n';
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f12336a) {
            if (f12337b == 0) {
                f12339d.d(str, str2);
            }
        }
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (f12336a) {
            if (f12337b <= 3) {
                f12339d.c(str, str2);
            }
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    @Pure
    public static String e(Throwable th) {
        synchronized (f12336a) {
            if (th == null) {
                return null;
            }
            if (h(th)) {
                return "UnknownHostException (no network)";
            }
            if (f12338c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    @Pure
    public static void f(String str, String str2) {
        synchronized (f12336a) {
            if (f12337b <= 1) {
                f12339d.b(str, str2);
            }
        }
    }

    @Pure
    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    @Pure
    private static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    public static void i(String str, String str2) {
        synchronized (f12336a) {
            if (f12337b <= 2) {
                f12339d.a(str, str2);
            }
        }
    }

    @Pure
    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
