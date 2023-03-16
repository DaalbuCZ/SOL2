package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class p7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ p4.f f4896n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u7 f4897o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p7(u7 u7Var, p4.f fVar) {
        this.f4897o = u7Var;
        this.f4896n = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4897o) {
            this.f4897o.f5094n = false;
            if (!this.f4897o.f5096p.z()) {
                this.f4897o.f5096p.f4438a.d().v().a("Connected to service");
                this.f4897o.f5096p.x(this.f4896n);
            }
        }
    }
}
