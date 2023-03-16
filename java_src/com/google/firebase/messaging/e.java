package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f5520a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5521b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f5522c;

    public e(Context context, j0 j0Var, ExecutorService executorService) {
        this.f5520a = executorService;
        this.f5521b = context;
        this.f5522c = j0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f5521b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!d4.l.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f5521b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f5521b.getSystemService("notification")).notify(aVar.f5499b, aVar.f5500c, aVar.f5498a.c());
    }

    private f0 d() {
        f0 f10 = f0.f(this.f5522c.p("gcm.n.image"));
        if (f10 != null) {
            f10.o(this.f5520a);
        }
        return f10;
    }

    private void e(k.e eVar, f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) t4.l.b(f0Var.j(), 5L, TimeUnit.SECONDS);
            eVar.B(bitmap);
            eVar.N(new k.b().z(bitmap).y(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f5522c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        f0 d10 = d();
        c.a e10 = c.e(this.f5521b, this.f5522c);
        e(e10.f5498a, d10);
        c(e10);
        return true;
    }
}
