package s7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import c8.a;
import com.google.android.play.core.install.InstallState;
import java.util.Map;
import k9.g;
import k9.l;
import l8.j;
import l8.k;
import l8.m;
import s7.e;
import t4.i;
import y8.p;
import y8.s;
import z8.a0;
/* loaded from: classes.dex */
public final class e implements c8.a, k.c, m, Application.ActivityLifecycleCallbacks, d8.a {

    /* renamed from: t  reason: collision with root package name */
    public static final a f14375t = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private k f14376n;

    /* renamed from: o  reason: collision with root package name */
    private s7.a f14377o;

    /* renamed from: p  reason: collision with root package name */
    private k.d f14378p;

    /* renamed from: q  reason: collision with root package name */
    private Integer f14379q;

    /* renamed from: r  reason: collision with root package name */
    private u4.a f14380r;

    /* renamed from: s  reason: collision with root package name */
    private u4.b f14381s;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends l implements j9.a<s> {
        b() {
            super(0);
        }

        public final void a() {
            u4.b bVar = e.this.f14381s;
            if (bVar == null) {
                return;
            }
            bVar.b();
        }

        @Override // j9.a
        public /* bridge */ /* synthetic */ s d() {
            a();
            return s.f17099a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements s7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d8.c f14383a;

        c(d8.c cVar) {
            this.f14383a = cVar;
        }

        @Override // s7.a
        public Activity a() {
            Activity e10 = this.f14383a.e();
            k9.k.d(e10, "activityPluginBinding.activity");
            return e10;
        }

        @Override // s7.a
        public void b(m mVar) {
            k9.k.e(mVar, "callback");
            this.f14383a.b(mVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements s7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d8.c f14384a;

        d(d8.c cVar) {
            this.f14384a = cVar;
        }

        @Override // s7.a
        public Activity a() {
            Activity e10 = this.f14384a.e();
            k9.k.d(e10, "activityPluginBinding.activity");
            return e10;
        }

        @Override // s7.a
        public void b(m mVar) {
            k9.k.e(mVar, "callback");
            this.f14384a.b(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s7.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0214e extends l implements j9.a<s> {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k.d f14386p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0214e(k.d dVar) {
            super(0);
            this.f14386p = dVar;
        }

        public final void a() {
            e.this.f14379q = 1;
            e.this.f14378p = this.f14386p;
            u4.b bVar = e.this.f14381s;
            if (bVar == null) {
                return;
            }
            u4.a aVar = e.this.f14380r;
            k9.k.b(aVar);
            s7.a aVar2 = e.this.f14377o;
            k9.k.b(aVar2);
            bVar.a(aVar, 1, aVar2.a(), 1276);
        }

        @Override // j9.a
        public /* bridge */ /* synthetic */ s d() {
            a();
            return s.f17099a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends l implements j9.a<s> {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k.d f14388p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k.d dVar) {
            super(0);
            this.f14388p = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(e eVar, InstallState installState) {
            k9.k.e(eVar, "this$0");
            k9.k.e(installState, "state");
            if (installState.c() == 11) {
                k.d dVar = eVar.f14378p;
                if (dVar != null) {
                    dVar.a(null);
                }
            } else if (installState.b() == 0) {
                return;
            } else {
                k.d dVar2 = eVar.f14378p;
                if (dVar2 != null) {
                    dVar2.b("Error during installation", String.valueOf(installState.b()), null);
                }
            }
            eVar.f14378p = null;
        }

        public final void b() {
            e.this.f14379q = 0;
            e.this.f14378p = this.f14388p;
            u4.b bVar = e.this.f14381s;
            if (bVar != null) {
                u4.a aVar = e.this.f14380r;
                k9.k.b(aVar);
                s7.a aVar2 = e.this.f14377o;
                k9.k.b(aVar2);
                bVar.a(aVar, 0, aVar2.a(), 1276);
            }
            u4.b bVar2 = e.this.f14381s;
            if (bVar2 == null) {
                return;
            }
            final e eVar = e.this;
            bVar2.d(new x4.b() { // from class: s7.f
                @Override // z4.a
                public final void a(InstallState installState) {
                    e.f.e(e.this, installState);
                }
            });
        }

        @Override // j9.a
        public /* bridge */ /* synthetic */ s d() {
            b();
            return s.f17099a;
        }
    }

    private final void k(k.d dVar, j9.a<s> aVar) {
        if (this.f14380r == null) {
            dVar.b("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", null);
            throw new IllegalArgumentException(s.f17099a.toString());
        }
        s7.a aVar2 = this.f14377o;
        if ((aVar2 == null ? null : aVar2.a()) == null) {
            dVar.b("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", null);
            throw new IllegalArgumentException(s.f17099a.toString());
        } else if (this.f14381s != null) {
            aVar.d();
        } else {
            dVar.b("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", null);
            throw new IllegalArgumentException(s.f17099a.toString());
        }
    }

    private final void l(final k.d dVar) {
        Activity a10;
        Application application;
        s7.a aVar = this.f14377o;
        if ((aVar == null ? null : aVar.a()) == null) {
            dVar.b("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", null);
            throw new IllegalArgumentException(s.f17099a.toString());
        }
        s7.a aVar2 = this.f14377o;
        if (aVar2 != null) {
            aVar2.b(this);
        }
        s7.a aVar3 = this.f14377o;
        if (aVar3 != null && (a10 = aVar3.a()) != null && (application = a10.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
        s7.a aVar4 = this.f14377o;
        k9.k.b(aVar4);
        u4.b a11 = u4.c.a(aVar4.a());
        this.f14381s = a11;
        k9.k.b(a11);
        i<u4.a> c10 = a11.c();
        k9.k.d(c10, "appUpdateManager!!.appUpdateInfo");
        c10.g(new t4.f() { // from class: s7.d
            @Override // t4.f
            public final void b(Object obj) {
                e.m(e.this, dVar, (u4.a) obj);
            }
        });
        c10.e(new t4.e() { // from class: s7.b
            @Override // t4.e
            public final void c(Exception exc) {
                e.n(k.d.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(e eVar, k.d dVar, u4.a aVar) {
        Map e10;
        k9.k.e(eVar, "this$0");
        k9.k.e(dVar, "$result");
        eVar.f14380r = aVar;
        e10 = a0.e(p.a("updateAvailability", Integer.valueOf(aVar.g())), p.a("immediateAllowed", Boolean.valueOf(aVar.d(1))), p.a("flexibleAllowed", Boolean.valueOf(aVar.d(0))), p.a("availableVersionCode", Integer.valueOf(aVar.a())), p.a("installStatus", Integer.valueOf(aVar.c())), p.a("packageName", aVar.f()), p.a("clientVersionStalenessDays", aVar.b()), p.a("updatePriority", Integer.valueOf(aVar.h())));
        dVar.a(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(k.d dVar, Exception exc) {
        k9.k.e(dVar, "$result");
        k9.k.e(exc, "it");
        dVar.b("TASK_FAILURE", exc.getMessage(), null);
    }

    private final void o(k.d dVar) {
        k(dVar, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(e eVar, Activity activity, u4.a aVar) {
        Integer num;
        k9.k.e(eVar, "this$0");
        k9.k.e(activity, "$activity");
        if (aVar.g() == 3 && (num = eVar.f14379q) != null && num.intValue() == 1) {
            try {
                u4.b bVar = eVar.f14381s;
                if (bVar == null) {
                    return;
                }
                bVar.a(aVar, 1, activity, 1276);
            } catch (IntentSender.SendIntentException e10) {
                Log.e("in_app_update", "Could not start update flow", e10);
            }
        }
    }

    private final void q(k.d dVar) {
        k(dVar, new C0214e(dVar));
    }

    private final void r(k.d dVar) {
        k(dVar, new f(dVar));
    }

    @Override // l8.m
    public boolean a(int i10, int i11, Intent intent) {
        k.d dVar;
        if (i10 == 1276) {
            Integer num = this.f14379q;
            if (num != null && num.intValue() == 1) {
                if (i11 == -1) {
                    k.d dVar2 = this.f14378p;
                    if (dVar2 != null) {
                        dVar2.a(null);
                    }
                } else if (i11 == 0) {
                    k.d dVar3 = this.f14378p;
                    if (dVar3 != null) {
                        dVar3.b("USER_DENIED_UPDATE", String.valueOf(i11), null);
                    }
                } else if (i11 == 1 && (dVar = this.f14378p) != null) {
                    dVar.b("IN_APP_UPDATE_FAILED", "Some other error prevented either the user from providing consent or the update to proceed.", null);
                }
                this.f14378p = null;
                return true;
            }
            Integer num2 = this.f14379q;
            if (num2 != null && num2.intValue() == 0) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        k.d dVar4 = this.f14378p;
                        if (dVar4 != null) {
                            dVar4.b("IN_APP_UPDATE_FAILED", String.valueOf(i11), null);
                        }
                    }
                    return true;
                }
                k.d dVar5 = this.f14378p;
                if (dVar5 != null) {
                    dVar5.b("USER_DENIED_UPDATE", String.valueOf(i11), null);
                }
                this.f14378p = null;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k9.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        k9.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k9.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        i<u4.a> c10;
        k9.k.e(activity, "activity");
        u4.b bVar = this.f14381s;
        if (bVar == null || (c10 = bVar.c()) == null) {
            return;
        }
        c10.g(new t4.f() { // from class: s7.c
            @Override // t4.f
            public final void b(Object obj) {
                e.p(e.this, activity, (u4.a) obj);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k9.k.e(activity, "activity");
        k9.k.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k9.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k9.k.e(activity, "activity");
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        k9.k.e(cVar, "activityPluginBinding");
        this.f14377o = new c(cVar);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k9.k.e(bVar, "flutterPluginBinding");
        k kVar = new k(bVar.b(), "in_app_update");
        this.f14376n = kVar;
        kVar.e(this);
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        this.f14377o = null;
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f14377o = null;
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        k kVar = this.f14376n;
        if (kVar == null) {
            k9.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        String str = jVar.f11211a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1873373639:
                    if (str.equals("performImmediateUpdate")) {
                        q(dVar);
                        return;
                    }
                    break;
                case -1541164682:
                    if (str.equals("startFlexibleUpdate")) {
                        r(dVar);
                        return;
                    }
                    break;
                case -1317168438:
                    if (str.equals("checkForUpdate")) {
                        l(dVar);
                        return;
                    }
                    break;
                case -193504755:
                    if (str.equals("completeFlexibleUpdate")) {
                        o(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.c();
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        k9.k.e(cVar, "activityPluginBinding");
        this.f14377o = new d(cVar);
    }
}
