package com.google.protobuf;

import com.google.protobuf.e0;
import com.google.protobuf.u;
import com.google.protobuf.u1;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class w0<T> implements h1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f6209a;

    /* renamed from: b  reason: collision with root package name */
    private final o1<?, ?> f6210b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6211c;

    /* renamed from: d  reason: collision with root package name */
    private final q<?> f6212d;

    private w0(o1<?, ?> o1Var, q<?> qVar, s0 s0Var) {
        this.f6210b = o1Var;
        this.f6211c = qVar.e(s0Var);
        this.f6212d = qVar;
        this.f6209a = s0Var;
    }

    private <UT, UB> int j(o1<UT, UB> o1Var, T t10) {
        return o1Var.i(o1Var.g(t10));
    }

    private <UT, UB, ET extends u.b<ET>> void k(o1<UT, UB> o1Var, q<ET> qVar, T t10, g1 g1Var, p pVar) {
        UB f10 = o1Var.f(t10);
        u<ET> d10 = qVar.d(t10);
        do {
            try {
                if (g1Var.t() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                o1Var.o(t10, f10);
            }
        } while (m(g1Var, pVar, qVar, d10, o1Var, f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> w0<T> l(o1<?, ?> o1Var, q<?> qVar, s0 s0Var) {
        return new w0<>(o1Var, qVar, s0Var);
    }

    private <UT, UB, ET extends u.b<ET>> boolean m(g1 g1Var, p pVar, q<ET> qVar, u<ET> uVar, o1<UT, UB> o1Var, UB ub) {
        int c10 = g1Var.c();
        if (c10 != u1.f6115a) {
            if (u1.b(c10) == 2) {
                Object b10 = qVar.b(pVar, this.f6209a, u1.a(c10));
                if (b10 != null) {
                    qVar.h(g1Var, b10, pVar, uVar);
                    return true;
                }
                return o1Var.m(ub, g1Var);
            }
            return g1Var.F();
        }
        int i10 = 0;
        Object obj = null;
        h hVar = null;
        while (g1Var.t() != Integer.MAX_VALUE) {
            int c11 = g1Var.c();
            if (c11 == u1.f6117c) {
                i10 = g1Var.D();
                obj = qVar.b(pVar, this.f6209a, i10);
            } else if (c11 == u1.f6118d) {
                if (obj != null) {
                    qVar.h(g1Var, obj, pVar, uVar);
                } else {
                    hVar = g1Var.B();
                }
            } else if (!g1Var.F()) {
                break;
            }
        }
        if (g1Var.c() == u1.f6116b) {
            if (hVar != null) {
                if (obj != null) {
                    qVar.i(hVar, obj, pVar, uVar);
                } else {
                    o1Var.d(ub, i10, hVar);
                }
            }
            return true;
        }
        throw c0.b();
    }

    private <UT, UB> void n(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.s(o1Var.g(t10), v1Var);
    }

    @Override // com.google.protobuf.h1
    public void a(T t10, T t11) {
        j1.G(this.f6210b, t10, t11);
        if (this.f6211c) {
            j1.E(this.f6212d, t10, t11);
        }
    }

    @Override // com.google.protobuf.h1
    public void b(T t10, v1 v1Var) {
        Iterator<Map.Entry<?, Object>> s10 = this.f6212d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry<?, Object> next = s10.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.n() != u1.c.MESSAGE || bVar.f() || bVar.o()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.h(bVar.d(), next instanceof e0.b ? ((e0.b) next).a().e() : next.getValue());
        }
        n(this.f6210b, t10, v1Var);
    }

    @Override // com.google.protobuf.h1
    public void c(T t10) {
        this.f6210b.j(t10);
        this.f6212d.f(t10);
    }

    @Override // com.google.protobuf.h1
    public final boolean d(T t10) {
        return this.f6212d.c(t10).p();
    }

    @Override // com.google.protobuf.h1
    public void e(T t10, g1 g1Var, p pVar) {
        k(this.f6210b, this.f6212d, t10, g1Var, pVar);
    }

    @Override // com.google.protobuf.h1
    public boolean f(T t10, T t11) {
        if (this.f6210b.g(t10).equals(this.f6210b.g(t11))) {
            if (this.f6211c) {
                return this.f6212d.c(t10).equals(this.f6212d.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.h1
    public int g(T t10) {
        int j10 = j(this.f6210b, t10) + 0;
        return this.f6211c ? j10 + this.f6212d.c(t10).j() : j10;
    }

    @Override // com.google.protobuf.h1
    public T h() {
        return (T) this.f6209a.m().o();
    }

    @Override // com.google.protobuf.h1
    public int i(T t10) {
        int hashCode = this.f6210b.g(t10).hashCode();
        return this.f6211c ? (hashCode * 53) + this.f6212d.c(t10).hashCode() : hashCode;
    }
}
