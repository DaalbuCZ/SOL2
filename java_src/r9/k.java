package r9;
/* loaded from: classes.dex */
public interface k<T> extends b9.d<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 == null) {
                if ((i10 & 2) != 0) {
                    obj2 = null;
                }
                return kVar.g(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void e(j9.l<? super Throwable, y8.s> lVar);

    Object g(T t10, Object obj);

    Object i(T t10, Object obj, j9.l<? super Throwable, y8.s> lVar);

    void m(T t10, j9.l<? super Throwable, y8.s> lVar);

    Object q(Throwable th);

    void s(Object obj);
}
