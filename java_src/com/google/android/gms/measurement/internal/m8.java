package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m8 {

    /* renamed from: a  reason: collision with root package name */
    private final d4.e f4791a;

    /* renamed from: b  reason: collision with root package name */
    private long f4792b;

    public m8(d4.e eVar) {
        z3.o.i(eVar);
        this.f4791a = eVar;
    }

    public final void a() {
        this.f4792b = 0L;
    }

    public final void b() {
        this.f4792b = this.f4791a.b();
    }

    public final boolean c(long j10) {
        return this.f4792b == 0 || this.f4791a.b() - this.f4792b >= 3600000;
    }
}
