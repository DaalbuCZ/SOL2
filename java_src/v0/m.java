package v0;

import android.app.Activity;
import android.content.Context;
import c8.a;
/* loaded from: classes.dex */
public final class m implements c8.a, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private final n f15501n = new n();

    /* renamed from: o  reason: collision with root package name */
    private l8.k f15502o;

    /* renamed from: p  reason: collision with root package name */
    private l8.o f15503p;

    /* renamed from: q  reason: collision with root package name */
    private d8.c f15504q;

    /* renamed from: r  reason: collision with root package name */
    private l f15505r;

    private void a() {
        d8.c cVar = this.f15504q;
        if (cVar != null) {
            cVar.h(this.f15501n);
            this.f15504q.g(this.f15501n);
        }
    }

    private void b() {
        l8.o oVar = this.f15503p;
        if (oVar != null) {
            oVar.b(this.f15501n);
            this.f15503p.c(this.f15501n);
            return;
        }
        d8.c cVar = this.f15504q;
        if (cVar != null) {
            cVar.b(this.f15501n);
            this.f15504q.c(this.f15501n);
        }
    }

    private void c(Context context, l8.c cVar) {
        this.f15502o = new l8.k(cVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f15501n, new p());
        this.f15505r = lVar;
        this.f15502o.e(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.f15505r;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    private void e() {
        this.f15502o.e(null);
        this.f15502o = null;
        this.f15505r = null;
    }

    private void f() {
        l lVar = this.f15505r;
        if (lVar != null) {
            lVar.i(null);
        }
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        d(cVar.e());
        this.f15504q = cVar;
        b();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        c(bVar.a(), bVar.b());
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        f();
        a();
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        onAttachedToActivity(cVar);
    }
}
