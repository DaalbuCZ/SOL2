package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class le implements ke {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f3965a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f3966b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f3967c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f3968d;

    /* renamed from: e  reason: collision with root package name */
    public static final d7 f3969e;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).b().a();
        f3965a = a10.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f3966b = a10.f("measurement.session_stitching_token_enabled", false);
        f3967c = a10.f("measurement.collection.enable_session_stitching_token.service", false);
        f3968d = a10.f("measurement.collection.enable_session_stitching_token.service_new", true);
        f3969e = a10.d("measurement.id.collection.enable_session_stitching_token.client.dev", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean b() {
        return ((Boolean) f3965a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean c() {
        return ((Boolean) f3966b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean d() {
        return ((Boolean) f3967c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean e() {
        return ((Boolean) f3968d.b()).booleanValue();
    }
}
