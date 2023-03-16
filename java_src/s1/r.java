package s1;

import android.content.Context;
import android.os.Looper;
import s1.j;
import s1.r;
import u2.u;
/* loaded from: classes.dex */
public interface r extends p2 {

    /* loaded from: classes.dex */
    public interface a {
        void E(boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class b {
        boolean A;
        boolean B;

        /* renamed from: a  reason: collision with root package name */
        final Context f13702a;

        /* renamed from: b  reason: collision with root package name */
        p3.d f13703b;

        /* renamed from: c  reason: collision with root package name */
        long f13704c;

        /* renamed from: d  reason: collision with root package name */
        a5.o<c3> f13705d;

        /* renamed from: e  reason: collision with root package name */
        a5.o<u.a> f13706e;

        /* renamed from: f  reason: collision with root package name */
        a5.o<n3.c0> f13707f;

        /* renamed from: g  reason: collision with root package name */
        a5.o<s1> f13708g;

        /* renamed from: h  reason: collision with root package name */
        a5.o<o3.f> f13709h;

        /* renamed from: i  reason: collision with root package name */
        a5.f<p3.d, t1.a> f13710i;

        /* renamed from: j  reason: collision with root package name */
        Looper f13711j;

        /* renamed from: k  reason: collision with root package name */
        p3.c0 f13712k;

        /* renamed from: l  reason: collision with root package name */
        u1.e f13713l;

        /* renamed from: m  reason: collision with root package name */
        boolean f13714m;

        /* renamed from: n  reason: collision with root package name */
        int f13715n;

        /* renamed from: o  reason: collision with root package name */
        boolean f13716o;

        /* renamed from: p  reason: collision with root package name */
        boolean f13717p;

        /* renamed from: q  reason: collision with root package name */
        int f13718q;

        /* renamed from: r  reason: collision with root package name */
        int f13719r;

        /* renamed from: s  reason: collision with root package name */
        boolean f13720s;

        /* renamed from: t  reason: collision with root package name */
        d3 f13721t;

        /* renamed from: u  reason: collision with root package name */
        long f13722u;

        /* renamed from: v  reason: collision with root package name */
        long f13723v;

        /* renamed from: w  reason: collision with root package name */
        r1 f13724w;

        /* renamed from: x  reason: collision with root package name */
        long f13725x;

        /* renamed from: y  reason: collision with root package name */
        long f13726y;

        /* renamed from: z  reason: collision with root package name */
        boolean f13727z;

        public b(final Context context) {
            this(context, new a5.o() { // from class: s1.u
                @Override // a5.o
                public final Object get() {
                    c3 f10;
                    f10 = r.b.f(context);
                    return f10;
                }
            }, new a5.o() { // from class: s1.w
                @Override // a5.o
                public final Object get() {
                    u.a g10;
                    g10 = r.b.g(context);
                    return g10;
                }
            });
        }

        private b(final Context context, a5.o<c3> oVar, a5.o<u.a> oVar2) {
            this(context, oVar, oVar2, new a5.o() { // from class: s1.v
                @Override // a5.o
                public final Object get() {
                    n3.c0 h10;
                    h10 = r.b.h(context);
                    return h10;
                }
            }, x.f13927n, new a5.o() { // from class: s1.t
                @Override // a5.o
                public final Object get() {
                    o3.f n10;
                    n10 = o3.s.n(context);
                    return n10;
                }
            }, s.f13733n);
        }

        private b(Context context, a5.o<c3> oVar, a5.o<u.a> oVar2, a5.o<n3.c0> oVar3, a5.o<s1> oVar4, a5.o<o3.f> oVar5, a5.f<p3.d, t1.a> fVar) {
            this.f13702a = context;
            this.f13705d = oVar;
            this.f13706e = oVar2;
            this.f13707f = oVar3;
            this.f13708g = oVar4;
            this.f13709h = oVar5;
            this.f13710i = fVar;
            this.f13711j = p3.m0.Q();
            this.f13713l = u1.e.f14907t;
            this.f13715n = 0;
            this.f13718q = 1;
            this.f13719r = 0;
            this.f13720s = true;
            this.f13721t = d3.f13355g;
            this.f13722u = 5000L;
            this.f13723v = 15000L;
            this.f13724w = new j.b().a();
            this.f13703b = p3.d.f12253a;
            this.f13725x = 500L;
            this.f13726y = 2000L;
            this.A = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c3 f(Context context) {
            return new m(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u.a g(Context context) {
            return new u2.j(context, new x1.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ n3.c0 h(Context context) {
            return new n3.m(context);
        }

        public r e() {
            p3.a.f(!this.B);
            this.B = true;
            return new w0(this, null);
        }
    }

    void c(u1.e eVar, boolean z10);

    m1 e();

    void z(u2.u uVar);
}
