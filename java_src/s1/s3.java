package s1;

import android.content.Context;
import android.net.wifi.WifiManager;
/* loaded from: classes.dex */
final class s3 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f13737a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f13738b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13739c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13740d;

    public s3(Context context) {
        this.f13737a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f13738b;
        if (wifiLock == null) {
            return;
        }
        if (this.f13739c && this.f13740d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f13738b == null) {
            WifiManager wifiManager = this.f13737a;
            if (wifiManager == null) {
                p3.r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f13738b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f13739c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f13740d = z10;
        c();
    }
}
