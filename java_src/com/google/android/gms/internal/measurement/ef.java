package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ef extends j {

    /* renamed from: p  reason: collision with root package name */
    private final c8 f3838p;

    /* renamed from: q  reason: collision with root package name */
    final Map f3839q;

    public ef(c8 c8Var) {
        super("require");
        this.f3839q = new HashMap();
        this.f3838p = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        q qVar;
        a6.h("require", 1, list);
        String g10 = z4Var.b((q) list.get(0)).g();
        if (this.f3839q.containsKey(g10)) {
            return (q) this.f3839q.get(g10);
        }
        c8 c8Var = this.f3838p;
        if (c8Var.f3769a.containsKey(g10)) {
            try {
                qVar = (q) ((Callable) c8Var.f3769a.get(g10)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g10)));
            }
        } else {
            qVar = q.f4079c;
        }
        if (qVar instanceof j) {
            this.f3839q.put(g10, (j) qVar);
        }
        return qVar;
    }
}
