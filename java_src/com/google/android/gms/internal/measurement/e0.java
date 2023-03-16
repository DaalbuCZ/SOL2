package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class e0 extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public e0() {
        this.f4282a.add(n0.AND);
        this.f4282a.add(n0.NOT);
        this.f4282a.add(n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        n0 n0Var = n0.ADD;
        int ordinal = a6.e(str).ordinal();
        if (ordinal == 1) {
            a6.h(n0.AND.name(), 2, list);
            q b10 = z4Var.b((q) list.get(0));
            if (!b10.k().booleanValue()) {
                return b10;
            }
        } else if (ordinal == 47) {
            a6.h(n0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!z4Var.b((q) list.get(0)).k().booleanValue()));
        } else if (ordinal != 50) {
            return super.b(str);
        } else {
            a6.h(n0.OR.name(), 2, list);
            q b11 = z4Var.b((q) list.get(0));
            if (b11.k().booleanValue()) {
                return b11;
            }
        }
        return z4Var.b((q) list.get(1));
    }
}
