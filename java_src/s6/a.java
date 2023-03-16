package s6;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import e1.g;
import f5.e;
import t6.d;
import t6.f;
import t6.h;
/* loaded from: classes.dex */
public final class a implements s6.b {

    /* renamed from: a  reason: collision with root package name */
    private x8.a<e> f14361a;

    /* renamed from: b  reason: collision with root package name */
    private x8.a<i6.b<c>> f14362b;

    /* renamed from: c  reason: collision with root package name */
    private x8.a<j6.e> f14363c;

    /* renamed from: d  reason: collision with root package name */
    private x8.a<i6.b<g>> f14364d;

    /* renamed from: e  reason: collision with root package name */
    private x8.a<RemoteConfigManager> f14365e;

    /* renamed from: f  reason: collision with root package name */
    private x8.a<com.google.firebase.perf.config.a> f14366f;

    /* renamed from: g  reason: collision with root package name */
    private x8.a<SessionManager> f14367g;

    /* renamed from: h  reason: collision with root package name */
    private x8.a<r6.e> f14368h;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private t6.a f14369a;

        private b() {
        }

        public s6.b a() {
            r7.b.a(this.f14369a, t6.a.class);
            return new a(this.f14369a);
        }

        public b b(t6.a aVar) {
            this.f14369a = (t6.a) r7.b.b(aVar);
            return this;
        }
    }

    private a(t6.a aVar) {
        c(aVar);
    }

    public static b b() {
        return new b();
    }

    private void c(t6.a aVar) {
        this.f14361a = t6.c.a(aVar);
        this.f14362b = t6.e.a(aVar);
        this.f14363c = d.a(aVar);
        this.f14364d = h.a(aVar);
        this.f14365e = f.a(aVar);
        this.f14366f = t6.b.a(aVar);
        t6.g a10 = t6.g.a(aVar);
        this.f14367g = a10;
        this.f14368h = r7.a.a(r6.g.a(this.f14361a, this.f14362b, this.f14363c, this.f14364d, this.f14365e, this.f14366f, a10));
    }

    @Override // s6.b
    public r6.e a() {
        return this.f14368h.get();
    }
}
