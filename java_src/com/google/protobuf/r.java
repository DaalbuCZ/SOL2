package com.google.protobuf;

import com.google.protobuf.u1;
import com.google.protobuf.y;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class r extends q<y.d> {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6075a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f6075a = iArr;
            try {
                iArr[u1.b.f6119p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6075a[u1.b.f6120q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6075a[u1.b.f6121r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6075a[u1.b.f6122s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6075a[u1.b.f6123t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6075a[u1.b.f6124u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6075a[u1.b.f6125v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6075a[u1.b.f6126w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6075a[u1.b.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6075a[u1.b.D.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6075a[u1.b.E.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6075a[u1.b.F.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6075a[u1.b.G.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6075a[u1.b.C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6075a[u1.b.A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6075a[u1.b.f6127x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6075a[u1.b.f6128y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6075a[u1.b.f6129z.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public Object b(p pVar, s0 s0Var, int i10) {
        return pVar.a(s0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public u<y.d> d(Object obj) {
        return ((y.c) obj).R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public boolean e(s0 s0Var) {
        return s0Var instanceof y.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public void f(Object obj) {
        c(obj).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    @Override // com.google.protobuf.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <UT, UB> UB g(com.google.protobuf.g1 r5, java.lang.Object r6, com.google.protobuf.p r7, com.google.protobuf.u<com.google.protobuf.y.d> r8, UB r9, com.google.protobuf.o1<UT, UB> r10) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r.g(com.google.protobuf.g1, java.lang.Object, com.google.protobuf.p, com.google.protobuf.u, java.lang.Object, com.google.protobuf.o1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public void h(g1 g1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.f6224b, g1Var.m(eVar.b().getClass(), pVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        s0 o10 = eVar.b().m().o();
        e Q = e.Q(ByteBuffer.wrap(hVar.J()), true);
        d1.a().b(o10, Q, pVar);
        uVar.x(eVar.f6224b, o10);
        if (Q.t() != Integer.MAX_VALUE) {
            throw c0.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.q
    public void j(v1 v1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f6075a[dVar.i().ordinal()]) {
                case 1:
                    v1Var.q(dVar.d(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    v1Var.D(dVar.d(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    v1Var.e(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    v1Var.I(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    v1Var.m(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    v1Var.A(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    v1Var.p(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    v1Var.f(dVar.d(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    v1Var.g(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    v1Var.j(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    v1Var.r(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    v1Var.N(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    v1Var.C(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    v1Var.l(dVar.d(), (h) entry.getValue());
                    return;
                case 16:
                    v1Var.G(dVar.d(), (String) entry.getValue());
                    return;
                case 17:
                    v1Var.i(dVar.d(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    v1Var.w(dVar.d(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f6075a[dVar.i().ordinal()]) {
            case 1:
                j1.P(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 2:
                j1.T(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 3:
                j1.W(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 4:
                j1.e0(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 5:
            case 14:
                j1.V(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 6:
                j1.S(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 7:
                j1.R(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 8:
                j1.N(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 9:
                j1.d0(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 10:
                j1.Y(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 11:
                j1.Z(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 12:
                j1.a0(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 13:
                j1.b0(dVar.d(), (List) entry.getValue(), v1Var, dVar.o());
                return;
            case 15:
                j1.O(dVar.d(), (List) entry.getValue(), v1Var);
                return;
            case 16:
                j1.c0(dVar.d(), (List) entry.getValue(), v1Var);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                j1.U(dVar.d(), (List) entry.getValue(), v1Var, d1.a().d(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                j1.X(dVar.d(), (List) entry.getValue(), v1Var, d1.a().d(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
