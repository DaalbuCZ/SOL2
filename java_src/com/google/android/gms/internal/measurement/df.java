package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class df extends j {

    /* renamed from: p  reason: collision with root package name */
    private final hf f3814p;

    public df(hf hfVar) {
        super("internal.registerCallback");
        this.f3814p = hfVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        a6.h(this.f3917n, 3, list);
        String g10 = z4Var.b((q) list.get(0)).g();
        q b10 = z4Var.b((q) list.get(1));
        if (b10 instanceof p) {
            q b11 = z4Var.b((q) list.get(2));
            if (b11 instanceof n) {
                n nVar = (n) b11;
                if (nVar.l("type")) {
                    this.f3814p.a(g10, nVar.l("priority") ? a6.b(nVar.s("priority").f().doubleValue()) : 1000, (p) b10, nVar.s("type").g());
                    return q.f4079c;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
