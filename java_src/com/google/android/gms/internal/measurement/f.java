package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class f implements Iterable, q, m {

    /* renamed from: n  reason: collision with root package name */
    final SortedMap f3840n;

    /* renamed from: o  reason: collision with root package name */
    final Map f3841o;

    public f() {
        this.f3840n = new TreeMap();
        this.f3841o = new TreeMap();
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                L(i10, (q) list.get(i10));
            }
        }
    }

    public final int C() {
        return this.f3840n.size();
    }

    public final int D() {
        if (this.f3840n.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f3840n.lastKey()).intValue() + 1;
    }

    public final q E(int i10) {
        q qVar;
        if (i10 < D()) {
            return (!M(i10) || (qVar = (q) this.f3840n.get(Integer.valueOf(i10))) == null) ? q.f4079c : qVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String F(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f3840n.isEmpty()) {
            for (int i10 = 0; i10 < D(); i10++) {
                q E = E(i10);
                sb.append(str);
                if (!(E instanceof v) && !(E instanceof o)) {
                    sb.append(E.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator G() {
        return this.f3840n.keySet().iterator();
    }

    public final List H() {
        ArrayList arrayList = new ArrayList(D());
        for (int i10 = 0; i10 < D(); i10++) {
            arrayList.add(E(i10));
        }
        return arrayList;
    }

    public final void I() {
        this.f3840n.clear();
    }

    public final void J(int i10, q qVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        } else if (i10 >= D()) {
            L(i10, qVar);
        } else {
            for (int intValue = ((Integer) this.f3840n.lastKey()).intValue(); intValue >= i10; intValue--) {
                SortedMap sortedMap = this.f3840n;
                Integer valueOf = Integer.valueOf(intValue);
                q qVar2 = (q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    L(intValue + 1, qVar2);
                    this.f3840n.remove(valueOf);
                }
            }
            L(i10, qVar);
        }
    }

    public final void K(int i10) {
        int intValue = ((Integer) this.f3840n.lastKey()).intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        this.f3840n.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            SortedMap sortedMap = this.f3840n;
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(valueOf) || i11 < 0) {
                return;
            }
            this.f3840n.put(valueOf, q.f4079c);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) this.f3840n.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.f3840n;
            Integer valueOf2 = Integer.valueOf(i10);
            q qVar = (q) sortedMap2.get(valueOf2);
            if (qVar != null) {
                this.f3840n.put(Integer.valueOf(i10 - 1), qVar);
                this.f3840n.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void L(int i10, q qVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        } else if (qVar == null) {
            this.f3840n.remove(Integer.valueOf(i10));
        } else {
            this.f3840n.put(Integer.valueOf(i10), qVar);
        }
    }

    public final boolean M(int i10) {
        if (i10 < 0 || i10 > ((Integer) this.f3840n.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        }
        return this.f3840n.containsKey(Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        SortedMap sortedMap;
        Integer num;
        q d10;
        f fVar = new f();
        for (Map.Entry entry : this.f3840n.entrySet()) {
            if (entry.getValue() instanceof m) {
                sortedMap = fVar.f3840n;
                num = (Integer) entry.getKey();
                d10 = (q) entry.getValue();
            } else {
                sortedMap = fVar.f3840n;
                num = (Integer) entry.getKey();
                d10 = ((q) entry.getValue()).d();
            }
            sortedMap.put(num, d10);
        }
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (D() != fVar.D()) {
                return false;
            }
            if (this.f3840n.isEmpty()) {
                return fVar.f3840n.isEmpty();
            }
            for (int intValue = ((Integer) this.f3840n.firstKey()).intValue(); intValue <= ((Integer) this.f3840n.lastKey()).intValue(); intValue++) {
                if (!E(intValue).equals(fVar.E(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return this.f3840n.size() == 1 ? E(0).f() : this.f3840n.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        return F(",");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return new d(this, this.f3840n.keySet().iterator(), this.f3841o.keySet().iterator());
    }

    public final int hashCode() {
        return this.f3840n.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean l(String str) {
        return "length".equals(str) || this.f3841o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q s(String str) {
        q qVar;
        return "length".equals(str) ? new i(Double.valueOf(D())) : (!l(str) || (qVar = (q) this.f3841o.get(str)) == null) ? q.f4079c : qVar;
    }

    public final String toString() {
        return F(",");
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void v(String str, q qVar) {
        if (qVar == null) {
            this.f3841o.remove(str);
        } else {
            this.f3841o.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? d0.a(str, this, z4Var, list) : k.a(this, new u(str), z4Var, list);
    }
}
