package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements q {

    /* renamed from: n  reason: collision with root package name */
    private final boolean f3851n;

    public g(Boolean bool) {
        this.f3851n = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return new g(Boolean.valueOf(this.f3851n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f3851n == ((g) obj).f3851n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return Double.valueOf(true != this.f3851n ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return Boolean.toString(this.f3851n);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f3851n).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.valueOf(this.f3851n);
    }

    public final String toString() {
        return String.valueOf(this.f3851n);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.f3851n));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f3851n), str));
    }
}
