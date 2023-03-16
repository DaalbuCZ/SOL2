package c2;

import f2.k;
import k2.a;
import p3.a0;
import s1.m1;
import x1.b0;
import x1.l;
import x1.m;
import x1.n;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private n f3127b;

    /* renamed from: c  reason: collision with root package name */
    private int f3128c;

    /* renamed from: d  reason: collision with root package name */
    private int f3129d;

    /* renamed from: e  reason: collision with root package name */
    private int f3130e;

    /* renamed from: g  reason: collision with root package name */
    private q2.b f3132g;

    /* renamed from: h  reason: collision with root package name */
    private m f3133h;

    /* renamed from: i  reason: collision with root package name */
    private c f3134i;

    /* renamed from: j  reason: collision with root package name */
    private k f3135j;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f3126a = new a0(6);

    /* renamed from: f  reason: collision with root package name */
    private long f3131f = -1;

    private void d(m mVar) {
        this.f3126a.K(2);
        mVar.o(this.f3126a.d(), 0, 2);
        mVar.p(this.f3126a.I() - 2);
    }

    private void e() {
        g(new a.b[0]);
        ((n) p3.a.e(this.f3127b)).i();
        this.f3127b.t(new b0.b(-9223372036854775807L));
        this.f3128c = 6;
    }

    private static q2.b f(String str, long j10) {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void g(a.b... bVarArr) {
        ((n) p3.a.e(this.f3127b)).e(1024, 4).e(new m1.b().K("image/jpeg").X(new k2.a(bVarArr)).E());
    }

    private int h(m mVar) {
        this.f3126a.K(2);
        mVar.o(this.f3126a.d(), 0, 2);
        return this.f3126a.I();
    }

    private void k(m mVar) {
        int i10;
        this.f3126a.K(2);
        mVar.readFully(this.f3126a.d(), 0, 2);
        int I = this.f3126a.I();
        this.f3129d = I;
        if (I == 65498) {
            if (this.f3131f == -1) {
                e();
                return;
            }
            i10 = 4;
        } else if ((I >= 65488 && I <= 65497) || I == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f3128c = i10;
    }

    private void l(m mVar) {
        String w10;
        if (this.f3129d == 65505) {
            a0 a0Var = new a0(this.f3130e);
            mVar.readFully(a0Var.d(), 0, this.f3130e);
            if (this.f3132g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.w()) && (w10 = a0Var.w()) != null) {
                q2.b f10 = f(w10, mVar.a());
                this.f3132g = f10;
                if (f10 != null) {
                    this.f3131f = f10.f12547q;
                }
            }
        } else {
            mVar.h(this.f3130e);
        }
        this.f3128c = 0;
    }

    private void m(m mVar) {
        this.f3126a.K(2);
        mVar.readFully(this.f3126a.d(), 0, 2);
        this.f3130e = this.f3126a.I() - 2;
        this.f3128c = 2;
    }

    private void n(m mVar) {
        if (mVar.l(this.f3126a.d(), 0, 1, true)) {
            mVar.g();
            if (this.f3135j == null) {
                this.f3135j = new k();
            }
            c cVar = new c(mVar, this.f3131f);
            this.f3134i = cVar;
            if (this.f3135j.j(cVar)) {
                this.f3135j.c(new d(this.f3131f, (n) p3.a.e(this.f3127b)));
                o();
                return;
            }
        }
        e();
    }

    private void o() {
        g((a.b) p3.a.e(this.f3132g));
        this.f3128c = 5;
    }

    @Override // x1.l
    public void a() {
        k kVar = this.f3135j;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f3128c = 0;
            this.f3135j = null;
        } else if (this.f3128c == 5) {
            ((k) p3.a.e(this.f3135j)).b(j10, j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f3127b = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        int i10 = this.f3128c;
        if (i10 == 0) {
            k(mVar);
            return 0;
        } else if (i10 == 1) {
            m(mVar);
            return 0;
        } else if (i10 == 2) {
            l(mVar);
            return 0;
        } else if (i10 == 4) {
            long q10 = mVar.q();
            long j10 = this.f3131f;
            if (q10 != j10) {
                a0Var.f16188a = j10;
                return 1;
            }
            n(mVar);
            return 0;
        } else if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        } else {
            if (this.f3134i == null || mVar != this.f3133h) {
                this.f3133h = mVar;
                this.f3134i = new c(mVar, this.f3131f);
            }
            int i11 = ((k) p3.a.e(this.f3135j)).i(this.f3134i, a0Var);
            if (i11 == 1) {
                a0Var.f16188a += this.f3131f;
            }
            return i11;
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        if (h(mVar) != 65496) {
            return false;
        }
        int h10 = h(mVar);
        this.f3129d = h10;
        if (h10 == 65504) {
            d(mVar);
            this.f3129d = h(mVar);
        }
        if (this.f3129d != 65505) {
            return false;
        }
        mVar.p(2);
        this.f3126a.K(6);
        mVar.o(this.f3126a.d(), 0, 6);
        return this.f3126a.E() == 1165519206 && this.f3126a.I() == 0;
    }
}
