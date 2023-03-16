package q9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p extends o {
    public static final String a0(String str, int i10) {
        int c10;
        k9.k.e(str, "<this>");
        if (i10 >= 0) {
            c10 = n9.f.c(i10, str.length());
            String substring = str.substring(c10);
            k9.k.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
