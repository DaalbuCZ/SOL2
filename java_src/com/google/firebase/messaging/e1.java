package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    static final long f5525a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5526b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static s4.a f5527c;

    private static void b(Context context) {
        if (f5527c == null) {
            s4.a aVar = new s4.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f5527c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f5526b) {
            if (f5527c != null && d(intent)) {
                g(intent, false);
                f5527c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, j1 j1Var, final Intent intent) {
        synchronized (f5526b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            if (!d10) {
                f5527c.a(f5525a);
            }
            j1Var.c(intent).c(new t4.d() { // from class: com.google.firebase.messaging.d1
                @Override // t4.d
                public final void a(t4.i iVar) {
                    e1.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f5526b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!d10) {
                f5527c.a(f5525a);
            }
            return startService;
        }
    }
}
