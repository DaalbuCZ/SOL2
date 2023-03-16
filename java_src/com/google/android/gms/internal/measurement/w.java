package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class w extends x {
    public w() {
        this.f4282a.add(n0.BITWISE_AND);
        this.f4282a.add(n0.BITWISE_LEFT_SHIFT);
        this.f4282a.add(n0.BITWISE_NOT);
        this.f4282a.add(n0.BITWISE_OR);
        this.f4282a.add(n0.BITWISE_RIGHT_SHIFT);
        this.f4282a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f4282a.add(n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, z4 z4Var, List list) {
        n0 n0Var = n0.ADD;
        switch (a6.e(str).ordinal()) {
            case 4:
                a6.h(n0.BITWISE_AND.name(), 2, list);
                return new i(Double.valueOf(a6.b(z4Var.b((q) list.get(0)).f().doubleValue()) & a6.b(z4Var.b((q) list.get(1)).f().doubleValue())));
            case 5:
                a6.h(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(a6.b(z4Var.b((q) list.get(0)).f().doubleValue()) << ((int) (a6.d(z4Var.b((q) list.get(1)).f().doubleValue()) & 31))));
            case 6:
                a6.h(n0.BITWISE_NOT.name(), 1, list);
                return new i(Double.valueOf(~a6.b(z4Var.b((q) list.get(0)).f().doubleValue())));
            case 7:
                a6.h(n0.BITWISE_OR.name(), 2, list);
                return new i(Double.valueOf(a6.b(z4Var.b((q) list.get(0)).f().doubleValue()) | a6.b(z4Var.b((q) list.get(1)).f().doubleValue())));
            case 8:
                a6.h(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(a6.b(z4Var.b((q) list.get(0)).f().doubleValue()) >> ((int) (a6.d(z4Var.b((q) list.get(1)).f().doubleValue()) & 31))));
            case 9:
                a6.h(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(a6.d(z4Var.b((q) list.get(0)).f().doubleValue()) >>> ((int) (a6.d(z4Var.b((q) list.get(1)).f().doubleValue()) & 31))));
            case 10:
                a6.h(n0.BITWISE_XOR.name(), 2, list);
                return new i(Double.valueOf(a6.b(z4Var.b((q) list.get(0)).f().doubleValue()) ^ a6.b(z4Var.b((q) list.get(1)).f().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
