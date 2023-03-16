package j$.time;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId of(String str) {
        int i10;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.t(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i10 = 3;
        } else if (!str.startsWith("UT")) {
            return r.s(str, true);
        } else {
            i10 = 2;
        }
        return r(str, i10, true);
    }

    public static ZoneId q(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.s() != 0) {
                str = str.concat(zoneOffset.o());
            }
            return new r(str, j$.time.zone.c.i(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static ZoneId r(String str, int i10, boolean z10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return q(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            try {
                ZoneOffset t10 = ZoneOffset.t(str.substring(i10));
                return t10 == ZoneOffset.UTC ? q(substring, t10) : q(substring, t10);
            } catch (d e10) {
                throw new d("Invalid ID for offset-based ZoneId: " + str, e10);
            }
        }
        return r.s(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return o().equals(((ZoneId) obj).o());
        }
        return false;
    }

    public int hashCode() {
        return o().hashCode();
    }

    public abstract String o();

    public abstract j$.time.zone.c p();

    public String toString() {
        return o();
    }
}
