package v3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class x {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    private static x f15633e;

    /* renamed from: a */
    private final Context f15634a;

    /* renamed from: b */
    private final ScheduledExecutorService f15635b;
    @GuardedBy("this")

    /* renamed from: c */
    private r f15636c = new r(this, null);
    @GuardedBy("this")

    /* renamed from: d */
    private int f15637d = 1;

    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15635b = scheduledExecutorService;
        this.f15634a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(x xVar) {
        return xVar.f15634a;
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            if (f15633e == null) {
                k4.e.a();
                f15633e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new e4.a("MessengerIpcClient"))));
            }
            xVar = f15633e;
        }
        return xVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(x xVar) {
        return xVar.f15635b;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f15637d;
        this.f15637d = i10 + 1;
        return i10;
    }

    private final synchronized <T> t4.i<T> g(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f15636c.g(uVar)) {
            r rVar = new r(this, null);
            this.f15636c = rVar;
            rVar.g(uVar);
        }
        return uVar.f15630b.a();
    }

    public final t4.i<Void> c(int i10, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final t4.i<Bundle> d(int i10, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}
