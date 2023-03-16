package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.dd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u9 extends t9 {

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.r3 f5098g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f5099h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(b bVar, String str, int i10, com.google.android.gms.internal.measurement.r3 r3Var) {
        super(str, i10);
        this.f5099h = bVar;
        this.f5098g = r3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.t9
    public final int a() {
        return this.f5098g.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.t9
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.t9
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.m5 m5Var, boolean z10) {
        d3 w10;
        String f10;
        String str;
        Boolean f11;
        dd.c();
        boolean B = this.f5099h.f4438a.z().B(this.f5029a, u2.W);
        boolean K = this.f5098g.K();
        boolean L = this.f5098g.L();
        boolean M = this.f5098g.M();
        Object[] objArr = (K || L || M) ? 1 : null;
        Boolean bool = null;
        bool = null;
        if (z10 && objArr == null) {
            this.f5099h.f4438a.d().v().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f5030b), this.f5098g.N() ? Integer.valueOf(this.f5098g.E()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.k3 F = this.f5098g.F();
        boolean K2 = F.K();
        if (m5Var.U()) {
            if (F.M()) {
                f11 = t9.h(m5Var.F(), F.G());
                bool = t9.j(f11, K2);
            } else {
                w10 = this.f5099h.f4438a.d().w();
                f10 = this.f5099h.f4438a.D().f(m5Var.J());
                str = "No number filter for long property. property";
                w10.b(str, f10);
            }
        } else if (!m5Var.T()) {
            if (m5Var.W()) {
                if (F.O()) {
                    f11 = t9.f(m5Var.K(), F.H(), this.f5099h.f4438a.d());
                } else if (!F.M()) {
                    w10 = this.f5099h.f4438a.d().w();
                    f10 = this.f5099h.f4438a.D().f(m5Var.J());
                    str = "No string or number filter defined. property";
                } else if (c9.N(m5Var.K())) {
                    f11 = t9.i(m5Var.K(), F.G());
                } else {
                    this.f5099h.f4438a.d().w().c("Invalid user property value for Numeric number filter. property, value", this.f5099h.f4438a.D().f(m5Var.J()), m5Var.K());
                }
                bool = t9.j(f11, K2);
            } else {
                w10 = this.f5099h.f4438a.d().w();
                f10 = this.f5099h.f4438a.D().f(m5Var.J());
                str = "User property has no value, property";
            }
            w10.b(str, f10);
        } else if (F.M()) {
            f11 = t9.g(m5Var.E(), F.G());
            bool = t9.j(f11, K2);
        } else {
            w10 = this.f5099h.f4438a.d().w();
            f10 = this.f5099h.f4438a.D().f(m5Var.J());
            str = "No number filter for double property. property";
            w10.b(str, f10);
        }
        this.f5099h.f4438a.d().v().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f5031c = Boolean.TRUE;
        if (!M || bool.booleanValue()) {
            if (!z10 || this.f5098g.K()) {
                this.f5032d = bool;
            }
            if (bool.booleanValue() && objArr != null && m5Var.V()) {
                long G = m5Var.G();
                if (l10 != null) {
                    G = l10.longValue();
                }
                if (B && this.f5098g.K() && !this.f5098g.L() && l11 != null) {
                    G = l11.longValue();
                }
                if (this.f5098g.L()) {
                    this.f5034f = Long.valueOf(G);
                } else {
                    this.f5033e = Long.valueOf(G);
                }
            }
            return true;
        }
        return true;
    }
}
