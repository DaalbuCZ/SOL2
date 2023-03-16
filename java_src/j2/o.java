package j2;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import j2.l;
import j2.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p3.h0;
import p3.j0;
import p3.m0;
import s1.m1;
import s1.n1;
import t1.t1;
import v1.g;
import w1.o;
/* loaded from: classes.dex */
public abstract class o extends s1.f {
    private static final byte[] S0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final l.b A;
    private boolean A0;
    private final q B;
    private int B0;
    private final boolean C;
    private int C0;
    private final float D;
    private int D0;
    private final v1.g E;
    private boolean E0;
    private final v1.g F;
    private boolean F0;
    private final v1.g G;
    private boolean G0;
    private final h H;
    private long H0;
    private final h0<m1> I;
    private long I0;
    private final ArrayList<Long> J;
    private boolean J0;
    private final MediaCodec.BufferInfo K;
    private boolean K0;
    private final long[] L;
    private boolean L0;
    private final long[] M;
    private boolean M0;
    private final long[] N;
    private s1.q N0;
    private m1 O;
    protected v1.e O0;
    private m1 P;
    private long P0;
    private w1.o Q;
    private long Q0;
    private w1.o R;
    private int R0;
    private MediaCrypto S;
    private boolean T;
    private long U;
    private float V;
    private float W;
    private l X;
    private m1 Y;
    private MediaFormat Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10329a0;

    /* renamed from: b0  reason: collision with root package name */
    private float f10330b0;

    /* renamed from: c0  reason: collision with root package name */
    private ArrayDeque<n> f10331c0;

    /* renamed from: d0  reason: collision with root package name */
    private b f10332d0;

    /* renamed from: e0  reason: collision with root package name */
    private n f10333e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f10334f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f10335g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f10336h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f10337i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f10338j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f10339k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f10340l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f10341m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f10342n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f10343o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f10344p0;

    /* renamed from: q0  reason: collision with root package name */
    private i f10345q0;

    /* renamed from: r0  reason: collision with root package name */
    private long f10346r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f10347s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f10348t0;

    /* renamed from: u0  reason: collision with root package name */
    private ByteBuffer f10349u0;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f10350v0;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f10351w0;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f10352x0;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f10353y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f10354z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(l.a aVar, t1 t1Var) {
            LogSessionId a10 = t1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f10311b.setString("log-session-id", a10.getStringId());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {

        /* renamed from: n  reason: collision with root package name */
        public final String f10355n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f10356o;

        /* renamed from: p  reason: collision with root package name */
        public final n f10357p;

        /* renamed from: q  reason: collision with root package name */
        public final String f10358q;

        /* renamed from: r  reason: collision with root package name */
        public final b f10359r;

        private b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f10355n = str2;
            this.f10356o = z10;
            this.f10357p = nVar;
            this.f10358q = str3;
            this.f10359r = bVar;
        }

        public b(m1 m1Var, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + m1Var, th, m1Var.f13587y, z10, null, b(i10), null);
        }

        public b(m1 m1Var, Throwable th, boolean z10, n nVar) {
            this("Decoder init failed: " + nVar.f10318a + ", " + m1Var, th, m1Var.f13587y, z10, nVar, m0.f12306a >= 21 ? d(th) : null, null);
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f10355n, this.f10356o, this.f10357p, this.f10358q, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.A = bVar;
        this.B = (q) p3.a.e(qVar);
        this.C = z10;
        this.D = f10;
        this.E = v1.g.B();
        this.F = new v1.g(0);
        this.G = new v1.g(2);
        h hVar = new h();
        this.H = hVar;
        this.I = new h0<>();
        this.J = new ArrayList<>();
        this.K = new MediaCodec.BufferInfo();
        this.V = 1.0f;
        this.W = 1.0f;
        this.U = -9223372036854775807L;
        this.L = new long[10];
        this.M = new long[10];
        this.N = new long[10];
        this.P0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        hVar.y(0);
        hVar.f15536p.order(ByteOrder.nativeOrder());
        this.f10330b0 = -1.0f;
        this.f10334f0 = 0;
        this.B0 = 0;
        this.f10347s0 = -1;
        this.f10348t0 = -1;
        this.f10346r0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.C0 = 0;
        this.D0 = 0;
    }

    private boolean C0() {
        return this.f10348t0 >= 0;
    }

    private void D0(m1 m1Var) {
        g0();
        String str = m1Var.f13587y;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.H.J(32);
        } else {
            this.H.J(1);
        }
        this.f10352x0 = true;
    }

    private void E0(n nVar, MediaCrypto mediaCrypto) {
        String str = nVar.f10318a;
        int i10 = m0.f12306a;
        float u02 = i10 < 23 ? -1.0f : u0(this.W, this.O, H());
        float f10 = u02 > this.D ? u02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a y02 = y0(nVar, this.O, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(y02, G());
        }
        try {
            j0.a("createCodec:" + str);
            this.X = this.A.a(y02);
            j0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f10333e0 = nVar;
            this.f10330b0 = f10;
            this.Y = this.O;
            this.f10334f0 = W(str);
            this.f10335g0 = X(str, this.Y);
            this.f10336h0 = c0(str);
            this.f10337i0 = e0(str);
            this.f10338j0 = Z(str);
            this.f10339k0 = a0(str);
            this.f10340l0 = Y(str);
            this.f10341m0 = d0(str, this.Y);
            this.f10344p0 = b0(nVar) || t0();
            if (this.X.c()) {
                this.A0 = true;
                this.B0 = 1;
                this.f10342n0 = this.f10334f0 != 0;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f10318a)) {
                this.f10345q0 = new i();
            }
            if (f() == 2) {
                this.f10346r0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.O0.f15523a++;
            M0(str, y02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            j0.c();
            throw th;
        }
    }

    private boolean F0(long j10) {
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.J.get(i10).longValue() == j10) {
                this.J.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean G0(IllegalStateException illegalStateException) {
        if (m0.f12306a < 21 || !H0(illegalStateException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
        }
        return true;
    }

    private static boolean H0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean I0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque<j2.n> r0 = r7.f10331c0
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.q0(r9)     // Catch: j2.v.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: j2.v.c -> L2d
            r2.<init>()     // Catch: j2.v.c -> L2d
            r7.f10331c0 = r2     // Catch: j2.v.c -> L2d
            boolean r3 = r7.C     // Catch: j2.v.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: j2.v.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: j2.v.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<j2.n> r2 = r7.f10331c0     // Catch: j2.v.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: j2.v.c -> L2d
            j2.n r0 = (j2.n) r0     // Catch: j2.v.c -> L2d
            r2.add(r0)     // Catch: j2.v.c -> L2d
        L2a:
            r7.f10332d0 = r1     // Catch: j2.v.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            j2.o$b r0 = new j2.o$b
            s1.m1 r1 = r7.O
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<j2.n> r0 = r7.f10331c0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<j2.n> r0 = r7.f10331c0
            java.lang.Object r0 = r0.peekFirst()
            j2.n r0 = (j2.n) r0
        L49:
            j2.l r2 = r7.X
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<j2.n> r2 = r7.f10331c0
            java.lang.Object r2 = r2.peekFirst()
            j2.n r2 = (j2.n) r2
            boolean r3 = r7.j1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.E0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            p3.r.i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.E0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            p3.r.j(r4, r5, r3)
            java.util.ArrayDeque<j2.n> r4 = r7.f10331c0
            r4.removeFirst()
            j2.o$b r4 = new j2.o$b
            s1.m1 r5 = r7.O
            r4.<init>(r5, r3, r9, r2)
            r7.L0(r4)
            j2.o$b r2 = r7.f10332d0
            if (r2 != 0) goto L9f
            r7.f10332d0 = r4
            goto La5
        L9f:
            j2.o$b r2 = j2.o.b.a(r2, r4)
            r7.f10332d0 = r2
        La5:
            java.util.ArrayDeque<j2.n> r2 = r7.f10331c0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            j2.o$b r8 = r7.f10332d0
            throw r8
        Lb1:
            r7.f10331c0 = r1
            return
        Lb4:
            j2.o$b r8 = new j2.o$b
            s1.m1 r0 = r7.O
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.K0(android.media.MediaCrypto, boolean):void");
    }

    private void T() {
        p3.a.f(!this.J0);
        n1 E = E();
        this.G.m();
        do {
            this.G.m();
            int Q = Q(E, this.G, 0);
            if (Q == -5) {
                O0(E);
                return;
            } else if (Q != -4) {
                if (Q != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.G.t()) {
                this.J0 = true;
                return;
            } else {
                if (this.L0) {
                    m1 m1Var = (m1) p3.a.e(this.O);
                    this.P = m1Var;
                    P0(m1Var, null);
                    this.L0 = false;
                }
                this.G.z();
            }
        } while (this.H.D(this.G));
        this.f10353y0 = true;
    }

    @TargetApi(c.j.f3071t3)
    private void T0() {
        int i10 = this.D0;
        if (i10 == 1) {
            n0();
        } else if (i10 == 2) {
            n0();
            p1();
        } else if (i10 == 3) {
            X0();
        } else {
            this.K0 = true;
            Z0();
        }
    }

    private boolean U(long j10, long j11) {
        boolean z10;
        p3.a.f(!this.K0);
        if (this.H.I()) {
            h hVar = this.H;
            if (!U0(j10, j11, null, hVar.f15536p, this.f10348t0, 0, hVar.H(), this.H.F(), this.H.s(), this.H.t(), this.P)) {
                return false;
            }
            Q0(this.H.G());
            this.H.m();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.J0) {
            this.K0 = true;
            return z10;
        }
        if (this.f10353y0) {
            p3.a.f(this.H.D(this.G));
            this.f10353y0 = z10;
        }
        if (this.f10354z0) {
            if (this.H.I()) {
                return true;
            }
            g0();
            this.f10354z0 = z10;
            J0();
            if (!this.f10352x0) {
                return z10;
            }
        }
        T();
        if (this.H.I()) {
            this.H.z();
        }
        if (this.H.I() || this.J0 || this.f10354z0) {
            return true;
        }
        return z10;
    }

    private void V0() {
        this.G0 = true;
        MediaFormat g10 = this.X.g();
        if (this.f10334f0 != 0 && g10.getInteger("width") == 32 && g10.getInteger("height") == 32) {
            this.f10343o0 = true;
            return;
        }
        if (this.f10341m0) {
            g10.setInteger("channel-count", 1);
        }
        this.Z = g10;
        this.f10329a0 = true;
    }

    private int W(String str) {
        int i10 = m0.f12306a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = m0.f12309d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = m0.f12307b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    private boolean W0(int i10) {
        n1 E = E();
        this.E.m();
        int Q = Q(E, this.E, i10 | 4);
        if (Q == -5) {
            O0(E);
            return true;
        } else if (Q == -4 && this.E.t()) {
            this.J0 = true;
            T0();
            return false;
        } else {
            return false;
        }
    }

    private static boolean X(String str, m1 m1Var) {
        return m0.f12306a < 21 && m1Var.A.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void X0() {
        Y0();
        J0();
    }

    private static boolean Y(String str) {
        if (m0.f12306a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(m0.f12308c)) {
            String str2 = m0.f12307b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean Z(String str) {
        int i10 = m0.f12306a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = m0.f12307b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean a0(String str) {
        return m0.f12306a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean b0(n nVar) {
        String str = nVar.f10318a;
        int i10 = m0.f12306a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(m0.f12308c) && "AFTS".equals(m0.f12309d) && nVar.f10324g));
    }

    private static boolean c0(String str) {
        int i10 = m0.f12306a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && m0.f12309d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private void c1() {
        this.f10347s0 = -1;
        this.F.f15536p = null;
    }

    private static boolean d0(String str, m1 m1Var) {
        return m0.f12306a <= 18 && m1Var.L == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void d1() {
        this.f10348t0 = -1;
        this.f10349u0 = null;
    }

    private static boolean e0(String str) {
        return m0.f12306a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void e1(w1.o oVar) {
        w1.n.a(this.Q, oVar);
        this.Q = oVar;
    }

    private void g0() {
        this.f10354z0 = false;
        this.H.m();
        this.G.m();
        this.f10353y0 = false;
        this.f10352x0 = false;
    }

    private boolean h0() {
        if (this.E0) {
            this.C0 = 1;
            if (this.f10336h0 || this.f10338j0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = 1;
        }
        return true;
    }

    private void h1(w1.o oVar) {
        w1.n.a(this.R, oVar);
        this.R = oVar;
    }

    private void i0() {
        if (!this.E0) {
            X0();
            return;
        }
        this.C0 = 1;
        this.D0 = 3;
    }

    private boolean i1(long j10) {
        return this.U == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.U;
    }

    @TargetApi(c.j.f3071t3)
    private boolean j0() {
        if (this.E0) {
            this.C0 = 1;
            if (this.f10336h0 || this.f10338j0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = 2;
        } else {
            p1();
        }
        return true;
    }

    private boolean k0(long j10, long j11) {
        boolean z10;
        boolean U0;
        l lVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int b10;
        if (!C0()) {
            if (this.f10339k0 && this.F0) {
                try {
                    b10 = this.X.b(this.K);
                } catch (IllegalStateException unused) {
                    T0();
                    if (this.K0) {
                        Y0();
                    }
                    return false;
                }
            } else {
                b10 = this.X.b(this.K);
            }
            if (b10 < 0) {
                if (b10 == -2) {
                    V0();
                    return true;
                }
                if (this.f10344p0 && (this.J0 || this.C0 == 2)) {
                    T0();
                }
                return false;
            } else if (this.f10343o0) {
                this.f10343o0 = false;
                this.X.d(b10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.K;
                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                    T0();
                    return false;
                }
                this.f10348t0 = b10;
                ByteBuffer m10 = this.X.m(b10);
                this.f10349u0 = m10;
                if (m10 != null) {
                    m10.position(this.K.offset);
                    ByteBuffer byteBuffer2 = this.f10349u0;
                    MediaCodec.BufferInfo bufferInfo3 = this.K;
                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                }
                if (this.f10340l0) {
                    MediaCodec.BufferInfo bufferInfo4 = this.K;
                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                        long j12 = this.H0;
                        if (j12 != -9223372036854775807L) {
                            bufferInfo4.presentationTimeUs = j12;
                        }
                    }
                }
                this.f10350v0 = F0(this.K.presentationTimeUs);
                long j13 = this.I0;
                long j14 = this.K.presentationTimeUs;
                this.f10351w0 = j13 == j14;
                q1(j14);
            }
        }
        if (this.f10339k0 && this.F0) {
            try {
                lVar = this.X;
                byteBuffer = this.f10349u0;
                i10 = this.f10348t0;
                bufferInfo = this.K;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                U0 = U0(j10, j11, lVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f10350v0, this.f10351w0, this.P);
            } catch (IllegalStateException unused3) {
                T0();
                if (this.K0) {
                    Y0();
                }
                return z10;
            }
        } else {
            z10 = false;
            l lVar2 = this.X;
            ByteBuffer byteBuffer3 = this.f10349u0;
            int i11 = this.f10348t0;
            MediaCodec.BufferInfo bufferInfo5 = this.K;
            U0 = U0(j10, j11, lVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f10350v0, this.f10351w0, this.P);
        }
        if (U0) {
            Q0(this.K.presentationTimeUs);
            boolean z11 = (this.K.flags & 4) != 0 ? true : z10;
            d1();
            if (!z11) {
                return true;
            }
            T0();
        }
        return z10;
    }

    private boolean l0(n nVar, m1 m1Var, w1.o oVar, w1.o oVar2) {
        w1.h0 x02;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || m0.f12306a < 23) {
            return true;
        }
        UUID uuid = s1.i.f13429e;
        if (uuid.equals(oVar.d()) || uuid.equals(oVar2.d()) || (x02 = x0(oVar2)) == null) {
            return true;
        }
        return !nVar.f10324g && (x02.f15916c ? false : oVar2.g(m1Var.f13587y));
    }

    private boolean m0() {
        int i10;
        if (this.X == null || (i10 = this.C0) == 2 || this.J0) {
            return false;
        }
        if (i10 == 0 && k1()) {
            i0();
        }
        if (this.f10347s0 < 0) {
            int o10 = this.X.o();
            this.f10347s0 = o10;
            if (o10 < 0) {
                return false;
            }
            this.F.f15536p = this.X.h(o10);
            this.F.m();
        }
        if (this.C0 == 1) {
            if (!this.f10344p0) {
                this.F0 = true;
                this.X.k(this.f10347s0, 0, 0, 0L, 4);
                c1();
            }
            this.C0 = 2;
            return false;
        } else if (this.f10342n0) {
            this.f10342n0 = false;
            ByteBuffer byteBuffer = this.F.f15536p;
            byte[] bArr = S0;
            byteBuffer.put(bArr);
            this.X.k(this.f10347s0, 0, bArr.length, 0L, 0);
            c1();
            this.E0 = true;
            return true;
        } else {
            if (this.B0 == 1) {
                for (int i11 = 0; i11 < this.Y.A.size(); i11++) {
                    this.F.f15536p.put(this.Y.A.get(i11));
                }
                this.B0 = 2;
            }
            int position = this.F.f15536p.position();
            n1 E = E();
            try {
                int Q = Q(E, this.F, 0);
                if (m()) {
                    this.I0 = this.H0;
                }
                if (Q == -3) {
                    return false;
                }
                if (Q == -5) {
                    if (this.B0 == 2) {
                        this.F.m();
                        this.B0 = 1;
                    }
                    O0(E);
                    return true;
                } else if (this.F.t()) {
                    if (this.B0 == 2) {
                        this.F.m();
                        this.B0 = 1;
                    }
                    this.J0 = true;
                    if (!this.E0) {
                        T0();
                        return false;
                    }
                    try {
                        if (!this.f10344p0) {
                            this.F0 = true;
                            this.X.k(this.f10347s0, 0, 0, 0L, 4);
                            c1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw B(e10, this.O, m0.U(e10.getErrorCode()));
                    }
                } else if (!this.E0 && !this.F.v()) {
                    this.F.m();
                    if (this.B0 == 2) {
                        this.B0 = 1;
                    }
                    return true;
                } else {
                    boolean A = this.F.A();
                    if (A) {
                        this.F.f15535o.b(position);
                    }
                    if (this.f10335g0 && !A) {
                        p3.w.b(this.F.f15536p);
                        if (this.F.f15536p.position() == 0) {
                            return true;
                        }
                        this.f10335g0 = false;
                    }
                    v1.g gVar = this.F;
                    long j10 = gVar.f15538r;
                    i iVar = this.f10345q0;
                    if (iVar != null) {
                        j10 = iVar.d(this.O, gVar);
                        this.H0 = Math.max(this.H0, this.f10345q0.b(this.O));
                    }
                    long j11 = j10;
                    if (this.F.s()) {
                        this.J.add(Long.valueOf(j11));
                    }
                    if (this.L0) {
                        this.I.a(j11, this.O);
                        this.L0 = false;
                    }
                    this.H0 = Math.max(this.H0, j11);
                    this.F.z();
                    if (this.F.r()) {
                        B0(this.F);
                    }
                    S0(this.F);
                    try {
                        if (A) {
                            this.X.e(this.f10347s0, 0, this.F.f15535o, j11, 0);
                        } else {
                            this.X.k(this.f10347s0, 0, this.F.f15536p.limit(), j11, 0);
                        }
                        c1();
                        this.E0 = true;
                        this.B0 = 0;
                        this.O0.f15525c++;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw B(e11, this.O, m0.U(e11.getErrorCode()));
                    }
                }
            } catch (g.a e12) {
                L0(e12);
                W0(0);
                n0();
                return true;
            }
        }
    }

    private void n0() {
        try {
            this.X.flush();
        } finally {
            a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean n1(m1 m1Var) {
        int i10 = m1Var.R;
        return i10 == 0 || i10 == 2;
    }

    private boolean o1(m1 m1Var) {
        if (m0.f12306a >= 23 && this.X != null && this.D0 != 3 && f() != 0) {
            float u02 = u0(this.W, m1Var, H());
            float f10 = this.f10330b0;
            if (f10 == u02) {
                return true;
            }
            if (u02 == -1.0f) {
                i0();
                return false;
            } else if (f10 == -1.0f && u02 <= this.D) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", u02);
                this.X.l(bundle);
                this.f10330b0 = u02;
            }
        }
        return true;
    }

    private void p1() {
        try {
            this.S.setMediaDrmSession(x0(this.R).f15915b);
            e1(this.R);
            this.C0 = 0;
            this.D0 = 0;
        } catch (MediaCryptoException e10) {
            throw B(e10, this.O, 6006);
        }
    }

    private List<n> q0(boolean z10) {
        List<n> w02 = w0(this.B, this.O, z10);
        if (w02.isEmpty() && z10) {
            w02 = w0(this.B, this.O, false);
            if (!w02.isEmpty()) {
                p3.r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.O.f13587y + ", but no secure decoder available. Trying to proceed with " + w02 + ".");
            }
        }
        return w02;
    }

    private w1.h0 x0(w1.o oVar) {
        v1.b i10 = oVar.i();
        if (i10 == null || (i10 instanceof w1.h0)) {
            return (w1.h0) i10;
        }
        throw B(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + i10), this.O, 6001);
    }

    @Override // s1.f, s1.y2
    public void A(float f10, float f11) {
        this.V = f10;
        this.W = f11;
        o1(this.Y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float A0() {
        return this.V;
    }

    protected void B0(v1.g gVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void J() {
        this.O = null;
        this.P0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.R0 = 0;
        p0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J0() {
        m1 m1Var;
        if (this.X != null || this.f10352x0 || (m1Var = this.O) == null) {
            return;
        }
        if (this.R == null && l1(m1Var)) {
            D0(this.O);
            return;
        }
        e1(this.R);
        String str = this.O.f13587y;
        w1.o oVar = this.Q;
        if (oVar != null) {
            if (this.S == null) {
                w1.h0 x02 = x0(oVar);
                if (x02 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(x02.f15914a, x02.f15915b);
                        this.S = mediaCrypto;
                        this.T = !x02.f15916c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw B(e10, this.O, 6006);
                    }
                } else if (this.Q.h() == null) {
                    return;
                }
            }
            if (w1.h0.f15913d) {
                int f10 = this.Q.f();
                if (f10 == 1) {
                    o.a aVar = (o.a) p3.a.e(this.Q.h());
                    throw B(aVar, this.O, aVar.f15946n);
                } else if (f10 != 4) {
                    return;
                }
            }
        }
        try {
            K0(this.S, this.T);
        } catch (b e11) {
            throw B(e11, this.O, 4001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void K(boolean z10, boolean z11) {
        this.O0 = new v1.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void L(long j10, boolean z10) {
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.f10352x0) {
            this.H.m();
            this.G.m();
            this.f10353y0 = false;
        } else {
            o0();
        }
        if (this.I.k() > 0) {
            this.L0 = true;
        }
        this.I.c();
        int i10 = this.R0;
        if (i10 != 0) {
            this.Q0 = this.M[i10 - 1];
            this.P0 = this.L[i10 - 1];
            this.R0 = 0;
        }
    }

    protected abstract void L0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void M() {
        try {
            g0();
            Y0();
        } finally {
            h1(null);
        }
    }

    protected abstract void M0(String str, l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void N() {
    }

    protected abstract void N0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void O() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (j0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        if (j0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
        r7 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v1.i O0(s1.n1 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.O0(s1.n1):v1.i");
    }

    @Override // s1.f
    protected void P(m1[] m1VarArr, long j10, long j11) {
        if (this.Q0 == -9223372036854775807L) {
            p3.a.f(this.P0 == -9223372036854775807L);
            this.P0 = j10;
            this.Q0 = j11;
            return;
        }
        int i10 = this.R0;
        if (i10 == this.M.length) {
            p3.r.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.M[this.R0 - 1]);
        } else {
            this.R0 = i10 + 1;
        }
        long[] jArr = this.L;
        int i11 = this.R0;
        jArr[i11 - 1] = j10;
        this.M[i11 - 1] = j11;
        this.N[i11 - 1] = this.H0;
    }

    protected abstract void P0(m1 m1Var, MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q0(long j10) {
        while (true) {
            int i10 = this.R0;
            if (i10 == 0 || j10 < this.N[0]) {
                return;
            }
            long[] jArr = this.L;
            this.P0 = jArr[0];
            this.Q0 = this.M[0];
            int i11 = i10 - 1;
            this.R0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.M;
            System.arraycopy(jArr2, 1, jArr2, 0, this.R0);
            long[] jArr3 = this.N;
            System.arraycopy(jArr3, 1, jArr3, 0, this.R0);
            R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R0() {
    }

    protected abstract void S0(v1.g gVar);

    protected abstract boolean U0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var);

    protected abstract v1.i V(n nVar, m1 m1Var, m1 m1Var2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaCrypto, w1.o] */
    public void Y0() {
        try {
            l lVar = this.X;
            if (lVar != null) {
                lVar.a();
                this.O0.f15524b++;
                N0(this.f10333e0.f10318a);
            }
            this.X = null;
            try {
                MediaCrypto mediaCrypto = this.S;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.X = null;
            try {
                MediaCrypto mediaCrypto2 = this.S;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void Z0() {
    }

    @Override // s1.a3
    public final int a(m1 m1Var) {
        try {
            return m1(this.B, m1Var);
        } catch (v.c e10) {
            throw B(e10, m1Var, 4002);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a1() {
        c1();
        d1();
        this.f10346r0 = -9223372036854775807L;
        this.F0 = false;
        this.E0 = false;
        this.f10342n0 = false;
        this.f10343o0 = false;
        this.f10350v0 = false;
        this.f10351w0 = false;
        this.J.clear();
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        i iVar = this.f10345q0;
        if (iVar != null) {
            iVar.c();
        }
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = this.A0 ? 1 : 0;
    }

    @Override // s1.y2
    public boolean b() {
        return this.K0;
    }

    protected void b1() {
        a1();
        this.N0 = null;
        this.f10345q0 = null;
        this.f10331c0 = null;
        this.f10333e0 = null;
        this.Y = null;
        this.Z = null;
        this.f10329a0 = false;
        this.G0 = false;
        this.f10330b0 = -1.0f;
        this.f10334f0 = 0;
        this.f10335g0 = false;
        this.f10336h0 = false;
        this.f10337i0 = false;
        this.f10338j0 = false;
        this.f10339k0 = false;
        this.f10340l0 = false;
        this.f10341m0 = false;
        this.f10344p0 = false;
        this.A0 = false;
        this.B0 = 0;
        this.T = false;
    }

    protected m f0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f1() {
        this.M0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g1(s1.q qVar) {
        this.N0 = qVar;
    }

    @Override // s1.y2
    public boolean i() {
        return this.O != null && (I() || C0() || (this.f10346r0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f10346r0));
    }

    protected boolean j1(n nVar) {
        return true;
    }

    protected boolean k1() {
        return false;
    }

    protected boolean l1(m1 m1Var) {
        return false;
    }

    protected abstract int m1(q qVar, m1 m1Var);

    @Override // s1.f, s1.a3
    public final int n() {
        return 8;
    }

    @Override // s1.y2
    public void o(long j10, long j11) {
        boolean z10 = false;
        if (this.M0) {
            this.M0 = false;
            T0();
        }
        s1.q qVar = this.N0;
        if (qVar != null) {
            this.N0 = null;
            throw qVar;
        }
        try {
            if (this.K0) {
                Z0();
            } else if (this.O != null || W0(2)) {
                J0();
                if (this.f10352x0) {
                    j0.a("bypassRender");
                    while (U(j10, j11)) {
                    }
                } else if (this.X == null) {
                    this.O0.f15526d += S(j10);
                    W0(1);
                    this.O0.c();
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j0.a("drainAndFeed");
                    while (k0(j10, j11) && i1(elapsedRealtime)) {
                    }
                    while (m0() && i1(elapsedRealtime)) {
                    }
                }
                j0.c();
                this.O0.c();
            }
        } catch (IllegalStateException e10) {
            if (!G0(e10)) {
                throw e10;
            }
            L0(e10);
            if (m0.f12306a >= 21 && I0(e10)) {
                z10 = true;
            }
            if (z10) {
                Y0();
            }
            throw C(f0(e10, s0()), this.O, z10, 4003);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o0() {
        boolean p02 = p0();
        if (p02) {
            J0();
        }
        return p02;
    }

    protected boolean p0() {
        if (this.X == null) {
            return false;
        }
        int i10 = this.D0;
        if (i10 == 3 || this.f10336h0 || ((this.f10337i0 && !this.G0) || (this.f10338j0 && this.F0))) {
            Y0();
            return true;
        }
        if (i10 == 2) {
            int i11 = m0.f12306a;
            p3.a.f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    p1();
                } catch (s1.q e10) {
                    p3.r.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    Y0();
                    return true;
                }
            }
        }
        n0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q1(long j10) {
        boolean z10;
        m1 i10 = this.I.i(j10);
        if (i10 == null && this.f10329a0) {
            i10 = this.I.h();
        }
        if (i10 != null) {
            this.P = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f10329a0 && this.P != null)) {
            P0(this.P, this.Z);
            this.f10329a0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l r0() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n s0() {
        return this.f10333e0;
    }

    protected boolean t0() {
        return false;
    }

    protected abstract float u0(float f10, m1 m1Var, m1[] m1VarArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat v0() {
        return this.Z;
    }

    protected abstract List<n> w0(q qVar, m1 m1Var, boolean z10);

    protected abstract l.a y0(n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long z0() {
        return this.Q0;
    }
}
