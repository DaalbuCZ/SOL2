package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class o4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4841a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4842b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4843c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b5 f4844d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4(b5 b5Var, String str, String str2, String str3) {
        this.f4844d = b5Var;
        this.f4841a = str;
        this.f4842b = str2;
        this.f4843c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4844d.f4418a;
        a9Var.a();
        a9Var2 = this.f4844d.f4418a;
        return a9Var2.W().d0(this.f4841a, this.f4842b, this.f4843c);
    }
}
