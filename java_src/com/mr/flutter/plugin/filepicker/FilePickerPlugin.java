package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import c8.a;
import java.util.ArrayList;
import java.util.HashMap;
import l8.d;
import l8.j;
import l8.k;
import l8.o;
/* loaded from: classes.dex */
public class FilePickerPlugin implements k.c, c8.a, d8.a {

    /* renamed from: v  reason: collision with root package name */
    private static String f6238v = null;

    /* renamed from: w  reason: collision with root package name */
    private static boolean f6239w = false;

    /* renamed from: x  reason: collision with root package name */
    private static boolean f6240x = false;

    /* renamed from: n  reason: collision with root package name */
    private d8.c f6241n;

    /* renamed from: o  reason: collision with root package name */
    private com.mr.flutter.plugin.filepicker.b f6242o;

    /* renamed from: p  reason: collision with root package name */
    private Application f6243p;

    /* renamed from: q  reason: collision with root package name */
    private a.b f6244q;

    /* renamed from: r  reason: collision with root package name */
    private e f6245r;

    /* renamed from: s  reason: collision with root package name */
    private LifeCycleObserver f6246s;

    /* renamed from: t  reason: collision with root package name */
    private Activity f6247t;

    /* renamed from: u  reason: collision with root package name */
    private k f6248u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: n  reason: collision with root package name */
        private final Activity f6249n;

        LifeCycleObserver(Activity activity) {
            this.f6249n = activity;
        }

        @Override // androidx.lifecycle.c
        public void a(i iVar) {
        }

        @Override // androidx.lifecycle.c
        public void b(i iVar) {
            onActivityDestroyed(this.f6249n);
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
            onActivityStopped(this.f6249n);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6249n != activity || activity.getApplicationContext() == null) {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.InterfaceC0160d {
        a() {
        }

        @Override // l8.d.InterfaceC0160d
        public void a(Object obj, d.b bVar) {
            FilePickerPlugin.this.f6242o.o(bVar);
        }

        @Override // l8.d.InterfaceC0160d
        public void b(Object obj) {
            FilePickerPlugin.this.f6242o.o(null);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private final k.d f6252a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f6253b = new Handler(Looper.getMainLooper());

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Object f6254n;

            a(Object obj) {
                this.f6254n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f6252a.a(this.f6254n);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0087b implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String f6256n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f6257o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Object f6258p;

            RunnableC0087b(String str, String str2, Object obj) {
                this.f6256n = str;
                this.f6257o = str2;
                this.f6258p = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f6252a.b(this.f6256n, this.f6257o, this.f6258p);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f6252a.c();
            }
        }

        b(k.d dVar) {
            this.f6252a = dVar;
        }

        @Override // l8.k.d
        public void a(Object obj) {
            this.f6253b.post(new a(obj));
        }

        @Override // l8.k.d
        public void b(String str, String str2, Object obj) {
            this.f6253b.post(new RunnableC0087b(str, str2, obj));
        }

        @Override // l8.k.d
        public void c() {
            this.f6253b.post(new c());
        }
    }

    private static String b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c10 = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c10 = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    private void c(l8.c cVar, Application application, Activity activity, o oVar, d8.c cVar2) {
        this.f6247t = activity;
        this.f6243p = application;
        this.f6242o = new com.mr.flutter.plugin.filepicker.b(activity);
        k kVar = new k(cVar, "miguelruivo.flutter.plugins.filepicker");
        this.f6248u = kVar;
        kVar.e(this);
        new d(cVar, "miguelruivo.flutter.plugins.filepickerevent").d(new a());
        LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
        this.f6246s = lifeCycleObserver;
        if (oVar != null) {
            application.registerActivityLifecycleCallbacks(lifeCycleObserver);
            oVar.b(this.f6242o);
            oVar.c(this.f6242o);
            return;
        }
        cVar2.b(this.f6242o);
        cVar2.c(this.f6242o);
        e a10 = g8.a.a(cVar2);
        this.f6245r = a10;
        a10.a(this.f6246s);
    }

    private void d() {
        this.f6241n.h(this.f6242o);
        this.f6241n.g(this.f6242o);
        this.f6241n = null;
        LifeCycleObserver lifeCycleObserver = this.f6246s;
        if (lifeCycleObserver != null) {
            this.f6245r.c(lifeCycleObserver);
            this.f6243p.unregisterActivityLifecycleCallbacks(this.f6246s);
        }
        this.f6245r = null;
        this.f6242o.o(null);
        this.f6242o = null;
        this.f6248u.e(null);
        this.f6248u = null;
        this.f6243p = null;
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        this.f6241n = cVar;
        c(this.f6244q.b(), (Application) this.f6244q.a(), this.f6241n.e(), null, this.f6241n);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        this.f6244q = bVar;
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
        this.f6244q = null;
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String[] f10;
        String str;
        if (this.f6247t == null) {
            dVar.b("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        b bVar = new b(dVar);
        HashMap hashMap = (HashMap) jVar.f11212b;
        String str2 = jVar.f11211a;
        if (str2 != null && str2.equals("clear")) {
            bVar.a(Boolean.valueOf(c.a(this.f6247t.getApplicationContext())));
            return;
        }
        String b10 = b(jVar.f11211a);
        f6238v = b10;
        if (b10 == null) {
            bVar.c();
        } else if (b10 != "dir") {
            f6239w = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
            f6240x = ((Boolean) hashMap.get("withData")).booleanValue();
            f10 = c.f((ArrayList) hashMap.get("allowedExtensions"));
            str = jVar.f11211a;
            if (str == null && str.equals("custom") && (f10 == null || f10.length == 0)) {
                bVar.b("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead.", null);
                return;
            } else {
                this.f6242o.r(f6238v, f6239w, f6240x, f10, bVar);
            }
        }
        f10 = null;
        str = jVar.f11211a;
        if (str == null) {
        }
        this.f6242o.r(f6238v, f6239w, f6240x, f10, bVar);
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        onAttachedToActivity(cVar);
    }
}
