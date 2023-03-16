package v8;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import io.flutter.view.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.d;
import o3.l;
import o3.t;
import o3.u;
import p3.m0;
import q3.z;
import s1.l2;
import s1.l3;
import s1.m1;
import s1.o2;
import s1.p2;
import s1.q3;
import s1.r;
import s1.r2;
import s1.u1;
import s1.z1;
import u1.e;
import u2.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private s1.r f15770a;

    /* renamed from: b  reason: collision with root package name */
    private Surface f15771b;

    /* renamed from: c  reason: collision with root package name */
    private final d.c f15772c;

    /* renamed from: d  reason: collision with root package name */
    private o f15773d;

    /* renamed from: e  reason: collision with root package name */
    private final l8.d f15774e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15775f = false;

    /* renamed from: g  reason: collision with root package name */
    private final q f15776g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.InterfaceC0160d {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ o f15777n;

        a(o oVar) {
            this.f15777n = oVar;
        }

        @Override // l8.d.InterfaceC0160d
        public void a(Object obj, d.b bVar) {
            this.f15777n.f(bVar);
        }

        @Override // l8.d.InterfaceC0160d
        public void b(Object obj) {
            this.f15777n.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements p2.d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15779a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f15780b;

        b(o oVar) {
            this.f15780b = oVar;
        }

        @Override // s1.p2.d
        public /* synthetic */ void A(int i10) {
            r2.p(this, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void B(boolean z10, int i10) {
            r2.r(this, z10, i10);
        }

        public void C(boolean z10) {
            if (this.f15779a != z10) {
                this.f15779a = z10;
                HashMap hashMap = new HashMap();
                hashMap.put("event", this.f15779a ? "bufferingStart" : "bufferingEnd");
                this.f15780b.a(hashMap);
            }
        }

        @Override // s1.p2.d
        public /* synthetic */ void D(boolean z10) {
            r2.j(this, z10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void E(int i10) {
            r2.s(this, i10);
        }

        @Override // s1.p2.d
        public void F(l2 l2Var) {
            C(false);
            o oVar = this.f15780b;
            if (oVar != null) {
                oVar.b("VideoError", "Video player had error " + l2Var, null);
            }
        }

        @Override // s1.p2.d
        public /* synthetic */ void K(boolean z10) {
            r2.h(this, z10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void L() {
            r2.u(this);
        }

        @Override // s1.p2.d
        public /* synthetic */ void M() {
            r2.w(this);
        }

        @Override // s1.p2.d
        public /* synthetic */ void N(q3 q3Var) {
            r2.A(this, q3Var);
        }

        @Override // s1.p2.d
        public /* synthetic */ void O(p2.b bVar) {
            r2.b(this, bVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void R(z1 z1Var) {
            r2.l(this, z1Var);
        }

        @Override // s1.p2.d
        public /* synthetic */ void S(float f10) {
            r2.C(this, f10);
        }

        @Override // s1.p2.d
        public void W(int i10) {
            if (i10 == 2) {
                C(true);
                p.this.h();
            } else if (i10 == 3) {
                p pVar = p.this;
                if (!pVar.f15775f) {
                    pVar.f15775f = true;
                    pVar.i();
                }
            } else if (i10 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                this.f15780b.a(hashMap);
            }
            if (i10 != 2) {
                C(false);
            }
        }

        @Override // s1.p2.d
        public /* synthetic */ void X(boolean z10, int i10) {
            r2.n(this, z10, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void b(boolean z10) {
            r2.x(this, z10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void b0(p2.e eVar, p2.e eVar2, int i10) {
            r2.t(this, eVar, eVar2, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void d(d3.e eVar) {
            r2.c(this, eVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void d0(l2 l2Var) {
            r2.q(this, l2Var);
        }

        @Override // s1.p2.d
        public /* synthetic */ void g0(l3 l3Var, int i10) {
            r2.z(this, l3Var, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void h(int i10) {
            r2.v(this, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void h0(int i10, int i11) {
            r2.y(this, i10, i11);
        }

        @Override // s1.p2.d
        public /* synthetic */ void i0(u1 u1Var, int i10) {
            r2.k(this, u1Var, i10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void j(List list) {
            r2.d(this, list);
        }

        @Override // s1.p2.d
        public /* synthetic */ void j0(p2 p2Var, p2.c cVar) {
            r2.g(this, p2Var, cVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void l0(s1.o oVar) {
            r2.e(this, oVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void n0(u1.e eVar) {
            r2.a(this, eVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void o(z zVar) {
            r2.B(this, zVar);
        }

        @Override // s1.p2.d
        public /* synthetic */ void o0(int i10, boolean z10) {
            r2.f(this, i10, z10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void p(o2 o2Var) {
            r2.o(this, o2Var);
        }

        @Override // s1.p2.d
        public /* synthetic */ void p0(boolean z10) {
            r2.i(this, z10);
        }

        @Override // s1.p2.d
        public /* synthetic */ void x(k2.a aVar) {
            r2.m(this, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, l8.d dVar, d.c cVar, String str, String str2, Map<String, String> map, q qVar) {
        u.b bVar;
        this.f15774e = dVar;
        this.f15772c = cVar;
        this.f15776g = qVar;
        s1.r e10 = new r.b(context).e();
        Uri parse = Uri.parse(str);
        if (d(parse)) {
            u.b c10 = new u.b().e("ExoPlayer").c(true);
            bVar = c10;
            if (map != null) {
                bVar = c10;
                if (!map.isEmpty()) {
                    c10.d(map);
                    bVar = c10;
                }
            }
        } else {
            bVar = new t.a(context);
        }
        e10.z(a(parse, bVar, str2, context));
        e10.b();
        m(e10, new o());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private u2.u a(Uri uri, l.a aVar, String str, Context context) {
        char c10;
        int i10 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case 3680:
                    if (str.equals("ss")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 103407:
                    if (str.equals("hls")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3075986:
                    if (str.equals("dash")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 1;
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 4;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = m0.m0(uri);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        return new i0.b(aVar).b(u1.d(uri));
                    }
                    throw new IllegalStateException("Unsupported type: " + i10);
                }
                return new HlsMediaSource.Factory(aVar).a(u1.d(uri));
            }
            return new SsMediaSource.Factory(new a.C0076a(aVar), new t.a(context, aVar)).a(u1.d(uri));
        }
        return new DashMediaSource.Factory(new c.a(aVar), new t.a(context, aVar)).a(u1.d(uri));
    }

    private static boolean d(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    private static void j(s1.r rVar, boolean z10) {
        rVar.c(new e.C0221e().c(3).a(), !z10);
    }

    private void m(s1.r rVar, o oVar) {
        this.f15770a = rVar;
        this.f15773d = oVar;
        this.f15774e.d(new a(oVar));
        Surface surface = new Surface(this.f15772c.d());
        this.f15771b = surface;
        rVar.i(surface);
        j(rVar, this.f15776g.f15782a);
        rVar.l(new b(oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f15775f) {
            this.f15770a.stop();
        }
        this.f15772c.a();
        this.f15774e.d(null);
        Surface surface = this.f15771b;
        if (surface != null) {
            surface.release();
        }
        s1.r rVar = this.f15770a;
        if (rVar != null) {
            rVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return this.f15770a.I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f15770a.h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f15770a.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f15770a.H(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.f15770a.o()))));
        this.f15773d.a(hashMap);
    }

    void i() {
        if (this.f15775f) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.f15770a.E()));
            if (this.f15770a.e() != null) {
                m1 e10 = this.f15770a.e();
                int i10 = e10.D;
                int i11 = e10.E;
                int i12 = e10.G;
                if (i12 == 90 || i12 == 270) {
                    i10 = this.f15770a.e().E;
                    i11 = this.f15770a.e().D;
                }
                hashMap.put("width", Integer.valueOf(i10));
                hashMap.put("height", Integer.valueOf(i11));
                if (i12 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i12));
                }
            }
            this.f15773d.a(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z10) {
        this.f15770a.x(z10 ? 2 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(double d10) {
        this.f15770a.d(new o2((float) d10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(double d10) {
        this.f15770a.f((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
