package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class hf {

    /* renamed from: a  reason: collision with root package name */
    final TreeMap f3890a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    final TreeMap f3891b = new TreeMap();

    private static final int c(z4 z4Var, p pVar, q qVar) {
        q a10 = pVar.a(z4Var, Collections.singletonList(qVar));
        if (a10 instanceof i) {
            return a6.b(a10.f().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f3891b;
        } else if (!"edit".equals(str2)) {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        } else {
            treeMap = this.f3890a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(z4 z4Var, c cVar) {
        ba baVar = new ba(cVar);
        for (Integer num : this.f3890a.keySet()) {
            b clone = cVar.b().clone();
            int c10 = c(z4Var, (p) this.f3890a.get(num), baVar);
            if (c10 == 2 || c10 == -1) {
                cVar.f(clone);
            }
        }
        for (Integer num2 : this.f3891b.keySet()) {
            c(z4Var, (p) this.f3891b.get(num2), baVar);
        }
    }
}
