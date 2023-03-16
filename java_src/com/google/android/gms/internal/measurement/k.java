package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static q a(m mVar, q qVar, z4 z4Var, List list) {
        if (mVar.l(qVar.g())) {
            q s10 = mVar.s(qVar.g());
            if (s10 instanceof j) {
                return ((j) s10).a(z4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.g()));
        } else if ("hasOwnProperty".equals(qVar.g())) {
            a6.h("hasOwnProperty", 1, list);
            return mVar.l(z4Var.b((q) list.get(0)).g()) ? q.f4084h : q.f4085i;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.g()));
        }
    }

    public static Iterator b(Map map) {
        return new l(map.keySet().iterator());
    }
}
