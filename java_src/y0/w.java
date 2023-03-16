package y0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class w {
    public static String a(String str) {
        try {
            return s1.b(b(str)).substring(0, 10);
        } catch (NoSuchAlgorithmException e10) {
            i0.c(e10);
            return "";
        }
    }

    private static byte[] b(String str) {
        return MessageDigest.getInstance("SHA-256").digest(str.getBytes(i3.f16539a));
    }
}
