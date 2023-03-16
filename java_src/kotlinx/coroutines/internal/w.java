package kotlinx.coroutines.internal;

import java.util.List;
import r9.z1;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f10975a = true;

    private static final x a(Throwable th, String str) {
        if (f10975a) {
            return new x(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new y8.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ x b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(z1 z1Var) {
        return z1Var.Y() instanceof x;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final z1 e(u uVar, List<? extends u> list) {
        try {
            return uVar.b(list);
        } catch (Throwable th) {
            return a(th, uVar.a());
        }
    }
}
