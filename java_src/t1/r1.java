package t1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import j2.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import o3.q0;
import o3.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.h2;
import s1.l2;
import s1.l3;
import s1.o2;
import s1.p2;
import s1.q3;
import s1.u1;
import s1.z1;
import t1.c;
import t1.s1;
import u1.t;
import u2.u;
import w1.h;
import w1.o;
/* loaded from: classes.dex */
public final class r1 implements c, s1.a {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f14636a;

    /* renamed from: b  reason: collision with root package name */
    private final s1 f14637b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f14638c;

    /* renamed from: i  reason: collision with root package name */
    private String f14644i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f14645j;

    /* renamed from: k  reason: collision with root package name */
    private int f14646k;

    /* renamed from: n  reason: collision with root package name */
    private l2 f14649n;

    /* renamed from: o  reason: collision with root package name */
    private b f14650o;

    /* renamed from: p  reason: collision with root package name */
    private b f14651p;

    /* renamed from: q  reason: collision with root package name */
    private b f14652q;

    /* renamed from: r  reason: collision with root package name */
    private s1.m1 f14653r;

    /* renamed from: s  reason: collision with root package name */
    private s1.m1 f14654s;

    /* renamed from: t  reason: collision with root package name */
    private s1.m1 f14655t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f14656u;

    /* renamed from: v  reason: collision with root package name */
    private int f14657v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14658w;

    /* renamed from: x  reason: collision with root package name */
    private int f14659x;

    /* renamed from: y  reason: collision with root package name */
    private int f14660y;

    /* renamed from: z  reason: collision with root package name */
    private int f14661z;

    /* renamed from: e  reason: collision with root package name */
    private final l3.d f14640e = new l3.d();

    /* renamed from: f  reason: collision with root package name */
    private final l3.b f14641f = new l3.b();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, Long> f14643h = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, Long> f14642g = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final long f14639d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    private int f14647l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f14648m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14662a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14663b;

        public a(int i10, int i11) {
            this.f14662a = i10;
            this.f14663b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final s1.m1 f14664a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14665b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14666c;

        public b(s1.m1 m1Var, int i10, String str) {
            this.f14664a = m1Var;
            this.f14665b = i10;
            this.f14666c = str;
        }
    }

    private r1(Context context, PlaybackSession playbackSession) {
        this.f14636a = context.getApplicationContext();
        this.f14638c = playbackSession;
        q1 q1Var = new q1();
        this.f14637b = q1Var;
        q1Var.g(this);
    }

    public static r1 A0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new r1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void B0() {
        PlaybackMetrics.Builder builder = this.f14645j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f14661z);
            this.f14645j.setVideoFramesDropped(this.f14659x);
            this.f14645j.setVideoFramesPlayed(this.f14660y);
            Long l10 = this.f14642g.get(this.f14644i);
            this.f14645j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f14643h.get(this.f14644i);
            this.f14645j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f14645j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f14638c.reportPlaybackMetrics(this.f14645j.build());
        }
        this.f14645j = null;
        this.f14644i = null;
        this.f14661z = 0;
        this.f14659x = 0;
        this.f14660y = 0;
        this.f14653r = null;
        this.f14654s = null;
        this.f14655t = null;
        this.A = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int C0(int i10) {
        switch (p3.m0.U(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static w1.m D0(b5.q<q3.a> qVar) {
        w1.m mVar;
        b5.s0<q3.a> it = qVar.iterator();
        while (it.hasNext()) {
            q3.a next = it.next();
            for (int i10 = 0; i10 < next.f13697n; i10++) {
                if (next.e(i10) && (mVar = next.b(i10).B) != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    private static int E0(w1.m mVar) {
        for (int i10 = 0; i10 < mVar.f15940q; i10++) {
            UUID uuid = mVar.e(i10).f15942o;
            if (uuid.equals(s1.i.f13428d)) {
                return 3;
            }
            if (uuid.equals(s1.i.f13429e)) {
                return 2;
            }
            if (uuid.equals(s1.i.f13427c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a F0(l2 l2Var, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (l2Var.f13537n == 1001) {
            return new a(20, 0);
        }
        if (l2Var instanceof s1.q) {
            s1.q qVar = (s1.q) l2Var;
            z11 = qVar.f13679q == 1;
            i10 = qVar.f13683u;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) p3.a.e(l2Var.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof o.b) {
                return new a(13, p3.m0.V(((o.b) th).f10358q));
            }
            if (th instanceof j2.m) {
                return new a(14, p3.m0.V(((j2.m) th).f10317o));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof t.b) {
                return new a(17, ((t.b) th).f15031n);
            }
            if (th instanceof t.e) {
                return new a(18, ((t.e) th).f15036n);
            }
            if (p3.m0.f12306a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(C0(errorCode), errorCode);
        } else if (th instanceof o3.c0) {
            return new a(5, ((o3.c0) th).f11936q);
        } else {
            if ((th instanceof o3.b0) || (th instanceof h2)) {
                return new a(z10 ? 10 : 11, 0);
            } else if ((th instanceof o3.a0) || (th instanceof q0.a)) {
                if (p3.y.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th.getCause();
                return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th instanceof o3.a0) && ((o3.a0) th).f11929p == 1) ? new a(4, 0) : new a(8, 0);
            } else if (l2Var.f13537n == 1002) {
                return new a(21, 0);
            } else {
                if (!(th instanceof o.a)) {
                    if ((th instanceof y.b) && (th.getCause() instanceof FileNotFoundException)) {
                        Throwable cause2 = ((Throwable) p3.a.e(th.getCause())).getCause();
                        return (p3.m0.f12306a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                    }
                    return new a(9, 0);
                }
                Throwable th2 = (Throwable) p3.a.e(th.getCause());
                int i11 = p3.m0.f12306a;
                if (i11 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
                    return (i11 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th2 instanceof NotProvisionedException)) ? (i11 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof w1.p0 ? new a(23, 0) : th2 instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
                }
                int V = p3.m0.V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                return new a(C0(V), V);
            }
        }
    }

    private static Pair<String, String> G0(String str) {
        String[] P0 = p3.m0.P0(str, "-");
        return Pair.create(P0[0], P0.length >= 2 ? P0[1] : null);
    }

    private static int I0(Context context) {
        switch (p3.y.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int J0(u1 u1Var) {
        u1.h hVar = u1Var.f13763o;
        if (hVar == null) {
            return 0;
        }
        int o02 = p3.m0.o0(hVar.f13827a, hVar.f13828b);
        if (o02 != 0) {
            if (o02 != 1) {
                return o02 != 2 ? 1 : 4;
            }
            return 5;
        }
        return 3;
    }

    private static int K0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 1 : 4;
            }
            return 3;
        }
        return 2;
    }

    private void L0(c.b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            c.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f14637b.a(c10);
            } else if (b10 == 11) {
                this.f14637b.b(c10, this.f14646k);
            } else {
                this.f14637b.e(c10);
            }
        }
    }

    private void M0(long j10) {
        int I0 = I0(this.f14636a);
        if (I0 != this.f14648m) {
            this.f14648m = I0;
            this.f14638c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(I0).setTimeSinceCreatedMillis(j10 - this.f14639d).build());
        }
    }

    private void N0(long j10) {
        l2 l2Var = this.f14649n;
        if (l2Var == null) {
            return;
        }
        a F0 = F0(l2Var, this.f14636a, this.f14657v == 4);
        this.f14638c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f14639d).setErrorCode(F0.f14662a).setSubErrorCode(F0.f14663b).setException(l2Var).build());
        this.A = true;
        this.f14649n = null;
    }

    private void O0(p2 p2Var, c.b bVar, long j10) {
        if (p2Var.r() != 2) {
            this.f14656u = false;
        }
        if (p2Var.g() == null) {
            this.f14658w = false;
        } else if (bVar.a(10)) {
            this.f14658w = true;
        }
        int W0 = W0(p2Var);
        if (this.f14647l != W0) {
            this.f14647l = W0;
            this.A = true;
            this.f14638c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f14647l).setTimeSinceCreatedMillis(j10 - this.f14639d).build());
        }
    }

    private void P0(p2 p2Var, c.b bVar, long j10) {
        if (bVar.a(2)) {
            q3 s10 = p2Var.s();
            boolean c10 = s10.c(2);
            boolean c11 = s10.c(1);
            boolean c12 = s10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    U0(j10, null, 0);
                }
                if (!c11) {
                    Q0(j10, null, 0);
                }
                if (!c12) {
                    S0(j10, null, 0);
                }
            }
        }
        if (z0(this.f14650o)) {
            b bVar2 = this.f14650o;
            s1.m1 m1Var = bVar2.f14664a;
            if (m1Var.E != -1) {
                U0(j10, m1Var, bVar2.f14665b);
                this.f14650o = null;
            }
        }
        if (z0(this.f14651p)) {
            b bVar3 = this.f14651p;
            Q0(j10, bVar3.f14664a, bVar3.f14665b);
            this.f14651p = null;
        }
        if (z0(this.f14652q)) {
            b bVar4 = this.f14652q;
            S0(j10, bVar4.f14664a, bVar4.f14665b);
            this.f14652q = null;
        }
    }

    private void Q0(long j10, s1.m1 m1Var, int i10) {
        if (p3.m0.c(this.f14654s, m1Var)) {
            return;
        }
        if (this.f14654s == null && i10 == 0) {
            i10 = 1;
        }
        this.f14654s = m1Var;
        V0(0, j10, m1Var, i10);
    }

    private void R0(p2 p2Var, c.b bVar) {
        w1.m D0;
        if (bVar.a(0)) {
            c.a c10 = bVar.c(0);
            if (this.f14645j != null) {
                T0(c10.f14498b, c10.f14500d);
            }
        }
        if (bVar.a(2) && this.f14645j != null && (D0 = D0(p2Var.s().b())) != null) {
            ((PlaybackMetrics.Builder) p3.m0.j(this.f14645j)).setDrmType(E0(D0));
        }
        if (bVar.a(1011)) {
            this.f14661z++;
        }
    }

    private void S0(long j10, s1.m1 m1Var, int i10) {
        if (p3.m0.c(this.f14655t, m1Var)) {
            return;
        }
        if (this.f14655t == null && i10 == 0) {
            i10 = 1;
        }
        this.f14655t = m1Var;
        V0(2, j10, m1Var, i10);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void T0(l3 l3Var, u.b bVar) {
        int f10;
        PlaybackMetrics.Builder builder = this.f14645j;
        if (bVar == null || (f10 = l3Var.f(bVar.f15356a)) == -1) {
            return;
        }
        l3Var.j(f10, this.f14641f);
        l3Var.r(this.f14641f.f13544p, this.f14640e);
        builder.setStreamType(J0(this.f14640e.f13555p));
        l3.d dVar = this.f14640e;
        if (dVar.A != -9223372036854775807L && !dVar.f13564y && !dVar.f13561v && !dVar.g()) {
            builder.setMediaDurationMillis(this.f14640e.f());
        }
        builder.setPlaybackType(this.f14640e.g() ? 2 : 1);
        this.A = true;
    }

    private void U0(long j10, s1.m1 m1Var, int i10) {
        if (p3.m0.c(this.f14653r, m1Var)) {
            return;
        }
        if (this.f14653r == null && i10 == 0) {
            i10 = 1;
        }
        this.f14653r = m1Var;
        V0(1, j10, m1Var, i10);
    }

    private void V0(int i10, long j10, s1.m1 m1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f14639d);
        if (m1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(K0(i11));
            String str = m1Var.f13586x;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = m1Var.f13587y;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = m1Var.f13584v;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = m1Var.f13583u;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = m1Var.D;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = m1Var.E;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = m1Var.L;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = m1Var.M;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = m1Var.f13578p;
            if (str4 != null) {
                Pair<String, String> G0 = G0(str4);
                timeSinceCreatedMillis.setLanguage((String) G0.first);
                Object obj = G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = m1Var.F;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f14638c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int W0(p2 p2Var) {
        int r10 = p2Var.r();
        if (this.f14656u) {
            return 5;
        }
        if (this.f14658w) {
            return 13;
        }
        if (r10 == 4) {
            return 11;
        }
        if (r10 == 2) {
            int i10 = this.f14647l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (p2Var.p()) {
                return p2Var.C() != 0 ? 10 : 6;
            }
            return 7;
        } else if (r10 == 3) {
            if (p2Var.p()) {
                return p2Var.C() != 0 ? 9 : 3;
            }
            return 4;
        } else if (r10 != 1 || this.f14647l == 0) {
            return this.f14647l;
        } else {
            return 12;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean z0(b bVar) {
        return bVar != null && bVar.f14666c.equals(this.f14637b.c());
    }

    @Override // t1.c
    public /* synthetic */ void A(c.a aVar, boolean z10) {
        t1.b.D(this, aVar, z10);
    }

    @Override // t1.c
    public /* synthetic */ void B(c.a aVar, int i10) {
        t1.b.V(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void C(c.a aVar, int i10) {
        t1.b.T(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void D(c.a aVar) {
        t1.b.x(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void E(c.a aVar, int i10, boolean z10) {
        t1.b.u(this, aVar, i10, z10);
    }

    @Override // t1.c
    public /* synthetic */ void F(c.a aVar, float f10) {
        t1.b.m0(this, aVar, f10);
    }

    @Override // t1.c
    public /* synthetic */ void G(c.a aVar, Exception exc) {
        t1.b.d0(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void H(c.a aVar, int i10) {
        t1.b.O(this, aVar, i10);
    }

    public LogSessionId H0() {
        return this.f14638c.getSessionId();
    }

    @Override // t1.c
    public /* synthetic */ void I(c.a aVar, List list) {
        t1.b.o(this, aVar, list);
    }

    @Override // t1.c
    public void J(c.a aVar, l2 l2Var) {
        this.f14649n = l2Var;
    }

    @Override // t1.c
    public void K(c.a aVar, u2.n nVar, u2.q qVar, IOException iOException, boolean z10) {
        this.f14657v = qVar.f15335a;
    }

    @Override // t1.c
    public /* synthetic */ void L(c.a aVar, s1.m1 m1Var, v1.i iVar) {
        t1.b.k0(this, aVar, m1Var, iVar);
    }

    @Override // t1.c
    public /* synthetic */ void M(c.a aVar, boolean z10) {
        t1.b.Y(this, aVar, z10);
    }

    @Override // t1.c
    public void N(p2 p2Var, c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        L0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        R0(p2Var, bVar);
        N0(elapsedRealtime);
        P0(p2Var, bVar, elapsedRealtime);
        M0(elapsedRealtime);
        O0(p2Var, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.f14637b.f(bVar.c(1028));
        }
    }

    @Override // t1.c
    public /* synthetic */ void O(c.a aVar) {
        t1.b.W(this, aVar);
    }

    @Override // t1.s1.a
    public void P(c.a aVar, String str, String str2) {
    }

    @Override // t1.s1.a
    public void Q(c.a aVar, String str) {
        u.b bVar = aVar.f14500d;
        if (bVar == null || !bVar.b()) {
            B0();
            this.f14644i = str;
            this.f14645j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            T0(aVar.f14498b, aVar.f14500d);
        }
    }

    @Override // t1.s1.a
    public void R(c.a aVar, String str, boolean z10) {
        u.b bVar = aVar.f14500d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f14644i)) {
            B0();
        }
        this.f14642g.remove(str);
        this.f14643h.remove(str);
    }

    @Override // t1.s1.a
    public void S(c.a aVar, String str) {
    }

    @Override // t1.c
    public /* synthetic */ void T(c.a aVar, s1.m1 m1Var, v1.i iVar) {
        t1.b.i(this, aVar, m1Var, iVar);
    }

    @Override // t1.c
    public /* synthetic */ void U(c.a aVar, Exception exc) {
        t1.b.b(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void V(c.a aVar, int i10, long j10, long j11) {
        t1.b.l(this, aVar, i10, j10, j11);
    }

    @Override // t1.c
    public /* synthetic */ void W(c.a aVar, s1.m1 m1Var) {
        t1.b.j0(this, aVar, m1Var);
    }

    @Override // t1.c
    public /* synthetic */ void X(c.a aVar, int i10, long j10) {
        t1.b.C(this, aVar, i10, j10);
    }

    @Override // t1.c
    public /* synthetic */ void Y(c.a aVar, String str, long j10) {
        t1.b.c(this, aVar, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void Z(c.a aVar, u1 u1Var, int i10) {
        t1.b.J(this, aVar, u1Var, i10);
    }

    @Override // t1.c
    public /* synthetic */ void a(c.a aVar) {
        t1.b.y(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void a0(c.a aVar, boolean z10) {
        t1.b.I(this, aVar, z10);
    }

    @Override // t1.c
    public /* synthetic */ void b(c.a aVar, int i10, s1.m1 m1Var) {
        t1.b.s(this, aVar, i10, m1Var);
    }

    @Override // t1.c
    public /* synthetic */ void b0(c.a aVar, Object obj, long j10) {
        t1.b.U(this, aVar, obj, j10);
    }

    @Override // t1.c
    public /* synthetic */ void c(c.a aVar, long j10, int i10) {
        t1.b.i0(this, aVar, j10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void c0(c.a aVar, boolean z10, int i10) {
        t1.b.M(this, aVar, z10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void d(c.a aVar, String str, long j10) {
        t1.b.e0(this, aVar, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void d0(c.a aVar, int i10, int i11) {
        t1.b.Z(this, aVar, i10, i11);
    }

    @Override // t1.c
    public void e(c.a aVar, q3.z zVar) {
        b bVar = this.f14650o;
        if (bVar != null) {
            s1.m1 m1Var = bVar.f14664a;
            if (m1Var.E == -1) {
                this.f14650o = new b(m1Var.b().j0(zVar.f12694n).Q(zVar.f12695o).E(), bVar.f14665b, bVar.f14666c);
            }
        }
    }

    @Override // t1.c
    public /* synthetic */ void e0(c.a aVar) {
        t1.b.X(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void f(c.a aVar) {
        t1.b.B(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void f0(c.a aVar, int i10, int i11, int i12, float f10) {
        t1.b.l0(this, aVar, i10, i11, i12, f10);
    }

    @Override // t1.c
    public /* synthetic */ void g(c.a aVar, u2.q qVar) {
        t1.b.c0(this, aVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void g0(c.a aVar, s1.o oVar) {
        t1.b.t(this, aVar, oVar);
    }

    @Override // t1.c
    public void h(c.a aVar, int i10, long j10, long j11) {
        u.b bVar = aVar.f14500d;
        if (bVar != null) {
            String d10 = this.f14637b.d(aVar.f14498b, (u.b) p3.a.e(bVar));
            Long l10 = this.f14643h.get(d10);
            Long l11 = this.f14642g.get(d10);
            this.f14643h.put(d10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f14642g.put(d10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // t1.c
    public /* synthetic */ void h0(c.a aVar, String str) {
        t1.b.e(this, aVar, str);
    }

    @Override // t1.c
    public void i(c.a aVar, u2.q qVar) {
        if (aVar.f14500d == null) {
            return;
        }
        b bVar = new b((s1.m1) p3.a.e(qVar.f15337c), qVar.f15338d, this.f14637b.d(aVar.f14498b, (u.b) p3.a.e(aVar.f14500d)));
        int i10 = qVar.f15336b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f14651p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f14652q = bVar;
                return;
            }
        }
        this.f14650o = bVar;
    }

    @Override // t1.c
    public /* synthetic */ void i0(c.a aVar, boolean z10, int i10) {
        t1.b.S(this, aVar, z10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void j(c.a aVar, v1.e eVar) {
        t1.b.f(this, aVar, eVar);
    }

    @Override // t1.c
    public void j0(c.a aVar, p2.e eVar, p2.e eVar2, int i10) {
        if (i10 == 1) {
            this.f14656u = true;
        }
        this.f14646k = i10;
    }

    @Override // t1.c
    public /* synthetic */ void k(c.a aVar, o2 o2Var) {
        t1.b.N(this, aVar, o2Var);
    }

    @Override // t1.c
    public /* synthetic */ void k0(c.a aVar, int i10) {
        t1.b.z(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void l(c.a aVar) {
        t1.b.w(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void l0(c.a aVar, int i10, v1.e eVar) {
        t1.b.q(this, aVar, i10, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void m(c.a aVar, String str, long j10, long j11) {
        t1.b.f0(this, aVar, str, j10, j11);
    }

    @Override // t1.c
    public /* synthetic */ void m0(c.a aVar) {
        t1.b.v(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void n(c.a aVar, int i10, v1.e eVar) {
        t1.b.p(this, aVar, i10, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void n0(c.a aVar, boolean z10) {
        t1.b.E(this, aVar, z10);
    }

    @Override // t1.c
    public void o(c.a aVar, v1.e eVar) {
        this.f14659x += eVar.f15529g;
        this.f14660y += eVar.f15527e;
    }

    @Override // t1.c
    public /* synthetic */ void o0(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.H(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void p(c.a aVar, s1.m1 m1Var) {
        t1.b.h(this, aVar, m1Var);
    }

    @Override // t1.c
    public /* synthetic */ void p0(c.a aVar, Exception exc) {
        t1.b.A(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void q(c.a aVar, int i10, String str, long j10) {
        t1.b.r(this, aVar, i10, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void q0(c.a aVar, v1.e eVar) {
        t1.b.h0(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void r(c.a aVar, q3 q3Var) {
        t1.b.b0(this, aVar, q3Var);
    }

    @Override // t1.c
    public /* synthetic */ void r0(c.a aVar, int i10) {
        t1.b.P(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void s(c.a aVar, l2 l2Var) {
        t1.b.Q(this, aVar, l2Var);
    }

    @Override // t1.c
    public /* synthetic */ void s0(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.G(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void t(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.F(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void t0(c.a aVar, String str) {
        t1.b.g0(this, aVar, str);
    }

    @Override // t1.c
    public /* synthetic */ void u(c.a aVar, long j10) {
        t1.b.j(this, aVar, j10);
    }

    @Override // t1.c
    public /* synthetic */ void u0(c.a aVar, int i10) {
        t1.b.a0(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void v(c.a aVar, Exception exc) {
        t1.b.k(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void v0(c.a aVar, k2.a aVar2) {
        t1.b.L(this, aVar, aVar2);
    }

    @Override // t1.c
    public /* synthetic */ void w(c.a aVar, z1 z1Var) {
        t1.b.K(this, aVar, z1Var);
    }

    @Override // t1.c
    public /* synthetic */ void w0(c.a aVar, u1.e eVar) {
        t1.b.a(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void x(c.a aVar, v1.e eVar) {
        t1.b.g(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void x0(c.a aVar, d3.e eVar) {
        t1.b.n(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void y(c.a aVar, p2.b bVar) {
        t1.b.m(this, aVar, bVar);
    }

    @Override // t1.c
    public /* synthetic */ void y0(c.a aVar) {
        t1.b.R(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void z(c.a aVar, String str, long j10, long j11) {
        t1.b.d(this, aVar, str, j10, j11);
    }
}
