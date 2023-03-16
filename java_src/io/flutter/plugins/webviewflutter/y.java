package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class y {
    public static l8.i<Object> b() {
        return k.m.f9148d;
    }

    public static /* synthetic */ void c(k.l lVar, Object obj, a.e eVar) {
        Map b10;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        String str = (String) arrayList.get(1);
        if (str == null) {
            throw new NullPointerException("channelNameArg unexpectedly null.");
        }
        lVar.a(Long.valueOf(number.longValue()), str);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(l8.c cVar, final k.l lVar) {
        new l8.a(cVar, "dev.flutter.pigeon.JavaScriptChannelHostApi.create", b()).e(lVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.x
            @Override // l8.a.d
            public final void a(Object obj, a.e eVar) {
                y.c(k.l.this, obj, eVar);
            }
        } : null);
    }
}
