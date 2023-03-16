package y0;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f16533a = z2.f16822i - 1024;

    private static String a(String str, int i10) {
        int round = (int) Math.round((str.length() * i10) / a3.b(str));
        while (true) {
            str = str.substring(0, round);
            if (a3.b(str) <= i10) {
                return str;
            }
            round = str.length() - 1;
        }
    }

    public static boolean b(String str) {
        return a3.b(str) > f16533a;
    }

    public static String c(String str) {
        int a10 = a3.a("…");
        return d(str, f16533a - a10) + "…";
    }

    private static String d(String str, int i10) {
        return Charset.defaultCharset().displayName().equals("UTF-8") ? e(str, i10) : a(str, i10);
    }

    private static String e(String str, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < str.length()) {
            char charAt = str.charAt(i13);
            if (charAt <= 127) {
                i12 = 0;
                i11 = 1;
            } else {
                if (charAt <= 2047) {
                    i11 = 2;
                } else if (charAt > 55295 && charAt <= 57343) {
                    i11 = 4;
                    i12 = 1;
                } else {
                    i11 = 3;
                }
                i12 = 0;
            }
            i14 += i11;
            if (i14 > i10) {
                return str.substring(0, i13);
            }
            i13 = i13 + i12 + 1;
        }
        return str;
    }
}
