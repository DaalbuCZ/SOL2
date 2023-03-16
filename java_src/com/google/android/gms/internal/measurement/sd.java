package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class sd implements rd {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4175a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4176b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4177c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4178d;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f4175a = a10.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f4176b = a10.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f4177c = a10.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f4178d = a10.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final boolean a() {
        return ((Boolean) f4177c.b()).booleanValue();
    }
}
