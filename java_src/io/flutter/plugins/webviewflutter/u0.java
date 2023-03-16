package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class u0 {
    public static l8.i<Object> c() {
        return k.x.f9169d;
    }

    public static /* synthetic */ void d(k.w wVar, Object obj, a.e eVar) {
        Map b10;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            number = (Number) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        wVar.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(k.w wVar, Object obj, a.e eVar) {
        Map b10;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            number = (Number) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        wVar.b(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void f(l8.c cVar, final k.w wVar) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.WebStorageHostApi.create", c());
        if (wVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.t0
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    u0.d(k.w.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.WebStorageHostApi.deleteAllData", c());
        if (wVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s0
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    u0.e(k.w.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
