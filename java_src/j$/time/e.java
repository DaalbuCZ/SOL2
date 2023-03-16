package j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class e implements Comparable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final e f9433c = new e(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f9434a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9435b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private e(long j10, int i10) {
        this.f9434a = j10;
        this.f9435b = i10;
    }

    private static e a(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? f9433c : new e(j10, i10);
    }

    public static e c(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j11--;
        }
        return a(j11, i10);
    }

    public static e g(long j10) {
        return a(j10, 0);
    }

    public static e h(long j10, long j11) {
        return a(c.a(j10, c.c(j11, 1000000000L)), (int) c.b(j11, 1000000000L));
    }

    public long b() {
        return this.f9434a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        e eVar = (e) obj;
        int compare = Long.compare(this.f9434a, eVar.f9434a);
        return compare != 0 ? compare : this.f9435b - eVar.f9435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f9434a == eVar.f9434a && this.f9435b == eVar.f9435b;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f9434a;
        return (this.f9435b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        if (this == f9433c) {
            return "PT0S";
        }
        long j10 = this.f9434a;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j11 != 0) {
            sb.append(j11);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i11 == 0 && this.f9435b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i11 >= 0 || this.f9435b <= 0) {
            sb.append(i11);
        } else if (i11 == -1) {
            sb.append("-0");
        } else {
            sb.append(i11 + 1);
        }
        if (this.f9435b > 0) {
            int length = sb.length();
            sb.append(i11 < 0 ? 2000000000 - this.f9435b : this.f9435b + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
