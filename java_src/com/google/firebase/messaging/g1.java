package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.j1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f5538a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        t4.i<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(a aVar) {
        this.f5538a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final j1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f5538a.a(aVar.f5563a).b(androidx.window.layout.u.f2506n, new t4.d() { // from class: com.google.firebase.messaging.f1
            @Override // t4.d
            public final void a(t4.i iVar) {
                j1.a.this.d();
            }
        });
    }
}
