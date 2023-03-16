package com.google.firebase.perf.config;

import android.content.Context;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final u6.a f5685d = u6.a.e();

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f5686e;

    /* renamed from: a  reason: collision with root package name */
    private final RemoteConfigManager f5687a;

    /* renamed from: b  reason: collision with root package name */
    private a7.f f5688b;

    /* renamed from: c  reason: collision with root package name */
    private x f5689c;

    public a(RemoteConfigManager remoteConfigManager, a7.f fVar, x xVar) {
        this.f5687a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f5688b = fVar == null ? new a7.f() : fVar;
        this.f5689c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(r6.a.f13067b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(float f10) {
        return 0.0f <= f10 && f10 <= 1.0f;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private a7.g<Boolean> b(v<Boolean> vVar) {
        return this.f5689c.c(vVar.a());
    }

    private a7.g<Float> c(v<Float> vVar) {
        return this.f5689c.e(vVar.a());
    }

    private a7.g<Long> d(v<Long> vVar) {
        return this.f5689c.g(vVar.a());
    }

    private a7.g<String> e(v<String> vVar) {
        return this.f5689c.h(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            if (f5686e == null) {
                f5686e = new a(null, null, null);
            }
            aVar = f5686e;
        }
        return aVar;
    }

    private boolean k() {
        Boolean d10;
        l e10 = l.e();
        a7.g<Boolean> u10 = u(e10);
        if (!u10.d()) {
            u10 = b(e10);
            if (!u10.d()) {
                d10 = e10.d();
                return d10.booleanValue();
            }
        } else if (this.f5687a.isLastFetchFailed()) {
            return false;
        } else {
            this.f5689c.n(e10.a(), u10.c().booleanValue());
        }
        d10 = u10.c();
        return d10.booleanValue();
    }

    private boolean l() {
        String d10;
        k e10 = k.e();
        a7.g<String> x10 = x(e10);
        if (x10.d()) {
            this.f5689c.m(e10.a(), x10.c());
        } else {
            x10 = e(e10);
            if (!x10.d()) {
                d10 = e10.d();
                return I(d10);
            }
        }
        d10 = x10.c();
        return I(d10);
    }

    private a7.g<Boolean> n(v<Boolean> vVar) {
        return this.f5688b.b(vVar.b());
    }

    private a7.g<Float> o(v<Float> vVar) {
        return this.f5688b.c(vVar.b());
    }

    private a7.g<Long> p(v<Long> vVar) {
        return this.f5688b.e(vVar.b());
    }

    private a7.g<Boolean> u(v<Boolean> vVar) {
        return this.f5687a.getBoolean(vVar.c());
    }

    private a7.g<Float> v(v<Float> vVar) {
        return this.f5687a.getFloat(vVar.c());
    }

    private a7.g<Long> w(v<Long> vVar) {
        return this.f5687a.getLong(vVar.c());
    }

    private a7.g<String> x(v<String> vVar) {
        return this.f5687a.getString(vVar.c());
    }

    public long A() {
        Long d10;
        o e10 = o.e();
        a7.g<Long> p10 = p(e10);
        if (!p10.d() || !M(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && M(p10.c().longValue())) {
                this.f5689c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !M(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long B() {
        Long d10;
        p e10 = p.e();
        a7.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f5689c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long C() {
        Long d10;
        q e10 = q.e();
        a7.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f5689c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public float D() {
        Float d10;
        r e10 = r.e();
        a7.g<Float> o10 = o(e10);
        if (o10.d()) {
            float floatValue = o10.c().floatValue() / 100.0f;
            if (L(floatValue)) {
                return floatValue;
            }
        }
        a7.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f5689c.k(e10.a(), v10.c().floatValue());
        } else {
            v10 = c(e10);
            if (!v10.d() || !L(v10.c().floatValue())) {
                d10 = e10.d();
                return d10.floatValue();
            }
        }
        d10 = v10.c();
        return d10.floatValue();
    }

    public long E() {
        Long d10;
        s e10 = s.e();
        a7.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f5689c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long F() {
        Long d10;
        t e10 = t.e();
        a7.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f5689c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public float G() {
        Float d10;
        u e10 = u.e();
        a7.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f5689c.k(e10.a(), v10.c().floatValue());
        } else {
            v10 = c(e10);
            if (!v10.d() || !L(v10.c().floatValue())) {
                d10 = e10.d();
                return d10.floatValue();
            }
        }
        d10 = v10.c();
        return d10.floatValue();
    }

    public boolean K() {
        Boolean j10 = j();
        return (j10 == null || j10.booleanValue()) && m();
    }

    public void O(Context context) {
        f5685d.i(a7.o.b(context));
        this.f5689c.j(context);
    }

    public void P(Boolean bool) {
        String a10;
        if (i().booleanValue() || (a10 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f5689c.n(a10, Boolean.TRUE.equals(bool));
        } else {
            this.f5689c.b(a10);
        }
    }

    public void Q(a7.f fVar) {
        this.f5688b = fVar;
    }

    public String a() {
        String f10;
        f e10 = f.e();
        if (r6.a.f13066a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long longValue = c10 != null ? ((Long) this.f5687a.getRemoteConfigValueOrDefault(c10, -1L)).longValue() : -1L;
        String a10 = e10.a();
        if (!f.g(longValue) || (f10 = f.f(longValue)) == null) {
            a7.g<String> e11 = e(e10);
            return e11.d() ? e11.c() : e10.d();
        }
        this.f5689c.m(a10, f10);
        return f10;
    }

    public float f() {
        Float d10;
        e e10 = e.e();
        a7.g<Float> o10 = o(e10);
        if (o10.d()) {
            float floatValue = o10.c().floatValue() / 100.0f;
            if (L(floatValue)) {
                return floatValue;
            }
        }
        a7.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f5689c.k(e10.a(), v10.c().floatValue());
        } else {
            v10 = c(e10);
            if (!v10.d() || !L(v10.c().floatValue())) {
                d10 = e10.d();
                return d10.floatValue();
            }
        }
        d10 = v10.c();
        return d10.floatValue();
    }

    public boolean h() {
        Boolean d10;
        d e10 = d.e();
        a7.g<Boolean> n10 = n(e10);
        if (!n10.d()) {
            n10 = u(e10);
            if (n10.d()) {
                this.f5689c.n(e10.a(), n10.c().booleanValue());
            } else {
                n10 = b(e10);
                if (!n10.d()) {
                    d10 = e10.d();
                    return d10.booleanValue();
                }
            }
        }
        d10 = n10.c();
        return d10.booleanValue();
    }

    public Boolean i() {
        b e10 = b.e();
        a7.g<Boolean> n10 = n(e10);
        return n10.d() ? n10.c() : e10.d();
    }

    public Boolean j() {
        Boolean c10;
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        a7.g<Boolean> b10 = b(d10);
        if (b10.d()) {
            c10 = b10.c();
        } else {
            a7.g<Boolean> n10 = n(d10);
            if (!n10.d()) {
                return null;
            }
            c10 = n10.c();
        }
        return c10;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        Long d10;
        g e10 = g.e();
        a7.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f5689c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long r() {
        Long d10;
        h e10 = h.e();
        a7.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f5689c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public float s() {
        Float d10;
        i e10 = i.e();
        a7.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f5689c.k(e10.a(), v10.c().floatValue());
        } else {
            v10 = c(e10);
            if (!v10.d() || !L(v10.c().floatValue())) {
                d10 = e10.d();
                return d10.floatValue();
            }
        }
        d10 = v10.c();
        return d10.floatValue();
    }

    public long t() {
        Long d10;
        j e10 = j.e();
        a7.g<Long> w10 = w(e10);
        if (w10.d() && N(w10.c().longValue())) {
            this.f5689c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !N(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long y() {
        Long d10;
        m e10 = m.e();
        a7.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f5689c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long z() {
        Long d10;
        n e10 = n.e();
        a7.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f5689c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }
}
