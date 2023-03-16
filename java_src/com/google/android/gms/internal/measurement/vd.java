package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class vd implements ud {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4261a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4262b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4263c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4264d;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f4261a = a10.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f4262b = a10.f("measurement.lifecycle.app_backgrounded_tracking", true);
        f4263c = a10.f("measurement.lifecycle.app_in_background_parameter", false);
        f4264d = a10.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.ud
    public final boolean a() {
        return ((Boolean) f4263c.b()).booleanValue();
    }
}
