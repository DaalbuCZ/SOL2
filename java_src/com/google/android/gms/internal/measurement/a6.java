package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class a6 {
    public static double a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || i10 == 0) {
            return d10;
        }
        return (i10 > 0 ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static int b(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((i10 > 0 ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static int c(z4 z4Var) {
        int b10 = b(z4Var.d("runtime.counter").f().doubleValue() + 1.0d);
        if (b10 <= 1000000) {
            z4Var.g("runtime.counter", new i(Double.valueOf(b10)));
            return b10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d10) {
        return b(d10) & 4294967295L;
    }

    public static n0 e(String str) {
        n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = n0.e(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(q qVar) {
        if (q.f4080d.equals(qVar)) {
            return null;
        }
        if (q.f4079c.equals(qVar)) {
            return "";
        }
        if (qVar instanceof n) {
            return g((n) qVar);
        }
        if (!(qVar instanceof f)) {
            return !qVar.f().isNaN() ? qVar.f() : qVar.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((f) qVar).iterator();
        while (it.hasNext()) {
            Object f10 = f((q) it.next());
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        return arrayList;
    }

    public static Map g(n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.a()) {
            Object f10 = f(nVar.s(str));
            if (f10 != null) {
                hashMap.put(str, f10);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double f10 = qVar.f();
        return !f10.isNaN() && f10.doubleValue() >= 0.0d && f10.equals(Double.valueOf(Math.floor(f10.doubleValue())));
    }

    public static boolean l(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            if (!(qVar instanceof i)) {
                return qVar instanceof u ? qVar.g().equals(qVar2.g()) : qVar instanceof g ? qVar.k().equals(qVar2.k()) : qVar == qVar2;
            } else if (Double.isNaN(qVar.f().doubleValue()) || Double.isNaN(qVar2.f().doubleValue())) {
                return false;
            } else {
                return qVar.f().equals(qVar2.f());
            }
        }
        return false;
    }
}
