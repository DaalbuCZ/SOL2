package u1;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.m1;
import s1.o2;
import t1.t1;
import u1.a0;
import u1.g;
import u1.t;
import u1.v;
/* loaded from: classes.dex */
public final class z implements t {

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f15087c0 = false;
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private u1.g[] K;
    private ByteBuffer[] L;
    private ByteBuffer M;
    private int N;
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private w X;
    private boolean Y;
    private long Z;

    /* renamed from: a  reason: collision with root package name */
    private final u1.f f15088a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f15089a0;

    /* renamed from: b  reason: collision with root package name */
    private final c f15090b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f15091b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15092c;

    /* renamed from: d  reason: collision with root package name */
    private final y f15093d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f15094e;

    /* renamed from: f  reason: collision with root package name */
    private final u1.g[] f15095f;

    /* renamed from: g  reason: collision with root package name */
    private final u1.g[] f15096g;

    /* renamed from: h  reason: collision with root package name */
    private final p3.g f15097h;

    /* renamed from: i  reason: collision with root package name */
    private final v f15098i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<i> f15099j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f15100k;

    /* renamed from: l  reason: collision with root package name */
    private final int f15101l;

    /* renamed from: m  reason: collision with root package name */
    private l f15102m;

    /* renamed from: n  reason: collision with root package name */
    private final j<t.b> f15103n;

    /* renamed from: o  reason: collision with root package name */
    private final j<t.e> f15104o;

    /* renamed from: p  reason: collision with root package name */
    private final d f15105p;

    /* renamed from: q  reason: collision with root package name */
    private t1 f15106q;

    /* renamed from: r  reason: collision with root package name */
    private t.c f15107r;

    /* renamed from: s  reason: collision with root package name */
    private f f15108s;

    /* renamed from: t  reason: collision with root package name */
    private f f15109t;

    /* renamed from: u  reason: collision with root package name */
    private AudioTrack f15110u;

    /* renamed from: v  reason: collision with root package name */
    private u1.e f15111v;

    /* renamed from: w  reason: collision with root package name */
    private i f15112w;

    /* renamed from: x  reason: collision with root package name */
    private i f15113x;

    /* renamed from: y  reason: collision with root package name */
    private o2 f15114y;

    /* renamed from: z  reason: collision with root package name */
    private ByteBuffer f15115z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ AudioTrack f15116n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f15116n = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f15116n.flush();
                this.f15116n.release();
            } finally {
                z.this.f15097h.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, t1 t1Var) {
            LogSessionId a10 = t1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        long a();

        boolean b(boolean z10);

        long c(long j10);

        u1.g[] d();

        o2 e(o2 o2Var);
    }

    /* loaded from: classes.dex */
    interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f15118a = new a0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: b  reason: collision with root package name */
        private c f15120b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15121c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15122d;

        /* renamed from: a  reason: collision with root package name */
        private u1.f f15119a = u1.f.f14935c;

        /* renamed from: e  reason: collision with root package name */
        private int f15123e = 0;

        /* renamed from: f  reason: collision with root package name */
        d f15124f = d.f15118a;

        public z f() {
            if (this.f15120b == null) {
                this.f15120b = new g(new u1.g[0]);
            }
            return new z(this, null);
        }

        public e g(u1.f fVar) {
            p3.a.e(fVar);
            this.f15119a = fVar;
            return this;
        }

        public e h(boolean z10) {
            this.f15122d = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f15121c = z10;
            return this;
        }

        public e j(int i10) {
            this.f15123e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f15125a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15126b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15127c;

        /* renamed from: d  reason: collision with root package name */
        public final int f15128d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15129e;

        /* renamed from: f  reason: collision with root package name */
        public final int f15130f;

        /* renamed from: g  reason: collision with root package name */
        public final int f15131g;

        /* renamed from: h  reason: collision with root package name */
        public final int f15132h;

        /* renamed from: i  reason: collision with root package name */
        public final u1.g[] f15133i;

        public f(m1 m1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, u1.g[] gVarArr) {
            this.f15125a = m1Var;
            this.f15126b = i10;
            this.f15127c = i11;
            this.f15128d = i12;
            this.f15129e = i13;
            this.f15130f = i14;
            this.f15131g = i15;
            this.f15132h = i16;
            this.f15133i = gVarArr;
        }

        private AudioTrack d(boolean z10, u1.e eVar, int i10) {
            int i11 = m0.f12306a;
            return i11 >= 29 ? f(z10, eVar, i10) : i11 >= 21 ? e(z10, eVar, i10) : g(eVar, i10);
        }

        private AudioTrack e(boolean z10, u1.e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), z.N(this.f15129e, this.f15130f, this.f15131g), this.f15132h, 1, i10);
        }

        private AudioTrack f(boolean z10, u1.e eVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(eVar, z10)).setAudioFormat(z.N(this.f15129e, this.f15130f, this.f15131g)).setTransferMode(1).setBufferSizeInBytes(this.f15132h).setSessionId(i10).setOffloadedPlayback(this.f15127c == 1).build();
        }

        private AudioTrack g(u1.e eVar, int i10) {
            int f02 = m0.f0(eVar.f14911p);
            int i11 = this.f15129e;
            int i12 = this.f15130f;
            int i13 = this.f15131g;
            int i14 = this.f15132h;
            return i10 == 0 ? new AudioTrack(f02, i11, i12, i13, i14, 1) : new AudioTrack(f02, i11, i12, i13, i14, 1, i10);
        }

        private static AudioAttributes i(u1.e eVar, boolean z10) {
            return z10 ? j() : eVar.b().f14915a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, u1.e eVar, int i10) {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new t.b(state, this.f15129e, this.f15130f, this.f15132h, this.f15125a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new t.b(0, this.f15129e, this.f15130f, this.f15132h, this.f15125a, l(), e10);
            }
        }

        public boolean b(f fVar) {
            return fVar.f15127c == this.f15127c && fVar.f15131g == this.f15131g && fVar.f15129e == this.f15129e && fVar.f15130f == this.f15130f && fVar.f15128d == this.f15128d;
        }

        public f c(int i10) {
            return new f(this.f15125a, this.f15126b, this.f15127c, this.f15128d, this.f15129e, this.f15130f, this.f15131g, i10, this.f15133i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f15129e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f15125a.M;
        }

        public boolean l() {
            return this.f15127c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements c {

        /* renamed from: a  reason: collision with root package name */
        private final u1.g[] f15134a;

        /* renamed from: b  reason: collision with root package name */
        private final h0 f15135b;

        /* renamed from: c  reason: collision with root package name */
        private final j0 f15136c;

        public g(u1.g... gVarArr) {
            this(gVarArr, new h0(), new j0());
        }

        public g(u1.g[] gVarArr, h0 h0Var, j0 j0Var) {
            u1.g[] gVarArr2 = new u1.g[gVarArr.length + 2];
            this.f15134a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f15135b = h0Var;
            this.f15136c = j0Var;
            gVarArr2[gVarArr.length] = h0Var;
            gVarArr2[gVarArr.length + 1] = j0Var;
        }

        @Override // u1.z.c
        public long a() {
            return this.f15135b.q();
        }

        @Override // u1.z.c
        public boolean b(boolean z10) {
            this.f15135b.w(z10);
            return z10;
        }

        @Override // u1.z.c
        public long c(long j10) {
            return this.f15136c.h(j10);
        }

        @Override // u1.z.c
        public u1.g[] d() {
            return this.f15134a;
        }

        @Override // u1.z.c
        public o2 e(o2 o2Var) {
            this.f15136c.j(o2Var.f13650n);
            this.f15136c.i(o2Var.f13651o);
            return o2Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        private h(String str) {
            super(str);
        }

        /* synthetic */ h(String str, a aVar) {
            this(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final o2 f15137a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15138b;

        /* renamed from: c  reason: collision with root package name */
        public final long f15139c;

        /* renamed from: d  reason: collision with root package name */
        public final long f15140d;

        private i(o2 o2Var, boolean z10, long j10, long j11) {
            this.f15137a = o2Var;
            this.f15138b = z10;
            this.f15139c = j10;
            this.f15140d = j11;
        }

        /* synthetic */ i(o2 o2Var, boolean z10, long j10, long j11, a aVar) {
            this(o2Var, z10, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class j<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f15141a;

        /* renamed from: b  reason: collision with root package name */
        private T f15142b;

        /* renamed from: c  reason: collision with root package name */
        private long f15143c;

        public j(long j10) {
            this.f15141a = j10;
        }

        public void a() {
            this.f15142b = null;
        }

        public void b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f15142b == null) {
                this.f15142b = t10;
                this.f15143c = this.f15141a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f15143c) {
                T t11 = this.f15142b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f15142b;
                a();
                throw t12;
            }
        }
    }

    /* loaded from: classes.dex */
    private final class k implements v.a {
        private k() {
        }

        /* synthetic */ k(z zVar, a aVar) {
            this();
        }

        @Override // u1.v.a
        public void a(long j10) {
            if (z.this.f15107r != null) {
                z.this.f15107r.a(j10);
            }
        }

        @Override // u1.v.a
        public void b(int i10, long j10) {
            if (z.this.f15107r != null) {
                z.this.f15107r.g(i10, j10, SystemClock.elapsedRealtime() - z.this.Z);
            }
        }

        @Override // u1.v.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + z.this.U() + ", " + z.this.V();
            if (z.f15087c0) {
                throw new h(str, null);
            }
            p3.r.i("DefaultAudioSink", str);
        }

        @Override // u1.v.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + z.this.U() + ", " + z.this.V();
            if (z.f15087c0) {
                throw new h(str, null);
            }
            p3.r.i("DefaultAudioSink", str);
        }

        @Override // u1.v.a
        public void e(long j10) {
            p3.r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class l {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f15145a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f15146b;

        /* loaded from: classes.dex */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z f15148a;

            a(z zVar) {
                this.f15148a = zVar;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                p3.a.f(audioTrack == z.this.f15110u);
                if (z.this.f15107r == null || !z.this.U) {
                    return;
                }
                z.this.f15107r.f();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                p3.a.f(audioTrack == z.this.f15110u);
                if (z.this.f15107r == null || !z.this.U) {
                    return;
                }
                z.this.f15107r.f();
            }
        }

        public l() {
            this.f15146b = new a(z.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f15145a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new n3.p(handler), this.f15146b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f15146b);
            this.f15145a.removeCallbacksAndMessages(null);
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private z(e eVar) {
        this.f15088a = eVar.f15119a;
        c cVar = eVar.f15120b;
        this.f15090b = cVar;
        int i10 = m0.f12306a;
        this.f15092c = i10 >= 21 && eVar.f15121c;
        this.f15100k = i10 >= 23 && eVar.f15122d;
        this.f15101l = i10 >= 29 ? eVar.f15123e : 0;
        this.f15105p = eVar.f15124f;
        p3.g gVar = new p3.g(p3.d.f12253a);
        this.f15097h = gVar;
        gVar.e();
        this.f15098i = new v(new k(this, null));
        y yVar = new y();
        this.f15093d = yVar;
        k0 k0Var = new k0();
        this.f15094e = k0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new g0(), yVar, k0Var);
        Collections.addAll(arrayList, cVar.d());
        this.f15095f = (u1.g[]) arrayList.toArray(new u1.g[0]);
        this.f15096g = new u1.g[]{new c0()};
        this.J = 1.0f;
        this.f15111v = u1.e.f14907t;
        this.W = 0;
        this.X = new w(0, 0.0f);
        o2 o2Var = o2.f13648q;
        this.f15113x = new i(o2Var, false, 0L, 0L, null);
        this.f15114y = o2Var;
        this.R = -1;
        this.K = new u1.g[0];
        this.L = new ByteBuffer[0];
        this.f15099j = new ArrayDeque<>();
        this.f15103n = new j<>(100L);
        this.f15104o = new j<>(100L);
    }

    /* synthetic */ z(e eVar, a aVar) {
        this(eVar);
    }

    private void G(long j10) {
        o2 e10 = l0() ? this.f15090b.e(O()) : o2.f13648q;
        boolean b10 = l0() ? this.f15090b.b(T()) : false;
        this.f15099j.add(new i(e10, b10, Math.max(0L, j10), this.f15109t.h(V()), null));
        k0();
        t.c cVar = this.f15107r;
        if (cVar != null) {
            cVar.b(b10);
        }
    }

    private long H(long j10) {
        while (!this.f15099j.isEmpty() && j10 >= this.f15099j.getFirst().f15140d) {
            this.f15113x = this.f15099j.remove();
        }
        i iVar = this.f15113x;
        long j11 = j10 - iVar.f15140d;
        if (iVar.f15137a.equals(o2.f13648q)) {
            return this.f15113x.f15139c + j11;
        }
        if (this.f15099j.isEmpty()) {
            return this.f15113x.f15139c + this.f15090b.c(j11);
        }
        i first = this.f15099j.getFirst();
        return first.f15139c - m0.Z(first.f15140d - j10, this.f15113x.f15137a.f13650n);
    }

    private long I(long j10) {
        return j10 + this.f15109t.h(this.f15090b.a());
    }

    private AudioTrack J(f fVar) {
        try {
            return fVar.a(this.Y, this.f15111v, this.W);
        } catch (t.b e10) {
            t.c cVar = this.f15107r;
            if (cVar != null) {
                cVar.c(e10);
            }
            throw e10;
        }
    }

    private AudioTrack K() {
        try {
            return J((f) p3.a.e(this.f15109t));
        } catch (t.b e10) {
            f fVar = this.f15109t;
            if (fVar.f15132h > 1000000) {
                f c10 = fVar.c(1000000);
                try {
                    AudioTrack J = J(c10);
                    this.f15109t = c10;
                    return J;
                } catch (t.b e11) {
                    e10.addSuppressed(e11);
                    a0();
                    throw e10;
                }
            }
            a0();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean L() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.R
            u1.g[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.c0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.z.L():boolean");
    }

    private void M() {
        int i10 = 0;
        while (true) {
            u1.g[] gVarArr = this.K;
            if (i10 >= gVarArr.length) {
                return;
            }
            u1.g gVar = gVarArr[i10];
            gVar.flush();
            this.L[i10] = gVar.d();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat N(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private o2 O() {
        return R().f15137a;
    }

    private static int P(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        p3.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int Q(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return u1.b.d(byteBuffer);
            case 7:
            case 8:
                return b0.e(byteBuffer);
            case 9:
                int m10 = e0.m(m0.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int a10 = u1.b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return u1.b.h(byteBuffer, a10) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return u1.c.c(byteBuffer);
        }
    }

    private i R() {
        i iVar = this.f15112w;
        return iVar != null ? iVar : !this.f15099j.isEmpty() ? this.f15099j.getLast() : this.f15113x;
    }

    @SuppressLint({"InlinedApi"})
    private int S(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = m0.f12306a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && m0.f12309d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long U() {
        f fVar = this.f15109t;
        return fVar.f15127c == 0 ? this.B / fVar.f15126b : this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        f fVar = this.f15109t;
        return fVar.f15127c == 0 ? this.D / fVar.f15128d : this.E;
    }

    private boolean W() {
        t1 t1Var;
        if (this.f15097h.d()) {
            AudioTrack K = K();
            this.f15110u = K;
            if (Z(K)) {
                d0(this.f15110u);
                if (this.f15101l != 3) {
                    AudioTrack audioTrack = this.f15110u;
                    m1 m1Var = this.f15109t.f15125a;
                    audioTrack.setOffloadDelayPadding(m1Var.O, m1Var.P);
                }
            }
            if (m0.f12306a >= 31 && (t1Var = this.f15106q) != null) {
                b.a(this.f15110u, t1Var);
            }
            this.W = this.f15110u.getAudioSessionId();
            v vVar = this.f15098i;
            AudioTrack audioTrack2 = this.f15110u;
            f fVar = this.f15109t;
            vVar.s(audioTrack2, fVar.f15127c == 2, fVar.f15131g, fVar.f15128d, fVar.f15132h);
            h0();
            int i10 = this.X.f15076a;
            if (i10 != 0) {
                this.f15110u.attachAuxEffect(i10);
                this.f15110u.setAuxEffectSendLevel(this.X.f15077b);
            }
            this.H = true;
            return true;
        }
        return false;
    }

    private static boolean X(int i10) {
        return (m0.f12306a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean Y() {
        return this.f15110u != null;
    }

    private static boolean Z(AudioTrack audioTrack) {
        return m0.f12306a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void a0() {
        if (this.f15109t.l()) {
            this.f15089a0 = true;
        }
    }

    private void b0() {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f15098i.g(V());
        this.f15110u.stop();
        this.A = 0;
    }

    private void c0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = u1.g.f14941a;
                }
            }
            if (i10 == length) {
                o0(byteBuffer, j10);
            } else {
                u1.g gVar = this.K[i10];
                if (i10 > this.R) {
                    gVar.f(byteBuffer);
                }
                ByteBuffer d10 = gVar.d();
                this.L[i10] = d10;
                if (d10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.f15102m == null) {
            this.f15102m = new l();
        }
        this.f15102m.a(audioTrack);
    }

    private void e0() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.f15091b0 = false;
        this.F = 0;
        this.f15113x = new i(O(), T(), 0L, 0L, null);
        this.I = 0L;
        this.f15112w = null;
        this.f15099j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f15115z = null;
        this.A = 0;
        this.f15094e.o();
        M();
    }

    private void f0(o2 o2Var, boolean z10) {
        i R = R();
        if (o2Var.equals(R.f15137a) && z10 == R.f15138b) {
            return;
        }
        i iVar = new i(o2Var, z10, -9223372036854775807L, -9223372036854775807L, null);
        if (Y()) {
            this.f15112w = iVar;
        } else {
            this.f15113x = iVar;
        }
    }

    private void g0(o2 o2Var) {
        if (Y()) {
            try {
                this.f15110u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o2Var.f13650n).setPitch(o2Var.f13651o).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p3.r.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            o2Var = new o2(this.f15110u.getPlaybackParams().getSpeed(), this.f15110u.getPlaybackParams().getPitch());
            this.f15098i.t(o2Var.f13650n);
        }
        this.f15114y = o2Var;
    }

    private void h0() {
        if (Y()) {
            if (m0.f12306a >= 21) {
                i0(this.f15110u, this.J);
            } else {
                j0(this.f15110u, this.J);
            }
        }
    }

    private static void i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void k0() {
        u1.g[] gVarArr = this.f15109t.f15133i;
        ArrayList arrayList = new ArrayList();
        for (u1.g gVar : gVarArr) {
            if (gVar.a()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (u1.g[]) arrayList.toArray(new u1.g[size]);
        this.L = new ByteBuffer[size];
        M();
    }

    private boolean l0() {
        return (this.Y || !"audio/raw".equals(this.f15109t.f15125a.f13587y) || m0(this.f15109t.f15125a.N)) ? false : true;
    }

    private boolean m0(int i10) {
        return this.f15092c && m0.r0(i10);
    }

    private boolean n0(m1 m1Var, u1.e eVar) {
        int f10;
        int G;
        int S;
        if (m0.f12306a < 29 || this.f15101l == 0 || (f10 = p3.v.f((String) p3.a.e(m1Var.f13587y), m1Var.f13584v)) == 0 || (G = m0.G(m1Var.L)) == 0 || (S = S(N(m1Var.M, G, f10), eVar.b().f14915a)) == 0) {
            return false;
        }
        if (S == 1) {
            return ((m1Var.O != 0 || m1Var.P != 0) && (this.f15101l == 1)) ? false : true;
        } else if (S == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void o0(ByteBuffer byteBuffer, long j10) {
        int p02;
        t.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                p3.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (m0.f12306a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (m0.f12306a < 21) {
                int c10 = this.f15098i.c(this.D);
                if (c10 > 0) {
                    p02 = this.f15110u.write(this.P, this.Q, Math.min(remaining2, c10));
                    if (p02 > 0) {
                        this.Q += p02;
                        byteBuffer.position(byteBuffer.position() + p02);
                    }
                } else {
                    p02 = 0;
                }
            } else if (this.Y) {
                p3.a.f(j10 != -9223372036854775807L);
                p02 = q0(this.f15110u, byteBuffer, remaining2, j10);
            } else {
                p02 = p0(this.f15110u, byteBuffer, remaining2);
            }
            this.Z = SystemClock.elapsedRealtime();
            if (p02 < 0) {
                boolean X = X(p02);
                if (X) {
                    a0();
                }
                t.e eVar = new t.e(p02, this.f15109t.f15125a, X);
                t.c cVar2 = this.f15107r;
                if (cVar2 != null) {
                    cVar2.c(eVar);
                }
                if (eVar.f15037o) {
                    throw eVar;
                }
                this.f15104o.b(eVar);
                return;
            }
            this.f15104o.a();
            if (Z(this.f15110u)) {
                if (this.E > 0) {
                    this.f15091b0 = false;
                }
                if (this.U && (cVar = this.f15107r) != null && p02 < remaining2 && !this.f15091b0) {
                    cVar.e();
                }
            }
            int i10 = this.f15109t.f15127c;
            if (i10 == 0) {
                this.D += p02;
            }
            if (p02 == remaining2) {
                if (i10 != 0) {
                    p3.a.f(byteBuffer == this.M);
                    this.E += this.F * this.N;
                }
                this.O = null;
            }
        }
    }

    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (m0.f12306a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f15115z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f15115z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f15115z.putInt(1431633921);
        }
        if (this.A == 0) {
            this.f15115z.putInt(4, i10);
            this.f15115z.putLong(8, j10 * 1000);
            this.f15115z.position(0);
            this.A = i10;
        }
        int remaining = this.f15115z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f15115z, remaining, 1);
            if (write < 0) {
                this.A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int p02 = p0(audioTrack, byteBuffer, i10);
        if (p02 < 0) {
            this.A = 0;
            return p02;
        }
        this.A -= p02;
        return p02;
    }

    public boolean T() {
        return R().f15138b;
    }

    @Override // u1.t
    public boolean a(m1 m1Var) {
        return x(m1Var) != 0;
    }

    @Override // u1.t
    public boolean b() {
        return !Y() || (this.S && !k());
    }

    @Override // u1.t
    public void c() {
        flush();
        for (u1.g gVar : this.f15095f) {
            gVar.c();
        }
        for (u1.g gVar2 : this.f15096g) {
            gVar2.c();
        }
        this.U = false;
        this.f15089a0 = false;
    }

    @Override // u1.t
    public void d(o2 o2Var) {
        o2 o2Var2 = new o2(m0.p(o2Var.f13650n, 0.1f, 8.0f), m0.p(o2Var.f13651o, 0.1f, 8.0f));
        if (!this.f15100k || m0.f12306a < 23) {
            f0(o2Var2, T());
        } else {
            g0(o2Var2);
        }
    }

    @Override // u1.t
    public void e() {
        this.U = false;
        if (Y() && this.f15098i.p()) {
            this.f15110u.pause();
        }
    }

    @Override // u1.t
    public void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            h0();
        }
    }

    @Override // u1.t
    public void flush() {
        if (Y()) {
            e0();
            if (this.f15098i.i()) {
                this.f15110u.pause();
            }
            if (Z(this.f15110u)) {
                ((l) p3.a.e(this.f15102m)).b(this.f15110u);
            }
            AudioTrack audioTrack = this.f15110u;
            this.f15110u = null;
            if (m0.f12306a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f15108s;
            if (fVar != null) {
                this.f15109t = fVar;
                this.f15108s = null;
            }
            this.f15098i.q();
            this.f15097h.c();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f15104o.a();
        this.f15103n.a();
    }

    @Override // u1.t
    public void g(t.c cVar) {
        this.f15107r = cVar;
    }

    @Override // u1.t
    public void h() {
        p3.a.f(m0.f12306a >= 21);
        p3.a.f(this.V);
        if (this.Y) {
            return;
        }
        this.Y = true;
        flush();
    }

    @Override // u1.t
    public void i() {
        if (!this.S && Y() && L()) {
            b0();
            this.S = true;
        }
    }

    @Override // u1.t
    public o2 j() {
        return this.f15100k ? this.f15114y : O();
    }

    @Override // u1.t
    public boolean k() {
        return Y() && this.f15098i.h(V());
    }

    @Override // u1.t
    public void l(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.V = i10 != 0;
            flush();
        }
    }

    @Override // u1.t
    public void m(m1 m1Var, int i10, int[] iArr) {
        u1.g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int intValue;
        int i15;
        int i16;
        int a10;
        int[] iArr2;
        if ("audio/raw".equals(m1Var.f13587y)) {
            p3.a.a(m0.s0(m1Var.N));
            i11 = m0.d0(m1Var.N, m1Var.L);
            u1.g[] gVarArr2 = m0(m1Var.N) ? this.f15096g : this.f15095f;
            this.f15094e.p(m1Var.O, m1Var.P);
            if (m0.f12306a < 21 && m1Var.L == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f15093d.n(iArr2);
            g.a aVar = new g.a(m1Var.M, m1Var.L, m1Var.N);
            for (u1.g gVar : gVarArr2) {
                try {
                    g.a g10 = gVar.g(aVar);
                    if (gVar.a()) {
                        aVar = g10;
                    }
                } catch (g.b e10) {
                    throw new t.a(e10, m1Var);
                }
            }
            int i18 = aVar.f14945c;
            int i19 = aVar.f14943a;
            int G = m0.G(aVar.f14944b);
            gVarArr = gVarArr2;
            i14 = 0;
            i12 = m0.d0(i18, aVar.f14944b);
            i15 = i18;
            i13 = i19;
            intValue = G;
        } else {
            u1.g[] gVarArr3 = new u1.g[0];
            int i20 = m1Var.M;
            if (n0(m1Var, this.f15111v)) {
                gVarArr = gVarArr3;
                i11 = -1;
                i12 = -1;
                i13 = i20;
                i15 = p3.v.f((String) p3.a.e(m1Var.f13587y), m1Var.f13584v);
                intValue = m0.G(m1Var.L);
                i14 = 1;
            } else {
                Pair<Integer, Integer> f10 = this.f15088a.f(m1Var);
                if (f10 == null) {
                    throw new t.a("Unable to configure passthrough for: " + m1Var, m1Var);
                }
                int intValue2 = ((Integer) f10.first).intValue();
                gVarArr = gVarArr3;
                i11 = -1;
                i12 = -1;
                i13 = i20;
                i14 = 2;
                intValue = ((Integer) f10.second).intValue();
                i15 = intValue2;
            }
        }
        if (i10 != 0) {
            a10 = i10;
            i16 = i15;
        } else {
            i16 = i15;
            a10 = this.f15105p.a(P(i13, intValue, i15), i15, i14, i12, i13, this.f15100k ? 8.0d : 1.0d);
        }
        if (i16 == 0) {
            throw new t.a("Invalid output encoding (mode=" + i14 + ") for: " + m1Var, m1Var);
        } else if (intValue == 0) {
            throw new t.a("Invalid output channel config (mode=" + i14 + ") for: " + m1Var, m1Var);
        } else {
            this.f15089a0 = false;
            f fVar = new f(m1Var, i11, i14, i12, i13, intValue, i16, a10, gVarArr);
            if (Y()) {
                this.f15108s = fVar;
            } else {
                this.f15109t = fVar;
            }
        }
    }

    @Override // u1.t
    public void n(t1 t1Var) {
        this.f15106q = t1Var;
    }

    @Override // u1.t
    public void o() {
        this.U = true;
        if (Y()) {
            this.f15098i.u();
            this.f15110u.play();
        }
    }

    @Override // u1.t
    public boolean p(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.M;
        p3.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f15108s != null) {
            if (!L()) {
                return false;
            }
            if (this.f15108s.b(this.f15109t)) {
                this.f15109t = this.f15108s;
                this.f15108s = null;
                if (Z(this.f15110u) && this.f15101l != 3) {
                    if (this.f15110u.getPlayState() == 3) {
                        this.f15110u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f15110u;
                    m1 m1Var = this.f15109t.f15125a;
                    audioTrack.setOffloadDelayPadding(m1Var.O, m1Var.P);
                    this.f15091b0 = true;
                }
            } else {
                b0();
                if (k()) {
                    return false;
                }
                flush();
            }
            G(j10);
        }
        if (!Y()) {
            try {
                if (!W()) {
                    return false;
                }
            } catch (t.b e10) {
                if (e10.f15032o) {
                    throw e10;
                }
                this.f15103n.b(e10);
                return false;
            }
        }
        this.f15103n.a();
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.f15100k && m0.f12306a >= 23) {
                g0(this.f15114y);
            }
            G(j10);
            if (this.U) {
                o();
            }
        }
        if (this.f15098i.k(V())) {
            if (this.M == null) {
                p3.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                f fVar = this.f15109t;
                if (fVar.f15127c != 0 && this.F == 0) {
                    int Q = Q(fVar.f15131g, byteBuffer);
                    this.F = Q;
                    if (Q == 0) {
                        return true;
                    }
                }
                if (this.f15112w != null) {
                    if (!L()) {
                        return false;
                    }
                    G(j10);
                    this.f15112w = null;
                }
                long k10 = this.I + this.f15109t.k(U() - this.f15094e.n());
                if (!this.G && Math.abs(k10 - j10) > 200000) {
                    this.f15107r.c(new t.d(j10, k10));
                    this.G = true;
                }
                if (this.G) {
                    if (!L()) {
                        return false;
                    }
                    long j11 = j10 - k10;
                    this.I += j11;
                    this.G = false;
                    G(j10);
                    t.c cVar = this.f15107r;
                    if (cVar != null && j11 != 0) {
                        cVar.d();
                    }
                }
                if (this.f15109t.f15127c == 0) {
                    this.B += byteBuffer.remaining();
                } else {
                    this.C += this.F * i10;
                }
                this.M = byteBuffer;
                this.N = i10;
            }
            c0(j10);
            if (!this.M.hasRemaining()) {
                this.M = null;
                this.N = 0;
                return true;
            } else if (this.f15098i.j(V())) {
                p3.r.i("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // u1.t
    public long q(boolean z10) {
        if (!Y() || this.H) {
            return Long.MIN_VALUE;
        }
        return I(H(Math.min(this.f15098i.d(z10), this.f15109t.h(V()))));
    }

    @Override // u1.t
    public void r(w wVar) {
        if (this.X.equals(wVar)) {
            return;
        }
        int i10 = wVar.f15076a;
        float f10 = wVar.f15077b;
        AudioTrack audioTrack = this.f15110u;
        if (audioTrack != null) {
            if (this.X.f15076a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f15110u.setAuxEffectSendLevel(f10);
            }
        }
        this.X = wVar;
    }

    @Override // u1.t
    public void s() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    @Override // u1.t
    public void t(u1.e eVar) {
        if (this.f15111v.equals(eVar)) {
            return;
        }
        this.f15111v = eVar;
        if (this.Y) {
            return;
        }
        flush();
    }

    @Override // u1.t
    public void u() {
        if (m0.f12306a < 25) {
            flush();
            return;
        }
        this.f15104o.a();
        this.f15103n.a();
        if (Y()) {
            e0();
            if (this.f15098i.i()) {
                this.f15110u.pause();
            }
            this.f15110u.flush();
            this.f15098i.q();
            v vVar = this.f15098i;
            AudioTrack audioTrack = this.f15110u;
            f fVar = this.f15109t;
            vVar.s(audioTrack, fVar.f15127c == 2, fVar.f15131g, fVar.f15128d, fVar.f15132h);
            this.H = true;
        }
    }

    @Override // u1.t
    public void v(boolean z10) {
        f0(O(), z10);
    }

    @Override // u1.t
    public void w() {
        this.G = true;
    }

    @Override // u1.t
    public int x(m1 m1Var) {
        if (!"audio/raw".equals(m1Var.f13587y)) {
            return ((this.f15089a0 || !n0(m1Var, this.f15111v)) && !this.f15088a.h(m1Var)) ? 0 : 2;
        } else if (m0.s0(m1Var.N)) {
            int i10 = m1Var.N;
            return (i10 == 2 || (this.f15092c && i10 == 4)) ? 2 : 1;
        } else {
            p3.r.i("DefaultAudioSink", "Invalid PCM encoding: " + m1Var.N);
            return 0;
        }
    }
}
