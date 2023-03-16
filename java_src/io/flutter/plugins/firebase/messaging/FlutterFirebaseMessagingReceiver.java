package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.o0;
import java.util.HashMap;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, o0> f8954a = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (p8.a.a() == null) {
            p8.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        o0 o0Var = new o0(intent.getExtras());
        if (o0Var.E() != null) {
            f8954a.put(o0Var.x(), o0Var);
            f.b().i(o0Var);
        }
        if (g.d(context)) {
            Intent intent2 = new Intent("io.flutter.plugins.firebase.messaging.NOTIFICATION");
            intent2.putExtra("notification", o0Var);
            w.a.b(context).d(intent2);
            return;
        }
        Intent intent3 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent3.putExtra("notification", o0Var);
        FlutterFirebaseMessagingBackgroundService.k(context, intent3);
    }
}
