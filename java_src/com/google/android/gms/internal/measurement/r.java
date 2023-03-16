package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: n  reason: collision with root package name */
    private final String f4104n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList f4105o;

    public r(String str, List list) {
        this.f4104n = str;
        ArrayList arrayList = new ArrayList();
        this.f4105o = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f4104n;
    }

    public final ArrayList b() {
        return this.f4105o;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = this.f4104n;
            if (str == null ? rVar.f4104n == null : str.equals(rVar.f4104n)) {
                return this.f4105o.equals(rVar.f4105o);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f4104n;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f4105o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
