package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class n4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4806b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4807c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b5 f4808d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(b5 b5Var, String str, String str2, String str3) {
        this.f4808d = b5Var;
        this.f4805a = str;
        this.f4806b = str2;
        this.f4807c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a9 a9Var;
        a9 a9Var2;
        a9Var = this.f4808d.f4418a;
        a9Var.a();
        a9Var2 = this.f4808d.f4418a;
        return a9Var2.W().d0(this.f4805a, this.f4806b, this.f4807c);
    }
}
