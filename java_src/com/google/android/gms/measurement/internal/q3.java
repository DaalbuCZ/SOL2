package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    final String f4909a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4911c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4912d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s3 f4913e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q3(s3 s3Var, String str, long j10, p4.i iVar) {
        this.f4913e = s3Var;
        z3.o.e("health_monitor");
        z3.o.a(j10 > 0);
        this.f4909a = "health_monitor:start";
        this.f4910b = "health_monitor:count";
        this.f4911c = "health_monitor:value";
        this.f4912d = j10;
    }

    private final long c() {
        return this.f4913e.o().getLong(this.f4909a, 0L);
    }

    private final void d() {
        this.f4913e.h();
        long a10 = this.f4913e.f4438a.e().a();
        SharedPreferences.Editor edit = this.f4913e.o().edit();
        edit.remove(this.f4910b);
        edit.remove(this.f4911c);
        edit.putLong(this.f4909a, a10);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f4913e.h();
        this.f4913e.h();
        long c10 = c();
        if (c10 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c10 - this.f4913e.f4438a.e().a());
        }
        long j10 = this.f4912d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            d();
            return null;
        }
        String string = this.f4913e.o().getString(this.f4911c, null);
        long j11 = this.f4913e.o().getLong(this.f4910b, 0L);
        d();
        return (string == null || j11 <= 0) ? s3.f4969y : new Pair(string, Long.valueOf(j11));
    }

    public final void b(String str, long j10) {
        this.f4913e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f4913e.o().getLong(this.f4910b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f4913e.o().edit();
            edit.putString(this.f4911c, str);
            edit.putLong(this.f4910b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f4913e.f4438a.N().u().nextLong();
        long j12 = j11 + 1;
        SharedPreferences.Editor edit2 = this.f4913e.o().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j12) {
            edit2.putString(this.f4911c, str);
        }
        edit2.putLong(this.f4910b, j12);
        edit2.apply();
    }
}
