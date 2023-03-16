package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n8 extends o {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o8 f4816e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(o8 o8Var, e5 e5Var) {
        super(e5Var);
        this.f4816e = o8Var;
    }

    @Override // com.google.android.gms.measurement.internal.o
    public final void c() {
        this.f4816e.m();
        this.f4816e.f4438a.d().v().a("Starting upload from DelayedRunnable");
        this.f4816e.f4898b.C();
    }
}
