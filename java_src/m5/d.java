package m5;

import android.os.Bundle;
import i5.a;
import i6.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final i6.a<i5.a> f11401a;

    /* renamed from: b  reason: collision with root package name */
    private volatile o5.a f11402b;

    /* renamed from: c  reason: collision with root package name */
    private volatile p5.b f11403c;

    /* renamed from: d  reason: collision with root package name */
    private final List<p5.a> f11404d;

    public d(i6.a<i5.a> aVar) {
        this(aVar, new p5.c(), new o5.f());
    }

    public d(i6.a<i5.a> aVar, p5.b bVar, o5.a aVar2) {
        this.f11401a = aVar;
        this.f11403c = bVar;
        this.f11404d = new ArrayList();
        this.f11402b = aVar2;
        f();
    }

    private void f() {
        this.f11401a.a(new a.InterfaceC0126a() { // from class: m5.a
            @Override // i6.a.InterfaceC0126a
            public final void a(i6.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f11402b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(p5.a aVar) {
        synchronized (this) {
            if (this.f11403c instanceof p5.c) {
                this.f11404d.add(aVar);
            }
            this.f11403c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(i6.b bVar) {
        n5.f.f().b("AnalyticsConnector now available.");
        i5.a aVar = (i5.a) bVar.get();
        o5.e eVar = new o5.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            n5.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        n5.f.f().b("Registered Firebase Analytics listener.");
        o5.d dVar = new o5.d();
        o5.c cVar = new o5.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            for (p5.a aVar2 : this.f11404d) {
                dVar.a(aVar2);
            }
            eVar2.d(dVar);
            eVar2.e(cVar);
            this.f11403c = dVar;
            this.f11402b = cVar;
        }
    }

    private static a.InterfaceC0125a j(i5.a aVar, e eVar) {
        a.InterfaceC0125a d10 = aVar.d("clx", eVar);
        if (d10 == null) {
            n5.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            d10 = aVar.d("crash", eVar);
            if (d10 != null) {
                n5.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return d10;
    }

    public o5.a d() {
        return new o5.a() { // from class: m5.b
            @Override // o5.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public p5.b e() {
        return new p5.b() { // from class: m5.c
            @Override // p5.b
            public final void a(p5.a aVar) {
                d.this.h(aVar);
            }
        };
    }
}
