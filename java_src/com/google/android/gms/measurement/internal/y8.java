package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a  reason: collision with root package name */
    com.google.android.gms.internal.measurement.d5 f5207a;

    /* renamed from: b  reason: collision with root package name */
    List f5208b;

    /* renamed from: c  reason: collision with root package name */
    List f5209c;

    /* renamed from: d  reason: collision with root package name */
    long f5210d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a9 f5211e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y8(a9 a9Var, p4.a0 a0Var) {
        this.f5211e = a9Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.s4 s4Var) {
        return ((s4Var.H() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.s4 s4Var) {
        z3.o.i(s4Var);
        if (this.f5209c == null) {
            this.f5209c = new ArrayList();
        }
        if (this.f5208b == null) {
            this.f5208b = new ArrayList();
        }
        if (this.f5209c.isEmpty() || b((com.google.android.gms.internal.measurement.s4) this.f5209c.get(0)) == b(s4Var)) {
            long d10 = this.f5210d + s4Var.d();
            this.f5211e.U();
            if (d10 >= Math.max(0, ((Integer) u2.f5055j.a(null)).intValue())) {
                return false;
            }
            this.f5210d = d10;
            this.f5209c.add(s4Var);
            this.f5208b.add(Long.valueOf(j10));
            int size = this.f5209c.size();
            this.f5211e.U();
            return size < Math.max(1, ((Integer) u2.f5057k.a(null)).intValue());
        }
        return false;
    }
}
