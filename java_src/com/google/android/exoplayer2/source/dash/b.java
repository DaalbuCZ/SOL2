package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.t;
import o3.g0;
import o3.i0;
import o3.p0;
import p3.m0;
import s1.d3;
import s1.m1;
import t1.t1;
import u2.b0;
import u2.h;
import u2.k;
import u2.n0;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import w2.i;
import y2.f;
import y2.g;
import y2.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements r, o0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {
    private static final Pattern L = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern M = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final b0.a B;
    private final w.a C;
    private final t1 D;
    private r.a E;
    private o0 H;
    private y2.c I;
    private int J;
    private List<f> K;

    /* renamed from: n  reason: collision with root package name */
    final int f3387n;

    /* renamed from: o  reason: collision with root package name */
    private final a.InterfaceC0074a f3388o;

    /* renamed from: p  reason: collision with root package name */
    private final p0 f3389p;

    /* renamed from: q  reason: collision with root package name */
    private final y f3390q;

    /* renamed from: r  reason: collision with root package name */
    private final g0 f3391r;

    /* renamed from: s  reason: collision with root package name */
    private final x2.b f3392s;

    /* renamed from: t  reason: collision with root package name */
    private final long f3393t;

    /* renamed from: u  reason: collision with root package name */
    private final i0 f3394u;

    /* renamed from: v  reason: collision with root package name */
    private final o3.b f3395v;

    /* renamed from: w  reason: collision with root package name */
    private final v0 f3396w;

    /* renamed from: x  reason: collision with root package name */
    private final a[] f3397x;

    /* renamed from: y  reason: collision with root package name */
    private final h f3398y;

    /* renamed from: z  reason: collision with root package name */
    private final e f3399z;
    private i<com.google.android.exoplayer2.source.dash.a>[] F = F(0);
    private d[] G = new d[0];
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, e.c> A = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f3400a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3401b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3402c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3403d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3404e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3405f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3406g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f3401b = i10;
            this.f3400a = iArr;
            this.f3402c = i11;
            this.f3404e = i12;
            this.f3405f = i13;
            this.f3406g = i14;
            this.f3403d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, y2.c cVar, x2.b bVar, int i11, a.InterfaceC0074a interfaceC0074a, p0 p0Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, long j10, i0 i0Var, o3.b bVar2, h hVar, e.b bVar3, t1 t1Var) {
        this.f3387n = i10;
        this.I = cVar;
        this.f3392s = bVar;
        this.J = i11;
        this.f3388o = interfaceC0074a;
        this.f3389p = p0Var;
        this.f3390q = yVar;
        this.C = aVar;
        this.f3391r = g0Var;
        this.B = aVar2;
        this.f3393t = j10;
        this.f3394u = i0Var;
        this.f3395v = bVar2;
        this.f3398y = hVar;
        this.D = t1Var;
        this.f3399z = new e(cVar, bVar3, bVar2);
        this.H = hVar.a(this.F);
        g d10 = cVar.d(i11);
        List<f> list = d10.f16903d;
        this.K = list;
        Pair<v0, a[]> v10 = v(yVar, d10.f16902c, list);
        this.f3396w = (v0) v10.first;
        this.f3397x = (a[]) v10.second;
    }

    private static int[][] A(List<y2.a> list) {
        int i10;
        y2.e w10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f16855a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            y2.a aVar = list.get(i12);
            y2.e y10 = y(aVar.f16859e);
            if (y10 == null) {
                y10 = y(aVar.f16860f);
            }
            if (y10 == null || (i10 = sparseIntArray.get(Integer.parseInt(y10.f16893b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (w10 = w(aVar.f16860f)) != null) {
                for (String str : m0.P0(w10.f16893b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = d5.d.k((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    private int B(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f3397x[i11].f3404e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f3397x[i14].f3402c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] C(t[] tVarArr) {
        int[] iArr = new int[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10] != null) {
                iArr[i10] = this.f3396w.c(tVarArr[i10].c());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List<y2.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f16857c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f16918e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i10, List<y2.a> list, int[][] iArr, boolean[] zArr, m1[][] m1VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (D(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            m1VarArr[i12] = z(list, iArr[i12]);
            if (m1VarArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i<com.google.android.exoplayer2.source.dash.a>[] F(int i10) {
        return new i[i10];
    }

    private static m1[] H(y2.e eVar, Pattern pattern, m1 m1Var) {
        String str = eVar.f16893b;
        if (str == null) {
            return new m1[]{m1Var};
        }
        String[] P0 = m0.P0(str, ";");
        m1[] m1VarArr = new m1[P0.length];
        for (int i10 = 0; i10 < P0.length; i10++) {
            Matcher matcher = pattern.matcher(P0[i10]);
            if (!matcher.matches()) {
                return new m1[]{m1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            m1VarArr[i10] = m1Var.b().S(m1Var.f13576n + ":" + parseInt).F(parseInt).V(matcher.group(2)).E();
        }
        return m1VarArr;
    }

    private void J(t[] tVarArr, boolean[] zArr, n0[] n0VarArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10] == null || !zArr[i10]) {
                if (n0VarArr[i10] instanceof i) {
                    ((i) n0VarArr[i10]).Q(this);
                } else if (n0VarArr[i10] instanceof i.a) {
                    ((i.a) n0VarArr[i10]).c();
                }
                n0VarArr[i10] = null;
            }
        }
    }

    private void K(t[] tVarArr, n0[] n0VarArr, int[] iArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if ((n0VarArr[i10] instanceof k) || (n0VarArr[i10] instanceof i.a)) {
                int B = B(i10, iArr);
                if (!(B == -1 ? n0VarArr[i10] instanceof k : (n0VarArr[i10] instanceof i.a) && ((i.a) n0VarArr[i10]).f16027n == n0VarArr[B])) {
                    if (n0VarArr[i10] instanceof i.a) {
                        ((i.a) n0VarArr[i10]).c();
                    }
                    n0VarArr[i10] = null;
                }
            }
        }
    }

    private void L(t[] tVarArr, n0[] n0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            if (tVar != null) {
                if (n0VarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f3397x[iArr[i10]];
                    int i11 = aVar.f3402c;
                    if (i11 == 0) {
                        n0VarArr[i10] = u(aVar, tVar, j10);
                    } else if (i11 == 2) {
                        n0VarArr[i10] = new d(this.K.get(aVar.f3403d), tVar.c().b(0), this.I.f16868d);
                    }
                } else if (n0VarArr[i10] instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) n0VarArr[i10]).E()).c(tVar);
                }
            }
        }
        for (int i12 = 0; i12 < tVarArr.length; i12++) {
            if (n0VarArr[i12] == null && tVarArr[i12] != null) {
                a aVar2 = this.f3397x[iArr[i12]];
                if (aVar2.f3402c == 1) {
                    int B = B(i12, iArr);
                    if (B == -1) {
                        n0VarArr[i12] = new k();
                    } else {
                        n0VarArr[i12] = ((i) n0VarArr[B]).T(j10, aVar2.f3401b);
                    }
                }
            }
        }
    }

    private static void i(List<f> list, t0[] t0VarArr, a[] aVarArr, int i10) {
        f fVar;
        int i11 = 0;
        while (i11 < list.size()) {
            t0VarArr[i10] = new t0(fVar.a() + ":" + i11, new m1.b().S(list.get(i11).a()).e0("application/x-emsg").E());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int t(y yVar, List<y2.a> list, int[][] iArr, int i10, boolean[] zArr, m1[][] m1VarArr, t0[] t0VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f16857c);
            }
            int size = arrayList.size();
            m1[] m1VarArr2 = new m1[size];
            for (int i16 = 0; i16 < size; i16++) {
                m1 m1Var = ((j) arrayList.get(i16)).f16915b;
                m1VarArr2[i16] = m1Var.c(yVar.f(m1Var));
            }
            y2.a aVar = list.get(iArr2[0]);
            int i17 = aVar.f16855a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (m1VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            t0VarArr[i14] = new t0(num, m1VarArr2);
            aVarArr[i14] = a.d(aVar.f16856b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                t0VarArr[i18] = new t0(str, new m1.b().S(str).e0("application/x-emsg").E());
                aVarArr[i18] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                t0VarArr[i11] = new t0(num + ":cc", m1VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i<com.google.android.exoplayer2.source.dash.a> u(a aVar, t tVar, long j10) {
        int i10;
        t0 t0Var;
        t0 t0Var2;
        int i11;
        int i12 = aVar.f3405f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            t0Var = this.f3396w.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            t0Var = null;
        }
        int i13 = aVar.f3406g;
        boolean z11 = i13 != -1;
        if (z11) {
            t0Var2 = this.f3396w.b(i13);
            i10 += t0Var2.f15363n;
        } else {
            t0Var2 = null;
        }
        m1[] m1VarArr = new m1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            m1VarArr[0] = t0Var.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < t0Var2.f15363n; i14++) {
                m1VarArr[i11] = t0Var2.b(i14);
                iArr[i11] = 3;
                arrayList.add(m1VarArr[i11]);
                i11++;
            }
        }
        if (this.I.f16868d && z10) {
            cVar = this.f3399z.k();
        }
        e.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f3401b, iArr, m1VarArr, this.f3388o.a(this.f3394u, this.I, this.f3392s, this.J, aVar.f3400a, tVar, aVar.f3401b, this.f3393t, z10, arrayList, cVar2, this.f3389p, this.D), this, this.f3395v, j10, this.f3390q, this.C, this.f3391r, this.B);
        synchronized (this) {
            this.A.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<v0, a[]> v(y yVar, List<y2.a> list, List<f> list2) {
        int[][] A = A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        m1[][] m1VarArr = new m1[length];
        int E = E(length, list, A, zArr, m1VarArr) + length + list2.size();
        t0[] t0VarArr = new t0[E];
        a[] aVarArr = new a[E];
        i(list2, t0VarArr, aVarArr, t(yVar, list, A, length, zArr, m1VarArr, t0VarArr, aVarArr));
        return Pair.create(new v0(t0VarArr), aVarArr);
    }

    private static y2.e w(List<y2.e> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static y2.e x(List<y2.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            y2.e eVar = list.get(i10);
            if (str.equals(eVar.f16892a)) {
                return eVar;
            }
        }
        return null;
    }

    private static y2.e y(List<y2.e> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static m1[] z(List<y2.a> list, int[] iArr) {
        m1 E;
        Pattern pattern;
        for (int i10 : iArr) {
            y2.a aVar = list.get(i10);
            List<y2.e> list2 = list.get(i10).f16858d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                y2.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f16892a)) {
                    E = new m1.b().e0("application/cea-608").S(aVar.f16855a + ":cea608").E();
                    pattern = L;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f16892a)) {
                    E = new m1.b().e0("application/cea-708").S(aVar.f16855a + ":cea708").E();
                    pattern = M;
                }
                return H(eVar, pattern, E);
            }
        }
        return new m1[0];
    }

    @Override // u2.o0.a
    /* renamed from: G */
    public void o(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.E.o(this);
    }

    public void I() {
        this.f3399z.o();
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.F) {
            iVar.Q(this);
        }
        this.E = null;
    }

    public void M(y2.c cVar, int i10) {
        d[] dVarArr;
        this.I = cVar;
        this.J = i10;
        this.f3399z.q(cVar);
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr = this.F;
        if (iVarArr != null) {
            for (i<com.google.android.exoplayer2.source.dash.a> iVar : iVarArr) {
                iVar.E().h(cVar, i10);
            }
            this.E.o(this);
        }
        this.K = cVar.d(i10).f16903d;
        for (d dVar : this.G) {
            Iterator<f> it = this.K.iterator();
            while (true) {
                if (it.hasNext()) {
                    f next = it.next();
                    if (next.a().equals(dVar.a())) {
                        boolean z10 = true;
                        dVar.d(next, (cVar.f16868d && i10 == cVar.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.H.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.H.c();
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr;
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.F) {
            if (iVar.f16014n == 2) {
                return iVar.d(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // w2.i.b
    public synchronized void e(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        e.c remove = this.A.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.H.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.H.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.H.h(j10);
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.E = aVar;
        aVar.j(this);
    }

    @Override // u2.r
    public long m(t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        int[] C = C(tVarArr);
        J(tVarArr, zArr, n0VarArr);
        K(tVarArr, n0VarArr, C);
        L(tVarArr, n0VarArr, zArr2, j10, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n0 n0Var : n0VarArr) {
            if (n0Var instanceof i) {
                arrayList.add((i) n0Var);
            } else if (n0Var instanceof d) {
                arrayList2.add((d) n0Var);
            }
        }
        i<com.google.android.exoplayer2.source.dash.a>[] F = F(arrayList.size());
        this.F = F;
        arrayList.toArray(F);
        d[] dVarArr = new d[arrayList2.size()];
        this.G = dVarArr;
        arrayList2.toArray(dVarArr);
        this.H = this.f3398y.a(this.F);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return this.f3396w;
    }

    @Override // u2.r
    public void q() {
        this.f3394u.b();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.F) {
            iVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.F) {
            iVar.S(j10);
        }
        for (d dVar : this.G) {
            dVar.c(j10);
        }
        return j10;
    }
}
