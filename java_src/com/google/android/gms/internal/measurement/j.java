package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j implements q, m {

    /* renamed from: n  reason: collision with root package name */
    protected final String f3917n;

    /* renamed from: o  reason: collision with root package name */
    protected final Map f3918o = new HashMap();

    public j(String str) {
        this.f3917n = str;
    }

    public abstract q a(z4 z4Var, List list);

    public final String b() {
        return this.f3917n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String str = this.f3917n;
            if (str != null) {
                return str.equals(jVar.f3917n);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return this.f3917n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return k.b(this.f3918o);
    }

    public final int hashCode() {
        String str = this.f3917n;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean l(String str) {
        return this.f3918o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q s(String str) {
        return this.f3918o.containsKey(str) ? (q) this.f3918o.get(str) : q.f4079c;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void v(String str, q qVar) {
        if (qVar == null) {
            this.f3918o.remove(str);
        } else {
            this.f3918o.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        return "toString".equals(str) ? new u(this.f3917n) : k.a(this, new u(str), z4Var, list);
    }
}
