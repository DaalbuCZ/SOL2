package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class h extends c5 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4574b;

    /* renamed from: c  reason: collision with root package name */
    private g f4575c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f4576d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j4 j4Var) {
        super(j4Var);
        this.f4575c = f.f4508a;
    }

    public static final long I() {
        return ((Long) u2.f5045e.a(null)).longValue();
    }

    public static final long i() {
        return ((Long) u2.E.a(null)).longValue();
    }

    private final String j(String str, String str2) {
        d3 r10;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            z3.o.i(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            r10 = this.f4438a.d().r();
            str3 = "Could not find SystemProperties class";
            r10.b(str3, e);
            return "";
        } catch (IllegalAccessException e11) {
            e = e11;
            r10 = this.f4438a.d().r();
            str3 = "Could not access SystemProperties.get()";
            r10.b(str3, e);
            return "";
        } catch (NoSuchMethodException e12) {
            e = e12;
            r10 = this.f4438a.d().r();
            str3 = "Could not find SystemProperties.get() method";
            r10.b(str3, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            r10 = this.f4438a.d().r();
            str3 = "SystemProperties.get() threw an exception";
            r10.b(str3, e);
            return "";
        }
    }

    public final boolean A() {
        Boolean t10 = t("google_analytics_adid_collection_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean B(String str, t2 t2Var) {
        Object a10;
        if (str != null) {
            String a11 = this.f4575c.a(str, t2Var.b());
            if (!TextUtils.isEmpty(a11)) {
                a10 = t2Var.a(Boolean.valueOf("1".equals(a11)));
                return ((Boolean) a10).booleanValue();
            }
        }
        a10 = t2Var.a(null);
        return ((Boolean) a10).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.f4575c.a(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean t10 = t("google_analytics_automatic_screen_reporting_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean E() {
        this.f4438a.f();
        Boolean t10 = t("firebase_analytics_collection_deactivated");
        return t10 != null && t10.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.f4575c.a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        if (this.f4574b == null) {
            Boolean t10 = t("app_measurement_lite");
            this.f4574b = t10;
            if (t10 == null) {
                this.f4574b = Boolean.FALSE;
            }
        }
        return this.f4574b.booleanValue() || !this.f4438a.s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean H() {
        if (this.f4576d == null) {
            synchronized (this) {
                if (this.f4576d == null) {
                    ApplicationInfo applicationInfo = this.f4438a.c().getApplicationInfo();
                    String a10 = d4.m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(a10)) {
                            z10 = true;
                        }
                        this.f4576d = Boolean.valueOf(z10);
                    }
                    if (this.f4576d == null) {
                        this.f4576d = Boolean.TRUE;
                        this.f4438a.d().r().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f4576d.booleanValue();
    }

    public final double k(String str, t2 t2Var) {
        if (str != null) {
            String a10 = this.f4575c.a(str, t2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Double) t2Var.a(Double.valueOf(Double.parseDouble(a10)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) t2Var.a(null)).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l(String str) {
        return p(str, u2.I, 500, 2000);
    }

    public final int m() {
        i9 N = this.f4438a.N();
        Boolean J = N.f4438a.L().J();
        if (N.o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int n(String str) {
        return p(str, u2.J, 25, 100);
    }

    public final int o(String str, t2 t2Var) {
        if (str != null) {
            String a10 = this.f4575c.a(str, t2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Integer) t2Var.a(Integer.valueOf(Integer.parseInt(a10)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) t2Var.a(null)).intValue();
    }

    public final int p(String str, t2 t2Var, int i10, int i11) {
        return Math.max(Math.min(o(str, t2Var), i11), i10);
    }

    public final long q() {
        this.f4438a.f();
        return 74029L;
    }

    public final long r(String str, t2 t2Var) {
        if (str != null) {
            String a10 = this.f4575c.a(str, t2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Long) t2Var.a(Long.valueOf(Long.parseLong(a10)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) t2Var.a(null)).longValue();
    }

    final Bundle s() {
        try {
            if (this.f4438a.c().getPackageManager() == null) {
                this.f4438a.d().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = f4.c.a(this.f4438a.c()).c(this.f4438a.c().getPackageName(), 128);
            if (c10 == null) {
                this.f4438a.d().r().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f4438a.d().r().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean t(String str) {
        z3.o.e(str);
        Bundle s10 = s();
        if (s10 == null) {
            this.f4438a.d().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (s10.containsKey(str)) {
            return Boolean.valueOf(s10.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String u() {
        return j("debug.firebase.analytics.app", "");
    }

    public final String v() {
        return j("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w() {
        this.f4438a.f();
        return "FA";
    }

    public final String x(String str, t2 t2Var) {
        return (String) t2Var.a(str == null ? null : this.f4575c.a(str, t2Var.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            z3.o.e(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.j4 r0 = r3.f4438a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.j4 r0 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r0 = r0.d()
            com.google.android.gms.measurement.internal.d3 r0 = r0.r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h.y(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(g gVar) {
        this.f4575c = gVar;
    }
}
