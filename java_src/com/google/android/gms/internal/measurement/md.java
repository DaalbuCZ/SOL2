package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class md implements ld {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f3980a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f3981b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f3982c;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f3980a = a10.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f3981b = a10.f("measurement.client.sessions.check_on_startup", true);
        f3982c = a10.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final boolean b() {
        return ((Boolean) f3980a.b()).booleanValue();
    }
}
