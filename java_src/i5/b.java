package i5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.d3;
import com.google.firebase.analytics.connector.internal.f;
import f5.e;
import i5.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z3.o;
/* loaded from: classes.dex */
public class b implements i5.a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile i5.a f8343c;

    /* renamed from: a  reason: collision with root package name */
    final o4.a f8344a;

    /* renamed from: b  reason: collision with root package name */
    final Map f8345b;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0125a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8346a;

        a(String str) {
            this.f8346a = str;
        }
    }

    b(o4.a aVar) {
        o.i(aVar);
        this.f8344a = aVar;
        this.f8345b = new ConcurrentHashMap();
    }

    public static i5.a h(e eVar, Context context, f6.d dVar) {
        o.i(eVar);
        o.i(context);
        o.i(dVar);
        o.i(context.getApplicationContext());
        if (f8343c == null) {
            synchronized (b.class) {
                if (f8343c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.x()) {
                        dVar.c(f5.b.class, c.f8348n, d.f8349a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.w());
                    }
                    f8343c = new b(d3.y(context, null, null, null, bundle).v());
                }
            }
        }
        return f8343c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(f6.a aVar) {
        boolean z10 = ((f5.b) aVar.a()).f7236a;
        synchronized (b.class) {
            ((b) o.i(f8343c)).f8344a.i(z10);
        }
    }

    private final boolean j(String str) {
        return (str.isEmpty() || !this.f8345b.containsKey(str) || this.f8345b.get(str) == null) ? false : true;
    }

    @Override // i5.a
    public Map<String, Object> a(boolean z10) {
        return this.f8344a.d(null, null, z10);
    }

    @Override // i5.a
    public List<a.c> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f8344a.b(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(bundle));
        }
        return arrayList;
    }

    @Override // i5.a
    public void c(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.f(cVar)) {
            this.f8344a.g(com.google.firebase.analytics.connector.internal.b.a(cVar));
        }
    }

    @Override // i5.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.g(str2, bundle)) {
            this.f8344a.a(str, str2, bundle);
        }
    }

    @Override // i5.a
    public a.InterfaceC0125a d(String str, a.b bVar) {
        o.i(bVar);
        if (com.google.firebase.analytics.connector.internal.b.i(str) && !j(str)) {
            o4.a aVar = this.f8344a;
            Object dVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.d(aVar, bVar) : "clx".equals(str) ? new f(aVar, bVar) : null;
            if (dVar != null) {
                this.f8345b.put(str, dVar);
                return new a(str);
            }
            return null;
        }
        return null;
    }

    @Override // i5.a
    public void e(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.j(str, str2)) {
            this.f8344a.h(str, str2, obj);
        }
    }

    @Override // i5.a
    public void f(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.g(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle);
            this.f8344a.e(str, str2, bundle);
        }
    }

    @Override // i5.a
    public int g(String str) {
        return this.f8344a.c(str);
    }
}
