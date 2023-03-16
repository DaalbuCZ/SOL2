package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
/* loaded from: classes.dex */
public final class a2 extends y2 {

    /* renamed from: b  reason: collision with root package name */
    private final Map f4363b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4364c;

    /* renamed from: d  reason: collision with root package name */
    private long f4365d;

    public a2(j4 j4Var) {
        super(j4Var);
        this.f4364c = new m.a();
        this.f4363b = new m.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(a2 a2Var, String str, long j10) {
        a2Var.h();
        z3.o.e(str);
        if (a2Var.f4364c.isEmpty()) {
            a2Var.f4365d = j10;
        }
        Integer num = (Integer) a2Var.f4364c.get(str);
        if (num != null) {
            a2Var.f4364c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (a2Var.f4364c.size() >= 100) {
            a2Var.f4438a.d().w().a("Too many ads visible");
        } else {
            a2Var.f4364c.put(str, 1);
            a2Var.f4363b.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j(a2 a2Var, String str, long j10) {
        a2Var.h();
        z3.o.e(str);
        Integer num = (Integer) a2Var.f4364c.get(str);
        if (num == null) {
            a2Var.f4438a.d().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        o6 s10 = a2Var.f4438a.K().s(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            a2Var.f4364c.put(str, Integer.valueOf(intValue));
            return;
        }
        a2Var.f4364c.remove(str);
        Long l10 = (Long) a2Var.f4363b.get(str);
        if (l10 == null) {
            a2Var.f4438a.d().r().a("First ad unit exposure time was never set");
        } else {
            long longValue = l10.longValue();
            a2Var.f4363b.remove(str);
            a2Var.p(str, j10 - longValue, s10);
        }
        if (a2Var.f4364c.isEmpty()) {
            long j11 = a2Var.f4365d;
            if (j11 == 0) {
                a2Var.f4438a.d().r().a("First ad exposure time was never set");
                return;
            }
            a2Var.o(j10 - j11, s10);
            a2Var.f4365d = 0L;
        }
    }

    private final void o(long j10, o6 o6Var) {
        if (o6Var == null) {
            this.f4438a.d().v().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f4438a.d().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            i9.y(o6Var, bundle, true);
            this.f4438a.I().u("am", "_xa", bundle);
        }
    }

    private final void p(String str, long j10, o6 o6Var) {
        if (o6Var == null) {
            this.f4438a.d().v().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f4438a.d().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            i9.y(o6Var, bundle, true);
            this.f4438a.I().u("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j10) {
        for (String str : this.f4363b.keySet()) {
            this.f4363b.put(str, Long.valueOf(j10));
        }
        if (this.f4363b.isEmpty()) {
            return;
        }
        this.f4365d = j10;
    }

    public final void l(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f4438a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f4438a.b().z(new a(this, str, j10));
        }
    }

    public final void m(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f4438a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f4438a.b().z(new y(this, str, j10));
        }
    }

    public final void n(long j10) {
        o6 s10 = this.f4438a.K().s(false);
        for (String str : this.f4363b.keySet()) {
            p(str, j10 - ((Long) this.f4363b.get(str)).longValue(), s10);
        }
        if (!this.f4363b.isEmpty()) {
            o(j10 - this.f4365d, s10);
        }
        q(j10);
    }
}
