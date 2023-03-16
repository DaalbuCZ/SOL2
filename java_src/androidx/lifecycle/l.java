package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes.dex */
public class l extends Service implements i {

    /* renamed from: n  reason: collision with root package name */
    private final t f2113n = new t(this);

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f2113n.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f2113n.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2113n.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f2113n.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f2113n.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
