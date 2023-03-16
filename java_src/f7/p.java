package f7;

import java.math.BigInteger;
/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7333a;

    public p(Boolean bool) {
        this.f7333a = h7.a.b(bool);
    }

    public p(Number number) {
        this.f7333a = h7.a.b(number);
    }

    public p(String str) {
        this.f7333a = h7.a.b(str);
    }

    private static boolean I(p pVar) {
        Object obj = pVar.f7333a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public boolean C() {
        return H() ? ((Boolean) this.f7333a).booleanValue() : Boolean.parseBoolean(k());
    }

    public double D() {
        return J() ? G().doubleValue() : Double.parseDouble(k());
    }

    public int E() {
        return J() ? G().intValue() : Integer.parseInt(k());
    }

    public long F() {
        return J() ? G().longValue() : Long.parseLong(k());
    }

    public Number G() {
        Object obj = this.f7333a;
        return obj instanceof String ? new h7.g((String) obj) : (Number) obj;
    }

    public boolean H() {
        return this.f7333a instanceof Boolean;
    }

    public boolean J() {
        return this.f7333a instanceof Number;
    }

    public boolean K() {
        return this.f7333a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7333a == null) {
            return pVar.f7333a == null;
        } else if (I(this) && I(pVar)) {
            return G().longValue() == pVar.G().longValue();
        } else {
            Object obj2 = this.f7333a;
            if ((obj2 instanceof Number) && (pVar.f7333a instanceof Number)) {
                double doubleValue = G().doubleValue();
                double doubleValue2 = pVar.G().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(pVar.f7333a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f7333a == null) {
            return 31;
        }
        if (I(this)) {
            doubleToLongBits = G().longValue();
        } else {
            Object obj = this.f7333a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(G().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // f7.k
    public String k() {
        return J() ? G().toString() : H() ? ((Boolean) this.f7333a).toString() : (String) this.f7333a;
    }
}
