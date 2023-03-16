package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import x3.a;
import z3.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements c.InterfaceC0247c, y3.y {

    /* renamed from: a  reason: collision with root package name */
    private final a.f f3624a;

    /* renamed from: b  reason: collision with root package name */
    private final y3.b<?> f3625b;

    /* renamed from: c  reason: collision with root package name */
    private z3.i f3626c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f3627d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3628e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b f3629f;

    public p(b bVar, a.f fVar, y3.b<?> bVar2) {
        this.f3629f = bVar;
        this.f3624a = fVar;
        this.f3625b = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        z3.i iVar;
        if (!this.f3628e || (iVar = this.f3626c) == null) {
            return;
        }
        this.f3624a.o(iVar, this.f3627d);
    }

    @Override // z3.c.InterfaceC0247c
    public final void a(w3.b bVar) {
        Handler handler;
        handler = this.f3629f.C;
        handler.post(new o(this, bVar));
    }

    @Override // y3.y
    public final void b(w3.b bVar) {
        Map map;
        map = this.f3629f.f3579y;
        m mVar = (m) map.get(this.f3625b);
        if (mVar != null) {
            mVar.I(bVar);
        }
    }

    @Override // y3.y
    public final void c(z3.i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new w3.b(4));
            return;
        }
        this.f3626c = iVar;
        this.f3627d = set;
        h();
    }
}
