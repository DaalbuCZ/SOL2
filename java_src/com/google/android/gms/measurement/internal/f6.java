package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class f6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ boolean f4529n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4530o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f6(i6 i6Var, boolean z10) {
        this.f4530o = i6Var;
        this.f4529n = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o10 = this.f4530o.f4438a.o();
        boolean n10 = this.f4530o.f4438a.n();
        this.f4530o.f4438a.k(this.f4529n);
        if (n10 == this.f4529n) {
            this.f4530o.f4438a.d().v().b("Default data collection state already set to", Boolean.valueOf(this.f4529n));
        }
        if (this.f4530o.f4438a.o() == o10 || this.f4530o.f4438a.o() != this.f4530o.f4438a.n()) {
            this.f4530o.f4438a.d().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f4529n), Boolean.valueOf(o10));
        }
        this.f4530o.P();
    }
}
