package s8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
import s8.h;
/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static l8.i<Object> g() {
        return h.b.f14396d;
    }

    public static /* synthetic */ void h(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.a());
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void i(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.d());
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void j(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.b());
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void k(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.f());
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void l(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.c());
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void m(h.a aVar, Object obj, a.e eVar) {
        Map b10;
        h.c cVar;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            cVar = arrayList.get(0) == null ? null : h.c.values()[((Integer) arrayList.get(0)).intValue()];
        } catch (Error | RuntimeException e10) {
            b10 = h.b(e10);
            hashMap.put("error", b10);
        }
        if (cVar == null) {
            throw new NullPointerException("directoryArg unexpectedly null.");
        }
        hashMap.put("result", aVar.e(cVar));
        eVar.a(hashMap);
    }

    public static void n(l8.c cVar, final h.a aVar) {
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", g(), cVar.b());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: s8.c
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.h(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        l8.a aVar3 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", g(), cVar.b());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: s8.f
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.i(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        l8.a aVar4 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", g(), cVar.b());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: s8.d
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.j(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        l8.a aVar5 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", g(), cVar.b());
        if (aVar != null) {
            aVar5.e(new a.d() { // from class: s8.a
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.k(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        l8.a aVar6 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", g(), cVar.b());
        if (aVar != null) {
            aVar6.e(new a.d() { // from class: s8.e
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.l(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        l8.a aVar7 = new l8.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", g(), cVar.b());
        if (aVar != null) {
            aVar7.e(new a.d() { // from class: s8.b
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    g.m(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
    }
}
