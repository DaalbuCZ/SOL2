package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class d9 extends j {

    /* renamed from: p  reason: collision with root package name */
    private final c f3807p;

    public d9(c cVar) {
        super("internal.eventLogger");
        this.f3807p = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        a6.h(this.f3917n, 3, list);
        String g10 = z4Var.b((q) list.get(0)).g();
        long a10 = (long) a6.a(z4Var.b((q) list.get(1)).f().doubleValue());
        q b10 = z4Var.b((q) list.get(2));
        this.f3807p.e(g10, a10, b10 instanceof n ? a6.g((n) b10) : new HashMap());
        return q.f4079c;
    }
}
