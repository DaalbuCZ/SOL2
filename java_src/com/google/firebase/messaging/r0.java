package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5615a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, t4.i<String>> f5616b = new m.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        t4.i<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Executor executor) {
        this.f5615a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i c(String str, t4.i iVar) {
        synchronized (this) {
            this.f5616b.remove(str);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized t4.i<String> b(final String str, a aVar) {
        t4.i<String> iVar = this.f5616b.get(str);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        t4.i j10 = aVar.start().j(this.f5615a, new t4.a() { // from class: com.google.firebase.messaging.q0
            @Override // t4.a
            public final Object a(t4.i iVar2) {
                t4.i c10;
                c10 = r0.this.c(str, iVar2);
                return c10;
            }
        });
        this.f5616b.put(str, j10);
        return j10;
    }
}
