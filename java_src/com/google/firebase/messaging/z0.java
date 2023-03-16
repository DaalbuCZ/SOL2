package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<z0> f5657d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f5658a;

    /* renamed from: b  reason: collision with root package name */
    private v0 f5659b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5660c;

    private z0(SharedPreferences sharedPreferences, Executor executor) {
        this.f5660c = executor;
        this.f5658a = sharedPreferences;
    }

    public static synchronized z0 b(Context context, Executor executor) {
        z0 z0Var;
        synchronized (z0.class) {
            WeakReference<z0> weakReference = f5657d;
            z0Var = weakReference != null ? weakReference.get() : null;
            if (z0Var == null) {
                z0Var = new z0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                z0Var.d();
                f5657d = new WeakReference<>(z0Var);
            }
        }
        return z0Var;
    }

    private synchronized void d() {
        this.f5659b = v0.d(this.f5658a, "topic_operation_queue", ",", this.f5660c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(y0 y0Var) {
        return this.f5659b.b(y0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized y0 c() {
        return y0.a(this.f5659b.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(y0 y0Var) {
        return this.f5659b.g(y0Var.e());
    }
}
