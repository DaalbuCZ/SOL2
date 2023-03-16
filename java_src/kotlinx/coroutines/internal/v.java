package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import r9.z1;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f10972a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f10973b;

    /* renamed from: c  reason: collision with root package name */
    public static final z1 f10974c;

    static {
        v vVar = new v();
        f10972a = vVar;
        f10973b = f0.e("kotlinx.coroutines.fast.service.loader", true);
        f10974c = vVar.a();
    }

    private v() {
    }

    private final z1 a() {
        p9.b a10;
        List<u> f10;
        Object next;
        z1 e10;
        try {
            if (f10973b) {
                f10 = k.f10941a.c();
            } else {
                a10 = p9.f.a(ServiceLoader.load(u.class, u.class.getClassLoader()).iterator());
                f10 = p9.h.f(a10);
            }
            Iterator<T> it = f10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c10 = ((u) next).c();
                    do {
                        Object next2 = it.next();
                        int c11 = ((u) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            u uVar = (u) next;
            return (uVar == null || (e10 = w.e(uVar, f10)) == null) ? w.b(null, null, 3, null) : e10;
        } catch (Throwable th) {
            return w.b(th, null, 2, null);
        }
    }
}
