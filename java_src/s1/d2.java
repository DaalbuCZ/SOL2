package s1;

import android.os.Handler;
import b5.q;
import s1.l3;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    private final l3.b f13338a = new l3.b();

    /* renamed from: b  reason: collision with root package name */
    private final l3.d f13339b = new l3.d();

    /* renamed from: c  reason: collision with root package name */
    private final t1.a f13340c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f13341d;

    /* renamed from: e  reason: collision with root package name */
    private long f13342e;

    /* renamed from: f  reason: collision with root package name */
    private int f13343f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13344g;

    /* renamed from: h  reason: collision with root package name */
    private a2 f13345h;

    /* renamed from: i  reason: collision with root package name */
    private a2 f13346i;

    /* renamed from: j  reason: collision with root package name */
    private a2 f13347j;

    /* renamed from: k  reason: collision with root package name */
    private int f13348k;

    /* renamed from: l  reason: collision with root package name */
    private Object f13349l;

    /* renamed from: m  reason: collision with root package name */
    private long f13350m;

    public d2(t1.a aVar, Handler handler) {
        this.f13340c = aVar;
        this.f13341d = handler;
    }

    private static u.b A(l3 l3Var, Object obj, long j10, long j11, l3.d dVar, l3.b bVar) {
        l3Var.l(obj, bVar);
        l3Var.r(bVar.f13544p, dVar);
        int f10 = l3Var.f(obj);
        Object obj2 = obj;
        while (bVar.f13545q == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.C) {
                break;
            }
            l3Var.k(i10, bVar, true);
            obj2 = p3.a.e(bVar.f13543o);
            f10 = i10;
        }
        l3Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        return h10 == -1 ? new u.b(obj2, j11, bVar.g(j10)) : new u.b(obj2, h10, bVar.n(h10), j11);
    }

    private long C(l3 l3Var, Object obj) {
        int f10;
        int i10 = l3Var.l(obj, this.f13338a).f13544p;
        Object obj2 = this.f13349l;
        if (obj2 == null || (f10 = l3Var.f(obj2)) == -1 || l3Var.j(f10, this.f13338a).f13544p != i10) {
            a2 a2Var = this.f13345h;
            while (true) {
                if (a2Var == null) {
                    a2Var = this.f13345h;
                    while (a2Var != null) {
                        int f11 = l3Var.f(a2Var.f13285b);
                        if (f11 == -1 || l3Var.j(f11, this.f13338a).f13544p != i10) {
                            a2Var = a2Var.j();
                        }
                    }
                    long j10 = this.f13342e;
                    this.f13342e = 1 + j10;
                    if (this.f13345h == null) {
                        this.f13349l = obj;
                        this.f13350m = j10;
                    }
                    return j10;
                } else if (a2Var.f13285b.equals(obj)) {
                    break;
                } else {
                    a2Var = a2Var.j();
                }
            }
            return a2Var.f13289f.f13307a.f15359d;
        }
        return this.f13350m;
    }

    private boolean E(l3 l3Var) {
        a2 a2Var = this.f13345h;
        if (a2Var == null) {
            return true;
        }
        int f10 = l3Var.f(a2Var.f13285b);
        while (true) {
            f10 = l3Var.h(f10, this.f13338a, this.f13339b, this.f13343f, this.f13344g);
            while (a2Var.j() != null && !a2Var.f13289f.f13313g) {
                a2Var = a2Var.j();
            }
            a2 j10 = a2Var.j();
            if (f10 == -1 || j10 == null || l3Var.f(j10.f13285b) != f10) {
                break;
            }
            a2Var = j10;
        }
        boolean z10 = z(a2Var);
        a2Var.f13289f = r(l3Var, a2Var.f13289f);
        return !z10;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(b2 b2Var, b2 b2Var2) {
        return b2Var.f13308b == b2Var2.f13308b && b2Var.f13307a.equals(b2Var2.f13307a);
    }

    private b2 h(m2 m2Var) {
        return k(m2Var.f13616a, m2Var.f13617b, m2Var.f13618c, m2Var.f13633r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (r0.t(r0.r()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private s1.b2 i(s1.l3 r20, s1.a2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d2.i(s1.l3, s1.a2, long):s1.b2");
    }

    private b2 k(l3 l3Var, u.b bVar, long j10, long j11) {
        l3Var.l(bVar.f15356a, this.f13338a);
        boolean b10 = bVar.b();
        Object obj = bVar.f15356a;
        return b10 ? l(l3Var, obj, bVar.f15357b, bVar.f15358c, j10, bVar.f15359d) : m(l3Var, obj, j11, j10, bVar.f15359d);
    }

    private b2 l(l3 l3Var, Object obj, int i10, int i11, long j10, long j11) {
        u.b bVar = new u.b(obj, i10, i11, j11);
        long e10 = l3Var.l(bVar.f15356a, this.f13338a).e(bVar.f15357b, bVar.f15358c);
        long j12 = i11 == this.f13338a.n(i10) ? this.f13338a.j() : 0L;
        return new b2(bVar, (e10 == -9223372036854775807L || j12 < e10) ? j12 : Math.max(0L, e10 - 1), j10, -9223372036854775807L, e10, this.f13338a.t(bVar.f15357b), false, false, false);
    }

    private b2 m(l3 l3Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        l3Var.l(obj, this.f13338a);
        int g10 = this.f13338a.g(j16);
        int i10 = 1;
        l3.b bVar = this.f13338a;
        if (g10 == -1) {
            if (bVar.f() > 0) {
                l3.b bVar2 = this.f13338a;
                if (bVar2.t(bVar2.r())) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            if (bVar.t(g10)) {
                long i11 = this.f13338a.i(g10);
                l3.b bVar3 = this.f13338a;
                if (i11 == bVar3.f13545q && bVar3.s(g10)) {
                    z10 = true;
                    g10 = -1;
                }
            }
            z10 = false;
        }
        u.b bVar4 = new u.b(obj, j12, g10);
        boolean s10 = s(bVar4);
        boolean u10 = u(l3Var, bVar4);
        boolean t10 = t(l3Var, bVar4, s10);
        boolean z11 = g10 != -1 && this.f13338a.t(g10);
        if (g10 != -1) {
            j14 = this.f13338a.i(g10);
        } else if (!z10) {
            j13 = -9223372036854775807L;
            j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f13338a.f13545q : j13;
            if (j15 != -9223372036854775807L && j16 >= j15) {
                if (!t10 && z10) {
                    i10 = 0;
                }
                j16 = Math.max(0L, j15 - i10);
            }
            return new b2(bVar4, j16, j11, j13, j15, z11, s10, u10, t10);
        } else {
            j14 = this.f13338a.f13545q;
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!t10) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new b2(bVar4, j16, j11, j13, j15, z11, s10, u10, t10);
    }

    private long n(l3 l3Var, Object obj, int i10) {
        l3Var.l(obj, this.f13338a);
        long i11 = this.f13338a.i(i10);
        return i11 == Long.MIN_VALUE ? this.f13338a.f13545q : i11 + this.f13338a.l(i10);
    }

    private boolean s(u.b bVar) {
        return !bVar.b() && bVar.f15360e == -1;
    }

    private boolean t(l3 l3Var, u.b bVar, boolean z10) {
        int f10 = l3Var.f(bVar.f15356a);
        return !l3Var.r(l3Var.j(f10, this.f13338a).f13544p, this.f13339b).f13561v && l3Var.v(f10, this.f13338a, this.f13339b, this.f13343f, this.f13344g) && z10;
    }

    private boolean u(l3 l3Var, u.b bVar) {
        if (s(bVar)) {
            return l3Var.r(l3Var.l(bVar.f15356a, this.f13338a).f13544p, this.f13339b).C == l3Var.f(bVar.f15356a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(q.a aVar, u.b bVar) {
        this.f13340c.Z(aVar.h(), bVar);
    }

    private void x() {
        final q.a D = b5.q.D();
        for (a2 a2Var = this.f13345h; a2Var != null; a2Var = a2Var.j()) {
            D.a(a2Var.f13289f.f13307a);
        }
        a2 a2Var2 = this.f13346i;
        final u.b bVar = a2Var2 == null ? null : a2Var2.f13289f.f13307a;
        this.f13341d.post(new Runnable() { // from class: s1.c2
            @Override // java.lang.Runnable
            public final void run() {
                d2.this.w(D, bVar);
            }
        });
    }

    public u.b B(l3 l3Var, Object obj, long j10) {
        long C = C(l3Var, obj);
        l3Var.l(obj, this.f13338a);
        l3Var.r(this.f13338a.f13544p, this.f13339b);
        boolean z10 = false;
        for (int f10 = l3Var.f(obj); f10 >= this.f13339b.B; f10--) {
            l3Var.k(f10, this.f13338a, true);
            boolean z11 = this.f13338a.f() > 0;
            z10 |= z11;
            l3.b bVar = this.f13338a;
            if (bVar.h(bVar.f13545q) != -1) {
                obj = p3.a.e(this.f13338a.f13543o);
            }
            if (z10 && (!z11 || this.f13338a.f13545q != 0)) {
                break;
            }
        }
        return A(l3Var, obj, j10, C, this.f13339b, this.f13338a);
    }

    public boolean D() {
        a2 a2Var = this.f13347j;
        return a2Var == null || (!a2Var.f13289f.f13315i && a2Var.q() && this.f13347j.f13289f.f13311e != -9223372036854775807L && this.f13348k < 100);
    }

    public boolean F(l3 l3Var, long j10, long j11) {
        b2 b2Var;
        a2 a2Var = this.f13345h;
        a2 a2Var2 = null;
        while (a2Var != null) {
            b2 b2Var2 = a2Var.f13289f;
            if (a2Var2 != null) {
                b2 i10 = i(l3Var, a2Var2, j10);
                if (i10 != null && e(b2Var2, i10)) {
                    b2Var = i10;
                }
                return !z(a2Var2);
            }
            b2Var = r(l3Var, b2Var2);
            a2Var.f13289f = b2Var.a(b2Var2.f13309c);
            if (!d(b2Var2.f13311e, b2Var.f13311e)) {
                a2Var.A();
                long j12 = b2Var.f13311e;
                return (z(a2Var) || (a2Var == this.f13346i && !a2Var.f13289f.f13312f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : a2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : a2Var.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            a2Var2 = a2Var;
            a2Var = a2Var.j();
        }
        return true;
    }

    public boolean G(l3 l3Var, int i10) {
        this.f13343f = i10;
        return E(l3Var);
    }

    public boolean H(l3 l3Var, boolean z10) {
        this.f13344g = z10;
        return E(l3Var);
    }

    public a2 b() {
        a2 a2Var = this.f13345h;
        if (a2Var == null) {
            return null;
        }
        if (a2Var == this.f13346i) {
            this.f13346i = a2Var.j();
        }
        this.f13345h.t();
        int i10 = this.f13348k - 1;
        this.f13348k = i10;
        if (i10 == 0) {
            this.f13347j = null;
            a2 a2Var2 = this.f13345h;
            this.f13349l = a2Var2.f13285b;
            this.f13350m = a2Var2.f13289f.f13307a.f15359d;
        }
        this.f13345h = this.f13345h.j();
        x();
        return this.f13345h;
    }

    public a2 c() {
        a2 a2Var = this.f13346i;
        p3.a.f((a2Var == null || a2Var.j() == null) ? false : true);
        this.f13346i = this.f13346i.j();
        x();
        return this.f13346i;
    }

    public void f() {
        if (this.f13348k == 0) {
            return;
        }
        a2 a2Var = (a2) p3.a.h(this.f13345h);
        this.f13349l = a2Var.f13285b;
        this.f13350m = a2Var.f13289f.f13307a.f15359d;
        while (a2Var != null) {
            a2Var.t();
            a2Var = a2Var.j();
        }
        this.f13345h = null;
        this.f13347j = null;
        this.f13346i = null;
        this.f13348k = 0;
        x();
    }

    public a2 g(a3[] a3VarArr, n3.c0 c0Var, o3.b bVar, g2 g2Var, b2 b2Var, n3.d0 d0Var) {
        a2 a2Var = this.f13347j;
        a2 a2Var2 = new a2(a3VarArr, a2Var == null ? 1000000000000L : (a2Var.l() + this.f13347j.f13289f.f13311e) - b2Var.f13308b, c0Var, bVar, g2Var, b2Var, d0Var);
        a2 a2Var3 = this.f13347j;
        if (a2Var3 != null) {
            a2Var3.w(a2Var2);
        } else {
            this.f13345h = a2Var2;
            this.f13346i = a2Var2;
        }
        this.f13349l = null;
        this.f13347j = a2Var2;
        this.f13348k++;
        x();
        return a2Var2;
    }

    public a2 j() {
        return this.f13347j;
    }

    public b2 o(long j10, m2 m2Var) {
        a2 a2Var = this.f13347j;
        return a2Var == null ? h(m2Var) : i(m2Var.f13616a, a2Var, j10);
    }

    public a2 p() {
        return this.f13345h;
    }

    public a2 q() {
        return this.f13346i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1.b2 r(s1.l3 r19, s1.b2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            u2.u$b r3 = r2.f13307a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            u2.u$b r4 = r2.f13307a
            java.lang.Object r4 = r4.f15356a
            s1.l3$b r5 = r0.f13338a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f15360e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            s1.l3$b r7 = r0.f13338a
            long r7 = r7.i(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            s1.l3$b r1 = r0.f13338a
            int r5 = r3.f15357b
            int r6 = r3.f15358c
            long r5 = r1.e(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            s1.l3$b r1 = r0.f13338a
            long r5 = r1.m()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            s1.l3$b r1 = r0.f13338a
            int r4 = r3.f15357b
            boolean r1 = r1.t(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f15360e
            if (r1 == r4) goto L7a
            s1.l3$b r4 = r0.f13338a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            s1.b2 r15 = new s1.b2
            long r4 = r2.f13308b
            long r1 = r2.f13309c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d2.r(s1.l3, s1.b2):s1.b2");
    }

    public boolean v(u2.r rVar) {
        a2 a2Var = this.f13347j;
        return a2Var != null && a2Var.f13284a == rVar;
    }

    public void y(long j10) {
        a2 a2Var = this.f13347j;
        if (a2Var != null) {
            a2Var.s(j10);
        }
    }

    public boolean z(a2 a2Var) {
        boolean z10 = false;
        p3.a.f(a2Var != null);
        if (a2Var.equals(this.f13347j)) {
            return false;
        }
        this.f13347j = a2Var;
        while (a2Var.j() != null) {
            a2Var = a2Var.j();
            if (a2Var == this.f13346i) {
                this.f13346i = this.f13345h;
                z10 = true;
            }
            a2Var.t();
            this.f13348k--;
        }
        this.f13347j.w(null);
        x();
        return z10;
    }
}
