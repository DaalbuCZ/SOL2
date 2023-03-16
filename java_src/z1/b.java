package z1;

import b5.s0;
import java.util.ArrayList;
import p3.a0;
import p3.r;
import p3.v;
import s1.h2;
import s1.m1;
import x1.b0;
import x1.e0;
import x1.j;
import x1.l;
import x1.m;
import x1.n;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: c  reason: collision with root package name */
    private int f17133c;

    /* renamed from: e  reason: collision with root package name */
    private z1.c f17135e;

    /* renamed from: h  reason: collision with root package name */
    private long f17138h;

    /* renamed from: i  reason: collision with root package name */
    private e f17139i;

    /* renamed from: m  reason: collision with root package name */
    private int f17143m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17144n;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f17131a = new a0(12);

    /* renamed from: b  reason: collision with root package name */
    private final c f17132b = new c();

    /* renamed from: d  reason: collision with root package name */
    private n f17134d = new j();

    /* renamed from: g  reason: collision with root package name */
    private e[] f17137g = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private long f17141k = -1;

    /* renamed from: l  reason: collision with root package name */
    private long f17142l = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f17140j = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f17136f = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0246b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f17145a;

        public C0246b(long j10) {
            this.f17145a = j10;
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            b0.a i10 = b.this.f17137g[0].i(j10);
            for (int i11 = 1; i11 < b.this.f17137g.length; i11++) {
                b0.a i12 = b.this.f17137g[i11].i(j10);
                if (i12.f16189a.f16195b < i10.f16189a.f16195b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        @Override // x1.b0
        public long h() {
            return this.f17145a;
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f17147a;

        /* renamed from: b  reason: collision with root package name */
        public int f17148b;

        /* renamed from: c  reason: collision with root package name */
        public int f17149c;

        private c() {
        }

        public void a(a0 a0Var) {
            this.f17147a = a0Var.p();
            this.f17148b = a0Var.p();
            this.f17149c = 0;
        }

        public void b(a0 a0Var) {
            a(a0Var);
            if (this.f17147a == 1414744396) {
                this.f17149c = a0Var.p();
                return;
            }
            throw h2.a("LIST expected, found: " + this.f17147a, null);
        }
    }

    private static void e(m mVar) {
        if ((mVar.q() & 1) == 1) {
            mVar.h(1);
        }
    }

    private e f(int i10) {
        e[] eVarArr;
        for (e eVar : this.f17137g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void g(a0 a0Var) {
        f c10 = f.c(1819436136, a0Var);
        if (c10.getType() != 1819436136) {
            throw h2.a("Unexpected header list type " + c10.getType(), null);
        }
        z1.c cVar = (z1.c) c10.b(z1.c.class);
        if (cVar == null) {
            throw h2.a("AviHeader not found", null);
        }
        this.f17135e = cVar;
        this.f17136f = cVar.f17152c * cVar.f17150a;
        ArrayList arrayList = new ArrayList();
        s0<z1.a> it = c10.f17172a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            z1.a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                e l10 = l((f) next, i10);
                if (l10 != null) {
                    arrayList.add(l10);
                }
                i10 = i11;
            }
        }
        this.f17137g = (e[]) arrayList.toArray(new e[0]);
        this.f17134d.i();
    }

    private void h(a0 a0Var) {
        long k10 = k(a0Var);
        while (a0Var.a() >= 16) {
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            long p12 = a0Var.p() + k10;
            a0Var.p();
            e f10 = f(p10);
            if (f10 != null) {
                if ((p11 & 16) == 16) {
                    f10.b(p12);
                }
                f10.k();
            }
        }
        for (e eVar : this.f17137g) {
            eVar.c();
        }
        this.f17144n = true;
        this.f17134d.t(new C0246b(this.f17136f));
    }

    private long k(a0 a0Var) {
        if (a0Var.a() < 16) {
            return 0L;
        }
        int e10 = a0Var.e();
        a0Var.P(8);
        long j10 = this.f17141k;
        long j11 = ((long) a0Var.p()) <= j10 ? 8 + j10 : 0L;
        a0Var.O(e10);
        return j11;
    }

    private e l(f fVar, int i10) {
        String str;
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            str = "Missing Stream Header";
        } else if (gVar != null) {
            long a10 = dVar.a();
            m1 m1Var = gVar.f17174a;
            m1.b b10 = m1Var.b();
            b10.R(i10);
            int i11 = dVar.f17159f;
            if (i11 != 0) {
                b10.W(i11);
            }
            h hVar = (h) fVar.b(h.class);
            if (hVar != null) {
                b10.U(hVar.f17175a);
            }
            int k10 = v.k(m1Var.f13587y);
            if (k10 == 1 || k10 == 2) {
                e0 e10 = this.f17134d.e(i10, k10);
                e10.e(b10.E());
                e eVar = new e(i10, k10, a10, dVar.f17158e, e10);
                this.f17136f = a10;
                return eVar;
            }
            return null;
        } else {
            str = "Missing Stream Format";
        }
        r.i("AviExtractor", str);
        return null;
    }

    private int m(m mVar) {
        if (mVar.q() >= this.f17142l) {
            return -1;
        }
        e eVar = this.f17139i;
        if (eVar == null) {
            e(mVar);
            mVar.o(this.f17131a.d(), 0, 12);
            this.f17131a.O(0);
            int p10 = this.f17131a.p();
            if (p10 == 1414744396) {
                this.f17131a.O(8);
                mVar.h(this.f17131a.p() != 1769369453 ? 8 : 12);
                mVar.g();
                return 0;
            }
            int p11 = this.f17131a.p();
            if (p10 == 1263424842) {
                this.f17138h = mVar.q() + p11 + 8;
                return 0;
            }
            mVar.h(8);
            mVar.g();
            e f10 = f(p10);
            if (f10 == null) {
                this.f17138h = mVar.q() + p11;
                return 0;
            }
            f10.n(p11);
            this.f17139i = f10;
        } else if (eVar.m(mVar)) {
            this.f17139i = null;
        }
        return 0;
    }

    private boolean n(m mVar, x1.a0 a0Var) {
        boolean z10;
        if (this.f17138h != -1) {
            long q10 = mVar.q();
            long j10 = this.f17138h;
            if (j10 < q10 || j10 > 262144 + q10) {
                a0Var.f16188a = j10;
                z10 = true;
                this.f17138h = -1L;
                return z10;
            }
            mVar.h((int) (j10 - q10));
        }
        z10 = false;
        this.f17138h = -1L;
        return z10;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f17138h = -1L;
        this.f17139i = null;
        for (e eVar : this.f17137g) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f17133c = 6;
        } else if (this.f17137g.length == 0) {
            this.f17133c = 0;
        } else {
            this.f17133c = 3;
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f17133c = 0;
        this.f17134d = nVar;
        this.f17138h = -1L;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        if (n(mVar, a0Var)) {
            return 1;
        }
        switch (this.f17133c) {
            case 0:
                if (j(mVar)) {
                    mVar.h(12);
                    this.f17133c = 1;
                    return 0;
                }
                throw h2.a("AVI Header List not found", null);
            case 1:
                mVar.readFully(this.f17131a.d(), 0, 12);
                this.f17131a.O(0);
                this.f17132b.b(this.f17131a);
                c cVar = this.f17132b;
                if (cVar.f17149c == 1819436136) {
                    this.f17140j = cVar.f17148b;
                    this.f17133c = 2;
                    return 0;
                }
                throw h2.a("hdrl expected, found: " + this.f17132b.f17149c, null);
            case 2:
                int i10 = this.f17140j - 4;
                a0 a0Var2 = new a0(i10);
                mVar.readFully(a0Var2.d(), 0, i10);
                g(a0Var2);
                this.f17133c = 3;
                return 0;
            case 3:
                if (this.f17141k != -1) {
                    long q10 = mVar.q();
                    long j10 = this.f17141k;
                    if (q10 != j10) {
                        this.f17138h = j10;
                        return 0;
                    }
                }
                mVar.o(this.f17131a.d(), 0, 12);
                mVar.g();
                this.f17131a.O(0);
                this.f17132b.a(this.f17131a);
                int p10 = this.f17131a.p();
                int i11 = this.f17132b.f17147a;
                if (i11 == 1179011410) {
                    mVar.h(12);
                    return 0;
                } else if (i11 != 1414744396 || p10 != 1769369453) {
                    this.f17138h = mVar.q() + this.f17132b.f17148b + 8;
                    return 0;
                } else {
                    long q11 = mVar.q();
                    this.f17141k = q11;
                    this.f17142l = q11 + this.f17132b.f17148b + 8;
                    if (!this.f17144n) {
                        if (((z1.c) p3.a.e(this.f17135e)).a()) {
                            this.f17133c = 4;
                            this.f17138h = this.f17142l;
                            return 0;
                        }
                        this.f17134d.t(new b0.b(this.f17136f));
                        this.f17144n = true;
                    }
                    this.f17138h = mVar.q() + 12;
                    this.f17133c = 6;
                    return 0;
                }
            case 4:
                mVar.readFully(this.f17131a.d(), 0, 8);
                this.f17131a.O(0);
                int p11 = this.f17131a.p();
                int p12 = this.f17131a.p();
                if (p11 == 829973609) {
                    this.f17133c = 5;
                    this.f17143m = p12;
                } else {
                    this.f17138h = mVar.q() + p12;
                }
                return 0;
            case 5:
                a0 a0Var3 = new a0(this.f17143m);
                mVar.readFully(a0Var3.d(), 0, this.f17143m);
                h(a0Var3);
                this.f17133c = 6;
                this.f17138h = this.f17141k;
                return 0;
            case 6:
                return m(mVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        mVar.o(this.f17131a.d(), 0, 12);
        this.f17131a.O(0);
        if (this.f17131a.p() != 1179011410) {
            return false;
        }
        this.f17131a.P(4);
        return this.f17131a.p() == 541677121;
    }
}
