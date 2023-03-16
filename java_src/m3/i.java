package m3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.m0;
import s1.h2;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11390a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String o10;
        while (true) {
            String o11 = a0Var.o();
            if (o11 == null) {
                return null;
            }
            if (f11390a.matcher(o11).matches()) {
                do {
                    o10 = a0Var.o();
                    if (o10 != null) {
                    }
                } while (!o10.isEmpty());
            } else {
                Matcher matcher = f.f11363a.matcher(o11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String o10 = a0Var.o();
        return o10 != null && o10.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] Q0 = m0.Q0(str, "\\.");
        long j10 = 0;
        for (String str2 : m0.P0(Q0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (Q0.length == 2) {
            j11 += Long.parseLong(Q0[1]);
        }
        return j11 * 1000;
    }

    public static void e(a0 a0Var) {
        int e10 = a0Var.e();
        if (b(a0Var)) {
            return;
        }
        a0Var.O(e10);
        throw h2.a("Expected WEBVTT. Got " + a0Var.o(), null);
    }
}
