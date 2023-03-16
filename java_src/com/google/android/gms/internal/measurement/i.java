package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements q {

    /* renamed from: n  reason: collision with root package name */
    private final Double f3892n;

    public i(Double d10) {
        if (d10 == null) {
            this.f3892n = Double.valueOf(Double.NaN);
        } else {
            this.f3892n = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q d() {
        return new i(this.f3892n);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f3892n.equals(((i) obj).f3892n);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double f() {
        return this.f3892n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String g() {
        if (Double.isNaN(this.f3892n.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f3892n.doubleValue())) {
            return this.f3892n.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f3892n.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f3892n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean k() {
        boolean z10 = false;
        if (!Double.isNaN(this.f3892n.doubleValue()) && this.f3892n.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final String toString() {
        return g();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        if ("toString".equals(str)) {
            return new u(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }
}
