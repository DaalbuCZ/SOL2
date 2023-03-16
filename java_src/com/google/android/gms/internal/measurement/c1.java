package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    final y3 f3762a;

    /* renamed from: b  reason: collision with root package name */
    z4 f3763b;

    /* renamed from: c  reason: collision with root package name */
    final c f3764c;

    /* renamed from: d  reason: collision with root package name */
    private final hf f3765d;

    public c1() {
        y3 y3Var = new y3();
        this.f3762a = y3Var;
        this.f3763b = y3Var.f4305b.a();
        this.f3764c = new c();
        this.f3765d = new hf();
        y3Var.f4307d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c1.this.b();
            }
        });
        y3Var.f4307d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new d9(c1.this.f3764c);
            }
        });
    }

    public final c a() {
        return this.f3764c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ j b() {
        return new df(this.f3765d);
    }

    public final void c(t5 t5Var) {
        j jVar;
        try {
            this.f3763b = this.f3762a.f4305b.a();
            if (this.f3762a.a(this.f3763b, (y5[]) t5Var.G().toArray(new y5[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (r5 r5Var : t5Var.E().H()) {
                List G = r5Var.G();
                String F = r5Var.F();
                Iterator it = G.iterator();
                while (it.hasNext()) {
                    q a10 = this.f3762a.a(this.f3763b, (y5) it.next());
                    if (!(a10 instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    z4 z4Var = this.f3763b;
                    if (z4Var.h(F)) {
                        q d10 = z4Var.d(F);
                        if (!(d10 instanceof j)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(F)));
                        }
                        jVar = (j) d10;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(F)));
                    }
                    jVar.a(this.f3763b, Collections.singletonList(a10));
                }
            }
        } catch (Throwable th) {
            throw new c2(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.f3762a.f4307d.a(str, callable);
    }

    public final boolean e(b bVar) {
        try {
            this.f3764c.d(bVar);
            this.f3762a.f4306c.g("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f3765d.b(this.f3763b.a(), this.f3764c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new c2(th);
        }
    }

    public final boolean f() {
        return !this.f3764c.c().isEmpty();
    }

    public final boolean g() {
        c cVar = this.f3764c;
        return !cVar.b().equals(cVar.a());
    }
}
