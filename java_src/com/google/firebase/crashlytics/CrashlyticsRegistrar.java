package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import k5.c;
import k5.e;
import k5.h;
import k5.r;
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public a b(e eVar) {
        return a.e((f5.e) eVar.a(f5.e.class), (j6.e) eVar.a(j6.e.class), eVar.i(n5.a.class), eVar.i(i5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h("fire-cls").b(r.j(f5.e.class)).b(r.j(j6.e.class)).b(r.a(n5.a.class)).b(r.a(i5.a.class)).f(new h() { // from class: m5.f
            @Override // k5.h
            public final Object a(k5.e eVar) {
                com.google.firebase.crashlytics.a b10;
                b10 = CrashlyticsRegistrar.this.b(eVar);
                return b10;
            }
        }).e().d(), c7.h.b("fire-cls", "18.3.5"));
    }
}
