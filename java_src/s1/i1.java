package s1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import b5.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.a;
import n3.c0;
import s1.g2;
import s1.l;
import s1.l3;
import s1.t2;
import s1.u1;
import s1.y2;
import u2.r;
import u2.u;
import w1.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 implements Handler.Callback, r.a, c0.a, g2.d, l.a, t2.a {
    private final boolean A;
    private final l B;
    private final ArrayList<d> C;
    private final p3.d D;
    private final f E;
    private final d2 F;
    private final g2 G;
    private final r1 H;
    private final long I;
    private d3 J;
    private m2 K;
    private e L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private h X;
    private long Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f13431a0;

    /* renamed from: b0  reason: collision with root package name */
    private q f13432b0;

    /* renamed from: c0  reason: collision with root package name */
    private long f13433c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f13434d0 = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final y2[] f13435n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<y2> f13436o;

    /* renamed from: p  reason: collision with root package name */
    private final a3[] f13437p;

    /* renamed from: q  reason: collision with root package name */
    private final n3.c0 f13438q;

    /* renamed from: r  reason: collision with root package name */
    private final n3.d0 f13439r;

    /* renamed from: s  reason: collision with root package name */
    private final s1 f13440s;

    /* renamed from: t  reason: collision with root package name */
    private final o3.f f13441t;

    /* renamed from: u  reason: collision with root package name */
    private final p3.n f13442u;

    /* renamed from: v  reason: collision with root package name */
    private final HandlerThread f13443v;

    /* renamed from: w  reason: collision with root package name */
    private final Looper f13444w;

    /* renamed from: x  reason: collision with root package name */
    private final l3.d f13445x;

    /* renamed from: y  reason: collision with root package name */
    private final l3.b f13446y;

    /* renamed from: z  reason: collision with root package name */
    private final long f13447z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y2.a {
        a() {
        }

        @Override // s1.y2.a
        public void a() {
            i1.this.U = true;
        }

        @Override // s1.y2.a
        public void b() {
            i1.this.f13442u.d(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<g2.c> f13449a;

        /* renamed from: b  reason: collision with root package name */
        private final u2.p0 f13450b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13451c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13452d;

        private b(List<g2.c> list, u2.p0 p0Var, int i10, long j10) {
            this.f13449a = list;
            this.f13450b = p0Var;
            this.f13451c = i10;
            this.f13452d = j10;
        }

        /* synthetic */ b(List list, u2.p0 p0Var, int i10, long j10, a aVar) {
            this(list, p0Var, i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13453a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13454b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13455c;

        /* renamed from: d  reason: collision with root package name */
        public final u2.p0 f13456d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: n  reason: collision with root package name */
        public final t2 f13457n;

        /* renamed from: o  reason: collision with root package name */
        public int f13458o;

        /* renamed from: p  reason: collision with root package name */
        public long f13459p;

        /* renamed from: q  reason: collision with root package name */
        public Object f13460q;

        public d(t2 t2Var) {
            this.f13457n = t2Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(d dVar) {
            Object obj = this.f13460q;
            if ((obj == null) != (dVar.f13460q == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.f13458o - dVar.f13458o;
                return i10 != 0 ? i10 : p3.m0.o(this.f13459p, dVar.f13459p);
            }
        }

        public void g(int i10, long j10, Object obj) {
            this.f13458o = i10;
            this.f13459p = j10;
            this.f13460q = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13461a;

        /* renamed from: b  reason: collision with root package name */
        public m2 f13462b;

        /* renamed from: c  reason: collision with root package name */
        public int f13463c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f13464d;

        /* renamed from: e  reason: collision with root package name */
        public int f13465e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13466f;

        /* renamed from: g  reason: collision with root package name */
        public int f13467g;

        public e(m2 m2Var) {
            this.f13462b = m2Var;
        }

        public void b(int i10) {
            this.f13461a |= i10 > 0;
            this.f13463c += i10;
        }

        public void c(int i10) {
            this.f13461a = true;
            this.f13466f = true;
            this.f13467g = i10;
        }

        public void d(m2 m2Var) {
            this.f13461a |= this.f13462b != m2Var;
            this.f13462b = m2Var;
        }

        public void e(int i10) {
            if (this.f13464d && this.f13465e != 5) {
                p3.a.a(i10 == 5);
                return;
            }
            this.f13461a = true;
            this.f13464d = true;
            this.f13465e = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final u.b f13468a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13469b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13470c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f13471d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13472e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f13473f;

        public g(u.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f13468a = bVar;
            this.f13469b = j10;
            this.f13470c = j11;
            this.f13471d = z10;
            this.f13472e = z11;
            this.f13473f = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final l3 f13474a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13475b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13476c;

        public h(l3 l3Var, int i10, long j10) {
            this.f13474a = l3Var;
            this.f13475b = i10;
            this.f13476c = j10;
        }
    }

    public i1(y2[] y2VarArr, n3.c0 c0Var, n3.d0 d0Var, s1 s1Var, o3.f fVar, int i10, boolean z10, t1.a aVar, d3 d3Var, r1 r1Var, long j10, boolean z11, Looper looper, p3.d dVar, f fVar2, t1.t1 t1Var) {
        this.E = fVar2;
        this.f13435n = y2VarArr;
        this.f13438q = c0Var;
        this.f13439r = d0Var;
        this.f13440s = s1Var;
        this.f13441t = fVar;
        this.R = i10;
        this.S = z10;
        this.J = d3Var;
        this.H = r1Var;
        this.I = j10;
        this.f13433c0 = j10;
        this.N = z11;
        this.D = dVar;
        this.f13447z = s1Var.j();
        this.A = s1Var.c();
        m2 j11 = m2.j(d0Var);
        this.K = j11;
        this.L = new e(j11);
        this.f13437p = new a3[y2VarArr.length];
        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
            y2VarArr[i11].w(i11, t1Var);
            this.f13437p[i11] = y2VarArr[i11].y();
        }
        this.B = new l(this, dVar);
        this.C = new ArrayList<>();
        this.f13436o = b5.p0.h();
        this.f13445x = new l3.d();
        this.f13446y = new l3.b();
        c0Var.b(this, fVar);
        this.f13431a0 = true;
        Handler handler = new Handler(looper);
        this.F = new d2(aVar, handler);
        this.G = new g2(this, aVar, handler, t1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f13443v = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f13444w = looper2;
        this.f13442u = dVar.c(looper2, this);
    }

    private long A() {
        a2 q10 = this.F.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f13287d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.f13435n;
            if (i10 >= y2VarArr.length) {
                return l10;
            }
            if (R(y2VarArr[i10]) && this.f13435n[i10].h() == q10.f13286c[i10]) {
                long t10 = this.f13435n[i10].t();
                if (t10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(t10, l10);
            }
            i10++;
        }
    }

    private void A0(long j10, long j11) {
        this.f13442u.f(2, j10 + j11);
    }

    private Pair<u.b, Long> B(l3 l3Var) {
        if (l3Var.u()) {
            return Pair.create(m2.k(), 0L);
        }
        Pair<Object, Long> n10 = l3Var.n(this.f13445x, this.f13446y, l3Var.e(this.S), -9223372036854775807L);
        u.b B = this.F.B(l3Var, n10.first, 0L);
        long longValue = ((Long) n10.second).longValue();
        if (B.b()) {
            l3Var.l(B.f15356a, this.f13446y);
            longValue = B.f15358c == this.f13446y.n(B.f15357b) ? this.f13446y.j() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    private void C0(boolean z10) {
        u.b bVar = this.F.p().f13289f.f13307a;
        long F0 = F0(bVar, this.K.f13633r, true, false);
        if (F0 != this.K.f13633r) {
            m2 m2Var = this.K;
            this.K = M(bVar, F0, m2Var.f13618c, m2Var.f13619d, z10, 5);
        }
    }

    private long D() {
        return E(this.K.f13631p);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D0(s1.i1.h r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i1.D0(s1.i1$h):void");
    }

    private long E(long j10) {
        a2 j11 = this.F.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.Y));
    }

    private long E0(u.b bVar, long j10, boolean z10) {
        return F0(bVar, j10, this.F.p() != this.F.q(), z10);
    }

    private void F(u2.r rVar) {
        if (this.F.v(rVar)) {
            this.F.y(this.Y);
            W();
        }
    }

    private long F0(u.b bVar, long j10, boolean z10, boolean z11) {
        i1();
        this.P = false;
        if (z11 || this.K.f13620e == 3) {
            Z0(2);
        }
        a2 p10 = this.F.p();
        a2 a2Var = p10;
        while (a2Var != null && !bVar.equals(a2Var.f13289f.f13307a)) {
            a2Var = a2Var.j();
        }
        if (z10 || p10 != a2Var || (a2Var != null && a2Var.z(j10) < 0)) {
            for (y2 y2Var : this.f13435n) {
                n(y2Var);
            }
            if (a2Var != null) {
                while (this.F.p() != a2Var) {
                    this.F.b();
                }
                this.F.z(a2Var);
                a2Var.x(1000000000000L);
                s();
            }
        }
        d2 d2Var = this.F;
        if (a2Var != null) {
            d2Var.z(a2Var);
            if (!a2Var.f13287d) {
                a2Var.f13289f = a2Var.f13289f.b(j10);
            } else if (a2Var.f13288e) {
                long s10 = a2Var.f13284a.s(j10);
                a2Var.f13284a.r(s10 - this.f13447z, this.A);
                j10 = s10;
            }
            t0(j10);
            W();
        } else {
            d2Var.f();
            t0(j10);
        }
        H(false);
        this.f13442u.d(2);
        return j10;
    }

    private void G(IOException iOException, int i10) {
        q h10 = q.h(iOException, i10);
        a2 p10 = this.F.p();
        if (p10 != null) {
            h10 = h10.f(p10.f13289f.f13307a);
        }
        p3.r.d("ExoPlayerImplInternal", "Playback error", h10);
        h1(false, false);
        this.K = this.K.e(h10);
    }

    private void G0(t2 t2Var) {
        if (t2Var.f() == -9223372036854775807L) {
            H0(t2Var);
        } else if (this.K.f13616a.u()) {
            this.C.add(new d(t2Var));
        } else {
            d dVar = new d(t2Var);
            l3 l3Var = this.K.f13616a;
            if (!v0(dVar, l3Var, l3Var, this.R, this.S, this.f13445x, this.f13446y)) {
                t2Var.k(false);
                return;
            }
            this.C.add(dVar);
            Collections.sort(this.C);
        }
    }

    private void H(boolean z10) {
        a2 j10 = this.F.j();
        u.b bVar = j10 == null ? this.K.f13617b : j10.f13289f.f13307a;
        boolean z11 = !this.K.f13626k.equals(bVar);
        if (z11) {
            this.K = this.K.b(bVar);
        }
        m2 m2Var = this.K;
        m2Var.f13631p = j10 == null ? m2Var.f13633r : j10.i();
        this.K.f13632q = D();
        if ((z11 || z10) && j10 != null && j10.f13287d) {
            k1(j10.n(), j10.o());
        }
    }

    private void H0(t2 t2Var) {
        if (t2Var.c() != this.f13444w) {
            this.f13442u.h(15, t2Var).a();
            return;
        }
        m(t2Var);
        int i10 = this.K.f13620e;
        if (i10 == 3 || i10 == 2) {
            this.f13442u.d(2);
        }
    }

    private void I(l3 l3Var, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        g x02 = x0(l3Var, this.K, this.X, this.F, this.R, this.S, this.f13445x, this.f13446y);
        u.b bVar = x02.f13468a;
        long j10 = x02.f13470c;
        boolean z12 = x02.f13471d;
        long j11 = x02.f13469b;
        boolean z13 = (this.K.f13617b.equals(bVar) && j11 == this.K.f13633r) ? false : true;
        h hVar = null;
        try {
            if (x02.f13472e) {
                if (this.K.f13620e != 1) {
                    Z0(4);
                }
                r0(false, false, false, true);
            }
            try {
                if (z13) {
                    i11 = 4;
                    z11 = false;
                    if (!l3Var.u()) {
                        for (a2 p10 = this.F.p(); p10 != null; p10 = p10.j()) {
                            if (p10.f13289f.f13307a.equals(bVar)) {
                                p10.f13289f = this.F.r(l3Var, p10.f13289f);
                                p10.A();
                            }
                        }
                        j11 = E0(bVar, j11, z12);
                    }
                } else {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.F.F(l3Var, this.Y, A())) {
                            C0(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        m2 m2Var = this.K;
                        h hVar2 = hVar;
                        n1(l3Var, bVar, m2Var.f13616a, m2Var.f13617b, x02.f13473f ? j11 : -9223372036854775807L);
                        if (z13 || j10 != this.K.f13618c) {
                            m2 m2Var2 = this.K;
                            Object obj = m2Var2.f13617b.f15356a;
                            l3 l3Var2 = m2Var2.f13616a;
                            this.K = M(bVar, j11, j10, this.K.f13619d, z13 && z10 && !l3Var2.u() && !l3Var2.l(obj, this.f13446y).f13547s, l3Var.f(obj) == -1 ? i10 : 3);
                        }
                        s0();
                        w0(l3Var, this.K.f13616a);
                        this.K = this.K.i(l3Var);
                        if (!l3Var.u()) {
                            this.X = hVar2;
                        }
                        H(false);
                        throw th;
                    }
                }
                m2 m2Var3 = this.K;
                n1(l3Var, bVar, m2Var3.f13616a, m2Var3.f13617b, x02.f13473f ? j11 : -9223372036854775807L);
                if (z13 || j10 != this.K.f13618c) {
                    m2 m2Var4 = this.K;
                    Object obj2 = m2Var4.f13617b.f15356a;
                    l3 l3Var3 = m2Var4.f13616a;
                    this.K = M(bVar, j11, j10, this.K.f13619d, (!z13 || !z10 || l3Var3.u() || l3Var3.l(obj2, this.f13446y).f13547s) ? z11 : true, l3Var.f(obj2) == -1 ? i11 : 3);
                }
                s0();
                w0(l3Var, this.K.f13616a);
                this.K = this.K.i(l3Var);
                if (!l3Var.u()) {
                    this.X = null;
                }
                H(z11);
            } catch (Throwable th2) {
                th = th2;
                hVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 4;
        }
    }

    private void I0(final t2 t2Var) {
        Looper c10 = t2Var.c();
        if (c10.getThread().isAlive()) {
            this.D.c(c10, null).j(new Runnable() { // from class: s1.h1
                @Override // java.lang.Runnable
                public final void run() {
                    i1.this.V(t2Var);
                }
            });
            return;
        }
        p3.r.i("TAG", "Trying to send message on a dead thread.");
        t2Var.k(false);
    }

    private void J(u2.r rVar) {
        if (this.F.v(rVar)) {
            a2 j10 = this.F.j();
            j10.p(this.B.j().f13650n, this.K.f13616a);
            k1(j10.n(), j10.o());
            if (j10 == this.F.p()) {
                t0(j10.f13289f.f13308b);
                s();
                m2 m2Var = this.K;
                u.b bVar = m2Var.f13617b;
                long j11 = j10.f13289f.f13308b;
                this.K = M(bVar, j11, m2Var.f13618c, j11, false, 5);
            }
            W();
        }
    }

    private void J0(long j10) {
        y2[] y2VarArr;
        for (y2 y2Var : this.f13435n) {
            if (y2Var.h() != null) {
                K0(y2Var, j10);
            }
        }
    }

    private void K(o2 o2Var, float f10, boolean z10, boolean z11) {
        y2[] y2VarArr;
        if (z10) {
            if (z11) {
                this.L.b(1);
            }
            this.K = this.K.f(o2Var);
        }
        o1(o2Var.f13650n);
        for (y2 y2Var : this.f13435n) {
            if (y2Var != null) {
                y2Var.A(f10, o2Var.f13650n);
            }
        }
    }

    private void K0(y2 y2Var, long j10) {
        y2Var.q();
        if (y2Var instanceof d3.o) {
            ((d3.o) y2Var).b0(j10);
        }
    }

    private void L(o2 o2Var, boolean z10) {
        K(o2Var, o2Var.f13650n, true, z10);
    }

    private void L0(boolean z10, AtomicBoolean atomicBoolean) {
        y2[] y2VarArr;
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                for (y2 y2Var : this.f13435n) {
                    if (!R(y2Var) && this.f13436o.remove(y2Var)) {
                        y2Var.c();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m2 M(u.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        u2.v0 v0Var;
        n3.d0 d0Var;
        this.f13431a0 = (!this.f13431a0 && j10 == this.K.f13633r && bVar.equals(this.K.f13617b)) ? false : true;
        s0();
        m2 m2Var = this.K;
        u2.v0 v0Var2 = m2Var.f13623h;
        n3.d0 d0Var2 = m2Var.f13624i;
        List list2 = m2Var.f13625j;
        if (this.G.s()) {
            a2 p10 = this.F.p();
            u2.v0 n10 = p10 == null ? u2.v0.f15373q : p10.n();
            n3.d0 o10 = p10 == null ? this.f13439r : p10.o();
            List w10 = w(o10.f11648c);
            if (p10 != null) {
                b2 b2Var = p10.f13289f;
                if (b2Var.f13309c != j11) {
                    p10.f13289f = b2Var.a(j11);
                }
            }
            v0Var = n10;
            d0Var = o10;
            list = w10;
        } else if (bVar.equals(this.K.f13617b)) {
            list = list2;
            v0Var = v0Var2;
            d0Var = d0Var2;
        } else {
            v0Var = u2.v0.f15373q;
            d0Var = this.f13439r;
            list = b5.q.J();
        }
        if (z10) {
            this.L.e(i10);
        }
        return this.K.c(bVar, j10, j11, j12, D(), v0Var, d0Var, list);
    }

    private void M0(b bVar) {
        this.L.b(1);
        if (bVar.f13451c != -1) {
            this.X = new h(new u2(bVar.f13449a, bVar.f13450b), bVar.f13451c, bVar.f13452d);
        }
        I(this.G.C(bVar.f13449a, bVar.f13450b), false);
    }

    private boolean N(y2 y2Var, a2 a2Var) {
        a2 j10 = a2Var.j();
        return a2Var.f13289f.f13312f && j10.f13287d && ((y2Var instanceof d3.o) || (y2Var instanceof k2.g) || y2Var.t() >= j10.m());
    }

    private boolean O() {
        a2 q10 = this.F.q();
        if (q10.f13287d) {
            int i10 = 0;
            while (true) {
                y2[] y2VarArr = this.f13435n;
                if (i10 >= y2VarArr.length) {
                    return true;
                }
                y2 y2Var = y2VarArr[i10];
                u2.n0 n0Var = q10.f13286c[i10];
                if (y2Var.h() != n0Var || (n0Var != null && !y2Var.m() && !N(y2Var, q10))) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return false;
    }

    private void O0(boolean z10) {
        if (z10 == this.V) {
            return;
        }
        this.V = z10;
        if (z10 || !this.K.f13630o) {
            return;
        }
        this.f13442u.d(2);
    }

    private static boolean P(boolean z10, u.b bVar, long j10, u.b bVar2, l3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f15356a.equals(bVar2.f15356a)) {
            return (bVar.b() && bVar3.t(bVar.f15357b)) ? (bVar3.k(bVar.f15357b, bVar.f15358c) == 4 || bVar3.k(bVar.f15357b, bVar.f15358c) == 2) ? false : true : bVar2.b() && bVar3.t(bVar2.f15357b);
        }
        return false;
    }

    private void P0(boolean z10) {
        this.N = z10;
        s0();
        if (!this.O || this.F.q() == this.F.p()) {
            return;
        }
        C0(true);
        H(false);
    }

    private boolean Q() {
        a2 j10 = this.F.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean R(y2 y2Var) {
        return y2Var.f() != 0;
    }

    private void R0(boolean z10, int i10, boolean z11, int i11) {
        this.L.b(z11 ? 1 : 0);
        this.L.c(i11);
        this.K = this.K.d(z10, i10);
        this.P = false;
        g0(z10);
        if (!c1()) {
            i1();
            m1();
            return;
        }
        int i12 = this.K.f13620e;
        if (i12 == 3) {
            f1();
        } else if (i12 != 2) {
            return;
        }
        this.f13442u.d(2);
    }

    private boolean S() {
        a2 p10 = this.F.p();
        long j10 = p10.f13289f.f13311e;
        return p10.f13287d && (j10 == -9223372036854775807L || this.K.f13633r < j10 || !c1());
    }

    private static boolean T(m2 m2Var, l3.b bVar) {
        u.b bVar2 = m2Var.f13617b;
        l3 l3Var = m2Var.f13616a;
        return l3Var.u() || l3Var.l(bVar2.f15356a, bVar).f13547s;
    }

    private void T0(o2 o2Var) {
        this.B.d(o2Var);
        L(this.B.j(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(t2 t2Var) {
        try {
            m(t2Var);
        } catch (q e10) {
            p3.r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void V0(int i10) {
        this.R = i10;
        if (!this.F.G(this.K.f13616a, i10)) {
            C0(true);
        }
        H(false);
    }

    private void W() {
        boolean b12 = b1();
        this.Q = b12;
        if (b12) {
            this.F.j().d(this.Y);
        }
        j1();
    }

    private void W0(d3 d3Var) {
        this.J = d3Var;
    }

    private void X() {
        this.L.d(this.K);
        if (this.L.f13461a) {
            this.E.a(this.L);
            this.L = new e(this.K);
        }
    }

    private void X0(boolean z10) {
        this.S = z10;
        if (!this.F.H(this.K.f13616a, z10)) {
            C0(true);
        }
        H(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        r3 = r7.C.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        r4 = r3.f13458o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r4 > r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r4 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r3.f13459p <= r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1 <= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r1 >= r7.C.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        r3 = r7.C.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r3.f13460q == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r4 = r3.f13458o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r4 < r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r4 != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r3.f13459p > r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r1 >= r7.C.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r3 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r3.f13460q == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r3.f13458o != r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r4 = r3.f13459p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        if (r4 <= r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
        if (r4 > r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
        H0(r3.f13457n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        if (r3.f13457n.b() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r3.f13457n.j() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
        r7.C.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
        if (r1 >= r7.C.size()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r3 = r7.C.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        if (r3.f13457n.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
        r7.C.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r7.Z = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
        return;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:12:0x0039). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:27:0x006a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:25:0x0060). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i1.Y(long, long):void");
    }

    private void Y0(u2.p0 p0Var) {
        this.L.b(1);
        I(this.G.D(p0Var), false);
    }

    private void Z() {
        b2 o10;
        this.F.y(this.Y);
        if (this.F.D() && (o10 = this.F.o(this.Y, this.K)) != null) {
            a2 g10 = this.F.g(this.f13437p, this.f13438q, this.f13440s.g(), this.G, o10, this.f13439r);
            g10.f13284a.k(this, o10.f13308b);
            if (this.F.p() == g10) {
                t0(o10.f13308b);
            }
            H(false);
        }
        if (!this.Q) {
            W();
            return;
        }
        this.Q = Q();
        j1();
    }

    private void Z0(int i10) {
        m2 m2Var = this.K;
        if (m2Var.f13620e != i10) {
            if (i10 != 2) {
                this.f13434d0 = -9223372036854775807L;
            }
            this.K = m2Var.g(i10);
        }
    }

    private void a0() {
        boolean z10;
        boolean z11 = false;
        while (a1()) {
            if (z11) {
                X();
            }
            a2 a2Var = (a2) p3.a.e(this.F.b());
            if (this.K.f13617b.f15356a.equals(a2Var.f13289f.f13307a.f15356a)) {
                u.b bVar = this.K.f13617b;
                if (bVar.f15357b == -1) {
                    u.b bVar2 = a2Var.f13289f.f13307a;
                    if (bVar2.f15357b == -1 && bVar.f15360e != bVar2.f15360e) {
                        z10 = true;
                        b2 b2Var = a2Var.f13289f;
                        u.b bVar3 = b2Var.f13307a;
                        long j10 = b2Var.f13308b;
                        this.K = M(bVar3, j10, b2Var.f13309c, j10, !z10, 0);
                        s0();
                        m1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            b2 b2Var2 = a2Var.f13289f;
            u.b bVar32 = b2Var2.f13307a;
            long j102 = b2Var2.f13308b;
            this.K = M(bVar32, j102, b2Var2.f13309c, j102, !z10, 0);
            s0();
            m1();
            z11 = true;
        }
    }

    private boolean a1() {
        a2 p10;
        a2 j10;
        return c1() && !this.O && (p10 = this.F.p()) != null && (j10 = p10.j()) != null && this.Y >= j10.m() && j10.f13290g;
    }

    private void b0() {
        a2 q10 = this.F.q();
        if (q10 == null) {
            return;
        }
        int i10 = 0;
        if (q10.j() != null && !this.O) {
            if (O()) {
                if (q10.j().f13287d || this.Y >= q10.j().m()) {
                    n3.d0 o10 = q10.o();
                    a2 c10 = this.F.c();
                    n3.d0 o11 = c10.o();
                    l3 l3Var = this.K.f13616a;
                    n1(l3Var, c10.f13289f.f13307a, l3Var, q10.f13289f.f13307a, -9223372036854775807L);
                    if (c10.f13287d && c10.f13284a.n() != -9223372036854775807L) {
                        J0(c10.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f13435n.length; i11++) {
                        boolean c11 = o10.c(i11);
                        boolean c12 = o11.c(i11);
                        if (c11 && !this.f13435n[i11].v()) {
                            boolean z10 = this.f13437p[i11].k() == -2;
                            b3 b3Var = o10.f11647b[i11];
                            b3 b3Var2 = o11.f11647b[i11];
                            if (!c12 || !b3Var2.equals(b3Var) || z10) {
                                K0(this.f13435n[i11], c10.m());
                            }
                        }
                    }
                }
            }
        } else if (q10.f13289f.f13315i || this.O) {
            while (true) {
                y2[] y2VarArr = this.f13435n;
                if (i10 >= y2VarArr.length) {
                    return;
                }
                y2 y2Var = y2VarArr[i10];
                u2.n0 n0Var = q10.f13286c[i10];
                if (n0Var != null && y2Var.h() == n0Var && y2Var.m()) {
                    long j10 = q10.f13289f.f13311e;
                    K0(y2Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f13289f.f13311e);
                }
                i10++;
            }
        }
    }

    private boolean b1() {
        if (Q()) {
            a2 j10 = this.F.j();
            return this.f13440s.f(j10 == this.F.p() ? j10.y(this.Y) : j10.y(this.Y) - j10.f13289f.f13308b, E(j10.k()), this.B.j().f13650n);
        }
        return false;
    }

    private void c0() {
        a2 q10 = this.F.q();
        if (q10 == null || this.F.p() == q10 || q10.f13290g || !p0()) {
            return;
        }
        s();
    }

    private boolean c1() {
        m2 m2Var = this.K;
        return m2Var.f13627l && m2Var.f13628m == 0;
    }

    private void d0() {
        I(this.G.i(), true);
    }

    private boolean d1(boolean z10) {
        if (this.W == 0) {
            return S();
        }
        if (z10) {
            m2 m2Var = this.K;
            if (m2Var.f13622g) {
                long e10 = e1(m2Var.f13616a, this.F.p().f13289f.f13307a) ? this.H.e() : -9223372036854775807L;
                a2 j10 = this.F.j();
                return (j10.q() && j10.f13289f.f13315i) || (j10.f13289f.f13307a.b() && !j10.f13287d) || this.f13440s.e(D(), this.B.j().f13650n, this.P, e10);
            }
            return true;
        }
        return false;
    }

    private void e0(c cVar) {
        this.L.b(1);
        I(this.G.v(cVar.f13453a, cVar.f13454b, cVar.f13455c, cVar.f13456d), false);
    }

    private boolean e1(l3 l3Var, u.b bVar) {
        if (bVar.b() || l3Var.u()) {
            return false;
        }
        l3Var.r(l3Var.l(bVar.f15356a, this.f13446y).f13544p, this.f13445x);
        if (this.f13445x.g()) {
            l3.d dVar = this.f13445x;
            return dVar.f13561v && dVar.f13558s != -9223372036854775807L;
        }
        return false;
    }

    private void f0() {
        n3.t[] tVarArr;
        for (a2 p10 = this.F.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f11648c) {
                if (tVar != null) {
                    tVar.u();
                }
            }
        }
    }

    private void f1() {
        y2[] y2VarArr;
        this.P = false;
        this.B.f();
        for (y2 y2Var : this.f13435n) {
            if (R(y2Var)) {
                y2Var.start();
            }
        }
    }

    private void g0(boolean z10) {
        n3.t[] tVarArr;
        for (a2 p10 = this.F.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f11648c) {
                if (tVar != null) {
                    tVar.j(z10);
                }
            }
        }
    }

    private void h0() {
        n3.t[] tVarArr;
        for (a2 p10 = this.F.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f11648c) {
                if (tVar != null) {
                    tVar.v();
                }
            }
        }
    }

    private void h1(boolean z10, boolean z11) {
        r0(z10 || !this.T, false, true, false);
        this.L.b(z11 ? 1 : 0);
        this.f13440s.h();
        Z0(1);
    }

    private void i(b bVar, int i10) {
        this.L.b(1);
        g2 g2Var = this.G;
        if (i10 == -1) {
            i10 = g2Var.q();
        }
        I(g2Var.f(i10, bVar.f13449a, bVar.f13450b), false);
    }

    private void i1() {
        y2[] y2VarArr;
        this.B.g();
        for (y2 y2Var : this.f13435n) {
            if (R(y2Var)) {
                u(y2Var);
            }
        }
    }

    private void j1() {
        a2 j10 = this.F.j();
        boolean z10 = this.Q || (j10 != null && j10.f13284a.a());
        m2 m2Var = this.K;
        if (z10 != m2Var.f13622g) {
            this.K = m2Var.a(z10);
        }
    }

    private void k() {
        C0(true);
    }

    private void k0() {
        this.L.b(1);
        r0(false, false, false, true);
        this.f13440s.b();
        Z0(this.K.f13616a.u() ? 4 : 2);
        this.G.w(this.f13441t.a());
        this.f13442u.d(2);
    }

    private void k1(u2.v0 v0Var, n3.d0 d0Var) {
        this.f13440s.i(this.f13435n, v0Var, d0Var.f11648c);
    }

    private void l1() {
        if (this.K.f13616a.u() || !this.G.s()) {
            return;
        }
        Z();
        b0();
        c0();
        a0();
    }

    private void m(t2 t2Var) {
        if (t2Var.j()) {
            return;
        }
        try {
            t2Var.g().p(t2Var.i(), t2Var.e());
        } finally {
            t2Var.k(true);
        }
    }

    private void m0() {
        r0(true, false, true, false);
        this.f13440s.d();
        Z0(1);
        this.f13443v.quit();
        synchronized (this) {
            this.M = true;
            notifyAll();
        }
    }

    private void m1() {
        a2 p10 = this.F.p();
        if (p10 == null) {
            return;
        }
        long n10 = p10.f13287d ? p10.f13284a.n() : -9223372036854775807L;
        if (n10 != -9223372036854775807L) {
            t0(n10);
            if (n10 != this.K.f13633r) {
                m2 m2Var = this.K;
                this.K = M(m2Var.f13617b, n10, m2Var.f13618c, n10, true, 5);
            }
        } else {
            long h10 = this.B.h(p10 != this.F.q());
            this.Y = h10;
            long y10 = p10.y(h10);
            Y(this.K.f13633r, y10);
            this.K.f13633r = y10;
        }
        this.K.f13631p = this.F.j().i();
        this.K.f13632q = D();
        m2 m2Var2 = this.K;
        if (m2Var2.f13627l && m2Var2.f13620e == 3 && e1(m2Var2.f13616a, m2Var2.f13617b) && this.K.f13629n.f13650n == 1.0f) {
            float c10 = this.H.c(x(), D());
            if (this.B.j().f13650n != c10) {
                this.B.d(this.K.f13629n.e(c10));
                K(this.K.f13629n, this.B.j().f13650n, false, false);
            }
        }
    }

    private void n(y2 y2Var) {
        if (R(y2Var)) {
            this.B.a(y2Var);
            u(y2Var);
            y2Var.g();
            this.W--;
        }
    }

    private void n0(int i10, int i11, u2.p0 p0Var) {
        this.L.b(1);
        I(this.G.A(i10, i11, p0Var), false);
    }

    private void n1(l3 l3Var, u.b bVar, l3 l3Var2, u.b bVar2, long j10) {
        if (!e1(l3Var, bVar)) {
            o2 o2Var = bVar.b() ? o2.f13648q : this.K.f13629n;
            if (this.B.j().equals(o2Var)) {
                return;
            }
            this.B.d(o2Var);
            return;
        }
        l3Var.r(l3Var.l(bVar.f15356a, this.f13446y).f13544p, this.f13445x);
        this.H.b((u1.g) p3.m0.j(this.f13445x.f13563x));
        if (j10 != -9223372036854775807L) {
            this.H.d(z(l3Var, bVar.f15356a, j10));
            return;
        }
        if (p3.m0.c(l3Var2.u() ? null : l3Var2.r(l3Var2.l(bVar2.f15356a, this.f13446y).f13544p, this.f13445x).f13553n, this.f13445x.f13553n)) {
            return;
        }
        this.H.d(-9223372036854775807L);
    }

    private void o1(float f10) {
        n3.t[] tVarArr;
        for (a2 p10 = this.F.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f11648c) {
                if (tVar != null) {
                    tVar.s(f10);
                }
            }
        }
    }

    private boolean p0() {
        a2 q10 = this.F.q();
        n3.d0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            y2[] y2VarArr = this.f13435n;
            if (i10 >= y2VarArr.length) {
                return !z10;
            }
            y2 y2Var = y2VarArr[i10];
            if (R(y2Var)) {
                boolean z11 = y2Var.h() != q10.f13286c[i10];
                if (!o10.c(i10) || z11) {
                    if (!y2Var.v()) {
                        y2Var.l(y(o10.f11648c[i10]), q10.f13286c[i10], q10.m(), q10.l());
                    } else if (y2Var.b()) {
                        n(y2Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private synchronized void p1(a5.o<Boolean> oVar, long j10) {
        long b10 = this.D.b() + j10;
        boolean z10 = false;
        while (!oVar.get().booleanValue() && j10 > 0) {
            try {
                this.D.d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = b10 - this.D.b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i1.q():void");
    }

    private void q0() {
        float f10 = this.B.j().f13650n;
        a2 q10 = this.F.q();
        boolean z10 = true;
        for (a2 p10 = this.F.p(); p10 != null && p10.f13287d; p10 = p10.j()) {
            n3.d0 v10 = p10.v(f10, this.K.f13616a);
            if (!v10.a(p10.o())) {
                d2 d2Var = this.F;
                if (z10) {
                    a2 p11 = d2Var.p();
                    boolean z11 = this.F.z(p11);
                    boolean[] zArr = new boolean[this.f13435n.length];
                    long b10 = p11.b(v10, this.K.f13633r, z11, zArr);
                    m2 m2Var = this.K;
                    boolean z12 = (m2Var.f13620e == 4 || b10 == m2Var.f13633r) ? false : true;
                    m2 m2Var2 = this.K;
                    this.K = M(m2Var2.f13617b, b10, m2Var2.f13618c, m2Var2.f13619d, z12, 5);
                    if (z12) {
                        t0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f13435n.length];
                    int i10 = 0;
                    while (true) {
                        y2[] y2VarArr = this.f13435n;
                        if (i10 >= y2VarArr.length) {
                            break;
                        }
                        y2 y2Var = y2VarArr[i10];
                        zArr2[i10] = R(y2Var);
                        u2.n0 n0Var = p11.f13286c[i10];
                        if (zArr2[i10]) {
                            if (n0Var != y2Var.h()) {
                                n(y2Var);
                            } else if (zArr[i10]) {
                                y2Var.u(this.Y);
                            }
                        }
                        i10++;
                    }
                    t(zArr2);
                } else {
                    d2Var.z(p10);
                    if (p10.f13287d) {
                        p10.a(v10, Math.max(p10.f13289f.f13308b, p10.y(this.Y)), false);
                    }
                }
                H(true);
                if (this.K.f13620e != 4) {
                    W();
                    m1();
                    this.f13442u.d(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    private void r(int i10, boolean z10) {
        y2 y2Var = this.f13435n[i10];
        if (R(y2Var)) {
            return;
        }
        a2 q10 = this.F.q();
        boolean z11 = q10 == this.F.p();
        n3.d0 o10 = q10.o();
        b3 b3Var = o10.f11647b[i10];
        m1[] y10 = y(o10.f11648c[i10]);
        boolean z12 = c1() && this.K.f13620e == 3;
        boolean z13 = !z10 && z12;
        this.W++;
        this.f13436o.add(y2Var);
        y2Var.r(b3Var, y10, q10.f13286c[i10], this.Y, z13, z11, q10.m(), q10.l());
        y2Var.p(11, new a());
        this.B.b(y2Var);
        if (z12) {
            y2Var.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i1.r0(boolean, boolean, boolean, boolean):void");
    }

    private void s() {
        t(new boolean[this.f13435n.length]);
    }

    private void s0() {
        a2 p10 = this.F.p();
        this.O = p10 != null && p10.f13289f.f13314h && this.N;
    }

    private void t(boolean[] zArr) {
        a2 q10 = this.F.q();
        n3.d0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f13435n.length; i10++) {
            if (!o10.c(i10) && this.f13436o.remove(this.f13435n[i10])) {
                this.f13435n[i10].c();
            }
        }
        for (int i11 = 0; i11 < this.f13435n.length; i11++) {
            if (o10.c(i11)) {
                r(i11, zArr[i11]);
            }
        }
        q10.f13290g = true;
    }

    private void t0(long j10) {
        y2[] y2VarArr;
        a2 p10 = this.F.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.Y = z10;
        this.B.c(z10);
        for (y2 y2Var : this.f13435n) {
            if (R(y2Var)) {
                y2Var.u(this.Y);
            }
        }
        f0();
    }

    private void u(y2 y2Var) {
        if (y2Var.f() == 2) {
            y2Var.stop();
        }
    }

    private static void u0(l3 l3Var, d dVar, l3.d dVar2, l3.b bVar) {
        int i10 = l3Var.r(l3Var.l(dVar.f13460q, bVar).f13544p, dVar2).C;
        Object obj = l3Var.k(i10, bVar, true).f13543o;
        long j10 = bVar.f13545q;
        dVar.g(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean v0(d dVar, l3 l3Var, l3 l3Var2, int i10, boolean z10, l3.d dVar2, l3.b bVar) {
        Object obj = dVar.f13460q;
        if (obj == null) {
            Pair<Object, Long> y02 = y0(l3Var, new h(dVar.f13457n.h(), dVar.f13457n.d(), dVar.f13457n.f() == Long.MIN_VALUE ? -9223372036854775807L : p3.m0.A0(dVar.f13457n.f())), false, i10, z10, dVar2, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.g(l3Var.f(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar.f13457n.f() == Long.MIN_VALUE) {
                u0(l3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f10 = l3Var.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar.f13457n.f() == Long.MIN_VALUE) {
            u0(l3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f13458o = f10;
        l3Var2.l(dVar.f13460q, bVar);
        if (bVar.f13547s && l3Var2.r(bVar.f13544p, dVar2).B == l3Var2.f(dVar.f13460q)) {
            Pair<Object, Long> n10 = l3Var.n(dVar2, bVar, l3Var.l(dVar.f13460q, bVar).f13544p, dVar.f13459p + bVar.q());
            dVar.g(l3Var.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    private b5.q<k2.a> w(n3.t[] tVarArr) {
        q.a aVar = new q.a();
        boolean z10 = false;
        for (n3.t tVar : tVarArr) {
            if (tVar != null) {
                k2.a aVar2 = tVar.a(0).f13585w;
                if (aVar2 == null) {
                    aVar.a(new k2.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : b5.q.J();
    }

    private void w0(l3 l3Var, l3 l3Var2) {
        if (l3Var.u() && l3Var2.u()) {
            return;
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            if (!v0(this.C.get(size), l3Var, l3Var2, this.R, this.S, this.f13445x, this.f13446y)) {
                this.C.get(size).f13457n.k(false);
                this.C.remove(size);
            }
        }
        Collections.sort(this.C);
    }

    private long x() {
        m2 m2Var = this.K;
        return z(m2Var.f13616a, m2Var.f13617b.f15356a, m2Var.f13633r);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static s1.i1.g x0(s1.l3 r30, s1.m2 r31, s1.i1.h r32, s1.d2 r33, int r34, boolean r35, s1.l3.d r36, s1.l3.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i1.x0(s1.l3, s1.m2, s1.i1$h, s1.d2, int, boolean, s1.l3$d, s1.l3$b):s1.i1$g");
    }

    private static m1[] y(n3.t tVar) {
        int length = tVar != null ? tVar.length() : 0;
        m1[] m1VarArr = new m1[length];
        for (int i10 = 0; i10 < length; i10++) {
            m1VarArr[i10] = tVar.a(i10);
        }
        return m1VarArr;
    }

    private static Pair<Object, Long> y0(l3 l3Var, h hVar, boolean z10, int i10, boolean z11, l3.d dVar, l3.b bVar) {
        Pair<Object, Long> n10;
        Object z02;
        l3 l3Var2 = hVar.f13474a;
        if (l3Var.u()) {
            return null;
        }
        l3 l3Var3 = l3Var2.u() ? l3Var : l3Var2;
        try {
            n10 = l3Var3.n(dVar, bVar, hVar.f13475b, hVar.f13476c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (l3Var.equals(l3Var3)) {
            return n10;
        }
        if (l3Var.f(n10.first) != -1) {
            return (l3Var3.l(n10.first, bVar).f13547s && l3Var3.r(bVar.f13544p, dVar).B == l3Var3.f(n10.first)) ? l3Var.n(dVar, bVar, l3Var.l(n10.first, bVar).f13544p, hVar.f13476c) : n10;
        }
        if (z10 && (z02 = z0(dVar, bVar, i10, z11, n10.first, l3Var3, l3Var)) != null) {
            return l3Var.n(dVar, bVar, l3Var.l(z02, bVar).f13544p, -9223372036854775807L);
        }
        return null;
    }

    private long z(l3 l3Var, Object obj, long j10) {
        l3Var.r(l3Var.l(obj, this.f13446y).f13544p, this.f13445x);
        l3.d dVar = this.f13445x;
        if (dVar.f13558s != -9223372036854775807L && dVar.g()) {
            l3.d dVar2 = this.f13445x;
            if (dVar2.f13561v) {
                return p3.m0.A0(dVar2.c() - this.f13445x.f13558s) - (j10 + this.f13446y.q());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object z0(l3.d dVar, l3.b bVar, int i10, boolean z10, Object obj, l3 l3Var, l3 l3Var2) {
        int f10 = l3Var.f(obj);
        int m10 = l3Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m10 && i12 == -1; i13++) {
            i11 = l3Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = l3Var2.f(l3Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return l3Var2.q(i12);
    }

    public void B0(l3 l3Var, int i10, long j10) {
        this.f13442u.h(3, new h(l3Var, i10, j10)).a();
    }

    public Looper C() {
        return this.f13444w;
    }

    public void N0(List<g2.c> list, int i10, long j10, u2.p0 p0Var) {
        this.f13442u.h(17, new b(list, p0Var, i10, j10, null)).a();
    }

    public void Q0(boolean z10, int i10) {
        this.f13442u.c(1, z10 ? 1 : 0, i10).a();
    }

    public void S0(o2 o2Var) {
        this.f13442u.h(4, o2Var).a();
    }

    public void U0(int i10) {
        this.f13442u.c(11, i10, 0).a();
    }

    @Override // s1.t2.a
    public synchronized void a(t2 t2Var) {
        if (!this.M && this.f13443v.isAlive()) {
            this.f13442u.h(14, t2Var).a();
            return;
        }
        p3.r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        t2Var.k(false);
    }

    @Override // s1.g2.d
    public void c() {
        this.f13442u.d(22);
    }

    @Override // n3.c0.a
    public void d() {
        this.f13442u.d(10);
    }

    public void g1() {
        this.f13442u.k(6).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        a2 q10;
        int i11;
        IOException iOException;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    T0((o2) message.obj);
                    break;
                case 5:
                    W0((d3) message.obj);
                    break;
                case 6:
                    h1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    J((u2.r) message.obj);
                    break;
                case 9:
                    F((u2.r) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    X0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((t2) message.obj);
                    break;
                case 15:
                    I0((t2) message.obj);
                    break;
                case 16:
                    L((o2) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    i((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (u2.p0) message.obj);
                    break;
                case 21:
                    Y0((u2.p0) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case c.j.f3071t3 /* 23 */:
                    P0(message.arg1 != 0);
                    break;
                case c.j.f3076u3 /* 24 */:
                    O0(message.arg1 == 1);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e10) {
            e = q.j(e10, ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) ? 1004 : 1004);
            p3.r.d("ExoPlayerImplInternal", "Playback error", e);
            h1(true, false);
            this.K = this.K.e(e);
        } catch (o3.m e11) {
            i10 = e11.f12010n;
            iOException = e11;
            G(iOException, i10);
        } catch (h2 e12) {
            int i13 = e12.f13423o;
            if (i13 == 1) {
                i11 = e12.f13422n ? 3001 : 3003;
            } else {
                if (i13 == 4) {
                    i11 = e12.f13422n ? 3002 : 3004;
                }
                G(e12, i12);
            }
            i12 = i11;
            G(e12, i12);
        } catch (IOException e13) {
            i10 = 2000;
            iOException = e13;
            G(iOException, i10);
        } catch (q e14) {
            e = e14;
            if (e.f13679q == 1 && (q10 = this.F.q()) != null) {
                e = e.f(q10.f13289f.f13307a);
            }
            if (e.f13685w && this.f13432b0 == null) {
                p3.r.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f13432b0 = e;
                p3.n nVar = this.f13442u;
                nVar.a(nVar.h(25, e));
            } else {
                q qVar = this.f13432b0;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.f13432b0;
                }
                p3.r.d("ExoPlayerImplInternal", "Playback error", e);
                h1(true, false);
                this.K = this.K.e(e);
            }
        } catch (u2.b e15) {
            i10 = 1002;
            iOException = e15;
            G(iOException, i10);
        } catch (o.a e16) {
            i10 = e16.f15946n;
            iOException = e16;
            G(iOException, i10);
        }
        X();
        return true;
    }

    @Override // u2.o0.a
    /* renamed from: i0 */
    public void o(u2.r rVar) {
        this.f13442u.h(9, rVar).a();
    }

    @Override // u2.r.a
    public void j(u2.r rVar) {
        this.f13442u.h(8, rVar).a();
    }

    public void j0() {
        this.f13442u.k(0).a();
    }

    public synchronized boolean l0() {
        if (!this.M && this.f13443v.isAlive()) {
            this.f13442u.d(7);
            p1(new a5.o() { // from class: s1.g1
                @Override // a5.o
                public final Object get() {
                    Boolean U;
                    U = i1.this.U();
                    return U;
                }
            }, this.I);
            return this.M;
        }
        return true;
    }

    public void o0(int i10, int i11, u2.p0 p0Var) {
        this.f13442u.e(20, i10, i11, p0Var).a();
    }

    @Override // s1.l.a
    public void p(o2 o2Var) {
        this.f13442u.h(16, o2Var).a();
    }

    public void v(long j10) {
        this.f13433c0 = j10;
    }
}
