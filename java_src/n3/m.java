package n3;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b5.h0;
import b5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import n3.a;
import n3.a0;
import n3.m;
import n3.t;
import n3.v;
import p3.m0;
import s1.b3;
import s1.h;
import s1.l3;
import s1.m1;
import s1.z2;
import u2.t0;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public class m extends v {

    /* renamed from: k  reason: collision with root package name */
    private static final h0<Integer> f11663k = h0.a(n3.f.f11652n);

    /* renamed from: l  reason: collision with root package name */
    private static final h0<Integer> f11664l = h0.a(n3.e.f11651n);

    /* renamed from: d  reason: collision with root package name */
    private final Object f11665d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f11666e;

    /* renamed from: f  reason: collision with root package name */
    private final t.b f11667f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11668g;

    /* renamed from: h  reason: collision with root package name */
    private d f11669h;

    /* renamed from: i  reason: collision with root package name */
    private f f11670i;

    /* renamed from: j  reason: collision with root package name */
    private u1.e f11671j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends h<b> implements Comparable<b> {
        private final int A;
        private final int B;
        private final boolean C;
        private final int D;
        private final int E;
        private final int F;
        private final int G;
        private final boolean H;
        private final boolean I;

        /* renamed from: r  reason: collision with root package name */
        private final int f11672r;

        /* renamed from: s  reason: collision with root package name */
        private final boolean f11673s;

        /* renamed from: t  reason: collision with root package name */
        private final String f11674t;

        /* renamed from: u  reason: collision with root package name */
        private final d f11675u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f11676v;

        /* renamed from: w  reason: collision with root package name */
        private final int f11677w;

        /* renamed from: x  reason: collision with root package name */
        private final int f11678x;

        /* renamed from: y  reason: collision with root package name */
        private final int f11679y;

        /* renamed from: z  reason: collision with root package name */
        private final boolean f11680z;

        public b(int i10, t0 t0Var, int i11, d dVar, int i12, boolean z10, a5.k<m1> kVar) {
            super(i10, t0Var, i11);
            int i13;
            int i14;
            int i15;
            this.f11675u = dVar;
            this.f11674t = m.Q(this.f11713q.f13578p);
            this.f11676v = m.I(i12, false);
            int i16 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i16 >= dVar.A.size()) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
                i14 = m.B(this.f11713q, dVar.A.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f11678x = i16;
            this.f11677w = i14;
            this.f11679y = m.E(this.f11713q.f13580r, dVar.B);
            m1 m1Var = this.f11713q;
            int i17 = m1Var.f13580r;
            this.f11680z = i17 == 0 || (i17 & 1) != 0;
            this.C = (m1Var.f13579q & 1) != 0;
            int i18 = m1Var.L;
            this.D = i18;
            this.E = m1Var.M;
            int i19 = m1Var.f13583u;
            this.F = i19;
            this.f11673s = (i19 == -1 || i19 <= dVar.D) && (i18 == -1 || i18 <= dVar.C) && kVar.apply(m1Var);
            String[] g02 = m0.g0();
            int i20 = 0;
            while (true) {
                if (i20 >= g02.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                }
                i15 = m.B(this.f11713q, g02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.A = i20;
            this.B = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.E.size()) {
                    String str = this.f11713q.f13587y;
                    if (str != null && str.equals(dVar.E.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.G = i13;
            this.H = z2.e(i12) == 128;
            this.I = z2.g(i12) == 64;
            this.f11672r = m(i12, z10);
        }

        public static int h(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static b5.q<b> l(int i10, t0 t0Var, d dVar, int[] iArr, boolean z10, a5.k<m1> kVar) {
            q.a D = b5.q.D();
            for (int i11 = 0; i11 < t0Var.f15363n; i11++) {
                D.a(new b(i10, t0Var, i11, dVar, iArr[i11], z10, kVar));
            }
            return D.h();
        }

        private int m(int i10, boolean z10) {
            if (m.I(i10, this.f11675u.f11686a0)) {
                if (this.f11673s || this.f11675u.U) {
                    if (m.I(i10, false) && this.f11673s && this.f11713q.f13583u != -1) {
                        d dVar = this.f11675u;
                        if (!dVar.K && !dVar.J && (dVar.f11688c0 || !z10)) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // n3.m.h
        public int e() {
            return this.f11672r;
        }

        @Override // java.lang.Comparable
        /* renamed from: j */
        public int compareTo(b bVar) {
            h0 d10 = (this.f11673s && this.f11676v) ? m.f11663k : m.f11663k.d();
            b5.k f10 = b5.k.j().g(this.f11676v, bVar.f11676v).f(Integer.valueOf(this.f11678x), Integer.valueOf(bVar.f11678x), h0.b().d()).d(this.f11677w, bVar.f11677w).d(this.f11679y, bVar.f11679y).g(this.C, bVar.C).g(this.f11680z, bVar.f11680z).f(Integer.valueOf(this.A), Integer.valueOf(bVar.A), h0.b().d()).d(this.B, bVar.B).g(this.f11673s, bVar.f11673s).f(Integer.valueOf(this.G), Integer.valueOf(bVar.G), h0.b().d()).f(Integer.valueOf(this.F), Integer.valueOf(bVar.F), this.f11675u.J ? m.f11663k.d() : m.f11664l).g(this.H, bVar.H).g(this.I, bVar.I).f(Integer.valueOf(this.D), Integer.valueOf(bVar.D), d10).f(Integer.valueOf(this.E), Integer.valueOf(bVar.E), d10);
            Integer valueOf = Integer.valueOf(this.F);
            Integer valueOf2 = Integer.valueOf(bVar.F);
            if (!m0.c(this.f11674t, bVar.f11674t)) {
                d10 = m.f11664l;
            }
            return f10.f(valueOf, valueOf2, d10).i();
        }

        @Override // n3.m.h
        /* renamed from: p */
        public boolean g(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f11675u;
            if ((dVar.X || ((i11 = this.f11713q.L) != -1 && i11 == bVar.f11713q.L)) && (dVar.V || ((str = this.f11713q.f13587y) != null && TextUtils.equals(str, bVar.f11713q.f13587y)))) {
                d dVar2 = this.f11675u;
                if ((dVar2.W || ((i10 = this.f11713q.M) != -1 && i10 == bVar.f11713q.M)) && (dVar2.Y || (this.H == bVar.H && this.I == bVar.I))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: n  reason: collision with root package name */
        private final boolean f11681n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f11682o;

        public c(m1 m1Var, int i10) {
            this.f11681n = (m1Var.f13579q & 1) != 0;
            this.f11682o = m.I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(c cVar) {
            return b5.k.j().g(this.f11682o, cVar.f11682o).g(this.f11681n, cVar.f11681n).i();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a0 {

        /* renamed from: f0  reason: collision with root package name */
        public static final d f11683f0;
        @Deprecated

        /* renamed from: g0  reason: collision with root package name */
        public static final d f11684g0;

        /* renamed from: h0  reason: collision with root package name */
        public static final h.a<d> f11685h0;
        public final boolean Q;
        public final boolean R;
        public final boolean S;
        public final boolean T;
        public final boolean U;
        public final boolean V;
        public final boolean W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* renamed from: a0  reason: collision with root package name */
        public final boolean f11686a0;

        /* renamed from: b0  reason: collision with root package name */
        public final boolean f11687b0;

        /* renamed from: c0  reason: collision with root package name */
        public final boolean f11688c0;

        /* renamed from: d0  reason: collision with root package name */
        private final SparseArray<Map<v0, e>> f11689d0;

        /* renamed from: e0  reason: collision with root package name */
        private final SparseBooleanArray f11690e0;

        /* loaded from: classes.dex */
        public static final class a extends a0.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<v0, e>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.f11683f0;
                n0(bundle.getBoolean(a0.b(1000), dVar.Q));
                i0(bundle.getBoolean(a0.b(1001), dVar.R));
                j0(bundle.getBoolean(a0.b(1002), dVar.S));
                h0(bundle.getBoolean(a0.b(1014), dVar.T));
                l0(bundle.getBoolean(a0.b(1003), dVar.U));
                e0(bundle.getBoolean(a0.b(1004), dVar.V));
                f0(bundle.getBoolean(a0.b(1005), dVar.W));
                c0(bundle.getBoolean(a0.b(1006), dVar.X));
                d0(bundle.getBoolean(a0.b(1015), dVar.Y));
                k0(bundle.getBoolean(a0.b(1016), dVar.Z));
                m0(bundle.getBoolean(a0.b(1007), dVar.f11686a0));
                r0(bundle.getBoolean(a0.b(1008), dVar.f11687b0));
                g0(bundle.getBoolean(a0.b(1009), dVar.f11688c0));
                this.N = new SparseArray<>();
                q0(bundle);
                this.O = a0(bundle.getIntArray(a0.b(1013)));
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.Q;
                this.B = dVar.R;
                this.C = dVar.S;
                this.D = dVar.T;
                this.E = dVar.U;
                this.F = dVar.V;
                this.G = dVar.W;
                this.H = dVar.X;
                this.I = dVar.Y;
                this.J = dVar.Z;
                this.K = dVar.f11686a0;
                this.L = dVar.f11687b0;
                this.M = dVar.f11688c0;
                this.N = Y(dVar.f11689d0);
                this.O = dVar.f11690e0.clone();
            }

            private static SparseArray<Map<v0, e>> Y(SparseArray<Map<v0, e>> sparseArray) {
                SparseArray<Map<v0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            private void q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(a0.b(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.b(1011));
                b5.q J = parcelableArrayList == null ? b5.q.J() : p3.c.b(v0.f15374r, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a0.b(1012));
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : p3.c.c(e.f11691r, sparseParcelableArray);
                if (intArray == null || intArray.length != J.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    p0(intArray[i10], (v0) J.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // n3.a0.a
            /* renamed from: X */
            public d A() {
                return new d(this);
            }

            protected a b0(a0 a0Var) {
                super.D(a0Var);
                return this;
            }

            public a c0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a d0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a e0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.A = z10;
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: o0 */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            @Deprecated
            public a p0(int i10, v0 v0Var, e eVar) {
                Map<v0, e> map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i10, map);
                }
                if (map.containsKey(v0Var) && m0.c(map.get(v0Var), eVar)) {
                    return this;
                }
                map.put(v0Var, eVar);
                return this;
            }

            public a r0(boolean z10) {
                this.L = z10;
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: s0 */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: t0 */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }
        }

        static {
            d A = new a().A();
            f11683f0 = A;
            f11684g0 = A;
            f11685h0 = n.f11723a;
        }

        private d(a aVar) {
            super(aVar);
            this.Q = aVar.A;
            this.R = aVar.B;
            this.S = aVar.C;
            this.T = aVar.D;
            this.U = aVar.E;
            this.V = aVar.F;
            this.W = aVar.G;
            this.X = aVar.H;
            this.Y = aVar.I;
            this.Z = aVar.J;
            this.f11686a0 = aVar.K;
            this.f11687b0 = aVar.L;
            this.f11688c0 = aVar.M;
            this.f11689d0 = aVar.N;
            this.f11690e0 = aVar.O;
        }

        private static boolean f(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean g(SparseArray<Map<v0, e>> sparseArray, SparseArray<Map<v0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !h(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean h(java.util.Map<u2.v0, n3.m.e> r4, java.util.Map<u2.v0, n3.m.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                u2.v0 r1 = (u2.v0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p3.m0.c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.m.d.h(java.util.Map, java.util.Map):boolean");
        }

        public static d j(Context context) {
            return new a(context).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d n(Bundle bundle) {
            return new a(bundle).A();
        }

        @Override // n3.a0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.Q == dVar.Q && this.R == dVar.R && this.S == dVar.S && this.T == dVar.T && this.U == dVar.U && this.V == dVar.V && this.W == dVar.W && this.X == dVar.X && this.Y == dVar.Y && this.Z == dVar.Z && this.f11686a0 == dVar.f11686a0 && this.f11687b0 == dVar.f11687b0 && this.f11688c0 == dVar.f11688c0 && f(this.f11690e0, dVar.f11690e0) && g(this.f11689d0, dVar.f11689d0);
        }

        @Override // n3.a0
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f11686a0 ? 1 : 0)) * 31) + (this.f11687b0 ? 1 : 0)) * 31) + (this.f11688c0 ? 1 : 0);
        }

        public a i() {
            return new a();
        }

        public boolean k(int i10) {
            return this.f11690e0.get(i10);
        }

        @Deprecated
        public e l(int i10, v0 v0Var) {
            Map<v0, e> map = this.f11689d0.get(i10);
            if (map != null) {
                return map.get(v0Var);
            }
            return null;
        }

        @Deprecated
        public boolean m(int i10, v0 v0Var) {
            Map<v0, e> map = this.f11689d0.get(i10);
            return map != null && map.containsKey(v0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements s1.h {

        /* renamed from: r  reason: collision with root package name */
        public static final h.a<e> f11691r = o.f11724a;

        /* renamed from: n  reason: collision with root package name */
        public final int f11692n;

        /* renamed from: o  reason: collision with root package name */
        public final int[] f11693o;

        /* renamed from: p  reason: collision with root package name */
        public final int f11694p;

        /* renamed from: q  reason: collision with root package name */
        public final int f11695q;

        public e(int i10, int[] iArr, int i11) {
            this.f11692n = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11693o = copyOf;
            this.f11694p = iArr.length;
            this.f11695q = i11;
            Arrays.sort(copyOf);
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i11 = bundle.getInt(b(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            p3.a.a(z10);
            p3.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11692n == eVar.f11692n && Arrays.equals(this.f11693o, eVar.f11693o) && this.f11695q == eVar.f11695q;
        }

        public int hashCode() {
            return (((this.f11692n * 31) + Arrays.hashCode(this.f11693o)) * 31) + this.f11695q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f11696a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f11697b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f11698c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f11699d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f11700a;

            a(f fVar, m mVar) {
                this.f11700a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f11700a.P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f11700a.P();
            }
        }

        private f(Spatializer spatializer) {
            this.f11696a = spatializer;
            this.f11697b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(u1.e eVar, m1 m1Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m0.G(("audio/eac3-joc".equals(m1Var.f13587y) && m1Var.L == 16) ? 12 : m1Var.L));
            int i10 = m1Var.M;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f11696a.canBeSpatialized(eVar.b().f14915a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f11699d == null && this.f11698c == null) {
                this.f11699d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f11698c = handler;
                Spatializer spatializer = this.f11696a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new p(handler), this.f11699d);
            }
        }

        public boolean c() {
            return this.f11696a.isAvailable();
        }

        public boolean d() {
            return this.f11696a.isEnabled();
        }

        public boolean e() {
            return this.f11697b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f11699d;
            if (onSpatializerStateChangedListener == null || this.f11698c == null) {
                return;
            }
            this.f11696a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) m0.j(this.f11698c)).removeCallbacksAndMessages(null);
            this.f11698c = null;
            this.f11699d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: r  reason: collision with root package name */
        private final int f11701r;

        /* renamed from: s  reason: collision with root package name */
        private final boolean f11702s;

        /* renamed from: t  reason: collision with root package name */
        private final boolean f11703t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f11704u;

        /* renamed from: v  reason: collision with root package name */
        private final int f11705v;

        /* renamed from: w  reason: collision with root package name */
        private final int f11706w;

        /* renamed from: x  reason: collision with root package name */
        private final int f11707x;

        /* renamed from: y  reason: collision with root package name */
        private final int f11708y;

        /* renamed from: z  reason: collision with root package name */
        private final boolean f11709z;

        public g(int i10, t0 t0Var, int i11, d dVar, int i12, String str) {
            super(i10, t0Var, i11);
            int i13;
            int i14 = 0;
            this.f11702s = m.I(i12, false);
            int i15 = this.f11713q.f13579q & (~dVar.H);
            this.f11703t = (i15 & 1) != 0;
            this.f11704u = (i15 & 2) != 0;
            int i16 = Integer.MAX_VALUE;
            b5.q<String> K = dVar.F.isEmpty() ? b5.q.K("") : dVar.F;
            int i17 = 0;
            while (true) {
                if (i17 >= K.size()) {
                    i13 = 0;
                    break;
                }
                i13 = m.B(this.f11713q, K.get(i17), dVar.I);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f11705v = i16;
            this.f11706w = i13;
            int E = m.E(this.f11713q.f13580r, dVar.G);
            this.f11707x = E;
            this.f11709z = (this.f11713q.f13580r & 1088) != 0;
            int B = m.B(this.f11713q, str, m.Q(str) == null);
            this.f11708y = B;
            boolean z10 = i13 > 0 || (dVar.F.isEmpty() && E > 0) || this.f11703t || (this.f11704u && B > 0);
            if (m.I(i12, dVar.f11686a0) && z10) {
                i14 = 1;
            }
            this.f11701r = i14;
        }

        public static int h(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static b5.q<g> l(int i10, t0 t0Var, d dVar, int[] iArr, String str) {
            q.a D = b5.q.D();
            for (int i11 = 0; i11 < t0Var.f15363n; i11++) {
                D.a(new g(i10, t0Var, i11, dVar, iArr[i11], str));
            }
            return D.h();
        }

        @Override // n3.m.h
        public int e() {
            return this.f11701r;
        }

        @Override // java.lang.Comparable
        /* renamed from: j */
        public int compareTo(g gVar) {
            b5.k d10 = b5.k.j().g(this.f11702s, gVar.f11702s).f(Integer.valueOf(this.f11705v), Integer.valueOf(gVar.f11705v), h0.b().d()).d(this.f11706w, gVar.f11706w).d(this.f11707x, gVar.f11707x).g(this.f11703t, gVar.f11703t).f(Boolean.valueOf(this.f11704u), Boolean.valueOf(gVar.f11704u), this.f11706w == 0 ? h0.b() : h0.b().d()).d(this.f11708y, gVar.f11708y);
            if (this.f11707x == 0) {
                d10 = d10.h(this.f11709z, gVar.f11709z);
            }
            return d10.i();
        }

        @Override // n3.m.h
        /* renamed from: m */
        public boolean g(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: n  reason: collision with root package name */
        public final int f11710n;

        /* renamed from: o  reason: collision with root package name */
        public final t0 f11711o;

        /* renamed from: p  reason: collision with root package name */
        public final int f11712p;

        /* renamed from: q  reason: collision with root package name */
        public final m1 f11713q;

        /* loaded from: classes.dex */
        public interface a<T extends h<T>> {
            List<T> a(int i10, t0 t0Var, int[] iArr);
        }

        public h(int i10, t0 t0Var, int i11) {
            this.f11710n = i10;
            this.f11711o = t0Var;
            this.f11712p = i11;
            this.f11713q = t0Var.b(i11);
        }

        public abstract int e();

        public abstract boolean g(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i extends h<i> {
        private final boolean A;
        private final int B;
        private final boolean C;
        private final boolean D;
        private final int E;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f11714r;

        /* renamed from: s  reason: collision with root package name */
        private final d f11715s;

        /* renamed from: t  reason: collision with root package name */
        private final boolean f11716t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f11717u;

        /* renamed from: v  reason: collision with root package name */
        private final int f11718v;

        /* renamed from: w  reason: collision with root package name */
        private final int f11719w;

        /* renamed from: x  reason: collision with root package name */
        private final int f11720x;

        /* renamed from: y  reason: collision with root package name */
        private final int f11721y;

        /* renamed from: z  reason: collision with root package name */
        private final boolean f11722z;

        /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00cc A[EDGE_INSN: B:78:0x00cc->B:68:0x00cc ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r5, u2.t0 r6, int r7, n3.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.m.i.<init>(int, u2.t0, int, n3.m$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int l(i iVar, i iVar2) {
            b5.k g10 = b5.k.j().g(iVar.f11717u, iVar2.f11717u).d(iVar.f11721y, iVar2.f11721y).g(iVar.f11722z, iVar2.f11722z).g(iVar.f11714r, iVar2.f11714r).g(iVar.f11716t, iVar2.f11716t).f(Integer.valueOf(iVar.f11720x), Integer.valueOf(iVar2.f11720x), h0.b().d()).g(iVar.C, iVar2.C).g(iVar.D, iVar2.D);
            if (iVar.C && iVar.D) {
                g10 = g10.d(iVar.E, iVar2.E);
            }
            return g10.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int m(i iVar, i iVar2) {
            h0 d10 = (iVar.f11714r && iVar.f11717u) ? m.f11663k : m.f11663k.d();
            return b5.k.j().f(Integer.valueOf(iVar.f11718v), Integer.valueOf(iVar2.f11718v), iVar.f11715s.J ? m.f11663k.d() : m.f11664l).f(Integer.valueOf(iVar.f11719w), Integer.valueOf(iVar2.f11719w), d10).f(Integer.valueOf(iVar.f11718v), Integer.valueOf(iVar2.f11718v), d10).i();
        }

        public static int p(List<i> list, List<i> list2) {
            return b5.k.j().f((i) Collections.max(list, q.f11726n), (i) Collections.max(list2, q.f11726n), q.f11726n).d(list.size(), list2.size()).f((i) Collections.max(list, r.f11727n), (i) Collections.max(list2, r.f11727n), r.f11727n).i();
        }

        public static b5.q<i> q(int i10, t0 t0Var, d dVar, int[] iArr, int i11) {
            int C = m.C(t0Var, dVar.f11604v, dVar.f11605w, dVar.f11606x);
            q.a D = b5.q.D();
            for (int i12 = 0; i12 < t0Var.f15363n; i12++) {
                int f10 = t0Var.b(i12).f();
                D.a(new i(i10, t0Var, i12, dVar, iArr[i12], i11, C == Integer.MAX_VALUE || (f10 != -1 && f10 <= C)));
            }
            return D.h();
        }

        private int r(int i10, int i11) {
            if ((this.f11713q.f13580r & 16384) == 0 && m.I(i10, this.f11715s.f11686a0)) {
                if (this.f11714r || this.f11715s.Q) {
                    if (m.I(i10, false) && this.f11716t && this.f11714r && this.f11713q.f13583u != -1) {
                        d dVar = this.f11715s;
                        if (!dVar.K && !dVar.J && (i10 & i11) != 0) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // n3.m.h
        public int e() {
            return this.B;
        }

        @Override // n3.m.h
        /* renamed from: s */
        public boolean g(i iVar) {
            return (this.A || m0.c(this.f11713q.f13587y, iVar.f11713q.f13587y)) && (this.f11715s.T || (this.C == iVar.C && this.D == iVar.D));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    public m(Context context, a0 a0Var, t.b bVar) {
        this(a0Var, bVar, context);
    }

    public m(Context context, t.b bVar) {
        this(context, d.j(context), bVar);
    }

    private m(a0 a0Var, t.b bVar, Context context) {
        d A;
        this.f11665d = new Object();
        this.f11666e = context != null ? context.getApplicationContext() : null;
        this.f11667f = bVar;
        if (a0Var instanceof d) {
            A = (d) a0Var;
        } else {
            A = (context == null ? d.f11683f0 : d.j(context)).i().b0(a0Var).A();
        }
        this.f11669h = A;
        this.f11671j = u1.e.f14907t;
        boolean z10 = context != null && m0.v0(context);
        this.f11668g = z10;
        if (!z10 && context != null && m0.f12306a >= 32) {
            this.f11670i = f.g(context);
        }
        if (this.f11669h.Z && context == null) {
            p3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void A(v0 v0Var, a0 a0Var, Map<Integer, y> map) {
        y yVar;
        for (int i10 = 0; i10 < v0Var.f15375n; i10++) {
            y yVar2 = a0Var.L.get(v0Var.b(i10));
            if (yVar2 != null && ((yVar = map.get(Integer.valueOf(yVar2.b()))) == null || (yVar.f11744o.isEmpty() && !yVar2.f11744o.isEmpty()))) {
                map.put(Integer.valueOf(yVar2.b()), yVar2);
            }
        }
    }

    protected static int B(m1 m1Var, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(m1Var.f13578p)) {
            String Q = Q(str);
            String Q2 = Q(m1Var.f13578p);
            if (Q2 == null || Q == null) {
                return (z10 && Q2 == null) ? 1 : 0;
            } else if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
                return 3;
            } else {
                return m0.Q0(Q2, "-")[0].equals(m0.Q0(Q, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(t0 t0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < t0Var.f15363n; i14++) {
                m1 b10 = t0Var.b(i14);
                int i15 = b10.D;
                if (i15 > 0 && (i12 = b10.E) > 0) {
                    Point D = D(z10, i10, i11, i15, i12);
                    int i16 = b10.D;
                    int i17 = b10.E;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (D.x * 0.98f)) && i17 >= ((int) (D.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p3.m0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p3.m0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(m1 m1Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f11665d) {
            z10 = !this.f11669h.Z || this.f11668g || m1Var.L <= 2 || (H(m1Var) && (m0.f12306a < 32 || (fVar2 = this.f11670i) == null || !fVar2.e())) || (m0.f12306a >= 32 && (fVar = this.f11670i) != null && fVar.e() && this.f11670i.c() && this.f11670i.d() && this.f11670i.a(this.f11671j, m1Var));
        }
        return z10;
    }

    private static boolean H(m1 m1Var) {
        String str = m1Var.f13587y;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean I(int i10, boolean z10) {
        int f10 = z2.f(i10);
        return f10 == 4 || (z10 && f10 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z10, int i10, t0 t0Var, int[] iArr) {
        return b.l(i10, t0Var, dVar, iArr, z10, new a5.k() { // from class: n3.d
            @Override // a5.k
            public final boolean apply(Object obj) {
                boolean G;
                G = m.this.G((m1) obj);
                return G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List L(d dVar, int[] iArr, int i10, t0 t0Var, int[] iArr2) {
        return i.q(i10, t0Var, dVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(v.a aVar, int[][][] iArr, b3[] b3VarArr, t[] tVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            t tVar = tVarArr[i12];
            if ((e10 == 1 || e10 == 2) && tVar != null && R(iArr[i12], aVar.f(i12), tVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            b3 b3Var = new b3(true);
            b3VarArr[i11] = b3Var;
            b3VarArr[i10] = b3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        boolean z10;
        f fVar;
        synchronized (this.f11665d) {
            z10 = this.f11669h.Z && !this.f11668g && m0.f12306a >= 32 && (fVar = this.f11670i) != null && fVar.e();
        }
        if (z10) {
            c();
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, v0 v0Var, t tVar) {
        if (tVar == null) {
            return false;
        }
        int c10 = v0Var.c(tVar.c());
        for (int i10 = 0; i10 < tVar.length(); i10++) {
            if (z2.h(iArr[c10][tVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<t.a, Integer> W(int i10, v.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        v.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                v0 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f15375n; i13++) {
                    t0 b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f15363n];
                    int i14 = 0;
                    while (i14 < b10.f15363n) {
                        T t10 = a10.get(i14);
                        int e10 = t10.e();
                        if (zArr[i14] || e10 == 0) {
                            i11 = d10;
                        } else {
                            if (e10 == 1) {
                                randomAccess = b5.q.K(t10);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < b10.f15363n) {
                                    T t11 = a10.get(i15);
                                    int i16 = d10;
                                    if (t11.e() == 2 && t10.g(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                i11 = d10;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f11712p;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new t.a(hVar.f11711o, iArr2), Integer.valueOf(hVar.f11710n));
    }

    private static void y(v.a aVar, d dVar, t.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            v0 f10 = aVar.f(i10);
            if (dVar.m(i10, f10)) {
                e l10 = dVar.l(i10, f10);
                aVarArr[i10] = (l10 == null || l10.f11693o.length == 0) ? null : new t.a(f10.b(l10.f11692n), l10.f11693o, l10.f11695q);
            }
        }
    }

    private static void z(v.a aVar, a0 a0Var, t.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), a0Var, hashMap);
        }
        A(aVar.h(), a0Var, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            y yVar = (y) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (yVar != null) {
                aVarArr[i11] = (yVar.f11744o.isEmpty() || aVar.f(i11).c(yVar.f11743n) == -1) ? null : new t.a(yVar.f11743n, d5.d.k(yVar.f11744o));
            }
        }
    }

    protected t.a[] S(v.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d10 = aVar.d();
        t.a[] aVarArr = new t.a[d10];
        Pair<t.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (t.a) X.first;
        }
        Pair<t.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (t.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((t.a) obj).f11728a.b(((t.a) obj).f11729b[0]).f13578p;
        }
        Pair<t.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (t.a) V.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (e10 != 2 && e10 != 1 && e10 != 3) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<t.a, Integer> T(v.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f15375n > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h.a() { // from class: n3.l
            @Override // n3.m.h.a
            public final List a(int i11, t0 t0Var, int[] iArr3) {
                List J;
                J = m.this.J(dVar, z10, i11, t0Var, iArr3);
                return J;
            }
        }, n3.g.f11653n);
    }

    protected t.a U(int i10, v0 v0Var, int[][] iArr, d dVar) {
        t0 t0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < v0Var.f15375n; i12++) {
            t0 b10 = v0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f15363n; i13++) {
                if (I(iArr2[i13], dVar.f11686a0)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        t0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (t0Var == null) {
            return null;
        }
        return new t.a(t0Var, i11);
    }

    protected Pair<t.a, Integer> V(v.a aVar, int[][][] iArr, final d dVar, final String str) {
        return W(3, aVar, iArr, new h.a() { // from class: n3.j
            @Override // n3.m.h.a
            public final List a(int i10, t0 t0Var, int[] iArr2) {
                List l10;
                l10 = m.g.l(i10, t0Var, m.d.this, iArr2, str);
                return l10;
            }
        }, n3.h.f11654n);
    }

    protected Pair<t.a, Integer> X(v.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return W(2, aVar, iArr, new h.a() { // from class: n3.k
            @Override // n3.m.h.a
            public final List a(int i10, t0 t0Var, int[] iArr3) {
                List L;
                L = m.L(m.d.this, iArr2, i10, t0Var, iArr3);
                return L;
            }
        }, n3.i.f11655n);
    }

    @Override // n3.c0
    public boolean d() {
        return true;
    }

    @Override // n3.c0
    public void f() {
        f fVar;
        synchronized (this.f11665d) {
            if (m0.f12306a >= 32 && (fVar = this.f11670i) != null) {
                fVar.f();
            }
        }
        super.f();
    }

    @Override // n3.c0
    public void h(u1.e eVar) {
        boolean z10;
        synchronized (this.f11665d) {
            z10 = !this.f11671j.equals(eVar);
            this.f11671j = eVar;
        }
        if (z10) {
            P();
        }
    }

    @Override // n3.v
    protected final Pair<b3[], t[]> l(v.a aVar, int[][][] iArr, int[] iArr2, u.b bVar, l3 l3Var) {
        d dVar;
        f fVar;
        synchronized (this.f11665d) {
            dVar = this.f11669h;
            if (dVar.Z && m0.f12306a >= 32 && (fVar = this.f11670i) != null) {
                fVar.b(this, (Looper) p3.a.h(Looper.myLooper()));
            }
        }
        int d10 = aVar.d();
        t.a[] S = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S);
        y(aVar, dVar, S);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (dVar.k(i10) || dVar.M.contains(Integer.valueOf(e10))) {
                S[i10] = null;
            }
        }
        t[] a10 = this.f11667f.a(S, a(), bVar, l3Var);
        b3[] b3VarArr = new b3[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            boolean z10 = true;
            if ((dVar.k(i11) || dVar.M.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                z10 = false;
            }
            b3VarArr[i11] = z10 ? b3.f13316b : null;
        }
        if (dVar.f11687b0) {
            O(aVar, iArr, b3VarArr, a10);
        }
        return Pair.create(b3VarArr, a10);
    }
}
