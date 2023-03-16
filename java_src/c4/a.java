package c4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import d4.l;
import f4.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import z3.k1;
import z3.o;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3209b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f3210c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f3211a = new ConcurrentHashMap();

    private a() {
    }

    public static a b() {
        if (f3210c == null) {
            synchronized (f3209b) {
                if (f3210c == null) {
                    f3210c = new a();
                }
            }
        }
        a aVar = f3210c;
        o.i(aVar);
        return aVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f3211a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean h10 = h(context, intent, serviceConnection, i10, executor);
                if (h10) {
                    return h10;
                }
                return false;
            } finally {
                this.f3211a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i10, executor);
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof k1);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return (!l.j() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f3211a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f3211a.get(serviceConnection));
        } finally {
            this.f3211a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return f(context, str, intent, serviceConnection, i10, true, executor);
    }
}
