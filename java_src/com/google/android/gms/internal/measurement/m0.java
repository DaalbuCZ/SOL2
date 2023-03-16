package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class m0 extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public m0() {
        this.f4282a.add(n0.ASSIGN);
        this.f4282a.add(n0.CONST);
        this.f4282a.add(n0.CREATE_ARRAY);
        this.f4282a.add(n0.CREATE_OBJECT);
        this.f4282a.add(n0.EXPRESSION_LIST);
        this.f4282a.add(n0.GET);
        this.f4282a.add(n0.GET_INDEX);
        this.f4282a.add(n0.GET_PROPERTY);
        this.f4282a.add(n0.NULL);
        this.f4282a.add(n0.SET_PROPERTY);
        this.f4282a.add(n0.TYPEOF);
        this.f4282a.add(n0.UNDEFINED);
        this.f4282a.add(n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        String str2;
        n0 n0Var = n0.ADD;
        int ordinal = a6.e(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            a6.h(n0.ASSIGN.name(), 2, list);
            q b10 = z4Var.b((q) list.get(0));
            if (b10 instanceof u) {
                if (z4Var.h(b10.g())) {
                    q b11 = z4Var.b((q) list.get(1));
                    z4Var.g(b10.g(), b11);
                    return b11;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b10.g()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b10.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            a6.i(n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                    q b12 = z4Var.b((q) list.get(i11));
                    if (!(b12 instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                    }
                    z4Var.f(b12.g(), z4Var.b((q) list.get(i11 + 1)));
                }
                return q.f4079c;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            a6.i(n0.EXPRESSION_LIST.name(), 1, list);
            q qVar = q.f4079c;
            while (i10 < list.size()) {
                qVar = z4Var.b((q) list.get(i10));
                if (qVar instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return qVar;
        } else if (ordinal == 33) {
            a6.h(n0.GET.name(), 1, list);
            q b13 = z4Var.b((q) list.get(0));
            if (b13 instanceof u) {
                return z4Var.d(b13.g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b13.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            a6.h(n0.NULL.name(), 0, list);
            return q.f4080d;
        } else if (ordinal == 58) {
            a6.h(n0.SET_PROPERTY.name(), 3, list);
            q b14 = z4Var.b((q) list.get(0));
            q b15 = z4Var.b((q) list.get(1));
            q b16 = z4Var.b((q) list.get(2));
            if (b14 == q.f4079c || b14 == q.f4080d) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b15.g(), b14.g()));
            }
            if ((b14 instanceof f) && (b15 instanceof i)) {
                ((f) b14).L(b15.f().intValue(), b16);
            } else if (b14 instanceof m) {
                ((m) b14).v(b15.g(), b16);
            }
            return b16;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q b17 = z4Var.b((q) it.next());
                if (b17 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.L(i10, b17);
                i10++;
            }
            return fVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 == 0) {
                n nVar = new n();
                while (i10 < list.size() - 1) {
                    q b18 = z4Var.b((q) list.get(i10));
                    q b19 = z4Var.b((q) list.get(i10 + 1));
                    if ((b18 instanceof h) || (b19 instanceof h)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    nVar.v(b18.g(), b19);
                    i10 += 2;
                }
                return nVar;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 35 || ordinal == 36) {
            a6.h(n0.GET_PROPERTY.name(), 2, list);
            q b20 = z4Var.b((q) list.get(0));
            q b21 = z4Var.b((q) list.get(1));
            if ((b20 instanceof f) && a6.k(b21)) {
                return ((f) b20).E(b21.f().intValue());
            }
            if (b20 instanceof m) {
                return ((m) b20).s(b21.g());
            }
            if (b20 instanceof u) {
                if ("length".equals(b21.g())) {
                    return new i(Double.valueOf(b20.g().length()));
                }
                if (a6.k(b21) && b21.f().doubleValue() < b20.g().length()) {
                    return new u(String.valueOf(b20.g().charAt(b21.f().intValue())));
                }
            }
            return q.f4079c;
        } else {
            switch (ordinal) {
                case 62:
                    a6.h(n0.TYPEOF.name(), 1, list);
                    q b22 = z4Var.b((q) list.get(0));
                    if (b22 instanceof v) {
                        str2 = "undefined";
                    } else if (b22 instanceof g) {
                        str2 = "boolean";
                    } else if (b22 instanceof i) {
                        str2 = "number";
                    } else if (b22 instanceof u) {
                        str2 = "string";
                    } else if (b22 instanceof p) {
                        str2 = "function";
                    } else if ((b22 instanceof r) || (b22 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b22));
                    } else {
                        str2 = "object";
                    }
                    return new u(str2);
                case 63:
                    a6.h(n0.UNDEFINED.name(), 0, list);
                    return q.f4079c;
                case 64:
                    a6.i(n0.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        q b23 = z4Var.b((q) it2.next());
                        if (!(b23 instanceof u)) {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b23.getClass().getCanonicalName()));
                        }
                        z4Var.e(b23.g(), q.f4079c);
                    }
                    return q.f4079c;
                default:
                    return super.b(str);
            }
        }
    }
}
