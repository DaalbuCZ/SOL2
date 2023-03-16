package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class f0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final z4 f3842a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3843b;

    public f0(z4 z4Var, String str) {
        this.f3842a = z4Var;
        this.f3843b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final z4 a(q qVar) {
        z4 a10 = this.f3842a.a();
        a10.f(this.f3843b, qVar);
        return a10;
    }
}
