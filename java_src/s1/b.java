package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13299a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13300b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13301c;

    /* loaded from: classes.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final InterfaceC0192b f13302n;

        /* renamed from: o  reason: collision with root package name */
        private final Handler f13303o;

        public a(Handler handler, InterfaceC0192b interfaceC0192b) {
            this.f13303o = handler;
            this.f13302n = interfaceC0192b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f13303o.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f13301c) {
                this.f13302n.D();
            }
        }
    }

    /* renamed from: s1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0192b {
        void D();
    }

    public b(Context context, Handler handler, InterfaceC0192b interfaceC0192b) {
        this.f13299a = context.getApplicationContext();
        this.f13300b = new a(handler, interfaceC0192b);
    }

    public void b(boolean z10) {
        boolean z11;
        if (z10 && !this.f13301c) {
            this.f13299a.registerReceiver(this.f13300b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else if (z10 || !this.f13301c) {
            return;
        } else {
            this.f13299a.unregisterReceiver(this.f13300b);
            z11 = false;
        }
        this.f13301c = z11;
    }
}
