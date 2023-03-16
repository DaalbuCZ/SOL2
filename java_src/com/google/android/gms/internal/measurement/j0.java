package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class j0 extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public j0() {
        this.f4282a.add(n0.FOR_IN);
        this.f4282a.add(n0.FOR_IN_CONST);
        this.f4282a.add(n0.FOR_IN_LET);
        this.f4282a.add(n0.FOR_LET);
        this.f4282a.add(n0.FOR_OF);
        this.f4282a.add(n0.FOR_OF_CONST);
        this.f4282a.add(n0.FOR_OF_LET);
        this.f4282a.add(n0.WHILE);
    }

    private static q c(h0 h0Var, Iterator it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q c10 = h0Var.a((q) it.next()).c((f) qVar);
                if (c10 instanceof h) {
                    h hVar = (h) c10;
                    if ("break".equals(hVar.b())) {
                        return q.f4079c;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
        }
        return q.f4079c;
    }

    private static q d(h0 h0Var, q qVar, q qVar2) {
        return c(h0Var, qVar.h(), qVar2);
    }

    private static q e(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        n0 n0Var = n0.ADD;
        int ordinal = a6.e(str).ordinal();
        if (ordinal == 65) {
            a6.h(n0.WHILE.name(), 4, list);
            q qVar = (q) list.get(0);
            q qVar2 = (q) list.get(1);
            q b10 = z4Var.b((q) list.get(3));
            if (z4Var.b((q) list.get(2)).k().booleanValue()) {
                q c10 = z4Var.c((f) b10);
                if (c10 instanceof h) {
                    h hVar = (h) c10;
                    if (!"break".equals(hVar.b())) {
                        if ("return".equals(hVar.b())) {
                            return hVar;
                        }
                    }
                    return q.f4079c;
                }
            }
            while (z4Var.b(qVar).k().booleanValue()) {
                q c11 = z4Var.c((f) b10);
                if (c11 instanceof h) {
                    h hVar2 = (h) c11;
                    if ("break".equals(hVar2.b())) {
                        break;
                    } else if ("return".equals(hVar2.b())) {
                        return hVar2;
                    }
                }
                z4Var.b(qVar2);
            }
            return q.f4079c;
        }
        switch (ordinal) {
            case 26:
                a6.h(n0.FOR_IN.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return d(new i0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 27:
                a6.h(n0.FOR_IN_CONST.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return d(new f0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 28:
                a6.h(n0.FOR_IN_LET.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return d(new g0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case c.j.f3101z3 /* 29 */:
                a6.h(n0.FOR_LET.name(), 4, list);
                q b11 = z4Var.b((q) list.get(0));
                if (b11 instanceof f) {
                    f fVar = (f) b11;
                    q qVar3 = (q) list.get(1);
                    q qVar4 = (q) list.get(2);
                    q b12 = z4Var.b((q) list.get(3));
                    z4 a10 = z4Var.a();
                    for (int i10 = 0; i10 < fVar.D(); i10++) {
                        String g10 = fVar.E(i10).g();
                        a10.g(g10, z4Var.d(g10));
                    }
                    while (z4Var.b(qVar3).k().booleanValue()) {
                        q c12 = z4Var.c((f) b12);
                        if (c12 instanceof h) {
                            h hVar3 = (h) c12;
                            if ("break".equals(hVar3.b())) {
                                return q.f4079c;
                            }
                            if ("return".equals(hVar3.b())) {
                                return hVar3;
                            }
                        }
                        z4 a11 = z4Var.a();
                        for (int i11 = 0; i11 < fVar.D(); i11++) {
                            String g11 = fVar.E(i11).g();
                            a11.g(g11, a10.d(g11));
                        }
                        a11.b(qVar4);
                        a10 = a11;
                    }
                    return q.f4079c;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 30:
                a6.h(n0.FOR_OF.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return e(new i0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 31:
                a6.h(n0.FOR_OF_CONST.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return e(new f0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 32:
                a6.h(n0.FOR_OF_LET.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return e(new g0(z4Var, ((q) list.get(0)).g()), z4Var.b((q) list.get(1)), z4Var.b((q) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            default:
                return super.b(str);
        }
    }
}
