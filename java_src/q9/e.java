package q9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t10, j9.l<? super T, ? extends CharSequence> lVar) {
        CharSequence valueOf;
        k9.k.e(appendable, "<this>");
        if (lVar != null) {
            t10 = (T) lVar.c(t10);
        } else {
            if (!(t10 == 0 ? true : t10 instanceof CharSequence)) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                }
                valueOf = String.valueOf((Object) t10);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) t10;
        appendable.append(valueOf);
    }
}
