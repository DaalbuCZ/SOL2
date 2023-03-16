package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import c.j;
import com.google.android.gms.measurement.internal.b8;
import p4.z;
@TargetApi(j.f3076u3)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements z {

    /* renamed from: n  reason: collision with root package name */
    private b8 f4350n;

    private final b8 d() {
        if (this.f4350n == null) {
            this.f4350n = new b8(this);
        }
        return this.f4350n;
    }

    @Override // p4.z
    public final void a(Intent intent) {
    }

    @Override // p4.z
    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p4.z
    @TargetApi(j.f3076u3)
    public final void c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
