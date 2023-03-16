package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static l8.i<Object> c() {
        return k.i.f9145d;
    }

    public static /* synthetic */ void d(k.h hVar, Object obj, a.e eVar) {
        Map b10;
        String str;
        HashMap hashMap = new HashMap();
        try {
            str = (String) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (str == null) {
            throw new NullPointerException("pathArg unexpectedly null.");
        }
        hashMap.put("result", hVar.b(str));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(k.h hVar, Object obj, a.e eVar) {
        Map b10;
        String str;
        HashMap hashMap = new HashMap();
        try {
            str = (String) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (str == null) {
            throw new NullPointerException("nameArg unexpectedly null.");
        }
        hashMap.put("result", hVar.a(str));
        eVar.a(hashMap);
    }

    public static void f(l8.c cVar, final k.h hVar) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.FlutterAssetManagerHostApi.list", c());
        if (hVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.t
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    u.d(k.h.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.FlutterAssetManagerHostApi.getAssetFilePathByName", c());
        if (hVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    u.e(k.h.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
