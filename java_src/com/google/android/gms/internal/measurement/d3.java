package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: j  reason: collision with root package name */
    private static volatile d3 f3783j;

    /* renamed from: a  reason: collision with root package name */
    private final String f3784a;

    /* renamed from: b  reason: collision with root package name */
    protected final d4.e f3785b;

    /* renamed from: c  reason: collision with root package name */
    protected final ExecutorService f3786c;

    /* renamed from: d  reason: collision with root package name */
    private final o4.a f3787d;

    /* renamed from: e  reason: collision with root package name */
    private final List f3788e;

    /* renamed from: f  reason: collision with root package name */
    private int f3789f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3790g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3791h;

    /* renamed from: i  reason: collision with root package name */
    private volatile f1 f3792i;

    protected d3(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f3784a = (str == null || !s(str2, str3)) ? "FA" : "FA";
        this.f3785b = d4.h.d();
        z0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3786c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f3787d = new o4.a(this);
        this.f3788e = new ArrayList();
        try {
            if (p4.x.c(context, "google_app_id", p4.m.a(context)) != null && !o()) {
                this.f3791h = null;
                this.f3790g = true;
                Log.w(this.f3784a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (s(str2, str3)) {
            this.f3791h = str2;
        } else {
            this.f3791h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f3784a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f3784a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        r(new z1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f3784a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c3(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Exception exc, boolean z10, boolean z11) {
        this.f3790g |= z10;
        if (z10) {
            Log.w(this.f3784a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f3784a, "Error with data collection. Data lost.", exc);
    }

    private final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        r(new q2(this, l10, str, str2, bundle, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(s2 s2Var) {
        this.f3786c.execute(s2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(String str, String str2) {
        return (str2 == null || str == null || o()) ? false : true;
    }

    public static d3 y(Context context, String str, String str2, String str3, Bundle bundle) {
        z3.o.i(context);
        if (f3783j == null) {
            synchronized (d3.class) {
                if (f3783j == null) {
                    f3783j = new d3(context, str, str2, str3, bundle);
                }
            }
        }
        return f3783j;
    }

    public final String A() {
        b1 b1Var = new b1();
        r(new m2(this, b1Var));
        return b1Var.m0(120000L);
    }

    public final String B() {
        b1 b1Var = new b1();
        r(new e2(this, b1Var));
        return b1Var.m0(50L);
    }

    public final String C() {
        b1 b1Var = new b1();
        r(new h2(this, b1Var));
        return b1Var.m0(500L);
    }

    public final String D() {
        b1 b1Var = new b1();
        r(new g2(this, b1Var));
        return b1Var.m0(500L);
    }

    public final String E() {
        b1 b1Var = new b1();
        r(new d2(this, b1Var));
        return b1Var.m0(500L);
    }

    public final List F(String str, String str2) {
        b1 b1Var = new b1();
        r(new s1(this, str, str2, b1Var));
        List list = (List) b1.n0(b1Var.e(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map G(String str, String str2, boolean z10) {
        b1 b1Var = new b1();
        r(new i2(this, str, str2, z10, b1Var));
        Bundle e10 = b1Var.e(5000L);
        if (e10 == null || e10.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(e10.size());
        for (String str3 : e10.keySet()) {
            Object obj = e10.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void K(String str) {
        r(new a2(this, str));
    }

    public final void L(String str, String str2, Bundle bundle) {
        r(new r1(this, str, str2, bundle));
    }

    public final void M(String str) {
        r(new b2(this, str));
    }

    public final void N(String str, Bundle bundle) {
        q(null, str, bundle, false, true, null);
    }

    public final void O(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, null);
    }

    public final void a(int i10, String str, Object obj, Object obj2, Object obj3) {
        r(new j2(this, false, 5, str, obj, null, null));
    }

    public final void b(p4.u uVar) {
        z3.o.i(uVar);
        synchronized (this.f3788e) {
            for (int i10 = 0; i10 < this.f3788e.size(); i10++) {
                if (uVar.equals(((Pair) this.f3788e.get(i10)).first)) {
                    Log.w(this.f3784a, "OnEventListener already registered.");
                    return;
                }
            }
            t2 t2Var = new t2(uVar);
            this.f3788e.add(new Pair(uVar, t2Var));
            if (this.f3792i != null) {
                try {
                    this.f3792i.registerOnMeasurementEventListener(t2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f3784a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            r(new p2(this, t2Var));
        }
    }

    public final void c() {
        r(new x1(this));
    }

    public final void d(Bundle bundle) {
        r(new q1(this, bundle));
    }

    public final void e(Bundle bundle) {
        r(new w1(this, bundle));
    }

    public final void f(Activity activity, String str, String str2) {
        r(new u1(this, activity, str, str2));
    }

    public final void g(boolean z10) {
        r(new n2(this, z10));
    }

    public final void h(Bundle bundle) {
        r(new o2(this, bundle));
    }

    public final void i(Boolean bool) {
        r(new v1(this, bool));
    }

    public final void j(long j10) {
        r(new y1(this, j10));
    }

    public final void k(String str) {
        r(new t1(this, str));
    }

    public final void l(String str, String str2, Object obj, boolean z10) {
        r(new r2(this, str, str2, obj, z10));
    }

    protected final boolean o() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, d3.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int t(String str) {
        b1 b1Var = new b1();
        r(new l2(this, str, b1Var));
        Integer num = (Integer) b1.n0(b1Var.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long u() {
        b1 b1Var = new b1();
        r(new f2(this, b1Var));
        Long f10 = b1Var.f(500L);
        if (f10 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f3785b.a()).nextLong();
            int i10 = this.f3789f + 1;
            this.f3789f = i10;
            return nextLong + i10;
        }
        return f10.longValue();
    }

    public final o4.a v() {
        return this.f3787d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f1 x(Context context, boolean z10) {
        try {
            return e1.asInterface(DynamiteModule.d(context, DynamiteModule.f3653e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            p(e10, true, false);
            return null;
        }
    }
}
