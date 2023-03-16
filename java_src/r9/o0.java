package r9;

import y8.m;
/* loaded from: classes.dex */
public final class o0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(b9.d<?> dVar) {
        String a10;
        if (dVar instanceof kotlinx.coroutines.internal.h) {
            return dVar.toString();
        }
        try {
            m.a aVar = y8.m.f17093n;
            a10 = y8.m.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            m.a aVar2 = y8.m.f17093n;
            a10 = y8.m.a(y8.n.a(th));
        }
        if (y8.m.b(a10) != null) {
            a10 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) a10;
    }
}
