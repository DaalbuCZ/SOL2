package com.dexterous.flutterlocalnotifications;

import a8.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.n;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l8.d;
import y7.a;
/* loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    private static b f3312b;

    /* renamed from: c  reason: collision with root package name */
    private static io.flutter.embedding.engine.a f3313c;

    /* renamed from: a  reason: collision with root package name */
    c1.a f3314a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d.InterfaceC0160d {

        /* renamed from: n  reason: collision with root package name */
        final List<Map<String, Object>> f3315n;

        /* renamed from: o  reason: collision with root package name */
        private d.b f3316o;

        private b() {
            this.f3315n = new ArrayList();
        }

        @Override // l8.d.InterfaceC0160d
        public void a(Object obj, d.b bVar) {
            for (Map<String, Object> map : this.f3315n) {
                bVar.a(map);
            }
            this.f3315n.clear();
            this.f3316o = bVar;
        }

        @Override // l8.d.InterfaceC0160d
        public void b(Object obj) {
            this.f3316o = null;
        }

        public void c(Map<String, Object> map) {
            d.b bVar = this.f3316o;
            if (bVar != null) {
                bVar.a(map);
            } else {
                this.f3315n.add(map);
            }
        }
    }

    private void a(y7.a aVar) {
        new d(aVar.l(), "dexterous.com/flutter/local_notifications/actions").d(f3312b);
    }

    private void b(Context context) {
        if (f3313c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        f c10 = x7.a.e().c();
        c10.q(context);
        c10.g(context, null);
        f3313c = new io.flutter.embedding.engine.a(context);
        FlutterCallbackInformation d10 = this.f3314a.d();
        if (d10 == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        y7.a h10 = f3313c.h();
        a(h10);
        h10.j(new a.b(context.getAssets(), c10.i(), d10));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            c1.a aVar = this.f3314a;
            if (aVar == null) {
                aVar = new c1.a(context);
            }
            this.f3314a = aVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                n.f(context).b(((Integer) extractNotificationResponseMap.get("notificationId")).intValue());
            }
            if (f3312b == null) {
                f3312b = new b();
            }
            f3312b.c(extractNotificationResponseMap);
            b(context);
        }
    }
}
