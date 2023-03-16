package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class v6 extends w3 {

    /* renamed from: c  reason: collision with root package name */
    private volatile o6 f5115c;

    /* renamed from: d  reason: collision with root package name */
    private volatile o6 f5116d;

    /* renamed from: e  reason: collision with root package name */
    protected o6 f5117e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f5118f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f5119g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f5120h;

    /* renamed from: i  reason: collision with root package name */
    private volatile o6 f5121i;

    /* renamed from: j  reason: collision with root package name */
    private o6 f5122j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5123k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f5124l;

    public v6(j4 j4Var) {
        super(j4Var);
        this.f5124l = new Object();
        this.f5118f = new ConcurrentHashMap();
    }

    private final o6 F(Activity activity) {
        z3.o.i(activity);
        o6 o6Var = (o6) this.f5118f.get(activity);
        if (o6Var == null) {
            o6 o6Var2 = new o6(null, t(activity.getClass(), "Activity"), this.f4438a.N().r0());
            this.f5118f.put(activity, o6Var2);
            o6Var = o6Var2;
        }
        return this.f5121i != null ? this.f5121i : o6Var;
    }

    private final void G(Activity activity, o6 o6Var, boolean z10) {
        o6 o6Var2;
        o6 o6Var3 = this.f5115c == null ? this.f5116d : this.f5115c;
        if (o6Var.f4855b == null) {
            o6Var2 = new o6(o6Var.f4854a, activity != null ? t(activity.getClass(), "Activity") : null, o6Var.f4856c, o6Var.f4858e, o6Var.f4859f);
        } else {
            o6Var2 = o6Var;
        }
        this.f5116d = this.f5115c;
        this.f5115c = o6Var2;
        this.f4438a.b().z(new q6(this, o6Var2, o6Var3, this.f4438a.e().b(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [long, android.os.Bundle] */
    public final void o(o6 o6Var, o6 o6Var2, long j10, boolean z10, Bundle bundle) {
        long j11;
        h();
        boolean z11 = false;
        boolean z12 = (o6Var2 != null && o6Var2.f4856c == o6Var.f4856c && p4.y.a(o6Var2.f4855b, o6Var.f4855b) && p4.y.a(o6Var2.f4854a, o6Var.f4854a)) ? false : true;
        if (z10 && this.f5117e != null) {
            z11 = true;
        }
        if (z12) {
            i9.y(o6Var, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (o6Var2 != null) {
                String str = o6Var2.f4854a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = o6Var2.f4855b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r82 = o6Var2.f4856c;
                r82.putLong("_pi", r82);
            }
            ?? r83 = 0;
            if (z11) {
                j8 j8Var = this.f4438a.M().f4747e;
                long j12 = j10 - j8Var.f4692b;
                j8Var.f4692b = j10;
                if (j12 > 0) {
                    this.f4438a.N().w(null, j12);
                }
            }
            if (!this.f4438a.z().D()) {
                r83.putLong("_mst", 1L);
            }
            String str3 = true != o6Var.f4858e ? "auto" : "app";
            long a10 = this.f4438a.e().a();
            if (o6Var.f4858e) {
                a10 = o6Var.f4859f;
                if (a10 != 0) {
                    j11 = a10;
                    this.f4438a.I().v(str3, "_vs", j11, null);
                }
            }
            j11 = a10;
            this.f4438a.I().v(str3, "_vs", j11, null);
        }
        if (z11) {
            p(this.f5117e, true, j10);
        }
        this.f5117e = o6Var;
        if (o6Var.f4858e) {
            this.f5122j = o6Var;
        }
        this.f4438a.L().u(o6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(o6 o6Var, boolean z10, long j10) {
        this.f4438a.y().n(this.f4438a.e().b());
        if (!this.f4438a.M().f4747e.d(o6Var != null && o6Var.f4857d, z10, j10) || o6Var == null) {
            return;
        }
        o6Var.f4857d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void w(v6 v6Var, Bundle bundle, o6 o6Var, o6 o6Var2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        v6Var.o(o6Var, o6Var2, j10, true, v6Var.f4438a.N().v0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f5124l) {
            this.f5123k = false;
            this.f5120h = true;
        }
        long b10 = this.f4438a.e().b();
        if (!this.f4438a.z().D()) {
            this.f5115c = null;
            this.f4438a.b().z(new s6(this, b10));
            return;
        }
        o6 F = F(activity);
        this.f5116d = this.f5115c;
        this.f5115c = null;
        this.f4438a.b().z(new t6(this, F, b10));
    }

    public final void B(Activity activity) {
        synchronized (this.f5124l) {
            this.f5123k = true;
            if (activity != this.f5119g) {
                synchronized (this.f5124l) {
                    this.f5119g = activity;
                    this.f5120h = false;
                }
                if (this.f4438a.z().D()) {
                    this.f5121i = null;
                    this.f4438a.b().z(new u6(this));
                }
            }
        }
        if (!this.f4438a.z().D()) {
            this.f5115c = this.f5121i;
            this.f4438a.b().z(new r6(this));
            return;
        }
        G(activity, F(activity), false);
        a2 y10 = this.f4438a.y();
        y10.f4438a.b().z(new z0(y10, y10.f4438a.e().b()));
    }

    public final void C(Activity activity, Bundle bundle) {
        o6 o6Var;
        if (!this.f4438a.z().D() || bundle == null || (o6Var = (o6) this.f5118f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", o6Var.f4856c);
        bundle2.putString("name", o6Var.f4854a);
        bundle2.putString("referrer_name", o6Var.f4855b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.j4 r0 = r3.f4438a
            com.google.android.gms.measurement.internal.h r0 = r0.z()
            boolean r0 = r0.D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.o6 r0 = r3.f5115c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f5118f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.t(r6, r1)
        L54:
            java.lang.String r1 = r0.f4855b
            boolean r1 = p4.y.a(r1, r6)
            java.lang.String r0 = r0.f4854a
            boolean r0 = p4.y.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.j4 r1 = r3.f4438a
            r1.z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.j4 r1 = r3.f4438a
            r1.z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.j4 r4 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r4 = r4.d()
            com.google.android.gms.measurement.internal.d3 r4 = r4.x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.j4 r0 = r3.f4438a
            com.google.android.gms.measurement.internal.f3 r0 = r0.d()
            com.google.android.gms.measurement.internal.d3 r0 = r0.v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.o6 r0 = new com.google.android.gms.measurement.internal.o6
            com.google.android.gms.measurement.internal.j4 r1 = r3.f4438a
            com.google.android.gms.measurement.internal.i9 r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f5118f
            r5.put(r4, r0)
            r5 = 1
            r3.G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.E(android.os.Bundle, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean n() {
        return false;
    }

    public final o6 r() {
        return this.f5115c;
    }

    public final o6 s(boolean z10) {
        i();
        h();
        if (z10) {
            o6 o6Var = this.f5117e;
            return o6Var != null ? o6Var : this.f5122j;
        }
        return this.f5117e;
    }

    final String t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f4438a.z();
        if (length2 > 100) {
            this.f4438a.z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f4438a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f5118f.put(activity, new o6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.f5124l) {
            if (activity == this.f5119g) {
                this.f5119g = null;
            }
        }
        if (this.f4438a.z().D()) {
            this.f5118f.remove(activity);
        }
    }
}
