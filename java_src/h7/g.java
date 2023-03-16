package h7;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: n  reason: collision with root package name */
    private final String f8131n;

    public g(String str) {
        this.f8131n = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f8131n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            String str = this.f8131n;
            String str2 = ((g) obj).f8131n;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f8131n);
    }

    public int hashCode() {
        return this.f8131n.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f8131n);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f8131n);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f8131n).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f8131n);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f8131n).longValue();
        }
    }

    public String toString() {
        return this.f8131n;
    }
}
