package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e7 extends o {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v7 f4506e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(v7 v7Var, e5 e5Var) {
        super(e5Var);
        this.f4506e = v7Var;
    }

    @Override // com.google.android.gms.measurement.internal.o
    public final void c() {
        v7 v7Var = this.f4506e;
        v7Var.h();
        if (v7Var.z()) {
            v7Var.f4438a.d().v().a("Inactivity, disconnecting from the service");
            v7Var.Q();
        }
    }
}
