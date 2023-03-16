package j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.o f9456a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9457b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9458c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9459d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j$.time.temporal.o oVar, int i10, int i11, boolean z10) {
        Objects.requireNonNull(oVar, "field");
        if (!oVar.c().f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + oVar);
        } else if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        } else if (i11 >= i10) {
            this.f9456a = oVar;
            this.f9457b = i10;
            this.f9458c = i11;
            this.f9459d = z10;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        Long e10 = vVar.e(this.f9456a);
        if (e10 == null) {
            return false;
        }
        x b10 = vVar.b();
        long longValue = e10.longValue();
        j$.time.temporal.z c10 = this.f9456a.c();
        c10.b(longValue, this.f9456a);
        BigDecimal valueOf = BigDecimal.valueOf(c10.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(c10.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String a10 = b10.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f9457b), this.f9458c), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.f9459d) {
                sb.append(b10.c());
            }
            sb.append(a10);
            return true;
        } else if (this.f9457b > 0) {
            if (this.f9459d) {
                sb.append(b10.c());
            }
            for (int i10 = 0; i10 < this.f9457b; i10++) {
                sb.append(b10.d());
            }
            return true;
        } else {
            return true;
        }
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        int i11;
        int i12 = sVar.k() ? this.f9457b : 0;
        int i13 = sVar.k() ? this.f9458c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i12 > 0 ? ~i10 : i10;
        }
        if (this.f9459d) {
            if (charSequence.charAt(i10) != sVar.f().c()) {
                return i12 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i14 = i10;
        int i15 = i12 + i14;
        if (i15 > length) {
            return ~i14;
        }
        int min = Math.min(i13 + i14, length);
        int i16 = 0;
        int i17 = i14;
        while (true) {
            if (i17 >= min) {
                i11 = i17;
                break;
            }
            int i18 = i17 + 1;
            int b10 = sVar.f().b(charSequence.charAt(i17));
            if (b10 >= 0) {
                i16 = (i16 * 10) + b10;
                i17 = i18;
            } else if (i18 < i15) {
                return ~i14;
            } else {
                i11 = i18 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i16).movePointLeft(i11 - i14);
        j$.time.temporal.z c10 = this.f9456a.c();
        BigDecimal valueOf = BigDecimal.valueOf(c10.e());
        return sVar.n(this.f9456a, movePointLeft.multiply(BigDecimal.valueOf(c10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i14, i11);
    }

    public String toString() {
        String str = this.f9459d ? ",DecimalPoint" : "";
        StringBuilder b10 = j$.time.a.b("Fraction(");
        b10.append(this.f9456a);
        b10.append(",");
        b10.append(this.f9457b);
        b10.append(",");
        b10.append(this.f9458c);
        b10.append(str);
        b10.append(")");
        return b10.toString();
    }
}
