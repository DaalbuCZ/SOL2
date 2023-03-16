package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13409a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13410b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13411c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f13412d;

    /* renamed from: e  reason: collision with root package name */
    private c f13413e;

    /* renamed from: f  reason: collision with root package name */
    private int f13414f;

    /* renamed from: g  reason: collision with root package name */
    private int f13415g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13416h;

    /* loaded from: classes.dex */
    public interface b {
        void A(int i10, boolean z10);

        void B(int i10);
    }

    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = g3.this.f13410b;
            final g3 g3Var = g3.this;
            handler.post(new Runnable() { // from class: s1.h3
                @Override // java.lang.Runnable
                public final void run() {
                    g3.b(g3.this);
                }
            });
        }
    }

    public g3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13409a = applicationContext;
        this.f13410b = handler;
        this.f13411c = bVar;
        AudioManager audioManager = (AudioManager) p3.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f13412d = audioManager;
        this.f13414f = 3;
        this.f13415g = f(audioManager, 3);
        this.f13416h = e(audioManager, this.f13414f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f13413e = cVar;
        } catch (RuntimeException e10) {
            p3.r.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(g3 g3Var) {
        g3Var.i();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        return p3.m0.f12306a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            p3.r.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f13412d, this.f13414f);
        boolean e10 = e(this.f13412d, this.f13414f);
        if (this.f13415g == f10 && this.f13416h == e10) {
            return;
        }
        this.f13415g = f10;
        this.f13416h = e10;
        this.f13411c.A(f10, e10);
    }

    public int c() {
        return this.f13412d.getStreamMaxVolume(this.f13414f);
    }

    public int d() {
        if (p3.m0.f12306a >= 28) {
            return this.f13412d.getStreamMinVolume(this.f13414f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f13413e;
        if (cVar != null) {
            try {
                this.f13409a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                p3.r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f13413e = null;
        }
    }

    public void h(int i10) {
        if (this.f13414f == i10) {
            return;
        }
        this.f13414f = i10;
        i();
        this.f13411c.B(i10);
    }
}
