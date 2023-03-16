package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class u2 {
    public static final t2 L;
    public static final t2 M;
    public static final t2 N;
    public static final t2 O;
    public static final t2 P;
    public static final t2 Q;
    public static final t2 R;
    public static final t2 S;
    public static final t2 T;
    public static final t2 U;
    public static final t2 V;
    public static final t2 W;
    public static final t2 X;
    public static final t2 Y;
    public static final t2 Z;

    /* renamed from: a0 */
    public static final t2 f5038a0;

    /* renamed from: b0 */
    public static final t2 f5040b0;

    /* renamed from: c0 */
    public static final t2 f5042c0;

    /* renamed from: d0 */
    public static final t2 f5044d0;

    /* renamed from: e0 */
    public static final t2 f5046e0;

    /* renamed from: f0 */
    public static final t2 f5048f0;

    /* renamed from: g0 */
    public static final t2 f5050g0;

    /* renamed from: h0 */
    public static final t2 f5052h0;

    /* renamed from: i0 */
    public static final t2 f5054i0;

    /* renamed from: j0 */
    public static final t2 f5056j0;

    /* renamed from: k0 */
    public static final t2 f5058k0;

    /* renamed from: l0 */
    public static final t2 f5060l0;

    /* renamed from: m0 */
    public static final t2 f5062m0;

    /* renamed from: n0 */
    public static final t2 f5064n0;

    /* renamed from: o0 */
    public static final t2 f5066o0;

    /* renamed from: p0 */
    public static final t2 f5068p0;

    /* renamed from: q0 */
    public static final t2 f5070q0;

    /* renamed from: r0 */
    public static final t2 f5072r0;

    /* renamed from: s0 */
    public static final t2 f5074s0;

    /* renamed from: t0 */
    public static final t2 f5076t0;

    /* renamed from: u0 */
    public static final t2 f5078u0;

    /* renamed from: v0 */
    public static final t2 f5080v0;

    /* renamed from: w0 */
    public static final t2 f5082w0;

    /* renamed from: a */
    private static final List f5037a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set f5039b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final t2 f5041c = a("measurement.ad_id_cache_time", 10000L, 10000L, i0.f4600a);

    /* renamed from: d */
    public static final t2 f5043d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, a0.f4361a);

    /* renamed from: e */
    public static final t2 f5045e = a("measurement.config.cache_time", 86400000L, 3600000L, m0.f4751a);

    /* renamed from: f */
    public static final t2 f5047f = a("measurement.config.url_scheme", "https", "https", y0.f5194a);

    /* renamed from: g */
    public static final t2 f5049g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", l1.f4728a);

    /* renamed from: h */
    public static final t2 f5051h = a("measurement.upload.max_bundles", 100, 100, x1.f5172a);

    /* renamed from: i */
    public static final t2 f5053i = a("measurement.upload.max_batch_size", 65536, 65536, j2.f4649a);

    /* renamed from: j */
    public static final t2 f5055j = a("measurement.upload.max_bundle_size", 65536, 65536, k2.f4702a);

    /* renamed from: k */
    public static final t2 f5057k = a("measurement.upload.max_events_per_bundle", 1000, 1000, l2.f4729a);

    /* renamed from: l */
    public static final t2 f5059l = a("measurement.upload.max_events_per_day", 100000, 100000, m2.f4753a);

    /* renamed from: m */
    public static final t2 f5061m = a("measurement.upload.max_error_events_per_day", 1000, 1000, t0.f5004a);

    /* renamed from: n */
    public static final t2 f5063n = a("measurement.upload.max_public_events_per_day", 50000, 50000, f1.f4510a);

    /* renamed from: o */
    public static final t2 f5065o = a("measurement.upload.max_conversions_per_day", 10000, 10000, q1.f4907a);

    /* renamed from: p */
    public static final t2 f5067p = a("measurement.upload.max_realtime_events_per_day", 10, 10, c2.f4429a);

    /* renamed from: q */
    public static final t2 f5069q = a("measurement.store.max_stored_events_per_app", 100000, 100000, n2.f4799a);

    /* renamed from: r */
    public static final t2 f5071r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", o2.f4836a);

    /* renamed from: s */
    public static final t2 f5073s = a("measurement.upload.backoff_period", 43200000L, 43200000L, p2.f4876a);

    /* renamed from: t */
    public static final t2 f5075t = a("measurement.upload.window_interval", 3600000L, 3600000L, q2.f4908a);

    /* renamed from: u */
    public static final t2 f5077u = a("measurement.upload.interval", 3600000L, 3600000L, x.f5170a);

    /* renamed from: v */
    public static final t2 f5079v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, z.f5212a);

    /* renamed from: w */
    public static final t2 f5081w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, b0.f4414a);

    /* renamed from: x */
    public static final t2 f5083x = a("measurement.upload.minimum_delay", 500L, 500L, c0.f4427a);

    /* renamed from: y */
    public static final t2 f5084y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, d0.f4456a);

    /* renamed from: z */
    public static final t2 f5085z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, e0.f4494a);
    public static final t2 A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, f0.f4509a);
    public static final t2 B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, g0.f4543a);
    public static final t2 C = a("measurement.upload.retry_time", 1800000L, 1800000L, h0.f4577a);
    public static final t2 D = a("measurement.upload.retry_count", 6, 6, j0.f4647a);
    public static final t2 E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, k0.f4700a);
    public static final t2 F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, l0.f4727a);
    public static final t2 G = a("measurement.audience.filter_result_max_count", 200, 200, n0.f4797a);
    public static final t2 H = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final t2 I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final t2 J = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static final t2 K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, o0.f4834a);

    static {
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, p0.f4874a);
        M = a("measurement.test.string_flag", "---", "---", q0.f4906a);
        N = a("measurement.test.long_flag", -1L, -1L, r0.f4947a);
        O = a("measurement.test.int_flag", -2, -2, s0.f4966a);
        Double valueOf = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf, valueOf, u0.f5035a);
        Q = a("measurement.experiment.max_ids", 50, 50, v0.f5104a);
        R = a("measurement.max_bundles_per_iteration", 100, 100, w0.f5134a);
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, x0.f5171a);
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, a1.f4362a);
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, b1.f4415a);
        V = a("measurement.quality.checksum", bool, bool, null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, c1.f4428a);
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, d1.f4457a);
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, e1.f4495a);
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, g1.f4544a);
        f5038a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, h1.f4578a);
        f5040b0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, i1.f4601a);
        f5042c0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, j1.f4648a);
        f5044d0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, k1.f4701a);
        f5046e0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, m1.f4752a);
        f5048f0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, n1.f4798a);
        f5050g0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, o1.f4835a);
        f5052h0 = a("measurement.service.storage_consent_support_version", 203600, 203600, p1.f4875a);
        f5054i0 = a("measurement.client.click_identifier_control.dev", bool, bool, r1.f4948a);
        f5056j0 = a("measurement.service.click_identifier_control", bool, bool, s1.f4967a);
        f5058k0 = a("measurement.service.store_null_safelist", bool2, bool2, t1.f5005a);
        f5060l0 = a("measurement.service.store_safelist", bool2, bool2, u1.f5036a);
        f5062m0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, v1.f5105a);
        f5064n0 = a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, w1.f5135a);
        f5066o0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, y1.f5195a);
        f5068p0 = a("measurement.session_stitching_token_enabled", bool, bool, z1.f5215a);
        f5070q0 = a("measurement.redaction.e_tag", bool2, bool2, b2.f4416a);
        f5072r0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, d2.f4458a);
        f5074s0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, e2.f4496a);
        f5076t0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, f2.f4511a);
        f5078u0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, g2.f4545a);
        f5080v0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, h2.f4579a);
        f5082w0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, i2.f4602a);
    }

    static t2 a(String str, Object obj, Object obj2, r2 r2Var) {
        t2 t2Var = new t2(str, obj, obj2, r2Var, null);
        f5037a.add(t2Var);
        return t2Var;
    }

    public static Map c(Context context) {
        com.google.android.gms.internal.measurement.g6 b10 = com.google.android.gms.internal.measurement.g6.b(context.getContentResolver(), com.google.android.gms.internal.measurement.r6.a("com.google.android.gms.measurement"), p4.c.f12401n);
        return b10 == null ? Collections.emptyMap() : b10.c();
    }
}
