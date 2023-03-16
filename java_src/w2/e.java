package w2;

import android.util.SparseArray;
import java.util.List;
import p3.m0;
import p3.v;
import s1.m1;
import t1.t1;
import w2.g;
import x1.a0;
import x1.b0;
import x1.d0;
import x1.e0;
/* loaded from: classes.dex */
public final class e implements x1.n, g {

    /* renamed from: w  reason: collision with root package name */
    public static final g.a f15985w = d.f15984a;

    /* renamed from: x  reason: collision with root package name */
    private static final a0 f15986x = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final x1.l f15987n;

    /* renamed from: o  reason: collision with root package name */
    private final int f15988o;

    /* renamed from: p  reason: collision with root package name */
    private final m1 f15989p;

    /* renamed from: q  reason: collision with root package name */
    private final SparseArray<a> f15990q = new SparseArray<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f15991r;

    /* renamed from: s  reason: collision with root package name */
    private g.b f15992s;

    /* renamed from: t  reason: collision with root package name */
    private long f15993t;

    /* renamed from: u  reason: collision with root package name */
    private b0 f15994u;

    /* renamed from: v  reason: collision with root package name */
    private m1[] f15995v;

    /* loaded from: classes.dex */
    private static final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f15996a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15997b;

        /* renamed from: c  reason: collision with root package name */
        private final m1 f15998c;

        /* renamed from: d  reason: collision with root package name */
        private final x1.k f15999d = new x1.k();

        /* renamed from: e  reason: collision with root package name */
        public m1 f16000e;

        /* renamed from: f  reason: collision with root package name */
        private e0 f16001f;

        /* renamed from: g  reason: collision with root package name */
        private long f16002g;

        public a(int i10, int i11, m1 m1Var) {
            this.f15996a = i10;
            this.f15997b = i11;
            this.f15998c = m1Var;
        }

        @Override // x1.e0
        public int a(o3.i iVar, int i10, boolean z10, int i11) {
            return ((e0) m0.j(this.f16001f)).f(iVar, i10, z10);
        }

        @Override // x1.e0
        public void b(p3.a0 a0Var, int i10, int i11) {
            ((e0) m0.j(this.f16001f)).d(a0Var, i10);
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            long j11 = this.f16002g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f16001f = this.f15999d;
            }
            ((e0) m0.j(this.f16001f)).c(j10, i10, i11, i12, aVar);
        }

        @Override // x1.e0
        public /* synthetic */ void d(p3.a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(m1 m1Var) {
            m1 m1Var2 = this.f15998c;
            if (m1Var2 != null) {
                m1Var = m1Var.j(m1Var2);
            }
            this.f16000e = m1Var;
            ((e0) m0.j(this.f16001f)).e(this.f16000e);
        }

        @Override // x1.e0
        public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f16001f = this.f15999d;
                return;
            }
            this.f16002g = j10;
            e0 e10 = bVar.e(this.f15996a, this.f15997b);
            this.f16001f = e10;
            m1 m1Var = this.f16000e;
            if (m1Var != null) {
                e10.e(m1Var);
            }
        }
    }

    public e(x1.l lVar, int i10, m1 m1Var) {
        this.f15987n = lVar;
        this.f15988o = i10;
        this.f15989p = m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g h(int i10, m1 m1Var, boolean z10, List list, e0 e0Var, t1 t1Var) {
        x1.l gVar;
        String str = m1Var.f13586x;
        if (v.r(str)) {
            return null;
        }
        if (v.q(str)) {
            gVar = new d2.e(1);
        } else {
            gVar = new f2.g(z10 ? 4 : 0, null, null, list, e0Var);
        }
        return new e(gVar, i10, m1Var);
    }

    @Override // w2.g
    public void a() {
        this.f15987n.a();
    }

    @Override // w2.g
    public boolean b(x1.m mVar) {
        int i10 = this.f15987n.i(mVar, f15986x);
        p3.a.f(i10 != 1);
        return i10 == 0;
    }

    @Override // w2.g
    public void c(g.b bVar, long j10, long j11) {
        this.f15992s = bVar;
        this.f15993t = j11;
        if (!this.f15991r) {
            this.f15987n.c(this);
            if (j10 != -9223372036854775807L) {
                this.f15987n.b(0L, j10);
            }
            this.f15991r = true;
            return;
        }
        x1.l lVar = this.f15987n;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        lVar.b(0L, j10);
        for (int i10 = 0; i10 < this.f15990q.size(); i10++) {
            this.f15990q.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // w2.g
    public x1.d d() {
        b0 b0Var = this.f15994u;
        if (b0Var instanceof x1.d) {
            return (x1.d) b0Var;
        }
        return null;
    }

    @Override // x1.n
    public e0 e(int i10, int i11) {
        a aVar = this.f15990q.get(i10);
        if (aVar == null) {
            p3.a.f(this.f15995v == null);
            aVar = new a(i10, i11, i11 == this.f15988o ? this.f15989p : null);
            aVar.g(this.f15992s, this.f15993t);
            this.f15990q.put(i10, aVar);
        }
        return aVar;
    }

    @Override // w2.g
    public m1[] f() {
        return this.f15995v;
    }

    @Override // x1.n
    public void i() {
        m1[] m1VarArr = new m1[this.f15990q.size()];
        for (int i10 = 0; i10 < this.f15990q.size(); i10++) {
            m1VarArr[i10] = (m1) p3.a.h(this.f15990q.valueAt(i10).f16000e);
        }
        this.f15995v = m1VarArr;
    }

    @Override // x1.n
    public void t(b0 b0Var) {
        this.f15994u = b0Var;
    }
}
