package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class b5 extends p4.e {

    /* renamed from: a  reason: collision with root package name */
    private final a9 f4418a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4419b;

    /* renamed from: c  reason: collision with root package name */
    private String f4420c;

    public b5(a9 a9Var, String str) {
        z3.o.i(a9Var);
        this.f4418a = a9Var;
        this.f4420c = null;
    }

    private final void e(v vVar, n9 n9Var) {
        this.f4418a.a();
        this.f4418a.j(vVar, n9Var);
    }

    private final void q0(n9 n9Var, boolean z10) {
        z3.o.i(n9Var);
        z3.o.e(n9Var.f4817n);
        r0(n9Var.f4817n, false);
        this.f4418a.h0().L(n9Var.f4818o, n9Var.D);
    }

    private final void r0(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f4418a.d().r().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f4419b == null) {
                    if (!"com.google.android.gms".equals(this.f4420c) && !d4.o.a(this.f4418a.c(), Binder.getCallingUid()) && !w3.j.a(this.f4418a.c()).c(Binder.getCallingUid())) {
                        z11 = false;
                        this.f4419b = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f4419b = Boolean.valueOf(z11);
                }
                if (this.f4419b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f4418a.d().r().b("Measurement Service called with invalid calling package. appId", f3.z(str));
                throw e10;
            }
        }
        if (this.f4420c == null && w3.i.i(this.f4418a.c(), Binder.getCallingUid(), str)) {
            this.f4420c = str;
        }
        if (str.equals(this.f4420c)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // p4.f
    public final byte[] B(v vVar, String str) {
        z3.o.e(str);
        z3.o.i(vVar);
        r0(str, true);
        this.f4418a.d().q().b("Log and bundle. event", this.f4418a.X().d(vVar.f5100n));
        long c10 = this.f4418a.e().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f4418a.b().t(new w4(this, vVar, str)).get();
            if (bArr == null) {
                this.f4418a.d().r().b("Log and bundle returned null. appId", f3.z(str));
                bArr = new byte[0];
            }
            this.f4418a.d().q().d("Log and bundle processed. event, size, time_ms", this.f4418a.X().d(vVar.f5100n), Integer.valueOf(bArr.length), Long.valueOf((this.f4418a.e().c() / 1000000) - c10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().d("Failed to log and bundle. appId, event, error", f3.z(str), this.f4418a.X().d(vVar.f5100n), e10);
            return null;
        }
    }

    @Override // p4.f
    public final void D(n9 n9Var) {
        z3.o.e(n9Var.f4817n);
        z3.o.i(n9Var.I);
        t4 t4Var = new t4(this, n9Var);
        z3.o.i(t4Var);
        if (this.f4418a.b().C()) {
            t4Var.run();
        } else {
            this.f4418a.b().A(t4Var);
        }
    }

    @Override // p4.f
    public final List G(String str, String str2, boolean z10, n9 n9Var) {
        q0(n9Var, false);
        String str3 = n9Var.f4817n;
        z3.o.i(str3);
        try {
            List<f9> list = (List) this.f4418a.b().s(new n4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f9 f9Var : list) {
                if (z10 || !i9.W(f9Var.f4540c)) {
                    arrayList.add(new d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().c("Failed to query user properties. appId", f3.z(n9Var.f4817n), e10);
            return Collections.emptyList();
        }
    }

    @Override // p4.f
    public final String H(n9 n9Var) {
        q0(n9Var, false);
        return this.f4418a.j0(n9Var);
    }

    @Override // p4.f
    public final List L(String str, String str2, String str3) {
        r0(str, true);
        try {
            return (List) this.f4418a.b().s(new q4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // p4.f
    public final void O(n9 n9Var) {
        z3.o.e(n9Var.f4817n);
        r0(n9Var.f4817n, false);
        p0(new r4(this, n9Var));
    }

    @Override // p4.f
    public final void U(d dVar, n9 n9Var) {
        z3.o.i(dVar);
        z3.o.i(dVar.f4447p);
        q0(n9Var, false);
        d dVar2 = new d(dVar);
        dVar2.f4445n = n9Var.f4817n;
        p0(new l4(this, dVar2, n9Var));
    }

    @Override // p4.f
    public final void d0(v vVar, n9 n9Var) {
        z3.o.i(vVar);
        q0(n9Var, false);
        p0(new u4(this, vVar, n9Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v f(v vVar, n9 n9Var) {
        t tVar;
        if ("_cmp".equals(vVar.f5100n) && (tVar = vVar.f5101o) != null && tVar.k() != 0) {
            String E = vVar.f5101o.E("_cis");
            if ("referrer broadcast".equals(E) || "referrer API".equals(E)) {
                this.f4418a.d().u().b("Event has been filtered ", vVar.toString());
                return new v("_cmpx", vVar.f5101o, vVar.f5102p, vVar.f5103q);
            }
        }
        return vVar;
    }

    @Override // p4.f
    public final void g0(n9 n9Var) {
        q0(n9Var, false);
        p0(new z4(this, n9Var));
    }

    @Override // p4.f
    public final List h0(String str, String str2, n9 n9Var) {
        q0(n9Var, false);
        String str3 = n9Var.f4817n;
        z3.o.i(str3);
        try {
            return (List) this.f4418a.b().s(new p4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // p4.f
    public final void m(long j10, String str, String str2, String str3) {
        p0(new a5(this, str2, str3, str, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n0(v vVar, n9 n9Var) {
        d3 v10;
        String str;
        String str2;
        if (!this.f4418a.a0().C(n9Var.f4817n)) {
            e(vVar, n9Var);
            return;
        }
        this.f4418a.d().v().b("EES config found for", n9Var.f4817n);
        d4 a02 = this.f4418a.a0();
        String str3 = n9Var.f4817n;
        com.google.android.gms.internal.measurement.c1 c1Var = TextUtils.isEmpty(str3) ? null : (com.google.android.gms.internal.measurement.c1) a02.f4469j.c(str3);
        if (c1Var != null) {
            try {
                Map I = this.f4418a.g0().I(vVar.f5101o.v(), true);
                String a10 = p4.q.a(vVar.f5100n);
                if (a10 == null) {
                    a10 = vVar.f5100n;
                }
                if (c1Var.e(new com.google.android.gms.internal.measurement.b(a10, vVar.f5103q, I))) {
                    if (c1Var.g()) {
                        this.f4418a.d().v().b("EES edited event", vVar.f5100n);
                        vVar = this.f4418a.g0().A(c1Var.a().b());
                    }
                    e(vVar, n9Var);
                    if (c1Var.f()) {
                        for (com.google.android.gms.internal.measurement.b bVar : c1Var.a().c()) {
                            this.f4418a.d().v().b("EES logging created event", bVar.d());
                            e(this.f4418a.g0().A(bVar), n9Var);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.c2 unused) {
                this.f4418a.d().r().c("EES error. appId, eventName", n9Var.f4818o, vVar.f5100n);
            }
            v10 = this.f4418a.d().v();
            str = vVar.f5100n;
            str2 = "EES was not applied to event";
        } else {
            v10 = this.f4418a.d().v();
            str = n9Var.f4817n;
            str2 = "EES not loaded for";
        }
        v10.b(str2, str);
        e(vVar, n9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void o0(String str, Bundle bundle) {
        l W = this.f4418a.W();
        W.h();
        W.i();
        byte[] i10 = W.f4898b.g0().B(new q(W.f4438a, "", str, "dep", 0L, 0L, bundle)).i();
        W.f4438a.d().v().c("Saving default event parameters, appId, data size", W.f4438a.D().d(str), Integer.valueOf(i10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i10);
        try {
            if (W.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                W.f4438a.d().r().b("Failed to insert default event parameters (got -1). appId", f3.z(str));
            }
        } catch (SQLiteException e10) {
            W.f4438a.d().r().c("Error storing default event parameters. appId", f3.z(str), e10);
        }
    }

    @Override // p4.f
    public final void p(v vVar, String str, String str2) {
        z3.o.i(vVar);
        z3.o.e(str);
        r0(str, true);
        p0(new v4(this, vVar, str));
    }

    final void p0(Runnable runnable) {
        z3.o.i(runnable);
        if (this.f4418a.b().C()) {
            runnable.run();
        } else {
            this.f4418a.b().z(runnable);
        }
    }

    @Override // p4.f
    public final void r(n9 n9Var) {
        q0(n9Var, false);
        p0(new s4(this, n9Var));
    }

    @Override // p4.f
    public final void s(d9 d9Var, n9 n9Var) {
        z3.o.i(d9Var);
        q0(n9Var, false);
        p0(new x4(this, d9Var, n9Var));
    }

    @Override // p4.f
    public final void v(final Bundle bundle, n9 n9Var) {
        q0(n9Var, false);
        final String str = n9Var.f4817n;
        z3.o.i(str);
        p0(new Runnable() { // from class: com.google.android.gms.measurement.internal.k4
            @Override // java.lang.Runnable
            public final void run() {
                b5.this.o0(str, bundle);
            }
        });
    }

    @Override // p4.f
    public final List x(String str, String str2, String str3, boolean z10) {
        r0(str, true);
        try {
            List<f9> list = (List) this.f4418a.b().s(new o4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f9 f9Var : list) {
                if (z10 || !i9.W(f9Var.f4540c)) {
                    arrayList.add(new d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().c("Failed to get user properties as. appId", f3.z(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // p4.f
    public final void y(d dVar) {
        z3.o.i(dVar);
        z3.o.i(dVar.f4447p);
        z3.o.e(dVar.f4445n);
        r0(dVar.f4445n, true);
        p0(new m4(this, new d(dVar)));
    }

    @Override // p4.f
    public final List z(n9 n9Var, boolean z10) {
        q0(n9Var, false);
        String str = n9Var.f4817n;
        z3.o.i(str);
        try {
            List<f9> list = (List) this.f4418a.b().s(new y4(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f9 f9Var : list) {
                if (z10 || !i9.W(f9Var.f4540c)) {
                    arrayList.add(new d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f4418a.d().r().c("Failed to get user properties. appId", f3.z(n9Var.f4817n), e10);
            return null;
        }
    }
}
