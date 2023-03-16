package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class s2 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final long f4146n;

    /* renamed from: o  reason: collision with root package name */
    final long f4147o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f4148p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ d3 f4149q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(d3 d3Var, boolean z10) {
        this.f4149q = d3Var;
        this.f4146n = d3Var.f3785b.a();
        this.f4147o = d3Var.f3785b.b();
        this.f4148p = z10;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.f4149q.f3790g;
        if (z10) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f4149q.p(e10, false, this.f4148p);
            b();
        }
    }
}
