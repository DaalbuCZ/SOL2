package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import c8.a;
import f5.l;
import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class i implements c8.a, l.d, l.b {

    /* renamed from: n  reason: collision with root package name */
    private Context f8859n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8860o = false;

    private t4.i<l.g> o(final f5.e eVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                i.this.r(eVar, jVar);
            }
        });
        return jVar.a();
    }

    private l.f p(f5.l lVar) {
        l.f.a aVar = new l.f.a();
        aVar.b(lVar.b());
        aVar.c(lVar.c());
        if (lVar.f() != null) {
            aVar.e(lVar.f());
        }
        if (lVar.g() != null) {
            aVar.f(lVar.g());
        }
        aVar.d(lVar.d());
        aVar.g(lVar.h());
        aVar.h(lVar.e());
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(String str, t4.j jVar) {
        try {
            try {
                f5.e.o(str).i();
            } catch (IllegalStateException unused) {
            }
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(f5.e eVar, t4.j jVar) {
        try {
            l.g.a aVar = new l.g.a();
            aVar.c(eVar.p());
            aVar.d(p(eVar.q()));
            aVar.b(Boolean.valueOf(eVar.w()));
            aVar.e((Map) t4.l.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(eVar)));
            jVar.c(aVar.a());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(l.f fVar, String str, t4.j jVar) {
        try {
            f5.l a10 = new l.b().b(fVar.b()).c(fVar.c()).d(fVar.d()).f(fVar.e()).g(fVar.f()).h(fVar.g()).e(fVar.h()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            jVar.c((l.g) t4.l.a(o(f5.e.v(this.f8859n, a10, str))));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(t4.j jVar) {
        try {
            if (this.f8860o) {
                t4.l.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f8860o = true;
            }
            List<f5.e> m10 = f5.e.m(this.f8859n);
            ArrayList arrayList = new ArrayList(m10.size());
            for (f5.e eVar : m10) {
                arrayList.add((l.g) t4.l.a(o(eVar)));
            }
            jVar.c(arrayList);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(l.h hVar, t4.i iVar) {
        if (iVar.p()) {
            hVar.a(iVar.l());
        } else {
            hVar.b(iVar.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(t4.j jVar) {
        try {
            f5.l a10 = f5.l.a(this.f8859n);
            if (a10 == null) {
                jVar.c(null);
            } else {
                jVar.c(p(a10));
            }
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(String str, Boolean bool, t4.j jVar) {
        try {
            f5.e.o(str).E(bool);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(String str, Boolean bool, t4.j jVar) {
        try {
            f5.e.o(str).D(bool.booleanValue());
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    private <T> void y(t4.j<T> jVar, final l.h<T> hVar) {
        jVar.a().c(new t4.d() { // from class: io.flutter.plugins.firebase.core.h
            @Override // t4.d
            public final void a(t4.i iVar) {
                i.u(l.h.this, iVar);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void a(final String str, final l.f fVar, l.h<l.g> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                i.this.s(fVar, str, jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void b(l.h<List<l.g>> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                i.this.t(jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void c(l.h<l.f> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                i.this.v(jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void d(final String str, final Boolean bool, l.h<Void> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e
            @Override // java.lang.Runnable
            public final void run() {
                i.w(str, bool, jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void e(final String str, final Boolean bool, l.h<Void> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                i.x(str, bool, jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void f(final String str, l.h<Void> hVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g
            @Override // java.lang.Runnable
            public final void run() {
                i.q(str, jVar);
            }
        });
        y(jVar, hVar);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        t.h(bVar.b(), this);
        p.h(bVar.b(), this);
        this.f8859n = bVar.a();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f8859n = null;
        t.h(bVar.b(), null);
        p.h(bVar.b(), null);
    }
}
