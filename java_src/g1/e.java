package g1;

import android.content.Context;
import g1.v;
import java.util.concurrent.Executor;
import n1.x;
import n1.y;
import o1.m0;
import o1.n0;
import o1.u0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: n  reason: collision with root package name */
    private x8.a<Executor> f7419n;

    /* renamed from: o  reason: collision with root package name */
    private x8.a<Context> f7420o;

    /* renamed from: p  reason: collision with root package name */
    private x8.a f7421p;

    /* renamed from: q  reason: collision with root package name */
    private x8.a f7422q;

    /* renamed from: r  reason: collision with root package name */
    private x8.a f7423r;

    /* renamed from: s  reason: collision with root package name */
    private x8.a<String> f7424s;

    /* renamed from: t  reason: collision with root package name */
    private x8.a<m0> f7425t;

    /* renamed from: u  reason: collision with root package name */
    private x8.a<n1.g> f7426u;

    /* renamed from: v  reason: collision with root package name */
    private x8.a<y> f7427v;

    /* renamed from: w  reason: collision with root package name */
    private x8.a<m1.c> f7428w;

    /* renamed from: x  reason: collision with root package name */
    private x8.a<n1.s> f7429x;

    /* renamed from: y  reason: collision with root package name */
    private x8.a<n1.w> f7430y;

    /* renamed from: z  reason: collision with root package name */
    private x8.a<u> f7431z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements v.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f7432a;

        private b() {
        }

        @Override // g1.v.a
        public v a() {
            i1.d.a(this.f7432a, Context.class);
            return new e(this.f7432a);
        }

        @Override // g1.v.a
        /* renamed from: c */
        public b b(Context context) {
            this.f7432a = (Context) i1.d.b(context);
            return this;
        }
    }

    private e(Context context) {
        f(context);
    }

    public static v.a c() {
        return new b();
    }

    private void f(Context context) {
        this.f7419n = i1.a.a(k.a());
        i1.b a10 = i1.c.a(context);
        this.f7420o = a10;
        h1.j a11 = h1.j.a(a10, q1.c.a(), q1.d.a());
        this.f7421p = a11;
        this.f7422q = i1.a.a(h1.l.a(this.f7420o, a11));
        this.f7423r = u0.a(this.f7420o, o1.g.a(), o1.i.a());
        this.f7424s = i1.a.a(o1.h.a(this.f7420o));
        this.f7425t = i1.a.a(n0.a(q1.c.a(), q1.d.a(), o1.j.a(), this.f7423r, this.f7424s));
        m1.g b10 = m1.g.b(q1.c.a());
        this.f7426u = b10;
        m1.i a12 = m1.i.a(this.f7420o, this.f7425t, b10, q1.d.a());
        this.f7427v = a12;
        x8.a<Executor> aVar = this.f7419n;
        x8.a aVar2 = this.f7422q;
        x8.a<m0> aVar3 = this.f7425t;
        this.f7428w = m1.d.a(aVar, aVar2, a12, aVar3, aVar3);
        x8.a<Context> aVar4 = this.f7420o;
        x8.a aVar5 = this.f7422q;
        x8.a<m0> aVar6 = this.f7425t;
        this.f7429x = n1.t.a(aVar4, aVar5, aVar6, this.f7427v, this.f7419n, aVar6, q1.c.a(), q1.d.a(), this.f7425t);
        x8.a<Executor> aVar7 = this.f7419n;
        x8.a<m0> aVar8 = this.f7425t;
        this.f7430y = x.a(aVar7, aVar8, this.f7427v, aVar8);
        this.f7431z = i1.a.a(w.a(q1.c.a(), q1.d.a(), this.f7428w, this.f7429x, this.f7430y));
    }

    @Override // g1.v
    o1.d a() {
        return this.f7425t.get();
    }

    @Override // g1.v
    u b() {
        return this.f7431z.get();
    }
}
