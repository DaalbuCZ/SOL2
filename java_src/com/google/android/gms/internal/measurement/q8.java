package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
final class q8 implements kc {

    /* renamed from: a  reason: collision with root package name */
    private final p8 f4099a;

    private q8(p8 p8Var) {
        p9.f(p8Var, "output");
        this.f4099a = p8Var;
        p8Var.f4065a = this;
    }

    public static q8 K(p8 p8Var) {
        q8 q8Var = p8Var.f4065a;
        return q8Var != null ? q8Var : new q8(p8Var);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void A(int i10, h8 h8Var) {
        this.f4099a.j(i10, h8Var);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += p8.z(((Integer) list.get(i13)).intValue());
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void C(int i10, long j10) {
        this.f4099a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                p8 p8Var = this.f4099a;
                long longValue = ((Long) list.get(i11)).longValue();
                p8Var.v(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += p8.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            p8 p8Var2 = this.f4099a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            p8Var2.w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void E(int i10, Object obj, za zaVar) {
        oa oaVar = (oa) obj;
        m8 m8Var = (m8) this.f4099a;
        m8Var.u((i10 << 3) | 2);
        m8Var.u(((q7) oaVar).a(zaVar));
        zaVar.d(oaVar, m8Var.f4065a);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void F(int i10, int i11) {
        this.f4099a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += p8.z(((Integer) list.get(i13)).intValue());
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void H(int i10, long j10) {
        this.f4099a.v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    @Deprecated
    public final void I(int i10) {
        this.f4099a.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void J(int i10, int i11) {
        this.f4099a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void a(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof v9)) {
            while (i11 < list.size()) {
                this.f4099a.r(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        v9 v9Var = (v9) list;
        while (i11 < list.size()) {
            Object t10 = v9Var.t(i11);
            if (t10 instanceof String) {
                this.f4099a.r(i10, (String) t10);
            } else {
                this.f4099a.j(i10, (h8) t10);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void b(int i10, double d10) {
        this.f4099a.m(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void c(int i10, int i11) {
        this.f4099a.t(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void e(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f4099a.j(i10, (h8) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void g(int i10, int i11) {
        this.f4099a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void h(int i10, float f10) {
        this.f4099a.k(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                p8 p8Var = this.f4099a;
                int intValue = ((Integer) list.get(i11)).intValue();
                p8Var.t(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += p8.a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            p8 p8Var2 = this.f4099a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            p8Var2.u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void j(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += p8.b(((Long) list.get(i13)).longValue());
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void k(int i10, int i11) {
        this.f4099a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void l(int i10, boolean z10) {
        this.f4099a.i(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += p8.b(((Long) list.get(i13)).longValue());
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void n(int i10, int i11) {
        this.f4099a.t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void o(int i10, String str) {
        this.f4099a.r(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void p(int i10, long j10) {
        this.f4099a.v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.i(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.h(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void r(int i10, long j10) {
        this.f4099a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.m(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.n(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void u(int i10, long j10) {
        this.f4099a.v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.t(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += p8.a(((Integer) list.get(i13)).intValue());
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.u(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void w(int i10, Object obj, za zaVar) {
        p8 p8Var = this.f4099a;
        p8Var.s(i10, 3);
        zaVar.d((oa) obj, p8Var.f4065a);
        p8Var.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kc
    @Deprecated
    public final void y(int i10) {
        this.f4099a.s(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4099a.k(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f4099a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f4099a.u(i12);
        while (i11 < list.size()) {
            this.f4099a.l(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }
}
