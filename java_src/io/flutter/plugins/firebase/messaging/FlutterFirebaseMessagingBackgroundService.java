package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.o0;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingBackgroundService extends i {

    /* renamed from: w  reason: collision with root package name */
    private static final List<Intent> f8952w = Collections.synchronizedList(new LinkedList());

    /* renamed from: x  reason: collision with root package name */
    private static b f8953x;

    public static void k(Context context, Intent intent) {
        i.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, ((o0) intent.getExtras().get("notification")).F() == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Intent intent, CountDownLatch countDownLatch) {
        f8953x.d(intent, countDownLatch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = f8952w;
        synchronized (list) {
            for (Intent intent : list) {
                f8953x.d(intent, null);
            }
            f8952w.clear();
        }
    }

    public static void n(long j10) {
        b.m(j10);
    }

    public static void o(long j10) {
        b.n(j10);
    }

    public static void p(long j10, io.flutter.embedding.engine.e eVar) {
        if (f8953x != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        b bVar = new b();
        f8953x = bVar;
        bVar.p(j10, eVar);
    }

    @Override // io.flutter.plugins.firebase.messaging.i
    protected void g(final Intent intent) {
        if (!f8953x.h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = f8952w;
        synchronized (list) {
            if (f8953x.i()) {
                Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new Runnable() { // from class: p8.d
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterFirebaseMessagingBackgroundService.l(intent, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e10);
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.i
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // io.flutter.plugins.firebase.messaging.i, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.i, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f8953x == null) {
            f8953x = new b();
        }
        f8953x.o();
    }

    @Override // io.flutter.plugins.firebase.messaging.i, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.i, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
