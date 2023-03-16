package y8;

import y8.m;
/* loaded from: classes.dex */
public final class n {
    public static final Object a(Throwable th) {
        k9.k.e(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f17094n;
        }
    }
}
