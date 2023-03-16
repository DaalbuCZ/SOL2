package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class q8 extends p8 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f4927c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(a9 a9Var) {
        super(a9Var);
        this.f4898b.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f4927c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f4898b.m();
        this.f4927c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f4927c;
    }

    protected abstract boolean l();
}
