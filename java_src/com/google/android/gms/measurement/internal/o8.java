package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
/* loaded from: classes.dex */
public final class o8 extends q8 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f4866d;

    /* renamed from: e  reason: collision with root package name */
    private o f4867e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f4868f;

    /* JADX INFO: Access modifiers changed from: protected */
    public o8(a9 a9Var) {
        super(a9Var);
        this.f4866d = (AlarmManager) this.f4438a.c().getSystemService("alarm");
    }

    private final int o() {
        if (this.f4868f == null) {
            this.f4868f = Integer.valueOf("measurement".concat(String.valueOf(this.f4438a.c().getPackageName())).hashCode());
        }
        return this.f4868f.intValue();
    }

    private final PendingIntent p() {
        Context c10 = this.f4438a.c();
        return PendingIntent.getBroadcast(c10, 0, new Intent().setClassName(c10, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.u0.f4225a);
    }

    private final o q() {
        if (this.f4867e == null) {
            this.f4867e = new n8(this, this.f4898b.c0());
        }
        return this.f4867e;
    }

    @TargetApi(c.j.f3076u3)
    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f4438a.c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.q8
    protected final boolean l() {
        AlarmManager alarmManager = this.f4866d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            r();
            return false;
        }
        return false;
    }

    public final void m() {
        i();
        this.f4438a.d().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f4866d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        if (Build.VERSION.SDK_INT >= 24) {
            r();
        }
    }

    public final void n(long j10) {
        i();
        this.f4438a.f();
        Context c10 = this.f4438a.c();
        if (!i9.Y(c10)) {
            this.f4438a.d().q().a("Receiver not registered/enabled");
        }
        if (!i9.Z(c10, false)) {
            this.f4438a.d().q().a("Service not registered/enabled");
        }
        m();
        this.f4438a.d().v().b("Scheduling upload, millis", Long.valueOf(j10));
        long b10 = this.f4438a.e().b() + j10;
        this.f4438a.z();
        if (j10 < Math.max(0L, ((Long) u2.f5084y.a(null)).longValue()) && !q().e()) {
            q().d(j10);
        }
        this.f4438a.f();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f4866d;
            if (alarmManager != null) {
                this.f4438a.z();
                alarmManager.setInexactRepeating(2, b10, Math.max(((Long) u2.f5075t.a(null)).longValue(), j10), p());
                return;
            }
            return;
        }
        Context c11 = this.f4438a.c();
        ComponentName componentName = new ComponentName(c11, "com.google.android.gms.measurement.AppMeasurementJobService");
        int o10 = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.v0.a(c11, new JobInfo.Builder(o10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
