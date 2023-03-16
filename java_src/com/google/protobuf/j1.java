package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f6003a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final o1<?, ?> f6004b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final o1<?, ?> f6005c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final o1<?, ?> f6006d = new q1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i10, List<Integer> list, a0.e eVar, UB ub, o1<UT, UB> o1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(i10, intValue, ub, o1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) L(i10, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (o1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t10, T t11) {
        u<FT> c10 = qVar.c(t11);
        if (c10.n()) {
            return;
        }
        qVar.d(t10).u(c10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(n0 n0Var, T t10, T t11, long j10) {
        s1.R(t10, j10, n0Var.a(s1.C(t10, j10), s1.C(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(o1<UT, UB> o1Var, T t10, T t11) {
        o1Var.p(t10, o1Var.k(o1Var.g(t10), o1Var.g(t11)));
    }

    public static o1<?, ?> H() {
        return f6004b;
    }

    public static o1<?, ?> I() {
        return f6005c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = f6003a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(int i10, int i11, UB ub, o1<UT, UB> o1Var) {
        if (ub == null) {
            ub = o1Var.n();
        }
        o1Var.e(ub, i10, i11);
        return ub;
    }

    public static o1<?, ?> M() {
        return f6006d;
    }

    public static void N(int i10, List<Boolean> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.v(i10, list, z10);
    }

    public static void O(int i10, List<h> list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.O(i10, list);
    }

    public static void P(int i10, List<Double> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.M(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.L(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.t(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.n(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.d(i10, list, z10);
    }

    public static void U(int i10, List<?> list, v1 v1Var, h1 h1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.b(i10, list, h1Var);
    }

    public static void V(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.c(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.K(i10, list, z10);
    }

    public static void X(int i10, List<?> list, v1 v1Var, h1 h1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.a(i10, list, h1Var);
    }

    public static void Y(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.o(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.s(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size) : size * k.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.H(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.z(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * k.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += k.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<String> list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.E(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int U = k.U(i10);
        return z10 ? U + k.C(e10) : e10 + (size * U);
    }

    public static void d0(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.y(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.l(zVar.u(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.u(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 4) : size * k.m(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 8) : size * k.o(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i10, List<s0> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.s(i10, list.get(i12), h1Var);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int U = k.U(i10);
        return z10 ? U + k.C(l10) : l10 + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.w(zVar.u(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? k.U(i10) + k.C(n10) : n10 + (list.size() * k.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.y(j0Var.x(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i10, Object obj, h1 h1Var) {
        return obj instanceof f0 ? k.A(i10, (f0) obj) : k.F(i10, (s0) obj, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10, List<?> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = k.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U += obj instanceof f0 ? k.B((f0) obj) : k.H((s0) obj, h1Var);
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int U = k.U(i10);
        return z10 ? U + k.C(r10) : r10 + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.P(zVar.u(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int U = k.U(i10);
        return z10 ? U + k.C(t10) : t10 + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.R(j0Var.x(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = k.U(i10) * size;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i11 < size) {
                Object z10 = h0Var.z(i11);
                U += z10 instanceof h ? k.h((h) z10) : k.T((String) z10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                U += obj instanceof h ? k.h((h) obj) : k.T((String) obj);
                i11++;
            }
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        int U = k.U(i10);
        return z10 ? U + k.C(w10) : w10 + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.W(zVar.u(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int U = k.U(i10);
        return z10 ? U + k.C(y10) : y10 + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.Y(j0Var.x(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i10, List<Integer> list, a0.d<?> dVar, UB ub, o1<UT, UB> o1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(i10, intValue, ub, o1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) L(i10, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
