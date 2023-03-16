package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.s;
/* loaded from: classes.dex */
public class r implements i {

    /* renamed from: v  reason: collision with root package name */
    private static final r f2117v = new r();

    /* renamed from: r  reason: collision with root package name */
    private Handler f2122r;

    /* renamed from: n  reason: collision with root package name */
    private int f2118n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f2119o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2120p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2121q = true;

    /* renamed from: s  reason: collision with root package name */
    private final j f2123s = new j(this);

    /* renamed from: t  reason: collision with root package name */
    private Runnable f2124t = new a();

    /* renamed from: u  reason: collision with root package name */
    s.a f2125u = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.g();
            r.this.h();
        }
    }

    /* loaded from: classes.dex */
    class b implements s.a {
        b() {
        }

        @Override // androidx.lifecycle.s.a
        public void a() {
        }

        @Override // androidx.lifecycle.s.a
        public void b() {
            r.this.c();
        }

        @Override // androidx.lifecycle.s.a
        public void c() {
            r.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.lifecycle.b {

        /* loaded from: classes.dex */
        class a extends androidx.lifecycle.b {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                r.this.c();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                r.this.d();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                s.f(activity).h(r.this.f2125u);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            r.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            r.this.e();
        }
    }

    private r() {
    }

    public static i k() {
        return f2117v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(Context context) {
        f2117v.f(context);
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f2123s;
    }

    void b() {
        int i10 = this.f2119o - 1;
        this.f2119o = i10;
        if (i10 == 0) {
            this.f2122r.postDelayed(this.f2124t, 700L);
        }
    }

    void c() {
        int i10 = this.f2119o + 1;
        this.f2119o = i10;
        if (i10 == 1) {
            if (!this.f2120p) {
                this.f2122r.removeCallbacks(this.f2124t);
                return;
            }
            this.f2123s.h(e.b.ON_RESUME);
            this.f2120p = false;
        }
    }

    void d() {
        int i10 = this.f2118n + 1;
        this.f2118n = i10;
        if (i10 == 1 && this.f2121q) {
            this.f2123s.h(e.b.ON_START);
            this.f2121q = false;
        }
    }

    void e() {
        this.f2118n--;
        h();
    }

    void f(Context context) {
        this.f2122r = new Handler();
        this.f2123s.h(e.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void g() {
        if (this.f2119o == 0) {
            this.f2120p = true;
            this.f2123s.h(e.b.ON_PAUSE);
        }
    }

    void h() {
        if (this.f2118n == 0 && this.f2120p) {
            this.f2123s.h(e.b.ON_STOP);
            this.f2121q = true;
        }
    }
}
