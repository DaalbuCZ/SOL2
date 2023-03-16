package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q a(String str, f fVar, z4 z4Var, List list) {
        String str2;
        char c10;
        String str3;
        j jVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                q d11 = fVar.d();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        q b10 = z4Var.b((q) it.next());
                        if (b10 instanceof h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        f fVar2 = (f) d11;
                        int D = fVar2.D();
                        if (b10 instanceof f) {
                            f fVar3 = (f) b10;
                            Iterator G = fVar3.G();
                            while (G.hasNext()) {
                                Integer num = (Integer) G.next();
                                fVar2.L(num.intValue() + D, fVar3.E(num.intValue()));
                            }
                        } else {
                            fVar2.L(D, b10);
                        }
                    }
                }
                return d11;
            case 1:
                a6.h("every", 1, list);
                q b11 = z4Var.b((q) list.get(0));
                if (b11 instanceof p) {
                    return (fVar.D() == 0 || b(fVar, z4Var, (p) b11, Boolean.FALSE, Boolean.TRUE).D() == fVar.D()) ? q.f4084h : q.f4085i;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                a6.h("filter", 1, list);
                q b12 = z4Var.b((q) list.get(0));
                if (b12 instanceof p) {
                    if (fVar.C() == 0) {
                        return new f();
                    }
                    q d12 = fVar.d();
                    f b13 = b(fVar, z4Var, (p) b12, null, Boolean.TRUE);
                    f fVar4 = new f();
                    Iterator G2 = b13.G();
                    while (G2.hasNext()) {
                        fVar4.L(fVar4.D(), ((f) d12).E(((Integer) G2.next()).intValue()));
                    }
                    return fVar4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                a6.h("forEach", 1, list);
                q b14 = z4Var.b((q) list.get(0));
                if (b14 instanceof p) {
                    if (fVar.C() != 0) {
                        b(fVar, z4Var, (p) b14, null, null);
                    }
                    return q.f4079c;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                a6.j("indexOf", 2, list);
                q qVar = q.f4079c;
                if (!list.isEmpty()) {
                    qVar = z4Var.b((q) list.get(0));
                }
                if (list.size() > 1) {
                    double a10 = a6.a(z4Var.b((q) list.get(1)).f().doubleValue());
                    if (a10 >= fVar.D()) {
                        return new i(Double.valueOf(-1.0d));
                    }
                    d10 = a10 < 0.0d ? fVar.D() + a10 : a10;
                }
                Iterator G3 = fVar.G();
                while (G3.hasNext()) {
                    int intValue = ((Integer) G3.next()).intValue();
                    double d13 = intValue;
                    if (d13 >= d10 && a6.l(fVar.E(intValue), qVar)) {
                        return new i(Double.valueOf(d13));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 5:
                a6.j("join", 1, list);
                if (fVar.D() == 0) {
                    return q.f4086j;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    q b15 = z4Var.b((q) list.get(0));
                    str3 = ((b15 instanceof o) || (b15 instanceof v)) ? "" : b15.g();
                }
                return new u(fVar.F(str3));
            case 6:
                a6.j("lastIndexOf", 2, list);
                q qVar2 = q.f4079c;
                if (!list.isEmpty()) {
                    qVar2 = z4Var.b((q) list.get(0));
                }
                double D2 = fVar.D() - 1;
                if (list.size() > 1) {
                    q b16 = z4Var.b((q) list.get(1));
                    D2 = Double.isNaN(b16.f().doubleValue()) ? fVar.D() - 1 : a6.a(b16.f().doubleValue());
                    if (D2 < 0.0d) {
                        D2 += fVar.D();
                    }
                }
                if (D2 < 0.0d) {
                    return new i(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(fVar.D(), D2); min >= 0; min--) {
                    if (fVar.M(min) && a6.l(fVar.E(min), qVar2)) {
                        return new i(Double.valueOf(min));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 7:
                a6.h("map", 1, list);
                q b17 = z4Var.b((q) list.get(0));
                if (b17 instanceof p) {
                    return fVar.D() == 0 ? new f() : b(fVar, z4Var, (p) b17, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                a6.h("pop", 0, list);
                int D3 = fVar.D();
                if (D3 == 0) {
                    return q.f4079c;
                }
                int i10 = D3 - 1;
                q E = fVar.E(i10);
                fVar.K(i10);
                return E;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        fVar.L(fVar.D(), z4Var.b((q) it2.next()));
                    }
                }
                return new i(Double.valueOf(fVar.D()));
            case '\n':
                return c(fVar, z4Var, list, true);
            case 11:
                return c(fVar, z4Var, list, false);
            case '\f':
                a6.h("reverse", 0, list);
                int D4 = fVar.D();
                if (D4 != 0) {
                    for (int i11 = 0; i11 < D4 / 2; i11++) {
                        if (fVar.M(i11)) {
                            q E2 = fVar.E(i11);
                            fVar.L(i11, null);
                            int i12 = (D4 - 1) - i11;
                            if (fVar.M(i12)) {
                                fVar.L(i11, fVar.E(i12));
                            }
                            fVar.L(i12, E2);
                        }
                    }
                }
                return fVar;
            case '\r':
                a6.h("shift", 0, list);
                if (fVar.D() == 0) {
                    return q.f4079c;
                }
                q E3 = fVar.E(0);
                fVar.K(0);
                return E3;
            case 14:
                a6.j("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.d();
                }
                double D5 = fVar.D();
                double a11 = a6.a(z4Var.b((q) list.get(0)).f().doubleValue());
                double max = a11 < 0.0d ? Math.max(a11 + D5, 0.0d) : Math.min(a11, D5);
                if (list.size() == 2) {
                    double a12 = a6.a(z4Var.b((q) list.get(1)).f().doubleValue());
                    D5 = a12 < 0.0d ? Math.max(D5 + a12, 0.0d) : Math.min(D5, a12);
                }
                f fVar5 = new f();
                for (int i13 = (int) max; i13 < D5; i13++) {
                    fVar5.L(fVar5.D(), fVar.E(i13));
                }
                return fVar5;
            case 15:
                a6.h("some", 1, list);
                q b18 = z4Var.b((q) list.get(0));
                if (b18 instanceof j) {
                    if (fVar.D() != 0) {
                        j jVar2 = (j) b18;
                        Iterator G4 = fVar.G();
                        while (G4.hasNext()) {
                            int intValue2 = ((Integer) G4.next()).intValue();
                            if (fVar.M(intValue2) && jVar2.a(z4Var, Arrays.asList(fVar.E(intValue2), new i(Double.valueOf(intValue2)), fVar)).k().booleanValue()) {
                                return q.f4084h;
                            }
                        }
                    }
                    return q.f4085i;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                a6.j("sort", 1, list);
                if (fVar.D() >= 2) {
                    List<q> H = fVar.H();
                    if (list.isEmpty()) {
                        jVar = null;
                    } else {
                        q b19 = z4Var.b((q) list.get(0));
                        if (!(b19 instanceof j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        jVar = (j) b19;
                    }
                    Collections.sort(H, new c0(jVar, z4Var));
                    fVar.I();
                    int i14 = 0;
                    for (q qVar3 : H) {
                        fVar.L(i14, qVar3);
                        i14++;
                    }
                }
                return fVar;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int a13 = (int) a6.a(z4Var.b((q) list.get(0)).f().doubleValue());
                if (a13 < 0) {
                    a13 = Math.max(0, a13 + fVar.D());
                } else if (a13 > fVar.D()) {
                    a13 = fVar.D();
                }
                int D6 = fVar.D();
                f fVar6 = new f();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) a6.a(z4Var.b((q) list.get(1)).f().doubleValue()));
                    if (max2 > 0) {
                        for (int i15 = a13; i15 < Math.min(D6, a13 + max2); i15++) {
                            fVar6.L(fVar6.D(), fVar.E(a13));
                            fVar.K(a13);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            q b20 = z4Var.b((q) list.get(i16));
                            if (b20 instanceof h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            fVar.J((a13 + i16) - 2, b20);
                        }
                    }
                } else {
                    while (a13 < D6) {
                        fVar6.L(fVar6.D(), fVar.E(a13));
                        fVar.L(a13, null);
                        a13++;
                    }
                }
                return fVar6;
            case 18:
                a6.h(str2, 0, list);
                return new u(fVar.F(","));
            case 19:
                if (!list.isEmpty()) {
                    f fVar7 = new f();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        q b21 = z4Var.b((q) it3.next());
                        if (b21 instanceof h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        fVar7.L(fVar7.D(), b21);
                    }
                    int D7 = fVar7.D();
                    Iterator G5 = fVar.G();
                    while (G5.hasNext()) {
                        Integer num2 = (Integer) G5.next();
                        fVar7.L(num2.intValue() + D7, fVar.E(num2.intValue()));
                    }
                    fVar.I();
                    Iterator G6 = fVar7.G();
                    while (G6.hasNext()) {
                        Integer num3 = (Integer) G6.next();
                        fVar.L(num3.intValue(), fVar7.E(num3.intValue()));
                    }
                }
                return new i(Double.valueOf(fVar.D()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static f b(f fVar, z4 z4Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator G = fVar.G();
        while (G.hasNext()) {
            int intValue = ((Integer) G.next()).intValue();
            if (fVar.M(intValue)) {
                q a10 = jVar.a(z4Var, Arrays.asList(fVar.E(intValue), new i(Double.valueOf(intValue)), fVar));
                if (a10.k().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || a10.k().equals(bool2)) {
                    fVar2.L(intValue, a10);
                }
            }
        }
        return fVar2;
    }

    private static q c(f fVar, z4 z4Var, List list, boolean z10) {
        q qVar;
        a6.i("reduce", 1, list);
        a6.j("reduce", 2, list);
        q b10 = z4Var.b((q) list.get(0));
        if (b10 instanceof j) {
            if (list.size() == 2) {
                qVar = z4Var.b((q) list.get(1));
                if (qVar instanceof h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (fVar.D() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                qVar = null;
            }
            j jVar = (j) b10;
            int D = fVar.D();
            int i10 = z10 ? 0 : D - 1;
            int i11 = z10 ? D - 1 : 0;
            int i12 = true == z10 ? 1 : -1;
            if (qVar == null) {
                qVar = fVar.E(i10);
                i10 += i12;
            }
            while ((i11 - i10) * i12 >= 0) {
                if (fVar.M(i10)) {
                    qVar = jVar.a(z4Var, Arrays.asList(qVar, fVar.E(i10), new i(Double.valueOf(i10)), fVar));
                    if (qVar instanceof h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i10 += i12;
                } else {
                    i10 += i12;
                }
            }
            return qVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
