package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class l {

    /* loaded from: classes.dex */
    public interface b {
        void d(String str, Boolean bool, h<Void> hVar);

        void e(String str, Boolean bool, h<Void> hVar);

        void f(String str, h<Void> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f8864d = new c();

        private c() {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(String str, f fVar, h<g> hVar);

        void b(h<List<g>> hVar);

        void c(h<f> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final e f8865d = new e();

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.g(b10, byteBuffer) : g.a((Map) f(byteBuffer)) : f.a((Map) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f10;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f10 = ((f) obj).w();
            } else if (!(obj instanceof g)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                f10 = ((g) obj).f();
            }
            p(byteArrayOutputStream, f10);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private String f8866a;

        /* renamed from: b  reason: collision with root package name */
        private String f8867b;

        /* renamed from: c  reason: collision with root package name */
        private String f8868c;

        /* renamed from: d  reason: collision with root package name */
        private String f8869d;

        /* renamed from: e  reason: collision with root package name */
        private String f8870e;

        /* renamed from: f  reason: collision with root package name */
        private String f8871f;

        /* renamed from: g  reason: collision with root package name */
        private String f8872g;

        /* renamed from: h  reason: collision with root package name */
        private String f8873h;

        /* renamed from: i  reason: collision with root package name */
        private String f8874i;

        /* renamed from: j  reason: collision with root package name */
        private String f8875j;

        /* renamed from: k  reason: collision with root package name */
        private String f8876k;

        /* renamed from: l  reason: collision with root package name */
        private String f8877l;

        /* renamed from: m  reason: collision with root package name */
        private String f8878m;

        /* renamed from: n  reason: collision with root package name */
        private String f8879n;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f8880a;

            /* renamed from: b  reason: collision with root package name */
            private String f8881b;

            /* renamed from: c  reason: collision with root package name */
            private String f8882c;

            /* renamed from: d  reason: collision with root package name */
            private String f8883d;

            /* renamed from: e  reason: collision with root package name */
            private String f8884e;

            /* renamed from: f  reason: collision with root package name */
            private String f8885f;

            /* renamed from: g  reason: collision with root package name */
            private String f8886g;

            /* renamed from: h  reason: collision with root package name */
            private String f8887h;

            /* renamed from: i  reason: collision with root package name */
            private String f8888i;

            /* renamed from: j  reason: collision with root package name */
            private String f8889j;

            /* renamed from: k  reason: collision with root package name */
            private String f8890k;

            /* renamed from: l  reason: collision with root package name */
            private String f8891l;

            /* renamed from: m  reason: collision with root package name */
            private String f8892m;

            /* renamed from: n  reason: collision with root package name */
            private String f8893n;

            public f a() {
                f fVar = new f();
                fVar.j(this.f8880a);
                fVar.l(this.f8881b);
                fVar.s(this.f8882c);
                fVar.t(this.f8883d);
                fVar.m(this.f8884e);
                fVar.n(this.f8885f);
                fVar.u(this.f8886g);
                fVar.r(this.f8887h);
                fVar.v(this.f8888i);
                fVar.o(this.f8889j);
                fVar.i(this.f8890k);
                fVar.q(this.f8891l);
                fVar.p(this.f8892m);
                fVar.k(this.f8893n);
                return fVar;
            }

            public a b(String str) {
                this.f8880a = str;
                return this;
            }

            public a c(String str) {
                this.f8881b = str;
                return this;
            }

            public a d(String str) {
                this.f8885f = str;
                return this;
            }

            public a e(String str) {
                this.f8882c = str;
                return this;
            }

            public a f(String str) {
                this.f8883d = str;
                return this;
            }

            public a g(String str) {
                this.f8886g = str;
                return this;
            }

            public a h(String str) {
                this.f8888i = str;
                return this;
            }
        }

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.j((String) map.get("apiKey"));
            fVar.l((String) map.get("appId"));
            fVar.s((String) map.get("messagingSenderId"));
            fVar.t((String) map.get("projectId"));
            fVar.m((String) map.get("authDomain"));
            fVar.n((String) map.get("databaseURL"));
            fVar.u((String) map.get("storageBucket"));
            fVar.r((String) map.get("measurementId"));
            fVar.v((String) map.get("trackingId"));
            fVar.o((String) map.get("deepLinkURLScheme"));
            fVar.i((String) map.get("androidClientId"));
            fVar.q((String) map.get("iosClientId"));
            fVar.p((String) map.get("iosBundleId"));
            fVar.k((String) map.get("appGroupId"));
            return fVar;
        }

        public String b() {
            return this.f8866a;
        }

        public String c() {
            return this.f8867b;
        }

        public String d() {
            return this.f8871f;
        }

        public String e() {
            return this.f8868c;
        }

        public String f() {
            return this.f8869d;
        }

        public String g() {
            return this.f8872g;
        }

        public String h() {
            return this.f8874i;
        }

        public void i(String str) {
            this.f8876k = str;
        }

        public void j(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f8866a = str;
        }

        public void k(String str) {
            this.f8879n = str;
        }

        public void l(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f8867b = str;
        }

        public void m(String str) {
            this.f8870e = str;
        }

        public void n(String str) {
            this.f8871f = str;
        }

        public void o(String str) {
            this.f8875j = str;
        }

        public void p(String str) {
            this.f8878m = str;
        }

        public void q(String str) {
            this.f8877l = str;
        }

        public void r(String str) {
            this.f8873h = str;
        }

        public void s(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f8868c = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f8869d = str;
        }

        public void u(String str) {
            this.f8872g = str;
        }

        public void v(String str) {
            this.f8874i = str;
        }

        Map<String, Object> w() {
            HashMap hashMap = new HashMap();
            hashMap.put("apiKey", this.f8866a);
            hashMap.put("appId", this.f8867b);
            hashMap.put("messagingSenderId", this.f8868c);
            hashMap.put("projectId", this.f8869d);
            hashMap.put("authDomain", this.f8870e);
            hashMap.put("databaseURL", this.f8871f);
            hashMap.put("storageBucket", this.f8872g);
            hashMap.put("measurementId", this.f8873h);
            hashMap.put("trackingId", this.f8874i);
            hashMap.put("deepLinkURLScheme", this.f8875j);
            hashMap.put("androidClientId", this.f8876k);
            hashMap.put("iosClientId", this.f8877l);
            hashMap.put("iosBundleId", this.f8878m);
            hashMap.put("appGroupId", this.f8879n);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private String f8894a;

        /* renamed from: b  reason: collision with root package name */
        private f f8895b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f8896c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f8897d;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f8898a;

            /* renamed from: b  reason: collision with root package name */
            private f f8899b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f8900c;

            /* renamed from: d  reason: collision with root package name */
            private Map<String, Object> f8901d;

            public g a() {
                g gVar = new g();
                gVar.c(this.f8898a);
                gVar.d(this.f8899b);
                gVar.b(this.f8900c);
                gVar.e(this.f8901d);
                return gVar;
            }

            public a b(Boolean bool) {
                this.f8900c = bool;
                return this;
            }

            public a c(String str) {
                this.f8898a = str;
                return this;
            }

            public a d(f fVar) {
                this.f8899b = fVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f8901d = map;
                return this;
            }
        }

        private g() {
        }

        static g a(Map<String, Object> map) {
            g gVar = new g();
            gVar.c((String) map.get("name"));
            Object obj = map.get("options");
            gVar.d(obj == null ? null : f.a((Map) obj));
            gVar.b((Boolean) map.get("isAutomaticDataCollectionEnabled"));
            gVar.e((Map) map.get("pluginConstants"));
            return gVar;
        }

        public void b(Boolean bool) {
            this.f8896c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f8894a = str;
        }

        public void d(f fVar) {
            if (fVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f8895b = fVar;
        }

        public void e(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f8897d = map;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f8894a);
            f fVar = this.f8895b;
            hashMap.put("options", fVar == null ? null : fVar.w());
            hashMap.put("isAutomaticDataCollectionEnabled", this.f8896c);
            hashMap.put("pluginConstants", this.f8897d);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public interface h<T> {
        void a(T t10);

        void b(Throwable th);
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
