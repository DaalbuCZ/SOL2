package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static l8.i<Object> b() {
        return k.r.f9151d;
    }

    public static /* synthetic */ void c(k.q qVar, Object obj, a.e eVar) {
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
        Number number2 = (Number) arrayList.get(1);
        if (number2 == null) {
            throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
        }
        qVar.b(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(l8.c cVar, final k.q qVar) {
        new l8.a(cVar, "dev.flutter.pigeon.WebChromeClientHostApi.create", b()).e(qVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.b0
            @Override // l8.a.d
            public final void a(Object obj, a.e eVar) {
                c0.c(k.q.this, obj, eVar);
            }
        } : null);
    }
}
