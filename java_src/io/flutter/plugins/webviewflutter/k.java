package io.flutter.plugins.webviewflutter;

import android.util.Log;
import io.flutter.plugins.webviewflutter.k;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public interface a0 {
        void b(Long l10, Boolean bool);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(n<Boolean> nVar);

        void b(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b0 extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final b0 f9135d = new b0();

        private b0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f9136d = new c();

        private c() {
        }
    }

    /* loaded from: classes.dex */
    public interface c0 {
        void A(Long l10, Long l11);

        void a(Long l10);

        void b(Long l10, Boolean bool);

        Long c(Long l10);

        String d(Long l10);

        void e(Long l10, String str, String str2, String str3);

        void f(Long l10);

        void g(Long l10, Long l11);

        Boolean h(Long l10);

        void i(Long l10, String str, String str2, String str3, String str4, String str5);

        void j(Long l10);

        void k(Long l10, Long l11);

        void l(Long l10, Long l11);

        void m(Boolean bool);

        void n(Long l10, Long l11);

        void o(Long l10);

        void p(Long l10, String str, Map<String, String> map);

        Boolean q(Long l10);

        void r(Long l10, Boolean bool);

        String s(Long l10);

        void t(Long l10, String str, byte[] bArr);

        void u(Long l10, String str, n<String> nVar);

        void v(Long l10, Long l11, Long l12);

        void w(Long l10, Long l11);

        Long x(Long l10);

        e0 y(Long l10);

        void z(Long l10, Long l11, Long l12);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final l8.c f9137a;

        /* loaded from: classes.dex */
        public interface a<T> {
            void a(T t10);
        }

        public d(l8.c cVar) {
            this.f9137a = cVar;
        }

        static l8.i<Object> d() {
            return e.f9139d;
        }

        public void c(Long l10, final a<Void> aVar) {
            new l8.a(this.f9137a, "dev.flutter.pigeon.DownloadListenerFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.d.a.this.a(null);
                }
            });
        }

        public void g(Long l10, String str, String str2, String str3, String str4, Long l11, final a<Void> aVar) {
            new l8.a(this.f9137a, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", d()).d(new ArrayList(Arrays.asList(l10, str, str2, str3, str4, l11)), new a.e() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.d.a.this.a(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d0 extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final d0 f9138d = new d0();

        private d0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.g(b10, byteBuffer) : e0.a((Map) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof e0)) {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(128);
            p(byteArrayOutputStream, ((e0) obj).d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final e f9139d = new e();

        private e() {
        }
    }

    /* loaded from: classes.dex */
    public static class e0 {

        /* renamed from: a  reason: collision with root package name */
        private Long f9140a;

        /* renamed from: b  reason: collision with root package name */
        private Long f9141b;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f9142a;

            /* renamed from: b  reason: collision with root package name */
            private Long f9143b;

            public e0 a() {
                e0 e0Var = new e0();
                e0Var.b(this.f9142a);
                e0Var.c(this.f9143b);
                return e0Var;
            }

            public a b(Long l10) {
                this.f9142a = l10;
                return this;
            }

            public a c(Long l10) {
                this.f9143b = l10;
                return this;
            }
        }

        private e0() {
        }

        static e0 a(Map<String, Object> map) {
            Long valueOf;
            e0 e0Var = new e0();
            Object obj = map.get("x");
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e0Var.b(valueOf);
            Object obj2 = map.get("y");
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e0Var.c(l10);
            return e0Var;
        }

        public void b(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f9140a = l10;
        }

        public void c(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f9141b = l10;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("x", this.f9140a);
            hashMap.put("y", this.f9141b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(Long l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final g f9144d = new g();

        private g() {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        String a(String str);

        List<String> b(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final i f9145d = new i();

        private i() {
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private final l8.c f9146a;

        /* loaded from: classes.dex */
        public interface a<T> {
            void a(T t10);
        }

        public j(l8.c cVar) {
            this.f9146a = cVar;
        }

        static l8.i<Object> d() {
            return C0138k.f9147d;
        }

        public void c(Long l10, final a<Void> aVar) {
            new l8.a(this.f9146a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.j.a.this.a(null);
                }
            });
        }

        public void g(Long l10, String str, final a<Void> aVar) {
            new l8.a(this.f9146a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", d()).d(new ArrayList(Arrays.asList(l10, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.v
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.j.a.this.a(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.plugins.webviewflutter.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0138k extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final C0138k f9147d = new C0138k();

        private C0138k() {
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(Long l10, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final m f9148d = new m();

        private m() {
        }
    }

    /* loaded from: classes.dex */
    public interface n<T> {
        void a(T t10);
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        private final l8.c f9149a;

        /* loaded from: classes.dex */
        public interface a<T> {
            void a(T t10);
        }

        public o(l8.c cVar) {
            this.f9149a = cVar;
        }

        static l8.i<Object> d() {
            return p.f9150d;
        }

        public void c(Long l10, final a<Void> aVar) {
            new l8.a(this.f9149a, "dev.flutter.pigeon.WebChromeClientFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.a0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.o.a.this.a(null);
                }
            });
        }

        public void g(Long l10, Long l11, Long l12, final a<Void> aVar) {
            new l8.a(this.f9149a, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", d()).d(new ArrayList(Arrays.asList(l10, l11, l12)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.o.a.this.a(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class p extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final p f9150d = new p();

        private p() {
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void b(Long l10, Long l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class r extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final r f9151d = new r();

        private r() {
        }
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private Long f9152a;

        /* renamed from: b  reason: collision with root package name */
        private String f9153b;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f9154a;

            /* renamed from: b  reason: collision with root package name */
            private String f9155b;

            public s a() {
                s sVar = new s();
                sVar.c(this.f9154a);
                sVar.b(this.f9155b);
                return sVar;
            }

            public a b(String str) {
                this.f9155b = str;
                return this;
            }

            public a c(Long l10) {
                this.f9154a = l10;
                return this;
            }
        }

        private s() {
        }

        static s a(Map<String, Object> map) {
            Long valueOf;
            s sVar = new s();
            Object obj = map.get("errorCode");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(valueOf);
            sVar.b((String) map.get("description"));
            return sVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.f9153b = str;
        }

        public void c(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.f9152a = l10;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", this.f9152a);
            hashMap.put("description", this.f9153b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class t {

        /* renamed from: a  reason: collision with root package name */
        private String f9156a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f9157b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f9158c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f9159d;

        /* renamed from: e  reason: collision with root package name */
        private String f9160e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f9161f;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f9162a;

            /* renamed from: b  reason: collision with root package name */
            private Boolean f9163b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f9164c;

            /* renamed from: d  reason: collision with root package name */
            private Boolean f9165d;

            /* renamed from: e  reason: collision with root package name */
            private String f9166e;

            /* renamed from: f  reason: collision with root package name */
            private Map<String, String> f9167f;

            public t a() {
                t tVar = new t();
                tVar.g(this.f9162a);
                tVar.c(this.f9163b);
                tVar.d(this.f9164c);
                tVar.b(this.f9165d);
                tVar.e(this.f9166e);
                tVar.f(this.f9167f);
                return tVar;
            }

            public a b(Boolean bool) {
                this.f9165d = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f9163b = bool;
                return this;
            }

            public a d(Boolean bool) {
                this.f9164c = bool;
                return this;
            }

            public a e(String str) {
                this.f9166e = str;
                return this;
            }

            public a f(Map<String, String> map) {
                this.f9167f = map;
                return this;
            }

            public a g(String str) {
                this.f9162a = str;
                return this;
            }
        }

        private t() {
        }

        static t a(Map<String, Object> map) {
            t tVar = new t();
            tVar.g((String) map.get("url"));
            tVar.c((Boolean) map.get("isForMainFrame"));
            tVar.d((Boolean) map.get("isRedirect"));
            tVar.b((Boolean) map.get("hasGesture"));
            tVar.e((String) map.get("method"));
            tVar.f((Map) map.get("requestHeaders"));
            return tVar;
        }

        public void b(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.f9159d = bool;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.f9157b = bool;
        }

        public void d(Boolean bool) {
            this.f9158c = bool;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.f9160e = str;
        }

        public void f(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.f9161f = map;
        }

        public void g(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f9156a = str;
        }

        Map<String, Object> h() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.f9156a);
            hashMap.put("isForMainFrame", this.f9157b);
            hashMap.put("isRedirect", this.f9158c);
            hashMap.put("hasGesture", this.f9159d);
            hashMap.put("method", this.f9160e);
            hashMap.put("requestHeaders", this.f9161f);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a(Long l10);

        void b(Long l10, Long l11);

        void c(Long l10, Boolean bool);

        void d(Long l10, Boolean bool);

        void e(Long l10, Boolean bool);

        void f(Long l10, Boolean bool);

        void g(Long l10, Boolean bool);

        void h(Long l10, Boolean bool);

        void i(Long l10, Boolean bool);

        void j(Long l10, String str);

        void k(Long l10, Boolean bool);

        void l(Long l10, Boolean bool);

        void m(Long l10, Boolean bool);

        void n(Long l10, Boolean bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class v extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final v f9168d = new v();

        private v() {
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(Long l10);

        void b(Long l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class x extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final x f9169d = new x();

        private x() {
        }
    }

    /* loaded from: classes.dex */
    public static class y {

        /* renamed from: a  reason: collision with root package name */
        private final l8.c f9170a;

        /* loaded from: classes.dex */
        public interface a<T> {
            void a(T t10);
        }

        public y(l8.c cVar) {
            this.f9170a = cVar;
        }

        static l8.i<Object> i() {
            return z.f9171d;
        }

        public void h(Long l10, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.dispose", i()).d(new ArrayList(Arrays.asList(l10)), new a.e() { // from class: io.flutter.plugins.webviewflutter.b1
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void q(Long l10, Long l11, String str, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", i()).d(new ArrayList(Arrays.asList(l10, l11, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.w0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void r(Long l10, Long l11, String str, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", i()).d(new ArrayList(Arrays.asList(l10, l11, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void s(Long l10, Long l11, Long l12, String str, String str2, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", i()).d(new ArrayList(Arrays.asList(l10, l11, l12, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.y0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void t(Long l10, Long l11, t tVar, s sVar, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", i()).d(new ArrayList(Arrays.asList(l10, l11, tVar, sVar)), new a.e() { // from class: io.flutter.plugins.webviewflutter.a1
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void u(Long l10, Long l11, t tVar, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", i()).d(new ArrayList(Arrays.asList(l10, l11, tVar)), new a.e() { // from class: io.flutter.plugins.webviewflutter.v0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void v(Long l10, Long l11, String str, final a<Void> aVar) {
            new l8.a(this.f9170a, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", i()).d(new ArrayList(Arrays.asList(l10, l11, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.x0
                @Override // l8.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class z extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final z f9171d = new z();

        private z() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.g(b10, byteBuffer) : t.a((Map) f(byteBuffer)) : s.a((Map) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> h10;
            if (obj instanceof s) {
                byteArrayOutputStream.write(128);
                h10 = ((s) obj).d();
            } else if (!(obj instanceof t)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                h10 = ((t) obj).h();
            }
            p(byteArrayOutputStream, h10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
