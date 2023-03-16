package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.h0;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends v3.b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // v3.b
    protected int b(Context context, v3.a aVar) {
        try {
            return ((Integer) t4.l.a(new com.google.firebase.messaging.l(context).i(aVar.k()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // v3.b
    protected void c(Context context, Bundle bundle) {
        Intent g10 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (h0.B(g10)) {
            h0.s(g10);
        }
    }
}
