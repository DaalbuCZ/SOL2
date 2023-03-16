package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.g1;
import java.util.concurrent.ExecutorService;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class h extends Service {

    /* renamed from: o  reason: collision with root package name */
    private Binder f5540o;

    /* renamed from: q  reason: collision with root package name */
    private int f5542q;

    /* renamed from: n  reason: collision with root package name */
    final ExecutorService f5539n = m.d();

    /* renamed from: p  reason: collision with root package name */
    private final Object f5541p = new Object();

    /* renamed from: r  reason: collision with root package name */
    private int f5543r = 0;

    /* loaded from: classes.dex */
    class a implements g1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.g1.a
        public t4.i<Void> a(Intent intent) {
            return h.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            e1.c(intent);
        }
        synchronized (this.f5541p) {
            int i10 = this.f5543r - 1;
            this.f5543r = i10;
            if (i10 == 0) {
                k(this.f5542q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, t4.i iVar) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, t4.j jVar) {
        try {
            f(intent);
        } finally {
            jVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t4.i<Void> j(final Intent intent) {
        if (g(intent)) {
            return t4.l.e(null);
        }
        final t4.j jVar = new t4.j();
        this.f5539n.execute(new Runnable() { // from class: com.google.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                h.this.i(intent, jVar);
            }
        });
        return jVar.a();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f5540o == null) {
            this.f5540o = new g1(new a());
        }
        return this.f5540o;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5539n.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f5541p) {
            this.f5542q = i11;
            this.f5543r++;
        }
        Intent e10 = e(intent);
        if (e10 == null) {
            d(intent);
            return 2;
        }
        t4.i<Void> j10 = j(e10);
        if (j10.o()) {
            d(intent);
            return 2;
        }
        j10.b(androidx.window.layout.u.f2506n, new t4.d() { // from class: com.google.firebase.messaging.g
            @Override // t4.d
            public final void a(t4.i iVar) {
                h.this.h(intent, iVar);
            }
        });
        return 3;
    }
}
