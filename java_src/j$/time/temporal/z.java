package j$.time.temporal;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class z implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final long f9566a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9567b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9568c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9569d;

    private z(long j10, long j11, long j12, long j13) {
        this.f9566a = j10;
        this.f9567b = j11;
        this.f9568c = j12;
        this.f9569d = j13;
    }

    private String c(o oVar, long j10) {
        if (oVar == null) {
            return "Invalid value (valid values " + this + "): " + j10;
        }
        return "Invalid value for " + oVar + " (valid values " + this + "): " + j10;
    }

    public static z i(long j10, long j11) {
        if (j10 <= j11) {
            return new z(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static z j(long j10, long j11, long j12) {
        if (j10 <= j10) {
            if (j11 <= j12) {
                if (j10 <= j12) {
                    return new z(j10, j10, j11, j12);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public int a(long j10, o oVar) {
        if (g() && h(j10)) {
            return (int) j10;
        }
        throw new j$.time.d(c(oVar, j10));
    }

    public long b(long j10, o oVar) {
        if (h(j10)) {
            return j10;
        }
        throw new j$.time.d(c(oVar, j10));
    }

    public long d() {
        return this.f9569d;
    }

    public long e() {
        return this.f9566a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f9566a == zVar.f9566a && this.f9567b == zVar.f9567b && this.f9568c == zVar.f9568c && this.f9569d == zVar.f9569d;
        }
        return false;
    }

    public boolean f() {
        return this.f9566a == this.f9567b && this.f9568c == this.f9569d;
    }

    public boolean g() {
        return this.f9566a >= -2147483648L && this.f9569d <= 2147483647L;
    }

    public boolean h(long j10) {
        return j10 >= this.f9566a && j10 <= this.f9569d;
    }

    public int hashCode() {
        long j10 = this.f9566a;
        long j11 = this.f9567b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f9568c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f9569d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9566a);
        if (this.f9566a != this.f9567b) {
            sb.append('/');
            sb.append(this.f9567b);
        }
        sb.append(" - ");
        sb.append(this.f9568c);
        if (this.f9568c != this.f9569d) {
            sb.append('/');
            sb.append(this.f9569d);
        }
        return sb.toString();
    }
}
