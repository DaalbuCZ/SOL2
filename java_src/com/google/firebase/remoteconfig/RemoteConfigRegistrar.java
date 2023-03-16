package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k5.e;
import k5.f0;
import k5.h;
import k5.r;
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(f0 f0Var, e eVar) {
        return new c((Context) eVar.a(Context.class), (Executor) eVar.h(f0Var), (f5.e) eVar.a(f5.e.class), (j6.e) eVar.a(j6.e.class), ((com.google.firebase.abt.component.a) eVar.a(com.google.firebase.abt.component.a.class)).b("frc"), eVar.f(i5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k5.c<?>> getComponents() {
        final f0 a10 = f0.a(j5.b.class, Executor.class);
        return Arrays.asList(k5.c.c(c.class).h(LIBRARY_NAME).b(r.j(Context.class)).b(r.k(a10)).b(r.j(f5.e.class)).b(r.j(j6.e.class)).b(r.j(com.google.firebase.abt.component.a.class)).b(r.i(i5.a.class)).f(new h() { // from class: d7.n
            @Override // k5.h
            public final Object a(k5.e eVar) {
                com.google.firebase.remoteconfig.c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(f0.this, eVar);
                return lambda$getComponents$0;
            }
        }).e().d(), c7.h.b(LIBRARY_NAME, "21.2.1"));
    }
}
