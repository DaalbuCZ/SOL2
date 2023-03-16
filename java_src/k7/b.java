package k7;

import h7.e;
import java.lang.reflect.AccessibleObject;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f10688a;

    static {
        f10688a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f10688a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
