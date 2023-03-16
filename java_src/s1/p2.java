package s1;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p3.l;
import s1.h;
/* loaded from: classes.dex */
public interface p2 {

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: o  reason: collision with root package name */
        public static final b f13660o = new a().e();

        /* renamed from: p  reason: collision with root package name */
        public static final h.a<b> f13661p = q2.f13692a;

        /* renamed from: n  reason: collision with root package name */
        private final p3.l f13662n;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f13663b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a  reason: collision with root package name */
            private final l.b f13664a = new l.b();

            public a a(int i10) {
                this.f13664a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f13664a.b(bVar.f13662n);
                return this;
            }

            public a c(int... iArr) {
                this.f13664a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f13664a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f13664a.e());
            }
        }

        private b(p3.l lVar) {
            this.f13662n = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(d(0));
            if (integerArrayList == null) {
                return f13660o;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f13662n.equals(((b) obj).f13662n);
            }
            return false;
        }

        public int hashCode() {
            return this.f13662n.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final p3.l f13665a;

        public c(p3.l lVar) {
            this.f13665a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f13665a.equals(((c) obj).f13665a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13665a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void A(int i10);

        @Deprecated
        void B(boolean z10, int i10);

        @Deprecated
        void D(boolean z10);

        @Deprecated
        void E(int i10);

        void F(l2 l2Var);

        void K(boolean z10);

        void L();

        @Deprecated
        void M();

        void N(q3 q3Var);

        void O(b bVar);

        void R(z1 z1Var);

        void S(float f10);

        void W(int i10);

        void X(boolean z10, int i10);

        void b(boolean z10);

        void b0(e eVar, e eVar2, int i10);

        void d(d3.e eVar);

        void d0(l2 l2Var);

        void g0(l3 l3Var, int i10);

        void h(int i10);

        void h0(int i10, int i11);

        void i0(u1 u1Var, int i10);

        @Deprecated
        void j(List<d3.b> list);

        void j0(p2 p2Var, c cVar);

        void l0(o oVar);

        void n0(u1.e eVar);

        void o(q3.z zVar);

        void o0(int i10, boolean z10);

        void p(o2 o2Var);

        void p0(boolean z10);

        void x(k2.a aVar);
    }

    /* loaded from: classes.dex */
    public static final class e implements h {

        /* renamed from: x  reason: collision with root package name */
        public static final h.a<e> f13666x = s2.f13736a;

        /* renamed from: n  reason: collision with root package name */
        public final Object f13667n;
        @Deprecated

        /* renamed from: o  reason: collision with root package name */
        public final int f13668o;

        /* renamed from: p  reason: collision with root package name */
        public final int f13669p;

        /* renamed from: q  reason: collision with root package name */
        public final u1 f13670q;

        /* renamed from: r  reason: collision with root package name */
        public final Object f13671r;

        /* renamed from: s  reason: collision with root package name */
        public final int f13672s;

        /* renamed from: t  reason: collision with root package name */
        public final long f13673t;

        /* renamed from: u  reason: collision with root package name */
        public final long f13674u;

        /* renamed from: v  reason: collision with root package name */
        public final int f13675v;

        /* renamed from: w  reason: collision with root package name */
        public final int f13676w;

        public e(Object obj, int i10, u1 u1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f13667n = obj;
            this.f13668o = i10;
            this.f13669p = i10;
            this.f13670q = u1Var;
            this.f13671r = obj2;
            this.f13672s = i11;
            this.f13673t = j10;
            this.f13674u = j11;
            this.f13675v = i12;
            this.f13676w = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i10 = bundle.getInt(c(0), -1);
            Bundle bundle2 = bundle.getBundle(c(1));
            return new e(null, i10, bundle2 == null ? null : u1.f13761w.a(bundle2), null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f13669p == eVar.f13669p && this.f13672s == eVar.f13672s && this.f13673t == eVar.f13673t && this.f13674u == eVar.f13674u && this.f13675v == eVar.f13675v && this.f13676w == eVar.f13676w && a5.i.a(this.f13667n, eVar.f13667n) && a5.i.a(this.f13671r, eVar.f13671r) && a5.i.a(this.f13670q, eVar.f13670q);
        }

        public int hashCode() {
            return a5.i.b(this.f13667n, Integer.valueOf(this.f13669p), this.f13670q, this.f13671r, Integer.valueOf(this.f13672s), Long.valueOf(this.f13673t), Long.valueOf(this.f13674u), Integer.valueOf(this.f13675v), Integer.valueOf(this.f13676w));
        }
    }

    int A();

    boolean B();

    int C();

    int D();

    long E();

    l3 F();

    boolean G();

    void H(long j10);

    long I();

    boolean J();

    void a();

    void b();

    void d(o2 o2Var);

    void f(float f10);

    l2 g();

    void h(boolean z10);

    void i(Surface surface);

    boolean j();

    long k();

    void l(d dVar);

    long m();

    void n(int i10, long j10);

    long o();

    boolean p();

    boolean q();

    int r();

    q3 s();

    void stop();

    boolean t();

    int u();

    int v();

    int w();

    void x(int i10);

    boolean y();
}
