package y0;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.text.TextUtils;
import com.bugfender.sdk.ui.FeedbackActivity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import y0.n0;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16419a = "Bugfender";

    /* renamed from: b  reason: collision with root package name */
    private static y1 f16420b = null;

    /* renamed from: c  reason: collision with root package name */
    private static h1 f16421c = null;

    /* renamed from: d  reason: collision with root package name */
    private static q1 f16422d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f16423e = false;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f16424f = false;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f16425g = false;

    /* renamed from: h  reason: collision with root package name */
    private static String f16426h;

    /* renamed from: i  reason: collision with root package name */
    private static String f16427i;

    /* renamed from: j  reason: collision with root package name */
    private static String f16428j;

    /* renamed from: y0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0240a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16429a;

        static {
            int[] iArr = new int[b.values().length];
            f16429a = iArr;
            try {
                iArr[b.Trace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16429a[b.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16429a[b.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16429a[b.Warning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16429a[b.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16429a[b.Fatal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static void A(String str, boolean z10) {
        if (o()) {
            f16422d.n(new q(str, Boolean.valueOf(z10)));
        }
    }

    public static void B(String str, Float f10) {
        if (o()) {
            f16422d.n(new q(str, f10));
        }
    }

    public static void C(String str, Integer num) {
        if (o()) {
            f16422d.n(new q(str, num));
        }
    }

    public static void D(String str, String str2) {
        if (o()) {
            f16422d.n(new q(str, str2));
        }
    }

    public static void E(boolean z10) {
        if (o()) {
            o();
            f16422d.E(z10);
            if (f16423e) {
                String str = f16419a;
                i0.e(str, "Force enable: " + z10);
            }
        }
    }

    public static void F(long j10) {
        if (o()) {
            if (j10 < 0) {
                throw new IllegalArgumentException("The maximum size should be a positive number");
            }
            f16422d.j(j10);
        }
    }

    private static boolean G() {
        return !q();
    }

    private static boolean H() {
        return true;
    }

    public static void I(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.a(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.j0(str, str2);
            }
        }
    }

    public static void J(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.f(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.m0(str, str2);
            }
        }
    }

    public static void a(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.a(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.l(str, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.d(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.D(str, str2);
            }
        }
    }

    public static void c() {
        if (o()) {
            f16422d.B();
        }
    }

    public static void d() {
        e(null);
    }

    public static void e(z0.c cVar) {
        if (o()) {
            if (cVar == null) {
                cVar = new z0.a();
            }
            f16421c.a(cVar);
        }
    }

    public static void f(Application application, Object... objArr) {
        if (!o() || f16425g) {
            return;
        }
        f16425g = true;
        application.registerActivityLifecycleCallbacks(new o(f16422d, f16420b, G(), H(), Arrays.asList(objArr)));
    }

    public static void g(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.d(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.I(str, str2);
            }
        }
    }

    public static void h() {
        if (o()) {
            f16422d.p0();
            if (f16423e) {
                i0.e(f16419a, "Synchronizing all the logs and issues");
            }
        }
    }

    public static URL i() {
        if (o()) {
            return f16422d.t0();
        }
        return null;
    }

    private static String j(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        }
        return null;
    }

    public static URL k() {
        if (o()) {
            return f16422d.x0();
        }
        return null;
    }

    public static Intent l(Context context, String str, String str2, String str3, String str4, String str5, com.bugfender.sdk.ui.a aVar) {
        return FeedbackActivity.e(context, str, str2, str3, str4, str5, aVar);
    }

    public static void m(String str, String str2) {
        if (o()) {
            if (G()) {
                i0.e(str, str2 == null ? "" : str2);
            }
            if (H()) {
                f16422d.P(str, str2);
            }
        }
    }

    public static synchronized void n(Context context, String str, boolean z10) {
        synchronized (a.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (f16421c == null) {
                        try {
                            context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (p(context)) {
                                f16423e = z10;
                                b1 b1Var = new b1();
                                w0 w0Var = new w0();
                                x0 l10 = b1Var.l();
                                s0 b10 = b1Var.b(l10);
                                k2 q10 = b1Var.q();
                                d2 e10 = b1Var.e(q10);
                                n3 j10 = b1Var.j();
                                g3 g10 = b1Var.g(j10);
                                p1<k3> d10 = b1Var.d();
                                r<k3> p10 = b1Var.p();
                                t o10 = b1Var.o();
                                s2 f10 = b1Var.f(context, l10, b10, q10, e10, j10, g10, d10, p10, o10);
                                w2 a10 = w0Var.a(f16426h, String.valueOf(20230306), str);
                                f16426h = null;
                                q1 q1Var = new q1(str, f10, o10, new f2(a10), b1Var.h(context), b1Var.k(context), b1Var.a(context, b1Var.i(context), b1Var.m(context)), b1Var.c(str, f16427i), f16428j);
                                f16422d = q1Var;
                                f16427i = null;
                                q1Var.j(5242880L);
                                f16421c = new m1(context.getPackageName(), f16422d, Executors.newSingleThreadExecutor());
                                f16420b = b1Var.n();
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    return;
                }
            }
            i0.f(f16419a, "WARNING: The Bugfender sdk is not initialized. The context or application token provided is null.");
        }
    }

    private static boolean o() {
        if (f16422d == null) {
            if (f16424f) {
                return false;
            }
            f16424f = true;
            i0.f(f16419a, "WARNING: Bugfender SDK is not initialized. You should call first to the method Bugfender.init()");
            return false;
        }
        return true;
    }

    private static boolean p(Context context) {
        String j10 = j(context);
        if (j10 == null) {
            i0.f(f16419a, "WARNING: Bugfender SDK couldn't be initialized.");
        }
        return j10 != null && context.getPackageName().equals(j10);
    }

    private static boolean q() {
        return !f16423e;
    }

    private static boolean r(String str) {
        try {
            new URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static void s(int i10, String str, String str2, b bVar, String str3, String str4) {
        if (o()) {
            if (G()) {
                switch (C0240a.f16429a[bVar.ordinal()]) {
                    case 1:
                    case 2:
                        i0.a(str3, str4);
                        break;
                    case 3:
                        i0.e(str3, str4);
                        break;
                    case 4:
                        i0.f(str3, str4);
                        break;
                    case 5:
                    case 6:
                        i0.d(str3, str4);
                        break;
                }
            }
            if (H()) {
                f16422d.i(i10, str, str2, n0.c.g(bVar), str3, str4);
            }
        }
    }

    public static void t(String str) {
        if (TextUtils.isEmpty(str)) {
            i0.f(f16419a, "WARNING: deviceName can not be empty or null. Bugfender.overrideDeviceName() is ignored");
            return;
        }
        f16428j = str;
        if (o()) {
            i0.f(f16419a, "WARNING: Bugfender.overrideDeviceName() must be called before the method Bugfender.init(), ignoring this call");
        }
    }

    public static void u(String str) {
        if (o()) {
            f16422d.C(str);
        }
    }

    public static URL v(String str, String str2) {
        if (o()) {
            URL Q = f16422d.Q(str, str2);
            f16422d.p0();
            if (f16423e) {
                String str3 = f16419a;
                i0.d(str3, "Reported crash with Title: " + str + " and Message: " + str2);
            }
            return Q;
        }
        return null;
    }

    public static URL w(String str, String str2) {
        if (o()) {
            URL Y = f16422d.Y(str, str2);
            f16422d.p0();
            if (f16423e) {
                String str3 = f16419a;
                i0.d(str3, "Reported issue with Title: " + str + " and Message: " + str2);
            }
            return Y;
        }
        return null;
    }

    public static URL x(String str, String str2) {
        if (o()) {
            URL e02 = f16422d.e0(str, str2);
            f16422d.p0();
            if (f16423e) {
                String str3 = f16419a;
                i0.d(str3, "Reported feedback with Title: " + str + " and Message: " + str2);
            }
            return e02;
        }
        return null;
    }

    public static void y(String str) {
        if (o()) {
            i0.f(f16419a, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()");
        } else if (r(str)) {
            f16426h = str;
        } else {
            i0.d(f16419a, "The custom URL you have passed is malformed. Using default one.");
        }
    }

    public static void z(String str) {
        if (o()) {
            i0.f(f16419a, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()");
        } else if (r(str)) {
            f16427i = str;
        } else {
            i0.d(f16419a, "The custom URL you have passed is malformed. Using default one.");
        }
    }
}
