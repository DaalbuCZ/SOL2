package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class y4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5198a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b5 f5199b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4(b5 b5Var, String str) {
        this.f5199b = b5Var;
        this.f5198a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f5199b.f4418a;
        a9Var.a();
        a9Var2 = this.f5199b.f4418a;
        return a9Var2.W().c0(this.f5198a);
    }
}
