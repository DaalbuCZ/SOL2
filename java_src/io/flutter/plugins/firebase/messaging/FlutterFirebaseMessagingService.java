package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.o0;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(o0 o0Var) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        Intent intent = new Intent("io.flutter.plugins.firebase.messaging.TOKEN");
        intent.putExtra("token", str);
        w.a.b(getApplicationContext()).d(intent);
    }
}
