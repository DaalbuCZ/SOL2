package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    final String f4900a;

    /* renamed from: b  reason: collision with root package name */
    final String f4901b;

    /* renamed from: c  reason: collision with root package name */
    final String f4902c;

    /* renamed from: d  reason: collision with root package name */
    final long f4903d;

    /* renamed from: e  reason: collision with root package name */
    final long f4904e;

    /* renamed from: f  reason: collision with root package name */
    final t f4905f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j4 j4Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        t tVar;
        z3.o.e(str2);
        z3.o.e(str3);
        this.f4900a = str2;
        this.f4901b = str3;
        this.f4902c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4903d = j10;
        this.f4904e = j11;
        if (j11 != 0 && j11 > j10) {
            j4Var.d().w().b("Event created with reverse previous/current timestamps. appId", f3.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    j4Var.d().r().a("Param name can't be null");
                } else {
                    Object o10 = j4Var.N().o(next, bundle2.get(next));
                    if (o10 == null) {
                        j4Var.d().w().b("Param value can't be null", j4Var.D().e(next));
                    } else {
                        j4Var.N().C(bundle2, next, o10);
                    }
                }
                it.remove();
            }
            tVar = new t(bundle2);
        }
        this.f4905f = tVar;
    }

    private q(j4 j4Var, String str, String str2, String str3, long j10, long j11, t tVar) {
        z3.o.e(str2);
        z3.o.e(str3);
        z3.o.i(tVar);
        this.f4900a = str2;
        this.f4901b = str3;
        this.f4902c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4903d = j10;
        this.f4904e = j11;
        if (j11 != 0 && j11 > j10) {
            j4Var.d().w().c("Event created with reverse previous/current timestamps. appId, name", f3.z(str2), f3.z(str3));
        }
        this.f4905f = tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q a(j4 j4Var, long j10) {
        return new q(j4Var, this.f4902c, this.f4900a, this.f4901b, this.f4903d, j10, this.f4905f);
    }

    public final String toString() {
        String str = this.f4900a;
        String str2 = this.f4901b;
        String obj = this.f4905f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
