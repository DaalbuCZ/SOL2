package h2;

import h2.i0;
import x1.b0;
/* loaded from: classes.dex */
public final class b implements x1.l {

    /* renamed from: d  reason: collision with root package name */
    public static final x1.r f7730d = a.f7709b;

    /* renamed from: a  reason: collision with root package name */
    private final c f7731a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f7732b = new p3.a0(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f7733c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] e() {
        return new x1.l[]{new b()};
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f7733c = false;
        this.f7731a.b();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f7731a.c(nVar, new i0.d(0, 1));
        nVar.i();
        nVar.t(new b0.b(-9223372036854775807L));
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        int b10 = mVar.b(this.f7732b.d(), 0, 2786);
        if (b10 == -1) {
            return -1;
        }
        this.f7732b.O(0);
        this.f7732b.N(b10);
        if (!this.f7733c) {
            this.f7731a.e(0L, 4);
            this.f7733c = true;
        }
        this.f7731a.a(this.f7732b);
        return 0;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        p3.a0 a0Var = new p3.a0(10);
        int i10 = 0;
        while (true) {
            mVar.o(a0Var.d(), 0, 10);
            a0Var.O(0);
            if (a0Var.F() != 4801587) {
                break;
            }
            a0Var.P(3);
            int B = a0Var.B();
            i10 += B + 10;
            mVar.p(B);
        }
        mVar.g();
        mVar.p(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            mVar.o(a0Var.d(), 0, 6);
            a0Var.O(0);
            if (a0Var.I() != 2935) {
                mVar.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                mVar.p(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int f10 = u1.b.f(a0Var.d());
                if (f10 == -1) {
                    return false;
                }
                mVar.p(f10 - 6);
            }
        }
    }
}
