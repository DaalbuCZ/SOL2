package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s3.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s3 extends d5 {

    /* renamed from: y  reason: collision with root package name */
    static final Pair f4969y = new Pair("", 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f4970c;

    /* renamed from: d  reason: collision with root package name */
    public q3 f4971d;

    /* renamed from: e  reason: collision with root package name */
    public final p3 f4972e;

    /* renamed from: f  reason: collision with root package name */
    public final p3 f4973f;

    /* renamed from: g  reason: collision with root package name */
    public final r3 f4974g;

    /* renamed from: h  reason: collision with root package name */
    private String f4975h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4976i;

    /* renamed from: j  reason: collision with root package name */
    private long f4977j;

    /* renamed from: k  reason: collision with root package name */
    public final p3 f4978k;

    /* renamed from: l  reason: collision with root package name */
    public final n3 f4979l;

    /* renamed from: m  reason: collision with root package name */
    public final r3 f4980m;

    /* renamed from: n  reason: collision with root package name */
    public final n3 f4981n;

    /* renamed from: o  reason: collision with root package name */
    public final p3 f4982o;

    /* renamed from: p  reason: collision with root package name */
    public final p3 f4983p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4984q;

    /* renamed from: r  reason: collision with root package name */
    public final n3 f4985r;

    /* renamed from: s  reason: collision with root package name */
    public final n3 f4986s;

    /* renamed from: t  reason: collision with root package name */
    public final p3 f4987t;

    /* renamed from: u  reason: collision with root package name */
    public final r3 f4988u;

    /* renamed from: v  reason: collision with root package name */
    public final r3 f4989v;

    /* renamed from: w  reason: collision with root package name */
    public final p3 f4990w;

    /* renamed from: x  reason: collision with root package name */
    public final o3 f4991x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s3(j4 j4Var) {
        super(j4Var);
        this.f4978k = new p3(this, "session_timeout", 1800000L);
        this.f4979l = new n3(this, "start_new_session", true);
        this.f4982o = new p3(this, "last_pause_time", 0L);
        this.f4983p = new p3(this, "session_id", 0L);
        this.f4980m = new r3(this, "non_personalized_ads", null);
        this.f4981n = new n3(this, "allow_remote_dynamite", false);
        this.f4972e = new p3(this, "first_open_time", 0L);
        this.f4973f = new p3(this, "app_install_time", 0L);
        this.f4974g = new r3(this, "app_instance_id", null);
        this.f4985r = new n3(this, "app_backgrounded", false);
        this.f4986s = new n3(this, "deep_link_retrieval_complete", false);
        this.f4987t = new p3(this, "deep_link_retrieval_attempts", 0L);
        this.f4988u = new r3(this, "firebase_feature_rollouts", null);
        this.f4989v = new r3(this, "deferred_attribution_cache", null);
        this.f4990w = new p3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f4991x = new o3(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void i() {
        SharedPreferences sharedPreferences = this.f4438a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f4970c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f4984q = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f4970c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f4438a.z();
        this.f4971d = new q3(this, "health_monitor", Math.max(0L, ((Long) u2.f5043d.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences o() {
        h();
        k();
        z3.o.i(this.f4970c);
        return this.f4970c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair p(String str) {
        h();
        long b10 = this.f4438a.e().b();
        String str2 = this.f4975h;
        if (str2 == null || b10 >= this.f4977j) {
            this.f4977j = b10 + this.f4438a.z().r(str, u2.f5041c);
            s3.a.b(true);
            try {
                a.C0194a a10 = s3.a.a(this.f4438a.c());
                this.f4975h = "";
                String a11 = a10.a();
                if (a11 != null) {
                    this.f4975h = a11;
                }
                this.f4976i = a10.b();
            } catch (Exception e10) {
                this.f4438a.d().q().b("Unable to get advertising id", e10);
                this.f4975h = "";
            }
            s3.a.b(false);
            return new Pair(this.f4975h, Boolean.valueOf(this.f4976i));
        }
        return new Pair(str2, Boolean.valueOf(this.f4976i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p4.b q() {
        h();
        return p4.b.b(o().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z10) {
        h();
        this.f4438a.d().v().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        SharedPreferences sharedPreferences = this.f4970c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(long j10) {
        return j10 - this.f4978k.a() > this.f4982o.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i10) {
        return p4.b.j(i10, o().getInt("consent_source", 100));
    }
}
