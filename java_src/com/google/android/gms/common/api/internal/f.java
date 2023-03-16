package com.google.android.gms.common.api.internal;

import android.app.Activity;
/* loaded from: classes.dex */
public final class f extends b0 {

    /* renamed from: s  reason: collision with root package name */
    private final m.b<y3.b<?>> f3597s;

    /* renamed from: t  reason: collision with root package name */
    private final b f3598t;

    f(y3.e eVar, b bVar, w3.e eVar2) {
        super(eVar, eVar2);
        this.f3597s = new m.b<>();
        this.f3598t = bVar;
        this.f3560n.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, y3.b<?> bVar2) {
        y3.e c10 = LifecycleCallback.c(activity);
        f fVar = (f) c10.c("ConnectionlessLifecycleHelper", f.class);
        if (fVar == null) {
            fVar = new f(c10, bVar, w3.e.m());
        }
        z3.o.j(bVar2, "ApiKey cannot be null");
        fVar.f3597s.add(bVar2);
        bVar.c(fVar);
    }

    private final void v() {
        if (this.f3597s.isEmpty()) {
            return;
        }
        this.f3598t.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.b0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.b0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f3598t.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    protected final void m(w3.b bVar, int i10) {
        this.f3598t.F(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    protected final void n() {
        this.f3598t.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m.b<y3.b<?>> t() {
        return this.f3597s;
    }
}
