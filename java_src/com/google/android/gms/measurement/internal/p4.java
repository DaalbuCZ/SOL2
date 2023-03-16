package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class p4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4883b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4884c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b5 f4885d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p4(b5 b5Var, String str, String str2, String str3) {
        this.f4885d = b5Var;
        this.f4882a = str;
        this.f4883b = str2;
        this.f4884c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4885d.f4418a;
        a9Var.a();
        a9Var2 = this.f4885d.f4418a;
        return a9Var2.W().a0(this.f4882a, this.f4883b, this.f4884c);
    }
}
