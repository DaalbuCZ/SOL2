package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class bb {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f3743a;

    /* renamed from: b  reason: collision with root package name */
    private static final rb f3744b;

    /* renamed from: c  reason: collision with root package name */
    private static final rb f3745c;

    /* renamed from: d  reason: collision with root package name */
    private static final rb f3746d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f3743a = cls;
        f3744b = C(false);
        f3745c = C(true);
        f3746d = new tb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (p8.a(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(ja jaVar, Object obj, Object obj2, long j10) {
        bc.x(obj, j10, ja.b(bc.k(obj, j10), bc.k(obj2, j10)));
    }

    private static rb C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (rb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * p8.D(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            D += p8.x((h8) list.get(i11));
        }
        return D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j9) {
            j9 j9Var = (j9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += p8.z(j9Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += p8.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (p8.a(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (p8.a(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i10, List list, za zaVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += p8.y(i10, (oa) list.get(i12), zaVar);
            }
            return i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j9) {
            j9 j9Var = (j9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += p8.z(j9Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += p8.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof da) {
            da daVar = (da) list;
            i10 = 0;
            while (i11 < size) {
                i10 += p8.b(daVar.a(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += p8.b(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i10, Object obj, za zaVar) {
        if (obj instanceof t9) {
            int a10 = p8.a(i10 << 3);
            int a11 = ((t9) obj).a();
            return a10 + p8.a(a11) + a11;
        }
        return p8.a(i10 << 3) + p8.B((oa) obj, zaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i10, List list, za zaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = p8.D(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            D += obj instanceof t9 ? p8.A((t9) obj) : p8.B((oa) obj, zaVar);
        }
        return D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j9) {
            j9 j9Var = (j9) list;
            i10 = 0;
            while (i11 < size) {
                int g10 = j9Var.g(i11);
                i10 += p8.a((g10 >> 31) ^ (g10 + g10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += p8.a((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int V(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof da) {
            da daVar = (da) list;
            i10 = 0;
            while (i11 < size) {
                long a10 = daVar.a(i11);
                i10 += p8.b((a10 >> 63) ^ (a10 + a10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += p8.b((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int W(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int D = p8.D(i10) * size;
        if (list instanceof v9) {
            v9 v9Var = (v9) list;
            while (i11 < size) {
                Object t10 = v9Var.t(i11);
                D += t10 instanceof h8 ? p8.x((h8) t10) : p8.C((String) t10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                D += obj instanceof h8 ? p8.x((h8) obj) : p8.C((String) obj);
                i11++;
            }
        }
        return D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * p8.D(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j9) {
            j9 j9Var = (j9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += p8.a(j9Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += p8.a(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * p8.D(i10));
    }

    public static rb a() {
        return f3745c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a0(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof da) {
            da daVar = (da) list;
            i10 = 0;
            while (i11 < size) {
                i10 += p8.b(daVar.a(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += p8.b(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static rb b() {
        return f3746d;
    }

    public static rb b0() {
        return f3744b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(Object obj, int i10, List list, l9 l9Var, Object obj2, rb rbVar) {
        Object obj3 = null;
        if (l9Var == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (l9Var.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj3 = d(obj, i10, intValue, obj3, rbVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!l9Var.a(intValue2)) {
                    obj3 = d(obj, i10, intValue2, obj3, rbVar);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    static Object d(Object obj, int i10, int i11, Object obj2, rb rbVar) {
        if (obj2 == null) {
            obj2 = rbVar.c(obj);
        }
        rbVar.f(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(v8 v8Var, Object obj, Object obj2) {
        v8Var.a(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(rb rbVar, Object obj, Object obj2) {
        rbVar.h(obj, rbVar.e(rbVar.d(obj), rbVar.d(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!i9.class.isAssignableFrom(cls) && (cls2 = f3743a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.q(i10, list, z10);
    }

    public static void i(int i10, List list, kc kcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.e(i10, list);
    }

    public static void j(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.t(i10, list, z10);
    }

    public static void k(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.G(i10, list, z10);
    }

    public static void l(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.x(i10, list, z10);
    }

    public static void m(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.f(i10, list, z10);
    }

    public static void n(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.z(i10, list, z10);
    }

    public static void o(int i10, List list, kc kcVar, za zaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((q8) kcVar).w(i10, list.get(i11), zaVar);
        }
    }

    public static void p(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.B(i10, list, z10);
    }

    public static void q(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.j(i10, list, z10);
    }

    public static void r(int i10, List list, kc kcVar, za zaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((q8) kcVar).E(i10, list.get(i11), zaVar);
        }
    }

    public static void s(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.s(i10, list, z10);
    }

    public static void t(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.d(i10, list, z10);
    }

    public static void u(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.i(i10, list, z10);
    }

    public static void v(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.D(i10, list, z10);
    }

    public static void w(int i10, List list, kc kcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.a(i10, list);
    }

    public static void x(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.v(i10, list, z10);
    }

    public static void y(int i10, List list, kc kcVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kcVar.m(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
