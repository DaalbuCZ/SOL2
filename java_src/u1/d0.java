package u1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import j2.l;
import java.nio.ByteBuffer;
import java.util.List;
import p3.m0;
import s1.m1;
import s1.n1;
import s1.o2;
import s1.y2;
import s1.z2;
import u1.s;
import u1.t;
/* loaded from: classes.dex */
public class d0 extends j2.o implements p3.t {
    private final Context T0;
    private final s.a U0;
    private final t V0;
    private int W0;
    private boolean X0;
    private m1 Y0;
    private long Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f14901a1;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f14902b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f14903c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f14904d1;

    /* renamed from: e1  reason: collision with root package name */
    private y2.a f14905e1;

    /* loaded from: classes.dex */
    private final class b implements t.c {
        private b() {
        }

        @Override // u1.t.c
        public void a(long j10) {
            d0.this.U0.B(j10);
        }

        @Override // u1.t.c
        public void b(boolean z10) {
            d0.this.U0.C(z10);
        }

        @Override // u1.t.c
        public void c(Exception exc) {
            p3.r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            d0.this.U0.l(exc);
        }

        @Override // u1.t.c
        public void d() {
            d0.this.z1();
        }

        @Override // u1.t.c
        public void e() {
            if (d0.this.f14905e1 != null) {
                d0.this.f14905e1.a();
            }
        }

        @Override // u1.t.c
        public void f() {
            if (d0.this.f14905e1 != null) {
                d0.this.f14905e1.b();
            }
        }

        @Override // u1.t.c
        public void g(int i10, long j10, long j11) {
            d0.this.U0.D(i10, j10, j11);
        }
    }

    public d0(Context context, l.b bVar, j2.q qVar, boolean z10, Handler handler, s sVar, t tVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.T0 = context.getApplicationContext();
        this.V0 = tVar;
        this.U0 = new s.a(handler, sVar);
        tVar.g(new b());
    }

    private void A1() {
        long q10 = this.V0.q(b());
        if (q10 != Long.MIN_VALUE) {
            if (!this.f14902b1) {
                q10 = Math.max(this.Z0, q10);
            }
            this.Z0 = q10;
            this.f14902b1 = false;
        }
    }

    private static boolean t1(String str) {
        if (m0.f12306a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(m0.f12308c)) {
            String str2 = m0.f12307b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean u1() {
        if (m0.f12306a == 23) {
            String str = m0.f12309d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int v1(j2.n nVar, m1 m1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f10318a) || (i10 = m0.f12306a) >= 24 || (i10 == 23 && m0.v0(this.T0))) {
            return m1Var.f13588z;
        }
        return -1;
    }

    private static List<j2.n> x1(j2.q qVar, m1 m1Var, boolean z10, t tVar) {
        j2.n v10;
        String str = m1Var.f13587y;
        if (str == null) {
            return b5.q.J();
        }
        if (!tVar.a(m1Var) || (v10 = j2.v.v()) == null) {
            List<j2.n> a10 = qVar.a(str, z10, false);
            String m10 = j2.v.m(m1Var);
            return m10 == null ? b5.q.F(a10) : b5.q.D().g(a10).g(qVar.a(m10, z10, false)).h();
        }
        return b5.q.K(v10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void J() {
        this.f14903c1 = true;
        try {
            this.V0.flush();
            try {
                super.J();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.J();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void K(boolean z10, boolean z11) {
        super.K(z10, z11);
        this.U0.p(this.O0);
        if (D().f13317a) {
            this.V0.h();
        } else {
            this.V0.s();
        }
        this.V0.n(G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void L(long j10, boolean z10) {
        super.L(j10, z10);
        if (this.f14904d1) {
            this.V0.u();
        } else {
            this.V0.flush();
        }
        this.Z0 = j10;
        this.f14901a1 = true;
        this.f14902b1 = true;
    }

    @Override // j2.o
    protected void L0(Exception exc) {
        p3.r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.U0.k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void M() {
        try {
            super.M();
        } finally {
            if (this.f14903c1) {
                this.f14903c1 = false;
                this.V0.c();
            }
        }
    }

    @Override // j2.o
    protected void M0(String str, l.a aVar, long j10, long j11) {
        this.U0.m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void N() {
        super.N();
        this.V0.o();
    }

    @Override // j2.o
    protected void N0(String str) {
        this.U0.n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void O() {
        A1();
        this.V0.e();
        super.O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public v1.i O0(n1 n1Var) {
        v1.i O0 = super.O0(n1Var);
        this.U0.q(n1Var.f13638b, O0);
        return O0;
    }

    @Override // j2.o
    protected void P0(m1 m1Var, MediaFormat mediaFormat) {
        int i10;
        m1 m1Var2 = this.Y0;
        int[] iArr = null;
        if (m1Var2 != null) {
            m1Var = m1Var2;
        } else if (r0() != null) {
            m1 E = new m1.b().e0("audio/raw").Y("audio/raw".equals(m1Var.f13587y) ? m1Var.N : (m0.f12306a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? m0.b0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).N(m1Var.O).O(m1Var.P).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.X0 && E.L == 6 && (i10 = m1Var.L) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < m1Var.L; i11++) {
                    iArr[i11] = i11;
                }
            }
            m1Var = E;
        }
        try {
            this.V0.m(m1Var, 0, iArr);
        } catch (t.a e10) {
            throw B(e10, e10.f15030n, 5001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void R0() {
        super.R0();
        this.V0.w();
    }

    @Override // j2.o
    protected void S0(v1.g gVar) {
        if (!this.f14901a1 || gVar.s()) {
            return;
        }
        if (Math.abs(gVar.f15538r - this.Z0) > 500000) {
            this.Z0 = gVar.f15538r;
        }
        this.f14901a1 = false;
    }

    @Override // j2.o
    protected boolean U0(long j10, long j11, j2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var) {
        p3.a.e(byteBuffer);
        if (this.Y0 != null && (i11 & 2) != 0) {
            ((j2.l) p3.a.e(lVar)).d(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.d(i10, false);
            }
            this.O0.f15528f += i12;
            this.V0.w();
            return true;
        } else {
            try {
                if (this.V0.p(byteBuffer, j12, i12)) {
                    if (lVar != null) {
                        lVar.d(i10, false);
                    }
                    this.O0.f15527e += i12;
                    return true;
                }
                return false;
            } catch (t.b e10) {
                throw C(e10, e10.f15033p, e10.f15032o, 5001);
            } catch (t.e e11) {
                throw C(e11, m1Var, e11.f15037o, 5002);
            }
        }
    }

    @Override // j2.o
    protected v1.i V(j2.n nVar, m1 m1Var, m1 m1Var2) {
        v1.i e10 = nVar.e(m1Var, m1Var2);
        int i10 = e10.f15550e;
        if (v1(nVar, m1Var2) > this.W0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new v1.i(nVar.f10318a, m1Var, m1Var2, i11 != 0 ? 0 : e10.f15549d, i11);
    }

    @Override // j2.o
    protected void Z0() {
        try {
            this.V0.i();
        } catch (t.e e10) {
            throw C(e10, e10.f15038p, e10.f15037o, 5002);
        }
    }

    @Override // j2.o, s1.y2
    public boolean b() {
        return super.b() && this.V0.b();
    }

    @Override // p3.t
    public void d(o2 o2Var) {
        this.V0.d(o2Var);
    }

    @Override // s1.y2, s1.a3
    public String e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // j2.o, s1.y2
    public boolean i() {
        return this.V0.k() || super.i();
    }

    @Override // p3.t
    public o2 j() {
        return this.V0.j();
    }

    @Override // j2.o
    protected boolean l1(m1 m1Var) {
        return this.V0.a(m1Var);
    }

    @Override // j2.o
    protected int m1(j2.q qVar, m1 m1Var) {
        boolean z10;
        if (p3.v.o(m1Var.f13587y)) {
            int i10 = m0.f12306a >= 21 ? 32 : 0;
            boolean z11 = true;
            boolean z12 = m1Var.R != 0;
            boolean n12 = j2.o.n1(m1Var);
            int i11 = 8;
            if (n12 && this.V0.a(m1Var) && (!z12 || j2.v.v() != null)) {
                return z2.b(4, 8, i10);
            }
            if ((!"audio/raw".equals(m1Var.f13587y) || this.V0.a(m1Var)) && this.V0.a(m0.c0(2, m1Var.L, m1Var.M))) {
                List<j2.n> x12 = x1(qVar, m1Var, false, this.V0);
                if (x12.isEmpty()) {
                    return z2.a(1);
                }
                if (n12) {
                    j2.n nVar = x12.get(0);
                    boolean m10 = nVar.m(m1Var);
                    if (!m10) {
                        for (int i12 = 1; i12 < x12.size(); i12++) {
                            j2.n nVar2 = x12.get(i12);
                            if (nVar2.m(m1Var)) {
                                z10 = false;
                                nVar = nVar2;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    z11 = m10;
                    int i13 = z11 ? 4 : 3;
                    if (z11 && nVar.p(m1Var)) {
                        i11 = 16;
                    }
                    return z2.c(i13, i11, i10, nVar.f10325h ? 64 : 0, z10 ? 128 : 0);
                }
                return z2.a(2);
            }
            return z2.a(1);
        }
        return z2.a(0);
    }

    @Override // s1.f, s1.t2.b
    public void p(int i10, Object obj) {
        if (i10 == 2) {
            this.V0.f(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.V0.t((e) obj);
        } else if (i10 == 6) {
            this.V0.r((w) obj);
        } else {
            switch (i10) {
                case 9:
                    this.V0.v(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.V0.l(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f14905e1 = (y2.a) obj;
                    return;
                default:
                    super.p(i10, obj);
                    return;
            }
        }
    }

    @Override // j2.o
    protected float u0(float f10, m1 m1Var, m1[] m1VarArr) {
        int i10 = -1;
        for (m1 m1Var2 : m1VarArr) {
            int i11 = m1Var2.M;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // j2.o
    protected List<j2.n> w0(j2.q qVar, m1 m1Var, boolean z10) {
        return j2.v.u(x1(qVar, m1Var, z10, this.V0), m1Var);
    }

    protected int w1(j2.n nVar, m1 m1Var, m1[] m1VarArr) {
        int v12 = v1(nVar, m1Var);
        if (m1VarArr.length == 1) {
            return v12;
        }
        for (m1 m1Var2 : m1VarArr) {
            if (nVar.e(m1Var, m1Var2).f15549d != 0) {
                v12 = Math.max(v12, v1(nVar, m1Var2));
            }
        }
        return v12;
    }

    @Override // s1.f, s1.y2
    public p3.t x() {
        return this;
    }

    @Override // j2.o
    protected l.a y0(j2.n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10) {
        this.W0 = w1(nVar, m1Var, H());
        this.X0 = t1(nVar.f10318a);
        MediaFormat y12 = y1(m1Var, nVar.f10320c, this.W0, f10);
        this.Y0 = "audio/raw".equals(nVar.f10319b) && !"audio/raw".equals(m1Var.f13587y) ? m1Var : null;
        return l.a.a(nVar, y12, m1Var, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat y1(m1 m1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", m1Var.L);
        mediaFormat.setInteger("sample-rate", m1Var.M);
        p3.u.e(mediaFormat, m1Var.A);
        p3.u.d(mediaFormat, "max-input-size", i10);
        int i11 = m0.f12306a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !u1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(m1Var.f13587y)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.V0.x(m0.c0(4, m1Var.L, m1Var.M)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @Override // p3.t
    public long z() {
        if (f() == 2) {
            A1();
        }
        return this.Z0;
    }

    protected void z1() {
        this.f14902b1 = true;
    }
}
