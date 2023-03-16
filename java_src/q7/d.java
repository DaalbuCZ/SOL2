package q7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
import l8.i;
import q7.a;
/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static i<Object> c() {
        return a.d.f12903d;
    }

    public static /* synthetic */ void d(a.c cVar, Object obj, a.e eVar) {
        Map b10;
        a.b bVar;
        HashMap hashMap = new HashMap();
        try {
            bVar = (a.b) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e10) {
            b10 = a.b(e10);
            hashMap.put("error", b10);
        }
        if (bVar == null) {
            throw new NullPointerException("msgArg unexpectedly null.");
        }
        cVar.a(bVar);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(a.c cVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", cVar.isEnabled());
        } catch (Error | RuntimeException e10) {
            b10 = a.b(e10);
            hashMap.put("error", b10);
        }
        eVar.a(hashMap);
    }

    public static void f(l8.c cVar, final a.c cVar2) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.WakelockApi.toggle", c());
        if (cVar2 != null) {
            aVar.e(new a.d() { // from class: q7.c
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    d.d(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.WakelockApi.isEnabled", c());
        if (cVar2 != null) {
            aVar2.e(new a.d() { // from class: q7.b
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    d.e(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
