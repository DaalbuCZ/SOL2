package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class gd implements fd {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f3870a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f3871b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f3872c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f3873d;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f3870a = a10.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f3871b = a10.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f3872c = a10.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f3873d = a10.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean b() {
        return ((Boolean) f3871b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean c() {
        return ((Boolean) f3872c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean d() {
        return ((Boolean) f3873d.b()).booleanValue();
    }
}
