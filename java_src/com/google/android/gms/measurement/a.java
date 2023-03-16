package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.i6;
import com.google.android.gms.measurement.internal.j4;
import java.util.List;
import java.util.Map;
import z3.o;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final j4 f4353a;

    /* renamed from: b  reason: collision with root package name */
    private final i6 f4354b;

    public a(j4 j4Var) {
        super(null);
        o.i(j4Var);
        this.f4353a = j4Var;
        this.f4354b = j4Var.I();
    }

    @Override // p4.w
    public final int a(String str) {
        this.f4354b.Q(str);
        return 25;
    }

    @Override // p4.w
    public final long b() {
        return this.f4353a.N().r0();
    }

    @Override // p4.w
    public final void c(String str) {
        this.f4353a.y().l(str, this.f4353a.e().b());
    }

    @Override // p4.w
    public final void d(String str, String str2, Bundle bundle) {
        this.f4353a.I().o(str, str2, bundle);
    }

    @Override // p4.w
    public final List e(String str, String str2) {
        return this.f4354b.Z(str, str2);
    }

    @Override // p4.w
    public final String f() {
        return this.f4354b.V();
    }

    @Override // p4.w
    public final String g() {
        return this.f4354b.W();
    }

    @Override // p4.w
    public final Map h(String str, String str2, boolean z10) {
        return this.f4354b.a0(str, str2, z10);
    }

    @Override // p4.w
    public final String i() {
        return this.f4354b.X();
    }

    @Override // p4.w
    public final String j() {
        return this.f4354b.V();
    }

    @Override // p4.w
    public final void k(String str) {
        this.f4353a.y().m(str, this.f4353a.e().b());
    }

    @Override // p4.w
    public final void l(Bundle bundle) {
        this.f4354b.D(bundle);
    }

    @Override // p4.w
    public final void m(String str, String str2, Bundle bundle) {
        this.f4354b.r(str, str2, bundle);
    }
}
