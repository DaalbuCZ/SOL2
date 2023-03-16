package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.o0;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.k;
import y7.a;
/* loaded from: classes.dex */
public class b implements k.c {

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f8955n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    private k f8956o;

    /* renamed from: p  reason: collision with root package name */
    private io.flutter.embedding.engine.a f8957p;

    /* loaded from: classes.dex */
    class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f8958a;

        a(CountDownLatch countDownLatch) {
            this.f8958a = countDownLatch;
        }

        @Override // l8.k.d
        public void a(Object obj) {
            this.f8958a.countDown();
        }

        @Override // l8.k.d
        public void b(String str, String str2, Object obj) {
            this.f8958a.countDown();
        }

        @Override // l8.k.d
        public void c() {
            this.f8958a.countDown();
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0134b extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Map f8960n;

        C0134b(Map map) {
            this.f8960n = map;
            put("userCallbackHandle", Long.valueOf(b.this.f()));
            put("message", map);
        }
    }

    private long e() {
        return p8.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long f() {
        return p8.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    private void g(l8.c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_messaging_background");
        this.f8956o = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(a8.f fVar, io.flutter.embedding.engine.e eVar, long j10) {
        String i10 = fVar.i();
        AssetManager assets = p8.a.a().getAssets();
        if (i()) {
            if (eVar != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(eVar.b()));
                this.f8957p = new io.flutter.embedding.engine.a(p8.a.a(), eVar.b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f8957p = new io.flutter.embedding.engine.a(p8.a.a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
            y7.a h10 = this.f8957p.h();
            g(h10);
            h10.j(new a.b(assets, i10, lookupCallbackInformation));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(final a8.f fVar, Handler handler, final io.flutter.embedding.engine.e eVar, final long j10) {
        fVar.q(p8.a.a());
        fVar.h(p8.a.a(), null, handler, new Runnable() { // from class: p8.c
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.b.this.j(fVar, eVar, j10);
            }
        });
    }

    private void l() {
        this.f8955n.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }

    public static void m(long j10) {
        p8.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j10).apply();
    }

    public static void n(long j10) {
        p8.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j10).apply();
    }

    public void d(Intent intent, CountDownLatch countDownLatch) {
        if (this.f8957p == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = countDownLatch != null ? new a(countDownLatch) : null;
        o0 o0Var = (o0) intent.getParcelableExtra("notification");
        if (o0Var != null) {
            this.f8956o.d("MessagingBackground#onMessage", new C0134b(g.f(o0Var)), aVar);
        } else {
            Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return e() != 0;
    }

    public boolean i() {
        return !this.f8955n.get();
    }

    public void o() {
        if (i()) {
            long e10 = e();
            if (e10 != 0) {
                p(e10, null);
            }
        }
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, k.d dVar) {
        try {
            if (!jVar.f11211a.equals("MessagingBackground#initialized")) {
                dVar.c();
                return;
            }
            l();
            dVar.a(Boolean.TRUE);
        } catch (j unused) {
            new StringBuilder().append("Flutter FCM error: ");
            throw null;
        }
    }

    public void p(final long j10, final io.flutter.embedding.engine.e eVar) {
        if (this.f8957p != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final a8.f fVar = new a8.f();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: p8.b
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.b.this.k(fVar, handler, eVar, j10);
            }
        });
    }
}
