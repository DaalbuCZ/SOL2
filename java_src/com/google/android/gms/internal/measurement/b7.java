package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class b7 {
    public static q a(y5 y5Var) {
        if (y5Var == null) {
            return q.f4079c;
        }
        int N = y5Var.N() - 1;
        if (N == 1) {
            return y5Var.M() ? new u(y5Var.H()) : q.f4086j;
        } else if (N == 2) {
            return y5Var.L() ? new i(Double.valueOf(y5Var.E())) : new i(null);
        } else if (N == 3) {
            return y5Var.K() ? new g(Boolean.valueOf(y5Var.J())) : new g(null);
        } else if (N == 4) {
            List<y5> I = y5Var.I();
            ArrayList arrayList = new ArrayList();
            for (y5 y5Var2 : I) {
                arrayList.add(a(y5Var2));
            }
            return new r(y5Var.G(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static q b(Object obj) {
        if (obj == null) {
            return q.f4080d;
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                f fVar = new f();
                for (Object obj2 : (List) obj) {
                    fVar.L(fVar.D(), b(obj2));
                }
                return fVar;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        n nVar = new n();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            q b10 = b(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                nVar.v((String) obj3, b10);
            }
        }
        return nVar;
    }
}
