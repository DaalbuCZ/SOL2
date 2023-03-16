package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o3.i;
import p3.a0;
import p3.m0;
import s1.h2;
import s1.m1;
import s1.n1;
import w2.f;
import x1.d0;
import x1.e0;
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    private final o3.b f3440n;

    /* renamed from: o  reason: collision with root package name */
    private final b f3441o;

    /* renamed from: s  reason: collision with root package name */
    private y2.c f3445s;

    /* renamed from: t  reason: collision with root package name */
    private long f3446t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3447u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3448v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3449w;

    /* renamed from: r  reason: collision with root package name */
    private final TreeMap<Long, Long> f3444r = new TreeMap<>();

    /* renamed from: q  reason: collision with root package name */
    private final Handler f3443q = m0.x(this);

    /* renamed from: p  reason: collision with root package name */
    private final m2.b f3442p = new m2.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f3450a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3451b;

        public a(long j10, long j11) {
            this.f3450a = j10;
            this.f3451b = j11;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(long j10);
    }

    /* loaded from: classes.dex */
    public final class c implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final u2.m0 f3452a;

        /* renamed from: b  reason: collision with root package name */
        private final n1 f3453b = new n1();

        /* renamed from: c  reason: collision with root package name */
        private final k2.e f3454c = new k2.e();

        /* renamed from: d  reason: collision with root package name */
        private long f3455d = -9223372036854775807L;

        c(o3.b bVar) {
            this.f3452a = u2.m0.l(bVar);
        }

        private k2.e g() {
            this.f3454c.m();
            if (this.f3452a.S(this.f3453b, this.f3454c, 0, false) == -4) {
                this.f3454c.z();
                return this.f3454c;
            }
            return null;
        }

        private void k(long j10, long j11) {
            e.this.f3443q.sendMessage(e.this.f3443q.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f3452a.K(false)) {
                k2.e g10 = g();
                if (g10 != null) {
                    long j10 = g10.f15538r;
                    k2.a a10 = e.this.f3442p.a(g10);
                    if (a10 != null) {
                        m2.a aVar = (m2.a) a10.c(0);
                        if (e.h(aVar.f11329n, aVar.f11330o)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f3452a.s();
        }

        private void m(long j10, m2.a aVar) {
            long f10 = e.f(aVar);
            if (f10 == -9223372036854775807L) {
                return;
            }
            k(j10, f10);
        }

        @Override // x1.e0
        public int a(i iVar, int i10, boolean z10, int i11) {
            return this.f3452a.f(iVar, i10, z10);
        }

        @Override // x1.e0
        public void b(a0 a0Var, int i10, int i11) {
            this.f3452a.d(a0Var, i10);
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            this.f3452a.c(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // x1.e0
        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(m1 m1Var) {
            this.f3452a.e(m1Var);
        }

        @Override // x1.e0
        public /* synthetic */ int f(i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f3455d;
            if (j10 == -9223372036854775807L || fVar.f16010h > j10) {
                this.f3455d = fVar.f16010h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f3455d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f16009g);
        }

        public void n() {
            this.f3452a.T();
        }
    }

    public e(y2.c cVar, b bVar, o3.b bVar2) {
        this.f3445s = cVar;
        this.f3441o = bVar;
        this.f3440n = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f3444r.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(m2.a aVar) {
        try {
            return m0.H0(m0.D(aVar.f11333r));
        } catch (h2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f3444r.get(Long.valueOf(j11));
        if (l10 != null && l10.longValue() <= j10) {
            return;
        }
        this.f3444r.put(Long.valueOf(j11), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f3447u) {
            this.f3448v = true;
            this.f3447u = false;
            this.f3441o.a();
        }
    }

    private void l() {
        this.f3441o.b(this.f3446t);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f3444r.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f3445s.f16872h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f3449w) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f3450a, aVar.f3451b);
        return true;
    }

    boolean j(long j10) {
        y2.c cVar = this.f3445s;
        boolean z10 = false;
        if (cVar.f16868d) {
            if (this.f3448v) {
                return true;
            }
            Map.Entry<Long, Long> e10 = e(cVar.f16872h);
            if (e10 != null && e10.getValue().longValue() < j10) {
                this.f3446t = e10.getKey().longValue();
                l();
                z10 = true;
            }
            if (z10) {
                i();
            }
            return z10;
        }
        return false;
    }

    public c k() {
        return new c(this.f3440n);
    }

    void m(f fVar) {
        this.f3447u = true;
    }

    boolean n(boolean z10) {
        if (this.f3445s.f16868d) {
            if (this.f3448v) {
                return true;
            }
            if (z10) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    public void o() {
        this.f3449w = true;
        this.f3443q.removeCallbacksAndMessages(null);
    }

    public void q(y2.c cVar) {
        this.f3448v = false;
        this.f3446t = -9223372036854775807L;
        this.f3445s = cVar;
        p();
    }
}
