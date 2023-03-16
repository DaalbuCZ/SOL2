package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static l8.i<Object> b() {
        return k.g.f9144d;
    }

    public static /* synthetic */ void c(k.f fVar, Object obj, a.e eVar) {
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
        fVar.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(l8.c cVar, final k.f fVar) {
        new l8.a(cVar, "dev.flutter.pigeon.DownloadListenerHostApi.create", b()).e(fVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.q
            @Override // l8.a.d
            public final void a(Object obj, a.e eVar) {
                r.c(k.f.this, obj, eVar);
            }
        } : null);
    }
}
