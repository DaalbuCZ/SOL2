package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c7.h;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import e1.g;
import g1.u;
import java.util.Arrays;
import java.util.List;
import k5.c;
import k5.e;
import k5.r;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        u.f((Context) eVar.a(Context.class));
        return u.c().g(a.f3338h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(g.class).h(LIBRARY_NAME).b(r.j(Context.class)).f(z5.a.f17458a).d(), h.b(LIBRARY_NAME, "18.1.7"));
    }
}
