package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m5 {
    private long A;
    private String B;
    private boolean C;
    private long D;
    private long E;

    /* renamed from: a  reason: collision with root package name */
    private final j4 f4760a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4761b;

    /* renamed from: c  reason: collision with root package name */
    private String f4762c;

    /* renamed from: d  reason: collision with root package name */
    private String f4763d;

    /* renamed from: e  reason: collision with root package name */
    private String f4764e;

    /* renamed from: f  reason: collision with root package name */
    private String f4765f;

    /* renamed from: g  reason: collision with root package name */
    private long f4766g;

    /* renamed from: h  reason: collision with root package name */
    private long f4767h;

    /* renamed from: i  reason: collision with root package name */
    private long f4768i;

    /* renamed from: j  reason: collision with root package name */
    private String f4769j;

    /* renamed from: k  reason: collision with root package name */
    private long f4770k;

    /* renamed from: l  reason: collision with root package name */
    private String f4771l;

    /* renamed from: m  reason: collision with root package name */
    private long f4772m;

    /* renamed from: n  reason: collision with root package name */
    private long f4773n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4774o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4775p;

    /* renamed from: q  reason: collision with root package name */
    private String f4776q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f4777r;

    /* renamed from: s  reason: collision with root package name */
    private long f4778s;

    /* renamed from: t  reason: collision with root package name */
    private List f4779t;

    /* renamed from: u  reason: collision with root package name */
    private String f4780u;

    /* renamed from: v  reason: collision with root package name */
    private long f4781v;

    /* renamed from: w  reason: collision with root package name */
    private long f4782w;

    /* renamed from: x  reason: collision with root package name */
    private long f4783x;

    /* renamed from: y  reason: collision with root package name */
    private long f4784y;

    /* renamed from: z  reason: collision with root package name */
    private long f4785z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m5(j4 j4Var, String str) {
        z3.o.i(j4Var);
        z3.o.e(str);
        this.f4760a = j4Var;
        this.f4761b = str;
        j4Var.b().h();
    }

    public final long A() {
        this.f4760a.b().h();
        return 0L;
    }

    public final void B(long j10) {
        z3.o.a(j10 >= 0);
        this.f4760a.b().h();
        this.C |= this.f4766g != j10;
        this.f4766g = j10;
    }

    public final void C(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4767h != j10;
        this.f4767h = j10;
    }

    public final void D(boolean z10) {
        this.f4760a.b().h();
        this.C |= this.f4774o != z10;
        this.f4774o = z10;
    }

    public final void E(Boolean bool) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4777r, bool);
        this.f4777r = bool;
    }

    public final void F(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4764e, str);
        this.f4764e = str;
    }

    public final void G(List list) {
        this.f4760a.b().h();
        if (p4.o.a(this.f4779t, list)) {
            return;
        }
        this.C = true;
        this.f4779t = list != null ? new ArrayList(list) : null;
    }

    public final void H(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4780u, str);
        this.f4780u = str;
    }

    public final boolean I() {
        this.f4760a.b().h();
        return this.f4775p;
    }

    public final boolean J() {
        this.f4760a.b().h();
        return this.f4774o;
    }

    public final boolean K() {
        this.f4760a.b().h();
        return this.C;
    }

    public final long L() {
        this.f4760a.b().h();
        return this.f4770k;
    }

    public final long M() {
        this.f4760a.b().h();
        return this.D;
    }

    public final long N() {
        this.f4760a.b().h();
        return this.f4784y;
    }

    public final long O() {
        this.f4760a.b().h();
        return this.f4785z;
    }

    public final long P() {
        this.f4760a.b().h();
        return this.f4783x;
    }

    public final long Q() {
        this.f4760a.b().h();
        return this.f4782w;
    }

    public final long R() {
        this.f4760a.b().h();
        return this.A;
    }

    public final long S() {
        this.f4760a.b().h();
        return this.f4781v;
    }

    public final long T() {
        this.f4760a.b().h();
        return this.f4773n;
    }

    public final long U() {
        this.f4760a.b().h();
        return this.f4778s;
    }

    public final long V() {
        this.f4760a.b().h();
        return this.E;
    }

    public final long W() {
        this.f4760a.b().h();
        return this.f4772m;
    }

    public final long X() {
        this.f4760a.b().h();
        return this.f4768i;
    }

    public final long Y() {
        this.f4760a.b().h();
        return this.f4766g;
    }

    public final long Z() {
        this.f4760a.b().h();
        return this.f4767h;
    }

    public final String a() {
        this.f4760a.b().h();
        return this.f4764e;
    }

    public final Boolean a0() {
        this.f4760a.b().h();
        return this.f4777r;
    }

    public final String b() {
        this.f4760a.b().h();
        return this.f4780u;
    }

    public final String b0() {
        this.f4760a.b().h();
        return this.f4776q;
    }

    public final List c() {
        this.f4760a.b().h();
        return this.f4779t;
    }

    public final String c0() {
        this.f4760a.b().h();
        String str = this.B;
        y(null);
        return str;
    }

    public final void d() {
        this.f4760a.b().h();
        this.C = false;
    }

    public final String d0() {
        this.f4760a.b().h();
        return this.f4761b;
    }

    public final void e() {
        this.f4760a.b().h();
        long j10 = this.f4766g + 1;
        if (j10 > 2147483647L) {
            this.f4760a.d().w().b("Bundle index overflow. appId", f3.z(this.f4761b));
            j10 = 0;
        }
        this.C = true;
        this.f4766g = j10;
    }

    public final String e0() {
        this.f4760a.b().h();
        return this.f4762c;
    }

    public final void f(String str) {
        this.f4760a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ p4.o.a(this.f4776q, str);
        this.f4776q = str;
    }

    public final String f0() {
        this.f4760a.b().h();
        return this.f4771l;
    }

    public final void g(boolean z10) {
        this.f4760a.b().h();
        this.C |= this.f4775p != z10;
        this.f4775p = z10;
    }

    public final String g0() {
        this.f4760a.b().h();
        return this.f4769j;
    }

    public final void h(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4762c, str);
        this.f4762c = str;
    }

    public final String h0() {
        this.f4760a.b().h();
        return this.f4765f;
    }

    public final void i(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4771l, str);
        this.f4771l = str;
    }

    public final String i0() {
        this.f4760a.b().h();
        return this.f4763d;
    }

    public final void j(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4769j, str);
        this.f4769j = str;
    }

    public final String j0() {
        this.f4760a.b().h();
        return this.B;
    }

    public final void k(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4770k != j10;
        this.f4770k = j10;
    }

    public final void l(long j10) {
        this.f4760a.b().h();
        this.C |= this.D != j10;
        this.D = j10;
    }

    public final void m(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4784y != j10;
        this.f4784y = j10;
    }

    public final void n(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4785z != j10;
        this.f4785z = j10;
    }

    public final void o(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4783x != j10;
        this.f4783x = j10;
    }

    public final void p(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4782w != j10;
        this.f4782w = j10;
    }

    public final void q(long j10) {
        this.f4760a.b().h();
        this.C |= this.A != j10;
        this.A = j10;
    }

    public final void r(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4781v != j10;
        this.f4781v = j10;
    }

    public final void s(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4773n != j10;
        this.f4773n = j10;
    }

    public final void t(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4778s != j10;
        this.f4778s = j10;
    }

    public final void u(long j10) {
        this.f4760a.b().h();
        this.C |= this.E != j10;
        this.E = j10;
    }

    public final void v(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.f4765f, str);
        this.f4765f = str;
    }

    public final void w(String str) {
        this.f4760a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ p4.o.a(this.f4763d, str);
        this.f4763d = str;
    }

    public final void x(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4772m != j10;
        this.f4772m = j10;
    }

    public final void y(String str) {
        this.f4760a.b().h();
        this.C |= !p4.o.a(this.B, str);
        this.B = str;
    }

    public final void z(long j10) {
        this.f4760a.b().h();
        this.C |= this.f4768i != j10;
        this.f4768i = j10;
    }
}
