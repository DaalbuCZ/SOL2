package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class v7 extends w3 {

    /* renamed from: c  reason: collision with root package name */
    private final u7 f5125c;

    /* renamed from: d  reason: collision with root package name */
    private p4.f f5126d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f5127e;

    /* renamed from: f  reason: collision with root package name */
    private final o f5128f;

    /* renamed from: g  reason: collision with root package name */
    private final m8 f5129g;

    /* renamed from: h  reason: collision with root package name */
    private final List f5130h;

    /* renamed from: i  reason: collision with root package name */
    private final o f5131i;

    /* JADX INFO: Access modifiers changed from: protected */
    public v7(j4 j4Var) {
        super(j4Var);
        this.f5130h = new ArrayList();
        this.f5129g = new m8(j4Var.e());
        this.f5125c = new u7(this);
        this.f5128f = new e7(this, j4Var);
        this.f5131i = new g7(this, j4Var);
    }

    private final n9 C(boolean z10) {
        Pair a10;
        this.f4438a.f();
        w2 B = this.f4438a.B();
        String str = null;
        if (z10) {
            f3 d10 = this.f4438a.d();
            if (d10.f4438a.F().f4971d != null && (a10 = d10.f4438a.F().f4971d.a()) != null && a10 != s3.f4969y) {
                str = String.valueOf(a10.second) + ":" + ((String) a10.first);
            }
        }
        return B.q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        h();
        this.f4438a.d().v().b("Processing queued up service tasks", Integer.valueOf(this.f5130h.size()));
        for (Runnable runnable : this.f5130h) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                this.f4438a.d().r().b("Task exception while flushing queue", e10);
            }
        }
        this.f5130h.clear();
        this.f5131i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        h();
        this.f5129g.b();
        o oVar = this.f5128f;
        this.f4438a.z();
        oVar.d(((Long) u2.K.a(null)).longValue());
    }

    private final void F(Runnable runnable) {
        h();
        if (z()) {
            runnable.run();
            return;
        }
        int size = this.f5130h.size();
        this.f4438a.z();
        if (size >= 1000) {
            this.f4438a.d().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f5130h.add(runnable);
        this.f5131i.d(60000L);
        P();
    }

    private final boolean G() {
        this.f4438a.f();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void M(v7 v7Var, ComponentName componentName) {
        v7Var.h();
        if (v7Var.f5126d != null) {
            v7Var.f5126d = null;
            v7Var.f4438a.d().v().b("Disconnected from device MeasurementService", componentName);
            v7Var.h();
            v7Var.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        h();
        i();
        return !B() || this.f4438a.N().o0() >= ((Integer) u2.f5052h0.a(null)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v7.B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean J() {
        return this.f5127e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O() {
        h();
        i();
        n9 C = C(true);
        this.f4438a.C().r();
        F(new b7(this, C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P() {
        h();
        i();
        if (z()) {
            return;
        }
        if (B()) {
            this.f5125c.d();
        } else if (this.f4438a.z().G()) {
        } else {
            this.f4438a.f();
            List<ResolveInfo> queryIntentServices = this.f4438a.c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f4438a.c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                this.f4438a.d().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context c10 = this.f4438a.c();
            this.f4438a.f();
            intent.setComponent(new ComponentName(c10, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f5125c.c(intent);
        }
    }

    public final void Q() {
        h();
        i();
        this.f5125c.g();
        try {
            c4.a.b().c(this.f4438a.c(), this.f5125c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5126d = null;
    }

    public final void R(com.google.android.gms.internal.measurement.i1 i1Var) {
        h();
        i();
        F(new a7(this, C(false), i1Var));
    }

    public final void S(AtomicReference atomicReference) {
        h();
        i();
        F(new z6(this, atomicReference, C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        h();
        i();
        F(new n7(this, str, str2, C(false), i1Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        i();
        F(new m7(this, atomicReference, null, str2, str3, C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z10) {
        h();
        i();
        F(new w6(this, str, str2, C(false), z10, i1Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        i();
        F(new o7(this, atomicReference, null, str2, str3, C(false), z10));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(v vVar, String str) {
        z3.o.i(vVar);
        h();
        i();
        G();
        F(new k7(this, true, C(true), this.f4438a.C().v(vVar), vVar, str));
    }

    public final void p(com.google.android.gms.internal.measurement.i1 i1Var, v vVar, String str) {
        h();
        i();
        if (this.f4438a.N().p0(w3.i.f16085a) == 0) {
            F(new f7(this, vVar, str, i1Var));
            return;
        }
        this.f4438a.d().w().a("Not bundling data. Service unavailable or out of date");
        this.f4438a.N().G(i1Var, new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        h();
        i();
        n9 C = C(false);
        G();
        this.f4438a.C().q();
        F(new y6(this, C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(p4.f fVar, a4.a aVar, n9 n9Var) {
        int i10;
        d3 r10;
        String str;
        h();
        i();
        G();
        this.f4438a.z();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List p10 = this.f4438a.C().p(100);
            if (p10 != null) {
                arrayList.addAll(p10);
                i10 = p10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                a4.a aVar2 = (a4.a) arrayList.get(i13);
                if (aVar2 instanceof v) {
                    try {
                        fVar.d0((v) aVar2, n9Var);
                    } catch (RemoteException e10) {
                        e = e10;
                        r10 = this.f4438a.d().r();
                        str = "Failed to send event to the service";
                        r10.b(str, e);
                    }
                } else if (aVar2 instanceof d9) {
                    try {
                        fVar.s((d9) aVar2, n9Var);
                    } catch (RemoteException e11) {
                        e = e11;
                        r10 = this.f4438a.d().r();
                        str = "Failed to send user property to the service";
                        r10.b(str, e);
                    }
                } else if (aVar2 instanceof d) {
                    try {
                        fVar.U((d) aVar2, n9Var);
                    } catch (RemoteException e12) {
                        e = e12;
                        r10 = this.f4438a.d().r();
                        str = "Failed to send conditional user property to the service";
                        r10.b(str, e);
                    }
                } else {
                    this.f4438a.d().r().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(d dVar) {
        z3.o.i(dVar);
        h();
        i();
        this.f4438a.f();
        F(new l7(this, true, C(true), this.f4438a.C().u(dVar), new d(dVar), dVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(boolean z10) {
        h();
        i();
        if (z10) {
            G();
            this.f4438a.C().q();
        }
        if (A()) {
            F(new j7(this, C(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(o6 o6Var) {
        h();
        i();
        F(new c7(this, o6Var));
    }

    public final void v(Bundle bundle) {
        h();
        i();
        F(new d7(this, C(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        h();
        i();
        F(new h7(this, C(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(p4.f fVar) {
        h();
        z3.o.i(fVar);
        this.f5126d = fVar;
        E();
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(d9 d9Var) {
        h();
        i();
        G();
        F(new x6(this, C(true), this.f4438a.C().w(d9Var), d9Var));
    }

    public final boolean z() {
        h();
        i();
        return this.f5126d != null;
    }
}
