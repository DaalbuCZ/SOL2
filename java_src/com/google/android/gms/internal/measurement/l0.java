package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class l0 extends x {
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        if (str == null || str.isEmpty() || !z4Var.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        q d10 = z4Var.d(str);
        if (d10 instanceof j) {
            return ((j) d10).a(z4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
