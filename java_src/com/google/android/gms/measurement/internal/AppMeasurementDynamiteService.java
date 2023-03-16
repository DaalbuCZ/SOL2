package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.e1 {

    /* renamed from: a  reason: collision with root package name */
    j4 f4356a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4357b = new m.a();

    @EnsuresNonNull({"scion"})
    private final void e() {
        if (this.f4356a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void f(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        e();
        this.f4356a.N().J(i1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void beginAdUnitExposure(String str, long j10) {
        e();
        this.f4356a.y().l(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        e();
        this.f4356a.I().o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearMeasurementEnabled(long j10) {
        e();
        this.f4356a.I().I(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void endAdUnitExposure(String str, long j10) {
        e();
        this.f4356a.y().m(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void generateEventId(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        long r02 = this.f4356a.N().r0();
        e();
        this.f4356a.N().I(i1Var, r02);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        this.f4356a.b().z(new k6(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        f(i1Var, this.f4356a.I().V());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        this.f4356a.b().z(new j9(this, i1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        f(i1Var, this.f4356a.I().W());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        f(i1Var, this.f4356a.I().X());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getGmpAppId(com.google.android.gms.internal.measurement.i1 i1Var) {
        String str;
        e();
        i6 I = this.f4356a.I();
        if (I.f4438a.O() != null) {
            str = I.f4438a.O();
        } else {
            try {
                str = p4.x.c(I.f4438a.c(), "google_app_id", I.f4438a.R());
            } catch (IllegalStateException e10) {
                I.f4438a.d().r().b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        f(i1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        this.f4356a.I().Q(str);
        e();
        this.f4356a.N().H(i1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getSessionId(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        i6 I = this.f4356a.I();
        I.f4438a.b().z(new w5(I, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getTestFlag(com.google.android.gms.internal.measurement.i1 i1Var, int i10) {
        e();
        if (i10 == 0) {
            this.f4356a.N().J(i1Var, this.f4356a.I().Y());
        } else if (i10 == 1) {
            this.f4356a.N().I(i1Var, this.f4356a.I().U().longValue());
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f4356a.N().H(i1Var, this.f4356a.I().T().intValue());
            } else if (i10 != 4) {
            } else {
                this.f4356a.N().D(i1Var, this.f4356a.I().R().booleanValue());
            }
        } else {
            i9 N = this.f4356a.N();
            double doubleValue = this.f4356a.I().S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.T(bundle);
            } catch (RemoteException e10) {
                N.f4438a.d().w().b("Error returning double value to wrapper", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        this.f4356a.b().z(new i8(this, i1Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initForTests(Map map) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initialize(g4.a aVar, com.google.android.gms.internal.measurement.o1 o1Var, long j10) {
        j4 j4Var = this.f4356a;
        if (j4Var == null) {
            this.f4356a = j4.H((Context) z3.o.i((Context) g4.b.f(aVar)), o1Var, Long.valueOf(j10));
        } else {
            j4Var.d().w().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.i1 i1Var) {
        e();
        this.f4356a.b().z(new k9(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        e();
        this.f4356a.I().s(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        e();
        z3.o.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f4356a.b().z(new i7(this, i1Var, new v(str2, new t(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logHealthData(int i10, String str, g4.a aVar, g4.a aVar2, g4.a aVar3) {
        e();
        this.f4356a.d().F(i10, true, false, str, aVar == null ? null : g4.b.f(aVar), aVar2 == null ? null : g4.b.f(aVar2), aVar3 != null ? g4.b.f(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityCreated(g4.a aVar, Bundle bundle, long j10) {
        e();
        h6 h6Var = this.f4356a.I().f4613c;
        if (h6Var != null) {
            this.f4356a.I().p();
            h6Var.onActivityCreated((Activity) g4.b.f(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityDestroyed(g4.a aVar, long j10) {
        e();
        h6 h6Var = this.f4356a.I().f4613c;
        if (h6Var != null) {
            this.f4356a.I().p();
            h6Var.onActivityDestroyed((Activity) g4.b.f(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityPaused(g4.a aVar, long j10) {
        e();
        h6 h6Var = this.f4356a.I().f4613c;
        if (h6Var != null) {
            this.f4356a.I().p();
            h6Var.onActivityPaused((Activity) g4.b.f(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityResumed(g4.a aVar, long j10) {
        e();
        h6 h6Var = this.f4356a.I().f4613c;
        if (h6Var != null) {
            this.f4356a.I().p();
            h6Var.onActivityResumed((Activity) g4.b.f(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivitySaveInstanceState(g4.a aVar, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        e();
        h6 h6Var = this.f4356a.I().f4613c;
        Bundle bundle = new Bundle();
        if (h6Var != null) {
            this.f4356a.I().p();
            h6Var.onActivitySaveInstanceState((Activity) g4.b.f(aVar), bundle);
        }
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4356a.d().w().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStarted(g4.a aVar, long j10) {
        e();
        if (this.f4356a.I().f4613c != null) {
            this.f4356a.I().p();
            Activity activity = (Activity) g4.b.f(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStopped(g4.a aVar, long j10) {
        e();
        if (this.f4356a.I().f4613c != null) {
            this.f4356a.I().p();
            Activity activity = (Activity) g4.b.f(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        e();
        i1Var.T(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.l1 l1Var) {
        p4.u uVar;
        e();
        synchronized (this.f4357b) {
            uVar = (p4.u) this.f4357b.get(Integer.valueOf(l1Var.d()));
            if (uVar == null) {
                uVar = new m9(this, l1Var);
                this.f4357b.put(Integer.valueOf(l1Var.d()), uVar);
            }
        }
        this.f4356a.I().x(uVar);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void resetAnalyticsData(long j10) {
        e();
        this.f4356a.I().y(j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        e();
        if (bundle == null) {
            this.f4356a.d().r().a("Conditional user property must not be null");
        } else {
            this.f4356a.I().E(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsent(final Bundle bundle, final long j10) {
        e();
        final i6 I = this.f4356a.I();
        I.f4438a.b().A(new Runnable() { // from class: com.google.android.gms.measurement.internal.h5
            @Override // java.lang.Runnable
            public final void run() {
                i6 i6Var = i6.this;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(i6Var.f4438a.B().t())) {
                    i6Var.F(bundle2, 0, j11);
                } else {
                    i6Var.f4438a.d().x().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsentThirdParty(Bundle bundle, long j10) {
        e();
        this.f4356a.I().F(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setCurrentScreen(g4.a aVar, String str, String str2, long j10) {
        e();
        this.f4356a.K().D((Activity) g4.b.f(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDataCollectionEnabled(boolean z10) {
        e();
        i6 I = this.f4356a.I();
        I.i();
        I.f4438a.b().z(new f6(I, z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDefaultEventParameters(Bundle bundle) {
        e();
        final i6 I = this.f4356a.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        I.f4438a.b().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.i5
            @Override // java.lang.Runnable
            public final void run() {
                i6.this.q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.l1 l1Var) {
        e();
        l9 l9Var = new l9(this, l1Var);
        if (this.f4356a.b().C()) {
            this.f4356a.I().H(l9Var);
        } else {
            this.f4356a.b().z(new g9(this, l9Var));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.n1 n1Var) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMeasurementEnabled(boolean z10, long j10) {
        e();
        this.f4356a.I().I(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMinimumSessionDuration(long j10) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setSessionTimeoutDuration(long j10) {
        e();
        i6 I = this.f4356a.I();
        I.f4438a.b().z(new n5(I, j10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserId(final String str, long j10) {
        e();
        final i6 I = this.f4356a.I();
        if (str != null && TextUtils.isEmpty(str)) {
            I.f4438a.d().w().a("User ID must be non-empty or null");
            return;
        }
        I.f4438a.b().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.j5
            @Override // java.lang.Runnable
            public final void run() {
                i6 i6Var = i6.this;
                if (i6Var.f4438a.B().w(str)) {
                    i6Var.f4438a.B().v();
                }
            }
        });
        I.L(null, "_id", str, true, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserProperty(String str, String str2, g4.a aVar, boolean z10, long j10) {
        e();
        this.f4356a.I().L(str, str2, g4.b.f(aVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.l1 l1Var) {
        p4.u uVar;
        e();
        synchronized (this.f4357b) {
            uVar = (p4.u) this.f4357b.remove(Integer.valueOf(l1Var.d()));
        }
        if (uVar == null) {
            uVar = new m9(this, l1Var);
        }
        this.f4356a.I().N(uVar);
    }
}
