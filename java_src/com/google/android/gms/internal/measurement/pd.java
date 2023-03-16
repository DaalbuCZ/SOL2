package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class pd implements od {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4072a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4073b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4074c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4075d;

    /* renamed from: e  reason: collision with root package name */
    public static final d7 f4076e;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).b().a();
        f4072a = a10.f("measurement.client.global_params", true);
        f4073b = a10.f("measurement.service.global_params_in_payload", true);
        f4074c = a10.f("measurement.service.clear_global_params_on_uninstall", true);
        f4075d = a10.f("measurement.service.global_params", true);
        f4076e = a10.d("measurement.id.service.global_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.od
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.od
    public final boolean b() {
        return ((Boolean) f4074c.b()).booleanValue();
    }
}
