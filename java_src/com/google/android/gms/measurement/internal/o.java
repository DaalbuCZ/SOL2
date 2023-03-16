package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f4830d;

    /* renamed from: a  reason: collision with root package name */
    private final e5 f4831a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f4832b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f4833c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(e5 e5Var) {
        z3.o.i(e5Var);
        this.f4831a = e5Var;
        this.f4832b = new n(this, e5Var);
    }

    private final Handler f() {
        Handler handler;
        if (f4830d != null) {
            return f4830d;
        }
        synchronized (o.class) {
            if (f4830d == null) {
                f4830d = new com.google.android.gms.internal.measurement.a1(this.f4831a.c().getMainLooper());
            }
            handler = f4830d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f4833c = 0L;
        f().removeCallbacks(this.f4832b);
    }

    public abstract void c();

    public final void d(long j10) {
        b();
        if (j10 >= 0) {
            this.f4833c = this.f4831a.e().a();
            if (f().postDelayed(this.f4832b, j10)) {
                return;
            }
            this.f4831a.d().r().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean e() {
        return this.f4833c != 0;
    }
}
