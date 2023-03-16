package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import k0.j;
import k0.t;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements d0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2518a = j.f("WrkMgrInitializer");

    @Override // d0.a
    public List<Class<? extends d0.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // d0.a
    /* renamed from: c */
    public t b(Context context) {
        j.c().a(f2518a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.f(context, new a.b().a());
        return t.e(context);
    }
}
