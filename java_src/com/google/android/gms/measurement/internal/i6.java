package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.internal.measurement.je;
import com.google.android.gms.internal.measurement.kd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class i6 extends w3 {

    /* renamed from: c  reason: collision with root package name */
    protected h6 f4613c;

    /* renamed from: d  reason: collision with root package name */
    private p4.t f4614d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f4615e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4616f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f4617g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f4618h;

    /* renamed from: i  reason: collision with root package name */
    private p4.b f4619i;

    /* renamed from: j  reason: collision with root package name */
    private int f4620j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicLong f4621k;

    /* renamed from: l  reason: collision with root package name */
    private long f4622l;

    /* renamed from: m  reason: collision with root package name */
    private int f4623m;

    /* renamed from: n  reason: collision with root package name */
    final p9 f4624n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f4625o;

    /* renamed from: p  reason: collision with root package name */
    private final h9 f4626p;

    /* JADX INFO: Access modifiers changed from: protected */
    public i6(j4 j4Var) {
        super(j4Var);
        this.f4615e = new CopyOnWriteArraySet();
        this.f4618h = new Object();
        this.f4625o = true;
        this.f4626p = new x5(this);
        this.f4617g = new AtomicReference();
        this.f4619i = new p4.b(null, null);
        this.f4620j = 100;
        this.f4622l = -1L;
        this.f4623m = 100;
        this.f4621k = new AtomicLong(0L);
        this.f4624n = new p9(j4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Boolean bool, boolean z10) {
        h();
        i();
        this.f4438a.d().q().b("Setting app measurement enabled (FE)", bool);
        this.f4438a.F().s(bool);
        if (z10) {
            s3 F = this.f4438a.F();
            j4 j4Var = F.f4438a;
            F.h();
            SharedPreferences.Editor edit = F.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f4438a.p() || !(bool == null || bool.booleanValue())) {
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        Long valueOf;
        h();
        String a10 = this.f4438a.F().f4980m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(true != "true".equals(a10) ? 0L : 1L);
            }
            M("app", "_npa", valueOf, this.f4438a.e().a());
        }
        if (!this.f4438a.o() || !this.f4625o) {
            this.f4438a.d().q().a("Updating Scion state (FE)");
            this.f4438a.L().w();
            return;
        }
        this.f4438a.d().q().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        kd.c();
        if (this.f4438a.z().B(null, u2.f5048f0)) {
            this.f4438a.M().f4746d.a();
        }
        this.f4438a.b().z(new l5(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void b0(i6 i6Var, p4.b bVar, p4.b bVar2) {
        boolean z10;
        p4.a[] aVarArr = {p4.a.ANALYTICS_STORAGE, p4.a.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            }
            p4.a aVar = aVarArr[i10];
            if (!bVar2.i(aVar) && bVar.i(aVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean l10 = bVar.l(bVar2, p4.a.ANALYTICS_STORAGE, p4.a.AD_STORAGE);
        if (z10 || l10) {
            i6Var.f4438a.B().v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(i6 i6Var, p4.b bVar, int i10, long j10, boolean z10, boolean z11) {
        i6Var.h();
        i6Var.i();
        if (j10 <= i6Var.f4622l && p4.b.j(i6Var.f4623m, i10)) {
            i6Var.f4438a.d().u().b("Dropped out-of-date consent setting, proposed settings", bVar);
            return;
        }
        s3 F = i6Var.f4438a.F();
        j4 j4Var = F.f4438a;
        F.h();
        if (!F.w(i10)) {
            i6Var.f4438a.d().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        SharedPreferences.Editor edit = F.o().edit();
        edit.putString("consent_settings", bVar.h());
        edit.putInt("consent_source", i10);
        edit.apply();
        i6Var.f4622l = j10;
        i6Var.f4623m = i10;
        i6Var.f4438a.L().t(z10);
        if (z11) {
            i6Var.f4438a.L().S(new AtomicReference());
        }
    }

    protected final void A(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f4438a.b().z(new o5(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void B(String str, String str2, long j10, Object obj) {
        this.f4438a.b().z(new p5(this, str, str2, obj, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(String str) {
        this.f4617g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.f4438a.e().a());
    }

    public final void E(Bundle bundle, long j10) {
        z3.o.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f4438a.d().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        z3.o.i(bundle2);
        p4.p.a(bundle2, "app_id", String.class, null);
        p4.p.a(bundle2, "origin", String.class, null);
        p4.p.a(bundle2, "name", String.class, null);
        p4.p.a(bundle2, "value", Object.class, null);
        p4.p.a(bundle2, "trigger_event_name", String.class, null);
        p4.p.a(bundle2, "trigger_timeout", Long.class, 0L);
        p4.p.a(bundle2, "timed_out_event_name", String.class, null);
        p4.p.a(bundle2, "timed_out_event_params", Bundle.class, null);
        p4.p.a(bundle2, "triggered_event_name", String.class, null);
        p4.p.a(bundle2, "triggered_event_params", Bundle.class, null);
        p4.p.a(bundle2, "time_to_live", Long.class, 0L);
        p4.p.a(bundle2, "expired_event_name", String.class, null);
        p4.p.a(bundle2, "expired_event_params", Bundle.class, null);
        z3.o.e(bundle2.getString("name"));
        z3.o.e(bundle2.getString("origin"));
        z3.o.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f4438a.N().n0(string) != 0) {
            this.f4438a.d().r().b("Invalid conditional user property name", this.f4438a.D().f(string));
        } else if (this.f4438a.N().j0(string, obj) != 0) {
            this.f4438a.d().r().c("Invalid conditional user property value", this.f4438a.D().f(string), obj);
        } else {
            Object p10 = this.f4438a.N().p(string, obj);
            if (p10 == null) {
                this.f4438a.d().r().c("Unable to normalize conditional user property value", this.f4438a.D().f(string), obj);
                return;
            }
            p4.p.b(bundle2, p10);
            long j11 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f4438a.z();
                if (j11 > 15552000000L || j11 < 1) {
                    this.f4438a.d().r().c("Invalid conditional user property timeout", this.f4438a.D().f(string), Long.valueOf(j11));
                    return;
                }
            }
            long j12 = bundle2.getLong("time_to_live");
            this.f4438a.z();
            if (j12 > 15552000000L || j12 < 1) {
                this.f4438a.d().r().c("Invalid conditional user property time to live", this.f4438a.D().f(string), Long.valueOf(j12));
            } else {
                this.f4438a.b().z(new r5(this, bundle2));
            }
        }
    }

    public final void F(Bundle bundle, int i10, long j10) {
        i();
        String g10 = p4.b.g(bundle);
        if (g10 != null) {
            this.f4438a.d().x().b("Ignoring invalid consent setting", g10);
            this.f4438a.d().x().a("Valid consent values are 'granted', 'denied'");
        }
        G(p4.b.a(bundle), i10, j10);
    }

    public final void G(p4.b bVar, int i10, long j10) {
        p4.b bVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        p4.b bVar3 = bVar;
        i();
        if (i10 != -10 && bVar.e() == null && bVar.f() == null) {
            this.f4438a.d().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f4618h) {
            bVar2 = this.f4619i;
            z10 = true;
            z11 = false;
            if (p4.b.j(i10, this.f4620j)) {
                boolean k10 = bVar3.k(this.f4619i);
                p4.a aVar = p4.a.ANALYTICS_STORAGE;
                if (bVar3.i(aVar) && !this.f4619i.i(aVar)) {
                    z11 = true;
                }
                bVar3 = bVar3.d(this.f4619i);
                this.f4619i = bVar3;
                this.f4620j = i10;
                z12 = z11;
                z11 = k10;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.f4438a.d().u().b("Ignoring lower-priority consent settings, proposed settings", bVar3);
            return;
        }
        long andIncrement = this.f4621k.getAndIncrement();
        if (z11) {
            this.f4617g.set(null);
            this.f4438a.b().A(new d6(this, bVar3, j10, i10, andIncrement, z12, bVar2));
            return;
        }
        e6 e6Var = new e6(this, bVar3, i10, andIncrement, z12, bVar2);
        if (i10 == 30 || i10 == -10) {
            this.f4438a.b().A(e6Var);
        } else {
            this.f4438a.b().z(e6Var);
        }
    }

    public final void H(p4.t tVar) {
        p4.t tVar2;
        h();
        i();
        if (tVar != null && tVar != (tVar2 = this.f4614d)) {
            z3.o.m(tVar2 == null, "EventInterceptor already set.");
        }
        this.f4614d = tVar;
    }

    public final void I(Boolean bool) {
        i();
        this.f4438a.b().z(new c6(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(p4.b bVar) {
        h();
        boolean z10 = (bVar.i(p4.a.ANALYTICS_STORAGE) && bVar.i(p4.a.AD_STORAGE)) || this.f4438a.L().A();
        if (z10 != this.f4438a.p()) {
            this.f4438a.l(z10);
            s3 F = this.f4438a.F();
            j4 j4Var = F.f4438a;
            F.h();
            Boolean valueOf = F.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                O(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z10) {
        L("auto", "_ldl", obj, true, this.f4438a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.j4 r3 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r3 = r3.N()
            int r3 = r3.n0(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            com.google.android.gms.measurement.internal.j4 r7 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r7 = r7.N()
            java.lang.String r8 = "user property"
            boolean r9 = r7.R(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = p4.s.f12414a
            r10 = 0
            boolean r9 = r7.N(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            com.google.android.gms.measurement.internal.j4 r9 = r7.f4438a
            r9.z()
            boolean r7 = r7.M(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            com.google.android.gms.measurement.internal.j4 r0 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r0 = r0.N()
            com.google.android.gms.measurement.internal.j4 r1 = r6.f4438a
            r1.z()
            java.lang.String r13 = r0.r(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            com.google.android.gms.measurement.internal.j4 r0 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r8 = r0.N()
            com.google.android.gms.measurement.internal.h9 r9 = r6.f4626p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.B(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.j4 r7 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r7 = r7.N()
            int r11 = r7.j0(r2, r0)
            if (r11 == 0) goto Lab
            com.google.android.gms.measurement.internal.j4 r1 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r1 = r1.N()
            com.google.android.gms.measurement.internal.j4 r7 = r6.f4438a
            r7.z()
            java.lang.String r13 = r1.r(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            com.google.android.gms.measurement.internal.j4 r0 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r8 = r0.N()
            com.google.android.gms.measurement.internal.h9 r9 = r6.f4626p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.B(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            com.google.android.gms.measurement.internal.j4 r3 = r6.f4438a
            com.google.android.gms.measurement.internal.i9 r3 = r3.N()
            java.lang.Object r5 = r3.p(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.B(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            z3.o.e(r9)
            z3.o.e(r10)
            r8.h()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L4f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.j4 r10 = r8.f4438a
            com.google.android.gms.measurement.internal.s3 r10 = r10.F()
            com.google.android.gms.measurement.internal.r3 r10 = r10.f4980m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L5b
            java.lang.String r0 = "true"
            goto L5b
        L4f:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.j4 r10 = r8.f4438a
            com.google.android.gms.measurement.internal.s3 r10 = r10.F()
            com.google.android.gms.measurement.internal.r3 r10 = r10.f4980m
            java.lang.String r0 = "unset"
        L5b:
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L63
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.google.android.gms.measurement.internal.j4 r10 = r8.f4438a
            boolean r10 = r10.o()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.j4 r9 = r8.f4438a
            com.google.android.gms.measurement.internal.f3 r9 = r9.d()
            com.google.android.gms.measurement.internal.d3 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            com.google.android.gms.measurement.internal.j4 r10 = r8.f4438a
            boolean r10 = r10.r()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.d9 r10 = new com.google.android.gms.measurement.internal.d9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.j4 r9 = r8.f4438a
            com.google.android.gms.measurement.internal.v7 r9 = r9.L()
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(p4.u uVar) {
        i();
        z3.o.i(uVar);
        if (this.f4615e.remove(uVar)) {
            return;
        }
        this.f4438a.d().w().a("OnEventListener had not been registered");
    }

    public final int Q(String str) {
        z3.o.e(str);
        this.f4438a.z();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f4438a.b().r(atomicReference, 15000L, "boolean test flag value", new u5(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f4438a.b().r(atomicReference, 15000L, "double test flag value", new b6(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f4438a.b().r(atomicReference, 15000L, "int test flag value", new a6(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f4438a.b().r(atomicReference, 15000L, "long test flag value", new z5(this, atomicReference));
    }

    public final String V() {
        return (String) this.f4617g.get();
    }

    public final String W() {
        o6 r10 = this.f4438a.K().r();
        if (r10 != null) {
            return r10.f4855b;
        }
        return null;
    }

    public final String X() {
        o6 r10 = this.f4438a.K().r();
        if (r10 != null) {
            return r10.f4854a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f4438a.b().r(atomicReference, 15000L, "String test flag value", new y5(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.f4438a.b().C()) {
            this.f4438a.d().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f4438a.f();
        if (c.a()) {
            this.f4438a.d().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f4438a.b().r(atomicReference, 5000L, "get conditional user properties", new t5(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f4438a.d().r().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return i9.v(list);
    }

    public final Map a0(String str, String str2, boolean z10) {
        d3 r10;
        String str3;
        if (this.f4438a.b().C()) {
            r10 = this.f4438a.d().r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f4438a.f();
            if (!c.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f4438a.b().r(atomicReference, 5000L, "get user properties", new v5(this, atomicReference, null, str, str2, z10));
                List<d9> list = (List) atomicReference.get();
                if (list == null) {
                    this.f4438a.d().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                m.a aVar = new m.a(list.size());
                for (d9 d9Var : list) {
                    Object k10 = d9Var.k();
                    if (k10 != null) {
                        aVar.put(d9Var.f4488o, k10);
                    }
                }
                return aVar;
            }
            r10 = this.f4438a.d().r();
            str3 = "Cannot get user properties from main thread";
        }
        r10.a(str3);
        return Collections.emptyMap();
    }

    public final void f0() {
        h();
        i();
        if (this.f4438a.r()) {
            if (this.f4438a.z().B(null, u2.Z)) {
                h z10 = this.f4438a.z();
                z10.f4438a.f();
                Boolean t10 = z10.t("google_analytics_deferred_deep_link_enabled");
                if (t10 != null && t10.booleanValue()) {
                    this.f4438a.d().q().a("Deferred Deep Link feature enabled.");
                    this.f4438a.b().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
                        @Override // java.lang.Runnable
                        public final void run() {
                            i6 i6Var = i6.this;
                            i6Var.h();
                            if (i6Var.f4438a.F().f4986s.b()) {
                                i6Var.f4438a.d().q().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long a10 = i6Var.f4438a.F().f4987t.a();
                            i6Var.f4438a.F().f4987t.b(1 + a10);
                            i6Var.f4438a.z();
                            if (a10 < 5) {
                                i6Var.f4438a.j();
                                return;
                            }
                            i6Var.f4438a.d().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            i6Var.f4438a.F().f4986s.a(true);
                        }
                    });
                }
            }
            this.f4438a.L().O();
            this.f4625o = false;
            s3 F = this.f4438a.F();
            F.h();
            String string = F.o().getString("previous_os_version", null);
            F.f4438a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f4438a.A().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            u("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean n() {
        return false;
    }

    public final void o(String str, String str2, Bundle bundle) {
        long a10 = this.f4438a.e().a();
        z3.o.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f4438a.b().z(new s5(this, bundle2));
    }

    public final void p() {
        if (!(this.f4438a.c().getApplicationContext() instanceof Application) || this.f4613c == null) {
            return;
        }
        ((Application) this.f4438a.c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f4613c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q(Bundle bundle) {
        if (bundle == null) {
            this.f4438a.F().f4991x.b(new Bundle());
            return;
        }
        Bundle a10 = this.f4438a.F().f4991x.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f4438a.N().U(obj)) {
                    this.f4438a.N().B(this.f4626p, null, 27, null, null, 0);
                }
                this.f4438a.d().x().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (i9.W(str)) {
                this.f4438a.d().x().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else {
                i9 N = this.f4438a.N();
                this.f4438a.z();
                if (N.P("param", str, 100, obj)) {
                    this.f4438a.N().C(a10, str, obj);
                }
            }
        }
        this.f4438a.N();
        int m10 = this.f4438a.z().m();
        if (a10.size() > m10) {
            int i10 = 0;
            for (String str2 : new TreeSet(a10.keySet())) {
                i10++;
                if (i10 > m10) {
                    a10.remove(str2);
                }
            }
            this.f4438a.N().B(this.f4626p, null, 26, null, null, 0);
            this.f4438a.d().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f4438a.F().f4991x.b(a10);
        this.f4438a.L().v(a10);
    }

    public final void r(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, this.f4438a.e().a());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.f4438a.K().E(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f4614d != null && !i9.W(str2)) {
            z12 = false;
        }
        A(str3, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void t(String str, String str2, Bundle bundle, String str3) {
        j4.t();
        A("auto", str2, this.f4438a.e().a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, String str2, Bundle bundle) {
        h();
        v(str, str2, this.f4438a.e().a(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str, String str2, long j10, Bundle bundle) {
        h();
        w(str, str2, j10, bundle, true, this.f4614d == null || i9.W(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        ArrayList arrayList;
        long j11;
        Bundle[] bundleArr;
        Object[] objArr;
        z3.o.e(str);
        z3.o.i(bundle);
        h();
        i();
        if (!this.f4438a.o()) {
            this.f4438a.d().q().a("Event not sent since app measurement is disabled");
            return;
        }
        List u10 = this.f4438a.B().u();
        if (u10 != null && !u10.contains(str2)) {
            this.f4438a.d().q().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f4616f) {
            this.f4616f = true;
            try {
                try {
                    (!this.f4438a.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f4438a.c().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f4438a.c());
                } catch (Exception e10) {
                    this.f4438a.d().w().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f4438a.d().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.f4438a.f();
            M("auto", "_lgclid", bundle.getString("gclid"), this.f4438a.e().a());
        }
        this.f4438a.f();
        if (z10 && i9.a0(str2)) {
            this.f4438a.N().z(bundle, this.f4438a.F().f4991x.a());
        }
        if (!z12) {
            this.f4438a.f();
            if (!"_iap".equals(str2)) {
                i9 N = this.f4438a.N();
                int i10 = 2;
                if (N.R("event", str2)) {
                    if (N.N("event", p4.q.f12406a, p4.q.f12407b, str2)) {
                        N.f4438a.z();
                        if (N.M("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    this.f4438a.d().s().b("Invalid public event name. Event will not be logged (FE)", this.f4438a.D().d(str2));
                    i9 N2 = this.f4438a.N();
                    this.f4438a.z();
                    this.f4438a.N().B(this.f4626p, null, i10, "_ev", N2.r(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.f4438a.f();
        o6 s10 = this.f4438a.K().s(false);
        if (s10 != null && !bundle.containsKey("_sc")) {
            s10.f4857d = true;
        }
        i9.y(s10, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean W = i9.W(str2);
        if (!z10 || this.f4614d == null || W) {
            z13 = equals;
        } else if (!equals) {
            this.f4438a.d().q().c("Passing event to registered event handler (FE)", this.f4438a.D().d(str2), this.f4438a.D().b(bundle));
            z3.o.i(this.f4614d);
            this.f4614d.a(str, str2, bundle, j10);
            return;
        } else {
            z13 = true;
        }
        if (this.f4438a.r()) {
            int k02 = this.f4438a.N().k0(str2);
            if (k02 != 0) {
                this.f4438a.d().s().b("Invalid event name. Event will not be logged (FE)", this.f4438a.D().d(str2));
                i9 N3 = this.f4438a.N();
                this.f4438a.z();
                this.f4438a.N().B(this.f4626p, str3, k02, "_ev", N3.r(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String str5 = "_o";
            Bundle v02 = this.f4438a.N().v0(str3, str2, bundle, d4.f.c("_o", "_sn", "_sc", "_si"), z12);
            z3.o.i(v02);
            this.f4438a.f();
            if (this.f4438a.K().s(false) != null && "_ae".equals(str2)) {
                j8 j8Var = this.f4438a.M().f4747e;
                long b10 = j8Var.f4694d.f4438a.e().b();
                long j12 = b10 - j8Var.f4692b;
                j8Var.f4692b = b10;
                if (j12 > 0) {
                    this.f4438a.N().w(v02, j12);
                }
            }
            ad.c();
            if (this.f4438a.z().B(null, u2.f5046e0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    i9 N4 = this.f4438a.N();
                    String string = v02.getString("_ffr");
                    if (d4.n.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (p4.c0.a(string, N4.f4438a.F().f4988u.a())) {
                        N4.f4438a.d().q().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    N4.f4438a.F().f4988u.b(string);
                } else if ("_ae".equals(str2)) {
                    String a10 = this.f4438a.N().f4438a.F().f4988u.a();
                    if (!TextUtils.isEmpty(a10)) {
                        v02.putString("_ffr", a10);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(v02);
            if (this.f4438a.F().f4982o.a() > 0 && this.f4438a.F().v(j10) && this.f4438a.F().f4985r.b()) {
                this.f4438a.d().v().a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j11 = 0;
                str4 = "_ae";
                M("auto", "_sid", null, this.f4438a.e().a());
                M("auto", "_sno", null, this.f4438a.e().a());
                M("auto", "_se", null, this.f4438a.e().a());
                this.f4438a.F().f4983p.b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j11 = 0;
            }
            if (v02.getLong("extend_session", j11) == 1) {
                this.f4438a.d().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f4438a.M().f4746d.b(j10, true);
            }
            ArrayList arrayList3 = new ArrayList(v02.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str6 = (String) arrayList3.get(i11);
                if (str6 != null) {
                    this.f4438a.N();
                    Object obj = v02.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            objArr = arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) objArr;
                    }
                    if (bundleArr != null) {
                        v02.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str);
                if (z11) {
                    bundle2 = this.f4438a.N().u0(bundle2);
                }
                Bundle bundle3 = bundle2;
                String str8 = str5;
                this.f4438a.L().o(new v(str7, new t(bundle3), str, j10), str3);
                if (!z13) {
                    for (p4.u uVar : this.f4615e) {
                        uVar.a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                str5 = str8;
                arrayList = arrayList5;
            }
            this.f4438a.f();
            if (this.f4438a.K().s(false) == null || !str4.equals(str2)) {
                return;
            }
            this.f4438a.M().f4747e.d(true, true, this.f4438a.e().b());
        }
    }

    public final void x(p4.u uVar) {
        i();
        z3.o.i(uVar);
        if (this.f4615e.add(uVar)) {
            return;
        }
        this.f4438a.d().w().a("OnEventListener already registered");
    }

    public final void y(long j10) {
        this.f4617g.set(null);
        this.f4438a.b().z(new q5(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(long j10, boolean z10) {
        h();
        i();
        this.f4438a.d().q().a("Resetting analytics data (FE)");
        l8 M = this.f4438a.M();
        M.h();
        M.f4747e.a();
        je.c();
        if (this.f4438a.z().B(null, u2.f5066o0)) {
            this.f4438a.B().v();
        }
        boolean o10 = this.f4438a.o();
        s3 F = this.f4438a.F();
        F.f4972e.b(j10);
        if (!TextUtils.isEmpty(F.f4438a.F().f4988u.a())) {
            F.f4988u.b(null);
        }
        kd.c();
        h z11 = F.f4438a.z();
        t2 t2Var = u2.f5048f0;
        if (z11.B(null, t2Var)) {
            F.f4982o.b(0L);
        }
        F.f4983p.b(0L);
        if (!F.f4438a.z().E()) {
            F.t(!o10);
        }
        F.f4989v.b(null);
        F.f4990w.b(0L);
        F.f4991x.b(null);
        if (z10) {
            this.f4438a.L().q();
        }
        kd.c();
        if (this.f4438a.z().B(null, t2Var)) {
            this.f4438a.M().f4746d.a();
        }
        this.f4625o = !o10;
    }
}
