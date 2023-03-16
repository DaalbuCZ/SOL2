package q3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import j2.l;
import j2.v;
import java.nio.ByteBuffer;
import java.util.List;
import p3.j0;
import p3.m0;
import q3.x;
import s1.m1;
import s1.n1;
import s1.z2;
/* loaded from: classes.dex */
public class h extends j2.o {
    private static final int[] C1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean D1;
    private static boolean E1;
    b A1;
    private j B1;
    private final Context T0;
    private final l U0;
    private final x.a V0;
    private final long W0;
    private final int X0;
    private final boolean Y0;
    private a Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f12595a1;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f12596b1;

    /* renamed from: c1  reason: collision with root package name */
    private Surface f12597c1;

    /* renamed from: d1  reason: collision with root package name */
    private i f12598d1;

    /* renamed from: e1  reason: collision with root package name */
    private boolean f12599e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f12600f1;

    /* renamed from: g1  reason: collision with root package name */
    private boolean f12601g1;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f12602h1;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f12603i1;

    /* renamed from: j1  reason: collision with root package name */
    private long f12604j1;

    /* renamed from: k1  reason: collision with root package name */
    private long f12605k1;

    /* renamed from: l1  reason: collision with root package name */
    private long f12606l1;

    /* renamed from: m1  reason: collision with root package name */
    private int f12607m1;

    /* renamed from: n1  reason: collision with root package name */
    private int f12608n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f12609o1;

    /* renamed from: p1  reason: collision with root package name */
    private long f12610p1;

    /* renamed from: q1  reason: collision with root package name */
    private long f12611q1;

    /* renamed from: r1  reason: collision with root package name */
    private long f12612r1;

    /* renamed from: s1  reason: collision with root package name */
    private int f12613s1;

    /* renamed from: t1  reason: collision with root package name */
    private int f12614t1;

    /* renamed from: u1  reason: collision with root package name */
    private int f12615u1;

    /* renamed from: v1  reason: collision with root package name */
    private int f12616v1;

    /* renamed from: w1  reason: collision with root package name */
    private float f12617w1;

    /* renamed from: x1  reason: collision with root package name */
    private z f12618x1;

    /* renamed from: y1  reason: collision with root package name */
    private boolean f12619y1;

    /* renamed from: z1  reason: collision with root package name */
    private int f12620z1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12621a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12622b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12623c;

        public a(int i10, int i11, int i12) {
            this.f12621a = i10;
            this.f12622b = i11;
            this.f12623c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements l.c, Handler.Callback {

        /* renamed from: n  reason: collision with root package name */
        private final Handler f12624n;

        public b(j2.l lVar) {
            Handler x10 = m0.x(this);
            this.f12624n = x10;
            lVar.j(this, x10);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.A1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.R1();
                return;
            }
            try {
                hVar.Q1(j10);
            } catch (s1.q e10) {
                h.this.g1(e10);
            }
        }

        @Override // j2.l.c
        public void a(j2.l lVar, long j10, long j11) {
            if (m0.f12306a >= 30) {
                b(j10);
                return;
            }
            this.f12624n.sendMessageAtFrontOfQueue(Message.obtain(this.f12624n, 0, (int) (j10 >> 32), (int) j10));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(m0.U0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, j2.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, xVar, i10, 30.0f);
    }

    public h(Context context, l.b bVar, j2.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.W0 = j10;
        this.X0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.T0 = applicationContext;
        this.U0 = new l(applicationContext);
        this.V0 = new x.a(handler, xVar);
        this.Y0 = x1();
        this.f12605k1 = -9223372036854775807L;
        this.f12614t1 = -1;
        this.f12615u1 = -1;
        this.f12617w1 = -1.0f;
        this.f12600f1 = 1;
        this.f12620z1 = 0;
        u1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
        if (r3.equals("video/av01") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A1(j2.n r10, s1.m1 r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.h.A1(j2.n, s1.m1):int");
    }

    private static Point B1(j2.n nVar, m1 m1Var) {
        int[] iArr;
        int i10 = m1Var.E;
        int i11 = m1Var.D;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : C1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (m0.f12306a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = nVar.b(i15, i13);
                if (nVar.u(b10.x, b10.y, m1Var.F)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = m0.l(i13, 16) * 16;
                    int l11 = m0.l(i14, 16) * 16;
                    if (l10 * l11 <= j2.v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List<j2.n> D1(j2.q qVar, m1 m1Var, boolean z10, boolean z11) {
        String str = m1Var.f13587y;
        if (str == null) {
            return b5.q.J();
        }
        List<j2.n> a10 = qVar.a(str, z10, z11);
        String m10 = j2.v.m(m1Var);
        if (m10 == null) {
            return b5.q.F(a10);
        }
        return b5.q.D().g(a10).g(qVar.a(m10, z10, z11)).h();
    }

    protected static int E1(j2.n nVar, m1 m1Var) {
        if (m1Var.f13588z != -1) {
            int size = m1Var.A.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += m1Var.A.get(i11).length;
            }
            return m1Var.f13588z + i10;
        }
        return A1(nVar, m1Var);
    }

    private static boolean G1(long j10) {
        return j10 < -30000;
    }

    private static boolean H1(long j10) {
        return j10 < -500000;
    }

    private void J1() {
        if (this.f12607m1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.V0.n(this.f12607m1, elapsedRealtime - this.f12606l1);
            this.f12607m1 = 0;
            this.f12606l1 = elapsedRealtime;
        }
    }

    private void L1() {
        int i10 = this.f12613s1;
        if (i10 != 0) {
            this.V0.B(this.f12612r1, i10);
            this.f12612r1 = 0L;
            this.f12613s1 = 0;
        }
    }

    private void M1() {
        int i10 = this.f12614t1;
        if (i10 == -1 && this.f12615u1 == -1) {
            return;
        }
        z zVar = this.f12618x1;
        if (zVar != null && zVar.f12694n == i10 && zVar.f12695o == this.f12615u1 && zVar.f12696p == this.f12616v1 && zVar.f12697q == this.f12617w1) {
            return;
        }
        z zVar2 = new z(this.f12614t1, this.f12615u1, this.f12616v1, this.f12617w1);
        this.f12618x1 = zVar2;
        this.V0.D(zVar2);
    }

    private void N1() {
        if (this.f12599e1) {
            this.V0.A(this.f12597c1);
        }
    }

    private void O1() {
        z zVar = this.f12618x1;
        if (zVar != null) {
            this.V0.D(zVar);
        }
    }

    private void P1(long j10, long j11, m1 m1Var) {
        j jVar = this.B1;
        if (jVar != null) {
            jVar.j(j10, j11, m1Var, v0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1() {
        f1();
    }

    private void S1() {
        Surface surface = this.f12597c1;
        i iVar = this.f12598d1;
        if (surface == iVar) {
            this.f12597c1 = null;
        }
        iVar.release();
        this.f12598d1 = null;
    }

    private static void V1(j2.l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.l(bundle);
    }

    private void W1() {
        this.f12605k1 = this.W0 > 0 ? SystemClock.elapsedRealtime() + this.W0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [s1.f, q3.h, j2.o] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void X1(Object obj) {
        i iVar = obj instanceof Surface ? (Surface) obj : null;
        if (iVar == null) {
            i iVar2 = this.f12598d1;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                j2.n s02 = s0();
                if (s02 != null && c2(s02)) {
                    iVar = i.c(this.T0, s02.f10324g);
                    this.f12598d1 = iVar;
                }
            }
        }
        if (this.f12597c1 == iVar) {
            if (iVar == null || iVar == this.f12598d1) {
                return;
            }
            O1();
            N1();
            return;
        }
        this.f12597c1 = iVar;
        this.U0.m(iVar);
        this.f12599e1 = false;
        int f10 = f();
        j2.l r02 = r0();
        if (r02 != null) {
            if (m0.f12306a < 23 || iVar == null || this.f12595a1) {
                Y0();
                J0();
            } else {
                Y1(r02, iVar);
            }
        }
        if (iVar == null || iVar == this.f12598d1) {
            u1();
            t1();
            return;
        }
        O1();
        t1();
        if (f10 == 2) {
            W1();
        }
    }

    private boolean c2(j2.n nVar) {
        return m0.f12306a >= 23 && !this.f12619y1 && !v1(nVar.f10318a) && (!nVar.f10324g || i.b(this.T0));
    }

    private void t1() {
        j2.l r02;
        this.f12601g1 = false;
        if (m0.f12306a < 23 || !this.f12619y1 || (r02 = r0()) == null) {
            return;
        }
        this.A1 = new b(r02);
    }

    private void u1() {
        this.f12618x1 = null;
    }

    private static void w1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean x1() {
        return "NVIDIA".equals(m0.f12308c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07ce, code lost:
        if (r0.equals("PGN528") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x083c, code lost:
        if (r0.equals("AFTN") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean z1() {
        /*
            Method dump skipped, instructions count: 3062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.h.z1():boolean");
    }

    @Override // j2.o, s1.f, s1.y2
    public void A(float f10, float f11) {
        super.A(f10, f11);
        this.U0.i(f10);
    }

    @Override // j2.o
    @TargetApi(c.j.f3101z3)
    protected void B0(v1.g gVar) {
        if (this.f12596b1) {
            ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(gVar.f15539s);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    V1(r0(), bArr);
                }
            }
        }
    }

    protected a C1(j2.n nVar, m1 m1Var, m1[] m1VarArr) {
        int A1;
        int i10 = m1Var.D;
        int i11 = m1Var.E;
        int E12 = E1(nVar, m1Var);
        if (m1VarArr.length == 1) {
            if (E12 != -1 && (A1 = A1(nVar, m1Var)) != -1) {
                E12 = Math.min((int) (E12 * 1.5f), A1);
            }
            return new a(i10, i11, E12);
        }
        int length = m1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            m1 m1Var2 = m1VarArr[i12];
            if (m1Var.K != null && m1Var2.K == null) {
                m1Var2 = m1Var2.b().J(m1Var.K).E();
            }
            if (nVar.e(m1Var, m1Var2).f15549d != 0) {
                int i13 = m1Var2.D;
                z10 |= i13 == -1 || m1Var2.E == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, m1Var2.E);
                E12 = Math.max(E12, E1(nVar, m1Var2));
            }
        }
        if (z10) {
            p3.r.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point B1 = B1(nVar, m1Var);
            if (B1 != null) {
                i10 = Math.max(i10, B1.x);
                i11 = Math.max(i11, B1.y);
                E12 = Math.max(E12, A1(nVar, m1Var.b().j0(i10).Q(i11).E()));
                p3.r.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, E12);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat F1(m1 m1Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", m1Var.D);
        mediaFormat.setInteger("height", m1Var.E);
        p3.u.e(mediaFormat, m1Var.A);
        p3.u.c(mediaFormat, "frame-rate", m1Var.F);
        p3.u.d(mediaFormat, "rotation-degrees", m1Var.G);
        p3.u.b(mediaFormat, m1Var.K);
        if ("video/dolby-vision".equals(m1Var.f13587y) && (q10 = j2.v.q(m1Var)) != null) {
            p3.u.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f12621a);
        mediaFormat.setInteger("max-height", aVar.f12622b);
        p3.u.d(mediaFormat, "max-input-size", aVar.f12623c);
        if (m0.f12306a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            w1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    protected boolean I1(long j10, boolean z10) {
        int S = S(j10);
        if (S == 0) {
            return false;
        }
        if (z10) {
            v1.e eVar = this.O0;
            eVar.f15526d += S;
            eVar.f15528f += this.f12609o1;
        } else {
            this.O0.f15532j++;
            e2(S, this.f12609o1);
        }
        o0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void J() {
        u1();
        t1();
        this.f12599e1 = false;
        this.A1 = null;
        try {
            super.J();
        } finally {
            this.V0.m(this.O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void K(boolean z10, boolean z11) {
        super.K(z10, z11);
        boolean z12 = D().f13317a;
        p3.a.f((z12 && this.f12620z1 == 0) ? false : true);
        if (this.f12619y1 != z12) {
            this.f12619y1 = z12;
            Y0();
        }
        this.V0.o(this.O0);
        this.f12602h1 = z11;
        this.f12603i1 = false;
    }

    void K1() {
        this.f12603i1 = true;
        if (this.f12601g1) {
            return;
        }
        this.f12601g1 = true;
        this.V0.A(this.f12597c1);
        this.f12599e1 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void L(long j10, boolean z10) {
        super.L(j10, z10);
        t1();
        this.U0.j();
        this.f12610p1 = -9223372036854775807L;
        this.f12604j1 = -9223372036854775807L;
        this.f12608n1 = 0;
        if (z10) {
            W1();
        } else {
            this.f12605k1 = -9223372036854775807L;
        }
    }

    @Override // j2.o
    protected void L0(Exception exc) {
        p3.r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.V0.C(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    @TargetApi(17)
    public void M() {
        try {
            super.M();
        } finally {
            if (this.f12598d1 != null) {
                S1();
            }
        }
    }

    @Override // j2.o
    protected void M0(String str, l.a aVar, long j10, long j11) {
        this.V0.k(str, j10, j11);
        this.f12595a1 = v1(str);
        this.f12596b1 = ((j2.n) p3.a.e(s0())).n();
        if (m0.f12306a < 23 || !this.f12619y1) {
            return;
        }
        this.A1 = new b((j2.l) p3.a.e(r0()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void N() {
        super.N();
        this.f12607m1 = 0;
        this.f12606l1 = SystemClock.elapsedRealtime();
        this.f12611q1 = SystemClock.elapsedRealtime() * 1000;
        this.f12612r1 = 0L;
        this.f12613s1 = 0;
        this.U0.k();
    }

    @Override // j2.o
    protected void N0(String str) {
        this.V0.l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void O() {
        this.f12605k1 = -9223372036854775807L;
        J1();
        L1();
        this.U0.l();
        super.O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public v1.i O0(n1 n1Var) {
        v1.i O0 = super.O0(n1Var);
        this.V0.p(n1Var.f13638b, O0);
        return O0;
    }

    @Override // j2.o
    protected void P0(m1 m1Var, MediaFormat mediaFormat) {
        j2.l r02 = r0();
        if (r02 != null) {
            r02.f(this.f12600f1);
        }
        if (this.f12619y1) {
            this.f12614t1 = m1Var.D;
            this.f12615u1 = m1Var.E;
        } else {
            p3.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f12614t1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f12615u1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = m1Var.H;
        this.f12617w1 = f10;
        if (m0.f12306a >= 21) {
            int i10 = m1Var.G;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f12614t1;
                this.f12614t1 = this.f12615u1;
                this.f12615u1 = i11;
                this.f12617w1 = 1.0f / f10;
            }
        } else {
            this.f12616v1 = m1Var.G;
        }
        this.U0.g(m1Var.F);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void Q0(long j10) {
        super.Q0(j10);
        if (this.f12619y1) {
            return;
        }
        this.f12609o1--;
    }

    protected void Q1(long j10) {
        q1(j10);
        M1();
        this.O0.f15527e++;
        K1();
        Q0(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void R0() {
        super.R0();
        t1();
    }

    @Override // j2.o
    protected void S0(v1.g gVar) {
        boolean z10 = this.f12619y1;
        if (!z10) {
            this.f12609o1++;
        }
        if (m0.f12306a >= 23 || !z10) {
            return;
        }
        Q1(gVar.f15538r);
    }

    protected void T1(j2.l lVar, int i10, long j10) {
        M1();
        j0.a("releaseOutputBuffer");
        lVar.d(i10, true);
        j0.c();
        this.f12611q1 = SystemClock.elapsedRealtime() * 1000;
        this.O0.f15527e++;
        this.f12608n1 = 0;
        K1();
    }

    @Override // j2.o
    protected boolean U0(long j10, long j11, j2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var) {
        boolean z12;
        long j13;
        h hVar;
        j2.l lVar2;
        int i13;
        long j14;
        long j15;
        p3.a.e(lVar);
        if (this.f12604j1 == -9223372036854775807L) {
            this.f12604j1 = j10;
        }
        if (j12 != this.f12610p1) {
            this.U0.h(j12);
            this.f12610p1 = j12;
        }
        long z02 = z0();
        long j16 = j12 - z02;
        if (z10 && !z11) {
            d2(lVar, i10, j16);
            return true;
        }
        double A0 = A0();
        boolean z13 = f() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j17 = (long) ((j12 - j10) / A0);
        if (z13) {
            j17 -= elapsedRealtime - j11;
        }
        if (this.f12597c1 == this.f12598d1) {
            if (G1(j17)) {
                d2(lVar, i10, j16);
                f2(j17);
                return true;
            }
            return false;
        }
        long j18 = elapsedRealtime - this.f12611q1;
        if (this.f12603i1 ? this.f12601g1 : !(z13 || this.f12602h1)) {
            j13 = j18;
            z12 = false;
        } else {
            z12 = true;
            j13 = j18;
        }
        if (!(this.f12605k1 == -9223372036854775807L && j10 >= z02 && (z12 || (z13 && b2(j17, j13))))) {
            if (z13 && j10 != this.f12604j1) {
                long nanoTime = System.nanoTime();
                long b10 = this.U0.b((j17 * 1000) + nanoTime);
                long j19 = (b10 - nanoTime) / 1000;
                boolean z14 = this.f12605k1 != -9223372036854775807L;
                if (Z1(j19, j11, z11) && I1(j10, z14)) {
                    return false;
                }
                if (a2(j19, j11, z11)) {
                    if (z14) {
                        d2(lVar, i10, j16);
                    } else {
                        y1(lVar, i10, j16);
                    }
                    j17 = j19;
                } else {
                    j17 = j19;
                    if (m0.f12306a >= 21) {
                        if (j17 < 50000) {
                            hVar = this;
                            hVar.P1(j16, b10, m1Var);
                            lVar2 = lVar;
                            i13 = i10;
                            j14 = j16;
                            j15 = b10;
                            hVar.U1(lVar2, i13, j14, j15);
                        }
                    } else if (j17 < 30000) {
                        if (j17 > 11000) {
                            try {
                                Thread.sleep((j17 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        P1(j16, b10, m1Var);
                        T1(lVar, i10, j16);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        P1(j16, nanoTime2, m1Var);
        if (m0.f12306a >= 21) {
            hVar = this;
            lVar2 = lVar;
            i13 = i10;
            j14 = j16;
            j15 = nanoTime2;
            hVar.U1(lVar2, i13, j14, j15);
        }
        T1(lVar, i10, j16);
        f2(j17);
        return true;
    }

    protected void U1(j2.l lVar, int i10, long j10, long j11) {
        M1();
        j0.a("releaseOutputBuffer");
        lVar.n(i10, j11);
        j0.c();
        this.f12611q1 = SystemClock.elapsedRealtime() * 1000;
        this.O0.f15527e++;
        this.f12608n1 = 0;
        K1();
    }

    @Override // j2.o
    protected v1.i V(j2.n nVar, m1 m1Var, m1 m1Var2) {
        v1.i e10 = nVar.e(m1Var, m1Var2);
        int i10 = e10.f15550e;
        int i11 = m1Var2.D;
        a aVar = this.Z0;
        if (i11 > aVar.f12621a || m1Var2.E > aVar.f12622b) {
            i10 |= 256;
        }
        if (E1(nVar, m1Var2) > this.Z0.f12623c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new v1.i(nVar.f10318a, m1Var, m1Var2, i12 != 0 ? 0 : e10.f15549d, i12);
    }

    protected void Y1(j2.l lVar, Surface surface) {
        lVar.i(surface);
    }

    protected boolean Z1(long j10, long j11, boolean z10) {
        return H1(j10) && !z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void a1() {
        super.a1();
        this.f12609o1 = 0;
    }

    protected boolean a2(long j10, long j11, boolean z10) {
        return G1(j10) && !z10;
    }

    protected boolean b2(long j10, long j11) {
        return G1(j10) && j11 > 100000;
    }

    protected void d2(j2.l lVar, int i10, long j10) {
        j0.a("skipVideoBuffer");
        lVar.d(i10, false);
        j0.c();
        this.O0.f15528f++;
    }

    @Override // s1.y2, s1.a3
    public String e() {
        return "MediaCodecVideoRenderer";
    }

    protected void e2(int i10, int i11) {
        v1.e eVar = this.O0;
        eVar.f15530h += i10;
        int i12 = i10 + i11;
        eVar.f15529g += i12;
        this.f12607m1 += i12;
        int i13 = this.f12608n1 + i12;
        this.f12608n1 = i13;
        eVar.f15531i = Math.max(i13, eVar.f15531i);
        int i14 = this.X0;
        if (i14 <= 0 || this.f12607m1 < i14) {
            return;
        }
        J1();
    }

    @Override // j2.o
    protected j2.m f0(Throwable th, j2.n nVar) {
        return new g(th, nVar, this.f12597c1);
    }

    protected void f2(long j10) {
        this.O0.a(j10);
        this.f12612r1 += j10;
        this.f12613s1++;
    }

    @Override // j2.o, s1.y2
    public boolean i() {
        i iVar;
        if (super.i() && (this.f12601g1 || (((iVar = this.f12598d1) != null && this.f12597c1 == iVar) || r0() == null || this.f12619y1))) {
            this.f12605k1 = -9223372036854775807L;
            return true;
        } else if (this.f12605k1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f12605k1) {
                return true;
            }
            this.f12605k1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // j2.o
    protected boolean j1(j2.n nVar) {
        return this.f12597c1 != null || c2(nVar);
    }

    @Override // j2.o
    protected int m1(j2.q qVar, m1 m1Var) {
        boolean z10;
        int i10 = 0;
        if (p3.v.s(m1Var.f13587y)) {
            boolean z11 = m1Var.B != null;
            List<j2.n> D12 = D1(qVar, m1Var, z11, false);
            if (z11 && D12.isEmpty()) {
                D12 = D1(qVar, m1Var, false, false);
            }
            if (D12.isEmpty()) {
                return z2.a(1);
            }
            if (j2.o.n1(m1Var)) {
                j2.n nVar = D12.get(0);
                boolean m10 = nVar.m(m1Var);
                if (!m10) {
                    for (int i11 = 1; i11 < D12.size(); i11++) {
                        j2.n nVar2 = D12.get(i11);
                        if (nVar2.m(m1Var)) {
                            z10 = false;
                            m10 = true;
                            nVar = nVar2;
                            break;
                        }
                    }
                }
                z10 = true;
                int i12 = m10 ? 4 : 3;
                int i13 = nVar.p(m1Var) ? 16 : 8;
                int i14 = nVar.f10325h ? 64 : 0;
                int i15 = z10 ? 128 : 0;
                if (m10) {
                    List<j2.n> D13 = D1(qVar, m1Var, z11, true);
                    if (!D13.isEmpty()) {
                        j2.n nVar3 = j2.v.u(D13, m1Var).get(0);
                        if (nVar3.m(m1Var) && nVar3.p(m1Var)) {
                            i10 = 32;
                        }
                    }
                }
                return z2.c(i12, i13, i10, i14, i15);
            }
            return z2.a(2);
        }
        return z2.a(0);
    }

    @Override // s1.f, s1.t2.b
    public void p(int i10, Object obj) {
        if (i10 == 1) {
            X1(obj);
        } else if (i10 == 7) {
            this.B1 = (j) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f12620z1 != intValue) {
                this.f12620z1 = intValue;
                if (this.f12619y1) {
                    Y0();
                }
            }
        } else if (i10 != 4) {
            if (i10 != 5) {
                super.p(i10, obj);
            } else {
                this.U0.o(((Integer) obj).intValue());
            }
        } else {
            this.f12600f1 = ((Integer) obj).intValue();
            j2.l r02 = r0();
            if (r02 != null) {
                r02.f(this.f12600f1);
            }
        }
    }

    @Override // j2.o
    protected boolean t0() {
        return this.f12619y1 && m0.f12306a < 23;
    }

    @Override // j2.o
    protected float u0(float f10, m1 m1Var, m1[] m1VarArr) {
        float f11 = -1.0f;
        for (m1 m1Var2 : m1VarArr) {
            float f12 = m1Var2.F;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    protected boolean v1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!D1) {
                E1 = z1();
                D1 = true;
            }
        }
        return E1;
    }

    @Override // j2.o
    protected List<j2.n> w0(j2.q qVar, m1 m1Var, boolean z10) {
        return j2.v.u(D1(qVar, m1Var, z10, this.f12619y1), m1Var);
    }

    @Override // j2.o
    @TargetApi(17)
    protected l.a y0(j2.n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10) {
        i iVar = this.f12598d1;
        if (iVar != null && iVar.f12628n != nVar.f10324g) {
            S1();
        }
        String str = nVar.f10320c;
        a C12 = C1(nVar, m1Var, H());
        this.Z0 = C12;
        MediaFormat F1 = F1(m1Var, str, C12, f10, this.Y0, this.f12619y1 ? this.f12620z1 : 0);
        if (this.f12597c1 == null) {
            if (!c2(nVar)) {
                throw new IllegalStateException();
            }
            if (this.f12598d1 == null) {
                this.f12598d1 = i.c(this.T0, nVar.f10324g);
            }
            this.f12597c1 = this.f12598d1;
        }
        return l.a.b(nVar, F1, m1Var, this.f12597c1, mediaCrypto);
    }

    protected void y1(j2.l lVar, int i10, long j10) {
        j0.a("dropVideoBuffer");
        lVar.d(i10, false);
        j0.c();
        e2(0, 1);
    }
}
