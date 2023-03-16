package r9;

import y8.m;
/* loaded from: classes.dex */
public final class z {
    public static final <T> Object a(Object obj, b9.d<? super T> dVar) {
        if (obj instanceof v) {
            m.a aVar = y8.m.f17093n;
            Throwable th = ((v) obj).f13170a;
            if (n0.d() && (dVar instanceof d9.e)) {
                th = kotlinx.coroutines.internal.d0.j(th, (d9.e) dVar);
            }
            obj = y8.n.a(th);
        } else {
            m.a aVar2 = y8.m.f17093n;
        }
        return y8.m.a(obj);
    }

    public static final <T> Object b(Object obj, j9.l<? super Throwable, y8.s> lVar) {
        Throwable b10 = y8.m.b(obj);
        return b10 == null ? lVar != null ? new w(obj, lVar) : obj : new v(b10, false, 2, null);
    }

    public static final <T> Object c(Object obj, k<?> kVar) {
        Throwable b10 = y8.m.b(obj);
        if (b10 != null) {
            if (n0.d() && (kVar instanceof d9.e)) {
                b10 = kotlinx.coroutines.internal.d0.j(b10, (d9.e) kVar);
            }
            obj = new v(b10, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, j9.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
