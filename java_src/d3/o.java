package d3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p3.m0;
import p3.r;
import p3.v;
import s1.m1;
import s1.n1;
import s1.z2;
/* loaded from: classes.dex */
public final class o extends s1.f implements Handler.Callback {
    private final Handler A;
    private final n B;
    private final k C;
    private final n1 D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private m1 I;
    private i J;
    private l K;
    private m L;
    private m M;
    private int N;
    private long O;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f6550a);
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        this.B = (n) p3.a.e(nVar);
        this.A = looper == null ? null : m0.v(looper, this);
        this.C = kVar;
        this.D = new n1();
        this.O = -9223372036854775807L;
    }

    private void T() {
        c0(Collections.emptyList());
    }

    private long U() {
        if (this.N == -1) {
            return Long.MAX_VALUE;
        }
        p3.a.e(this.L);
        if (this.N >= this.L.j()) {
            return Long.MAX_VALUE;
        }
        return this.L.g(this.N);
    }

    private void V(j jVar) {
        r.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, jVar);
        T();
        a0();
    }

    private void W() {
        this.G = true;
        this.J = this.C.b((m1) p3.a.e(this.I));
    }

    private void X(List<b> list) {
        this.B.j(list);
        this.B.d(new e(list));
    }

    private void Y() {
        this.K = null;
        this.N = -1;
        m mVar = this.L;
        if (mVar != null) {
            mVar.x();
            this.L = null;
        }
        m mVar2 = this.M;
        if (mVar2 != null) {
            mVar2.x();
            this.M = null;
        }
    }

    private void Z() {
        Y();
        ((i) p3.a.e(this.J)).a();
        this.J = null;
        this.H = 0;
    }

    private void a0() {
        Z();
        W();
    }

    private void c0(List<b> list) {
        Handler handler = this.A;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            X(list);
        }
    }

    @Override // s1.f
    protected void J() {
        this.I = null;
        this.O = -9223372036854775807L;
        T();
        Z();
    }

    @Override // s1.f
    protected void L(long j10, boolean z10) {
        T();
        this.E = false;
        this.F = false;
        this.O = -9223372036854775807L;
        if (this.H != 0) {
            a0();
            return;
        }
        Y();
        ((i) p3.a.e(this.J)).flush();
    }

    @Override // s1.f
    protected void P(m1[] m1VarArr, long j10, long j11) {
        this.I = m1VarArr[0];
        if (this.J != null) {
            this.H = 1;
        } else {
            W();
        }
    }

    @Override // s1.a3
    public int a(m1 m1Var) {
        if (this.C.a(m1Var)) {
            return z2.a(m1Var.R == 0 ? 4 : 2);
        }
        return z2.a(v.r(m1Var.f13587y) ? 1 : 0);
    }

    @Override // s1.y2
    public boolean b() {
        return this.F;
    }

    public void b0(long j10) {
        p3.a.f(v());
        this.O = j10;
    }

    @Override // s1.y2, s1.a3
    public String e() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            X((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // s1.y2
    public boolean i() {
        return true;
    }

    @Override // s1.y2
    public void o(long j10, long j11) {
        boolean z10;
        if (v()) {
            long j12 = this.O;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                Y();
                this.F = true;
            }
        }
        if (this.F) {
            return;
        }
        if (this.M == null) {
            ((i) p3.a.e(this.J)).b(j10);
            try {
                this.M = ((i) p3.a.e(this.J)).d();
            } catch (j e10) {
                V(e10);
                return;
            }
        }
        if (f() != 2) {
            return;
        }
        if (this.L != null) {
            long U = U();
            z10 = false;
            while (U <= j10) {
                this.N++;
                U = U();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        m mVar = this.M;
        if (mVar != null) {
            if (mVar.t()) {
                if (!z10 && U() == Long.MAX_VALUE) {
                    if (this.H == 2) {
                        a0();
                    } else {
                        Y();
                        this.F = true;
                    }
                }
            } else if (mVar.f15544o <= j10) {
                m mVar2 = this.L;
                if (mVar2 != null) {
                    mVar2.x();
                }
                this.N = mVar.e(j10);
                this.L = mVar;
                this.M = null;
                z10 = true;
            }
        }
        if (z10) {
            p3.a.e(this.L);
            c0(this.L.h(j10));
        }
        if (this.H == 2) {
            return;
        }
        while (!this.E) {
            try {
                l lVar = this.K;
                if (lVar == null) {
                    lVar = ((i) p3.a.e(this.J)).e();
                    if (lVar == null) {
                        return;
                    }
                    this.K = lVar;
                }
                if (this.H == 1) {
                    lVar.w(4);
                    ((i) p3.a.e(this.J)).c(lVar);
                    this.K = null;
                    this.H = 2;
                    return;
                }
                int Q = Q(this.D, lVar, 0);
                if (Q == -4) {
                    if (lVar.t()) {
                        this.E = true;
                        this.G = false;
                    } else {
                        m1 m1Var = this.D.f13638b;
                        if (m1Var == null) {
                            return;
                        }
                        lVar.f6551v = m1Var.C;
                        lVar.z();
                        this.G &= !lVar.v();
                    }
                    if (!this.G) {
                        ((i) p3.a.e(this.J)).c(lVar);
                        this.K = null;
                    }
                } else if (Q == -3) {
                    return;
                }
            } catch (j e11) {
                V(e11);
                return;
            }
        }
    }
}
