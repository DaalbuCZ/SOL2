package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(k5.e eVar) {
        return new FirebaseMessaging((f5.e) eVar.a(f5.e.class), (h6.a) eVar.a(h6.a.class), eVar.f(c7.i.class), eVar.f(g6.j.class), (j6.e) eVar.a(j6.e.class), (e1.g) eVar.a(e1.g.class), (f6.d) eVar.a(f6.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<k5.c<?>> getComponents() {
        return Arrays.asList(k5.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(k5.r.j(f5.e.class)).b(k5.r.h(h6.a.class)).b(k5.r.i(c7.i.class)).b(k5.r.i(g6.j.class)).b(k5.r.h(e1.g.class)).b(k5.r.j(j6.e.class)).b(k5.r.j(f6.d.class)).f(b0.f5487a).c().d(), c7.h.b(LIBRARY_NAME, "23.1.1"));
    }
}
