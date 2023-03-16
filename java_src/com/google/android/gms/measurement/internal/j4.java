package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ad;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j4 implements e5 {
    private static volatile j4 H;
    private volatile Boolean A;
    protected Boolean B;
    protected Boolean C;
    private volatile boolean D;
    private int E;
    final long G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4656a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4657b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4658c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4659d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4660e;

    /* renamed from: f  reason: collision with root package name */
    private final c f4661f;

    /* renamed from: g  reason: collision with root package name */
    private final h f4662g;

    /* renamed from: h  reason: collision with root package name */
    private final s3 f4663h;

    /* renamed from: i  reason: collision with root package name */
    private final f3 f4664i;

    /* renamed from: j  reason: collision with root package name */
    private final h4 f4665j;

    /* renamed from: k  reason: collision with root package name */
    private final l8 f4666k;

    /* renamed from: l  reason: collision with root package name */
    private final i9 f4667l;

    /* renamed from: m  reason: collision with root package name */
    private final a3 f4668m;

    /* renamed from: n  reason: collision with root package name */
    private final d4.e f4669n;

    /* renamed from: o  reason: collision with root package name */
    private final v6 f4670o;

    /* renamed from: p  reason: collision with root package name */
    private final i6 f4671p;

    /* renamed from: q  reason: collision with root package name */
    private final a2 f4672q;

    /* renamed from: r  reason: collision with root package name */
    private final m6 f4673r;

    /* renamed from: s  reason: collision with root package name */
    private final String f4674s;

    /* renamed from: t  reason: collision with root package name */
    private z2 f4675t;

    /* renamed from: u  reason: collision with root package name */
    private v7 f4676u;

    /* renamed from: v  reason: collision with root package name */
    private p f4677v;

    /* renamed from: w  reason: collision with root package name */
    private w2 f4678w;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f4680y;

    /* renamed from: z  reason: collision with root package name */
    private long f4681z;

    /* renamed from: x  reason: collision with root package name */
    private boolean f4679x = false;
    private final AtomicInteger F = new AtomicInteger(0);

    j4(g5 g5Var) {
        d3 w10;
        String str;
        Bundle bundle;
        boolean z10 = false;
        z3.o.i(g5Var);
        Context context = g5Var.f4554a;
        c cVar = new c(context);
        this.f4661f = cVar;
        s2.f4968a = cVar;
        this.f4656a = context;
        this.f4657b = g5Var.f4555b;
        this.f4658c = g5Var.f4556c;
        this.f4659d = g5Var.f4557d;
        this.f4660e = g5Var.f4561h;
        this.A = g5Var.f4558e;
        this.f4674s = g5Var.f4563j;
        this.D = true;
        com.google.android.gms.internal.measurement.o1 o1Var = g5Var.f4560g;
        if (o1Var != null && (bundle = o1Var.f4046t) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = o1Var.f4046t.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.d7.e(context);
        d4.e d10 = d4.h.d();
        this.f4669n = d10;
        Long l10 = g5Var.f4562i;
        this.G = l10 != null ? l10.longValue() : d10.a();
        this.f4662g = new h(this);
        s3 s3Var = new s3(this);
        s3Var.l();
        this.f4663h = s3Var;
        f3 f3Var = new f3(this);
        f3Var.l();
        this.f4664i = f3Var;
        i9 i9Var = new i9(this);
        i9Var.l();
        this.f4667l = i9Var;
        this.f4668m = new a3(new f5(g5Var, this));
        this.f4672q = new a2(this);
        v6 v6Var = new v6(this);
        v6Var.j();
        this.f4670o = v6Var;
        i6 i6Var = new i6(this);
        i6Var.j();
        this.f4671p = i6Var;
        l8 l8Var = new l8(this);
        l8Var.j();
        this.f4666k = l8Var;
        m6 m6Var = new m6(this);
        m6Var.l();
        this.f4673r = m6Var;
        h4 h4Var = new h4(this);
        h4Var.l();
        this.f4665j = h4Var;
        com.google.android.gms.internal.measurement.o1 o1Var2 = g5Var.f4560g;
        z10 = (o1Var2 == null || o1Var2.f4041o == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            i6 I = I();
            if (I.f4438a.f4656a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f4438a.f4656a.getApplicationContext();
                if (I.f4613c == null) {
                    I.f4613c = new h6(I, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(I.f4613c);
                    application.registerActivityLifecycleCallbacks(I.f4613c);
                    w10 = I.f4438a.d().v();
                    str = "Registered activity lifecycle callback";
                }
            }
            h4Var.z(new i4(this, g5Var));
        }
        w10 = d().w();
        str = "Application context is not an Application";
        w10.a(str);
        h4Var.z(new i4(this, g5Var));
    }

    public static j4 H(Context context, com.google.android.gms.internal.measurement.o1 o1Var, Long l10) {
        Bundle bundle;
        if (o1Var != null && (o1Var.f4044r == null || o1Var.f4045s == null)) {
            o1Var = new com.google.android.gms.internal.measurement.o1(o1Var.f4040n, o1Var.f4041o, o1Var.f4042p, o1Var.f4043q, null, null, o1Var.f4046t, null);
        }
        z3.o.i(context);
        z3.o.i(context.getApplicationContext());
        if (H == null) {
            synchronized (j4.class) {
                if (H == null) {
                    H = new j4(new g5(context, o1Var, l10));
                }
            }
        } else if (o1Var != null && (bundle = o1Var.f4046t) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            z3.o.i(H);
            H.A = Boolean.valueOf(o1Var.f4046t.getBoolean("dataCollectionDefaultEnabled"));
        }
        z3.o.i(H);
        return H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a(j4 j4Var, g5 g5Var) {
        j4Var.b().h();
        j4Var.f4662g.w();
        p pVar = new p(j4Var);
        pVar.l();
        j4Var.f4677v = pVar;
        w2 w2Var = new w2(j4Var, g5Var.f4559f);
        w2Var.j();
        j4Var.f4678w = w2Var;
        z2 z2Var = new z2(j4Var);
        z2Var.j();
        j4Var.f4675t = z2Var;
        v7 v7Var = new v7(j4Var);
        v7Var.j();
        j4Var.f4676u = v7Var;
        j4Var.f4667l.m();
        j4Var.f4663h.m();
        j4Var.f4678w.k();
        d3 u10 = j4Var.d().u();
        j4Var.f4662g.q();
        u10.b("App measurement initialized, version", 74029L);
        j4Var.d().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s10 = w2Var.s();
        if (TextUtils.isEmpty(j4Var.f4657b)) {
            if (j4Var.N().T(s10)) {
                j4Var.d().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                j4Var.d().u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s10)));
            }
        }
        j4Var.d().q().a("Debug-level message logging enabled");
        if (j4Var.E != j4Var.F.get()) {
            j4Var.d().r().c("Not all components initialized", Integer.valueOf(j4Var.E), Integer.valueOf(j4Var.F.get()));
        }
        j4Var.f4679x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void u(c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void v(w3 w3Var) {
        if (w3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!w3Var.m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w3Var.getClass())));
        }
    }

    private static final void w(d5 d5Var) {
        if (d5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!d5Var.n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d5Var.getClass())));
        }
    }

    @Pure
    public final p A() {
        w(this.f4677v);
        return this.f4677v;
    }

    @Pure
    public final w2 B() {
        v(this.f4678w);
        return this.f4678w;
    }

    @Pure
    public final z2 C() {
        v(this.f4675t);
        return this.f4675t;
    }

    @Pure
    public final a3 D() {
        return this.f4668m;
    }

    public final f3 E() {
        f3 f3Var = this.f4664i;
        if (f3Var == null || !f3Var.n()) {
            return null;
        }
        return f3Var;
    }

    @Pure
    public final s3 F() {
        u(this.f4663h);
        return this.f4663h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SideEffectFree
    public final h4 G() {
        return this.f4665j;
    }

    @Pure
    public final i6 I() {
        v(this.f4671p);
        return this.f4671p;
    }

    @Pure
    public final m6 J() {
        w(this.f4673r);
        return this.f4673r;
    }

    @Pure
    public final v6 K() {
        v(this.f4670o);
        return this.f4670o;
    }

    @Pure
    public final v7 L() {
        v(this.f4676u);
        return this.f4676u;
    }

    @Pure
    public final l8 M() {
        v(this.f4666k);
        return this.f4666k;
    }

    @Pure
    public final i9 N() {
        u(this.f4667l);
        return this.f4667l;
    }

    @Pure
    public final String O() {
        return this.f4657b;
    }

    @Pure
    public final String P() {
        return this.f4658c;
    }

    @Pure
    public final String Q() {
        return this.f4659d;
    }

    @Pure
    public final String R() {
        return this.f4674s;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    @Pure
    public final h4 b() {
        w(this.f4665j);
        return this.f4665j;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    @Pure
    public final Context c() {
        return this.f4656a;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    @Pure
    public final f3 d() {
        w(this.f4664i);
        return this.f4664i;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    @Pure
    public final d4.e e() {
        return this.f4669n;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    @Pure
    public final c f() {
        return this.f4661f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            F().f4986s.a(true);
            if (bArr == null || bArr.length == 0) {
                d().q().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    d().q().a("Deferred Deep Link is empty.");
                    return;
                }
                i9 N = N();
                j4 j4Var = N.f4438a;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = N.f4438a.f4656a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.f4671p.u("auto", "_cmp", bundle);
                    i9 N2 = N();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = N2.f4438a.f4656a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            N2.f4438a.f4656a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e10) {
                        N2.f4438a.d().r().b("Failed to persist Deferred Deep Link. exception", e10);
                        return;
                    }
                }
                d().w().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e11) {
                d().r().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.E++;
    }

    public final void j() {
        b().h();
        w(J());
        String s10 = B().s();
        Pair p10 = F().p(s10);
        if (!this.f4662g.A() || ((Boolean) p10.second).booleanValue() || TextUtils.isEmpty((CharSequence) p10.first)) {
            d().q().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        m6 J = J();
        J.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f4438a.f4656a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            d().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        i9 N = N();
        B().f4438a.f4662g.q();
        URL s11 = N.s(74029L, s10, (String) p10.first, F().f4987t.a() - 1);
        if (s11 != null) {
            m6 J2 = J();
            p4.n nVar = new p4.n(this);
            J2.h();
            J2.k();
            z3.o.i(s11);
            z3.o.i(nVar);
            J2.f4438a.b().y(new l6(J2, s10, s11, null, null, nVar, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void l(boolean z10) {
        b().h();
        this.D = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(com.google.android.gms.internal.measurement.o1 o1Var) {
        p4.b bVar;
        b().h();
        p4.b q10 = F().q();
        s3 F = F();
        j4 j4Var = F.f4438a;
        F.h();
        int i10 = 100;
        int i11 = F.o().getInt("consent_source", 100);
        h hVar = this.f4662g;
        j4 j4Var2 = hVar.f4438a;
        Boolean t10 = hVar.t("google_analytics_default_allow_ad_storage");
        h hVar2 = this.f4662g;
        j4 j4Var3 = hVar2.f4438a;
        Boolean t11 = hVar2.t("google_analytics_default_allow_analytics_storage");
        if (!(t10 == null && t11 == null) && F().w(-10)) {
            bVar = new p4.b(t10, t11);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(B().t()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                I().G(p4.b.f12399b, -10, this.G);
            } else if (TextUtils.isEmpty(B().t()) && o1Var != null && o1Var.f4046t != null && F().w(30)) {
                bVar = p4.b.a(o1Var.f4046t);
                if (!bVar.equals(p4.b.f12399b)) {
                    i10 = 30;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            I().G(bVar, i10, this.G);
            q10 = bVar;
        }
        I().J(q10);
        if (F().f4972e.a() == 0) {
            d().v().b("Persisting first open", Long.valueOf(this.G));
            F().f4972e.b(this.G);
        }
        I().f4624n.c();
        if (r()) {
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().r())) {
                i9 N = N();
                String t12 = B().t();
                s3 F2 = F();
                F2.h();
                String string = F2.o().getString("gmp_app_id", null);
                String r10 = B().r();
                s3 F3 = F();
                F3.h();
                if (N.b0(t12, string, r10, F3.o().getString("admob_app_id", null))) {
                    d().u().a("Rechecking which service to use due to a GMP App Id change");
                    s3 F4 = F();
                    F4.h();
                    Boolean r11 = F4.r();
                    SharedPreferences.Editor edit = F4.o().edit();
                    edit.clear();
                    edit.apply();
                    if (r11 != null) {
                        F4.s(r11);
                    }
                    C().q();
                    this.f4676u.Q();
                    this.f4676u.P();
                    F().f4972e.b(this.G);
                    F().f4974g.b(null);
                }
                s3 F5 = F();
                String t13 = B().t();
                F5.h();
                SharedPreferences.Editor edit2 = F5.o().edit();
                edit2.putString("gmp_app_id", t13);
                edit2.apply();
                s3 F6 = F();
                String r12 = B().r();
                F6.h();
                SharedPreferences.Editor edit3 = F6.o().edit();
                edit3.putString("admob_app_id", r12);
                edit3.apply();
            }
            if (!F().q().i(p4.a.ANALYTICS_STORAGE)) {
                F().f4974g.b(null);
            }
            I().C(F().f4974g.a());
            ad.c();
            if (this.f4662g.B(null, u2.f5046e0)) {
                try {
                    N().f4438a.f4656a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().f4988u.a())) {
                        d().w().a("Remote config removed with active feature rollouts");
                        F().f4988u.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().r())) {
                boolean o10 = o();
                if (!F().u() && !this.f4662g.E()) {
                    F().t(!o10);
                }
                if (o10) {
                    I().f0();
                }
                M().f4746d.a();
                L().S(new AtomicReference());
                L().v(F().f4991x.a());
            }
        } else if (o()) {
            if (!N().S("android.permission.INTERNET")) {
                d().r().a("App is missing INTERNET permission");
            }
            if (!N().S("android.permission.ACCESS_NETWORK_STATE")) {
                d().r().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!f4.c.a(this.f4656a).f() && !this.f4662g.G()) {
                if (!i9.Y(this.f4656a)) {
                    d().r().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!i9.Z(this.f4656a, false)) {
                    d().r().a("AppMeasurementService not registered/enabled");
                }
            }
            d().r().a("Uploading is not possible. App measurement disabled");
        }
        F().f4981n.a(true);
    }

    public final boolean n() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean o() {
        return x() == 0;
    }

    public final boolean p() {
        b().h();
        return this.D;
    }

    @Pure
    public final boolean q() {
        return TextUtils.isEmpty(this.f4657b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r() {
        if (this.f4679x) {
            b().h();
            Boolean bool = this.f4680y;
            if (bool == null || this.f4681z == 0 || (!bool.booleanValue() && Math.abs(this.f4669n.b() - this.f4681z) > 1000)) {
                this.f4681z = this.f4669n.b();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(N().S("android.permission.INTERNET") && N().S("android.permission.ACCESS_NETWORK_STATE") && (f4.c.a(this.f4656a).f() || this.f4662g.G() || (i9.Y(this.f4656a) && i9.Z(this.f4656a, false))));
                this.f4680y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!N().L(B().t(), B().r()) && TextUtils.isEmpty(B().r())) {
                        z10 = false;
                    }
                    this.f4680y = Boolean.valueOf(z10);
                }
            }
            return this.f4680y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean s() {
        return this.f4660e;
    }

    public final int x() {
        b().h();
        if (this.f4662g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool == null || !bool.booleanValue()) {
            b().h();
            if (this.D) {
                Boolean r10 = F().r();
                if (r10 != null) {
                    return r10.booleanValue() ? 0 : 3;
                }
                h hVar = this.f4662g;
                c cVar = hVar.f4438a.f4661f;
                Boolean t10 = hVar.t("firebase_analytics_collection_enabled");
                if (t10 != null) {
                    return t10.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Pure
    public final a2 y() {
        a2 a2Var = this.f4672q;
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final h z() {
        return this.f4662g;
    }
}
