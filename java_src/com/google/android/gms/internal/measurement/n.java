package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class n implements q, m {

    /* renamed from: n  reason: collision with root package name */
    final Map f3985n = new HashMap();

    public final List a() {
        return new ArrayList(this.f3985n.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        Map map;
        String str;
        q d10;
        n nVar = new n();
        for (Map.Entry entry : this.f3985n.entrySet()) {
            if (entry.getValue() instanceof m) {
                map = nVar.f3985n;
                str = (String) entry.getKey();
                d10 = (q) entry.getValue();
            } else {
                map = nVar.f3985n;
                str = (String) entry.getKey();
                d10 = ((q) entry.getValue()).d();
            }
            map.put(str, d10);
        }
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f3985n.equals(((n) obj).f3985n);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return k.b(this.f3985n);
    }

    public final int hashCode() {
        return this.f3985n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean l(String str) {
        return this.f3985n.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q s(String str) {
        return this.f3985n.containsKey(str) ? (q) this.f3985n.get(str) : q.f4079c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f3985n.isEmpty()) {
            for (String str : this.f3985n.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f3985n.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void v(String str, q qVar) {
        if (qVar == null) {
            this.f3985n.remove(str);
        } else {
            this.f3985n.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q x(String str, z4 z4Var, List list) {
        return "toString".equals(str) ? new u(toString()) : k.a(this, new u(str), z4Var, list);
    }
}
