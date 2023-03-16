package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class g0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final z4 f3852a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3853b;

    public g0(z4 z4Var, String str) {
        this.f3852a = z4Var;
        this.f3853b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final z4 a(q qVar) {
        z4 a10 = this.f3852a.a();
        a10.e(this.f3853b, qVar);
        return a10;
    }
}
