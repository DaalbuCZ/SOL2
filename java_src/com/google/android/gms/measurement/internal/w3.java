package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class w3 extends y2 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5151b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w3(j4 j4Var) {
        super(j4Var);
        this.f4438a.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f5151b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        this.f4438a.g();
        this.f5151b = true;
    }

    public final void k() {
        if (this.f5151b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f4438a.g();
        this.f5151b = true;
    }

    protected void l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.f5151b;
    }

    protected abstract boolean n();
}
