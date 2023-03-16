package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class yd implements xd {

    /* renamed from: a  reason: collision with root package name */
    public static final d7 f4312a;

    /* renamed from: b  reason: collision with root package name */
    public static final d7 f4313b;

    /* renamed from: c  reason: collision with root package name */
    public static final d7 f4314c;

    /* renamed from: d  reason: collision with root package name */
    public static final d7 f4315d;

    /* renamed from: e  reason: collision with root package name */
    public static final d7 f4316e;

    static {
        z6 a10 = new z6(r6.a("com.google.android.gms.measurement")).a();
        f4312a = a10.f("measurement.test.boolean_flag", false);
        f4313b = a10.c("measurement.test.double_flag", -3.0d);
        f4314c = a10.d("measurement.test.int_flag", -2L);
        f4315d = a10.d("measurement.test.long_flag", -1L);
        f4316e = a10.e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final double a() {
        return ((Double) f4313b.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final long b() {
        return ((Long) f4314c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final long c() {
        return ((Long) f4315d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final String d() {
        return (String) f4316e.b();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean e() {
        return ((Boolean) f4312a.b()).booleanValue();
    }
}
