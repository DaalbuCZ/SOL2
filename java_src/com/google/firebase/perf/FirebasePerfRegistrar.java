package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import e1.g;
import f5.m;
import j5.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k5.e;
import k5.f0;
import k5.h;
import k5.r;
import r6.b;
import s6.a;
@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(f0 f0Var, e eVar) {
        return new b((f5.e) eVar.a(f5.e.class), (m) eVar.f(m.class).get(), (Executor) eVar.h(f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r6.e providesFirebasePerformance(e eVar) {
        eVar.a(b.class);
        return a.b().b(new t6.a((f5.e) eVar.a(f5.e.class), (j6.e) eVar.a(j6.e.class), eVar.f(c.class), eVar.f(g.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<k5.c<?>> getComponents() {
        final f0 a10 = f0.a(d.class, Executor.class);
        return Arrays.asList(k5.c.c(r6.e.class).h(LIBRARY_NAME).b(r.j(f5.e.class)).b(r.l(c.class)).b(r.j(j6.e.class)).b(r.l(g.class)).b(r.j(b.class)).f(r6.d.f13070a).d(), k5.c.c(b.class).h(EARLY_LIBRARY_NAME).b(r.j(f5.e.class)).b(r.i(m.class)).b(r.k(a10)).e().f(new h() { // from class: r6.c
            @Override // k5.h
            public final Object a(k5.e eVar) {
                b lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(f0.this, eVar);
                return lambda$getComponents$0;
            }
        }).d(), c7.h.b(LIBRARY_NAME, "20.3.1"));
    }
}
