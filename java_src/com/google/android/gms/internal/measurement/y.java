package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    final Map f4298a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final l0 f4299b = new l0();

    public y() {
        b(new w());
        b(new z());
        b(new a0());
        b(new e0());
        b(new j0());
        b(new k0());
        b(new m0());
    }

    public final q a(z4 z4Var, q qVar) {
        a6.c(z4Var);
        if (qVar instanceof r) {
            r rVar = (r) qVar;
            ArrayList b10 = rVar.b();
            String a10 = rVar.a();
            return (this.f4298a.containsKey(a10) ? (x) this.f4298a.get(a10) : this.f4299b).a(a10, z4Var, b10);
        }
        return qVar;
    }

    final void b(x xVar) {
        for (n0 n0Var : xVar.f4282a) {
            this.f4298a.put(n0Var.g().toString(), xVar);
        }
    }
}
