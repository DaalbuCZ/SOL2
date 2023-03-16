package o3;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o3.l;
import o3.u;
/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12099a;

    /* renamed from: b  reason: collision with root package name */
    private final List<p0> f12100b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final l f12101c;

    /* renamed from: d  reason: collision with root package name */
    private l f12102d;

    /* renamed from: e  reason: collision with root package name */
    private l f12103e;

    /* renamed from: f  reason: collision with root package name */
    private l f12104f;

    /* renamed from: g  reason: collision with root package name */
    private l f12105g;

    /* renamed from: h  reason: collision with root package name */
    private l f12106h;

    /* renamed from: i  reason: collision with root package name */
    private l f12107i;

    /* renamed from: j  reason: collision with root package name */
    private l f12108j;

    /* renamed from: k  reason: collision with root package name */
    private l f12109k;

    /* loaded from: classes.dex */
    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f12110a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f12111b;

        /* renamed from: c  reason: collision with root package name */
        private p0 f12112c;

        public a(Context context) {
            this(context, new u.b());
        }

        public a(Context context, l.a aVar) {
            this.f12110a = context.getApplicationContext();
            this.f12111b = aVar;
        }

        @Override // o3.l.a
        /* renamed from: b */
        public t a() {
            t tVar = new t(this.f12110a, this.f12111b.a());
            p0 p0Var = this.f12112c;
            if (p0Var != null) {
                tVar.i(p0Var);
            }
            return tVar;
        }
    }

    public t(Context context, l lVar) {
        this.f12099a = context.getApplicationContext();
        this.f12101c = (l) p3.a.e(lVar);
    }

    private void r(l lVar) {
        for (int i10 = 0; i10 < this.f12100b.size(); i10++) {
            lVar.i(this.f12100b.get(i10));
        }
    }

    private l s() {
        if (this.f12103e == null) {
            c cVar = new c(this.f12099a);
            this.f12103e = cVar;
            r(cVar);
        }
        return this.f12103e;
    }

    private l t() {
        if (this.f12104f == null) {
            h hVar = new h(this.f12099a);
            this.f12104f = hVar;
            r(hVar);
        }
        return this.f12104f;
    }

    private l u() {
        if (this.f12107i == null) {
            j jVar = new j();
            this.f12107i = jVar;
            r(jVar);
        }
        return this.f12107i;
    }

    private l v() {
        if (this.f12102d == null) {
            y yVar = new y();
            this.f12102d = yVar;
            r(yVar);
        }
        return this.f12102d;
    }

    private l w() {
        if (this.f12108j == null) {
            k0 k0Var = new k0(this.f12099a);
            this.f12108j = k0Var;
            r(k0Var);
        }
        return this.f12108j;
    }

    private l x() {
        if (this.f12105g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f12105g = lVar;
                r(lVar);
            } catch (ClassNotFoundException unused) {
                p3.r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f12105g == null) {
                this.f12105g = this.f12101c;
            }
        }
        return this.f12105g;
    }

    private l y() {
        if (this.f12106h == null) {
            q0 q0Var = new q0();
            this.f12106h = q0Var;
            r(q0Var);
        }
        return this.f12106h;
    }

    private void z(l lVar, p0 p0Var) {
        if (lVar != null) {
            lVar.i(p0Var);
        }
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        return ((l) p3.a.e(this.f12109k)).b(bArr, i10, i11);
    }

    @Override // o3.l
    public void close() {
        l lVar = this.f12109k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f12109k = null;
            }
        }
    }

    @Override // o3.l
    public Map<String, List<String>> f() {
        l lVar = this.f12109k;
        return lVar == null ? Collections.emptyMap() : lVar.f();
    }

    @Override // o3.l
    public void i(p0 p0Var) {
        p3.a.e(p0Var);
        this.f12101c.i(p0Var);
        this.f12100b.add(p0Var);
        z(this.f12102d, p0Var);
        z(this.f12103e, p0Var);
        z(this.f12104f, p0Var);
        z(this.f12105g, p0Var);
        z(this.f12106h, p0Var);
        z(this.f12107i, p0Var);
        z(this.f12108j, p0Var);
    }

    @Override // o3.l
    public Uri k() {
        l lVar = this.f12109k;
        if (lVar == null) {
            return null;
        }
        return lVar.k();
    }

    @Override // o3.l
    public long n(p pVar) {
        l t10;
        p3.a.f(this.f12109k == null);
        String scheme = pVar.f12034a.getScheme();
        if (p3.m0.u0(pVar.f12034a)) {
            String path = pVar.f12034a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                t10 = v();
            }
            t10 = s();
        } else {
            if (!"asset".equals(scheme)) {
                t10 = "content".equals(scheme) ? t() : "rtmp".equals(scheme) ? x() : "udp".equals(scheme) ? y() : "data".equals(scheme) ? u() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? w() : this.f12101c;
            }
            t10 = s();
        }
        this.f12109k = t10;
        return this.f12109k.n(pVar);
    }
}
