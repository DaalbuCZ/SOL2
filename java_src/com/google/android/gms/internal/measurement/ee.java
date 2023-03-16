package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class ee implements de {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f3824a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f3825b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f3826c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f3827d;

    /* renamed from: e  reason: collision with root package name */
    public static final d7 f3828e;

    /* renamed from: f  reason: collision with root package name */
    public static final d7 f3829f;

    /* renamed from: g  reason: collision with root package name */
    public static final d7 f3830g;

    /* renamed from: h  reason: collision with root package name */
    public static final d7 f3831h;

    /* renamed from: i  reason: collision with root package name */
    public static final d7 f3832i;

    /* renamed from: j  reason: collision with root package name */
    public static final d7 f3833j;

    /* renamed from: k  reason: collision with root package name */
    public static final d7 f3834k;

    /* renamed from: l  reason: collision with root package name */
    public static final d7 f3835l;

    /* renamed from: m  reason: collision with root package name */
    public static final d7 f3836m;

    /* renamed from: n  reason: collision with root package name */
    public static final d7 f3837n;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).b().a();
        f3824a = a10.f("measurement.redaction.app_instance_id", true);
        f3825b = a10.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f3826c = a10.f("measurement.redaction.config_redacted_fields", true);
        f3827d = a10.f("measurement.redaction.device_info", true);
        f3828e = a10.f("measurement.redaction.e_tag", true);
        f3829f = a10.f("measurement.redaction.enhanced_uid", true);
        f3830g = a10.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f3831h = a10.f("measurement.redaction.google_signals", true);
        f3832i = a10.f("measurement.redaction.no_aiid_in_config_request", true);
        f3833j = a10.f("measurement.redaction.retain_major_os_version", true);
        f3834k = a10.f("measurement.redaction.scion_payload_generator", true);
        f3835l = a10.f("measurement.redaction.upload_redacted_fields", true);
        f3836m = a10.f("measurement.redaction.upload_subdomain_override", true);
        f3837n = a10.f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.de
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.de
    public final boolean b() {
        return ((Boolean) f3825b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.de
    public final boolean c() {
        return ((Boolean) f3828e.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.de
    public final boolean d() {
        return ((Boolean) f3833j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.de
    public final boolean e() {
        return ((Boolean) f3834k.b()).booleanValue();
    }
}
