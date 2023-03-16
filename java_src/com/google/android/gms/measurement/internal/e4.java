package com.google.android.gms.measurement.internal;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f4498a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h4 f4499b;

    public e4(h4 h4Var, String str) {
        this.f4499b = h4Var;
        z3.o.i(str);
        this.f4498a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4499b.f4438a.d().r().b(this.f4498a, th);
    }
}
