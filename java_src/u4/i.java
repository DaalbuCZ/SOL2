package u4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
/* loaded from: classes.dex */
public final class i extends v4.r {
    public i(Context context) {
        super(new v4.s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v4.r
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f15672a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f15672a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f15672a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f10 = InstallState.f(intent, this.f15672a);
        this.f15672a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f10);
        c(f10);
    }
}
