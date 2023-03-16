package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zc implements yc {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4343a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4344b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4345c;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).b().a();
        f4343a = a10.f("measurement.collection.event_safelist", true);
        f4344b = a10.f("measurement.service.store_null_safelist", true);
        f4345c = a10.f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final boolean b() {
        return ((Boolean) f4344b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final boolean c() {
        return ((Boolean) f4345c.b()).booleanValue();
    }
}
