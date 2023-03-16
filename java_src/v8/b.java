package v8;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: v8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0226b {
        void a();

        void b(e eVar);

        void c(j jVar);

        void d(f fVar);

        void e(i iVar);

        h f(i iVar);

        void g(h hVar);

        void h(i iVar);

        void i(g gVar);

        void j(i iVar);

        i k(d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends l8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f15734d = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return d.a((Map) f(byteBuffer));
                case -127:
                    return e.a((Map) f(byteBuffer));
                case -126:
                    return f.a((Map) f(byteBuffer));
                case -125:
                    return g.a((Map) f(byteBuffer));
                case -124:
                    return h.a((Map) f(byteBuffer));
                case -123:
                    return i.a((Map) f(byteBuffer));
                case -122:
                    return j.a((Map) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> d10;
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                d10 = ((d) obj).l();
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                d10 = ((e) obj).f();
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                d10 = ((f) obj).d();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(131);
                d10 = ((g) obj).f();
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(132);
                d10 = ((h) obj).f();
            } else if (!(obj instanceof i)) {
                if (!(obj instanceof j)) {
                    super.p(byteArrayOutputStream, obj);
                    return;
                }
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((j) obj).f());
                return;
            } else {
                byteArrayOutputStream.write(133);
                d10 = ((i) obj).d();
            }
            p(byteArrayOutputStream, d10);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private String f15735a;

        /* renamed from: b  reason: collision with root package name */
        private String f15736b;

        /* renamed from: c  reason: collision with root package name */
        private String f15737c;

        /* renamed from: d  reason: collision with root package name */
        private String f15738d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f15739e;

        private d() {
        }

        static d a(Map<String, Object> map) {
            d dVar = new d();
            dVar.g((String) map.get("asset"));
            dVar.k((String) map.get("uri"));
            dVar.j((String) map.get("packageName"));
            dVar.h((String) map.get("formatHint"));
            dVar.i((Map) map.get("httpHeaders"));
            return dVar;
        }

        public String b() {
            return this.f15735a;
        }

        public String c() {
            return this.f15738d;
        }

        public Map<String, String> d() {
            return this.f15739e;
        }

        public String e() {
            return this.f15737c;
        }

        public String f() {
            return this.f15736b;
        }

        public void g(String str) {
            this.f15735a = str;
        }

        public void h(String str) {
            this.f15738d = str;
        }

        public void i(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.f15739e = map;
        }

        public void j(String str) {
            this.f15737c = str;
        }

        public void k(String str) {
            this.f15736b = str;
        }

        Map<String, Object> l() {
            HashMap hashMap = new HashMap();
            hashMap.put("asset", this.f15735a);
            hashMap.put("uri", this.f15736b);
            hashMap.put("packageName", this.f15737c);
            hashMap.put("formatHint", this.f15738d);
            hashMap.put("httpHeaders", this.f15739e);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private Long f15740a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f15741b;

        private e() {
        }

        static e a(Map<String, Object> map) {
            Long valueOf;
            e eVar = new e();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.e(valueOf);
            eVar.d((Boolean) map.get("isLooping"));
            return eVar;
        }

        public Boolean b() {
            return this.f15741b;
        }

        public Long c() {
            return this.f15740a;
        }

        public void d(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isLooping\" is null.");
            }
            this.f15741b = bool;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f15740a = l10;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f15740a);
            hashMap.put("isLooping", this.f15741b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f15742a;

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.c((Boolean) map.get("mixWithOthers"));
            return fVar;
        }

        public Boolean b() {
            return this.f15742a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"mixWithOthers\" is null.");
            }
            this.f15742a = bool;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("mixWithOthers", this.f15742a);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private Long f15743a;

        /* renamed from: b  reason: collision with root package name */
        private Double f15744b;

        private g() {
        }

        static g a(Map<String, Object> map) {
            Long valueOf;
            g gVar = new g();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.e(valueOf);
            gVar.d((Double) map.get("speed"));
            return gVar;
        }

        public Double b() {
            return this.f15744b;
        }

        public Long c() {
            return this.f15743a;
        }

        public void d(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"speed\" is null.");
            }
            this.f15744b = d10;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f15743a = l10;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f15743a);
            hashMap.put("speed", this.f15744b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private Long f15745a;

        /* renamed from: b  reason: collision with root package name */
        private Long f15746b;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f15747a;

            /* renamed from: b  reason: collision with root package name */
            private Long f15748b;

            public h a() {
                h hVar = new h();
                hVar.e(this.f15747a);
                hVar.d(this.f15748b);
                return hVar;
            }

            public a b(Long l10) {
                this.f15748b = l10;
                return this;
            }

            public a c(Long l10) {
                this.f15747a = l10;
                return this;
            }
        }

        private h() {
        }

        static h a(Map<String, Object> map) {
            Long valueOf;
            h hVar = new h();
            Object obj = map.get("textureId");
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.e(valueOf);
            Object obj2 = map.get("position");
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            hVar.d(l10);
            return hVar;
        }

        public Long b() {
            return this.f15746b;
        }

        public Long c() {
            return this.f15745a;
        }

        public void d(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"position\" is null.");
            }
            this.f15746b = l10;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f15745a = l10;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f15745a);
            hashMap.put("position", this.f15746b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private Long f15749a;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f15750a;

            public i a() {
                i iVar = new i();
                iVar.c(this.f15750a);
                return iVar;
            }

            public a b(Long l10) {
                this.f15750a = l10;
                return this;
            }
        }

        private i() {
        }

        static i a(Map<String, Object> map) {
            Long valueOf;
            i iVar = new i();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.c(valueOf);
            return iVar;
        }

        public Long b() {
            return this.f15749a;
        }

        public void c(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f15749a = l10;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f15749a);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private Long f15751a;

        /* renamed from: b  reason: collision with root package name */
        private Double f15752b;

        private j() {
        }

        static j a(Map<String, Object> map) {
            Long valueOf;
            j jVar = new j();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.d(valueOf);
            jVar.e((Double) map.get("volume"));
            return jVar;
        }

        public Long b() {
            return this.f15751a;
        }

        public Double c() {
            return this.f15752b;
        }

        public void d(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f15751a = l10;
        }

        public void e(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"volume\" is null.");
            }
            this.f15752b = d10;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f15751a);
            hashMap.put("volume", this.f15752b);
            return hashMap;
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
