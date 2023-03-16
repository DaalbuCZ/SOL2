package z2;

import a3.h;
import a3.l;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o3.g0;
import o3.p0;
import p3.m0;
import p3.v;
import s1.d3;
import s1.m1;
import t1.t1;
import u2.b0;
import u2.n0;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import z2.p;
/* loaded from: classes.dex */
public final class k implements u2.r, p.b, l.b {
    private final int A;
    private final boolean B;
    private final t1 C;
    private r.a D;
    private int E;
    private v0 F;
    private int J;
    private o0 K;

    /* renamed from: n  reason: collision with root package name */
    private final h f17238n;

    /* renamed from: o  reason: collision with root package name */
    private final a3.l f17239o;

    /* renamed from: p  reason: collision with root package name */
    private final g f17240p;

    /* renamed from: q  reason: collision with root package name */
    private final p0 f17241q;

    /* renamed from: r  reason: collision with root package name */
    private final y f17242r;

    /* renamed from: s  reason: collision with root package name */
    private final w.a f17243s;

    /* renamed from: t  reason: collision with root package name */
    private final g0 f17244t;

    /* renamed from: u  reason: collision with root package name */
    private final b0.a f17245u;

    /* renamed from: v  reason: collision with root package name */
    private final o3.b f17246v;

    /* renamed from: y  reason: collision with root package name */
    private final u2.h f17249y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f17250z;

    /* renamed from: w  reason: collision with root package name */
    private final IdentityHashMap<n0, Integer> f17247w = new IdentityHashMap<>();

    /* renamed from: x  reason: collision with root package name */
    private final s f17248x = new s();
    private p[] G = new p[0];
    private p[] H = new p[0];
    private int[][] I = new int[0];

    public k(h hVar, a3.l lVar, g gVar, p0 p0Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, o3.b bVar, u2.h hVar2, boolean z10, int i10, boolean z11, t1 t1Var) {
        this.f17238n = hVar;
        this.f17239o = lVar;
        this.f17240p = gVar;
        this.f17241q = p0Var;
        this.f17242r = yVar;
        this.f17243s = aVar;
        this.f17244t = g0Var;
        this.f17245u = aVar2;
        this.f17246v = bVar;
        this.f17249y = hVar2;
        this.f17250z = z10;
        this.A = i10;
        this.B = z11;
        this.C = t1Var;
        this.K = hVar2.a(new o0[0]);
    }

    private void t(long j10, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, w1.m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f144d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (m0.c(str, list.get(i11).f144d)) {
                        h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f141a);
                        arrayList2.add(aVar.f142b);
                        z10 &= m0.K(aVar.f142b.f13584v, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p w10 = w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) m0.k(new Uri[0])), (m1[]) arrayList2.toArray(new m1[0]), null, Collections.emptyList(), map, j10);
                list3.add(d5.d.k(arrayList3));
                list2.add(w10);
                if (this.f17250z && z10) {
                    w10.d0(new t0[]{new t0(str2, (m1[]) arrayList2.toArray(new m1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void u(a3.h hVar, long j10, List<p> list, List<int[]> list2, Map<String, w1.m> map) {
        boolean z10;
        boolean z11;
        int size = hVar.f132e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < hVar.f132e.size(); i12++) {
            m1 m1Var = hVar.f132e.get(i12).f146b;
            if (m1Var.E > 0 || m0.L(m1Var.f13584v, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (m0.L(m1Var.f13584v, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        m1[] m1VarArr = new m1[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < hVar.f132e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                h.b bVar = hVar.f132e.get(i14);
                uriArr[i13] = bVar.f145a;
                m1VarArr[i13] = bVar.f146b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = m1VarArr[0].f13584v;
        int K = m0.K(str, 2);
        int K2 = m0.K(str, 1);
        boolean z12 = (K2 == 1 || (K2 == 0 && hVar.f134g.isEmpty())) && K <= 1 && K2 + K > 0;
        p w10 = w("main", (z10 || K2 <= 0) ? 0 : 1, uriArr, m1VarArr, hVar.f137j, hVar.f138k, map, j10);
        list.add(w10);
        list2.add(iArr2);
        if (this.f17250z && z12) {
            ArrayList arrayList = new ArrayList();
            if (K > 0) {
                m1[] m1VarArr2 = new m1[size];
                for (int i15 = 0; i15 < size; i15++) {
                    m1VarArr2[i15] = z(m1VarArr[i15]);
                }
                arrayList.add(new t0("main", m1VarArr2));
                if (K2 > 0 && (hVar.f137j != null || hVar.f134g.isEmpty())) {
                    arrayList.add(new t0("main:audio", x(m1VarArr[0], hVar.f137j, false)));
                }
                List<m1> list3 = hVar.f138k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new t0("main:cc:" + i16, list3.get(i16)));
                    }
                }
            } else {
                m1[] m1VarArr3 = new m1[size];
                for (int i17 = 0; i17 < size; i17++) {
                    m1VarArr3[i17] = x(m1VarArr[i17], hVar.f137j, true);
                }
                arrayList.add(new t0("main", m1VarArr3));
            }
            t0 t0Var = new t0("main:id3", new m1.b().S("ID3").e0("application/id3").E());
            arrayList.add(t0Var);
            w10.d0((t0[]) arrayList.toArray(new t0[0]), 0, arrayList.indexOf(t0Var));
        }
    }

    private void v(long j10) {
        a3.h hVar = (a3.h) p3.a.e(this.f17239o.b());
        Map<String, w1.m> y10 = this.B ? y(hVar.f140m) : Collections.emptyMap();
        boolean z10 = !hVar.f132e.isEmpty();
        List<h.a> list = hVar.f134g;
        List<h.a> list2 = hVar.f135h;
        this.E = 0;
        ArrayList arrayList = new ArrayList();
        List<int[]> arrayList2 = new ArrayList<>();
        if (z10) {
            u(hVar, j10, arrayList, arrayList2, y10);
        }
        t(j10, list, arrayList, arrayList2, y10);
        this.J = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f144d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            p w10 = w(str, 3, new Uri[]{aVar.f141a}, new m1[]{aVar.f142b}, null, Collections.emptyList(), y10, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(w10);
            w10.d0(new t0[]{new t0(str, aVar.f142b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.G = (p[]) arrayList.toArray(new p[0]);
        this.I = (int[][]) arrayList2.toArray(new int[0]);
        this.E = this.G.length;
        for (int i12 = 0; i12 < this.J; i12++) {
            this.G[i12].m0(true);
        }
        for (p pVar : this.G) {
            pVar.B();
        }
        this.H = this.G;
    }

    private p w(String str, int i10, Uri[] uriArr, m1[] m1VarArr, m1 m1Var, List<m1> list, Map<String, w1.m> map, long j10) {
        return new p(str, i10, this, new f(this.f17238n, this.f17239o, uriArr, m1VarArr, this.f17240p, this.f17241q, this.f17248x, list, this.C), map, this.f17246v, j10, m1Var, this.f17242r, this.f17243s, this.f17244t, this.f17245u, this.A);
    }

    private static m1 x(m1 m1Var, m1 m1Var2, boolean z10) {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        k2.a aVar;
        int i12;
        if (m1Var2 != null) {
            str2 = m1Var2.f13584v;
            aVar = m1Var2.f13585w;
            int i13 = m1Var2.L;
            i10 = m1Var2.f13579q;
            int i14 = m1Var2.f13580r;
            String str4 = m1Var2.f13578p;
            str3 = m1Var2.f13577o;
            i11 = i13;
            i12 = i14;
            str = str4;
        } else {
            String L = m0.L(m1Var.f13584v, 1);
            k2.a aVar2 = m1Var.f13585w;
            if (z10) {
                int i15 = m1Var.L;
                int i16 = m1Var.f13579q;
                int i17 = m1Var.f13580r;
                str = m1Var.f13578p;
                str2 = L;
                str3 = m1Var.f13577o;
                i11 = i15;
                i10 = i16;
                aVar = aVar2;
                i12 = i17;
            } else {
                str = null;
                i10 = 0;
                i11 = -1;
                str2 = L;
                str3 = null;
                aVar = aVar2;
                i12 = 0;
            }
        }
        return new m1.b().S(m1Var.f13576n).U(str3).K(m1Var.f13586x).e0(v.g(str2)).I(str2).X(aVar).G(z10 ? m1Var.f13581s : -1).Z(z10 ? m1Var.f13582t : -1).H(i11).g0(i10).c0(i12).V(str).E();
    }

    private static Map<String, w1.m> y(List<w1.m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            w1.m mVar = list.get(i10);
            String str = mVar.f15939p;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                w1.m mVar2 = (w1.m) arrayList.get(i11);
                if (TextUtils.equals(mVar2.f15939p, str)) {
                    mVar = mVar.f(mVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    private static m1 z(m1 m1Var) {
        String L = m0.L(m1Var.f13584v, 2);
        return new m1.b().S(m1Var.f13576n).U(m1Var.f13577o).K(m1Var.f13586x).e0(v.g(L)).I(L).X(m1Var.f13585w).G(m1Var.f13581s).Z(m1Var.f13582t).j0(m1Var.D).Q(m1Var.E).P(m1Var.F).g0(m1Var.f13579q).c0(m1Var.f13580r).E();
    }

    @Override // u2.o0.a
    /* renamed from: A */
    public void o(p pVar) {
        this.D.o(this);
    }

    public void B() {
        this.f17239o.d(this);
        for (p pVar : this.G) {
            pVar.f0();
        }
        this.D = null;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.K.a();
    }

    @Override // z2.p.b
    public void b() {
        p[] pVarArr;
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (p pVar : this.G) {
            i11 += pVar.p().f15375n;
        }
        t0[] t0VarArr = new t0[i11];
        int i12 = 0;
        for (p pVar2 : this.G) {
            int i13 = pVar2.p().f15375n;
            int i14 = 0;
            while (i14 < i13) {
                t0VarArr[i12] = pVar2.p().b(i14);
                i14++;
                i12++;
            }
        }
        this.F = new v0(t0VarArr);
        this.D.j(this);
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.K.c();
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        p[] pVarArr;
        for (p pVar : this.H) {
            if (pVar.R()) {
                return pVar.d(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // a3.l.b
    public void e() {
        for (p pVar : this.G) {
            pVar.b0();
        }
        this.D.o(this);
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.K.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        if (this.F == null) {
            for (p pVar : this.G) {
                pVar.B();
            }
            return false;
        }
        return this.K.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.K.h(j10);
    }

    @Override // a3.l.b
    public boolean i(Uri uri, g0.c cVar, boolean z10) {
        boolean z11 = true;
        for (p pVar : this.G) {
            z11 &= pVar.a0(uri, cVar, z10);
        }
        this.D.o(this);
        return z11;
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.D = aVar;
        this.f17239o.l(this);
        v(j10);
    }

    @Override // z2.p.b
    public void l(Uri uri) {
        this.f17239o.i(uri);
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        n0[] n0VarArr2 = n0VarArr;
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            iArr[i10] = n0VarArr2[i10] == null ? -1 : this.f17247w.get(n0VarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (tVarArr[i10] != null) {
                t0 c10 = tVarArr[i10].c();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.G;
                    if (i11 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i11].p().c(c10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f17247w.clear();
        int length = tVarArr.length;
        n0[] n0VarArr3 = new n0[length];
        n0[] n0VarArr4 = new n0[tVarArr.length];
        n3.t[] tVarArr2 = new n3.t[tVarArr.length];
        p[] pVarArr2 = new p[this.G.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.G.length) {
            for (int i14 = 0; i14 < tVarArr.length; i14++) {
                n3.t tVar = null;
                n0VarArr4[i14] = iArr[i14] == i13 ? n0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    tVar = tVarArr[i14];
                }
                tVarArr2[i14] = tVar;
            }
            p pVar = this.G[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            n3.t[] tVarArr3 = tVarArr2;
            p[] pVarArr3 = pVarArr2;
            boolean j02 = pVar.j0(tVarArr2, zArr, n0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= tVarArr.length) {
                    break;
                }
                n0 n0Var = n0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    p3.a.e(n0Var);
                    n0VarArr3[i18] = n0Var;
                    this.f17247w.put(n0Var, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    p3.a.f(n0Var == null);
                }
                i18++;
            }
            if (z11) {
                pVarArr3[i15] = pVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    pVar.m0(true);
                    if (!j02) {
                        p[] pVarArr4 = this.H;
                        if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                        }
                    }
                    this.f17248x.b();
                    z10 = true;
                } else {
                    pVar.m0(i17 < this.J);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            pVarArr2 = pVarArr3;
            length = i16;
            tVarArr2 = tVarArr3;
            n0VarArr2 = n0VarArr;
        }
        System.arraycopy(n0VarArr3, 0, n0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) m0.F0(pVarArr2, i12);
        this.H = pVarArr5;
        this.K = this.f17249y.a(pVarArr5);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return (v0) p3.a.e(this.F);
    }

    @Override // u2.r
    public void q() {
        for (p pVar : this.G) {
            pVar.q();
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (p pVar : this.H) {
            pVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        p[] pVarArr = this.H;
        if (pVarArr.length > 0) {
            boolean i02 = pVarArr[0].i0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.H;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].i0(j10, i02);
                i10++;
            }
            if (i02) {
                this.f17248x.b();
            }
        }
        return j10;
    }
}
