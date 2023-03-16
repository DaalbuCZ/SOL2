package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v8 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n9 f5132a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a9 f5133b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v8(a9 a9Var, n9 n9Var) {
        this.f5133b = a9Var;
        this.f5132a = n9Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        p4.b V = this.f5133b.V((String) z3.o.i(this.f5132a.f4817n));
        p4.a aVar = p4.a.ANALYTICS_STORAGE;
        if (V.i(aVar) && p4.b.b(this.f5132a.I).i(aVar)) {
            return this.f5133b.S(this.f5132a).e0();
        }
        this.f5133b.d().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
