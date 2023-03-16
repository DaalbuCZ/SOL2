package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c8.a;
import d8.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l8.m;
import l8.n;
import l8.p;
import l8.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements c8.b, d8.b {

    /* renamed from: b  reason: collision with root package name */
    private final io.flutter.embedding.engine.a f8634b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f8635c;

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f8637e;

    /* renamed from: f  reason: collision with root package name */
    private C0131c f8638f;

    /* renamed from: i  reason: collision with root package name */
    private Service f8641i;

    /* renamed from: j  reason: collision with root package name */
    private f f8642j;

    /* renamed from: l  reason: collision with root package name */
    private BroadcastReceiver f8644l;

    /* renamed from: m  reason: collision with root package name */
    private d f8645m;

    /* renamed from: o  reason: collision with root package name */
    private ContentProvider f8647o;

    /* renamed from: p  reason: collision with root package name */
    private e f8648p;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends c8.a>, c8.a> f8633a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends c8.a>, d8.a> f8636d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private boolean f8639g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends c8.a>, h8.a> f8640h = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<? extends c8.a>, e8.a> f8643k = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<? extends c8.a>, f8.a> f8646n = new HashMap();

    /* loaded from: classes.dex */
    private static class b implements a.InterfaceC0073a {

        /* renamed from: a  reason: collision with root package name */
        final a8.f f8649a;

        private b(a8.f fVar) {
            this.f8649a = fVar;
        }

        @Override // c8.a.InterfaceC0073a
        public String a(String str) {
            return this.f8649a.k(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.engine.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0131c implements d8.c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f8650a;

        /* renamed from: b  reason: collision with root package name */
        private final HiddenLifecycleReference f8651b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<p> f8652c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f8653d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<n> f8654e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<q> f8655f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<c.a> f8656g = new HashSet();

        public C0131c(Activity activity, androidx.lifecycle.e eVar) {
            this.f8650a = activity;
            this.f8651b = new HiddenLifecycleReference(eVar);
        }

        @Override // d8.c
        public Object a() {
            return this.f8651b;
        }

        @Override // d8.c
        public void b(m mVar) {
            this.f8653d.add(mVar);
        }

        @Override // d8.c
        public void c(p pVar) {
            this.f8652c.add(pVar);
        }

        boolean d(int i10, int i11, Intent intent) {
            Iterator it = new HashSet(this.f8653d).iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    if (((m) it.next()).a(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        @Override // d8.c
        public Activity e() {
            return this.f8650a;
        }

        @Override // d8.c
        public void f(n nVar) {
            this.f8654e.add(nVar);
        }

        @Override // d8.c
        public void g(p pVar) {
            this.f8652c.remove(pVar);
        }

        @Override // d8.c
        public void h(m mVar) {
            this.f8653d.remove(mVar);
        }

        void i(Intent intent) {
            for (n nVar : this.f8654e) {
                nVar.onNewIntent(intent);
            }
        }

        boolean j(int i10, String[] strArr, int[] iArr) {
            boolean z10;
            while (true) {
                for (p pVar : this.f8652c) {
                    z10 = pVar.onRequestPermissionsResult(i10, strArr, iArr) || z10;
                }
                return z10;
            }
        }

        void k(Bundle bundle) {
            for (c.a aVar : this.f8656g) {
                aVar.b(bundle);
            }
        }

        void l(Bundle bundle) {
            for (c.a aVar : this.f8656g) {
                aVar.c(bundle);
            }
        }

        void m() {
            for (q qVar : this.f8655f) {
                qVar.d();
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d implements e8.b {
    }

    /* loaded from: classes.dex */
    private static class e implements f8.b {
    }

    /* loaded from: classes.dex */
    private static class f implements h8.b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, io.flutter.embedding.engine.a aVar, a8.f fVar) {
        this.f8634b = aVar;
        this.f8635c = new a.b(context, aVar, aVar.h(), aVar.p(), aVar.n().P(), new b(fVar));
    }

    private void i(Activity activity, androidx.lifecycle.e eVar) {
        this.f8638f = new C0131c(activity, eVar);
        this.f8634b.n().h0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f8634b.n().B(activity, this.f8634b.p(), this.f8634b.h());
        for (d8.a aVar : this.f8636d.values()) {
            if (this.f8639g) {
                aVar.onReattachedToActivityForConfigChanges(this.f8638f);
            } else {
                aVar.onAttachedToActivity(this.f8638f);
            }
        }
        this.f8639g = false;
    }

    private void k() {
        this.f8634b.n().J();
        this.f8637e = null;
        this.f8638f = null;
    }

    private void l() {
        if (q()) {
            h();
        } else if (t()) {
            o();
        } else if (r()) {
            m();
        } else if (s()) {
            n();
        }
    }

    private boolean q() {
        return this.f8637e != null;
    }

    private boolean r() {
        return this.f8644l != null;
    }

    private boolean s() {
        return this.f8647o != null;
    }

    private boolean t() {
        return this.f8641i != null;
    }

    @Override // d8.b
    public boolean a(int i10, int i11, Intent intent) {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            return this.f8638f.d(i10, i11, intent);
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void b(Bundle bundle) {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f8638f.k(bundle);
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void c(Bundle bundle) {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f8638f.l(bundle);
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void d() {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f8638f.m();
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void e(io.flutter.embedding.android.c<Activity> cVar, androidx.lifecycle.e eVar) {
        w8.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f8637e;
            if (cVar2 != null) {
                cVar2.f();
            }
            l();
            this.f8637e = cVar;
            i(cVar.g(), eVar);
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void f() {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f8639g = true;
            for (d8.a aVar : this.f8636d.values()) {
                aVar.onDetachedFromActivityForConfigChanges();
            }
            k();
        } finally {
            w8.e.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.b
    public void g(c8.a aVar) {
        w8.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (p(aVar.getClass())) {
                x7.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f8634b + ").");
                return;
            }
            x7.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f8633a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f8635c);
            if (aVar instanceof d8.a) {
                d8.a aVar2 = (d8.a) aVar;
                this.f8636d.put(aVar.getClass(), aVar2);
                if (q()) {
                    aVar2.onAttachedToActivity(this.f8638f);
                }
            }
            if (aVar instanceof h8.a) {
                h8.a aVar3 = (h8.a) aVar;
                this.f8640h.put(aVar.getClass(), aVar3);
                if (t()) {
                    aVar3.b(this.f8642j);
                }
            }
            if (aVar instanceof e8.a) {
                e8.a aVar4 = (e8.a) aVar;
                this.f8643k.put(aVar.getClass(), aVar4);
                if (r()) {
                    aVar4.a(this.f8645m);
                }
            }
            if (aVar instanceof f8.a) {
                f8.a aVar5 = (f8.a) aVar;
                this.f8646n.put(aVar.getClass(), aVar5);
                if (s()) {
                    aVar5.b(this.f8648p);
                }
            }
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void h() {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (d8.a aVar : this.f8636d.values()) {
                aVar.onDetachedFromActivity();
            }
            k();
        } finally {
            w8.e.d();
        }
    }

    public void j() {
        x7.b.f("FlutterEngineCxnRegstry", "Destroying.");
        l();
        w();
    }

    public void m() {
        if (!r()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            for (e8.a aVar : this.f8643k.values()) {
                aVar.b();
            }
        } finally {
            w8.e.d();
        }
    }

    public void n() {
        if (!s()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            for (f8.a aVar : this.f8646n.values()) {
                aVar.a();
            }
        } finally {
            w8.e.d();
        }
    }

    public void o() {
        if (!t()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#detachFromService");
        try {
            for (h8.a aVar : this.f8640h.values()) {
                aVar.a();
            }
            this.f8641i = null;
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public void onNewIntent(Intent intent) {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f8638f.i(intent);
        } finally {
            w8.e.d();
        }
    }

    @Override // d8.b
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!q()) {
            x7.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        w8.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            return this.f8638f.j(i10, strArr, iArr);
        } finally {
            w8.e.d();
        }
    }

    public boolean p(Class<? extends c8.a> cls) {
        return this.f8633a.containsKey(cls);
    }

    public void u(Class<? extends c8.a> cls) {
        c8.a aVar = this.f8633a.get(cls);
        if (aVar == null) {
            return;
        }
        w8.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof d8.a) {
                if (q()) {
                    ((d8.a) aVar).onDetachedFromActivity();
                }
                this.f8636d.remove(cls);
            }
            if (aVar instanceof h8.a) {
                if (t()) {
                    ((h8.a) aVar).a();
                }
                this.f8640h.remove(cls);
            }
            if (aVar instanceof e8.a) {
                if (r()) {
                    ((e8.a) aVar).b();
                }
                this.f8643k.remove(cls);
            }
            if (aVar instanceof f8.a) {
                if (s()) {
                    ((f8.a) aVar).a();
                }
                this.f8646n.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f8635c);
            this.f8633a.remove(cls);
        } finally {
            w8.e.d();
        }
    }

    public void v(Set<Class<? extends c8.a>> set) {
        for (Class<? extends c8.a> cls : set) {
            u(cls);
        }
    }

    public void w() {
        v(new HashSet(this.f8633a.keySet()));
        this.f8633a.clear();
    }
}
