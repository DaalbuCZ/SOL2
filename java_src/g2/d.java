package g2;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p3.a0;
import s1.h2;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
/* loaded from: classes.dex */
public class d implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final r f7478d = c.f7477b;

    /* renamed from: a  reason: collision with root package name */
    private n f7479a;

    /* renamed from: b  reason: collision with root package name */
    private i f7480b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7481c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] e() {
        return new l[]{new d()};
    }

    private static a0 f(a0 a0Var) {
        a0Var.O(0);
        return a0Var;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean g(m mVar) {
        i hVar;
        f fVar = new f();
        if (fVar.a(mVar, true) && (fVar.f7488b & 2) == 2) {
            int min = Math.min(fVar.f7495i, 8);
            a0 a0Var = new a0(min);
            mVar.o(a0Var.d(), 0, min);
            if (b.p(f(a0Var))) {
                hVar = new b();
            } else if (j.r(f(a0Var))) {
                hVar = new j();
            } else if (h.p(f(a0Var))) {
                hVar = new h();
            }
            this.f7480b = hVar;
            return true;
        }
        return false;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        i iVar = this.f7480b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f7479a = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        p3.a.h(this.f7479a);
        if (this.f7480b == null) {
            if (!g(mVar)) {
                throw h2.a("Failed to determine bitstream type", null);
            }
            mVar.g();
        }
        if (!this.f7481c) {
            e0 e10 = this.f7479a.e(0, 1);
            this.f7479a.i();
            this.f7480b.d(this.f7479a, e10);
            this.f7481c = true;
        }
        return this.f7480b.g(mVar, a0Var);
    }

    @Override // x1.l
    public boolean j(m mVar) {
        try {
            return g(mVar);
        } catch (h2 unused) {
            return false;
        }
    }
}
