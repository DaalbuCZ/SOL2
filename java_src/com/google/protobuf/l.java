package com.google.protobuf;

import com.google.protobuf.l0;
import com.google.protobuf.u1;
import com.google.protobuf.v1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final k f6039a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6040a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f6040a = iArr;
            try {
                iArr[u1.b.f6126w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6040a[u1.b.f6125v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6040a[u1.b.f6123t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6040a[u1.b.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6040a[u1.b.F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6040a[u1.b.B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6040a[u1.b.f6124u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6040a[u1.b.f6121r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6040a[u1.b.E.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6040a[u1.b.G.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6040a[u1.b.f6122s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6040a[u1.b.f6127x.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l(k kVar) {
        k kVar2 = (k) a0.b(kVar, "output");
        this.f6039a = kVar2;
        kVar2.f6009a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f6009a;
        return lVar != null ? lVar : new l(kVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, l0.a<Boolean, V> aVar) {
        this.f6039a.T0(i10, 2);
        this.f6039a.V0(l0.b(aVar, Boolean.valueOf(z10), v10));
        l0.e(this.f6039a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, l0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer num : map.keySet()) {
            iArr[i11] = num.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f6039a.T0(i10, 2);
            this.f6039a.V0(l0.b(aVar, Integer.valueOf(i13), v10));
            l0.e(this.f6039a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, l0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long l10 : map.keySet()) {
            jArr[i11] = l10.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f6039a.T0(i10, 2);
            this.f6039a.V0(l0.b(aVar, Long.valueOf(j10), v10));
            l0.e(this.f6039a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f6040a[aVar.f6044a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f6044a);
        }
    }

    private <V> void U(int i10, l0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f6039a.T0(i10, 2);
            this.f6039a.V0(l0.b(aVar, str2, v10));
            l0.e(this.f6039a, aVar, str2, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f6039a.R0(i10, (String) obj);
        } else {
            this.f6039a.l0(i10, (h) obj);
        }
    }

    @Override // com.google.protobuf.v1
    public void A(int i10, long j10) {
        this.f6039a.t0(i10, j10);
    }

    @Override // com.google.protobuf.v1
    public v1.a B() {
        return v1.a.ASCENDING;
    }

    @Override // com.google.protobuf.v1
    public void C(int i10, long j10) {
        this.f6039a.P0(i10, j10);
    }

    @Override // com.google.protobuf.v1
    public void D(int i10, float f10) {
        this.f6039a.v0(i10, f10);
    }

    @Override // com.google.protobuf.v1
    public void E(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof h0)) {
            while (i11 < list.size()) {
                this.f6039a.R0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        while (i11 < list.size()) {
            V(i10, h0Var.z(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void F(int i10) {
        this.f6039a.T0(i10, 4);
    }

    @Override // com.google.protobuf.v1
    public void G(int i10, String str) {
        this.f6039a.R0(i10, str);
    }

    @Override // com.google.protobuf.v1
    public void H(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.N0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.P(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.O0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void I(int i10, long j10) {
        this.f6039a.W0(i10, j10);
    }

    @Override // com.google.protobuf.v1
    public void J(int i10, int i11) {
        this.f6039a.p0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public void K(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.D0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.y(list.get(i13).longValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.E0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void L(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.p0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.l(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void M(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.n0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.j(list.get(i13).doubleValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.o0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void N(int i10, int i11) {
        this.f6039a.N0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public void O(int i10, List<h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f6039a.l0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.v1
    public void a(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            w(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.protobuf.v1
    public void b(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            i(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.protobuf.v1
    public void c(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.B0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.w(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.C0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void d(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.v0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.r(list.get(i13).floatValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.w0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void e(int i10, long j10) {
        this.f6039a.D0(i10, j10);
    }

    @Override // com.google.protobuf.v1
    public void f(int i10, boolean z10) {
        this.f6039a.h0(i10, z10);
    }

    @Override // com.google.protobuf.v1
    public void g(int i10, int i11) {
        this.f6039a.U0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public final void h(int i10, Object obj) {
        if (obj instanceof h) {
            this.f6039a.I0(i10, (h) obj);
        } else {
            this.f6039a.H0(i10, (s0) obj);
        }
    }

    @Override // com.google.protobuf.v1
    public void i(int i10, Object obj, h1 h1Var) {
        this.f6039a.y0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.protobuf.v1
    public void j(int i10, int i11) {
        this.f6039a.J0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public void k(int i10) {
        this.f6039a.T0(i10, 3);
    }

    @Override // com.google.protobuf.v1
    public void l(int i10, h hVar) {
        this.f6039a.l0(i10, hVar);
    }

    @Override // com.google.protobuf.v1
    public void m(int i10, int i11) {
        this.f6039a.B0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public void n(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.t0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.p(list.get(i13).longValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.u0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void o(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.J0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.L(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.K0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void p(int i10, int i11) {
        this.f6039a.r0(i10, i11);
    }

    @Override // com.google.protobuf.v1
    public void q(int i10, double d10) {
        this.f6039a.n0(i10, d10);
    }

    @Override // com.google.protobuf.v1
    public void r(int i10, long j10) {
        this.f6039a.L0(i10, j10);
    }

    @Override // com.google.protobuf.v1
    public void s(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.L0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.N(list.get(i13).longValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.M0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void t(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.n(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.s0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void u(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.W0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.Y(list.get(i13).longValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.X0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void v(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.h0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.e(list.get(i13).booleanValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.i0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void w(int i10, Object obj, h1 h1Var) {
        this.f6039a.F0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.protobuf.v1
    public <K, V> void x(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.f6039a.c0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f6039a.T0(i10, 2);
            this.f6039a.V0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.e(this.f6039a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.v1
    public void y(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.U0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.W(list.get(i13).intValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.V0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.v1
    public void z(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6039a.P0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6039a.T0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.R(list.get(i13).longValue());
        }
        this.f6039a.V0(i12);
        while (i11 < list.size()) {
            this.f6039a.Q0(list.get(i11).longValue());
            i11++;
        }
    }
}
