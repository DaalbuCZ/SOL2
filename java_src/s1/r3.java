package s1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
/* loaded from: classes.dex */
final class r3 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f13729a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f13730b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13731c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13732d;

    public r3(Context context) {
        this.f13729a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f13730b;
        if (wakeLock == null) {
            return;
        }
        if (this.f13731c && this.f13732d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f13730b == null) {
            PowerManager powerManager = this.f13729a;
            if (powerManager == null) {
                p3.r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f13730b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f13731c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f13732d = z10;
        c();
    }
}
