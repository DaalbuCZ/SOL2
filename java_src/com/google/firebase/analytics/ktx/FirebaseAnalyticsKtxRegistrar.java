package com.google.firebase.analytics.ktx;

import c7.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import k5.c;
import z8.i;
/* loaded from: classes.dex */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<c<?>> getComponents() {
        List<c<?>> b10;
        b10 = i.b(h.b("fire-analytics-ktx", "21.2.0"));
        return b10;
    }
}
