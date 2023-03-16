package v8;

import android.content.Context;
import android.os.Build;
import android.util.LongSparseArray;
import c8.a;
import io.flutter.view.d;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import v8.b;
/* loaded from: classes.dex */
public class t implements c8.a, b.InterfaceC0226b {

    /* renamed from: o  reason: collision with root package name */
    private a f15786o;

    /* renamed from: n  reason: collision with root package name */
    private final LongSparseArray<p> f15785n = new LongSparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    private q f15787p = new q();

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f15788a;

        /* renamed from: b  reason: collision with root package name */
        private final l8.c f15789b;

        /* renamed from: c  reason: collision with root package name */
        private final c f15790c;

        /* renamed from: d  reason: collision with root package name */
        private final b f15791d;

        /* renamed from: e  reason: collision with root package name */
        private final io.flutter.view.d f15792e;

        a(Context context, l8.c cVar, c cVar2, b bVar, io.flutter.view.d dVar) {
            this.f15788a = context;
            this.f15789b = cVar;
            this.f15790c = cVar2;
            this.f15791d = bVar;
            this.f15792e = dVar;
        }

        void f(t tVar, l8.c cVar) {
            n.x(cVar, tVar);
        }

        void g(l8.c cVar) {
            n.x(cVar, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        String a(String str);
    }

    private void l() {
        for (int i10 = 0; i10 < this.f15785n.size(); i10++) {
            this.f15785n.valueAt(i10).b();
        }
        this.f15785n.clear();
    }

    @Override // v8.b.InterfaceC0226b
    public void a() {
        l();
    }

    @Override // v8.b.InterfaceC0226b
    public void b(b.e eVar) {
        this.f15785n.get(eVar.c().longValue()).k(eVar.b().booleanValue());
    }

    @Override // v8.b.InterfaceC0226b
    public void c(b.j jVar) {
        this.f15785n.get(jVar.b().longValue()).n(jVar.c().doubleValue());
    }

    @Override // v8.b.InterfaceC0226b
    public void d(b.f fVar) {
        this.f15787p.f15782a = fVar.b().booleanValue();
    }

    @Override // v8.b.InterfaceC0226b
    public void e(b.i iVar) {
        this.f15785n.get(iVar.b().longValue()).b();
        this.f15785n.remove(iVar.b().longValue());
    }

    @Override // v8.b.InterfaceC0226b
    public b.h f(b.i iVar) {
        p pVar = this.f15785n.get(iVar.b().longValue());
        b.h a10 = new b.h.a().b(Long.valueOf(pVar.c())).c(iVar.b()).a();
        pVar.h();
        return a10;
    }

    @Override // v8.b.InterfaceC0226b
    public void g(b.h hVar) {
        this.f15785n.get(hVar.c().longValue()).g(hVar.b().intValue());
    }

    @Override // v8.b.InterfaceC0226b
    public void h(b.i iVar) {
        this.f15785n.get(iVar.b().longValue()).f();
    }

    @Override // v8.b.InterfaceC0226b
    public void i(b.g gVar) {
        this.f15785n.get(gVar.c().longValue()).l(gVar.b().doubleValue());
    }

    @Override // v8.b.InterfaceC0226b
    public void j(b.i iVar) {
        this.f15785n.get(iVar.b().longValue()).e();
    }

    @Override // v8.b.InterfaceC0226b
    public b.i k(b.d dVar) {
        p pVar;
        d.c a10 = this.f15786o.f15792e.a();
        l8.c cVar = this.f15786o.f15789b;
        l8.d dVar2 = new l8.d(cVar, "flutter.io/videoPlayer/videoEvents" + a10.e());
        if (dVar.b() != null) {
            String a11 = dVar.e() != null ? this.f15786o.f15791d.a(dVar.b(), dVar.e()) : this.f15786o.f15790c.a(dVar.b());
            Context context = this.f15786o.f15788a;
            pVar = new p(context, dVar2, a10, "asset:///" + a11, null, null, this.f15787p);
        } else {
            pVar = new p(this.f15786o.f15788a, dVar2, a10, dVar.f(), dVar.c(), dVar.d(), this.f15787p);
        }
        this.f15785n.put(a10.e(), pVar);
        return new b.i.a().b(Long.valueOf(a10.e())).a();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(new v8.a());
            } catch (KeyManagementException | NoSuchAlgorithmException e10) {
                x7.b.h("VideoPlayerPlugin", "Failed to enable TLSv1.1 and TLSv1.2 Protocols for API level 19 and below.\nFor more information about Socket Security, please consult the following link:\nhttps://developer.android.com/reference/javax/net/ssl/SSLSocket", e10);
            }
        }
        x7.a e11 = x7.a.e();
        Context a10 = bVar.a();
        l8.c b10 = bVar.b();
        final a8.f c10 = e11.c();
        Objects.requireNonNull(c10);
        c cVar = new c() { // from class: v8.s
            @Override // v8.t.c
            public final String a(String str) {
                return a8.f.this.k(str);
            }
        };
        final a8.f c11 = e11.c();
        Objects.requireNonNull(c11);
        a aVar = new a(a10, b10, cVar, new b() { // from class: v8.r
            @Override // v8.t.b
            public final String a(String str, String str2) {
                return a8.f.this.l(str, str2);
            }
        }, bVar.e());
        this.f15786o = aVar;
        aVar.f(this, bVar.b());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f15786o == null) {
            x7.b.i("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f15786o.g(bVar.b());
        this.f15786o = null;
        a();
    }
}
