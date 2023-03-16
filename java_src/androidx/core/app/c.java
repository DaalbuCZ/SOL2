package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f1157a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f1158b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f1159c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f1160d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f1161e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f1162f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f1163g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f1164n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f1165o;

        a(d dVar, Object obj) {
            this.f1164n = dVar;
            this.f1165o = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1164n.f1170n = this.f1165o;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Application f1166n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ d f1167o;

        b(Application application, d dVar) {
            this.f1166n = application;
            this.f1167o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1166n.unregisterActivityLifecycleCallbacks(this.f1167o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0016c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f1168n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f1169o;

        RunnableC0016c(Object obj, Object obj2) {
            this.f1168n = obj;
            this.f1169o = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f1160d;
                if (method != null) {
                    method.invoke(this.f1168n, this.f1169o, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f1161e.invoke(this.f1168n, this.f1169o, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: n  reason: collision with root package name */
        Object f1170n;

        /* renamed from: o  reason: collision with root package name */
        private Activity f1171o;

        /* renamed from: p  reason: collision with root package name */
        private final int f1172p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f1173q = false;

        /* renamed from: r  reason: collision with root package name */
        private boolean f1174r = false;

        /* renamed from: s  reason: collision with root package name */
        private boolean f1175s = false;

        d(Activity activity) {
            this.f1171o = activity;
            this.f1172p = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1171o == activity) {
                this.f1171o = null;
                this.f1174r = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1174r || this.f1175s || this.f1173q || !c.h(this.f1170n, this.f1172p, activity)) {
                return;
            }
            this.f1175s = true;
            this.f1170n = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1171o == activity) {
                this.f1173q = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f1157a = a10;
        f1158b = b();
        f1159c = f();
        f1160d = d(a10);
        f1161e = c(a10);
        f1162f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f1159c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f1163g.postAtFrontOfQueue(new RunnableC0016c(f1158b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f1162f == null) {
            return false;
        } else {
            if (f1161e == null && f1160d == null) {
                return false;
            }
            try {
                Object obj2 = f1159c.get(activity);
                if (obj2 == null || (obj = f1158b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f1163g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f1162f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
