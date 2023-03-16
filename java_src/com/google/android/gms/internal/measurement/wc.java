package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class wc implements vc {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4276a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4277b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4278c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4279d;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f4276a = a10.f("measurement.client.consent_state_v1", true);
        f4277b = a10.f("measurement.client.3p_consent_state_v1", true);
        f4278c = a10.f("measurement.service.consent_state_v1_W36", true);
        f4279d = a10.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.vc
    public final long a() {
        return ((Long) f4279d.b()).longValue();
    }
}
