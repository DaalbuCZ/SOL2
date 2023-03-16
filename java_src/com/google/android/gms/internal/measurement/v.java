package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class v implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return q.f4079c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof v;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
