package r3;

import java.nio.ByteBuffer;
import p3.a0;
import p3.m0;
import s1.m1;
import s1.z2;
import v1.g;
/* loaded from: classes.dex */
public final class b extends s1.f {
    private final g A;
    private final a0 B;
    private long C;
    private a D;
    private long E;

    public b() {
        super(6);
        this.A = new g(1);
        this.B = new a0();
    }

    private float[] T(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.B.M(byteBuffer.array(), byteBuffer.limit());
        this.B.O(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.B.p());
        }
        return fArr;
    }

    private void U() {
        a aVar = this.D;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // s1.f
    protected void J() {
        U();
    }

    @Override // s1.f
    protected void L(long j10, boolean z10) {
        this.E = Long.MIN_VALUE;
        U();
    }

    @Override // s1.f
    protected void P(m1[] m1VarArr, long j10, long j11) {
        this.C = j11;
    }

    @Override // s1.a3
    public int a(m1 m1Var) {
        return z2.a("application/x-camera-motion".equals(m1Var.f13587y) ? 4 : 0);
    }

    @Override // s1.y2
    public boolean b() {
        return m();
    }

    @Override // s1.y2, s1.a3
    public String e() {
        return "CameraMotionRenderer";
    }

    @Override // s1.y2
    public boolean i() {
        return true;
    }

    @Override // s1.y2
    public void o(long j10, long j11) {
        while (!m() && this.E < 100000 + j10) {
            this.A.m();
            if (Q(E(), this.A, 0) != -4 || this.A.t()) {
                return;
            }
            g gVar = this.A;
            this.E = gVar.f15538r;
            if (this.D != null && !gVar.s()) {
                this.A.z();
                float[] T = T((ByteBuffer) m0.j(this.A.f15536p));
                if (T != null) {
                    ((a) m0.j(this.D)).a(this.E - this.C, T);
                }
            }
        }
    }

    @Override // s1.f, s1.t2.b
    public void p(int i10, Object obj) {
        if (i10 == 8) {
            this.D = (a) obj;
        } else {
            super.p(i10, obj);
        }
    }
}
