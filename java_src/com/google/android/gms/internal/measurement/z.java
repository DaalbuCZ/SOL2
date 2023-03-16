package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class z extends x {
    public z() {
        this.f4282a.add(n0.EQUALS);
        this.f4282a.add(n0.GREATER_THAN);
        this.f4282a.add(n0.GREATER_THAN_EQUALS);
        this.f4282a.add(n0.IDENTITY_EQUALS);
        this.f4282a.add(n0.IDENTITY_NOT_EQUALS);
        this.f4282a.add(n0.LESS_THAN);
        this.f4282a.add(n0.LESS_THAN_EQUALS);
        this.f4282a.add(n0.NOT_EQUALS);
    }

    private static boolean c(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            return qVar instanceof i ? (Double.isNaN(qVar.f().doubleValue()) || Double.isNaN(qVar2.f().doubleValue()) || qVar.f().doubleValue() != qVar2.f().doubleValue()) ? false : true : qVar instanceof u ? qVar.g().equals(qVar2.g()) : qVar instanceof g ? qVar.k().equals(qVar2.k()) : qVar == qVar2;
        } else if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        } else {
            boolean z10 = qVar instanceof i;
            if (z10 && (qVar2 instanceof u)) {
                return c(qVar, new i(qVar2.f()));
            }
            boolean z11 = qVar instanceof u;
            if ((!z11 || !(qVar2 instanceof i)) && !(qVar instanceof g)) {
                if (qVar2 instanceof g) {
                    return c(qVar, new i(qVar2.f()));
                }
                if ((z11 || z10) && (qVar2 instanceof m)) {
                    return c(qVar, new u(qVar2.g()));
                }
                if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof i))) {
                    return c(new u(qVar.g()), qVar2);
                }
                return false;
            }
            return c(new i(qVar.f()), qVar2);
        }
    }

    private static boolean d(q qVar, q qVar2) {
        int i10;
        if (qVar instanceof m) {
            qVar = new u(qVar.g());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.g());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.g().compareTo(qVar2.g()) < 0;
        }
        double doubleValue = qVar.f().doubleValue();
        double doubleValue2 = qVar2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i10 == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.g());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.g());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.f().doubleValue()) || Double.isNaN(qVar2.f().doubleValue()))) && !d(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        boolean c10;
        boolean c11;
        a6.h(a6.e(str).name(), 2, list);
        q b10 = z4Var.b((q) list.get(0));
        q b11 = z4Var.b((q) list.get(1));
        int ordinal = a6.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c11 = c(b10, b11);
            } else if (ordinal == 42) {
                c10 = d(b10, b11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        c10 = d(b11, b10);
                        break;
                    case 38:
                        c10 = e(b11, b10);
                        break;
                    case 39:
                        c10 = a6.l(b10, b11);
                        break;
                    case 40:
                        c11 = a6.l(b10, b11);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                c10 = e(b10, b11);
            }
            c10 = !c11;
        } else {
            c10 = c(b10, b11);
        }
        return c10 ? q.f4084h : q.f4085i;
    }
}
