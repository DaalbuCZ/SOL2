package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.i;
import c8.a;
import java.io.File;
import l8.j;
import l8.k;
import l8.o;
/* loaded from: classes.dex */
public class ImagePickerPlugin implements k.c, c8.a, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private a.b f9011n;

    /* renamed from: o  reason: collision with root package name */
    private a f9012o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: n  reason: collision with root package name */
        private final Activity f9013n;

        LifeCycleObserver(Activity activity) {
            this.f9013n = activity;
        }

        @Override // androidx.lifecycle.c
        public void a(i iVar) {
        }

        @Override // androidx.lifecycle.c
        public void b(i iVar) {
            onActivityDestroyed(this.f9013n);
        }

        @Override // androidx.lifecycle.c
        public void c(i iVar) {
        }

        @Override // androidx.lifecycle.c
        public void e(i iVar) {
        }

        @Override // androidx.lifecycle.c
        public void f(i iVar) {
        }

        @Override // androidx.lifecycle.c
        public void g(i iVar) {
            onActivityStopped(this.f9013n);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f9013n != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.f9013n == activity) {
                ImagePickerPlugin.this.f9012o.b().F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private Application f9015a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f9016b;

        /* renamed from: c  reason: collision with root package name */
        private e f9017c;

        /* renamed from: d  reason: collision with root package name */
        private k f9018d;

        /* renamed from: e  reason: collision with root package name */
        private LifeCycleObserver f9019e;

        /* renamed from: f  reason: collision with root package name */
        private d8.c f9020f;

        /* renamed from: g  reason: collision with root package name */
        private androidx.lifecycle.e f9021g;

        a(Application application, Activity activity, l8.c cVar, k.c cVar2, o oVar, d8.c cVar3) {
            this.f9015a = application;
            this.f9016b = activity;
            this.f9020f = cVar3;
            this.f9017c = ImagePickerPlugin.this.b(activity);
            k kVar = new k(cVar, "plugins.flutter.io/image_picker_android");
            this.f9018d = kVar;
            kVar.e(cVar2);
            LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
            this.f9019e = lifeCycleObserver;
            if (oVar != null) {
                application.registerActivityLifecycleCallbacks(lifeCycleObserver);
                oVar.b(this.f9017c);
                oVar.c(this.f9017c);
                return;
            }
            cVar3.b(this.f9017c);
            cVar3.c(this.f9017c);
            androidx.lifecycle.e a10 = g8.a.a(cVar3);
            this.f9021g = a10;
            a10.a(this.f9019e);
        }

        Activity a() {
            return this.f9016b;
        }

        e b() {
            return this.f9017c;
        }

        void c() {
            d8.c cVar = this.f9020f;
            if (cVar != null) {
                cVar.h(this.f9017c);
                this.f9020f.g(this.f9017c);
                this.f9020f = null;
            }
            androidx.lifecycle.e eVar = this.f9021g;
            if (eVar != null) {
                eVar.c(this.f9019e);
                this.f9021g = null;
            }
            k kVar = this.f9018d;
            if (kVar != null) {
                kVar.e(null);
                this.f9018d = null;
            }
            Application application = this.f9015a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f9019e);
                this.f9015a = null;
            }
            this.f9016b = null;
            this.f9019e = null;
            this.f9017c = null;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private k.d f9023a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f9024b = new Handler(Looper.getMainLooper());

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Object f9025n;

            a(Object obj) {
                this.f9025n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f9023a.a(this.f9025n);
            }
        }

        /* renamed from: io.flutter.plugins.imagepicker.ImagePickerPlugin$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0136b implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String f9027n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f9028o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Object f9029p;

            RunnableC0136b(String str, String str2, Object obj) {
                this.f9027n = str;
                this.f9028o = str2;
                this.f9029p = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f9023a.b(this.f9027n, this.f9028o, this.f9029p);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f9023a.c();
            }
        }

        b(k.d dVar) {
            this.f9023a = dVar;
        }

        @Override // l8.k.d
        public void a(Object obj) {
            this.f9024b.post(new a(obj));
        }

        @Override // l8.k.d
        public void b(String str, String str2, Object obj) {
            this.f9024b.post(new RunnableC0136b(str, str2, obj));
        }

        @Override // l8.k.d
        public void c() {
            this.f9024b.post(new c());
        }
    }

    private void c(l8.c cVar, Application application, Activity activity, o oVar, d8.c cVar2) {
        this.f9012o = new a(application, activity, cVar, this, oVar, cVar2);
    }

    private void d() {
        a aVar = this.f9012o;
        if (aVar != null) {
            aVar.c();
            this.f9012o = null;
        }
    }

    final e b(Activity activity) {
        d dVar = new d(activity);
        File cacheDir = activity.getCacheDir();
        return new e(activity, cacheDir, new g(cacheDir, new io.flutter.plugins.imagepicker.b()), dVar);
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        c(this.f9011n.b(), (Application) this.f9011n.a(), cVar.e(), null, cVar);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        this.f9011n = bVar;
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        d();
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f9011n = null;
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        a aVar = this.f9012o;
        if (aVar == null || aVar.a() == null) {
            dVar.b("no_activity", "image_picker plugin requires a foreground activity.", null);
            return;
        }
        b bVar = new b(dVar);
        e b10 = this.f9012o.b();
        if (jVar.a("cameraDevice") != null) {
            b10.G(((Integer) jVar.a("cameraDevice")).intValue() == 1 ? io.flutter.plugins.imagepicker.a.FRONT : io.flutter.plugins.imagepicker.a.REAR);
        }
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1708939613:
                if (str.equals("pickMultiImage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1457314374:
                if (str.equals("pickImage")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1445424934:
                if (str.equals("pickVideo")) {
                    c10 = 2;
                    break;
                }
                break;
            case -310034372:
                if (str.equals("retrieve")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                b10.e(jVar, bVar);
                return;
            case 1:
                int intValue = ((Integer) jVar.a("source")).intValue();
                if (intValue == 0) {
                    b10.I(jVar, bVar);
                    return;
                } else if (intValue == 1) {
                    b10.d(jVar, bVar);
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid image source: " + intValue);
                }
            case 2:
                int intValue2 = ((Integer) jVar.a("source")).intValue();
                if (intValue2 == 0) {
                    b10.J(jVar, bVar);
                    return;
                } else if (intValue2 == 1) {
                    b10.f(jVar, bVar);
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid video source: " + intValue2);
                }
            case 3:
                b10.E(bVar);
                return;
            default:
                throw new IllegalArgumentException("Unknown method " + jVar.f11211a);
        }
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        onAttachedToActivity(cVar);
    }
}
