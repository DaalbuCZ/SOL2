package com.google.firebase.perf.application;

import a7.g;
import a7.j;
import a7.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b7.m;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import v6.f;
import z6.k;
/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private static final u6.a E = u6.a.e();
    private static volatile a F;
    private l A;
    private b7.d B;
    private boolean C;
    private boolean D;

    /* renamed from: n  reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f5661n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap<Activity, d> f5662o;

    /* renamed from: p  reason: collision with root package name */
    private final WeakHashMap<Activity, c> f5663p;

    /* renamed from: q  reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f5664q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, Long> f5665r;

    /* renamed from: s  reason: collision with root package name */
    private final Set<WeakReference<b>> f5666s;

    /* renamed from: t  reason: collision with root package name */
    private Set<InterfaceC0082a> f5667t;

    /* renamed from: u  reason: collision with root package name */
    private final AtomicInteger f5668u;

    /* renamed from: v  reason: collision with root package name */
    private final k f5669v;

    /* renamed from: w  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f5670w;

    /* renamed from: x  reason: collision with root package name */
    private final a7.a f5671x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f5672y;

    /* renamed from: z  reason: collision with root package name */
    private l f5673z;

    /* renamed from: com.google.firebase.perf.application.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0082a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void onUpdateAppState(b7.d dVar);
    }

    a(k kVar, a7.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    a(k kVar, a7.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f5661n = new WeakHashMap<>();
        this.f5662o = new WeakHashMap<>();
        this.f5663p = new WeakHashMap<>();
        this.f5664q = new WeakHashMap<>();
        this.f5665r = new HashMap();
        this.f5666s = new HashSet();
        this.f5667t = new HashSet();
        this.f5668u = new AtomicInteger(0);
        this.B = b7.d.BACKGROUND;
        this.C = false;
        this.D = true;
        this.f5669v = kVar;
        this.f5671x = aVar;
        this.f5670w = aVar2;
        this.f5672y = z10;
    }

    public static a b() {
        if (F == null) {
            synchronized (a.class) {
                if (F == null) {
                    F = new a(k.k(), new a7.a());
                }
            }
        }
        return F;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f5667t) {
            for (InterfaceC0082a interfaceC0082a : this.f5667t) {
                if (interfaceC0082a != null) {
                    interfaceC0082a.a();
                }
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f5664q.get(activity);
        if (trace == null) {
            return;
        }
        this.f5664q.remove(activity);
        g<f.a> e10 = this.f5662o.get(activity).e();
        if (!e10.d()) {
            E.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        j.a(trace, e10.c());
        trace.stop();
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f5670w.K()) {
            m.b N = m.x0().V(str).T(lVar.e()).U(lVar.d(lVar2)).N(SessionManager.getInstance().perfSession().a());
            int andSet = this.f5668u.getAndSet(0);
            synchronized (this.f5665r) {
                N.P(this.f5665r);
                if (andSet != 0) {
                    N.R(a7.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f5665r.clear();
            }
            this.f5669v.C(N.a(), b7.d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f5670w.K()) {
            d dVar = new d(activity);
            this.f5662o.put(activity, dVar);
            if (activity instanceof androidx.fragment.app.d) {
                c cVar = new c(this.f5671x, this.f5669v, this, dVar);
                this.f5663p.put(activity, cVar);
                ((androidx.fragment.app.d) activity).p().h(cVar, true);
            }
        }
    }

    private void q(b7.d dVar) {
        this.B = dVar;
        synchronized (this.f5666s) {
            Iterator<WeakReference<b>> it = this.f5666s.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.B);
                } else {
                    it.remove();
                }
            }
        }
    }

    public b7.d a() {
        return this.B;
    }

    public void d(String str, long j10) {
        synchronized (this.f5665r) {
            Long l10 = this.f5665r.get(str);
            if (l10 == null) {
                this.f5665r.put(str, Long.valueOf(j10));
            } else {
                this.f5665r.put(str, Long.valueOf(l10.longValue() + j10));
            }
        }
    }

    public void e(int i10) {
        this.f5668u.addAndGet(i10);
    }

    public boolean f() {
        return this.D;
    }

    protected boolean h() {
        return this.f5672y;
    }

    public synchronized void i(Context context) {
        if (this.C) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.C = true;
        }
    }

    public void j(InterfaceC0082a interfaceC0082a) {
        synchronized (this.f5667t) {
            this.f5667t.add(interfaceC0082a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f5666s) {
            this.f5666s.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f5662o.remove(activity);
        if (this.f5663p.containsKey(activity)) {
            ((androidx.fragment.app.d) activity).p().j(this.f5663p.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f5661n.isEmpty()) {
            this.f5673z = this.f5671x.a();
            this.f5661n.put(activity, Boolean.TRUE);
            if (this.D) {
                q(b7.d.FOREGROUND);
                l();
                this.D = false;
            } else {
                n(a7.c.BACKGROUND_TRACE_NAME.toString(), this.A, this.f5673z);
                q(b7.d.FOREGROUND);
            }
        } else {
            this.f5661n.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (h() && this.f5670w.K()) {
            if (!this.f5662o.containsKey(activity)) {
                o(activity);
            }
            this.f5662o.get(activity).c();
            Trace trace = new Trace(c(activity), this.f5669v, this.f5671x, this);
            trace.start();
            this.f5664q.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (h()) {
            m(activity);
        }
        if (this.f5661n.containsKey(activity)) {
            this.f5661n.remove(activity);
            if (this.f5661n.isEmpty()) {
                this.A = this.f5671x.a();
                n(a7.c.FOREGROUND_TRACE_NAME.toString(), this.f5673z, this.A);
                q(b7.d.BACKGROUND);
            }
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f5666s) {
            this.f5666s.remove(weakReference);
        }
    }
}
