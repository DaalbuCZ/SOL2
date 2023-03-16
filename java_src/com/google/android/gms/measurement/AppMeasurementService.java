package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.b8;
import p4.z;
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements z {

    /* renamed from: n  reason: collision with root package name */
    private b8 f4352n;

    private final b8 d() {
        if (this.f4352n == null) {
            this.f4352n = new b8(this);
        }
        return this.f4352n;
    }

    @Override // p4.z
    public final void a(Intent intent) {
        u.a.b(intent);
    }

    @Override // p4.z
    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    @Override // p4.z
    public final void c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        d().a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
