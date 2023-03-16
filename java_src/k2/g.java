package k2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import p3.m0;
import s1.m1;
import s1.n1;
import s1.z2;
/* loaded from: classes.dex */
public final class g extends s1.f implements Handler.Callback {
    private final d A;
    private final f B;
    private final Handler C;
    private final e D;
    private c E;
    private boolean F;
    private boolean G;
    private long H;
    private long I;
    private a J;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f10531a);
    }

    public g(f fVar, Looper looper, d dVar) {
        super(5);
        this.B = (f) p3.a.e(fVar);
        this.C = looper == null ? null : m0.v(looper, this);
        this.A = (d) p3.a.e(dVar);
        this.D = new e();
        this.I = -9223372036854775807L;
    }

    private void T(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            m1 g10 = aVar.c(i10).g();
            if (g10 == null || !this.A.a(g10)) {
                list.add(aVar.c(i10));
            } else {
                c b10 = this.A.b(g10);
                byte[] bArr = (byte[]) p3.a.e(aVar.c(i10).l());
                this.D.m();
                this.D.y(bArr.length);
                ((ByteBuffer) m0.j(this.D.f15536p)).put(bArr);
                this.D.z();
                a a10 = b10.a(this.D);
                if (a10 != null) {
                    T(a10, list);
                }
            }
        }
    }

    private void U(a aVar) {
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            V(aVar);
        }
    }

    private void V(a aVar) {
        this.B.x(aVar);
    }

    private boolean W(long j10) {
        boolean z10;
        a aVar = this.J;
        if (aVar == null || this.I > j10) {
            z10 = false;
        } else {
            U(aVar);
            this.J = null;
            this.I = -9223372036854775807L;
            z10 = true;
        }
        if (this.F && this.J == null) {
            this.G = true;
        }
        return z10;
    }

    private void X() {
        if (this.F || this.J != null) {
            return;
        }
        this.D.m();
        n1 E = E();
        int Q = Q(E, this.D, 0);
        if (Q != -4) {
            if (Q == -5) {
                this.H = ((m1) p3.a.e(E.f13638b)).C;
            }
        } else if (this.D.t()) {
            this.F = true;
        } else {
            e eVar = this.D;
            eVar.f10532v = this.H;
            eVar.z();
            a a10 = ((c) m0.j(this.E)).a(this.D);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.d());
                T(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.J = new a(arrayList);
                this.I = this.D.f15538r;
            }
        }
    }

    @Override // s1.f
    protected void J() {
        this.J = null;
        this.I = -9223372036854775807L;
        this.E = null;
    }

    @Override // s1.f
    protected void L(long j10, boolean z10) {
        this.J = null;
        this.I = -9223372036854775807L;
        this.F = false;
        this.G = false;
    }

    @Override // s1.f
    protected void P(m1[] m1VarArr, long j10, long j11) {
        this.E = this.A.b(m1VarArr[0]);
    }

    @Override // s1.a3
    public int a(m1 m1Var) {
        if (this.A.a(m1Var)) {
            return z2.a(m1Var.R == 0 ? 4 : 2);
        }
        return z2.a(0);
    }

    @Override // s1.y2
    public boolean b() {
        return this.G;
    }

    @Override // s1.y2, s1.a3
    public String e() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            V((a) message.obj);
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
        boolean z10 = true;
        while (z10) {
            X();
            z10 = W(j10);
        }
    }
}
