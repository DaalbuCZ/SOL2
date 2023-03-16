package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8906b;

        a(Map map, a.e eVar) {
            this.f8905a = map;
            this.f8906b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8905a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8906b.a(this.f8905a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f8905a.put("result", null);
            this.f8906b.a(this.f8905a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8908b;

        b(Map map, a.e eVar) {
            this.f8907a = map;
            this.f8908b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8907a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8908b.a(this.f8907a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f8907a.put("result", null);
            this.f8908b.a(this.f8907a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8910b;

        c(Map map, a.e eVar) {
            this.f8909a = map;
            this.f8910b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8909a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8910b.a(this.f8909a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(Void r32) {
            this.f8909a.put("result", null);
            this.f8910b.a(this.f8909a);
        }
    }

    public static l8.i<Object> d() {
        return l.c.f8864d;
    }

    public static /* synthetic */ void e(l.b bVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            Boolean bool = (Boolean) arrayList.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            bVar.d(str, bool, new a(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void f(l.b bVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            Boolean bool = (Boolean) arrayList.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            bVar.e(str, bool, new b(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void g(l.b bVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            bVar.f(str, new c(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static void h(l8.c cVar, final l.b bVar) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", d());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.m
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.e(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", d());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.n
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.f(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        l8.a aVar3 = new l8.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", d());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.o
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    p.g(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
