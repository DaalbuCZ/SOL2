package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l.h<l.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8915b;

        a(Map map, a.e eVar) {
            this.f8914a = map;
            this.f8915b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8914a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8915b.a(this.f8914a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(l.g gVar) {
            this.f8914a.put("result", gVar);
            this.f8915b.a(this.f8914a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements l.h<List<l.g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8917b;

        b(Map map, a.e eVar) {
            this.f8916a = map;
            this.f8917b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8916a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8917b.a(this.f8916a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(List<l.g> list) {
            this.f8916a.put("result", list);
            this.f8917b.a(this.f8916a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements l.h<l.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f8919b;

        c(Map map, a.e eVar) {
            this.f8918a = map;
            this.f8919b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b10;
            Map map = this.f8918a;
            b10 = l.b(th);
            map.put("error", b10);
            this.f8919b.a(this.f8918a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c */
        public void a(l.f fVar) {
            this.f8918a.put("result", fVar);
            this.f8919b.a(this.f8918a);
        }
    }

    public static l8.i<Object> d() {
        return l.e.f8865d;
    }

    public static /* synthetic */ void e(l.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            l.f fVar = (l.f) arrayList.get(1);
            if (fVar == null) {
                throw new NullPointerException("initializeAppRequestArg unexpectedly null.");
            }
            dVar.a(str, fVar, new a(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void f(l.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            dVar.b(new b(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void g(l.d dVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            dVar.c(new c(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = l.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static void h(l8.c cVar, final l.d dVar) {
        l8.a aVar = new l8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", d());
        if (dVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.s
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.e(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        l8.a aVar2 = new l8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", d());
        if (dVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.q
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.f(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        l8.a aVar3 = new l8.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", d());
        if (dVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.r
                @Override // l8.a.d
                public final void a(Object obj, a.e eVar) {
                    t.g(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
