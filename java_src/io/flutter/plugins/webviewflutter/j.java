package io.flutter.plugins.webviewflutter;

import android.content.Context;
/* loaded from: classes.dex */
class j extends io.flutter.plugin.platform.g {

    /* renamed from: b  reason: collision with root package name */
    private final i2 f9130b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i2 i2Var) {
        super(l8.r.f11223a);
        this.f9130b = i2Var;
    }

    @Override // io.flutter.plugin.platform.g
    public io.flutter.plugin.platform.f a(Context context, int i10, Object obj) {
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) this.f9130b.h(((Integer) obj).intValue());
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
