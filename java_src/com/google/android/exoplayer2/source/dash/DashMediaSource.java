package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.g0;
import o3.h0;
import o3.i0;
import o3.j0;
import o3.l;
import o3.p0;
import o3.x;
import p3.d0;
import p3.m0;
import p3.r;
import s1.h2;
import s1.j1;
import s1.l3;
import s1.u1;
import u2.b0;
import u2.i;
import u2.n;
import u2.q;
import u2.u;
import w1.y;
import y2.j;
import y2.o;
/* loaded from: classes.dex */
public final class DashMediaSource extends u2.a {
    private final g0 A;
    private final x2.b B;
    private final long C;
    private final b0.a D;
    private final j0.a<? extends y2.c> E;
    private final e F;
    private final Object G;
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> H;
    private final Runnable I;
    private final Runnable J;
    private final e.b K;
    private final i0 L;
    private l M;
    private h0 N;
    private p0 O;
    private IOException P;
    private Handler Q;
    private u1.g R;
    private Uri S;
    private Uri T;
    private y2.c U;
    private boolean V;
    private long W;
    private long X;
    private long Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private long f3356a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f3357b0;

    /* renamed from: u  reason: collision with root package name */
    private final u1 f3358u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f3359v;

    /* renamed from: w  reason: collision with root package name */
    private final l.a f3360w;

    /* renamed from: x  reason: collision with root package name */
    private final a.InterfaceC0074a f3361x;

    /* renamed from: y  reason: collision with root package name */
    private final u2.h f3362y;

    /* renamed from: z  reason: collision with root package name */
    private final y f3363z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0074a f3364a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f3365b;

        /* renamed from: c  reason: collision with root package name */
        private w1.b0 f3366c;

        /* renamed from: d  reason: collision with root package name */
        private u2.h f3367d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f3368e;

        /* renamed from: f  reason: collision with root package name */
        private long f3369f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends y2.c> f3370g;

        public Factory(a.InterfaceC0074a interfaceC0074a, l.a aVar) {
            this.f3364a = (a.InterfaceC0074a) p3.a.e(interfaceC0074a);
            this.f3365b = aVar;
            this.f3366c = new w1.l();
            this.f3368e = new x();
            this.f3369f = 30000L;
            this.f3367d = new i();
        }

        public Factory(l.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(u1 u1Var) {
            p3.a.e(u1Var.f13763o);
            j0.a aVar = this.f3370g;
            if (aVar == null) {
                aVar = new y2.d();
            }
            List<t2.c> list = u1Var.f13763o.f13831e;
            return new DashMediaSource(u1Var, null, this.f3365b, !list.isEmpty() ? new t2.b(aVar, list) : aVar, this.f3364a, this.f3367d, this.f3366c.a(u1Var), this.f3368e, this.f3369f, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d0.b {
        a() {
        }

        @Override // p3.d0.b
        public void a() {
            DashMediaSource.this.b0(d0.h());
        }

        @Override // p3.d0.b
        public void b(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends l3 {

        /* renamed from: p  reason: collision with root package name */
        private final long f3372p;

        /* renamed from: q  reason: collision with root package name */
        private final long f3373q;

        /* renamed from: r  reason: collision with root package name */
        private final long f3374r;

        /* renamed from: s  reason: collision with root package name */
        private final int f3375s;

        /* renamed from: t  reason: collision with root package name */
        private final long f3376t;

        /* renamed from: u  reason: collision with root package name */
        private final long f3377u;

        /* renamed from: v  reason: collision with root package name */
        private final long f3378v;

        /* renamed from: w  reason: collision with root package name */
        private final y2.c f3379w;

        /* renamed from: x  reason: collision with root package name */
        private final u1 f3380x;

        /* renamed from: y  reason: collision with root package name */
        private final u1.g f3381y;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, y2.c cVar, u1 u1Var, u1.g gVar) {
            p3.a.f(cVar.f16868d == (gVar != null));
            this.f3372p = j10;
            this.f3373q = j11;
            this.f3374r = j12;
            this.f3375s = i10;
            this.f3376t = j13;
            this.f3377u = j14;
            this.f3378v = j15;
            this.f3379w = cVar;
            this.f3380x = u1Var;
            this.f3381y = gVar;
        }

        private long x(long j10) {
            x2.f l10;
            long j11 = this.f3378v;
            if (y(this.f3379w)) {
                if (j10 > 0) {
                    j11 += j10;
                    if (j11 > this.f3377u) {
                        return -9223372036854775807L;
                    }
                }
                long j12 = this.f3376t + j11;
                long g10 = this.f3379w.g(0);
                int i10 = 0;
                while (i10 < this.f3379w.e() - 1 && j12 >= g10) {
                    j12 -= g10;
                    i10++;
                    g10 = this.f3379w.g(i10);
                }
                y2.g d10 = this.f3379w.d(i10);
                int a10 = d10.a(2);
                return (a10 == -1 || (l10 = d10.f16902c.get(a10).f16857c.get(0).l()) == null || l10.i(g10) == 0) ? j11 : (j11 + l10.d(l10.a(j12, g10))) - j12;
            }
            return j11;
        }

        private static boolean y(y2.c cVar) {
            return cVar.f16868d && cVar.f16869e != -9223372036854775807L && cVar.f16866b == -9223372036854775807L;
        }

        @Override // s1.l3
        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f3375s) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        @Override // s1.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            p3.a.c(i10, 0, m());
            return bVar.v(z10 ? this.f3379w.d(i10).f16900a : null, z10 ? Integer.valueOf(this.f3375s + i10) : null, 0, this.f3379w.g(i10), m0.A0(this.f3379w.d(i10).f16901b - this.f3379w.d(0).f16901b) - this.f3376t);
        }

        @Override // s1.l3
        public int m() {
            return this.f3379w.e();
        }

        @Override // s1.l3
        public Object q(int i10) {
            p3.a.c(i10, 0, m());
            return Integer.valueOf(this.f3375s + i10);
        }

        @Override // s1.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            p3.a.c(i10, 0, 1);
            long x10 = x(j10);
            Object obj = l3.d.E;
            u1 u1Var = this.f3380x;
            y2.c cVar = this.f3379w;
            return dVar.i(obj, u1Var, cVar, this.f3372p, this.f3373q, this.f3374r, true, y(cVar), this.f3381y, x10, this.f3377u, 0, m() - 1, this.f3376t);
        }

        @Override // s1.l3
        public int t() {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    private final class c implements e.b {
        private c() {
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a() {
            DashMediaSource.this.U();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b(long j10) {
            DashMediaSource.this.T(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements j0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f3383a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // o3.j0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, a5.d.f200c)).readLine();
            try {
                Matcher matcher = f3383a.matcher(readLine);
                if (!matcher.matches()) {
                    throw h2.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw h2.c(null, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e implements h0.b<j0<y2.c>> {
        private e() {
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // o3.h0.b
        /* renamed from: a */
        public void j(j0<y2.c> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: b */
        public void o(j0<y2.c> j0Var, long j10, long j11) {
            DashMediaSource.this.W(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: c */
        public h0.c u(j0<y2.c> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(j0Var, j10, j11, iOException, i10);
        }
    }

    /* loaded from: classes.dex */
    final class f implements i0 {
        f() {
        }

        private void a() {
            if (DashMediaSource.this.P != null) {
                throw DashMediaSource.this.P;
            }
        }

        @Override // o3.i0
        public void b() {
            DashMediaSource.this.N.b();
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class g implements h0.b<j0<Long>> {
        private g() {
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // o3.h0.b
        /* renamed from: a */
        public void j(j0<Long> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: b */
        public void o(j0<Long> j0Var, long j10, long j11) {
            DashMediaSource.this.Y(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: c */
        public h0.c u(j0<Long> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(j0Var, j10, j11, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h implements j0.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // o3.j0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(m0.H0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        j1.a("goog.exo.dash");
    }

    private DashMediaSource(u1 u1Var, y2.c cVar, l.a aVar, j0.a<? extends y2.c> aVar2, a.InterfaceC0074a interfaceC0074a, u2.h hVar, y yVar, g0 g0Var, long j10) {
        this.f3358u = u1Var;
        this.R = u1Var.f13765q;
        this.S = ((u1.h) p3.a.e(u1Var.f13763o)).f13827a;
        this.T = u1Var.f13763o.f13827a;
        this.U = cVar;
        this.f3360w = aVar;
        this.E = aVar2;
        this.f3361x = interfaceC0074a;
        this.f3363z = yVar;
        this.A = g0Var;
        this.C = j10;
        this.f3362y = hVar;
        this.B = new x2.b();
        boolean z10 = cVar != null;
        this.f3359v = z10;
        this.D = w(null);
        this.G = new Object();
        this.H = new SparseArray<>();
        this.K = new c(this, null);
        this.f3356a0 = -9223372036854775807L;
        this.Y = -9223372036854775807L;
        if (!z10) {
            this.F = new e(this, null);
            this.L = new f();
            this.I = new Runnable() { // from class: x2.d
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.i0();
                }
            };
            this.J = new Runnable() { // from class: x2.e
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.R();
                }
            };
            return;
        }
        p3.a.f(true ^ cVar.f16868d);
        this.F = null;
        this.I = null;
        this.J = null;
        this.L = new i0.a();
    }

    /* synthetic */ DashMediaSource(u1 u1Var, y2.c cVar, l.a aVar, j0.a aVar2, a.InterfaceC0074a interfaceC0074a, u2.h hVar, y yVar, g0 g0Var, long j10, a aVar3) {
        this(u1Var, cVar, aVar, aVar2, interfaceC0074a, hVar, yVar, g0Var, j10);
    }

    private static long L(y2.g gVar, long j10, long j11) {
        long A0 = m0.A0(gVar.f16901b);
        boolean P = P(gVar);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f16902c.size(); i10++) {
            y2.a aVar = gVar.f16902c.get(i10);
            List<j> list = aVar.f16857c;
            if ((!P || aVar.f16856b != 3) && !list.isEmpty()) {
                x2.f l10 = list.get(0).l();
                if (l10 == null) {
                    return A0 + j10;
                }
                long j13 = l10.j(j10, j11);
                if (j13 == 0) {
                    return A0;
                }
                long c10 = (l10.c(j10, j11) + j13) - 1;
                j12 = Math.min(j12, l10.b(c10, j10) + l10.d(c10) + A0);
            }
        }
        return j12;
    }

    private static long M(y2.g gVar, long j10, long j11) {
        long A0 = m0.A0(gVar.f16901b);
        boolean P = P(gVar);
        long j12 = A0;
        for (int i10 = 0; i10 < gVar.f16902c.size(); i10++) {
            y2.a aVar = gVar.f16902c.get(i10);
            List<j> list = aVar.f16857c;
            if ((!P || aVar.f16856b != 3) && !list.isEmpty()) {
                x2.f l10 = list.get(0).l();
                if (l10 == null || l10.j(j10, j11) == 0) {
                    return A0;
                }
                j12 = Math.max(j12, l10.d(l10.c(j10, j11)) + A0);
            }
        }
        return j12;
    }

    private static long N(y2.c cVar, long j10) {
        x2.f l10;
        int e10 = cVar.e() - 1;
        y2.g d10 = cVar.d(e10);
        long A0 = m0.A0(d10.f16901b);
        long g10 = cVar.g(e10);
        long A02 = m0.A0(j10);
        long A03 = m0.A0(cVar.f16865a);
        long A04 = m0.A0(5000L);
        for (int i10 = 0; i10 < d10.f16902c.size(); i10++) {
            List<j> list = d10.f16902c.get(i10).f16857c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long e11 = ((A03 + A0) + l10.e(g10, A02)) - A02;
                if (e11 < A04 - 100000 || (e11 > A04 && e11 < A04 + 100000)) {
                    A04 = e11;
                }
            }
        }
        return c5.b.a(A04, 1000L, RoundingMode.CEILING);
    }

    private long O() {
        return Math.min((this.Z - 1) * 1000, 5000);
    }

    private static boolean P(y2.g gVar) {
        for (int i10 = 0; i10 < gVar.f16902c.size(); i10++) {
            int i11 = gVar.f16902c.get(i10).f16856b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(y2.g gVar) {
        for (int i10 = 0; i10 < gVar.f16902c.size(); i10++) {
            x2.f l10 = gVar.f16902c.get(i10).f16857c.get(0).l();
            if (l10 == null || l10.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        d0.j(this.N, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(IOException iOException) {
        r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j10) {
        this.Y = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        y2.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.H.size(); i10++) {
            int keyAt = this.H.keyAt(i10);
            if (keyAt >= this.f3357b0) {
                this.H.valueAt(i10).M(this.U, keyAt - this.f3357b0);
            }
        }
        y2.g d10 = this.U.d(0);
        int e10 = this.U.e() - 1;
        y2.g d11 = this.U.d(e10);
        long g10 = this.U.g(e10);
        long A0 = m0.A0(m0.a0(this.Y));
        long M = M(d10, this.U.g(0), A0);
        long L = L(d11, g10, A0);
        boolean z11 = this.U.f16868d && !Q(d11);
        if (z11) {
            long j12 = this.U.f16870f;
            if (j12 != -9223372036854775807L) {
                M = Math.max(M, L - m0.A0(j12));
            }
        }
        long j13 = L - M;
        y2.c cVar = this.U;
        if (cVar.f16868d) {
            p3.a.f(cVar.f16865a != -9223372036854775807L);
            long A02 = (A0 - m0.A0(this.U.f16865a)) - M;
            j0(A02, j13);
            long X0 = this.U.f16865a + m0.X0(M);
            long A03 = A02 - m0.A0(this.R.f13817n);
            long min = Math.min(5000000L, j13 / 2);
            j10 = X0;
            j11 = A03 < min ? min : A03;
            gVar = d10;
        } else {
            gVar = d10;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long A04 = M - m0.A0(gVar.f16901b);
        y2.c cVar2 = this.U;
        D(new b(cVar2.f16865a, j10, this.Y, this.f3357b0, A04, j13, j11, cVar2, this.f3358u, cVar2.f16868d ? this.R : null));
        if (this.f3359v) {
            return;
        }
        this.Q.removeCallbacks(this.J);
        if (z11) {
            this.Q.postDelayed(this.J, N(this.U, m0.a0(this.Y)));
        }
        if (this.V) {
            i0();
        } else if (z10) {
            y2.c cVar3 = this.U;
            if (cVar3.f16868d) {
                long j14 = cVar3.f16869e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    g0(Math.max(0L, (this.W + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d0(o oVar) {
        j0.a<Long> dVar;
        String str = oVar.f16955a;
        if (m0.c(str, "urn:mpeg:dash:utc:direct:2014") || m0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
            return;
        }
        if (m0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || m0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else if (!m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            if (m0.c(str, "urn:mpeg:dash:utc:ntp:2014") || m0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                S();
                return;
            } else {
                a0(new IOException("Unsupported UTC timing scheme"));
                return;
            }
        } else {
            dVar = new h(null);
        }
        f0(oVar, dVar);
    }

    private void e0(o oVar) {
        try {
            b0(m0.H0(oVar.f16956b) - this.X);
        } catch (h2 e10) {
            a0(e10);
        }
    }

    private void f0(o oVar, j0.a<Long> aVar) {
        h0(new j0(this.M, Uri.parse(oVar.f16956b), 5, aVar), new g(this, null), 1);
    }

    private void g0(long j10) {
        this.Q.postDelayed(this.I, j10);
    }

    private <T> void h0(j0<T> j0Var, h0.b<j0<T>> bVar, int i10) {
        this.D.z(new n(j0Var.f11996a, j0Var.f11997b, this.N.n(j0Var, bVar, i10)), j0Var.f11998c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        Uri uri;
        this.Q.removeCallbacks(this.I);
        if (this.N.i()) {
            return;
        }
        if (this.N.j()) {
            this.V = true;
            return;
        }
        synchronized (this.G) {
            uri = this.S;
        }
        this.V = false;
        h0(new j0(this.M, uri, 4, this.E), this.F, this.A.d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1 != (-9223372036854775807L)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1 != (-9223372036854775807L)) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.O = p0Var;
        this.f3363z.b();
        this.f3363z.e(Looper.myLooper(), A());
        if (this.f3359v) {
            c0(false);
            return;
        }
        this.M = this.f3360w.a();
        this.N = new h0("DashMediaSource");
        this.Q = m0.w();
        i0();
    }

    @Override // u2.a
    protected void E() {
        this.V = false;
        this.M = null;
        h0 h0Var = this.N;
        if (h0Var != null) {
            h0Var.l();
            this.N = null;
        }
        this.W = 0L;
        this.X = 0L;
        this.U = this.f3359v ? this.U : null;
        this.S = this.T;
        this.P = null;
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Q = null;
        }
        this.Y = -9223372036854775807L;
        this.Z = 0;
        this.f3356a0 = -9223372036854775807L;
        this.f3357b0 = 0;
        this.H.clear();
        this.B.i();
        this.f3363z.a();
    }

    void T(long j10) {
        long j11 = this.f3356a0;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f3356a0 = j10;
        }
    }

    void U() {
        this.Q.removeCallbacks(this.J);
        i0();
    }

    void V(j0<?> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.A.a(j0Var.f11996a);
        this.D.q(nVar, j0Var.f11998c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void W(o3.j0<y2.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.W(o3.j0, long, long):void");
    }

    h0.c X(j0<y2.c> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.A.b(new g0.c(nVar, new q(j0Var.f11998c), iOException, i10));
        h0.c h10 = b10 == -9223372036854775807L ? h0.f11975g : h0.h(false, b10);
        boolean z10 = !h10.c();
        this.D.x(nVar, j0Var.f11998c, iOException, z10);
        if (z10) {
            this.A.a(j0Var.f11996a);
        }
        return h10;
    }

    void Y(j0<Long> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.A.a(j0Var.f11996a);
        this.D.t(nVar, j0Var.f11998c);
        b0(j0Var.e().longValue() - j10);
    }

    h0.c Z(j0<Long> j0Var, long j10, long j11, IOException iOException) {
        this.D.x(new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a()), j0Var.f11998c, iOException, true);
        this.A.a(j0Var.f11996a);
        a0(iOException);
        return h0.f11974f;
    }

    @Override // u2.u
    public u1 a() {
        return this.f3358u;
    }

    @Override // u2.u
    public void b(u2.r rVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) rVar;
        bVar.I();
        this.H.remove(bVar.f3387n);
    }

    @Override // u2.u
    public void f() {
        this.L.b();
    }

    @Override // u2.u
    public u2.r n(u.b bVar, o3.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f15356a).intValue() - this.f3357b0;
        b0.a x10 = x(bVar, this.U.d(intValue).f16901b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.f3357b0, this.U, this.B, intValue, this.f3361x, this.O, this.f3363z, t(bVar), this.A, x10, this.Y, this.L, bVar2, this.f3362y, this.K, A());
        this.H.put(bVar3.f3387n, bVar3);
        return bVar3;
    }
}
