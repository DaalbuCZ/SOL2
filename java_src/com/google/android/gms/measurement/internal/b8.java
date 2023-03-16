package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4425a;

    public b8(Context context) {
        z3.o.i(context);
        this.f4425a = context;
    }

    private final f3 k() {
        return j4.H(this.f4425a, null, null).d();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        j4 H = j4.H(this.f4425a, null, null);
        final f3 d10 = H.d();
        if (intent == null) {
            d10.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.f();
        d10.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.z7
                @Override // java.lang.Runnable
                public final void run() {
                    b8.this.c(i11, d10, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().r().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new b5(a9.f0(this.f4425a), null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i10, f3 f3Var, Intent intent) {
        if (((p4.z) this.f4425a).b(i10)) {
            f3Var.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            k().v().a("Completed wakeful intent.");
            ((p4.z) this.f4425a).a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(f3 f3Var, JobParameters jobParameters) {
        f3Var.v().a("AppMeasurementJobService processed last upload request.");
        ((p4.z) this.f4425a).c(jobParameters, false);
    }

    public final void e() {
        j4 H = j4.H(this.f4425a, null, null);
        f3 d10 = H.d();
        H.f();
        d10.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        j4 H = j4.H(this.f4425a, null, null);
        f3 d10 = H.d();
        H.f();
        d10.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().r().a("onRebind called with null intent");
            return;
        }
        k().v().b("onRebind called. action", intent.getAction());
    }

    public final void h(Runnable runnable) {
        a9 f02 = a9.f0(this.f4425a);
        f02.b().z(new a8(this, f02, runnable));
    }

    @TargetApi(c.j.f3076u3)
    public final boolean i(final JobParameters jobParameters) {
        j4 H = j4.H(this.f4425a, null, null);
        final f3 d10 = H.d();
        String string = jobParameters.getExtras().getString("action");
        H.f();
        d10.v().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.y7
                @Override // java.lang.Runnable
                public final void run() {
                    b8.this.d(d10, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().r().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
