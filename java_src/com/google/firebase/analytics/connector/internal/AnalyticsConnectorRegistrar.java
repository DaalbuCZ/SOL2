package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c7.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k5.r;
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<k5.c<?>> getComponents() {
        return Arrays.asList(k5.c.c(i5.a.class).b(r.j(f5.e.class)).b(r.j(Context.class)).b(r.j(f6.d.class)).f(a.f5252a).e().d(), h.b("fire-analytics", "21.2.0"));
    }
}
