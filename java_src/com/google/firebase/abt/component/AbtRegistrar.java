package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import c7.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k5.c;
import k5.e;
import k5.r;
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), eVar.f(i5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h(LIBRARY_NAME).b(r.j(Context.class)).b(r.i(i5.a.class)).f(h5.a.f8083a).d(), h.b(LIBRARY_NAME, "21.1.0"));
    }
}
