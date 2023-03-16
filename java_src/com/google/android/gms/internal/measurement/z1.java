package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z1 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ String f4319r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ String f4320s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Context f4321t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Bundle f4322u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ d3 f4323v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(d3 d3Var, String str, String str2, Context context, Bundle bundle) {
        super(d3Var, true);
        this.f4323v = d3Var;
        this.f4319r = str;
        this.f4320s = str2;
        this.f4321t = context;
        this.f4322u = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    public final void a() {
        boolean s10;
        String str;
        String str2;
        String str3;
        f1 f1Var;
        int b10;
        f1 f1Var2;
        String str4;
        String str5;
        try {
            s10 = this.f4323v.s(this.f4319r, this.f4320s);
            if (s10) {
                String str6 = this.f4320s;
                String str7 = this.f4319r;
                str5 = this.f4323v.f3784a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            z3.o.i(this.f4321t);
            d3 d3Var = this.f4323v;
            d3Var.f3792i = d3Var.x(this.f4321t, true);
            f1Var = this.f4323v.f3792i;
            if (f1Var == null) {
                str4 = this.f4323v.f3784a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f4321t, ModuleDescriptor.MODULE_ID);
            o1 o1Var = new o1(74029L, Math.max(a10, b10), DynamiteModule.b(this.f4321t, ModuleDescriptor.MODULE_ID) < a10, str, str2, str3, this.f4322u, p4.m.a(this.f4321t));
            f1Var2 = this.f4323v.f3792i;
            ((f1) z3.o.i(f1Var2)).initialize(g4.b.m0(this.f4321t), o1Var, this.f4146n);
        } catch (Exception e10) {
            this.f4323v.p(e10, true, false);
        }
    }
}
