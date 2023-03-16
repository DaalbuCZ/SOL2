package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class tc implements sc {
    public static final d7 A;
    public static final d7 B;
    public static final d7 C;
    public static final d7 D;
    public static final d7 E;
    public static final d7 F;
    public static final d7 G;
    public static final d7 H;
    public static final d7 I;
    public static final d7 J;
    public static final d7 K;
    public static final d7 L;
    public static final d7 M;

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4196a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4197b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4198c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4199d;

    /* renamed from: e  reason: collision with root package name */
    public static final d7 f4200e;

    /* renamed from: f  reason: collision with root package name */
    public static final d7 f4201f;

    /* renamed from: g  reason: collision with root package name */
    public static final d7 f4202g;

    /* renamed from: h  reason: collision with root package name */
    public static final d7 f4203h;

    /* renamed from: i  reason: collision with root package name */
    public static final d7 f4204i;

    /* renamed from: j  reason: collision with root package name */
    public static final d7 f4205j;

    /* renamed from: k  reason: collision with root package name */
    public static final d7 f4206k;

    /* renamed from: l  reason: collision with root package name */
    public static final d7 f4207l;

    /* renamed from: m  reason: collision with root package name */
    public static final d7 f4208m;

    /* renamed from: n  reason: collision with root package name */
    public static final d7 f4209n;

    /* renamed from: o  reason: collision with root package name */
    public static final d7 f4210o;

    /* renamed from: p  reason: collision with root package name */
    public static final d7 f4211p;

    /* renamed from: q  reason: collision with root package name */
    public static final d7 f4212q;

    /* renamed from: r  reason: collision with root package name */
    public static final d7 f4213r;

    /* renamed from: s  reason: collision with root package name */
    public static final d7 f4214s;

    /* renamed from: t  reason: collision with root package name */
    public static final d7 f4215t;

    /* renamed from: u  reason: collision with root package name */
    public static final d7 f4216u;

    /* renamed from: v  reason: collision with root package name */
    public static final d7 f4217v;

    /* renamed from: w  reason: collision with root package name */
    public static final d7 f4218w;

    /* renamed from: x  reason: collision with root package name */
    public static final d7 f4219x;

    /* renamed from: y  reason: collision with root package name */
    public static final d7 f4220y;

    /* renamed from: z  reason: collision with root package name */
    public static final d7 f4221z;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f4196a = a10.d("measurement.ad_id_cache_time", 10000L);
        f4197b = a10.d("measurement.max_bundles_per_iteration", 100L);
        f4198c = a10.d("measurement.config.cache_time", 86400000L);
        f4199d = a10.e("measurement.log_tag", "FA");
        f4200e = a10.e("measurement.config.url_authority", "app-measurement.com");
        f4201f = a10.e("measurement.config.url_scheme", "https");
        f4202g = a10.d("measurement.upload.debug_upload_interval", 1000L);
        f4203h = a10.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f4204i = a10.d("measurement.store.max_stored_events_per_app", 100000L);
        f4205j = a10.d("measurement.experiment.max_ids", 50L);
        f4206k = a10.d("measurement.audience.filter_result_max_count", 200L);
        f4207l = a10.d("measurement.alarm_manager.minimum_interval", 60000L);
        f4208m = a10.d("measurement.upload.minimum_delay", 500L);
        f4209n = a10.d("measurement.monitoring.sample_period_millis", 86400000L);
        f4210o = a10.d("measurement.upload.realtime_upload_interval", 10000L);
        f4211p = a10.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f4212q = a10.d("measurement.config.cache_time.service", 3600000L);
        f4213r = a10.d("measurement.service_client.idle_disconnect_millis", 5000L);
        f4214s = a10.e("measurement.log_tag.service", "FA-SVC");
        f4215t = a10.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f4216u = a10.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f4217v = a10.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f4218w = a10.d("measurement.upload.backoff_period", 43200000L);
        f4219x = a10.d("measurement.upload.initial_upload_delay_time", 15000L);
        f4220y = a10.d("measurement.upload.interval", 3600000L);
        f4221z = a10.d("measurement.upload.max_bundle_size", 65536L);
        A = a10.d("measurement.upload.max_bundles", 100L);
        B = a10.d("measurement.upload.max_conversions_per_day", 500L);
        C = a10.d("measurement.upload.max_error_events_per_day", 1000L);
        D = a10.d("measurement.upload.max_events_per_bundle", 1000L);
        E = a10.d("measurement.upload.max_events_per_day", 100000L);
        F = a10.d("measurement.upload.max_public_events_per_day", 50000L);
        G = a10.d("measurement.upload.max_queue_time", 2419200000L);
        H = a10.d("measurement.upload.max_realtime_events_per_day", 10L);
        I = a10.d("measurement.upload.max_batch_size", 65536L);
        J = a10.d("measurement.upload.retry_count", 6L);
        K = a10.d("measurement.upload.retry_time", 1800000L);
        L = a10.e("measurement.upload.url", "https://app-measurement.com/a");
        M = a10.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long A() {
        return ((Long) f4204i.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final String B() {
        return (String) f4200e.b();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long C() {
        return ((Long) f4219x.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long D() {
        return ((Long) I.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long E() {
        return ((Long) f4215t.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final String F() {
        return (String) f4201f.b();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long G() {
        return ((Long) J.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long H() {
        return ((Long) C.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long I() {
        return ((Long) F.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long J() {
        return ((Long) f4220y.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long a() {
        return ((Long) f4196a.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long b() {
        return ((Long) f4197b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long c() {
        return ((Long) f4198c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long d() {
        return ((Long) f4202g.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long e() {
        return ((Long) f4203h.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long f() {
        return ((Long) f4206k.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long g() {
        return ((Long) f4207l.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long h() {
        return ((Long) f4210o.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long i() {
        return ((Long) f4208m.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long j() {
        return ((Long) f4209n.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long k() {
        return ((Long) f4205j.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long l() {
        return ((Long) f4216u.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final String m() {
        return (String) L.b();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long n() {
        return ((Long) K.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long o() {
        return ((Long) D.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long p() {
        return ((Long) G.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long q() {
        return ((Long) f4221z.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long r() {
        return ((Long) f4217v.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long s() {
        return ((Long) E.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long t() {
        return ((Long) f4211p.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long u() {
        return ((Long) A.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long v() {
        return ((Long) M.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long w() {
        return ((Long) f4218w.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long x() {
        return ((Long) H.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long y() {
        return ((Long) f4213r.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final long z() {
        return ((Long) B.b()).longValue();
    }
}
