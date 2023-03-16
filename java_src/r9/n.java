package r9;
/* loaded from: classes.dex */
public final class n {
    public static final <T> l<T> a(b9.d<? super T> dVar) {
        if (dVar instanceof kotlinx.coroutines.internal.h) {
            l<T> p10 = ((kotlinx.coroutines.internal.h) dVar).p();
            if (p10 != null) {
                if (!p10.K()) {
                    p10 = null;
                }
                if (p10 != null) {
                    return p10;
                }
            }
            return new l<>(dVar, 2);
        }
        return new l<>(dVar, 1);
    }
}
