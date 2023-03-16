package u2;

import android.os.Looper;
import o3.l;
import s1.l3;
import s1.u1;
import t1.t1;
import u2.c0;
import u2.h0;
import u2.i0;
import u2.u;
/* loaded from: classes.dex */
public final class i0 extends u2.a implements h0.b {
    private final int A;
    private boolean B;
    private long C;
    private boolean D;
    private boolean E;
    private o3.p0 F;

    /* renamed from: u  reason: collision with root package name */
    private final u1 f15233u;

    /* renamed from: v  reason: collision with root package name */
    private final u1.h f15234v;

    /* renamed from: w  reason: collision with root package name */
    private final l.a f15235w;

    /* renamed from: x  reason: collision with root package name */
    private final c0.a f15236x;

    /* renamed from: y  reason: collision with root package name */
    private final w1.y f15237y;

    /* renamed from: z  reason: collision with root package name */
    private final o3.g0 f15238z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends l {
        a(i0 i0Var, l3 l3Var) {
            super(l3Var);
        }

        @Override // u2.l, s1.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f13547s = true;
            return bVar;
        }

        @Override // u2.l, s1.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f13564y = true;
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f15239a;

        /* renamed from: b  reason: collision with root package name */
        private c0.a f15240b;

        /* renamed from: c  reason: collision with root package name */
        private w1.b0 f15241c;

        /* renamed from: d  reason: collision with root package name */
        private o3.g0 f15242d;

        /* renamed from: e  reason: collision with root package name */
        private int f15243e;

        /* renamed from: f  reason: collision with root package name */
        private String f15244f;

        /* renamed from: g  reason: collision with root package name */
        private Object f15245g;

        public b(l.a aVar) {
            this(aVar, new x1.i());
        }

        public b(l.a aVar, c0.a aVar2) {
            this(aVar, aVar2, new w1.l(), new o3.x(), 1048576);
        }

        public b(l.a aVar, c0.a aVar2, w1.b0 b0Var, o3.g0 g0Var, int i10) {
            this.f15239a = aVar;
            this.f15240b = aVar2;
            this.f15241c = b0Var;
            this.f15242d = g0Var;
            this.f15243e = i10;
        }

        public b(l.a aVar, final x1.r rVar) {
            this(aVar, new c0.a() { // from class: u2.j0
                @Override // u2.c0.a
                public final c0 a(t1 t1Var) {
                    c0 c10;
                    c10 = i0.b.c(x1.r.this, t1Var);
                    return c10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c0 c(x1.r rVar, t1 t1Var) {
            return new c(rVar);
        }

        public i0 b(u1 u1Var) {
            u1.c b10;
            u1.c d10;
            p3.a.e(u1Var.f13763o);
            u1.h hVar = u1Var.f13763o;
            boolean z10 = true;
            boolean z11 = hVar.f13835i == null && this.f15245g != null;
            if (hVar.f13832f != null || this.f15244f == null) {
                z10 = false;
            }
            if (!z11 || !z10) {
                if (z11) {
                    d10 = u1Var.b().d(this.f15245g);
                    u1Var = d10.a();
                    u1 u1Var2 = u1Var;
                    return new i0(u1Var2, this.f15239a, this.f15240b, this.f15241c.a(u1Var2), this.f15242d, this.f15243e, null);
                }
                if (z10) {
                    b10 = u1Var.b();
                }
                u1 u1Var22 = u1Var;
                return new i0(u1Var22, this.f15239a, this.f15240b, this.f15241c.a(u1Var22), this.f15242d, this.f15243e, null);
            }
            b10 = u1Var.b().d(this.f15245g);
            d10 = b10.b(this.f15244f);
            u1Var = d10.a();
            u1 u1Var222 = u1Var;
            return new i0(u1Var222, this.f15239a, this.f15240b, this.f15241c.a(u1Var222), this.f15242d, this.f15243e, null);
        }
    }

    private i0(u1 u1Var, l.a aVar, c0.a aVar2, w1.y yVar, o3.g0 g0Var, int i10) {
        this.f15234v = (u1.h) p3.a.e(u1Var.f13763o);
        this.f15233u = u1Var;
        this.f15235w = aVar;
        this.f15236x = aVar2;
        this.f15237y = yVar;
        this.f15238z = g0Var;
        this.A = i10;
        this.B = true;
        this.C = -9223372036854775807L;
    }

    /* synthetic */ i0(u1 u1Var, l.a aVar, c0.a aVar2, w1.y yVar, o3.g0 g0Var, int i10, a aVar3) {
        this(u1Var, aVar, aVar2, yVar, g0Var, i10);
    }

    private void F() {
        l3 q0Var = new q0(this.C, this.D, false, this.E, null, this.f15233u);
        if (this.B) {
            q0Var = new a(this, q0Var);
        }
        D(q0Var);
    }

    @Override // u2.a
    protected void C(o3.p0 p0Var) {
        this.F = p0Var;
        this.f15237y.b();
        this.f15237y.e((Looper) p3.a.e(Looper.myLooper()), A());
        F();
    }

    @Override // u2.a
    protected void E() {
        this.f15237y.a();
    }

    @Override // u2.u
    public u1 a() {
        return this.f15233u;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((h0) rVar).f0();
    }

    @Override // u2.u
    public void f() {
    }

    @Override // u2.u
    public r n(u.b bVar, o3.b bVar2, long j10) {
        o3.l a10 = this.f15235w.a();
        o3.p0 p0Var = this.F;
        if (p0Var != null) {
            a10.i(p0Var);
        }
        return new h0(this.f15234v.f13827a, a10, this.f15236x.a(A()), this.f15237y, t(bVar), this.f15238z, w(bVar), this, bVar2, this.f15234v.f13832f, this.A);
    }

    @Override // u2.h0.b
    public void r(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.C;
        }
        if (!this.B && this.C == j10 && this.D == z10 && this.E == z11) {
            return;
        }
        this.C = j10;
        this.D = z10;
        this.E = z11;
        this.B = false;
        F();
    }
}
