package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class n2 extends k.j {

    /* renamed from: b  reason: collision with root package name */
    private final i2 f9193b;

    public n2(l8.c cVar, i2 i2Var) {
        super(cVar);
        this.f9193b = i2Var;
    }

    private long i(m2 m2Var) {
        Long g10 = this.f9193b.g(m2Var);
        if (g10 != null) {
            return g10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    public void h(m2 m2Var, k.j.a<Void> aVar) {
        if (this.f9193b.f(m2Var)) {
            c(Long.valueOf(i(m2Var)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(m2 m2Var, String str, k.j.a<Void> aVar) {
        super.g(Long.valueOf(i(m2Var)), str, aVar);
    }
}
