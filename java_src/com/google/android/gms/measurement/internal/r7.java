package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class r7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ p4.f f4958n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u7 f4959o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r7(u7 u7Var, p4.f fVar) {
        this.f4959o = u7Var;
        this.f4958n = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4959o) {
            this.f4959o.f5094n = false;
            if (!this.f4959o.f5096p.z()) {
                this.f4959o.f5096p.f4438a.d().q().a("Connected to remote service");
                this.f4959o.f5096p.x(this.f4958n);
            }
        }
    }
}
