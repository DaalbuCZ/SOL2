package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class k0 extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public k0() {
        this.f4282a.add(n0.ADD);
        this.f4282a.add(n0.DIVIDE);
        this.f4282a.add(n0.MODULUS);
        this.f4282a.add(n0.MULTIPLY);
        this.f4282a.add(n0.NEGATE);
        this.f4282a.add(n0.POST_DECREMENT);
        this.f4282a.add(n0.POST_INCREMENT);
        this.f4282a.add(n0.PRE_DECREMENT);
        this.f4282a.add(n0.PRE_INCREMENT);
        this.f4282a.add(n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        n0 n0Var = n0.ADD;
        int ordinal = a6.e(str).ordinal();
        if (ordinal == 0) {
            a6.h(n0Var.name(), 2, list);
            q b10 = z4Var.b((q) list.get(0));
            q b11 = z4Var.b((q) list.get(1));
            return ((b10 instanceof m) || (b10 instanceof u) || (b11 instanceof m) || (b11 instanceof u)) ? new u(String.valueOf(b10.g()).concat(String.valueOf(b11.g()))) : new i(Double.valueOf(b10.f().doubleValue() + b11.f().doubleValue()));
        } else if (ordinal == 21) {
            a6.h(n0.DIVIDE.name(), 2, list);
            return new i(Double.valueOf(z4Var.b((q) list.get(0)).f().doubleValue() / z4Var.b((q) list.get(1)).f().doubleValue()));
        } else if (ordinal == 59) {
            a6.h(n0.SUBTRACT.name(), 2, list);
            return new i(Double.valueOf(z4Var.b((q) list.get(0)).f().doubleValue() + new i(Double.valueOf(-z4Var.b((q) list.get(1)).f().doubleValue())).f().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            a6.h(str, 2, list);
            q b12 = z4Var.b((q) list.get(0));
            z4Var.b((q) list.get(1));
            return b12;
        } else if (ordinal == 55 || ordinal == 56) {
            a6.h(str, 1, list);
            return z4Var.b((q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    a6.h(n0.MODULUS.name(), 2, list);
                    return new i(Double.valueOf(z4Var.b((q) list.get(0)).f().doubleValue() % z4Var.b((q) list.get(1)).f().doubleValue()));
                case 45:
                    a6.h(n0.MULTIPLY.name(), 2, list);
                    return new i(Double.valueOf(z4Var.b((q) list.get(0)).f().doubleValue() * z4Var.b((q) list.get(1)).f().doubleValue()));
                case 46:
                    a6.h(n0.NEGATE.name(), 1, list);
                    return new i(Double.valueOf(-z4Var.b((q) list.get(0)).f().doubleValue()));
                default:
                    return super.b(str);
            }
        }
    }
}
