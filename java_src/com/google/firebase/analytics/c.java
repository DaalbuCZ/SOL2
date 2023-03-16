package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d3;
import java.util.List;
import java.util.Map;
import p4.w;
/* loaded from: classes.dex */
final class c implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d3 f5251a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d3 d3Var) {
        this.f5251a = d3Var;
    }

    @Override // p4.w
    public final int a(String str) {
        return this.f5251a.t(str);
    }

    @Override // p4.w
    public final long b() {
        return this.f5251a.u();
    }

    @Override // p4.w
    public final void c(String str) {
        this.f5251a.K(str);
    }

    @Override // p4.w
    public final void d(String str, String str2, Bundle bundle) {
        this.f5251a.L(str, str2, bundle);
    }

    @Override // p4.w
    public final List e(String str, String str2) {
        return this.f5251a.F(str, str2);
    }

    @Override // p4.w
    public final String f() {
        return this.f5251a.B();
    }

    @Override // p4.w
    public final String g() {
        return this.f5251a.C();
    }

    @Override // p4.w
    public final Map h(String str, String str2, boolean z10) {
        return this.f5251a.G(str, str2, z10);
    }

    @Override // p4.w
    public final String i() {
        return this.f5251a.D();
    }

    @Override // p4.w
    public final String j() {
        return this.f5251a.E();
    }

    @Override // p4.w
    public final void k(String str) {
        this.f5251a.M(str);
    }

    @Override // p4.w
    public final void l(Bundle bundle) {
        this.f5251a.d(bundle);
    }

    @Override // p4.w
    public final void m(String str, String str2, Bundle bundle) {
        this.f5251a.O(str, str2, bundle);
    }
}
