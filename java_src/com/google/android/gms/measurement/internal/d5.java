package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d5 extends c5 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4474b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5(j4 j4Var) {
        super(j4Var);
        this.f4438a.i();
    }

    protected void i() {
    }

    protected abstract boolean j();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f4474b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.f4438a.g();
        this.f4474b = true;
    }

    public final void m() {
        if (this.f4474b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.f4438a.g();
        this.f4474b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return this.f4474b;
    }
}
