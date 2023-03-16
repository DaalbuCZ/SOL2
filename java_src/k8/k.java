package k8;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k8.k;
import l8.k;
import l8.s;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final l8.k f10769a;

    /* renamed from: b  reason: collision with root package name */
    private g f10770b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f10771c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        private void b(l8.j jVar, k.d dVar) {
            try {
                k.this.f10770b.e(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void c(l8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z10 = true;
            boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z11) {
                    k.this.f10770b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z10 = false;
                    }
                    long f10 = k.this.f10770b.f(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z10 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                    if (f10 != -2) {
                        dVar.a(Long.valueOf(f10));
                        return;
                    } else if (!z10) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void d(l8.j jVar, k.d dVar) {
            try {
                k.this.f10770b.g(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f10773a));
            hashMap.put("height", Double.valueOf(cVar.f10774b));
            dVar.a(hashMap);
        }

        private void f(l8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f10770b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void g(l8.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f10770b.h(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: k8.j
                    @Override // k8.k.b
                    public final void a(k.c cVar) {
                        k.a.e(k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void h(l8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f10770b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void i(l8.j jVar, k.d dVar) {
            try {
                k.this.f10770b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void j(l8.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                k.this.f10770b.i(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e10) {
                e = e10;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e11) {
                e = e11;
                dVar2.b("error", k.c(e), null);
            }
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            if (k.this.f10770b == null) {
                return;
            }
            x7.b.f("PlatformViewsChannel", "Received '" + jVar.f11211a + "' message.");
            String str = jVar.f11211a;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1019779949:
                    if (str.equals("offset")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c(jVar, dVar);
                    return;
                case 1:
                    f(jVar, dVar);
                    return;
                case 2:
                    g(jVar, dVar);
                    return;
                case 3:
                    b(jVar, dVar);
                    return;
                case 4:
                    i(jVar, dVar);
                    return;
                case 5:
                    j(jVar, dVar);
                    return;
                case 6:
                    h(jVar, dVar);
                    return;
                case 7:
                    d(jVar, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10773a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10774b;

        public c(int i10, int i11) {
            this.f10773a = i10;
            this.f10774b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f10775a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10776b;

        /* renamed from: c  reason: collision with root package name */
        public final double f10777c;

        /* renamed from: d  reason: collision with root package name */
        public final double f10778d;

        /* renamed from: e  reason: collision with root package name */
        public final double f10779e;

        /* renamed from: f  reason: collision with root package name */
        public final double f10780f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10781g;

        /* renamed from: h  reason: collision with root package name */
        public final a f10782h;

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f10783i;

        /* loaded from: classes.dex */
        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i10, String str, double d10, double d11, double d12, double d13, int i11, a aVar, ByteBuffer byteBuffer) {
            this.f10775a = i10;
            this.f10776b = str;
            this.f10779e = d10;
            this.f10780f = d11;
            this.f10777c = d12;
            this.f10778d = d13;
            this.f10781g = i11;
            this.f10782h = aVar;
            this.f10783i = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f10788a;

        /* renamed from: b  reason: collision with root package name */
        public final double f10789b;

        /* renamed from: c  reason: collision with root package name */
        public final double f10790c;

        public e(int i10, double d10, double d11) {
            this.f10788a = i10;
            this.f10789b = d10;
            this.f10790c = d11;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f10791a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f10792b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f10793c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10794d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10795e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f10796f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f10797g;

        /* renamed from: h  reason: collision with root package name */
        public final int f10798h;

        /* renamed from: i  reason: collision with root package name */
        public final int f10799i;

        /* renamed from: j  reason: collision with root package name */
        public final float f10800j;

        /* renamed from: k  reason: collision with root package name */
        public final float f10801k;

        /* renamed from: l  reason: collision with root package name */
        public final int f10802l;

        /* renamed from: m  reason: collision with root package name */
        public final int f10803m;

        /* renamed from: n  reason: collision with root package name */
        public final int f10804n;

        /* renamed from: o  reason: collision with root package name */
        public final int f10805o;

        /* renamed from: p  reason: collision with root package name */
        public final long f10806p;

        public f(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f10791a = i10;
            this.f10792b = number;
            this.f10793c = number2;
            this.f10794d = i11;
            this.f10795e = i12;
            this.f10796f = obj;
            this.f10797g = obj2;
            this.f10798h = i13;
            this.f10799i = i14;
            this.f10800j = f10;
            this.f10801k = f11;
            this.f10802l = i15;
            this.f10803m = i16;
            this.f10804n = i17;
            this.f10805o = i18;
            this.f10806p = j10;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(boolean z10);

        void b(int i10, double d10, double d11);

        void c(int i10, int i11);

        void d(d dVar);

        void e(int i10);

        long f(d dVar);

        void g(int i10);

        void h(e eVar, b bVar);

        void i(f fVar);
    }

    public k(y7.a aVar) {
        a aVar2 = new a();
        this.f10771c = aVar2;
        l8.k kVar = new l8.k(aVar, "flutter/platform_views", s.f11226b);
        this.f10769a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return x7.b.d(exc);
    }

    public void d(int i10) {
        l8.k kVar = this.f10769a;
        if (kVar == null) {
            return;
        }
        kVar.c("viewFocused", Integer.valueOf(i10));
    }

    public void e(g gVar) {
        this.f10770b = gVar;
    }
}
