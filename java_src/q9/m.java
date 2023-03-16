package q9;

import java.util.Collection;
import java.util.Iterator;
import z8.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends l {
    public static boolean h(CharSequence charSequence) {
        boolean z10;
        k9.k.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            n9.c p10 = n.p(charSequence);
            if (!(p10 instanceof Collection) || !((Collection) p10).isEmpty()) {
                Iterator<Integer> it = p10.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((w) it).b()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(String str, int i10, String str2, int i11, int i12, boolean z10) {
        k9.k.e(str, "<this>");
        k9.k.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final boolean j(String str, String str2, boolean z10) {
        k9.k.e(str, "<this>");
        k9.k.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : i(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }
}
