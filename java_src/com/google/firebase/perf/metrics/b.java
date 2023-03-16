package com.google.firebase.perf.metrics;

import b7.k;
import b7.m;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Trace f5749a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Trace trace) {
        this.f5749a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m a() {
        m.b U = m.x0().V(this.f5749a.f()).T(this.f5749a.j().e()).U(this.f5749a.j().d(this.f5749a.e()));
        for (a aVar : this.f5749a.d().values()) {
            U.R(aVar.b(), aVar.a());
        }
        List<Trace> k10 = this.f5749a.k();
        if (!k10.isEmpty()) {
            for (Trace trace : k10) {
                U.O(new b(trace).a());
            }
        }
        U.Q(this.f5749a.getAttributes());
        k[] b10 = y6.a.b(this.f5749a.i());
        if (b10 != null) {
            U.L(Arrays.asList(b10));
        }
        return U.a();
    }
}
