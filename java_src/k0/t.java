package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class t {
    public static t e(Context context) {
        return l0.i.k(context);
    }

    public static void f(Context context, androidx.work.a aVar) {
        l0.i.f(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(UUID uuid);

    public abstract m c(List<? extends u> list);

    public final m d(u uVar) {
        return c(Collections.singletonList(uVar));
    }
}
