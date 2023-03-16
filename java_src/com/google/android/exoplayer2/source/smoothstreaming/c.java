package com.google.android.exoplayer2.source.smoothstreaming;

import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.util.ArrayList;
import n3.t;
import o3.g0;
import o3.i0;
import o3.p0;
import s1.d3;
import s1.m1;
import u2.b0;
import u2.h;
import u2.n0;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import w2.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements r, o0.a<i<b>> {
    private o0 A;

    /* renamed from: n  reason: collision with root package name */
    private final b.a f3501n;

    /* renamed from: o  reason: collision with root package name */
    private final p0 f3502o;

    /* renamed from: p  reason: collision with root package name */
    private final i0 f3503p;

    /* renamed from: q  reason: collision with root package name */
    private final y f3504q;

    /* renamed from: r  reason: collision with root package name */
    private final w.a f3505r;

    /* renamed from: s  reason: collision with root package name */
    private final g0 f3506s;

    /* renamed from: t  reason: collision with root package name */
    private final b0.a f3507t;

    /* renamed from: u  reason: collision with root package name */
    private final o3.b f3508u;

    /* renamed from: v  reason: collision with root package name */
    private final v0 f3509v;

    /* renamed from: w  reason: collision with root package name */
    private final h f3510w;

    /* renamed from: x  reason: collision with root package name */
    private r.a f3511x;

    /* renamed from: y  reason: collision with root package name */
    private c3.a f3512y;

    /* renamed from: z  reason: collision with root package name */
    private i<b>[] f3513z;

    public c(c3.a aVar, b.a aVar2, p0 p0Var, h hVar, y yVar, w.a aVar3, g0 g0Var, b0.a aVar4, i0 i0Var, o3.b bVar) {
        this.f3512y = aVar;
        this.f3501n = aVar2;
        this.f3502o = p0Var;
        this.f3503p = i0Var;
        this.f3504q = yVar;
        this.f3505r = aVar3;
        this.f3506s = g0Var;
        this.f3507t = aVar4;
        this.f3508u = bVar;
        this.f3510w = hVar;
        this.f3509v = i(aVar, yVar);
        i<b>[] t10 = t(0);
        this.f3513z = t10;
        this.A = hVar.a(t10);
    }

    private i<b> e(t tVar, long j10) {
        int c10 = this.f3509v.c(tVar.c());
        return new i<>(this.f3512y.f3155f[c10].f3161a, null, null, this.f3501n.a(this.f3503p, this.f3512y, c10, tVar, this.f3502o), this, this.f3508u, j10, this.f3504q, this.f3505r, this.f3506s, this.f3507t);
    }

    private static v0 i(c3.a aVar, y yVar) {
        t0[] t0VarArr = new t0[aVar.f3155f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f3155f;
            if (i10 >= bVarArr.length) {
                return new v0(t0VarArr);
            }
            m1[] m1VarArr = bVarArr[i10].f3170j;
            m1[] m1VarArr2 = new m1[m1VarArr.length];
            for (int i11 = 0; i11 < m1VarArr.length; i11++) {
                m1 m1Var = m1VarArr[i11];
                m1VarArr2[i11] = m1Var.c(yVar.f(m1Var));
            }
            t0VarArr[i10] = new t0(Integer.toString(i10), m1VarArr2);
            i10++;
        }
    }

    private static i<b>[] t(int i10) {
        return new i[i10];
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.A.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.A.c();
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        i<b>[] iVarArr;
        for (i<b> iVar : this.f3513z) {
            if (iVar.f16014n == 2) {
                return iVar.d(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.A.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.A.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.A.h(j10);
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.f3511x = aVar;
        aVar.j(this);
    }

    @Override // u2.r
    public long m(t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (n0VarArr[i10] != null) {
                i iVar = (i) n0VarArr[i10];
                if (tVarArr[i10] == null || !zArr[i10]) {
                    iVar.P();
                    n0VarArr[i10] = null;
                } else {
                    ((b) iVar.E()).c(tVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (n0VarArr[i10] == null && tVarArr[i10] != null) {
                i<b> e10 = e(tVarArr[i10], j10);
                arrayList.add(e10);
                n0VarArr[i10] = e10;
                zArr2[i10] = true;
            }
        }
        i<b>[] t10 = t(arrayList.size());
        this.f3513z = t10;
        arrayList.toArray(t10);
        this.A = this.f3510w.a(this.f3513z);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return this.f3509v;
    }

    @Override // u2.r
    public void q() {
        this.f3503p.b();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (i<b> iVar : this.f3513z) {
            iVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        for (i<b> iVar : this.f3513z) {
            iVar.S(j10);
        }
        return j10;
    }

    @Override // u2.o0.a
    /* renamed from: u */
    public void o(i<b> iVar) {
        this.f3511x.o(this);
    }

    public void v() {
        for (i<b> iVar : this.f3513z) {
            iVar.P();
        }
        this.f3511x = null;
    }

    public void w(c3.a aVar) {
        this.f3512y = aVar;
        for (i<b> iVar : this.f3513z) {
            iVar.E().f(aVar);
        }
        this.f3511x.o(this);
    }
}
