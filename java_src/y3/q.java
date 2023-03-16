package y3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f16998a;

    /* renamed from: b  reason: collision with root package name */
    private final p f16999b;

    public q(p pVar) {
        this.f16999b = pVar;
    }

    public final void a(Context context) {
        this.f16998a = context;
    }

    public final synchronized void b() {
        Context context = this.f16998a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f16998a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f16999b.a();
            b();
        }
    }
}
