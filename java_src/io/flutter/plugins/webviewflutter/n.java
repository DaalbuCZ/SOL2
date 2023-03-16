package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.n<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f9189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f9190b;

        a(Map map, a.e eVar) {
            this.f9189a = map;
            this.f9190b = eVar;
        }

        @Override // io.flutter.plugins.webviewflutter.k.n
        /* renamed from: b */
        public void a(Boolean bool) {
            this.f9189a.put("result", bool);
            this.f9190b.a(this.f9189a);
        }
    }

    public static l8.i<Object> c() {
        return k.c.f9136d;
    }

    public static /* synthetic */ void d(k.b bVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            bVar.a(new a(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void e(k.b bVar, Object obj, a.e eVar) {
        Map b10;
        ArrayList arrayList;
        String str;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            str = (String) arrayList.get(0);
        } catch (Error | RuntimeException e10) {
            b10 = k.b(e10);
            hashMap.put("error", b10);
        }
        if (str == null) {
            throw new NullPointerException("urlArg unexpectedly null.");
        }
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new NullPointerException("valueArg unexpectedly null.");
        }
        bVar.b(str, str2);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void f(l8.c cVar, final k.b bVar) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.clearCookies", c());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    n.d(k.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.setCookie", c());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    n.e(k.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
