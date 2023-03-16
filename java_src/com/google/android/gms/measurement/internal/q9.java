package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.dd;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q9 {

    /* renamed from: a  reason: collision with root package name */
    private String f4928a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4929b;

    /* renamed from: c  reason: collision with root package name */
    private com.google.android.gms.internal.measurement.i5 f4930c;

    /* renamed from: d  reason: collision with root package name */
    private BitSet f4931d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f4932e;

    /* renamed from: f  reason: collision with root package name */
    private Map f4933f;

    /* renamed from: g  reason: collision with root package name */
    private Map f4934g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f4935h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q9(b bVar, String str, com.google.android.gms.internal.measurement.i5 i5Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, p4.d0 d0Var) {
        this.f4935h = bVar;
        this.f4928a = str;
        this.f4931d = bitSet;
        this.f4932e = bitSet2;
        this.f4933f = map;
        this.f4934g = new m.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f4934g.put(num, arrayList);
        }
        this.f4929b = false;
        this.f4930c = i5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q9(b bVar, String str, p4.d0 d0Var) {
        this.f4935h = bVar;
        this.f4928a = str;
        this.f4929b = true;
        this.f4931d = new BitSet();
        this.f4932e = new BitSet();
        this.f4933f = new m.a();
        this.f4934g = new m.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(q9 q9Var) {
        return q9Var.f4931d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.o4 a(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.n4 F = com.google.android.gms.internal.measurement.o4.F();
        F.w(i10);
        F.z(this.f4929b);
        com.google.android.gms.internal.measurement.i5 i5Var = this.f4930c;
        if (i5Var != null) {
            F.A(i5Var);
        }
        com.google.android.gms.internal.measurement.h5 J = com.google.android.gms.internal.measurement.i5.J();
        J.x(c9.H(this.f4931d));
        J.A(c9.H(this.f4932e));
        Map map = this.f4933f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f4933f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f4933f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.p4 G = com.google.android.gms.internal.measurement.q4.G();
                    G.x(intValue);
                    G.w(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.q4) G.q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            J.w(arrayList);
        }
        Map map2 = this.f4934g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f4934g.keySet()) {
                com.google.android.gms.internal.measurement.j5 H = com.google.android.gms.internal.measurement.k5.H();
                H.x(num2.intValue());
                List list2 = (List) this.f4934g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    H.w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.k5) H.q());
            }
            list = arrayList3;
        }
        J.z(list);
        F.x(J);
        return (com.google.android.gms.internal.measurement.o4) F.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(t9 t9Var) {
        int a10 = t9Var.a();
        Boolean bool = t9Var.f5031c;
        if (bool != null) {
            this.f4932e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = t9Var.f5032d;
        if (bool2 != null) {
            this.f4931d.set(a10, bool2.booleanValue());
        }
        if (t9Var.f5033e != null) {
            Map map = this.f4933f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = t9Var.f5033e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f4933f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (t9Var.f5034f != null) {
            Map map2 = this.f4934g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f4934g.put(valueOf2, list);
            }
            if (t9Var.c()) {
                list.clear();
            }
            dd.c();
            h z10 = this.f4935h.f4438a.z();
            String str = this.f4928a;
            t2 t2Var = u2.Y;
            if (z10.B(str, t2Var) && t9Var.b()) {
                list.clear();
            }
            dd.c();
            boolean B = this.f4935h.f4438a.z().B(this.f4928a, t2Var);
            Long valueOf3 = Long.valueOf(t9Var.f5034f.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (list.contains(valueOf3)) {
            } else {
                list.add(valueOf3);
            }
        }
    }
}
