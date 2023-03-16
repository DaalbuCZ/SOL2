package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class q4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4914a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4915b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4916c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b5 f4917d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q4(b5 b5Var, String str, String str2, String str3) {
        this.f4917d = b5Var;
        this.f4914a = str;
        this.f4915b = str2;
        this.f4916c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4917d.f4418a;
        a9Var.a();
        a9Var2 = this.f4917d.f4418a;
        return a9Var2.W().a0(this.f4914a, this.f4915b, this.f4916c);
    }
}
