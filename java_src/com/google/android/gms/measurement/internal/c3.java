package com.google.android.gms.measurement.internal;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ int f4430n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4431o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ Object f4432p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ Object f4433q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Object f4434r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ f3 f4435s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(f3 f3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f4435s = f3Var;
        this.f4430n = i10;
        this.f4431o = str;
        this.f4432p = obj;
        this.f4433q = obj2;
        this.f4434r = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        f3 f3Var;
        char c12;
        s3 F = this.f4435s.f4438a.F();
        if (!F.n()) {
            Log.println(6, this.f4435s.C(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        f3 f3Var2 = this.f4435s;
        c10 = f3Var2.f4512c;
        if (c10 == 0) {
            if (f3Var2.f4438a.z().H()) {
                f3Var = this.f4435s;
                f3Var.f4438a.f();
                c12 = 'C';
            } else {
                f3Var = this.f4435s;
                f3Var.f4438a.f();
                c12 = 'c';
            }
            f3Var.f4512c = c12;
        }
        f3 f3Var3 = this.f4435s;
        j10 = f3Var3.f4513d;
        if (j10 < 0) {
            f3Var3.f4438a.z().q();
            f3Var3.f4513d = 74029L;
        }
        char charAt = "01VDIWEA?".charAt(this.f4430n);
        f3 f3Var4 = this.f4435s;
        c11 = f3Var4.f4512c;
        j11 = f3Var4.f4513d;
        String str = "2" + charAt + c11 + j11 + ":" + f3.A(true, this.f4431o, this.f4432p, this.f4433q, this.f4434r);
        if (str.length() > 1024) {
            str = this.f4431o.substring(0, 1024);
        }
        q3 q3Var = F.f4971d;
        if (q3Var != null) {
            q3Var.b(str, 1L);
        }
    }
}
