package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class o implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return q.f4080d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof o;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
