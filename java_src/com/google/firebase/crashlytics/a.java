package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import f5.e;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import n5.d;
import n5.f;
import q5.h;
import q5.m;
import q5.s;
import q5.u;
import q5.w;
import t4.i;
import t4.l;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final m f5321a;

    /* renamed from: com.google.firebase.crashlytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0079a implements t4.a<Void, Object> {
        C0079a() {
        }

        @Override // t4.a
        public Object a(i<Void> iVar) {
            if (iVar.p()) {
                return null;
            }
            f.f().e("Error fetching settings.", iVar.k());
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f5323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x5.f f5324c;

        b(boolean z10, m mVar, x5.f fVar) {
            this.f5322a = z10;
            this.f5323b = mVar;
            this.f5324c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (this.f5322a) {
                this.f5323b.j(this.f5324c);
                return null;
            }
            return null;
        }
    }

    private a(m mVar) {
        this.f5321a = mVar;
    }

    public static a d() {
        a aVar = (a) e.n().j(a.class);
        Objects.requireNonNull(aVar, "FirebaseCrashlytics component is not present.");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(e eVar, j6.e eVar2, i6.a<n5.a> aVar, i6.a<i5.a> aVar2) {
        Context l10 = eVar.l();
        String packageName = l10.getPackageName();
        f f10 = f.f();
        f10.g("Initializing Firebase Crashlytics " + m.l() + " for " + packageName);
        v5.f fVar = new v5.f(l10);
        s sVar = new s(eVar);
        w wVar = new w(l10, packageName, eVar2, sVar);
        d dVar = new d(aVar);
        m5.d dVar2 = new m5.d(aVar2);
        m mVar = new m(eVar, wVar, dVar, sVar, dVar2.e(), dVar2.d(), fVar, u.c("Crashlytics Exception Handler"));
        String c10 = eVar.q().c();
        String o10 = h.o(l10);
        List<q5.e> l11 = h.l(l10);
        f f11 = f.f();
        f11.b("Mapping file ID is: " + o10);
        for (q5.e eVar3 : l11) {
            f.f().b(String.format("Build id for %s on %s: %s", eVar3.c(), eVar3.a(), eVar3.b()));
        }
        try {
            q5.a a10 = q5.a.a(l10, wVar, c10, o10, l11, new n5.e(l10));
            f f12 = f.f();
            f12.i("Installer package name is: " + a10.f12719d);
            ExecutorService c11 = u.c("com.google.firebase.crashlytics.startup");
            x5.f l12 = x5.f.l(l10, c10, wVar, new u5.b(), a10.f12721f, a10.f12722g, fVar, sVar);
            l12.o(c11).h(c11, new C0079a());
            l.c(c11, new b(mVar.s(a10, l12), mVar, l12));
            return new a(mVar);
        } catch (PackageManager.NameNotFoundException e10) {
            f.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public i<Boolean> a() {
        return this.f5321a.e();
    }

    public void b() {
        this.f5321a.f();
    }

    public boolean c() {
        return this.f5321a.g();
    }

    public void f(String str) {
        this.f5321a.n(str);
    }

    public void g(Throwable th) {
        if (th == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f5321a.o(th);
        }
    }

    public void h() {
        this.f5321a.t();
    }

    public void i(Boolean bool) {
        this.f5321a.u(bool);
    }

    public void j(boolean z10) {
        this.f5321a.u(Boolean.valueOf(z10));
    }

    public void k(String str, String str2) {
        this.f5321a.v(str, str2);
    }

    public void l(String str) {
        this.f5321a.x(str);
    }
}
