package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k5.f0;
import k5.r;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j6.e lambda$getComponents$0(k5.e eVar) {
        return new c((f5.e) eVar.a(f5.e.class), eVar.f(g6.i.class), (ExecutorService) eVar.h(f0.a(j5.a.class, ExecutorService.class)), l5.i.b((Executor) eVar.h(f0.a(j5.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k5.c<?>> getComponents() {
        return Arrays.asList(k5.c.c(j6.e.class).h(LIBRARY_NAME).b(r.j(f5.e.class)).b(r.i(g6.i.class)).b(r.k(f0.a(j5.a.class, ExecutorService.class))).b(r.k(f0.a(j5.b.class, Executor.class))).f(j6.f.f10397a).d(), g6.h.a(), c7.h.b(LIBRARY_NAME, "17.1.2"));
    }
}
