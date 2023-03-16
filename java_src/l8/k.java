package l8;

import java.nio.ByteBuffer;
import l8.c;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final l8.c f11213a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11214b;

    /* renamed from: c  reason: collision with root package name */
    private final l f11215c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0159c f11216d;

    /* loaded from: classes.dex */
    private final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f11217a;

        /* renamed from: l8.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0161a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f11219a;

            C0161a(c.b bVar) {
                this.f11219a = bVar;
            }

            @Override // l8.k.d
            public void a(Object obj) {
                this.f11219a.a(k.this.f11215c.b(obj));
            }

            @Override // l8.k.d
            public void b(String str, String str2, Object obj) {
                this.f11219a.a(k.this.f11215c.d(str, str2, obj));
            }

            @Override // l8.k.d
            public void c() {
                this.f11219a.a(null);
            }
        }

        a(c cVar) {
            this.f11217a = cVar;
        }

        @Override // l8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f11217a.onMethodCall(k.this.f11215c.e(byteBuffer), new C0161a(bVar));
            } catch (RuntimeException e10) {
                x7.b.c("MethodChannel#" + k.this.f11214b, "Failed to handle method call", e10);
                bVar.a(k.this.f11215c.c("error", e10.getMessage(), null, x7.b.d(e10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final d f11221a;

        b(d dVar) {
            this.f11221a = dVar;
        }

        @Override // l8.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f11221a.c();
                } else {
                    try {
                        this.f11221a.a(k.this.f11215c.f(byteBuffer));
                    } catch (e e10) {
                        this.f11221a.b(e10.f11207n, e10.getMessage(), e10.f11208o);
                    }
                }
            } catch (RuntimeException e11) {
                x7.b.c("MethodChannel#" + k.this.f11214b, "Failed to handle method call result", e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(l8.c cVar, String str) {
        this(cVar, str, s.f11226b);
    }

    public k(l8.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(l8.c cVar, String str, l lVar, c.InterfaceC0159c interfaceC0159c) {
        this.f11213a = cVar;
        this.f11214b = str;
        this.f11215c = lVar;
        this.f11216d = interfaceC0159c;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f11213a.h(this.f11214b, this.f11215c.a(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f11216d != null) {
            this.f11213a.c(this.f11214b, cVar != null ? new a(cVar) : null, this.f11216d);
        } else {
            this.f11213a.f(this.f11214b, cVar != null ? new a(cVar) : null);
        }
    }
}
