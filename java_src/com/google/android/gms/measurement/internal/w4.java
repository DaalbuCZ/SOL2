package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.je;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class w4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f5152a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5153b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b5 f5154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(b5 b5Var, v vVar, String str) {
        this.f5154c = b5Var;
        this.f5152a = vVar;
        this.f5153b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        byte[] bArr;
        f9 f9Var;
        m5 m5Var;
        com.google.android.gms.internal.measurement.a5 a5Var;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.c5 c5Var;
        String str2;
        r c10;
        long j10;
        String str3;
        a9Var = this.f5154c.f4418a;
        a9Var.a();
        a9Var2 = this.f5154c.f4418a;
        n6 d02 = a9Var2.d0();
        v vVar = this.f5152a;
        String str4 = this.f5153b;
        d02.h();
        j4.t();
        z3.o.i(vVar);
        z3.o.e(str4);
        if (!d02.f4438a.z().B(str4, u2.U)) {
            d02.f4438a.d().q().b("Generating ScionPayload disabled. packageName", str4);
            return new byte[0];
        } else if (!"_iap".equals(vVar.f5100n) && !"_iapx".equals(vVar.f5100n)) {
            d02.f4438a.d().q().c("Generating a payload for this event is not available. package_name, event_name", str4, vVar.f5100n);
            return null;
        } else {
            com.google.android.gms.internal.measurement.a5 E = com.google.android.gms.internal.measurement.b5.E();
            d02.f4898b.W().e0();
            try {
                m5 R = d02.f4898b.W().R(str4);
                if (R == null) {
                    d02.f4438a.d().q().b("Log and bundle not available. package_name", str4);
                } else if (R.J()) {
                    com.google.android.gms.internal.measurement.c5 P1 = com.google.android.gms.internal.measurement.d5.P1();
                    P1.c0(1);
                    P1.X("android");
                    if (!TextUtils.isEmpty(R.d0())) {
                        P1.A(R.d0());
                    }
                    if (!TextUtils.isEmpty(R.f0())) {
                        P1.D((String) z3.o.i(R.f0()));
                    }
                    if (!TextUtils.isEmpty(R.g0())) {
                        P1.E((String) z3.o.i(R.g0()));
                    }
                    if (R.L() != -2147483648L) {
                        P1.F((int) R.L());
                    }
                    P1.T(R.W());
                    P1.N(R.U());
                    String i02 = R.i0();
                    String b02 = R.b0();
                    if (!TextUtils.isEmpty(i02)) {
                        P1.S(i02);
                    } else if (!TextUtils.isEmpty(b02)) {
                        P1.z(b02);
                    }
                    p4.b V = d02.f4898b.V(str4);
                    P1.K(R.T());
                    if (d02.f4438a.o() && d02.f4438a.z().C(P1.o0()) && V.i(p4.a.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        P1.M(null);
                    }
                    P1.J(V.h());
                    if (V.i(p4.a.AD_STORAGE) && R.I()) {
                        Pair n10 = d02.f4898b.e0().n(R.d0(), V);
                        if (R.I() && !TextUtils.isEmpty((CharSequence) n10.first)) {
                            try {
                                P1.d0(n6.a((String) n10.first, Long.toString(vVar.f5103q)));
                                Object obj = n10.second;
                                if (obj != null) {
                                    P1.V(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                d02.f4438a.d().q().b("Resettable device id encryption failed", e10.getMessage());
                            }
                        }
                    }
                    d02.f4438a.A().k();
                    P1.L(Build.MODEL);
                    d02.f4438a.A().k();
                    P1.W(Build.VERSION.RELEASE);
                    P1.i0((int) d02.f4438a.A().p());
                    P1.m0(d02.f4438a.A().q());
                    try {
                        if (V.i(p4.a.ANALYTICS_STORAGE) && R.e0() != null) {
                            P1.C(n6.a((String) z3.o.i(R.e0()), Long.toString(vVar.f5103q)));
                        }
                        if (!TextUtils.isEmpty(R.h0())) {
                            P1.R((String) z3.o.i(R.h0()));
                        }
                        String d03 = R.d0();
                        List c02 = d02.f4898b.W().c0(d03);
                        Iterator it = c02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                f9Var = null;
                                break;
                            }
                            f9Var = (f9) it.next();
                            if ("_lte".equals(f9Var.f4540c)) {
                                break;
                            }
                        }
                        if (f9Var == null || f9Var.f4542e == null) {
                            f9 f9Var2 = new f9(d03, "auto", "_lte", d02.f4438a.e().a(), 0L);
                            c02.add(f9Var2);
                            d02.f4898b.W().x(f9Var2);
                        }
                        c9 g02 = d02.f4898b.g0();
                        g02.f4438a.d().v().a("Checking account type status for ad personalization signals");
                        if (g02.f4438a.A().s()) {
                            String d04 = R.d0();
                            z3.o.i(d04);
                            if (R.I() && g02.f4898b.a0().B(d04)) {
                                g02.f4438a.d().q().a("Turning off ad personalization due to account type");
                                Iterator it2 = c02.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((f9) it2.next()).f4540c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                c02.add(new f9(d04, "auto", "_npa", g02.f4438a.e().a(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.m5[] m5VarArr = new com.google.android.gms.internal.measurement.m5[c02.size()];
                        for (int i10 = 0; i10 < c02.size(); i10++) {
                            com.google.android.gms.internal.measurement.l5 H = com.google.android.gms.internal.measurement.m5.H();
                            H.D(((f9) c02.get(i10)).f4540c);
                            H.E(((f9) c02.get(i10)).f4541d);
                            d02.f4898b.g0().K(H, ((f9) c02.get(i10)).f4542e);
                            m5VarArr[i10] = (com.google.android.gms.internal.measurement.m5) H.q();
                        }
                        P1.B0(Arrays.asList(m5VarArr));
                        g3 b10 = g3.b(vVar);
                        d02.f4438a.N().z(b10.f4549d, d02.f4898b.W().Q(str4));
                        d02.f4438a.N().A(b10, d02.f4438a.z().n(str4));
                        Bundle bundle2 = b10.f4549d;
                        bundle2.putLong("_c", 1L);
                        d02.f4438a.d().q().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", vVar.f5102p);
                        if (d02.f4438a.N().T(P1.o0())) {
                            d02.f4438a.N().C(bundle2, "_dbg", 1L);
                            d02.f4438a.N().C(bundle2, "_r", 1L);
                        }
                        r V2 = d02.f4898b.W().V(str4, vVar.f5100n);
                        if (V2 == null) {
                            c5Var = P1;
                            m5Var = R;
                            a5Var = E;
                            str = str4;
                            bundle = bundle2;
                            str2 = null;
                            c10 = new r(str4, vVar.f5100n, 0L, 0L, 0L, vVar.f5103q, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            m5Var = R;
                            a5Var = E;
                            str = str4;
                            bundle = bundle2;
                            c5Var = P1;
                            str2 = null;
                            long j11 = V2.f4941f;
                            c10 = V2.c(vVar.f5103q);
                            j10 = j11;
                        }
                        d02.f4898b.W().q(c10);
                        q qVar = new q(d02.f4438a, vVar.f5102p, str, vVar.f5100n, vVar.f5103q, j10, bundle);
                        com.google.android.gms.internal.measurement.r4 I = com.google.android.gms.internal.measurement.s4.I();
                        I.K(qVar.f4903d);
                        I.G(qVar.f4901b);
                        I.J(qVar.f4904e);
                        s sVar = new s(qVar.f4905f);
                        while (sVar.hasNext()) {
                            String next = sVar.next();
                            com.google.android.gms.internal.measurement.v4 I2 = com.google.android.gms.internal.measurement.w4.I();
                            I2.H(next);
                            Object D = qVar.f4905f.D(next);
                            if (D != null) {
                                d02.f4898b.g0().J(I2, D);
                                I.C(I2);
                            }
                        }
                        com.google.android.gms.internal.measurement.c5 c5Var2 = c5Var;
                        c5Var2.C0(I);
                        com.google.android.gms.internal.measurement.e5 E2 = com.google.android.gms.internal.measurement.g5.E();
                        com.google.android.gms.internal.measurement.t4 E3 = com.google.android.gms.internal.measurement.u4.E();
                        E3.w(c10.f4938c);
                        E3.x(vVar.f5100n);
                        E2.w(E3);
                        c5Var2.Z(E2);
                        c5Var2.x0(d02.f4898b.T().m(m5Var.d0(), Collections.emptyList(), c5Var2.s0(), Long.valueOf(I.z()), Long.valueOf(I.z())));
                        if (I.O()) {
                            c5Var2.h0(I.z());
                            c5Var2.O(I.z());
                        }
                        long X = m5Var.X();
                        int i11 = (X > 0L ? 1 : (X == 0L ? 0 : -1));
                        if (i11 != 0) {
                            c5Var2.a0(X);
                        }
                        long Z = m5Var.Z();
                        if (Z != 0) {
                            c5Var2.b0(Z);
                        } else if (i11 != 0) {
                            c5Var2.b0(X);
                        }
                        String b11 = m5Var.b();
                        je.c();
                        if (d02.f4438a.z().B(str2, u2.f5064n0)) {
                            str3 = str;
                            if (d02.f4438a.z().B(str3, u2.f5068p0) && b11 != null) {
                                c5Var2.g0(b11);
                            }
                        } else {
                            str3 = str;
                        }
                        m5Var.e();
                        c5Var2.G((int) m5Var.Y());
                        d02.f4438a.z().q();
                        c5Var2.k0(74029L);
                        c5Var2.j0(d02.f4438a.e().a());
                        c5Var2.f0(true);
                        if (d02.f4438a.z().B(str2, u2.f5076t0)) {
                            d02.f4898b.h(c5Var2.o0(), c5Var2);
                        }
                        com.google.android.gms.internal.measurement.a5 a5Var2 = a5Var;
                        a5Var2.w(c5Var2);
                        m5 m5Var2 = m5Var;
                        m5Var2.C(c5Var2.v0());
                        m5Var2.z(c5Var2.u0());
                        d02.f4898b.W().p(m5Var2);
                        d02.f4898b.W().o();
                        try {
                            return d02.f4898b.g0().O(((com.google.android.gms.internal.measurement.b5) a5Var2.q()).i());
                        } catch (IOException e11) {
                            d02.f4438a.d().r().c("Data loss. Failed to bundle and serialize. appId", f3.z(str3), e11);
                            return str2;
                        }
                    } catch (SecurityException e12) {
                        d02.f4438a.d().q().b("app instance id encryption failed", e12.getMessage());
                        bArr = new byte[0];
                    }
                } else {
                    d02.f4438a.d().q().b("Log and bundle disabled. package_name", str4);
                }
                bArr = new byte[0];
                return bArr;
            } finally {
                d02.f4898b.W().f0();
            }
        }
    }
}
