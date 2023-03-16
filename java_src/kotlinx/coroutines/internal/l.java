package kotlinx.coroutines.internal;

import y8.m;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f10942a;

    static {
        Object a10;
        try {
            m.a aVar = y8.m.f17093n;
            a10 = y8.m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = y8.m.f17093n;
            a10 = y8.m.a(y8.n.a(th));
        }
        f10942a = y8.m.d(a10);
    }

    public static final boolean a() {
        return f10942a;
    }
}
